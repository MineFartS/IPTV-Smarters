package com.amazonaws.auth;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {
    private static final int BIT_MASK = 255;
    private static final String CHUNK_SIGNATURE_HEADER = ";chunk-signature=";
    private static final String CHUNK_STRING_TO_SIGN_PREFIX = "AWS4-HMAC-SHA256-PAYLOAD";
    private static final String CLRF = "\r\n";
    private static final int DEFAULT_BUFFER_SIZE = 262144;
    private static final int DEFAULT_CHUNK_SIZE = 131072;
    public static final String DEFAULT_ENCODING = "UTF-8";
    private static final int SIGNATURE_LENGTH = 64;
    private final AWS4Signer aws4Signer;
    private ChunkContentIterator currentChunkIterator;
    private final String dateTime;
    private DecodedStreamBuffer decodedStreamBuffer;
    private final String headerSignature;
    private InputStream is;
    private boolean isAtStart;
    private boolean isTerminating;
    private final byte[] kSigning;
    private final String keyPath;
    private final int maxBufferSize;
    private String priorChunkSignature;
    private static final byte[] FINAL_CHUNK = new byte[0];
    private static final Log log = LogFactory.getLog((Class<?>) AwsChunkedEncodingInputStream.class);

    public AwsChunkedEncodingInputStream(InputStream inputStream, int i2, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this.is = null;
        this.isAtStart = true;
        this.isTerminating = false;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            i2 = Math.max(awsChunkedEncodingInputStream.maxBufferSize, i2);
            this.is = awsChunkedEncodingInputStream.is;
            this.decodedStreamBuffer = awsChunkedEncodingInputStream.decodedStreamBuffer;
        } else {
            this.is = inputStream;
            this.decodedStreamBuffer = null;
        }
        if (i2 < DEFAULT_CHUNK_SIZE) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.maxBufferSize = i2;
        this.kSigning = bArr;
        this.dateTime = str;
        this.keyPath = str2;
        this.headerSignature = str3;
        this.priorChunkSignature = str3;
        this.aws4Signer = aWS4Signer;
    }

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this(inputStream, DEFAULT_BUFFER_SIZE, bArr, str, str2, str3, aWS4Signer);
    }

    private static long calculateSignedChunkLength(long j2) {
        return ((long) (Long.toHexString(j2).length() + 17 + 64 + 2)) + j2 + ((long) 2);
    }

    public static long calculateStreamContentLength(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j3 = j2 / 131072;
        long j4 = j2 % 131072;
        return (j3 * calculateSignedChunkLength(131072L)) + (j4 > 0 ? calculateSignedChunkLength(j4) : 0L) + calculateSignedChunkLength(0L);
    }

    private byte[] createSignedChunk(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        String hex = BinaryUtils.toHex(this.aws4Signer.sign("AWS4-HMAC-SHA256-PAYLOAD\n" + this.dateTime + "\n" + this.keyPath + "\n" + this.priorChunkSignature + "\n" + BinaryUtils.toHex(this.aws4Signer.hash(BuildConfig.FLAVOR)) + "\n" + BinaryUtils.toHex(this.aws4Signer.hash(bArr)), this.kSigning, SigningAlgorithm.HmacSHA256));
        this.priorChunkSignature = hex;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CHUNK_SIGNATURE_HEADER);
        sb2.append(hex);
        sb.append(sb2.toString());
        sb.append(CLRF);
        try {
            String string = sb.toString();
            Charset charset = StringUtils.UTF8;
            byte[] bytes = string.getBytes(charset);
            byte[] bytes2 = CLRF.getBytes(charset);
            byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e2) {
            throw new AmazonClientException("Unable to sign the chunked data. " + e2.getMessage(), e2);
        }
    }

    private boolean setUpNextChunk() throws IOException {
        byte[] bArr = new byte[DEFAULT_CHUNK_SIZE];
        int i2 = 0;
        while (i2 < DEFAULT_CHUNK_SIZE) {
            DecodedStreamBuffer decodedStreamBuffer = this.decodedStreamBuffer;
            if (decodedStreamBuffer == null || !decodedStreamBuffer.hasNext()) {
                int i3 = this.is.read(bArr, i2, DEFAULT_CHUNK_SIZE - i2);
                if (i3 == -1) {
                    break;
                }
                DecodedStreamBuffer decodedStreamBuffer2 = this.decodedStreamBuffer;
                if (decodedStreamBuffer2 != null) {
                    decodedStreamBuffer2.buffer(bArr, i2, i3);
                }
                i2 += i3;
            } else {
                bArr[i2] = this.decodedStreamBuffer.next();
                i2++;
            }
        }
        if (i2 == 0) {
            this.currentChunkIterator = new ChunkContentIterator(createSignedChunk(FINAL_CHUNK));
            return true;
        }
        if (i2 < DEFAULT_CHUNK_SIZE) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            bArr = bArr2;
        }
        this.currentChunkIterator = new ChunkContentIterator(createSignedChunk(bArr));
        return false;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public InputStream getWrappedInputStream() {
        return this.is;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i2) {
        abortIfNeeded();
        if (!this.isAtStart) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.is.markSupported()) {
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.is.mark(Integer.MAX_VALUE);
        } else {
            Log log3 = log;
            if (log3.isDebugEnabled()) {
                log3.debug("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.decodedStreamBuffer = new DecodedStreamBuffer(this.maxBufferSize);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        int i2 = read(bArr, 0, 1);
        if (i2 == -1) {
            return i2;
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        abortIfNeeded();
        bArr.getClass();
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.currentChunkIterator;
        if (chunkContentIterator == null || !chunkContentIterator.hasNext()) {
            if (this.isTerminating) {
                return -1;
            }
            this.isTerminating = setUpNextChunk();
        }
        int i4 = this.currentChunkIterator.read(bArr, i2, i3);
        if (i4 > 0) {
            this.isAtStart = false;
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug(i4 + " byte read from the stream.");
            }
        }
        return i4;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        abortIfNeeded();
        this.currentChunkIterator = null;
        this.priorChunkSignature = this.headerSignature;
        if (this.is.markSupported()) {
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.is.reset();
        } else {
            Log log3 = log;
            if (log3.isDebugEnabled()) {
                log3.debug("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.decodedStreamBuffer;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            decodedStreamBuffer.startReadBuffer();
        }
        this.currentChunkIterator = null;
        this.isAtStart = true;
        this.isTerminating = false;
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        int i2;
        if (j2 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(PlaybackStateCompat.ACTION_SET_REPEAT_MODE, j2);
        byte[] bArr = new byte[iMin];
        long j3 = j2;
        while (j3 > 0 && (i2 = read(bArr, 0, iMin)) >= 0) {
            j3 -= (long) i2;
        }
        return j2 - j3;
    }
}

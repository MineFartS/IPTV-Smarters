package com.google.android.exoplayer2.ext.flac;

import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import c.f.a.b.y2.d.f;
import c.f.a.b.y2.d.h;
import c.f.a.b.z2.k;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacDecoderJni {
    private static final int TEMP_BUFFER_SIZE = 8192;
    private ByteBuffer byteBufferData;
    private boolean endOfExtractorInput;
    private k extractorInput;
    private final long nativeDecoderContext;
    private byte[] tempBuffer;

    public static final class a extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23906b;

        public a(String str, int i2) {
            super(str);
            this.f23906b = i2;
        }
    }

    public FlacDecoderJni() throws f {
        if (!h.isAvailable()) {
            throw new f("Failed to load decoder native libraries.");
        }
        long jFlacInit = flacInit();
        this.nativeDecoderContext = jFlacInit;
        if (jFlacInit == 0) {
            throw new f("Failed to initialize decoder");
        }
    }

    private native FlacStreamMetadata flacDecodeMetadata(long j2);

    private native int flacDecodeToArray(long j2, byte[] bArr);

    private native int flacDecodeToBuffer(long j2, ByteBuffer byteBuffer);

    private native void flacFlush(long j2);

    private native long flacGetDecodePosition(long j2);

    private native long flacGetLastFrameFirstSampleIndex(long j2);

    private native long flacGetLastFrameTimestamp(long j2);

    private native long flacGetNextFrameFirstSampleIndex(long j2);

    private native boolean flacGetSeekPoints(long j2, long j3, long[] jArr);

    private native String flacGetStateString(long j2);

    private native long flacInit();

    private native boolean flacIsDecoderAtEndOfStream(long j2);

    private native void flacRelease(long j2);

    private native void flacReset(long j2, long j3);

    private int readFromExtractorInput(k kVar, byte[] bArr, int i2, int i3) {
        int iB = kVar.b(bArr, i2, i3);
        if (iB != -1) {
            return iB;
        }
        this.endOfExtractorInput = true;
        return 0;
    }

    public void clearData() {
        this.byteBufferData = null;
        this.extractorInput = null;
    }

    public void decodeSample(ByteBuffer byteBuffer) throws a {
        byteBuffer.clear();
        int iFlacDecodeToBuffer = byteBuffer.isDirect() ? flacDecodeToBuffer(this.nativeDecoderContext, byteBuffer) : flacDecodeToArray(this.nativeDecoderContext, byteBuffer.array());
        if (iFlacDecodeToBuffer < 0) {
            if (!isDecoderAtEndOfInput()) {
                throw new a("Cannot decode FLAC frame", iFlacDecodeToBuffer);
            }
            iFlacDecodeToBuffer = 0;
        }
        byteBuffer.limit(iFlacDecodeToBuffer);
    }

    public void decodeSampleWithBacktrackPosition(ByteBuffer byteBuffer, long j2) throws a, IOException {
        try {
            decodeSample(byteBuffer);
        } catch (IOException e2) {
            if (j2 >= 0) {
                reset(j2);
                k kVar = this.extractorInput;
                if (kVar != null) {
                    kVar.o(j2, e2);
                }
            }
            throw e2;
        }
    }

    public FlacStreamMetadata decodeStreamMetadata() throws w1 {
        FlacStreamMetadata flacStreamMetadataFlacDecodeMetadata = flacDecodeMetadata(this.nativeDecoderContext);
        if (flacStreamMetadataFlacDecodeMetadata != null) {
            return flacStreamMetadataFlacDecodeMetadata;
        }
        throw w1.a("Failed to decode stream metadata", null);
    }

    public void flush() {
        flacFlush(this.nativeDecoderContext);
    }

    public long getDecodePosition() {
        return flacGetDecodePosition(this.nativeDecoderContext);
    }

    public long getLastFrameFirstSampleIndex() {
        return flacGetLastFrameFirstSampleIndex(this.nativeDecoderContext);
    }

    public long getLastFrameTimestamp() {
        return flacGetLastFrameTimestamp(this.nativeDecoderContext);
    }

    public long getNextFrameFirstSampleIndex() {
        return flacGetNextFrameFirstSampleIndex(this.nativeDecoderContext);
    }

    public x.a getSeekPoints(long j2) {
        long[] jArr = new long[4];
        if (!flacGetSeekPoints(this.nativeDecoderContext, j2, jArr)) {
            return null;
        }
        y yVar = new y(jArr[0], jArr[1]);
        return new x.a(yVar, jArr[2] == jArr[0] ? yVar : new y(jArr[2], jArr[3]));
    }

    public String getStateString() {
        return flacGetStateString(this.nativeDecoderContext);
    }

    public boolean isDecoderAtEndOfInput() {
        return flacIsDecoderAtEndOfStream(this.nativeDecoderContext);
    }

    public boolean isEndOfData() {
        ByteBuffer byteBuffer = this.byteBufferData;
        if (byteBuffer != null) {
            return byteBuffer.remaining() == 0;
        }
        if (this.extractorInput != null) {
            return this.endOfExtractorInput;
        }
        return true;
    }

    public int read(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.byteBufferData;
        if (byteBuffer2 != null) {
            int iMin = Math.min(iRemaining, byteBuffer2.remaining());
            int iLimit = this.byteBufferData.limit();
            ByteBuffer byteBuffer3 = this.byteBufferData;
            byteBuffer3.limit(byteBuffer3.position() + iMin);
            byteBuffer.put(this.byteBufferData);
            this.byteBufferData.limit(iLimit);
            return iMin;
        }
        k kVar = this.extractorInput;
        if (kVar == null) {
            return -1;
        }
        byte[] bArr = (byte[]) x0.i(this.tempBuffer);
        int iMin2 = Math.min(iRemaining, TEMP_BUFFER_SIZE);
        int fromExtractorInput = readFromExtractorInput(kVar, bArr, 0, iMin2);
        if (fromExtractorInput < 4) {
            fromExtractorInput += readFromExtractorInput(kVar, bArr, fromExtractorInput, iMin2 - fromExtractorInput);
        }
        int i2 = fromExtractorInput;
        byteBuffer.put(bArr, 0, i2);
        return i2;
    }

    public void release() {
        flacRelease(this.nativeDecoderContext);
    }

    public void reset(long j2) {
        flacReset(this.nativeDecoderContext, j2);
    }

    public void setData(k kVar) {
        this.byteBufferData = null;
        this.extractorInput = kVar;
        this.endOfExtractorInput = false;
        if (this.tempBuffer == null) {
            this.tempBuffer = new byte[TEMP_BUFFER_SIZE];
        }
    }

    public void setData(ByteBuffer byteBuffer) {
        this.byteBufferData = byteBuffer;
        this.extractorInput = null;
    }
}

package com.amazonaws.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class ResettableInputStream extends ReleasableInputStream {
    private static final Log log = LogFactory.getLog((Class<?>) ResettableInputStream.class);
    private final File file;
    private final FileChannel fileChannel;
    private final FileInputStream fis;
    private long markPos;

    public ResettableInputStream(File file) {
        this(new FileInputStream(file), file);
    }

    public ResettableInputStream(FileInputStream fileInputStream) {
        this(fileInputStream, null);
    }

    private ResettableInputStream(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.file = file;
        this.fis = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.fileChannel = channel;
        this.markPos = channel.position();
    }

    public static ResettableInputStream newResettableInputStream(File file) {
        return newResettableInputStream(file, (String) null);
    }

    public static ResettableInputStream newResettableInputStream(File file, String str) {
        try {
            return new ResettableInputStream(file);
        } catch (IOException e2) {
            if (str == null) {
                throw new AmazonClientException(e2);
            }
            throw new AmazonClientException(str, e2);
        }
    }

    public static ResettableInputStream newResettableInputStream(FileInputStream fileInputStream) {
        return newResettableInputStream(fileInputStream, (String) null);
    }

    public static ResettableInputStream newResettableInputStream(FileInputStream fileInputStream, String str) {
        try {
            return new ResettableInputStream(fileInputStream);
        } catch (IOException e2) {
            throw new AmazonClientException(str, e2);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        abortIfNeeded();
        return this.fis.available();
    }

    public File getFile() {
        return this.file;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        abortIfNeeded();
        try {
            this.markPos = this.fileChannel.position();
            Log log2 = log;
            if (log2.isTraceEnabled()) {
                log2.trace("File input stream marked at position " + this.markPos);
            }
        } catch (IOException e2) {
            throw new AmazonClientException("Failed to mark the file position", e2);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        abortIfNeeded();
        return this.fis.read();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        abortIfNeeded();
        return this.fis.read(bArr, i2, i3);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        this.fileChannel.position(this.markPos);
        Log log2 = log;
        if (log2.isTraceEnabled()) {
            log2.trace("Reset to position " + this.markPos);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        abortIfNeeded();
        return this.fis.skip(j2);
    }
}

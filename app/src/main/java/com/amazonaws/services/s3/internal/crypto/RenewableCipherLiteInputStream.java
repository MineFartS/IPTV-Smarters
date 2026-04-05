package com.amazonaws.services.s3.internal.crypto;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class RenewableCipherLiteInputStream extends CipherLiteInputStream {
    private boolean hasBeenAccessed;

    public RenewableCipherLiteInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        super(inputStream, cipherLite);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i2) {
        super(inputStream, cipherLite, i2);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i2, boolean z, boolean z2) {
        super(inputStream, cipherLite, i2, z, z2);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLiteInputStream, com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        abortIfNeeded();
        if (this.hasBeenAccessed) {
            throw new UnsupportedOperationException("Marking is only supported before your first call to read or skip.");
        }
        ((FilterInputStream) this).in.mark(i2);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLiteInputStream, com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLiteInputStream, com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        this.hasBeenAccessed = true;
        return super.read();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLiteInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        this.hasBeenAccessed = true;
        return super.read(bArr);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLiteInputStream, com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        this.hasBeenAccessed = true;
        return super.read(bArr, i2, i3);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLiteInputStream, com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
        renewCipherLite();
        resetInternal();
        this.hasBeenAccessed = false;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLiteInputStream, com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        this.hasBeenAccessed = true;
        return super.skip(j2);
    }
}

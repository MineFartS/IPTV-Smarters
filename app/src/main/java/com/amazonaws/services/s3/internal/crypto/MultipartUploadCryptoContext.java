package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.AmazonClientException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class MultipartUploadCryptoContext extends MultipartUploadContext {
    private final ContentCryptoMaterial cekMaterial;
    private int partNumber;
    private volatile boolean partUploadInProgress;

    public MultipartUploadCryptoContext(String str, String str2, ContentCryptoMaterial contentCryptoMaterial) {
        super(str, str2);
        this.cekMaterial = contentCryptoMaterial;
    }

    public void beginPartUpload(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("part number must be at least 1");
        }
        if (this.partUploadInProgress) {
            throw new AmazonClientException("Parts are required to be uploaded in series");
        }
        synchronized (this) {
            if (i2 - this.partNumber > 1) {
                throw new AmazonClientException("Parts are required to be uploaded in series (partNumber=" + this.partNumber + ", nextPartNumber=" + i2 + ")");
            }
            this.partNumber = i2;
            this.partUploadInProgress = true;
        }
    }

    public void endPartUpload() {
        this.partUploadInProgress = false;
    }

    public CipherLite getCipherLite() {
        return this.cekMaterial.getCipherLite();
    }

    public ContentCryptoMaterial getContentCryptoMaterial() {
        return this.cekMaterial;
    }
}

package com.amplifyframework.storage.s3.options;

import a.i.q.d;
import com.amplifyframework.storage.options.StorageUploadInputStreamOptions;
import com.amplifyframework.storage.s3.ServerSideEncryption;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageUploadInputStreamOptions extends StorageUploadInputStreamOptions {
    private final ServerSideEncryption serverSideEncryption;

    public static final class Builder extends StorageUploadInputStreamOptions.Builder<Builder> {
        private ServerSideEncryption serverSideEncryption;

        private Builder() {
            this.serverSideEncryption = ServerSideEncryption.NONE;
        }

        @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageUploadInputStreamOptions build() {
            return new AWSS3StorageUploadInputStreamOptions(this);
        }

        public Builder serverSideEncryption(ServerSideEncryption serverSideEncryption) {
            serverSideEncryption.getClass();
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
    }

    private AWSS3StorageUploadInputStreamOptions(Builder builder) {
        super(builder);
        this.serverSideEncryption = builder.serverSideEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageUploadInputStreamOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder from(AWSS3StorageUploadInputStreamOptions aWSS3StorageUploadInputStreamOptions) {
        return (Builder) ((Builder) ((Builder) ((Builder) builder().accessLevel(aWSS3StorageUploadInputStreamOptions.getAccessLevel())).targetIdentityId(aWSS3StorageUploadInputStreamOptions.getTargetIdentityId())).contentType(aWSS3StorageUploadInputStreamOptions.getContentType())).serverSideEncryption(aWSS3StorageUploadInputStreamOptions.getServerSideEncryption()).metadata(aWSS3StorageUploadInputStreamOptions.getMetadata());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageUploadInputStreamOptions)) {
            return false;
        }
        AWSS3StorageUploadInputStreamOptions aWSS3StorageUploadInputStreamOptions = (AWSS3StorageUploadInputStreamOptions) obj;
        return d.a(getAccessLevel(), aWSS3StorageUploadInputStreamOptions.getAccessLevel()) && d.a(getTargetIdentityId(), aWSS3StorageUploadInputStreamOptions.getTargetIdentityId()) && d.a(getContentType(), aWSS3StorageUploadInputStreamOptions.getContentType()) && d.a(getServerSideEncryption(), aWSS3StorageUploadInputStreamOptions.getServerSideEncryption()) && d.a(getMetadata(), aWSS3StorageUploadInputStreamOptions.getMetadata());
    }

    public ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return d.b(getAccessLevel(), getTargetIdentityId(), getContentType(), getServerSideEncryption(), getMetadata());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadInputStreamOptions, com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "AWSS3StorageUploadInputStreamOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", serverSideEncryption=" + getServerSideEncryption().getName() + ", metadata=" + getMetadata() + '}';
    }
}

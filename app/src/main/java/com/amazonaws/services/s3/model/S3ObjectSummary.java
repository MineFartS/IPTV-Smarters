package com.amazonaws.services.s3.model;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectSummary {
    public String bucketName;
    public String eTag;
    public String key;
    public Date lastModified;
    public Owner owner;
    public long size;
    public String storageClass;

    public String getBucketName() {
        return this.bucketName;
    }

    public String getETag() {
        return this.eTag;
    }

    public String getKey() {
        return this.key;
    }

    public Date getLastModified() {
        return this.lastModified;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public long getSize() {
        return this.size;
    }

    public String getStorageClass() {
        return this.storageClass;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLastModified(Date date) {
        this.lastModified = date;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setSize(long j2) {
        this.size = j2;
    }

    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    public String toString() {
        return "S3ObjectSummary{bucketName='" + this.bucketName + "', key='" + this.key + "', eTag='" + this.eTag + "', size=" + this.size + ", lastModified=" + this.lastModified + ", storageClass='" + this.storageClass + "', owner=" + this.owner + '}';
    }
}

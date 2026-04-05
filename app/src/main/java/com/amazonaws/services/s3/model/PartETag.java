package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public class PartETag {
    private String eTag;
    private int partNumber;

    public PartETag(int i2, String str) {
        this.partNumber = i2;
        this.eTag = str;
    }

    public String getETag() {
        return this.eTag;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setPartNumber(int i2) {
        this.partNumber = i2;
    }

    public PartETag withETag(String str) {
        this.eTag = str;
        return this;
    }

    public PartETag withPartNumber(int i2) {
        this.partNumber = i2;
        return this;
    }
}

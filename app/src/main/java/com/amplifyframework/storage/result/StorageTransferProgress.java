package com.amplifyframework.storage.result;

/* JADX INFO: loaded from: classes.dex */
public final class StorageTransferProgress {
    private final long currentBytes;
    private final long totalBytes;

    public StorageTransferProgress(long j2, long j3) {
        this.currentBytes = j2;
        this.totalBytes = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StorageTransferProgress.class != obj.getClass()) {
            return false;
        }
        StorageTransferProgress storageTransferProgress = (StorageTransferProgress) obj;
        return getCurrentBytes() == storageTransferProgress.getCurrentBytes() && getTotalBytes() == storageTransferProgress.getTotalBytes();
    }

    public long getCurrentBytes() {
        return this.currentBytes;
    }

    public double getFractionCompleted() {
        double d2 = this.currentBytes;
        double d3 = this.totalBytes;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return d2 / d3;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        return (((int) (getCurrentBytes() ^ (getCurrentBytes() >>> 32))) * 31) + ((int) (getTotalBytes() ^ (getTotalBytes() >>> 32)));
    }

    public String toString() {
        return "StorageTransferProgress{currentBytes=" + getCurrentBytes() + ", totalBytes=" + getTotalBytes() + ", fractionCompleted=" + getFractionCompleted() + '}';
    }
}

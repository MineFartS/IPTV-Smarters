package com.amplifyframework.storage;

import a.i.q.d;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class StorageItem {
    private final String eTag;
    private final String key;
    private final Date lastModified;
    private final Object pluginResults;
    private final long size;

    public StorageItem(String str, long j2, Date date, String str2, Object obj) {
        this.key = str;
        this.size = j2;
        this.lastModified = date;
        this.eTag = str2;
        this.pluginResults = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageItem)) {
            return false;
        }
        StorageItem storageItem = (StorageItem) obj;
        if (d.a(this.key, storageItem.key) && this.size == storageItem.size && d.a(this.lastModified, storageItem.lastModified) && d.a(this.eTag, storageItem.eTag)) {
            return d.a(this.pluginResults, storageItem.pluginResults);
        }
        return false;
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

    public Object getPluginResults() {
        return this.pluginResults;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((((this.key.hashCode() * 31) + ((int) this.size)) * 31) + this.lastModified.hashCode()) * 31) + this.eTag.hashCode()) * 31;
        Object obj = this.pluginResults;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "StorageItem{key='" + this.key + "', size=" + this.size + ", lastModified=" + this.lastModified.toString() + ", eTag='" + this.eTag + "', pluginResults=" + this.pluginResults + '}';
    }
}

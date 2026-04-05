package com.amazonaws.util;

import com.amazonaws.ResponseMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ResponseMetadataCache {
    private final InternalCache internalCache;

    public static final class InternalCache extends LinkedHashMap<Integer, ResponseMetadata> {
        private int maxSize;

        public InternalCache(int i2) {
            super(i2);
            this.maxSize = i2;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Integer, ResponseMetadata> entry) {
            return size() > this.maxSize;
        }
    }

    public ResponseMetadataCache(int i2) {
        this.internalCache = new InternalCache(i2);
    }

    public synchronized void add(Object obj, ResponseMetadata responseMetadata) {
        if (obj == null) {
            return;
        }
        this.internalCache.put(Integer.valueOf(System.identityHashCode(obj)), responseMetadata);
    }

    public ResponseMetadata get(Object obj) {
        return this.internalCache.get(Integer.valueOf(System.identityHashCode(obj)));
    }
}

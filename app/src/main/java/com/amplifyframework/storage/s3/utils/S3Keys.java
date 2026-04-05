package com.amplifyframework.storage.s3.utils;

import com.amplifyframework.storage.StorageAccessLevel;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class S3Keys {
    private static final char BUCKET_SEPARATOR = '/';

    private S3Keys() {
    }

    public static String createServiceKey(StorageAccessLevel storageAccessLevel, String str, String str2) {
        return getAccessLevelPrefix(storageAccessLevel, str) + BUCKET_SEPARATOR + str2;
    }

    public static String extractAmplifyKey(String str) {
        try {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf < 0) {
                throw new IllegalArgumentException("Missing access level.");
            }
            StorageAccessLevel storageAccessLevelValueOf = StorageAccessLevel.valueOf(str.substring(0, iIndexOf).toUpperCase(Locale.US));
            int i2 = iIndexOf + 1;
            if (StorageAccessLevel.PUBLIC.equals(storageAccessLevelValueOf)) {
                return str.substring(i2);
            }
            int iIndexOf2 = str.indexOf(47, i2);
            if (iIndexOf2 >= 0) {
                return str.substring(iIndexOf2 + 1);
            }
            throw new IllegalArgumentException("Missing identity ID.");
        } catch (RuntimeException e2) {
            throw new IllegalArgumentException("Service key is incorrectly formatted.", e2);
        }
    }

    private static String getAccessLevelPrefix(StorageAccessLevel storageAccessLevel, String str) {
        if (!StorageAccessLevel.PRIVATE.equals(storageAccessLevel) && !StorageAccessLevel.PROTECTED.equals(storageAccessLevel)) {
            return storageAccessLevel.name().toLowerCase(Locale.US);
        }
        return storageAccessLevel.name().toLowerCase(Locale.US) + BUCKET_SEPARATOR + str;
    }
}

package com.amazonaws.mobileconnectors.cognitoauth.util;

import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class AuthClientConfig {
    private static long REFRESH_THRESHOLD_MAX = 1800000;
    private static long REFRESH_THRESHOLD_MIN = 0;
    private static long refreshThreshold = 300000;

    public static long getRefreshThreshold() {
        return refreshThreshold;
    }

    public static void setRefreshThreshold(long j2) {
        if (j2 > REFRESH_THRESHOLD_MAX || j2 < REFRESH_THRESHOLD_MIN) {
            throw new InvalidParameterException(String.format("The value of refreshThreshold must between %d and %d seconds", Long.valueOf(REFRESH_THRESHOLD_MIN), Long.valueOf(REFRESH_THRESHOLD_MAX)));
        }
        refreshThreshold = j2;
    }
}

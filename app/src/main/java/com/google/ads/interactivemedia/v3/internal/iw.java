package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f21995a = new UUID(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f21996b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UUID f21997c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UUID f21998d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UUID f21999e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static long b(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long c(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static String d(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
}

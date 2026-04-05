package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioTrack f22623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f22624b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22627e;

    public oq(AudioTrack audioTrack) {
        this.f22623a = audioTrack;
    }

    public final long a() {
        return this.f22627e;
    }

    public final long b() {
        return this.f22624b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f22623a.getTimestamp(this.f22624b);
        if (timestamp) {
            long j2 = this.f22624b.framePosition;
            if (this.f22626d > j2) {
                this.f22625c++;
            }
            this.f22626d = j2;
            this.f22627e = j2 + (this.f22625c << 32);
        }
        return timestamp;
    }
}

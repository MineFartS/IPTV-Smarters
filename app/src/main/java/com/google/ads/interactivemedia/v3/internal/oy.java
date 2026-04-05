package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f22662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nz[] f22670i;

    public oy(ke keVar, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, nz[] nzVarArr) {
        int iC;
        this.f22662a = keVar;
        this.f22663b = i2;
        this.f22664c = i3;
        this.f22665d = i4;
        this.f22666e = i5;
        this.f22667f = i6;
        this.f22668g = i7;
        this.f22670i = nzVarArr;
        if (i3 != 0) {
            iC = e(i3 == 1 ? 50000000L : 250000L);
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i5, i6, i7);
            ajr.f(minBufferSize != -2);
            iC = amn.c(minBufferSize * 4, ((int) a(250000L)) * i4, Math.max(minBufferSize, ((int) a(750000L)) * i4));
        }
        this.f22669h = iC;
    }

    private final int e(long j2) {
        int i2;
        int i3 = this.f22668g;
        switch (i3) {
            case 5:
                i2 = 80000;
                break;
            case 6:
            case 18:
                i2 = 768000;
                break;
            case 7:
                i2 = 192000;
                break;
            case 8:
                i2 = 2250000;
                break;
            case 9:
                i2 = 40000;
                break;
            case 10:
                i2 = 100000;
                break;
            case 11:
                i2 = 16000;
                break;
            case 12:
                i2 = 7000;
                break;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                i2 = 3062500;
                break;
            case 15:
                i2 = 8000;
                break;
            case 16:
                i2 = 256000;
                break;
            case 17:
                i2 = 336000;
                break;
        }
        if (i3 == 5) {
            i2 += i2;
        }
        return (int) ((j2 * ((long) i2)) / 1000000);
    }

    private static AudioAttributes f(nu nuVar, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : nuVar.a();
    }

    public final long a(long j2) {
        return (j2 * ((long) this.f22666e)) / 1000000;
    }

    public final long b(long j2) {
        return (j2 * 1000000) / ((long) this.f22666e);
    }

    public final AudioTrack c(boolean z, nu nuVar, int i2) {
        AudioTrack audioTrack;
        try {
            int i3 = amn.f20135a;
            if (i3 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(f(nuVar, z)).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f22666e).setChannelMask(this.f22667f).setEncoding(this.f22668g).build()).setTransferMode(1).setBufferSizeInBytes(this.f22669h).setSessionId(i2).setOffloadedPlayback(this.f22664c == 1).build();
            } else if (i3 >= 21) {
                audioTrack = new AudioTrack(f(nuVar, z), new AudioFormat.Builder().setSampleRate(this.f22666e).setChannelMask(this.f22667f).setEncoding(this.f22668g).build(), this.f22669h, 1, i2);
            } else {
                int i4 = nuVar.f22567c;
                audioTrack = i2 == 0 ? new AudioTrack(3, this.f22666e, this.f22667f, this.f22668g, this.f22669h, 1) : new AudioTrack(3, this.f22666e, this.f22667f, this.f22668g, this.f22669h, 1, i2);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new ol(state, this.f22666e, this.f22667f, this.f22669h, this.f22662a, d(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new ol(0, this.f22666e, this.f22667f, this.f22669h, this.f22662a, d(), e2);
        }
    }

    public final boolean d() {
        return this.f22664c == 1;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rt f22918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ys f22919l;

    private ru(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, rt rtVar, ys ysVar) {
        this.f22908a = i2;
        this.f22909b = i3;
        this.f22910c = i4;
        this.f22911d = i5;
        this.f22912e = i6;
        this.f22913f = i(i6);
        this.f22914g = i7;
        this.f22915h = i8;
        this.f22916i = h(i8);
        this.f22917j = j2;
        this.f22918k = rtVar;
        this.f22919l = ysVar;
    }

    public ru(byte[] bArr, int i2) {
        alw alwVar = new alw(bArr);
        alwVar.g(i2 * 8);
        this.f22908a = alwVar.c(16);
        this.f22909b = alwVar.c(16);
        this.f22910c = alwVar.c(24);
        this.f22911d = alwVar.c(24);
        int iC = alwVar.c(20);
        this.f22912e = iC;
        this.f22913f = i(iC);
        this.f22914g = alwVar.c(3) + 1;
        int iC2 = alwVar.c(5) + 1;
        this.f22915h = iC2;
        this.f22916i = h(iC2);
        this.f22917j = amn.r(alwVar.c(4), alwVar.c(32));
        this.f22918k = null;
        this.f22919l = null;
    }

    private static int h(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static ys j(List<String> list, List<yy> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] strArrAe = amn.ae(str, "=");
            if (strArrAe.length != 2) {
                String strValueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", strValueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(strValueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new za(strArrAe[0], strArrAe[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ys(arrayList);
    }

    public final long a() {
        long j2 = this.f22917j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / ((long) this.f22912e);
    }

    public final long b(long j2) {
        return amn.k((j2 * ((long) this.f22912e)) / 1000000, 0L, this.f22917j - 1);
    }

    public final ke c(byte[] bArr, ys ysVar) {
        bArr[4] = -128;
        int i2 = this.f22911d;
        if (i2 <= 0) {
            i2 = -1;
        }
        ys ysVarG = g(ysVar);
        kd kdVar = new kd();
        kdVar.ae("audio/flac");
        kdVar.W(i2);
        kdVar.H(this.f22914g);
        kdVar.af(this.f22912e);
        kdVar.T(Collections.singletonList(bArr));
        kdVar.X(ysVarG);
        return kdVar.s();
    }

    public final ru d(List<yy> list) {
        return new ru(this.f22908a, this.f22909b, this.f22910c, this.f22911d, this.f22912e, this.f22914g, this.f22915h, this.f22917j, this.f22918k, g(j(Collections.emptyList(), list)));
    }

    public final ru e(rt rtVar) {
        return new ru(this.f22908a, this.f22909b, this.f22910c, this.f22911d, this.f22912e, this.f22914g, this.f22915h, this.f22917j, rtVar, this.f22919l);
    }

    public final ru f(List<String> list) {
        return new ru(this.f22908a, this.f22909b, this.f22910c, this.f22911d, this.f22912e, this.f22914g, this.f22915h, this.f22917j, this.f22918k, g(j(list, Collections.emptyList())));
    }

    public final ys g(ys ysVar) {
        ys ysVar2 = this.f22919l;
        return ysVar2 == null ? ysVar : ysVar2.d(ysVar);
    }
}

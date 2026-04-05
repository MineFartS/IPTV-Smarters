package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class adt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f19299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19305g;

    private adt(int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7) {
        this.f19300b = i2;
        this.f19299a = iArr;
        this.f19301c = i3;
        this.f19303e = i4;
        this.f19304f = i5;
        this.f19305g = i6;
        this.f19302d = i7;
    }

    public static adt a(int[] iArr, int i2) {
        return new adt(3, 1, iArr, i2, -1, -1, -1);
    }

    public static adt b(int[] iArr, int i2) {
        return new adt(5, 1, iArr, i2, -1, -1, -1);
    }

    public static adt c(int i2) {
        return new adt(5, 2, new int[0], -1, -1, -1, i2);
    }

    public static adt d(int i2, int[] iArr, int i3, int i4, int i5) {
        return new adt(i2, 0, iArr, i3, i4, i5, -1);
    }
}

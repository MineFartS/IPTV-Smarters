package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public class abf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19060e;

    public abf(abf abfVar) {
        this.f19056a = abfVar.f19056a;
        this.f19057b = abfVar.f19057b;
        this.f19058c = abfVar.f19058c;
        this.f19059d = abfVar.f19059d;
        this.f19060e = abfVar.f19060e;
    }

    public abf(Object obj) {
        this(obj, -1, -1, -1L, -1);
    }

    public abf(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    private abf(Object obj, int i2, int i3, long j2, int i4) {
        this.f19056a = obj;
        this.f19057b = i2;
        this.f19058c = i3;
        this.f19059d = j2;
        this.f19060e = i4;
    }

    public abf(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }

    public final abf a(Object obj) {
        return this.f19056a.equals(obj) ? this : new abf(obj, this.f19057b, this.f19058c, this.f19059d, this.f19060e);
    }

    public final boolean b() {
        return this.f19057b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abf)) {
            return false;
        }
        abf abfVar = (abf) obj;
        return this.f19056a.equals(abfVar.f19056a) && this.f19057b == abfVar.f19057b && this.f19058c == abfVar.f19058c && this.f19059d == abfVar.f19059d && this.f19060e == abfVar.f19060e;
    }

    public final int hashCode() {
        return ((((((((this.f19056a.hashCode() + 527) * 31) + this.f19057b) * 31) + this.f19058c) * 31) + ((int) this.f19059d)) * 31) + this.f19060e;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aiq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls[] f19846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aii[] f19847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19848d;

    public aiq(ls[] lsVarArr, aii[] aiiVarArr, Object obj) {
        this.f19846b = lsVarArr;
        this.f19847c = (aii[]) aiiVarArr.clone();
        this.f19848d = obj;
        this.f19845a = lsVarArr.length;
    }

    public final boolean a(aiq aiqVar, int i2) {
        return aiqVar != null && amn.O(this.f19846b[i2], aiqVar.f19846b[i2]) && amn.O(this.f19847c[i2], aiqVar.f19847c[i2]);
    }

    public final boolean b(int i2) {
        return this.f19846b[i2] != null;
    }
}

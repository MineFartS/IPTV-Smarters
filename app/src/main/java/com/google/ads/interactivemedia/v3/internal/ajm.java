package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ajm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ait[] f19905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ait[] f19909f;

    public ajm() {
        ajr.d(true);
        ajr.d(true);
        this.f19908e = 0;
        this.f19909f = new ait[100];
        this.f19904a = null;
        this.f19905b = new ait[1];
    }

    public final synchronized int a() {
        return this.f19907d * 65536;
    }

    public final synchronized ait b() {
        ait aitVar;
        this.f19907d++;
        int i2 = this.f19908e;
        if (i2 > 0) {
            ait[] aitVarArr = this.f19909f;
            int i3 = i2 - 1;
            this.f19908e = i3;
            aitVar = aitVarArr[i3];
            ajr.b(aitVar);
            this.f19909f[this.f19908e] = null;
        } else {
            aitVar = new ait(new byte[65536], 0);
        }
        return aitVar;
    }

    public final synchronized void c(ait aitVar) {
        ait[] aitVarArr = this.f19905b;
        aitVarArr[0] = aitVar;
        d(aitVarArr);
    }

    public final synchronized void d(ait[] aitVarArr) {
        int length = this.f19908e + aitVarArr.length;
        ait[] aitVarArr2 = this.f19909f;
        int length2 = aitVarArr2.length;
        if (length >= length2) {
            this.f19909f = (ait[]) Arrays.copyOf(aitVarArr2, Math.max(length2 + length2, length));
        }
        for (ait aitVar : aitVarArr) {
            ait[] aitVarArr3 = this.f19909f;
            int i2 = this.f19908e;
            this.f19908e = i2 + 1;
            aitVarArr3[i2] = aitVar;
        }
        this.f19907d -= aitVarArr.length;
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i2) {
        int i3 = this.f19906c;
        this.f19906c = i2;
        if (i2 < i3) {
            g();
        }
    }

    public final synchronized void g() {
        int iMax = Math.max(0, amn.b(this.f19906c, 65536) - this.f19907d);
        int i2 = this.f19908e;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.f19909f, iMax, i2, (Object) null);
        this.f19908e = iMax;
    }
}

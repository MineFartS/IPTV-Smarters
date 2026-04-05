package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vg f23314a = new vg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f23315b = new alx(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23316c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23318e;

    private final int f(int i2) {
        int i3;
        int i4 = 0;
        this.f23317d = 0;
        do {
            int i5 = this.f23317d;
            int i6 = i2 + i5;
            vg vgVar = this.f23314a;
            if (i6 >= vgVar.f23322d) {
                break;
            }
            int[] iArr = vgVar.f23325g;
            this.f23317d = i5 + 1;
            i3 = iArr[i6];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    public final vg a() {
        return this.f23314a;
    }

    public final alx b() {
        return this.f23315b;
    }

    public final void c() {
        this.f23314a.a();
        this.f23315b.E(0);
        this.f23316c = -1;
        this.f23318e = false;
    }

    public final void d() {
        if (this.f23315b.K().length == 65025) {
            return;
        }
        alx alxVar = this.f23315b;
        alxVar.G(Arrays.copyOf(alxVar.K(), Math.max(65025, this.f23315b.d())), this.f23315b.d());
    }

    public final boolean e(rk rkVar) {
        ajr.f(true);
        if (this.f23318e) {
            this.f23318e = false;
            this.f23315b.E(0);
        }
        while (!this.f23318e) {
            int i2 = this.f23316c;
            if (i2 < 0) {
                if (!this.f23314a.c(rkVar) || !this.f23314a.b(rkVar, true)) {
                    return false;
                }
                vg vgVar = this.f23314a;
                int iF = vgVar.f23323e;
                if ((vgVar.f23320b & 1) == 1 && this.f23315b.d() == 0) {
                    iF += f(0);
                    i2 = this.f23317d;
                } else {
                    i2 = 0;
                }
                rkVar.j(iF);
                this.f23316c = i2;
            }
            int iF2 = f(i2);
            int i3 = this.f23316c + this.f23317d;
            if (iF2 > 0) {
                alx alxVar = this.f23315b;
                alxVar.B(alxVar.d() + iF2);
                rkVar.h(this.f23315b.K(), this.f23315b.d(), iF2);
                alx alxVar2 = this.f23315b;
                alxVar2.H(alxVar2.d() + iF2);
                this.f23318e = this.f23314a.f23325g[i3 + (-1)] != 255;
            }
            if (i3 == this.f23314a.f23322d) {
                i3 = -1;
            }
            this.f23316c = i3;
        }
        return true;
    }
}

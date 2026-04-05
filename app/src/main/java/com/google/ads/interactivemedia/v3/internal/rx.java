package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class rx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final alx f22924a = new alx(10);

    public final ys a(rk rkVar, zl zlVar) {
        ys ysVarC = null;
        int i2 = 0;
        while (true) {
            try {
                rkVar.g(this.f22924a.K(), 0, 10);
                this.f22924a.I(0);
                if (this.f22924a.m() != 4801587) {
                    break;
                }
                this.f22924a.J(3);
                int iJ = this.f22924a.j();
                int i3 = iJ + 10;
                if (ysVarC == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f22924a.K(), 0, bArr, 0, 10);
                    rkVar.g(bArr, 10, iJ);
                    ysVarC = new zn(zlVar).c(bArr, i3);
                } else {
                    rkVar.f(iJ);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        rkVar.i();
        rkVar.f(i2);
        return ysVarC;
    }
}

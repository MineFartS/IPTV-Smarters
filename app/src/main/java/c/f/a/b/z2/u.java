package c.f.a.b.z2;

import c.f.a.b.b3.m.h;
import c.f.a.b.j3.i0;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f11501a = new i0(10);

    public c.f.a.b.b3.a a(k kVar, h.a aVar) {
        c.f.a.b.b3.a aVarD = null;
        int i2 = 0;
        while (true) {
            try {
                kVar.u(this.f11501a.d(), 0, 10);
                this.f11501a.P(0);
                if (this.f11501a.G() != 4801587) {
                    break;
                }
                this.f11501a.Q(3);
                int iC = this.f11501a.C();
                int i3 = iC + 10;
                if (aVarD == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f11501a.d(), 0, bArr, 0, 10);
                    kVar.u(bArr, 10, iC);
                    aVarD = new c.f.a.b.b3.m.h(aVar).d(bArr, i3);
                } else {
                    kVar.m(iC);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        kVar.r();
        kVar.m(i2);
        return aVarD;
    }
}

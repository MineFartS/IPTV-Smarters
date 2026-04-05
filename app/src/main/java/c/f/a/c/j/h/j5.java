package c.f.a.c.j.h;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class j5 extends i5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f13381f;

    public j5(byte[] bArr) {
        bArr.getClass();
        this.f13381f = bArr;
    }

    public int F() {
        return 0;
    }

    @Override // c.f.a.c.j.h.l5
    public byte a(int i2) {
        return this.f13381f[i2];
    }

    @Override // c.f.a.c.j.h.l5
    public byte b(int i2) {
        return this.f13381f[i2];
    }

    @Override // c.f.a.c.j.h.l5
    public int d() {
        return this.f13381f.length;
    }

    @Override // c.f.a.c.j.h.l5
    public final l5 e(int i2, int i3) {
        int iD = l5.D(0, i3, d());
        return iD == 0 ? l5.f13413b : new e5(this.f13381f, 0, iD);
    }

    @Override // c.f.a.c.j.h.l5
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l5) || d() != ((l5) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return obj.equals(this);
        }
        j5 j5Var = (j5) obj;
        int iC = C();
        int iC2 = j5Var.C();
        if (iC != 0 && iC2 != 0 && iC != iC2) {
            return false;
        }
        int iD = d();
        if (iD > j5Var.d()) {
            int iD2 = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iD);
            sb.append(iD2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iD > j5Var.d()) {
            int iD3 = j5Var.d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(0);
            sb2.append(", ");
            sb2.append(iD);
            sb2.append(", ");
            sb2.append(iD3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f13381f;
        byte[] bArr2 = j5Var.f13381f;
        j5Var.F();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iD) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @Override // c.f.a.c.j.h.l5
    public final void f(z4 z4Var) throws r5 {
        ((q5) z4Var).G(this.f13381f, 0, d());
    }

    @Override // c.f.a.c.j.h.l5
    public final String g(Charset charset) {
        return new String(this.f13381f, 0, d(), charset);
    }

    @Override // c.f.a.c.j.h.l5
    public final boolean i() {
        return i9.b(this.f13381f, 0, d());
    }

    @Override // c.f.a.c.j.h.l5
    public final int s(int i2, int i3, int i4) {
        return u6.h(i2, this.f13381f, 0, i4);
    }
}

package c.f.a.c.j.c;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class w9 extends t9 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f13125f;

    public w9(byte[] bArr) {
        bArr.getClass();
        this.f13125f = bArr;
    }

    @Override // c.f.a.c.j.c.m9
    public final boolean C() {
        int I = I();
        return rd.f(this.f13125f, I, size() + I);
    }

    @Override // c.f.a.c.j.c.t9
    public final boolean F(m9 m9Var, int i2, int i3) {
        if (i3 > m9Var.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 > m9Var.size()) {
            int size2 = m9Var.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(m9Var instanceof w9)) {
            return m9Var.x(0, i3).equals(x(0, i3));
        }
        w9 w9Var = (w9) m9Var;
        byte[] bArr = this.f13125f;
        byte[] bArr2 = w9Var.f13125f;
        int I = I() + i3;
        int I2 = I();
        int I3 = w9Var.I();
        while (I2 < I) {
            if (bArr[I2] != bArr2[I3]) {
                return false;
            }
            I2++;
            I3++;
        }
        return true;
    }

    public int I() {
        return 0;
    }

    @Override // c.f.a.c.j.c.m9
    public final String b(Charset charset) {
        return new String(this.f13125f, I(), size(), charset);
    }

    @Override // c.f.a.c.j.c.m9
    public final void d(i9 i9Var) {
        i9Var.a(this.f13125f, I(), size());
    }

    @Override // c.f.a.c.j.c.m9
    public byte e(int i2) {
        return this.f13125f[i2];
    }

    @Override // c.f.a.c.j.c.m9
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m9) || size() != ((m9) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return obj.equals(this);
        }
        w9 w9Var = (w9) obj;
        int iD = D();
        int iD2 = w9Var.D();
        if (iD == 0 || iD2 == 0 || iD == iD2) {
            return F(w9Var, 0, size());
        }
        return false;
    }

    @Override // c.f.a.c.j.c.m9
    public byte g(int i2) {
        return this.f13125f[i2];
    }

    @Override // c.f.a.c.j.c.m9
    public int size() {
        return this.f13125f.length;
    }

    @Override // c.f.a.c.j.c.m9
    public final int t(int i2, int i3, int i4) {
        return sa.c(i2, this.f13125f, I(), i4);
    }

    @Override // c.f.a.c.j.c.m9
    public final m9 x(int i2, int i3) {
        int iV = m9.v(0, i3, size());
        return iV == 0 ? m9.f12941b : new p9(this.f13125f, I(), iV);
    }
}

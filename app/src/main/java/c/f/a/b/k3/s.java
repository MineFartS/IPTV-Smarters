package c.f.a.b.k3;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.j0;
import c.f.a.b.w1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f9521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9523c;

    public s(List<byte[]> list, int i2, String str) {
        this.f9521a = list;
        this.f9522b = i2;
        this.f9523c = str;
    }

    public static s a(i0 i0Var) throws w1 {
        try {
            i0Var.Q(21);
            int iD = i0Var.D() & 3;
            int iD2 = i0Var.D();
            int iE = i0Var.e();
            int i2 = 0;
            for (int i3 = 0; i3 < iD2; i3++) {
                i0Var.Q(1);
                int iJ = i0Var.J();
                for (int i4 = 0; i4 < iJ; i4++) {
                    int iJ2 = i0Var.J();
                    i2 += iJ2 + 4;
                    i0Var.Q(iJ2);
                }
            }
            i0Var.P(iE);
            byte[] bArr = new byte[i2];
            String strC = null;
            int i5 = 0;
            for (int i6 = 0; i6 < iD2; i6++) {
                int iD3 = i0Var.D() & 127;
                int iJ3 = i0Var.J();
                for (int i7 = 0; i7 < iJ3; i7++) {
                    int iJ4 = i0Var.J();
                    byte[] bArr2 = c.f.a.b.j3.e0.f9165a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(i0Var.d(), i0Var.e(), bArr, length, iJ4);
                    if (iD3 == 33 && i7 == 0) {
                        strC = c.f.a.b.j3.j.c(new j0(bArr, length, length + iJ4));
                    }
                    i5 = length + iJ4;
                    i0Var.Q(iJ4);
                }
            }
            return new s(i2 == 0 ? null : Collections.singletonList(bArr), iD + 1, strC);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw w1.a("Error parsing HEVC config", e2);
        }
    }
}

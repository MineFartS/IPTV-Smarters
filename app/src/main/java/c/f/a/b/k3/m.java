package c.f.a.b.k3;

import c.f.a.b.j3.e0;
import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f9481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9486f;

    public m(List<byte[]> list, int i2, int i3, int i4, float f2, String str) {
        this.f9481a = list;
        this.f9482b = i2;
        this.f9483c = i3;
        this.f9484d = i4;
        this.f9485e = f2;
        this.f9486f = str;
    }

    public static byte[] a(i0 i0Var) {
        int iJ = i0Var.J();
        int iE = i0Var.e();
        i0Var.Q(iJ);
        return c.f.a.b.j3.j.d(i0Var.d(), iE, iJ);
    }

    public static m b(i0 i0Var) throws w1 {
        String strA;
        int i2;
        float f2;
        try {
            i0Var.Q(4);
            int iD = (i0Var.D() & 3) + 1;
            if (iD == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iD2 = i0Var.D() & 31;
            for (int i3 = 0; i3 < iD2; i3++) {
                arrayList.add(a(i0Var));
            }
            int iD3 = i0Var.D();
            for (int i4 = 0; i4 < iD3; i4++) {
                arrayList.add(a(i0Var));
            }
            int i5 = -1;
            if (iD2 > 0) {
                e0.b bVarI = c.f.a.b.j3.e0.i((byte[]) arrayList.get(0), iD, ((byte[]) arrayList.get(0)).length);
                int i6 = bVarI.f9176e;
                int i7 = bVarI.f9177f;
                float f3 = bVarI.f9178g;
                strA = c.f.a.b.j3.j.a(bVarI.f9172a, bVarI.f9173b, bVarI.f9174c);
                i5 = i6;
                i2 = i7;
                f2 = f3;
            } else {
                strA = null;
                i2 = -1;
                f2 = 1.0f;
            }
            return new m(arrayList, iD, i5, i2, f2, strA);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw w1.a("Error parsing AVC config", e2);
        }
    }
}

package c.f.a.b.z2;

import c.f.a.b.j3.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static void a(long j2, i0 i0Var, a0[] a0VarArr) {
        while (true) {
            if (i0Var.a() <= 1) {
                return;
            }
            int iC = c(i0Var);
            int iC2 = c(i0Var);
            int iE = i0Var.e() + iC2;
            if (iC2 == -1 || iC2 > i0Var.a()) {
                c.f.a.b.j3.z.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iE = i0Var.f();
            } else if (iC == 4 && iC2 >= 8) {
                int iD = i0Var.D();
                int iJ = i0Var.J();
                int iN = iJ == 49 ? i0Var.n() : 0;
                int iD2 = i0Var.D();
                if (iJ == 47) {
                    i0Var.Q(1);
                }
                boolean z = iD == 181 && (iJ == 49 || iJ == 47) && iD2 == 3;
                if (iJ == 49) {
                    z &= iN == 1195456820;
                }
                if (z) {
                    b(j2, i0Var, a0VarArr);
                }
            }
            i0Var.P(iE);
        }
    }

    public static void b(long j2, i0 i0Var, a0[] a0VarArr) {
        int iD = i0Var.D();
        if ((iD & 64) != 0) {
            i0Var.Q(1);
            int i2 = (iD & 31) * 3;
            int iE = i0Var.e();
            for (a0 a0Var : a0VarArr) {
                i0Var.P(iE);
                a0Var.c(i0Var, i2);
                a0Var.d(j2, 1, i2, 0, null);
            }
        }
    }

    public static int c(i0 i0Var) {
        int i2 = 0;
        while (i0Var.a() != 0) {
            int iD = i0Var.D();
            i2 += iD;
            if (iD != 255) {
                return i2;
            }
        }
        return -1;
    }
}

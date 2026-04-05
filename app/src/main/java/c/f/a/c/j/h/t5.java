package c.f.a.c.j.h;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t5 extends z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f13528a = Logger.getLogger(t5.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f13529b = c9.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u5 f13530c;

    public t5() {
    }

    public /* synthetic */ t5(p5 p5Var) {
    }

    public static int A(int i2) {
        return C(i2 << 3);
    }

    public static int B(int i2) {
        if (i2 >= 0) {
            return C(i2);
        }
        return 10;
    }

    public static int C(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int D(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int E(String str) {
        int length;
        try {
            length = i9.c(str);
        } catch (g9 unused) {
            length = str.getBytes(u6.f13546a).length;
        }
        return C(length) + length;
    }

    public static int F(y6 y6Var) {
        int iA = y6Var.a();
        return C(iA) + iA;
    }

    public static int a(l5 l5Var) {
        int iD = l5Var.d();
        return C(iD) + iD;
    }

    public static int b(q7 q7Var, c8 c8Var) {
        t4 t4Var = (t4) q7Var;
        int iH = t4Var.h();
        if (iH == -1) {
            iH = c8Var.c(t4Var);
            t4Var.i(iH);
        }
        return C(iH) + iH;
    }

    public static int c(int i2) {
        return (i2 >> 31) ^ (i2 + i2);
    }

    public static long d(long j2) {
        return (j2 >> 63) ^ (j2 + j2);
    }

    @Deprecated
    public static int g(int i2, q7 q7Var, c8 c8Var) {
        int iC = C(i2 << 3);
        int i3 = iC + iC;
        t4 t4Var = (t4) q7Var;
        int iH = t4Var.h();
        if (iH == -1) {
            iH = c8Var.c(t4Var);
            t4Var.i(iH);
        }
        return i3 + iH;
    }

    public static t5 z(byte[] bArr) {
        return new q5(bArr, 0, bArr.length);
    }

    public final void e() {
        if (y() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void f(String str, g9 g9Var) throws r5 {
        f13528a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) g9Var);
        byte[] bytes = str.getBytes(u6.f13546a);
        try {
            int length = bytes.length;
            t(length);
            x(bytes, 0, length);
        } catch (r5 e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new r5(e3);
        }
    }

    public abstract void i(int i2, int i3);

    public abstract void j(int i2, int i3);

    public abstract void k(int i2, int i3);

    public abstract void l(int i2, int i3);

    public abstract void m(int i2, long j2);

    public abstract void n(int i2, long j2);

    public abstract void o(int i2, boolean z);

    public abstract void p(int i2, String str);

    public abstract void q(int i2, l5 l5Var);

    public abstract void r(byte b2);

    public abstract void s(int i2);

    public abstract void t(int i2);

    public abstract void u(int i2);

    public abstract void v(long j2);

    public abstract void w(long j2);

    public abstract void x(byte[] bArr, int i2, int i3);

    public abstract int y();
}

package c.f.a.b.z2;

import c.f.a.b.w1;
import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    @Pure
    public static void a(boolean z, String str) throws w1 {
        if (!z) {
            throw w1.a(str, null);
        }
    }

    public static boolean b(k kVar, byte[] bArr, int i2, int i3, boolean z) throws EOFException {
        try {
            return kVar.i(bArr, i2, i3, z);
        } catch (EOFException e2) {
            if (z) {
                return false;
            }
            throw e2;
        }
    }

    public static int c(k kVar, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            int iP = kVar.p(bArr, i2 + i4, i3 - i4);
            if (iP == -1) {
                break;
            }
            i4 += iP;
        }
        return i4;
    }

    public static boolean d(k kVar, byte[] bArr, int i2, int i3) {
        try {
            kVar.l(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(k kVar, int i2) {
        try {
            kVar.s(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

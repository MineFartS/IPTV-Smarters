package c.f.a.b.g3;

import android.os.SystemClock;
import c.f.a.b.i3.f0;
import c.f.a.b.j3.d0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static f0.a a(h hVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = hVar.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (hVar.d(i3, jElapsedRealtime)) {
                i2++;
            }
        }
        return new f0.a(1, 0, length, i2);
    }

    public static boolean b(l lVar, int i2) {
        for (int i3 = 0; i3 < lVar.f8488a; i3++) {
            k kVarA = lVar.a(i3);
            if (kVarA != null) {
                for (int i4 = 0; i4 < kVarA.length(); i4++) {
                    if (d0.l(kVarA.g(i4).f9338m) == i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

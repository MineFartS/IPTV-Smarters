package c.f.a.c.j.h;

import android.os.Binder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f3 {
    public static <V> V a(g3<V> g3Var) {
        try {
            return g3Var.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return g3Var.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}

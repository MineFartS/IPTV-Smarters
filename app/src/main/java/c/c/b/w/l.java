package c.c.b.w;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}

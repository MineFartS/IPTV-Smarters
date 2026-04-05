package a.i.s;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    public static final boolean a0;

    static {
        a0 = Build.VERSION.SDK_INT >= 27;
    }
}

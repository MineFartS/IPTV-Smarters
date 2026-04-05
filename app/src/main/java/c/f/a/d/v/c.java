package c.f.a.d.v;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15245a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f15245a = i2 >= 21 ? 2 : i2 >= 18 ? 1 : 0;
    }
}

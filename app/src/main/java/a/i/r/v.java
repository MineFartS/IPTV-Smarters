package a.i.r;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2094a;

    public v(Object obj) {
        this.f2094a = obj;
    }

    public static v b(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? new v(PointerIcon.getSystemIcon(context, i2)) : new v(null);
    }

    public Object a() {
        return this.f2094a;
    }
}

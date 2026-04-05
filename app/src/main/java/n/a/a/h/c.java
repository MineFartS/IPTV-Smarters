package n.a.a.h;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import n.a.a.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f31232a;

    public c(T t) {
        this.f31232a = t;
    }

    public static c c(Activity activity) {
        return Build.VERSION.SDK_INT < 23 ? new b(activity) : new a(activity);
    }

    public abstract Context a();

    public T b() {
        return this.f31232a;
    }

    public boolean d(String str) {
        return !g(str);
    }

    public abstract void e(String str, int i2, int i3, int i4, String... strArr);

    public boolean f(String... strArr) {
        for (String str : strArr) {
            if (g(str)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean g(String str);

    public void h(FragmentManager fragmentManager, String str, int i2, int i3, int i4, String... strArr) {
        g.a(i2, i3, str, i4, strArr).show(fragmentManager, "RationaleDialogFragment");
    }

    public boolean i(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (d(it.next())) {
                return true;
            }
        }
        return false;
    }
}

package a.n.q;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f2983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f2984b;
    }

    public static Object a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        viewGroup.setLayoutMode(1);
        LayoutInflater.from(viewGroup.getContext()).inflate(a.n.h.f2642m, viewGroup, true);
        a aVar = new a();
        aVar.f2983a = viewGroup.findViewById(a.n.f.w);
        aVar.f2984b = viewGroup.findViewById(a.n.f.u);
        return aVar;
    }

    public static void b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            viewGroup.setLayoutMode(1);
        }
    }

    public static void c(Object obj, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            a aVar = (a) obj;
            aVar.f2983a.setAlpha(1.0f - f2);
            aVar.f2984b.setAlpha(f2);
        }
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 21;
    }
}

package a.n.q;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewOutlineProvider f2903a = new a();

    public static class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(1.0f);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f2904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2906c;
    }

    public static Object a(View view, float f2, float f3, int i2) {
        if (i2 > 0) {
            l0.a(view, true, i2);
        } else {
            view.setOutlineProvider(f2903a);
        }
        b bVar = new b();
        bVar.f2904a = view;
        bVar.f2905b = f2;
        bVar.f2906c = f3;
        view.setZ(f2);
        return bVar;
    }

    public static void b(Object obj, float f2) {
        b bVar = (b) obj;
        View view = bVar.f2904a;
        float f3 = bVar.f2905b;
        view.setZ(f3 + (f2 * (bVar.f2906c - f3)));
    }
}

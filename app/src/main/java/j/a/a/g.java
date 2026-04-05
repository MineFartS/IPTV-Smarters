package j.a.a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30451a;

    public interface b {
        void a(ViewGroup viewGroup, View view, Rect rect);
    }

    public static class c implements b {
        public c() {
        }

        @Override // j.a.a.g.b
        public void a(ViewGroup viewGroup, View view, Rect rect) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
        }
    }

    public static class d implements b {
        public d() {
        }

        @Override // j.a.a.g.b
        public void a(ViewGroup viewGroup, View view, Rect rect) {
            h.b(viewGroup, view, rect);
        }
    }

    static {
        f30451a = Build.VERSION.SDK_INT >= 11 ? new d() : new c();
    }

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        b(viewGroup, view, rect);
    }

    public static void b(ViewGroup viewGroup, View view, Rect rect) {
        f30451a.a(viewGroup, view, rect);
    }
}

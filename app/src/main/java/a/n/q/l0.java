package a.n.q;

import android.graphics.Outline;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray<ViewOutlineProvider> f2851a;

    public static final class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2852a;

        public a(int i2) {
            this.f2852a = i2;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f2852a);
            outline.setAlpha(1.0f);
        }
    }

    public static void a(View view, boolean z, int i2) {
        if (z) {
            if (f2851a == null) {
                f2851a = new SparseArray<>();
            }
            ViewOutlineProvider aVar = f2851a.get(i2);
            if (aVar == null) {
                aVar = new a(i2);
                if (f2851a.size() < 32) {
                    f2851a.put(i2, aVar);
                }
            }
            view.setOutlineProvider(aVar);
        } else {
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        view.setClipToOutline(z);
    }
}

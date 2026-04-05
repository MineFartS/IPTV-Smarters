package c.k.b;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f18699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<ImageView> f18700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f18701d;

    public h(x xVar, ImageView imageView, e eVar) {
        this.f18699b = xVar;
        this.f18700c = new WeakReference<>(imageView);
        this.f18701d = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void a() {
        this.f18701d = null;
        ImageView imageView = this.f18700c.get();
        if (imageView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f18700c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f18699b.l().k(width, height).h(imageView, this.f18701d);
        }
        return true;
    }
}

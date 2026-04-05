package a.b0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
public class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f1003a;

    public v(ViewGroup viewGroup) {
        this.f1003a = viewGroup.getOverlay();
    }

    @Override // a.b0.b0
    public void a(Drawable drawable) {
        this.f1003a.add(drawable);
    }

    @Override // a.b0.b0
    public void b(Drawable drawable) {
        this.f1003a.remove(drawable);
    }

    @Override // a.b0.w
    public void c(View view) {
        this.f1003a.add(view);
    }

    @Override // a.b0.w
    public void d(View view) {
        this.f1003a.remove(view);
    }
}

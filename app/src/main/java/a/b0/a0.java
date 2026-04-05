package a.b0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f869a;

    public a0(View view) {
        this.f869a = view.getOverlay();
    }

    @Override // a.b0.b0
    public void a(Drawable drawable) {
        this.f869a.add(drawable);
    }

    @Override // a.b0.b0
    public void b(Drawable drawable) {
        this.f869a.remove(drawable);
    }
}

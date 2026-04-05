package a.v.y;

import a.b0.o;
import a.v.k;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference<Toolbar> f3699f;

    public e(Toolbar toolbar, b bVar) {
        super(toolbar.getContext(), bVar);
        this.f3699f = new WeakReference<>(toolbar);
    }

    @Override // a.v.y.a, androidx.navigation.NavController.b
    public void a(NavController navController, k kVar, Bundle bundle) {
        if (this.f3699f.get() == null) {
            navController.x(this);
        } else {
            super.a(navController, kVar, bundle);
        }
    }

    @Override // a.v.y.a
    public void c(Drawable drawable, int i2) {
        Toolbar toolbar = this.f3699f.get();
        if (toolbar != null) {
            boolean z = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i2);
            if (z) {
                o.a(toolbar);
            }
        }
    }

    @Override // a.v.y.a
    public void d(CharSequence charSequence) {
        this.f3699f.get().setTitle(charSequence);
    }
}

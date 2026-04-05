package a.b.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f760b;

    public t0(Context context, Resources resources) {
        super(resources);
        this.f760b = new WeakReference<>(context);
    }

    @Override // a.b.q.l0, android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f760b.get();
        if (drawable != null && context != null) {
            k0.h().x(context, i2, drawable);
        }
        return drawable;
    }
}

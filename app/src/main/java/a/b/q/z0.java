package a.b.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class z0 extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f867a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f868b;

    public z0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f868b = new WeakReference<>(context);
    }

    public static boolean a() {
        return f867a;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    public final Drawable c(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.f868b.get();
        return context != null ? k0.h().t(context, this, i2) : super.getDrawable(i2);
    }
}

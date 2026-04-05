package a.b.q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f745a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList<WeakReference<r0>> f746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Resources.Theme f748d;

    public r0(Context context) {
        super(context);
        if (!z0.b()) {
            this.f747c = new t0(this, context.getResources());
            this.f748d = null;
            return;
        }
        z0 z0Var = new z0(this, context.getResources());
        this.f747c = z0Var;
        Resources.Theme themeNewTheme = z0Var.newTheme();
        this.f748d = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        if ((context instanceof r0) || (context.getResources() instanceof t0) || (context.getResources() instanceof z0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || z0.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f745a) {
            ArrayList<WeakReference<r0>> arrayList = f746b;
            if (arrayList == null) {
                f746b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<r0> weakReference = f746b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f746b.remove(size);
                    }
                }
                for (int size2 = f746b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<r0> weakReference2 = f746b.get(size2);
                    r0 r0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (r0Var != null && r0Var.getBaseContext() == context) {
                        return r0Var;
                    }
                }
            }
            r0 r0Var2 = new r0(context);
            f746b.add(new WeakReference<>(r0Var2));
            return r0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f747c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f747c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f748d;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f748d;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}

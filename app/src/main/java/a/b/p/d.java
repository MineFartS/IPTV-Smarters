package a.b.p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f347e;

    public d() {
        super(null);
    }

    public d(Context context, int i2) {
        super(context);
        this.f343a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f344b = theme;
    }

    public void a(Configuration configuration) {
        if (this.f347e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f346d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f346d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        Resources resources;
        if (this.f347e == null) {
            Configuration configuration = this.f346d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f346d);
                this.f347e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f347e = resources;
        }
        return this.f347e;
    }

    public int c() {
        return this.f343a;
    }

    public final void d() {
        boolean z = this.f344b == null;
        if (z) {
            this.f344b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f344b.setTo(theme);
            }
        }
        e(this.f344b, this.f343a, z);
    }

    public void e(Resources.Theme theme, int i2, boolean z) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f345c == null) {
            this.f345c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f345c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f344b;
        if (theme != null) {
            return theme;
        }
        if (this.f343a == 0) {
            this.f343a = a.b.i.f119e;
        }
        d();
        return this.f344b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f343a != i2) {
            this.f343a = i2;
            d();
        }
    }
}

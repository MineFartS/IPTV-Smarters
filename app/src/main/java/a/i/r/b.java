package a.i.r;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f1967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0041b f1968c;

    public interface a {
    }

    /* JADX INFO: renamed from: a.i.r.b$b, reason: collision with other inner class name */
    public interface InterfaceC0041b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
        this.f1966a = context;
    }

    public Context a() {
        return this.f1966a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f1968c == null || !h()) {
            return;
        }
        this.f1968c.onActionProviderVisibilityChanged(c());
    }

    public void j() {
        this.f1968c = null;
        this.f1967b = null;
    }

    public void k(a aVar) {
        this.f1967b = aVar;
    }

    public void l(InterfaceC0041b interfaceC0041b) {
        if (this.f1968c != null && interfaceC0041b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1968c = interfaceC0041b;
    }
}

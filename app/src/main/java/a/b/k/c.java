package a.b.k;

import a.b.p.b;
import a.b.q.z0;
import a.i.h.p;
import a.p.a0;
import a.p.z;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public class c extends a.l.d.e implements d, p.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Resources f140c;

    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.m0().u(bundle);
            return bundle;
        }
    }

    public class b implements a.a.d.b {
        public b() {
        }

        @Override // a.a.d.b
        public void a(Context context) {
            e eVarM0 = c.this.m0();
            eVarM0.n();
            eVarM0.q(c.this.getSavedStateRegistry().a("androidx:appcompat"));
        }
    }

    public c() {
        o0();
    }

    @Override // a.i.h.p.a
    public Intent B() {
        return a.i.h.h.a(this);
    }

    @Override // a.b.k.d
    public a.b.p.b N(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        m0().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m0().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a.b.k.a aVarN0 = n0();
        if (getWindow().hasFeature(0)) {
            if (aVarN0 == null || !aVarN0.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a.b.k.a aVarN0 = n0();
        if (keyCode == 82 && aVarN0 != null && aVarN0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) m0().i(i2);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m0().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f140c == null && z0.b()) {
            this.f140c = new z0(this, super.getResources());
        }
        Resources resources = this.f140c;
        return resources == null ? super.getResources() : resources;
    }

    public final void initViewTreeOwners() {
        z.a(getWindow().getDecorView(), this);
        a0.a(getWindow().getDecorView(), this);
        a.z.d.a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m0().o();
    }

    @Override // a.b.k.d
    public void j(a.b.p.b bVar) {
    }

    public e m0() {
        if (this.f139b == null) {
            this.f139b = e.g(this, this);
        }
        return this.f139b;
    }

    public a.b.k.a n0() {
        return m0().m();
    }

    @Override // a.b.k.d
    public void o(a.b.p.b bVar) {
    }

    public final void o0() {
        getSavedStateRegistry().d("androidx:appcompat", new a());
        addOnContextAvailableListener(new b());
    }

    @Override // a.l.d.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f140c != null) {
            this.f140c.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m0().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        s0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m0().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (u0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // a.l.d.e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a.b.k.a aVarN0 = n0();
        if (menuItem.getItemId() != 16908332 || aVarN0 == null || (aVarN0.j() & 4) == 0) {
            return false;
        }
        return t0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // a.l.d.e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m0().s(bundle);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m0().t();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onStart() {
        super.onStart();
        m0().v();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        m0().w();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        m0().F(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a.b.k.a aVarN0 = n0();
        if (getWindow().hasFeature(0)) {
            if (aVarN0 == null || !aVarN0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    public void p0(p pVar) {
        pVar.d(this);
    }

    public void q0(int i2) {
    }

    public void r0(p pVar) {
    }

    @Deprecated
    public void s0() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        initViewTreeOwners();
        m0().A(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        m0().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        m0().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        m0().E(i2);
    }

    @Override // a.l.d.e
    public void supportInvalidateOptionsMenu() {
        m0().o();
    }

    public boolean t0() {
        Intent intentB = B();
        if (intentB == null) {
            return false;
        }
        if (!x0(intentB)) {
            w0(intentB);
            return true;
        }
        p pVarF = p.f(this);
        p0(pVarF);
        r0(pVarF);
        pVarF.v();
        try {
            a.i.h.a.l(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean u0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void v0(Toolbar toolbar) {
        m0().D(toolbar);
    }

    public void w0(Intent intent) {
        a.i.h.h.e(this, intent);
    }

    public boolean x0(Intent intent) {
        return a.i.h.h.f(this, intent);
    }
}

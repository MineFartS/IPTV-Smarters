package a.b.p;

import a.b.p.b;
import a.b.p.j.g;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.a f350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference<View> f351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a.b.p.j.g f354j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f348d = context;
        this.f349e = actionBarContextView;
        this.f350f = aVar;
        a.b.p.j.g gVarS = new a.b.p.j.g(actionBarContextView.getContext()).S(1);
        this.f354j = gVarS;
        gVarS.R(this);
        this.f353i = z;
    }

    @Override // a.b.p.j.g.a
    public boolean a(a.b.p.j.g gVar, MenuItem menuItem) {
        return this.f350f.d(this, menuItem);
    }

    @Override // a.b.p.j.g.a
    public void b(a.b.p.j.g gVar) {
        k();
        this.f349e.l();
    }

    @Override // a.b.p.b
    public void c() {
        if (this.f352h) {
            return;
        }
        this.f352h = true;
        this.f349e.sendAccessibilityEvent(32);
        this.f350f.a(this);
    }

    @Override // a.b.p.b
    public View d() {
        WeakReference<View> weakReference = this.f351g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.b.p.b
    public Menu e() {
        return this.f354j;
    }

    @Override // a.b.p.b
    public MenuInflater f() {
        return new g(this.f349e.getContext());
    }

    @Override // a.b.p.b
    public CharSequence g() {
        return this.f349e.getSubtitle();
    }

    @Override // a.b.p.b
    public CharSequence i() {
        return this.f349e.getTitle();
    }

    @Override // a.b.p.b
    public void k() {
        this.f350f.c(this, this.f354j);
    }

    @Override // a.b.p.b
    public boolean l() {
        return this.f349e.j();
    }

    @Override // a.b.p.b
    public void m(View view) {
        this.f349e.setCustomView(view);
        this.f351g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // a.b.p.b
    public void n(int i2) {
        o(this.f348d.getString(i2));
    }

    @Override // a.b.p.b
    public void o(CharSequence charSequence) {
        this.f349e.setSubtitle(charSequence);
    }

    @Override // a.b.p.b
    public void q(int i2) {
        r(this.f348d.getString(i2));
    }

    @Override // a.b.p.b
    public void r(CharSequence charSequence) {
        this.f349e.setTitle(charSequence);
    }

    @Override // a.b.p.b
    public void s(boolean z) {
        super.s(z);
        this.f349e.setTitleOptional(z);
    }
}

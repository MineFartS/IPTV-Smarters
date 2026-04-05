package c.f.a.c.j.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f12863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f12864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f12866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f12868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Drawable f12870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f12871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12872k = false;

    public i0(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.f12863b = imageView;
        this.f12866e = drawable;
        this.f12868g = drawable2;
        this.f12870i = drawable3 != null ? drawable3 : drawable2;
        this.f12867f = context.getString(c.f.a.c.d.u.n.f11897n);
        this.f12869h = context.getString(c.f.a.c.d.u.n.f11896m);
        this.f12871j = context.getString(c.f.a.c.d.u.n.t);
        this.f12864c = view;
        this.f12865d = z;
        imageView.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        h();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void d() {
        i(true);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        h();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f12863b.setEnabled(false);
        super.f();
    }

    public final void g(Drawable drawable, String str) {
        boolean z = !drawable.equals(this.f12863b.getDrawable());
        this.f12863b.setImageDrawable(drawable);
        this.f12863b.setContentDescription(str);
        this.f12863b.setVisibility(0);
        this.f12863b.setEnabled(true);
        View view = this.f12864c;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z && this.f12872k) {
            this.f12863b.sendAccessibilityEvent(8);
        }
    }

    public final void h() {
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p()) {
            this.f12863b.setEnabled(false);
            return;
        }
        if (iVarB.t()) {
            g(this.f12866e, this.f12867f);
            return;
        }
        if (iVarB.u()) {
            if (iVarB.r()) {
                g(this.f12870i, this.f12871j);
                return;
            } else {
                g(this.f12868g, this.f12869h);
                return;
            }
        }
        if (iVarB.q()) {
            i(false);
        } else if (iVarB.s()) {
            i(true);
        }
    }

    @TargetApi(21)
    public final void i(boolean z) {
        if (c.f.a.c.f.t.l.g()) {
            this.f12872k = this.f12863b.isAccessibilityFocused();
        }
        View view = this.f12864c;
        if (view != null) {
            view.setVisibility(0);
            if (this.f12872k) {
                this.f12864c.sendAccessibilityEvent(8);
            }
        }
        this.f12863b.setVisibility(this.f12865d ? 4 : 0);
        this.f12863b.setEnabled(!z);
    }
}

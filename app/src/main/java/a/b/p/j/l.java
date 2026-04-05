package a.b.p.j;

import a.b.p.j.m;
import a.i.r.x;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m.a f518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f521l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f516g = 8388611;
        this.f521l = new a();
        this.f510a = context;
        this.f511b = gVar;
        this.f515f = view;
        this.f512c = z;
        this.f513d = i2;
        this.f514e = i3;
    }

    public final k a() {
        Display defaultDisplay = ((WindowManager) this.f510a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.f510a.getResources().getDimensionPixelSize(a.b.d.f43c) ? new d(this.f510a, this.f515f, this.f513d, this.f514e, this.f512c) : new q(this.f510a, this.f511b, this.f515f, this.f513d, this.f514e, this.f512c);
        dVar.k(this.f511b);
        dVar.t(this.f521l);
        dVar.o(this.f515f);
        dVar.g(this.f518i);
        dVar.q(this.f517h);
        dVar.r(this.f516g);
        return dVar;
    }

    public void b() {
        if (d()) {
            this.f519j.dismiss();
        }
    }

    public k c() {
        if (this.f519j == null) {
            this.f519j = a();
        }
        return this.f519j;
    }

    public boolean d() {
        k kVar = this.f519j;
        return kVar != null && kVar.a();
    }

    public void e() {
        this.f519j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f520k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f515f = view;
    }

    public void g(boolean z) {
        this.f517h = z;
        k kVar = this.f519j;
        if (kVar != null) {
            kVar.q(z);
        }
    }

    public void h(int i2) {
        this.f516g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f520k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f518i = aVar;
        k kVar = this.f519j;
        if (kVar != null) {
            kVar.g(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i2, int i3, boolean z, boolean z2) {
        k kVarC = c();
        kVarC.u(z2);
        if (z) {
            if ((a.i.r.f.b(this.f516g, x.C(this.f515f)) & 7) == 5) {
                i2 -= this.f515f.getWidth();
            }
            kVarC.s(i2);
            kVarC.v(i3);
            int i4 = (int) ((this.f510a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.p(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        kVarC.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f515f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f515f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}

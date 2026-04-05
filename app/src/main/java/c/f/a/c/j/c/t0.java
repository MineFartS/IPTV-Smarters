package c.f.a.c.j.c;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c.f.a.c.d.u.u.i;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends c.f.a.c.d.u.u.l.a implements i.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f13077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f13078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.c.d.u.u.l.c f13079d;

    public t0(View view, c.f.a.c.d.u.u.l.c cVar) {
        this.f13077b = (TextView) view.findViewById(c.f.a.c.d.u.l.H);
        ImageView imageView = (ImageView) view.findViewById(c.f.a.c.d.u.l.G);
        this.f13078c = imageView;
        this.f13079d = cVar;
        TypedArray typedArrayObtainStyledAttributes = imageView.getContext().obtainStyledAttributes(null, c.f.a.c.d.u.p.f11901a, c.f.a.c.d.u.i.f11838a, c.f.a.c.d.u.o.f11899a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.f.a.c.d.u.p.f11915o, 0);
        typedArrayObtainStyledAttributes.recycle();
        imageView.getDrawable().setColorFilter(imageView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        g();
    }

    @Override // c.f.a.c.d.u.u.i.e
    public final void a(long j2, long j3) {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        if (b() != null) {
            b().c(this, 1000L);
        }
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        if (b() != null) {
            b().P(this);
        }
        super.f();
        g();
    }

    public final void g() {
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p() || !iVarB.r()) {
            this.f13077b.setVisibility(8);
            this.f13078c.setVisibility(8);
        } else {
            boolean zU = !iVarB.w() ? iVarB.u() : this.f13079d.h();
            this.f13077b.setVisibility(0);
            this.f13078c.setVisibility(zU ? 0 : 8);
            nc.c(g7.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
        }
    }
}

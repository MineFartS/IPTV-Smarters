package a.e.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b implements e {
    @Override // a.e.f.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        dVar.c(new f(colorStateList, f2));
        View viewG = dVar.g();
        viewG.setClipToOutline(true);
        viewG.setElevation(f3);
        n(dVar, f4);
    }

    @Override // a.e.f.e
    public void b(d dVar, float f2) {
        o(dVar).h(f2);
    }

    @Override // a.e.f.e
    public float c(d dVar) {
        return dVar.g().getElevation();
    }

    @Override // a.e.f.e
    public float d(d dVar) {
        return o(dVar).d();
    }

    @Override // a.e.f.e
    public void e(d dVar) {
        n(dVar, g(dVar));
    }

    @Override // a.e.f.e
    public void f(d dVar, float f2) {
        dVar.g().setElevation(f2);
    }

    @Override // a.e.f.e
    public float g(d dVar) {
        return o(dVar).c();
    }

    @Override // a.e.f.e
    public ColorStateList h(d dVar) {
        return o(dVar).b();
    }

    @Override // a.e.f.e
    public void i() {
    }

    @Override // a.e.f.e
    public float j(d dVar) {
        return d(dVar) * 2.0f;
    }

    @Override // a.e.f.e
    public float k(d dVar) {
        return d(dVar) * 2.0f;
    }

    @Override // a.e.f.e
    public void l(d dVar) {
        n(dVar, g(dVar));
    }

    @Override // a.e.f.e
    public void m(d dVar, ColorStateList colorStateList) {
        o(dVar).f(colorStateList);
    }

    @Override // a.e.f.e
    public void n(d dVar, float f2) {
        o(dVar).g(f2, dVar.e(), dVar.d());
        p(dVar);
    }

    public final f o(d dVar) {
        return (f) dVar.f();
    }

    public void p(d dVar) {
        if (!dVar.e()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float fG = g(dVar);
        float fD = d(dVar);
        int iCeil = (int) Math.ceil(g.c(fG, fD, dVar.d()));
        int iCeil2 = (int) Math.ceil(g.d(fG, fD, dVar.d()));
        dVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}

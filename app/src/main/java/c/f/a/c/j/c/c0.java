package c.f.a.c.j.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f12775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.d.u.u.b f12776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f12777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f12778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.c.d.u.u.c f12779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.c.d.u.u.k.b f12780g;

    public c0(ImageView imageView, Context context, c.f.a.c.d.u.u.b bVar, int i2, View view) {
        c.f.a.c.d.u.u.a aVarI;
        this.f12775b = imageView;
        this.f12776c = bVar;
        c.f.a.c.d.u.u.c cVarJ = null;
        this.f12777d = i2 != 0 ? BitmapFactory.decodeResource(context.getResources(), i2) : null;
        this.f12778e = view;
        c.f.a.c.d.u.b bVarH = c.f.a.c.d.u.b.h(context);
        if (bVarH != null && (aVarI = bVarH.a().I()) != null) {
            cVarJ = aVarI.J();
        }
        this.f12779f = cVarJ;
        this.f12780g = new c.f.a.c.d.u.u.k.b(context.getApplicationContext());
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        i();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        this.f12780g.d(new e0(this));
        j();
        i();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f12780g.b();
        j();
        super.f();
    }

    public final void i() {
        Uri uriA;
        c.f.a.c.f.p.a aVarB;
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p()) {
            j();
            return;
        }
        MediaInfo mediaInfoJ = iVarB.j();
        if (mediaInfoJ == null) {
            uriA = null;
        } else {
            c.f.a.c.d.u.u.c cVar = this.f12779f;
            uriA = (cVar == null || (aVarB = cVar.b(mediaInfoJ.P(), this.f12776c)) == null || aVarB.J() == null) ? c.f.a.c.d.u.u.e.a(mediaInfoJ, 0) : aVarB.J();
        }
        if (uriA == null) {
            j();
        } else {
            this.f12780g.e(uriA);
        }
    }

    public final void j() {
        View view = this.f12778e;
        if (view != null) {
            view.setVisibility(0);
            this.f12775b.setVisibility(4);
        }
        Bitmap bitmap = this.f12777d;
        if (bitmap != null) {
            this.f12775b.setImageBitmap(bitmap);
        }
    }
}

package c.d.a.r.h;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class d extends e<c.d.a.n.k.f.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.d.a.n.k.f.b f5930g;

    public d(ImageView imageView) {
        this(imageView, -1);
    }

    public d(ImageView imageView, int i2) {
        super(imageView);
        this.f5929f = i2;
    }

    @Override // c.d.a.r.h.e, c.d.a.r.h.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(c.d.a.n.k.f.b bVar, c.d.a.r.g.c<? super c.d.a.n.k.f.b> cVar) {
        if (!bVar.b()) {
            float intrinsicWidth = bVar.getIntrinsicWidth() / bVar.getIntrinsicHeight();
            if (Math.abs((((ImageView) this.f5940d).getWidth() / ((ImageView) this.f5940d).getHeight()) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                bVar = new i(bVar, ((ImageView) this.f5940d).getWidth());
            }
        }
        super.b(bVar, cVar);
        this.f5930g = bVar;
        bVar.c(this.f5929f);
        bVar.start();
    }

    @Override // c.d.a.r.h.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void l(c.d.a.n.k.f.b bVar) {
        ((ImageView) this.f5940d).setImageDrawable(bVar);
    }

    @Override // c.d.a.r.h.a, c.d.a.o.h
    public void onStart() {
        c.d.a.n.k.f.b bVar = this.f5930g;
        if (bVar != null) {
            bVar.start();
        }
    }

    @Override // c.d.a.r.h.a, c.d.a.o.h
    public void onStop() {
        c.d.a.n.k.f.b bVar = this.f5930g;
        if (bVar != null) {
            bVar.stop();
        }
    }
}

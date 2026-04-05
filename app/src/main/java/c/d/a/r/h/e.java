package c.d.a.r.h;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c.d.a.r.g.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<Z> extends k<ImageView, Z> implements c.a {
    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // c.d.a.r.h.j
    public void b(Z z, c.d.a.r.g.c<? super Z> cVar) {
        if (cVar == null || !cVar.a(z, this)) {
            l(z);
        }
    }

    @Override // c.d.a.r.g.c.a
    public void c(Drawable drawable) {
        ((ImageView) this.f5940d).setImageDrawable(drawable);
    }

    @Override // c.d.a.r.h.a, c.d.a.r.h.j
    public void d(Exception exc, Drawable drawable) {
        ((ImageView) this.f5940d).setImageDrawable(drawable);
    }

    @Override // c.d.a.r.g.c.a
    public Drawable e() {
        return ((ImageView) this.f5940d).getDrawable();
    }

    @Override // c.d.a.r.h.a, c.d.a.r.h.j
    public void f(Drawable drawable) {
        ((ImageView) this.f5940d).setImageDrawable(drawable);
    }

    @Override // c.d.a.r.h.a, c.d.a.r.h.j
    public void h(Drawable drawable) {
        ((ImageView) this.f5940d).setImageDrawable(drawable);
    }

    public abstract void l(Z z);
}

package c.k.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c.k.b.t;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends a<c0> {
    public d0(t tVar, c0 c0Var, w wVar, int i2, int i3, Drawable drawable, String str, Object obj, int i4) {
        super(tVar, c0Var, wVar, i2, i3, i4, drawable, str, obj, false);
    }

    @Override // c.k.b.a
    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        c0 c0VarK = k();
        if (c0VarK != null) {
            c0VarK.c(bitmap, eVar);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // c.k.b.a
    public void c() {
        c0 c0VarK = k();
        if (c0VarK != null) {
            c0VarK.a(this.f18631g != 0 ? this.f18625a.f18750g.getResources().getDrawable(this.f18631g) : this.f18632h);
        }
    }
}

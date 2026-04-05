package c.k.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c.k.b.t;

/* JADX INFO: loaded from: classes2.dex */
public class l extends a<ImageView> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f18727m;

    public l(t tVar, ImageView imageView, w wVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, e eVar, boolean z) {
        super(tVar, imageView, wVar, i2, i3, i4, drawable, str, obj, z);
        this.f18727m = eVar;
    }

    @Override // c.k.b.a
    public void a() {
        super.a();
        if (this.f18727m != null) {
            this.f18727m = null;
        }
    }

    @Override // c.k.b.a
    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f18627c.get();
        if (imageView == null) {
            return;
        }
        t tVar = this.f18625a;
        u.c(imageView, tVar.f18750g, bitmap, eVar, this.f18628d, tVar.f18758o);
        e eVar2 = this.f18727m;
        if (eVar2 != null) {
            eVar2.onSuccess();
        }
    }

    @Override // c.k.b.a
    public void c() {
        ImageView imageView = (ImageView) this.f18627c.get();
        if (imageView == null) {
            return;
        }
        int i2 = this.f18631g;
        if (i2 != 0) {
            imageView.setImageResource(i2);
        } else {
            Drawable drawable = this.f18632h;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        e eVar = this.f18727m;
        if (eVar != null) {
            eVar.a();
        }
    }
}

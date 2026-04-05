package c.f.a.c.j.c;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements c.f.a.c.d.u.u.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f12794a;

    public e0(c0 c0Var) {
        this.f12794a = c0Var;
    }

    @Override // c.f.a.c.d.u.u.k.a
    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.f12794a.f12778e != null) {
                this.f12794a.f12778e.setVisibility(4);
            }
            this.f12794a.f12775b.setVisibility(0);
            this.f12794a.f12775b.setImageBitmap(bitmap);
        }
    }
}

package c.f.a.c.d.u.u.m;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements c.f.a.c.d.u.u.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f12103a;

    public d(a aVar) {
        this.f12103a = aVar;
    }

    @Override // c.f.a.c.d.u.u.k.a
    @TargetApi(23)
    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.f12103a.H != null) {
                this.f12103a.H.setVisibility(8);
            }
            if (this.f12103a.G != null) {
                this.f12103a.G.setVisibility(0);
                this.f12103a.G.setImageBitmap(bitmap);
            }
        }
    }
}

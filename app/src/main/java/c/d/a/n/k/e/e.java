package c.d.a.n.k.e;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {
    public e(c.d.a.n.i.n.c cVar) {
        super(cVar);
    }

    @Override // c.d.a.n.k.e.d
    public Bitmap b(c.d.a.n.i.n.c cVar, Bitmap bitmap, int i2, int i3) {
        Bitmap bitmapB = cVar.b(i2, i3, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Bitmap bitmapA = r.a(bitmapB, bitmap, i2, i3);
        if (bitmapB != null && bitmapB != bitmapA && !cVar.a(bitmapB)) {
            bitmapB.recycle();
        }
        return bitmapA;
    }

    @Override // c.d.a.n.g
    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}

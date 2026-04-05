package c.c.b.w;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import c.c.b.m;
import c.c.b.n;
import c.c.b.p;
import c.c.b.v;

/* JADX INFO: loaded from: classes.dex */
public class j extends n<Bitmap> {
    public static final Object q = new Object();
    public final Object r;
    public p.b<Bitmap> s;
    public final Bitmap.Config t;
    public final int u;
    public final int v;
    public final ImageView.ScaleType w;

    public j(String str, p.b<Bitmap> bVar, int i2, int i3, ImageView.ScaleType scaleType, Bitmap.Config config, p.a aVar) {
        super(0, str, aVar);
        this.r = new Object();
        S(new c.c.b.e(1000, 2, 2.0f));
        this.s = bVar;
        this.t = config;
        this.u = i2;
        this.v = i3;
        this.w = scaleType;
    }

    public static int Y(int i2, int i3, int i4, int i5) {
        double d2 = i2;
        double d3 = i4;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = i3;
        double d5 = i5;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double dMin = Math.min(d2 / d3, d4 / d5);
        float f2 = 1.0f;
        while (true) {
            float f3 = 2.0f * f2;
            if (f3 > dMin) {
                return (int) f2;
            }
            f2 = f3;
        }
    }

    public static int Z(int i2, int i3, int i4, int i5, ImageView.ScaleType scaleType) {
        if (i2 == 0 && i3 == 0) {
            return i4;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i2 == 0 ? i4 : i2;
        }
        if (i2 == 0) {
            double d2 = i3;
            double d3 = i5;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = i4;
            Double.isNaN(d4);
            return (int) (d4 * (d2 / d3));
        }
        if (i3 == 0) {
            return i2;
        }
        double d5 = i5;
        double d6 = i4;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d8 = i2;
            Double.isNaN(d8);
            double d9 = i3;
            if (d8 * d7 >= d9) {
                return i2;
            }
            Double.isNaN(d9);
            return (int) (d9 / d7);
        }
        double d10 = i2;
        Double.isNaN(d10);
        double d11 = i3;
        if (d10 * d7 <= d11) {
            return i2;
        }
        Double.isNaN(d11);
        return (int) (d11 / d7);
    }

    @Override // c.c.b.n
    public n.c D() {
        return n.c.LOW;
    }

    @Override // c.c.b.n
    public p<Bitmap> O(c.c.b.k kVar) {
        p<Bitmap> pVarX;
        synchronized (q) {
            try {
                try {
                    pVarX = X(kVar);
                } catch (OutOfMemoryError e2) {
                    v.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(kVar.f5220b.length), H());
                    return p.a(new m(e2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVarX;
    }

    @Override // c.c.b.n
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void o(Bitmap bitmap) {
        p.b<Bitmap> bVar;
        synchronized (this.r) {
            bVar = this.s;
        }
        if (bVar != null) {
            bVar.a(bitmap);
        }
    }

    public final p<Bitmap> X(c.c.b.k kVar) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = kVar.f5220b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.u == 0 && this.v == 0) {
            options.inPreferredConfig = this.t;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            int iZ = Z(this.u, this.v, i2, i3, this.w);
            int iZ2 = Z(this.v, this.u, i3, i2, this.w);
            options.inJustDecodeBounds = false;
            options.inSampleSize = Y(i2, i3, iZ, iZ2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iZ || bitmapDecodeByteArray.getHeight() > iZ2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iZ, iZ2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? p.a(new m(kVar)) : p.c(bitmapDecodeByteArray, e.c(kVar));
    }

    @Override // c.c.b.n
    public void d() {
        super.d();
        synchronized (this.r) {
            this.s = null;
        }
    }
}

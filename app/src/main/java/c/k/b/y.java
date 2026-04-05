package c.k.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import c.k.b.t;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t.e f18826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f18827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InputStream f18828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18829d;

        public a(Bitmap bitmap, t.e eVar) {
            this((Bitmap) g0.d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public a(Bitmap bitmap, InputStream inputStream, t.e eVar, int i2) {
            if (!((inputStream != null) ^ (bitmap != null))) {
                throw new AssertionError();
            }
            this.f18827b = bitmap;
            this.f18828c = inputStream;
            this.f18826a = (t.e) g0.d(eVar, "loadedFrom == null");
            this.f18829d = i2;
        }

        public a(InputStream inputStream, t.e eVar) {
            this(null, (InputStream) g0.d(inputStream, "stream == null"), eVar, 0);
        }

        public Bitmap a() {
            return this.f18827b;
        }

        public int b() {
            return this.f18829d;
        }

        public t.e c() {
            return this.f18826a;
        }

        public InputStream d() {
            return this.f18828c;
        }
    }

    public static void a(int i2, int i3, int i4, int i5, BitmapFactory.Options options, w wVar) {
        int iMax;
        double d2;
        if (i5 > i3 || i4 > i2) {
            if (i3 == 0) {
                d2 = i4 / i2;
            } else if (i2 == 0) {
                d2 = i5 / i3;
            } else {
                int iFloor = (int) Math.floor(i5 / i3);
                int iFloor2 = (int) Math.floor(i4 / i2);
                iMax = wVar.f18794l ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) Math.floor(d2);
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i2, int i3, BitmapFactory.Options options, w wVar) {
        a(i2, i3, options.outWidth, options.outHeight, options, wVar);
    }

    public static BitmapFactory.Options d(w wVar) {
        boolean zC = wVar.c();
        boolean z = wVar.r != null;
        BitmapFactory.Options options = null;
        if (zC || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = zC;
            if (z) {
                options.inPreferredConfig = wVar.r;
            }
        }
        return options;
    }

    public static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(w wVar);

    public int e() {
        return 0;
    }

    public abstract a f(w wVar, int i2);

    public boolean h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    public boolean i() {
        return false;
    }
}

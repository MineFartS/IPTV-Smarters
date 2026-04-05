package c.d.a.n.i.n;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f implements c.d.a.n.i.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f5607a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f5608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Bitmap.Config> f5609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f5611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5617k;

    public interface b {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static class c implements b {
        public c() {
        }

        @Override // c.d.a.n.i.n.f.b
        public void a(Bitmap bitmap) {
        }

        @Override // c.d.a.n.i.n.f.b
        public void b(Bitmap bitmap) {
        }
    }

    public f(int i2) {
        this(i2, j(), i());
    }

    public f(int i2, g gVar, Set<Bitmap.Config> set) {
        this.f5610d = i2;
        this.f5612f = i2;
        this.f5608b = gVar;
        this.f5609c = set;
        this.f5611e = new c();
    }

    public static Set<Bitmap.Config> i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static g j() {
        return Build.VERSION.SDK_INT >= 19 ? new i() : new c.d.a.n.i.n.a();
    }

    @Override // c.d.a.n.i.n.c
    public synchronized boolean a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bitmap.isMutable() && this.f5608b.d(bitmap) <= this.f5612f && this.f5609c.contains(bitmap.getConfig())) {
            int iD = this.f5608b.d(bitmap);
            this.f5608b.a(bitmap);
            this.f5611e.b(bitmap);
            this.f5616j++;
            this.f5613g += iD;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f5608b.e(bitmap));
            }
            f();
            h();
            return true;
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f5608b.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f5609c.contains(bitmap.getConfig()));
        }
        return false;
    }

    @Override // c.d.a.n.i.n.c
    public synchronized Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapE;
        bitmapE = e(i2, i3, config);
        if (bitmapE != null) {
            bitmapE.eraseColor(0);
        }
        return bitmapE;
    }

    @Override // c.d.a.n.i.n.c
    @SuppressLint({"InlinedApi"})
    public void c(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 60) {
            d();
        } else if (i2 >= 40) {
            k(this.f5612f / 2);
        }
    }

    @Override // c.d.a.n.i.n.c
    public void d() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        k(0);
    }

    @Override // c.d.a.n.i.n.c
    @TargetApi(12)
    public synchronized Bitmap e(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapB;
        bitmapB = this.f5608b.b(i2, i3, config != null ? config : f5607a);
        if (bitmapB == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f5608b.c(i2, i3, config));
            }
            this.f5615i++;
        } else {
            this.f5614h++;
            this.f5613g -= this.f5608b.d(bitmapB);
            this.f5611e.a(bitmapB);
            if (Build.VERSION.SDK_INT >= 12) {
                bitmapB.setHasAlpha(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f5608b.c(i2, i3, config));
        }
        f();
        return bitmapB;
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        Log.v("LruBitmapPool", "Hits=" + this.f5614h + ", misses=" + this.f5615i + ", puts=" + this.f5616j + ", evictions=" + this.f5617k + ", currentSize=" + this.f5613g + ", maxSize=" + this.f5612f + "\nStrategy=" + this.f5608b);
    }

    public final void h() {
        k(this.f5612f);
    }

    public final synchronized void k(int i2) {
        while (this.f5613g > i2) {
            Bitmap bitmapRemoveLast = this.f5608b.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f5613g = 0;
                return;
            }
            this.f5611e.a(bitmapRemoveLast);
            this.f5613g -= this.f5608b.d(bitmapRemoveLast);
            bitmapRemoveLast.recycle();
            this.f5617k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f5608b.e(bitmapRemoveLast));
            }
            f();
        }
    }
}

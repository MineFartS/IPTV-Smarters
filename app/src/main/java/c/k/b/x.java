package c.k.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import c.k.b.t;
import c.k.b.w;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f18813a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f18814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w.b f18815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18818f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f18823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f18824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f18825m;

    public x(t tVar, Uri uri, int i2) {
        if (tVar.q) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f18814b = tVar;
        this.f18815c = new w.b(uri, i2, tVar.f18757n);
    }

    public x a() {
        this.f18815c.b();
        return this;
    }

    public x b() {
        this.f18815c.c();
        return this;
    }

    public final w c(long j2) {
        int andIncrement = f18813a.getAndIncrement();
        w wVarA = this.f18815c.a();
        wVarA.f18784b = andIncrement;
        wVarA.f18785c = j2;
        boolean z = this.f18814b.p;
        if (z) {
            g0.v("Main", "created", wVarA.g(), wVarA.toString());
        }
        w wVarP = this.f18814b.p(wVarA);
        if (wVarP != wVarA) {
            wVarP.f18784b = andIncrement;
            wVarP.f18785c = j2;
            if (z) {
                g0.v("Main", "changed", wVarP.d(), "into " + wVarP);
            }
        }
        return wVarP;
    }

    public x d(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.f18824l != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f18820h = i2;
        return this;
    }

    public x e() {
        this.f18817e = true;
        return this;
    }

    public final Drawable f() {
        return this.f18819g != 0 ? this.f18814b.f18750g.getResources().getDrawable(this.f18819g) : this.f18823k;
    }

    public void g(ImageView imageView) {
        h(imageView, null);
    }

    public void h(ImageView imageView, e eVar) {
        Bitmap bitmapM;
        long jNanoTime = System.nanoTime();
        g0.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f18815c.d()) {
            this.f18814b.c(imageView);
            if (this.f18818f) {
                u.d(imageView, f());
                return;
            }
            return;
        }
        if (this.f18817e) {
            if (this.f18815c.e()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f18818f) {
                    u.d(imageView, f());
                }
                this.f18814b.f(imageView, new h(this, imageView, eVar));
                return;
            }
            this.f18815c.f(width, height);
        }
        w wVarC = c(jNanoTime);
        String strH = g0.h(wVarC);
        if (!p.shouldReadFromMemoryCache(this.f18821i) || (bitmapM = this.f18814b.m(strH)) == null) {
            if (this.f18818f) {
                u.d(imageView, f());
            }
            this.f18814b.h(new l(this.f18814b, imageView, wVarC, this.f18821i, this.f18822j, this.f18820h, this.f18824l, strH, this.f18825m, eVar, this.f18816d));
            return;
        }
        this.f18814b.c(imageView);
        t tVar = this.f18814b;
        Context context = tVar.f18750g;
        t.e eVar2 = t.e.MEMORY;
        u.c(imageView, context, bitmapM, eVar2, this.f18816d, tVar.f18758o);
        if (this.f18814b.p) {
            g0.v("Main", "completed", wVarC.g(), "from " + eVar2);
        }
        if (eVar != null) {
            eVar.onSuccess();
        }
    }

    public void i(c0 c0Var) {
        Bitmap bitmapM;
        long jNanoTime = System.nanoTime();
        g0.c();
        if (c0Var == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.f18817e) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.f18815c.d()) {
            this.f18814b.d(c0Var);
            c0Var.b(this.f18818f ? f() : null);
            return;
        }
        w wVarC = c(jNanoTime);
        String strH = g0.h(wVarC);
        if (!p.shouldReadFromMemoryCache(this.f18821i) || (bitmapM = this.f18814b.m(strH)) == null) {
            c0Var.b(this.f18818f ? f() : null);
            this.f18814b.h(new d0(this.f18814b, c0Var, wVarC, this.f18821i, this.f18822j, this.f18824l, strH, this.f18825m, this.f18820h));
        } else {
            this.f18814b.d(c0Var);
            c0Var.c(bitmapM, t.e.MEMORY);
        }
    }

    public x j(int i2) {
        if (!this.f18818f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.f18823k != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f18819g = i2;
        return this;
    }

    public x k(int i2, int i3) {
        this.f18815c.f(i2, i3);
        return this;
    }

    public x l() {
        this.f18817e = false;
        return this;
    }
}

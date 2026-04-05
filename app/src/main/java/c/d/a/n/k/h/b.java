package c.d.a.n.k.h;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import c.d.a.l.a;
import c.d.a.n.k.h.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends c.d.a.n.k.f.b implements f.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f5773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f5774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f5775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.l.a f5776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f5777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5784m;

    public static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.d.a.l.c f5785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f5786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f5787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.d.a.n.g<Bitmap> f5788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a.InterfaceC0100a f5791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.d.a.n.i.n.c f5792h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Bitmap f5793i;

        public a(c.d.a.l.c cVar, byte[] bArr, Context context, c.d.a.n.g<Bitmap> gVar, int i2, int i3, a.InterfaceC0100a interfaceC0100a, c.d.a.n.i.n.c cVar2, Bitmap bitmap) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.f5785a = cVar;
            this.f5786b = bArr;
            this.f5792h = cVar2;
            this.f5793i = bitmap;
            this.f5787c = context.getApplicationContext();
            this.f5788d = gVar;
            this.f5789e = i2;
            this.f5790f = i3;
            this.f5791g = interfaceC0100a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new b(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public b(Context context, a.InterfaceC0100a interfaceC0100a, c.d.a.n.i.n.c cVar, c.d.a.n.g<Bitmap> gVar, int i2, int i3, c.d.a.l.c cVar2, byte[] bArr, Bitmap bitmap) {
        this(new a(cVar2, bArr, context, gVar, i2, i3, interfaceC0100a, cVar, bitmap));
    }

    public b(a aVar) {
        this.f5774c = new Rect();
        this.f5781j = true;
        this.f5783l = -1;
        if (aVar == null) {
            throw new NullPointerException("GifState must not be null");
        }
        this.f5775d = aVar;
        c.d.a.l.a aVar2 = new c.d.a.l.a(aVar.f5791g);
        this.f5776e = aVar2;
        this.f5773b = new Paint();
        aVar2.n(aVar.f5785a, aVar.f5786b);
        f fVar = new f(aVar.f5787c, this, aVar2, aVar.f5789e, aVar.f5790f);
        this.f5777f = fVar;
        fVar.f(aVar.f5788d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(b bVar, Bitmap bitmap, c.d.a.n.g<Bitmap> gVar) {
        a aVar = bVar.f5775d;
        this(new a(aVar.f5785a, aVar.f5786b, aVar.f5787c, gVar, aVar.f5789e, aVar.f5790f, aVar.f5791g, aVar.f5792h, bitmap));
    }

    @Override // c.d.a.n.k.h.f.c
    @TargetApi(11)
    public void a(int i2) {
        if (Build.VERSION.SDK_INT >= 11 && getCallback() == null) {
            stop();
            i();
            return;
        }
        invalidateSelf();
        if (i2 == this.f5776e.f() - 1) {
            this.f5782k++;
        }
        int i3 = this.f5783l;
        if (i3 == -1 || this.f5782k < i3) {
            return;
        }
        stop();
    }

    @Override // c.d.a.n.k.f.b
    public boolean b() {
        return true;
    }

    @Override // c.d.a.n.k.f.b
    public void c(int i2) {
        if (i2 <= 0 && i2 != -1 && i2 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i2 != 0) {
            this.f5783l = i2;
        } else {
            int iJ = this.f5776e.j();
            this.f5783l = iJ != 0 ? iJ : -1;
        }
    }

    public byte[] d() {
        return this.f5775d.f5786b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5780i) {
            return;
        }
        if (this.f5784m) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f5774c);
            this.f5784m = false;
        }
        Bitmap bitmapB = this.f5777f.b();
        if (bitmapB == null) {
            bitmapB = this.f5775d.f5793i;
        }
        canvas.drawBitmap(bitmapB, (Rect) null, this.f5774c, this.f5773b);
    }

    public Bitmap e() {
        return this.f5775d.f5793i;
    }

    public int f() {
        return this.f5776e.f();
    }

    public c.d.a.n.g<Bitmap> g() {
        return this.f5775d.f5788d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5775d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5775d.f5793i.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5775d.f5793i.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public void h() {
        this.f5780i = true;
        a aVar = this.f5775d;
        aVar.f5792h.a(aVar.f5793i);
        this.f5777f.a();
        this.f5777f.h();
    }

    public final void i() {
        this.f5777f.a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5778g;
    }

    public final void j() {
        this.f5782k = 0;
    }

    public final void k() {
        if (this.f5776e.f() != 1) {
            if (this.f5778g) {
                return;
            }
            this.f5778g = true;
            this.f5777f.g();
        }
        invalidateSelf();
    }

    public final void l() {
        this.f5778g = false;
        this.f5777f.h();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5784m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f5773b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5773b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        this.f5781j = z;
        if (!z) {
            l();
        } else if (this.f5779h) {
            k();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5779h = true;
        j();
        if (this.f5781j) {
            k();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5779h = false;
        l();
        if (Build.VERSION.SDK_INT < 11) {
            i();
        }
    }
}

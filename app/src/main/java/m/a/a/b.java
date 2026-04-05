package m.a.a;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: loaded from: classes2.dex */
public class b extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f31100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f31101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f31103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f31104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap f31105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GifInfoHandle f31106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentLinkedQueue<m.a.a.a> f31107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f31108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuffColorFilter f31109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f31110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f31111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f31112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f31113o;
    public final Rect p;
    public ScheduledFuture<?> q;
    public int r;
    public int s;
    public m.a.a.l.a t;

    public class a extends k {
        public a(b bVar) {
            super(bVar);
        }

        @Override // m.a.a.k
        public void a() {
            if (b.this.f31106h.q()) {
                b.this.start();
            }
        }
    }

    /* JADX INFO: renamed from: m.a.a.b$b, reason: collision with other inner class name */
    public class C0316b extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0316b(b bVar, int i2) {
            super(bVar);
            this.f31115c = i2;
        }

        @Override // m.a.a.k
        public void a() {
            b bVar = b.this;
            bVar.f31106h.u(this.f31115c, bVar.f31105g);
            this.f31128b.f31112n.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public b(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public b(Resources resources, int i2) {
        this(resources.openRawResourceFd(i2));
        float fB = f.b(resources, i2);
        this.s = (int) (this.f31106h.e() * fB);
        this.r = (int) (this.f31106h.k() * fB);
    }

    public b(GifInfoHandle gifInfoHandle, b bVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f31101c = true;
        this.f31102d = Long.MIN_VALUE;
        this.f31103e = new Rect();
        this.f31104f = new Paint(6);
        this.f31107i = new ConcurrentLinkedQueue<>();
        j jVar = new j(this);
        this.f31113o = jVar;
        this.f31111m = z;
        this.f31100b = scheduledThreadPoolExecutor == null ? d.a() : scheduledThreadPoolExecutor;
        this.f31106h = gifInfoHandle;
        Bitmap bitmap = null;
        if (bVar != null) {
            synchronized (bVar.f31106h) {
                if (!bVar.f31106h.m() && bVar.f31106h.e() >= gifInfoHandle.e() && bVar.f31106h.k() >= gifInfoHandle.k()) {
                    bVar.i();
                    Bitmap bitmap2 = bVar.f31105g;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.f31105g = Bitmap.createBitmap(gifInfoHandle.k(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        } else {
            this.f31105g = bitmap;
        }
        this.f31105g.setHasAlpha(!gifInfoHandle.l());
        this.p = new Rect(0, 0, gifInfoHandle.k(), gifInfoHandle.e());
        this.f31112n = new g(this);
        jVar.a();
        this.r = gifInfoHandle.k();
        this.s = gifInfoHandle.e();
    }

    public final void a() {
        ScheduledFuture<?> scheduledFuture = this.q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f31112n.removeMessages(-1);
    }

    public int b() {
        return this.f31106h.a();
    }

    public int c() {
        int iB = this.f31106h.b();
        return (iB == 0 || iB < this.f31106h.f()) ? iB : iB - 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return d() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return d() > 1;
    }

    public int d() {
        return this.f31106h.i();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        if (this.f31109k == null || this.f31104f.getColorFilter() != null) {
            z = false;
        } else {
            this.f31104f.setColorFilter(this.f31109k);
            z = true;
        }
        m.a.a.l.a aVar = this.t;
        if (aVar == null) {
            canvas.drawBitmap(this.f31105g, this.p, this.f31103e, this.f31104f);
        } else {
            aVar.a(canvas, this.f31104f, this.f31105g);
        }
        if (z) {
            this.f31104f.setColorFilter(null);
        }
    }

    public boolean e() {
        return this.f31106h.m();
    }

    public void f() {
        this.f31100b.execute(new a(this));
    }

    public final void g() {
        if (this.f31111m && this.f31101c) {
            long j2 = this.f31102d;
            if (j2 != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j2 - SystemClock.uptimeMillis());
                this.f31102d = Long.MIN_VALUE;
                this.f31100b.remove(this.f31113o);
                this.q = this.f31100b.schedule(this.f31113o, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31104f.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f31104f.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f31106h.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f31106h.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f31106h.l() || this.f31104f.getAlpha() < 255) ? -2 : -1;
    }

    public void h(int i2) {
        this.f31106h.v(i2);
    }

    public final void i() {
        this.f31101c = false;
        this.f31112n.removeMessages(-1);
        this.f31106h.o();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        g();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f31101c;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f31101c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f31108j) != null && colorStateList.isStateful());
    }

    public void j(long j2) {
        if (this.f31111m) {
            this.f31102d = 0L;
            this.f31112n.sendEmptyMessageAtTime(-1, 0L);
        } else {
            a();
            this.q = this.f31100b.schedule(this.f31113o, Math.max(j2, 0L), TimeUnit.MILLISECONDS);
        }
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f31103e.set(rect);
        m.a.a.l.a aVar = this.t;
        if (aVar != null) {
            aVar.b(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f31108j;
        if (colorStateList == null || (mode = this.f31110l) == null) {
            return false;
        }
        this.f31109k = k(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f31100b.execute(new C0316b(this, i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f31104f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f31104f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f31104f.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f31104f.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f31108j = colorStateList;
        this.f31109k = k(colorStateList, this.f31110l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f31110l = mode;
        this.f31109k = k(this.f31108j, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f31111m) {
            if (z) {
                if (z2) {
                    f();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.f31101c) {
                return;
            }
            this.f31101c = true;
            j(this.f31106h.r());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f31101c) {
                this.f31101c = false;
                a();
                this.f31106h.t();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f31106h.k()), Integer.valueOf(this.f31106h.e()), Integer.valueOf(this.f31106h.i()), Integer.valueOf(this.f31106h.g()));
    }
}

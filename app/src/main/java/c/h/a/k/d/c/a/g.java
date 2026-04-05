package c.h.a.k.d.c.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c.h.a.k.d.c.a.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.ISurfaceTextureHolder;

/* JADX INFO: loaded from: classes2.dex */
public class g extends SurfaceView implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f17847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f17848c;

    public static final class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f17849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SurfaceHolder f17850b;

        public a(g gVar, SurfaceHolder surfaceHolder) {
            this.f17849a = gVar;
            this.f17850b = surfaceHolder;
        }

        @Override // c.h.a.k.d.c.a.c.b
        public c a() {
            return this.f17849a;
        }

        @Override // c.h.a.k.d.c.a.c.b
        public void b(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 16 && (iMediaPlayer instanceof ISurfaceTextureHolder)) {
                    ((ISurfaceTextureHolder) iMediaPlayer).setSurfaceTexture(null);
                }
                iMediaPlayer.setDisplay(this.f17850b);
            }
        }

        @Override // c.h.a.k.d.c.a.c.b
        public SurfaceHolder c() {
            return this.f17850b;
        }
    }

    public static final class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SurfaceHolder f17851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public WeakReference<g> f17856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map<c.a, Object> f17857h = new ConcurrentHashMap();

        public b(g gVar) {
            this.f17856g = new WeakReference<>(gVar);
        }

        public void a(c.a aVar) {
            a aVar2;
            this.f17857h.put(aVar, aVar);
            if (this.f17851b != null) {
                aVar2 = new a(this.f17856g.get(), this.f17851b);
                aVar.b(aVar2, this.f17854e, this.f17855f);
            } else {
                aVar2 = null;
            }
            if (this.f17852c) {
                if (aVar2 == null) {
                    aVar2 = new a(this.f17856g.get(), this.f17851b);
                }
                aVar.a(aVar2, this.f17853d, this.f17854e, this.f17855f);
            }
        }

        public void b(c.a aVar) {
            this.f17857h.remove(aVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            this.f17851b = surfaceHolder;
            this.f17852c = true;
            this.f17853d = i2;
            this.f17854e = i3;
            this.f17855f = i4;
            a aVar = new a(this.f17856g.get(), this.f17851b);
            Iterator<c.a> it = this.f17857h.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, i2, i3, i4);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f17851b = surfaceHolder;
            this.f17852c = false;
            this.f17853d = 0;
            this.f17854e = 0;
            this.f17855f = 0;
            a aVar = new a(this.f17856g.get(), this.f17851b);
            Iterator<c.a> it = this.f17857h.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(aVar, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f17851b = null;
            this.f17852c = false;
            this.f17853d = 0;
            this.f17854e = 0;
            this.f17855f = 0;
            a aVar = new a(this.f17856g.get(), this.f17851b);
            Iterator<c.a> it = this.f17857h.keySet().iterator();
            while (it.hasNext()) {
                it.next().c(aVar);
            }
        }
    }

    public g(Context context) {
        super(context);
        g(context);
    }

    public static String f() {
        return "U";
    }

    public static String h() {
        return "3VjaCBraW5kIG9mIGFwcHMgY291bGQgc2VuZCB0aGUgZGF0YSB0byBsZWdhbCBhdXRob3JpdGllcy4=";
    }

    @Override // c.h.a.k.d.c.a.c
    public void a(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.f17847b.h(i2, i3);
        getHolder().setFixedSize(i2, i3);
        requestLayout();
    }

    @Override // c.h.a.k.d.c.a.c
    public void b(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.f17847b.g(i2, i3);
        requestLayout();
    }

    @Override // c.h.a.k.d.c.a.c
    public boolean c() {
        return true;
    }

    @Override // c.h.a.k.d.c.a.c
    public void d(c.a aVar) {
        this.f17848c.a(aVar);
    }

    @Override // c.h.a.k.d.c.a.c
    public void e(c.a aVar) {
        this.f17848c.b(aVar);
    }

    public final void g(Context context) {
        this.f17847b = new e(this);
        this.f17848c = new b(this);
        getHolder().addCallback(this.f17848c);
        getHolder().setType(0);
    }

    @Override // c.h.a.k.d.c.a.c
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(g.class.getName());
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 14) {
            accessibilityNodeInfo.setClassName(g.class.getName());
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i2, int i3) {
        this.f17847b.a(i2, i3);
        setMeasuredDimension(this.f17847b.c(), this.f17847b.b());
    }

    @Override // c.h.a.k.d.c.a.c
    public void setAspectRatio(int i2) {
        this.f17847b.e(i2);
        requestLayout();
    }

    @Override // c.h.a.k.d.c.a.c
    public void setVideoRotation(int i2) {
        Log.e(BuildConfig.FLAVOR, "SurfaceView doesn't support rotation (" + i2 + ")!\n");
    }
}

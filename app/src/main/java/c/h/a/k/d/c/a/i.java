package c.h.a.k.d.c.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c.h.a.k.d.c.a.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.ISurfaceTextureHolder;
import tv.danmaku.ijk.media.player.ISurfaceTextureHost;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(14)
public class i extends TextureView implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f17863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f17864c;

    public static final class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f17865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SurfaceTexture f17866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ISurfaceTextureHost f17867c;

        public a(i iVar, SurfaceTexture surfaceTexture, ISurfaceTextureHost iSurfaceTextureHost) {
            this.f17865a = iVar;
            this.f17866b = surfaceTexture;
            this.f17867c = iSurfaceTextureHost;
        }

        @Override // c.h.a.k.d.c.a.c.b
        public c a() {
            return this.f17865a;
        }

        @Override // c.h.a.k.d.c.a.c.b
        @TargetApi(16)
        public void b(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 16 || !(iMediaPlayer instanceof ISurfaceTextureHolder)) {
                iMediaPlayer.setSurface(d());
                return;
            }
            ISurfaceTextureHolder iSurfaceTextureHolder = (ISurfaceTextureHolder) iMediaPlayer;
            this.f17865a.f17864c.e(false);
            SurfaceTexture surfaceTexture = iSurfaceTextureHolder.getSurfaceTexture();
            if (surfaceTexture != null) {
                this.f17865a.setSurfaceTexture(surfaceTexture);
            } else {
                iSurfaceTextureHolder.setSurfaceTexture(this.f17866b);
                iSurfaceTextureHolder.setSurfaceTextureHost(this.f17865a.f17864c);
            }
        }

        @Override // c.h.a.k.d.c.a.c.b
        public SurfaceHolder c() {
            return null;
        }

        public Surface d() {
            if (this.f17866b == null) {
                return null;
            }
            return new Surface(this.f17866b);
        }
    }

    public static final class b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SurfaceTexture f17868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17871e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public WeakReference<i> f17875i;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17872f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f17873g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f17874h = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Map<c.a, Object> f17876j = new ConcurrentHashMap();

        public b(i iVar) {
            this.f17875i = new WeakReference<>(iVar);
        }

        public void b(c.a aVar) {
            a aVar2;
            this.f17876j.put(aVar, aVar);
            if (this.f17868b != null) {
                aVar2 = new a(this.f17875i.get(), this.f17868b, this);
                aVar.b(aVar2, this.f17870d, this.f17871e);
            } else {
                aVar2 = null;
            }
            if (this.f17869c) {
                if (aVar2 == null) {
                    aVar2 = new a(this.f17875i.get(), this.f17868b, this);
                }
                aVar.a(aVar2, 0, this.f17870d, this.f17871e);
            }
        }

        public void c() {
            Log.d("TextureRenderView", "didDetachFromWindow()");
            this.f17874h = true;
        }

        public void d(c.a aVar) {
            this.f17876j.remove(aVar);
        }

        public void e(boolean z) {
            this.f17872f = z;
        }

        public void f() {
            Log.d("TextureRenderView", "willDetachFromWindow()");
            this.f17873g = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            this.f17868b = surfaceTexture;
            this.f17869c = false;
            this.f17870d = 0;
            this.f17871e = 0;
            a aVar = new a(this.f17875i.get(), surfaceTexture, this);
            Iterator<c.a> it = this.f17876j.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(aVar, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f17868b = surfaceTexture;
            this.f17869c = false;
            this.f17870d = 0;
            this.f17871e = 0;
            a aVar = new a(this.f17875i.get(), surfaceTexture, this);
            Iterator<c.a> it = this.f17876j.keySet().iterator();
            while (it.hasNext()) {
                it.next().c(aVar);
            }
            Log.d("TextureRenderView", "onSurfaceTextureDestroyed: destroy: " + this.f17872f);
            return this.f17872f;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            this.f17868b = surfaceTexture;
            this.f17869c = true;
            this.f17870d = i2;
            this.f17871e = i3;
            a aVar = new a(this.f17875i.get(), surfaceTexture, this);
            Iterator<c.a> it = this.f17876j.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, 0, i2, i3);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHost
        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            String str;
            String str2;
            String str3;
            if (surfaceTexture == null) {
                str = "releaseSurfaceTexture: null";
            } else {
                if (this.f17874h) {
                    if (surfaceTexture != this.f17868b) {
                        str3 = "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture";
                    } else if (this.f17872f) {
                        str = "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView";
                    } else {
                        str3 = "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture";
                    }
                    Log.d("TextureRenderView", str3);
                    surfaceTexture.release();
                    return;
                }
                if (this.f17873g) {
                    if (surfaceTexture != this.f17868b) {
                        str3 = "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture";
                        Log.d("TextureRenderView", str3);
                        surfaceTexture.release();
                        return;
                    } else {
                        if (!this.f17872f) {
                            str2 = "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView";
                            Log.d("TextureRenderView", str2);
                            e(true);
                            return;
                        }
                        str = "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView";
                    }
                } else if (surfaceTexture != this.f17868b) {
                    str3 = "releaseSurfaceTexture: alive: release different SurfaceTexture";
                    Log.d("TextureRenderView", str3);
                    surfaceTexture.release();
                    return;
                } else {
                    if (!this.f17872f) {
                        str2 = "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView";
                        Log.d("TextureRenderView", str2);
                        e(true);
                        return;
                    }
                    str = "releaseSurfaceTexture: alive: will released by TextureView";
                }
            }
            Log.d("TextureRenderView", str);
        }
    }

    public i(Context context) {
        super(context);
        g(context);
    }

    public static String h() {
        return "W91ciBUViBTZXJ2aWNlIFByb3ZpZGVyIGhhcyBub3QgcHJvdmlkZWQgeW91ciB0aGUgb3JpZ2luYWwgYXBwLg==";
    }

    public static String i() {
        return "W";
    }

    @Override // c.h.a.k.d.c.a.c
    public void a(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.f17863b.h(i2, i3);
        requestLayout();
    }

    @Override // c.h.a.k.d.c.a.c
    public void b(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.f17863b.g(i2, i3);
        requestLayout();
    }

    @Override // c.h.a.k.d.c.a.c
    public boolean c() {
        return false;
    }

    @Override // c.h.a.k.d.c.a.c
    public void d(c.a aVar) {
        this.f17864c.b(aVar);
    }

    @Override // c.h.a.k.d.c.a.c
    public void e(c.a aVar) {
        this.f17864c.d(aVar);
    }

    public final void g(Context context) {
        this.f17863b = new e(this);
        b bVar = new b(this);
        this.f17864c = bVar;
        setSurfaceTextureListener(bVar);
    }

    public c.b getSurfaceHolder() {
        return new a(this, this.f17864c.f17868b, this.f17864c);
    }

    @Override // c.h.a.k.d.c.a.c
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f17864c.f();
        super.onDetachedFromWindow();
        this.f17864c.c();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(i.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(i.class.getName());
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        this.f17863b.a(i2, i3);
        setMeasuredDimension(this.f17863b.c(), this.f17863b.b());
    }

    @Override // c.h.a.k.d.c.a.c
    public void setAspectRatio(int i2) {
        this.f17863b.e(i2);
        requestLayout();
    }

    @Override // c.h.a.k.d.c.a.c
    public void setVideoRotation(int i2) {
        this.f17863b.f(i2);
        setRotation(i2);
    }
}

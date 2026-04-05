package c.f.a.b.k3.f0;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import c.f.a.b.j3.t0;
import c.f.a.b.j3.u;
import c.f.a.b.k1;
import c.f.a.b.k3.y;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements y, d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f9432k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f9435n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f9423b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9424c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f9425d = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f9426e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t0<Long> f9427f = new t0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0<h> f9428g = new t0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f9429h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f9430i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f9433l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9434m = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f9423b.set(true);
    }

    @Override // c.f.a.b.k3.f0.d
    public void a(long j2, float[] fArr) {
        this.f9426e.e(j2, fArr);
    }

    public void b(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        u.b();
        if (this.f9423b.compareAndSet(true, false)) {
            ((SurfaceTexture) c.f.a.b.j3.g.e(this.f9432k)).updateTexImage();
            u.b();
            if (this.f9424c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f9429h, 0);
            }
            long timestamp = this.f9432k.getTimestamp();
            Long lG = this.f9427f.g(timestamp);
            if (lG != null) {
                this.f9426e.c(this.f9429h, lG.longValue());
            }
            h hVarJ = this.f9428g.j(timestamp);
            if (hVarJ != null) {
                this.f9425d.d(hVarJ);
            }
        }
        Matrix.multiplyMM(this.f9430i, 0, fArr, 0, this.f9429h, 0);
        this.f9425d.a(this.f9431j, this.f9430i, z);
    }

    @Override // c.f.a.b.k3.f0.d
    public void c() {
        this.f9427f.c();
        this.f9426e.d();
        this.f9424c.set(true);
    }

    @Override // c.f.a.b.k3.y
    public void d(long j2, long j3, k1 k1Var, MediaFormat mediaFormat) {
        this.f9427f.a(j3, Long.valueOf(j2));
        i(k1Var.w, k1Var.x, j3);
    }

    public SurfaceTexture e() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        u.b();
        this.f9425d.b();
        u.b();
        this.f9431j = u.g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9431j);
        this.f9432k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: c.f.a.b.k3.f0.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f9378b.g(surfaceTexture2);
            }
        });
        return this.f9432k;
    }

    public void h(int i2) {
        this.f9433l = i2;
    }

    public final void i(byte[] bArr, int i2, long j2) {
        byte[] bArr2 = this.f9435n;
        int i3 = this.f9434m;
        this.f9435n = bArr;
        if (i2 == -1) {
            i2 = this.f9433l;
        }
        this.f9434m = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.f9435n)) {
            return;
        }
        byte[] bArr3 = this.f9435n;
        h hVarA = bArr3 != null ? i.a(bArr3, this.f9434m) : null;
        if (hVarA == null || !j.c(hVarA)) {
            hVarA = h.b(this.f9434m);
        }
        this.f9428g.a(j2, hVarA);
    }
}

package c.f.a.b.a3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c.f.a.b.a3.l;
import c.f.a.b.a3.q;
import c.f.a.b.j3.v0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f6425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f6426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f6427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6430f;

    public static final class b implements q.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.b.a.o<HandlerThread> f6431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.b.a.o<HandlerThread> f6432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6434e;

        public b(final int i2, boolean z, boolean z2) {
            this(new c.f.b.a.o() { // from class: c.f.a.b.a3.a
                @Override // c.f.b.a.o
                public final Object get() {
                    return l.b.c(i2);
                }
            }, new c.f.b.a.o() { // from class: c.f.a.b.a3.b
                @Override // c.f.b.a.o
                public final Object get() {
                    return l.b.d(i2);
                }
            }, z, z2);
        }

        public b(c.f.b.a.o<HandlerThread> oVar, c.f.b.a.o<HandlerThread> oVar2, boolean z, boolean z2) {
            this.f6431b = oVar;
            this.f6432c = oVar2;
            this.f6433d = z;
            this.f6434e = z2;
        }

        public static /* synthetic */ HandlerThread c(int i2) {
            return new HandlerThread(l.r(i2));
        }

        public static /* synthetic */ HandlerThread d(int i2) {
            return new HandlerThread(l.s(i2));
        }

        @Override // c.f.a.b.a3.q.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(q.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f6470a.f6479a;
            l lVar = null;
            try {
                v0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    l lVar2 = new l(mediaCodecCreateByCodecName, this.f6431b.get(), this.f6432c.get(), this.f6433d, this.f6434e);
                    try {
                        v0.c();
                        lVar2.u(aVar.f6471b, aVar.f6473d, aVar.f6474e, aVar.f6475f);
                        return lVar2;
                    } catch (Exception e2) {
                        e = e2;
                        lVar = lVar2;
                        if (lVar != null) {
                            lVar.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public l(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f6425a = mediaCodec;
        this.f6426b = new n(handlerThread);
        this.f6427c = new m(mediaCodec, handlerThread2, z);
        this.f6428d = z2;
        this.f6430f = 0;
    }

    public static String r(int i2) {
        return t(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String s(int i2) {
        return t(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String t(int i2, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            str2 = "Audio";
        } else if (i2 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w(q.c cVar, MediaCodec mediaCodec, long j2, long j3) {
        cVar.a(this, j2, j3);
    }

    @Override // c.f.a.b.a3.q
    public boolean a() {
        return false;
    }

    @Override // c.f.a.b.a3.q
    public void b(int i2, int i3, c.f.a.b.v2.b bVar, long j2, int i4) {
        this.f6427c.o(i2, i3, bVar, j2, i4);
    }

    @Override // c.f.a.b.a3.q
    public MediaFormat c() {
        return this.f6426b.f();
    }

    @Override // c.f.a.b.a3.q
    public void d(Bundle bundle) {
        x();
        this.f6425a.setParameters(bundle);
    }

    @Override // c.f.a.b.a3.q
    public void e(int i2, long j2) {
        this.f6425a.releaseOutputBuffer(i2, j2);
    }

    @Override // c.f.a.b.a3.q
    public int f() {
        return this.f6426b.b();
    }

    @Override // c.f.a.b.a3.q
    public void flush() {
        this.f6427c.i();
        this.f6425a.flush();
        n nVar = this.f6426b;
        final MediaCodec mediaCodec = this.f6425a;
        mediaCodec.getClass();
        nVar.d(new Runnable() { // from class: c.f.a.b.a3.j
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // c.f.a.b.a3.q
    public int g(MediaCodec.BufferInfo bufferInfo) {
        return this.f6426b.c(bufferInfo);
    }

    @Override // c.f.a.b.a3.q
    public void h(final q.c cVar, Handler handler) {
        x();
        this.f6425a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: c.f.a.b.a3.c
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                this.f6413a.w(cVar, mediaCodec, j2, j3);
            }
        }, handler);
    }

    @Override // c.f.a.b.a3.q
    public void i(int i2, boolean z) {
        this.f6425a.releaseOutputBuffer(i2, z);
    }

    @Override // c.f.a.b.a3.q
    public void j(int i2) {
        x();
        this.f6425a.setVideoScalingMode(i2);
    }

    @Override // c.f.a.b.a3.q
    public ByteBuffer k(int i2) {
        return this.f6425a.getInputBuffer(i2);
    }

    @Override // c.f.a.b.a3.q
    public void l(Surface surface) {
        x();
        this.f6425a.setOutputSurface(surface);
    }

    @Override // c.f.a.b.a3.q
    public void m(int i2, int i3, int i4, long j2, int i5) {
        this.f6427c.n(i2, i3, i4, j2, i5);
    }

    @Override // c.f.a.b.a3.q
    public ByteBuffer n(int i2) {
        return this.f6425a.getOutputBuffer(i2);
    }

    @Override // c.f.a.b.a3.q
    public void release() {
        try {
            if (this.f6430f == 1) {
                this.f6427c.r();
                this.f6426b.q();
            }
            this.f6430f = 2;
        } finally {
            if (!this.f6429e) {
                this.f6425a.release();
                this.f6429e = true;
            }
        }
    }

    public final void u(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        this.f6426b.g(this.f6425a);
        v0.a("configureCodec");
        this.f6425a.configure(mediaFormat, surface, mediaCrypto, i2);
        v0.c();
        this.f6427c.s();
        v0.a("startCodec");
        this.f6425a.start();
        v0.c();
        this.f6430f = 1;
    }

    public final void x() {
        if (this.f6428d) {
            try {
                this.f6427c.t();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }
}

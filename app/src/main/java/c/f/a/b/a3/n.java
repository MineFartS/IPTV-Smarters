package c.f.a.b.a3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c.f.a.b.j3.x0;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f6452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f6453c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f6458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f6459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f6460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f6463m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6451a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.j3.w f6454d = new c.f.a.b.j3.w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.j3.w f6455e = new c.f.a.b.j3.w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f6456f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f6457g = new ArrayDeque<>();

    public n(HandlerThread handlerThread) {
        this.f6452b = handlerThread;
    }

    public final void a(MediaFormat mediaFormat) {
        this.f6455e.a(-2);
        this.f6457g.add(mediaFormat);
    }

    public int b() {
        synchronized (this.f6451a) {
            int iE = -1;
            if (h()) {
                return -1;
            }
            k();
            if (!this.f6454d.d()) {
                iE = this.f6454d.e();
            }
            return iE;
        }
    }

    public int c(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6451a) {
            if (h()) {
                return -1;
            }
            k();
            if (this.f6455e.d()) {
                return -1;
            }
            int iE = this.f6455e.e();
            if (iE >= 0) {
                c.f.a.b.j3.g.i(this.f6458h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f6456f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iE == -2) {
                this.f6458h = this.f6457g.remove();
            }
            return iE;
        }
    }

    public void d(final Runnable runnable) {
        synchronized (this.f6451a) {
            this.f6461k++;
            ((Handler) x0.i(this.f6453c)).post(new Runnable() { // from class: c.f.a.b.a3.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6415b.j(runnable);
                }
            });
        }
    }

    public final void e() {
        if (!this.f6457g.isEmpty()) {
            this.f6459i = this.f6457g.getLast();
        }
        this.f6454d.b();
        this.f6455e.b();
        this.f6456f.clear();
        this.f6457g.clear();
        this.f6460j = null;
    }

    public MediaFormat f() {
        MediaFormat mediaFormat;
        synchronized (this.f6451a) {
            mediaFormat = this.f6458h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void g(MediaCodec mediaCodec) {
        c.f.a.b.j3.g.g(this.f6453c == null);
        this.f6452b.start();
        Handler handler = new Handler(this.f6452b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f6453c = handler;
    }

    public final boolean h() {
        return this.f6461k > 0 || this.f6462l;
    }

    public final void k() {
        l();
        m();
    }

    public final void l() {
        IllegalStateException illegalStateException = this.f6463m;
        if (illegalStateException == null) {
            return;
        }
        this.f6463m = null;
        throw illegalStateException;
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.f6460j;
        if (codecException == null) {
            return;
        }
        this.f6460j = null;
        throw codecException;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void j(Runnable runnable) {
        synchronized (this.f6451a) {
            o(runnable);
        }
    }

    public final void o(Runnable runnable) {
        if (this.f6462l) {
            return;
        }
        long j2 = this.f6461k - 1;
        this.f6461k = j2;
        if (j2 > 0) {
            return;
        }
        if (j2 < 0) {
            p(new IllegalStateException());
            return;
        }
        e();
        try {
            runnable.run();
        } catch (IllegalStateException e2) {
            p(e2);
        } catch (Exception e3) {
            p(new IllegalStateException(e3));
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6451a) {
            this.f6460j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f6451a) {
            this.f6454d.a(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6451a) {
            MediaFormat mediaFormat = this.f6459i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.f6459i = null;
            }
            this.f6455e.a(i2);
            this.f6456f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6451a) {
            a(mediaFormat);
            this.f6459i = null;
        }
    }

    public final void p(IllegalStateException illegalStateException) {
        synchronized (this.f6451a) {
            this.f6463m = illegalStateException;
        }
    }

    public void q() {
        synchronized (this.f6451a) {
            this.f6462l = true;
            this.f6452b.quit();
            e();
        }
    }
}

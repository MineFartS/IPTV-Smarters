package c.f.a.b.a3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import c.f.a.b.j3.x0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayDeque<b> f6435a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6436b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodec f6437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HandlerThread f6438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f6439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f6440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.b.j3.l f6441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6443i;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            m.this.f(message);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f6448d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f6449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6450f;

        public void a(int i2, int i3, int i4, long j2, int i5) {
            this.f6445a = i2;
            this.f6446b = i3;
            this.f6447c = i4;
            this.f6449e = j2;
            this.f6450f = i5;
        }
    }

    public m(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new c.f.a.b.j3.l());
    }

    public m(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, c.f.a.b.j3.l lVar) {
        this.f6437c = mediaCodec;
        this.f6438d = handlerThread;
        this.f6441g = lVar;
        this.f6440f = new AtomicReference<>();
        this.f6442h = z || m();
    }

    public static void c(c.f.a.b.v2.b bVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = bVar.f10257f;
        cryptoInfo.numBytesOfClearData = e(bVar.f10255d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(bVar.f10256e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) c.f.a.b.j3.g.e(d(bVar.f10253b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) c.f.a.b.j3.g.e(d(bVar.f10252a, cryptoInfo.iv));
        cryptoInfo.mode = bVar.f10254c;
        if (x0.f9296a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f10258g, bVar.f10259h));
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b k() {
        ArrayDeque<b> arrayDeque = f6435a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    public static boolean m() {
        String strE = c.f.b.a.b.e(x0.f9298c);
        return strE.contains("samsung") || strE.contains("motorola");
    }

    public static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f6435a;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public final void b() {
        this.f6441g.d();
        ((Handler) x0.i(this.f6439e)).obtainMessage(2).sendToTarget();
        this.f6441g.a();
    }

    public final void f(Message message) {
        b bVar;
        int i2 = message.what;
        if (i2 == 0) {
            bVar = (b) message.obj;
            g(bVar.f6445a, bVar.f6446b, bVar.f6447c, bVar.f6449e, bVar.f6450f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                q(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f6441g.f();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            h(bVar.f6445a, bVar.f6446b, bVar.f6448d, bVar.f6449e, bVar.f6450f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    public final void g(int i2, int i3, int i4, long j2, int i5) {
        try {
            this.f6437c.queueInputBuffer(i2, i3, i4, j2, i5);
        } catch (RuntimeException e2) {
            q(e2);
        }
    }

    public final void h(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j2, int i4) {
        try {
            if (!this.f6442h) {
                this.f6437c.queueSecureInputBuffer(i2, i3, cryptoInfo, j2, i4);
                return;
            }
            synchronized (f6436b) {
                this.f6437c.queueSecureInputBuffer(i2, i3, cryptoInfo, j2, i4);
            }
        } catch (RuntimeException e2) {
            q(e2);
        }
    }

    public void i() {
        if (this.f6443i) {
            try {
                j();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public final void j() {
        ((Handler) x0.i(this.f6439e)).removeCallbacksAndMessages(null);
        b();
        l();
    }

    public final void l() {
        RuntimeException andSet = this.f6440f.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void n(int i2, int i3, int i4, long j2, int i5) {
        l();
        b bVarK = k();
        bVarK.a(i2, i3, i4, j2, i5);
        ((Handler) x0.i(this.f6439e)).obtainMessage(0, bVarK).sendToTarget();
    }

    public void o(int i2, int i3, c.f.a.b.v2.b bVar, long j2, int i4) {
        l();
        b bVarK = k();
        bVarK.a(i2, i3, 0, j2, i4);
        c(bVar, bVarK.f6448d);
        ((Handler) x0.i(this.f6439e)).obtainMessage(1, bVarK).sendToTarget();
    }

    public void q(RuntimeException runtimeException) {
        this.f6440f.set(runtimeException);
    }

    public void r() {
        if (this.f6443i) {
            i();
            this.f6438d.quit();
        }
        this.f6443i = false;
    }

    public void s() {
        if (this.f6443i) {
            return;
        }
        this.f6438d.start();
        this.f6439e = new a(this.f6438d.getLooper());
        this.f6443i = true;
    }

    public void t() {
        b();
    }
}

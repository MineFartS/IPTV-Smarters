package c.f.a.b.e3.g1;

import android.os.Handler;
import android.os.HandlerThread;
import c.f.a.b.i3.g0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f7726b = c.f.b.a.d.f15784c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f7727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.i3.g0 f7728d = new c.f.a.b.i3.g0("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Integer, b> f7729e = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f7730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Socket f7731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f7732h;

    public interface b {
        void f(byte[] bArr);
    }

    public final class c implements g0.b<f> {
        public c() {
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void k(f fVar, long j2, long j3, boolean z) {
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m(f fVar, long j2, long j3) {
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0.c u(f fVar, long j2, long j3, IOException iOException, int i2) {
            if (!y.this.f7732h) {
                y.this.f7727c.a(iOException);
            }
            return c.f.a.b.i3.g0.f8877c;
        }
    }

    public interface d {
        void a(Exception exc);

        void b(List<String> list, Exception exc);

        void c(List<String> list);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f7734a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7735b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7736c;

        public static byte[] d(byte b2, DataInputStream dataInputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b2, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                bArr[1] = dataInputStream.readByte();
                byteArrayOutputStream.write(bArr[1]);
            }
        }

        public final c.f.b.b.t<String> a(byte[] bArr) {
            c.f.a.b.j3.g.g(this.f7735b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f7734a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, y.f7726b) : new String(bArr, 0, bArr.length - 2, y.f7726b));
            c.f.b.b.t<String> tVarD = c.f.b.b.t.D(this.f7734a);
            e();
            return tVarD;
        }

        public final c.f.b.b.t<String> b(byte[] bArr) {
            c.f.a.b.j3.g.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, y.f7726b);
            this.f7734a.add(str);
            int i2 = this.f7735b;
            if (i2 == 1) {
                if (!a0.c(str)) {
                    return null;
                }
                this.f7735b = 2;
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            long jD = a0.d(str);
            if (jD != -1) {
                this.f7736c = jD;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f7736c > 0) {
                this.f7735b = 3;
                return null;
            }
            c.f.b.b.t<String> tVarD = c.f.b.b.t.D(this.f7734a);
            e();
            return tVarD;
        }

        public c.f.b.b.t<String> c(byte b2, DataInputStream dataInputStream) throws IOException {
            c.f.b.b.t<String> tVarB = b(d(b2, dataInputStream));
            while (tVarB == null) {
                if (this.f7735b == 3) {
                    long j2 = this.f7736c;
                    if (j2 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iC = c.f.b.f.c.c(j2);
                    c.f.a.b.j3.g.g(iC != -1);
                    byte[] bArr = new byte[iC];
                    dataInputStream.readFully(bArr, 0, iC);
                    tVarB = a(bArr);
                } else {
                    tVarB = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return tVarB;
        }

        public final void e() {
            this.f7734a.clear();
            this.f7735b = 1;
            this.f7736c = 0L;
        }
    }

    public final class f implements g0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f7737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f7738b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f7739c;

        public f(InputStream inputStream) {
            this.f7737a = new DataInputStream(inputStream);
        }

        @Override // c.f.a.b.i3.g0.e
        public void a() throws IOException {
            while (!this.f7739c) {
                byte b2 = this.f7737a.readByte();
                if (b2 == 36) {
                    b();
                } else {
                    d(b2);
                }
            }
        }

        public final void b() throws IOException {
            int unsignedByte = this.f7737a.readUnsignedByte();
            int unsignedShort = this.f7737a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f7737a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) y.this.f7729e.get(Integer.valueOf(unsignedByte));
            if (bVar == null || y.this.f7732h) {
                return;
            }
            bVar.f(bArr);
        }

        @Override // c.f.a.b.i3.g0.e
        public void c() {
            this.f7739c = true;
        }

        public final void d(byte b2) {
            if (y.this.f7732h) {
                return;
            }
            y.this.f7727c.c(this.f7738b.c(b2, this.f7737a));
        }
    }

    public final class g implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OutputStream f7741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HandlerThread f7742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f7743d;

        public g(OutputStream outputStream) {
            this.f7741b = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f7742c = handlerThread;
            handlerThread.start();
            this.f7743d = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void i(byte[] bArr, List list) {
            try {
                this.f7741b.write(bArr);
            } catch (Exception e2) {
                if (y.this.f7732h) {
                    return;
                }
                y.this.f7727c.b(list, e2);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f7743d;
            final HandlerThread handlerThread = this.f7742c;
            handlerThread.getClass();
            handler.post(new Runnable() { // from class: c.f.a.b.e3.g1.a
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f7742c.join();
            } catch (InterruptedException unused) {
                this.f7742c.interrupt();
            }
        }

        public void l(final List<String> list) {
            final byte[] bArrA = a0.a(list);
            this.f7743d.post(new Runnable() { // from class: c.f.a.b.e3.g1.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7526b.i(bArrA, list);
                }
            });
        }
    }

    public y(d dVar) {
        this.f7727c = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f7732h) {
            return;
        }
        try {
            g gVar = this.f7730f;
            if (gVar != null) {
                gVar.close();
            }
            this.f7728d.l();
            Socket socket = this.f7731g;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f7732h = true;
        }
    }

    public void m(Socket socket) {
        this.f7731g = socket;
        this.f7730f = new g(socket.getOutputStream());
        this.f7728d.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void n(int i2, b bVar) {
        this.f7729e.put(Integer.valueOf(i2), bVar);
    }

    public void o(List<String> list) {
        c.f.a.b.j3.g.i(this.f7730f);
        this.f7730f.l(list);
    }
}

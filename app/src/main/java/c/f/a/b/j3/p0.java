package c.f.a.b.j3;

import android.os.SystemClock;
import c.f.a.b.i3.g0;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9256a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9257b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9258c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f9259d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f9260e = "time.android.com";

    public interface b {
        void a(IOException iOException);

        void b();
    }

    public static final class c implements g0.b<g0.e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f9261b;

        public c(b bVar) {
            this.f9261b = bVar;
        }

        @Override // c.f.a.b.i3.g0.b
        public void k(g0.e eVar, long j2, long j3, boolean z) {
        }

        @Override // c.f.a.b.i3.g0.b
        public void m(g0.e eVar, long j2, long j3) {
            if (this.f9261b != null) {
                if (p0.k()) {
                    this.f9261b.b();
                } else {
                    this.f9261b.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // c.f.a.b.i3.g0.b
        public g0.c u(g0.e eVar, long j2, long j3, IOException iOException, int i2) {
            b bVar = this.f9261b;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return c.f.a.b.i3.g0.f8877c;
        }
    }

    public static final class d implements g0.e {
        public d() {
        }

        @Override // c.f.a.b.i3.g0.e
        public void a() {
            synchronized (p0.f9256a) {
                synchronized (p0.f9257b) {
                    if (p0.f9258c) {
                        return;
                    }
                    long jL = p0.l();
                    synchronized (p0.f9257b) {
                        long unused = p0.f9259d = jL;
                        boolean unused2 = p0.f9258c = true;
                    }
                }
            }
        }

        @Override // c.f.a.b.i3.g0.e
        public void c() {
        }
    }

    public static void g(byte b2, byte b3, int i2, long j2) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b3));
        }
        if (i2 != 0 && i2 <= 15) {
            if (j2 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i2);
        }
    }

    public static long h() {
        long j2;
        synchronized (f9257b) {
            j2 = f9258c ? f9259d : -9223372036854775807L;
        }
        return j2;
    }

    public static String i() {
        String str;
        synchronized (f9257b) {
            str = f9260e;
        }
        return str;
    }

    public static void j(c.f.a.b.i3.g0 g0Var, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
            }
        } else {
            if (g0Var == null) {
                g0Var = new c.f.a.b.i3.g0("SntpClient");
            }
            g0Var.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z;
        synchronized (f9257b) {
            z = f9258c;
        }
        return z;
    }

    public static long l() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j2 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b2 = (byte) ((bArr[0] >> 6) & 3);
            byte b3 = (byte) (bArr[0] & 7);
            int i2 = bArr[1] & 255;
            long jN = n(bArr, 24);
            long jN2 = n(bArr, 32);
            long jN3 = n(bArr, 40);
            g(b2, b3, i2, jN3);
            long j3 = (j2 + (((jN2 - jN) + (jN3 - j2)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    datagramSocket.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public static long m(byte[] bArr, int i2) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        return (((long) i3) << 24) + (((long) i4) << 16) + (((long) i5) << 8) + ((long) i6);
    }

    public static long n(byte[] bArr, int i2) {
        long jM = m(bArr, i2);
        long jM2 = m(bArr, i2 + 4);
        if (jM == 0 && jM2 == 0) {
            return 0L;
        }
        return ((jM - 2208988800L) * 1000) + ((jM2 * 1000) / IjkMediaMeta.AV_CH_WIDE_RIGHT);
    }

    public static void o(byte[] bArr, int i2, long j2) {
        if (j2 == 0) {
            Arrays.fill(bArr, i2, i2 + 8, (byte) 0);
            return;
        }
        long j3 = j2 / 1000;
        long j4 = j2 - (j3 * 1000);
        long j5 = j3 + 2208988800L;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j5 >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j5 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j5 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j5 >> 0);
        long j6 = (j4 * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j6 >> 24);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (j6 >> 16);
        bArr[i8] = (byte) (j6 >> 8);
        bArr[i8 + 1] = (byte) (Math.random() * 255.0d);
    }
}

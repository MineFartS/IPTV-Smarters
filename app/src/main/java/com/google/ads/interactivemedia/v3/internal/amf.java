package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class amf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f20113a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20114b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f20115c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f20116d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20117e = "time.android.com";

    public static /* synthetic */ long a() throws Throwable {
        String str;
        long j2;
        synchronized (f20114b) {
            str = f20117e;
        }
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j2 = jCurrentTimeMillis;
            } else {
                long j3 = jCurrentTimeMillis / 1000;
                Long.signum(j3);
                long j4 = jCurrentTimeMillis - (j3 * 1000);
                long j5 = j3 + 2208988800L;
                j2 = jCurrentTimeMillis;
                bArr[40] = (byte) (j5 >> 24);
                try {
                    bArr[41] = (byte) (j5 >> 16);
                    try {
                        bArr[42] = (byte) (j5 >> 8);
                        bArr[43] = (byte) j5;
                        long j6 = (j4 * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
                        bArr[44] = (byte) (j6 >> 24);
                        bArr[45] = (byte) (j6 >> 16);
                        bArr[46] = (byte) (j6 >> 8);
                        bArr[47] = (byte) (Math.random() * 255.0d);
                        datagramSocket = datagramSocket;
                    } catch (Throwable th) {
                        th = th;
                        datagramSocket = datagramSocket;
                        try {
                            datagramSocket.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    datagramSocket = datagramSocket;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j7 = j2 + (jElapsedRealtime2 - jElapsedRealtime);
            byte b2 = bArr[0];
            int i2 = (b2 >> 6) & 3;
            int i3 = b2 & 7;
            int i4 = bArr[1] & 255;
            long jK = k(bArr, 24);
            long jK2 = k(bArr, 32);
            long jK3 = k(bArr, 40);
            if (i2 == 3) {
                throw new IOException("SNTP: Unsynchronized server");
            }
            if (i3 != 4 && i3 != 5) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("SNTP: Untrusted mode: ");
                sb.append(i3);
                throw new IOException(sb.toString());
            }
            if (i4 == 0 || i4 > 15) {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("SNTP: Untrusted stratum: ");
                sb2.append(i4);
                throw new IOException(sb2.toString());
            }
            if (jK3 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
            long j8 = ((jK2 - jK) + (jK3 - j7)) / 2;
            datagramSocket.close();
            return (j7 + j8) - jElapsedRealtime2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static long b() {
        long j2;
        synchronized (f20114b) {
            j2 = f20115c ? f20116d : -9223372036854775807L;
        }
        return j2;
    }

    public static void e(akj akjVar, amc amcVar) {
        if (g()) {
            amcVar.b();
            return;
        }
        if (akjVar == null) {
            akjVar = new akj("SntpClient");
        }
        akjVar.b(new ame(null), new amd(amcVar), 1);
    }

    public static boolean g() {
        boolean z;
        synchronized (f20114b) {
            z = f20115c;
        }
        return z;
    }

    private static long j(byte[] bArr, int i2) {
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

    private static long k(byte[] bArr, int i2) {
        long j2 = j(bArr, i2);
        long j3 = j(bArr, i2 + 4);
        if (j2 == 0 && j3 == 0) {
            return 0L;
        }
        return ((j2 - 2208988800L) * 1000) + ((j3 * 1000) / IjkMediaMeta.AV_CH_WIDE_RIGHT);
    }
}

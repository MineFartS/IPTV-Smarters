package c.f.a.b.i3;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f8938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DatagramPacket f8939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f8940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DatagramSocket f8941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MulticastSocket f8942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InetAddress f8943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InetSocketAddress f8944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8946o;

    public static final class a extends q {
        public a(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public o0() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public o0(int i2) {
        this(i2, 8000);
    }

    public o0(int i2, int i3) {
        super(true);
        this.f8937f = i3;
        byte[] bArr = new byte[i2];
        this.f8938g = bArr;
        this.f8939h = new DatagramPacket(bArr, 0, i2);
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8940i;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        if (this.f8946o == 0) {
            try {
                this.f8941j.receive(this.f8939h);
                int length = this.f8939h.getLength();
                this.f8946o = length;
                v(length);
            } catch (SocketTimeoutException e2) {
                throw new a(e2, AdError.CACHE_ERROR_CODE);
            } catch (IOException e3) {
                throw new a(e3, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f8939h.getLength();
        int i4 = this.f8946o;
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f8938g, length2 - i4, bArr, i2, iMin);
        this.f8946o -= iMin;
        return iMin;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8940i = null;
        MulticastSocket multicastSocket = this.f8942k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f8943l);
            } catch (IOException unused) {
            }
            this.f8942k = null;
        }
        DatagramSocket datagramSocket = this.f8941j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f8941j = null;
        }
        this.f8943l = null;
        this.f8944m = null;
        this.f8946o = 0;
        if (this.f8945n) {
            this.f8945n = false;
            w();
        }
    }

    public int e() {
        DatagramSocket datagramSocket = this.f8941j;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws a {
        DatagramSocket datagramSocket;
        Uri uri = sVar.f9061a;
        this.f8940i = uri;
        String host = uri.getHost();
        int port = this.f8940i.getPort();
        x(sVar);
        try {
            this.f8943l = InetAddress.getByName(host);
            this.f8944m = new InetSocketAddress(this.f8943l, port);
            if (this.f8943l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f8944m);
                this.f8942k = multicastSocket;
                multicastSocket.joinGroup(this.f8943l);
                datagramSocket = this.f8942k;
            } else {
                datagramSocket = new DatagramSocket(this.f8944m);
            }
            this.f8941j = datagramSocket;
            this.f8941j.setSoTimeout(this.f8937f);
            this.f8945n = true;
            y(sVar);
            return -1L;
        } catch (IOException e2) {
            throw new a(e2, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e3) {
            throw new a(e3, AdError.INTERNAL_ERROR_2006);
        }
    }
}

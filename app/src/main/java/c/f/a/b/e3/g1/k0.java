package c.f.a.b.e3.g1;

import android.net.Uri;
import c.f.a.b.e3.g1.y;
import c.f.a.b.j3.x0;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends c.f.a.b.i3.j implements l, y.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f7579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f7581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7582i;

    public k0(long j2) {
        super(true);
        this.f7580g = j2;
        this.f7579f = new LinkedBlockingQueue<>();
        this.f7581h = new byte[0];
        this.f7582i = -1;
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return null;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, this.f7581h.length);
        System.arraycopy(this.f7581h, 0, bArr, i2, iMin);
        int i4 = iMin + 0;
        byte[] bArr2 = this.f7581h;
        this.f7581h = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (i4 == i3) {
            return i4;
        }
        try {
            byte[] bArrPoll = this.f7579f.poll(this.f7580g, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i3 - i4, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i2 + i4, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f7581h = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return i4 + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // c.f.a.b.e3.g1.l
    public String c() {
        c.f.a.b.j3.g.g(this.f7582i != -1);
        return x0.D("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f7582i), Integer.valueOf(this.f7582i + 1));
    }

    @Override // c.f.a.b.i3.p
    public void close() {
    }

    @Override // c.f.a.b.e3.g1.l
    public int e() {
        return this.f7582i;
    }

    @Override // c.f.a.b.e3.g1.y.b
    public void f(byte[] bArr) {
        this.f7579f.add(bArr);
    }

    @Override // c.f.a.b.i3.p
    public long g(c.f.a.b.i3.s sVar) {
        this.f7582i = sVar.f9061a.getPort();
        return -1L;
    }

    @Override // c.f.a.b.e3.g1.l
    public y.b k() {
        return this;
    }
}

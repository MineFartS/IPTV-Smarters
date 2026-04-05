package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rg implements rk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aje f22886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22888d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22891g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f22889e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22885a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    public rg(aje ajeVar, long j2, long j3) {
        this.f22886b = ajeVar;
        this.f22888d = j2;
        this.f22887c = j3;
    }

    private final int o(byte[] bArr, int i2, int i3) {
        int i4 = this.f22891g;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f22889e, 0, bArr, i2, iMin);
        t(iMin);
        return iMin;
    }

    private final int p(byte[] bArr, int i2, int i3, int i4, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iB = this.f22886b.b(bArr, i2 + i4, i3 - i4);
        if (iB != -1) {
            return i4 + iB;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final int q(int i2) {
        int iMin = Math.min(this.f22891g, i2);
        t(iMin);
        return iMin;
    }

    private final void r(int i2) {
        if (i2 != -1) {
            this.f22888d += (long) i2;
        }
    }

    private final void s(int i2) {
        int i3 = this.f22890f + i2;
        int length = this.f22889e.length;
        if (i3 > length) {
            this.f22889e = Arrays.copyOf(this.f22889e, amn.c(length + length, 65536 + i3, i3 + 524288));
        }
    }

    private final void t(int i2) {
        int i3 = this.f22891g - i2;
        this.f22891g = i3;
        this.f22890f = 0;
        byte[] bArr = this.f22889e;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f22889e = bArr2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final int a(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        int iMin;
        s(i3);
        int i4 = this.f22891g;
        int i5 = this.f22890f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            iMin = p(this.f22889e, i5, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f22891g += iMin;
        } else {
            iMin = Math.min(i3, i6);
        }
        System.arraycopy(this.f22889e, this.f22890f, bArr, i2, iMin);
        this.f22890f += iMin;
        return iMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        int iO = o(bArr, i2, i3);
        if (iO == 0) {
            iO = p(bArr, i2, i3, 0, true);
        }
        r(iO);
        return iO;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final long c() {
        return this.f22887c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final long d() {
        return this.f22888d + ((long) this.f22890f);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final long e() {
        return this.f22888d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void f(int i2) throws EOFException, InterruptedIOException {
        k(i2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void g(byte[] bArr, int i2, int i3) {
        l(bArr, i2, i3, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void h(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        m(bArr, i2, i3, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void i() {
        this.f22890f = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void j(int i2) throws EOFException, InterruptedIOException {
        int iQ = q(i2);
        while (iQ < i2 && iQ != -1) {
            iQ = p(this.f22885a, -iQ, Math.min(i2, iQ + ProgressEvent.PART_FAILED_EVENT_CODE), iQ, false);
        }
        r(iQ);
    }

    public final boolean k(int i2, boolean z) throws EOFException, InterruptedIOException {
        s(i2);
        int iP = this.f22891g - this.f22890f;
        while (iP < i2) {
            iP = p(this.f22889e, this.f22890f, i2, iP, z);
            if (iP == -1) {
                return false;
            }
            this.f22891g = this.f22890f + iP;
        }
        this.f22890f += i2;
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final boolean l(byte[] bArr, int i2, int i3, boolean z) {
        if (!k(i3, z)) {
            return false;
        }
        System.arraycopy(this.f22889e, this.f22890f - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final boolean m(byte[] bArr, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        int iO = o(bArr, i2, i3);
        while (iO < i3 && iO != -1) {
            iO = p(bArr, i2, i3, iO, z);
        }
        r(iO);
        return iO != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final int n() throws EOFException, InterruptedIOException {
        int iQ = q(1);
        if (iQ == 0) {
            iQ = p(this.f22885a, 0, Math.min(1, ProgressEvent.PART_FAILED_EVENT_CODE), 0, true);
        }
        r(iQ);
        return iQ;
    }
}

package c.f.a.b.z2;

import c.f.a.b.j3.x0;
import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.i3.l f10758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10760e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10763h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f10761f = new byte[65536];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10757b = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    public g(c.f.a.b.i3.l lVar, long j2, long j3) {
        this.f10758c = lVar;
        this.f10760e = j2;
        this.f10759d = j3;
    }

    public final void A(int i2) {
        int i3 = this.f10763h - i2;
        this.f10763h = i3;
        this.f10762g = 0;
        byte[] bArr = this.f10761f;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f10761f = bArr2;
    }

    @Override // c.f.a.b.z2.k, c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        int iW = w(bArr, i2, i3);
        if (iW == 0) {
            iW = x(bArr, i2, i3, 0, true);
        }
        f(iW);
        return iW;
    }

    @Override // c.f.a.b.z2.k
    public boolean d(byte[] bArr, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        int iW = w(bArr, i2, i3);
        while (iW < i3 && iW != -1) {
            iW = x(bArr, i2, i3, iW, z);
        }
        f(iW);
        return iW != -1;
    }

    public final void f(int i2) {
        if (i2 != -1) {
            this.f10760e += (long) i2;
        }
    }

    @Override // c.f.a.b.z2.k
    public long getLength() {
        return this.f10759d;
    }

    @Override // c.f.a.b.z2.k
    public long getPosition() {
        return this.f10760e;
    }

    @Override // c.f.a.b.z2.k
    public boolean i(byte[] bArr, int i2, int i3, boolean z) {
        if (!t(i3, z)) {
            return false;
        }
        System.arraycopy(this.f10761f, this.f10762g - i3, bArr, i2, i3);
        return true;
    }

    @Override // c.f.a.b.z2.k
    public long j() {
        return this.f10760e + ((long) this.f10762g);
    }

    @Override // c.f.a.b.z2.k
    public void l(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        d(bArr, i2, i3, false);
    }

    @Override // c.f.a.b.z2.k
    public void m(int i2) throws EOFException, InterruptedIOException {
        t(i2, false);
    }

    @Override // c.f.a.b.z2.k
    public int n(int i2) throws EOFException, InterruptedIOException {
        int iY = y(i2);
        if (iY == 0) {
            byte[] bArr = this.f10757b;
            iY = x(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        f(iY);
        return iY;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // c.f.a.b.z2.k
    public <E extends Throwable> void o(long j2, E e2) throws E {
        c.f.a.b.j3.g.a(j2 >= 0);
        this.f10760e = j2;
        throw e2;
    }

    @Override // c.f.a.b.z2.k
    public int p(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        int iMin;
        v(i3);
        int i4 = this.f10763h;
        int i5 = this.f10762g;
        int i6 = i4 - i5;
        if (i6 == 0) {
            iMin = x(this.f10761f, i5, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f10763h += iMin;
        } else {
            iMin = Math.min(i3, i6);
        }
        System.arraycopy(this.f10761f, this.f10762g, bArr, i2, iMin);
        this.f10762g += iMin;
        return iMin;
    }

    @Override // c.f.a.b.z2.k
    public void r() {
        this.f10762g = 0;
    }

    @Override // c.f.a.b.z2.k
    public void s(int i2) throws EOFException, InterruptedIOException {
        z(i2, false);
    }

    @Override // c.f.a.b.z2.k
    public boolean t(int i2, boolean z) throws EOFException, InterruptedIOException {
        v(i2);
        int iX = this.f10763h - this.f10762g;
        while (iX < i2) {
            iX = x(this.f10761f, this.f10762g, i2, iX, z);
            if (iX == -1) {
                return false;
            }
            this.f10763h = this.f10762g + iX;
        }
        this.f10762g += i2;
        return true;
    }

    @Override // c.f.a.b.z2.k
    public void u(byte[] bArr, int i2, int i3) {
        i(bArr, i2, i3, false);
    }

    public final void v(int i2) {
        int i3 = this.f10762g + i2;
        byte[] bArr = this.f10761f;
        if (i3 > bArr.length) {
            this.f10761f = Arrays.copyOf(this.f10761f, x0.r(bArr.length * 2, 65536 + i3, i3 + 524288));
        }
    }

    public final int w(byte[] bArr, int i2, int i3) {
        int i4 = this.f10763h;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f10761f, 0, bArr, i2, iMin);
        A(iMin);
        return iMin;
    }

    public final int x(byte[] bArr, int i2, int i3, int i4, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iB = this.f10758c.b(bArr, i2 + i4, i3 - i4);
        if (iB != -1) {
            return i4 + iB;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int y(int i2) {
        int iMin = Math.min(this.f10763h, i2);
        A(iMin);
        return iMin;
    }

    public boolean z(int i2, boolean z) throws EOFException, InterruptedIOException {
        int iY = y(i2);
        while (iY < i2 && iY != -1) {
            iY = x(this.f10757b, -iY, Math.min(i2, this.f10757b.length + iY), iY, z);
        }
        f(iY);
        return iY != -1;
    }
}

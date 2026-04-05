package c.f.a.b.e3;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements c.f.a.b.i3.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.p f8051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f8054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8055f;

    public interface a {
        void b(c.f.a.b.j3.i0 i0Var);
    }

    public z(c.f.a.b.i3.p pVar, int i2, a aVar) {
        c.f.a.b.j3.g.a(i2 > 0);
        this.f8051b = pVar;
        this.f8052c = i2;
        this.f8053d = aVar;
        this.f8054e = new byte[1];
        this.f8055f = i2;
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8051b.a();
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        if (this.f8055f == 0) {
            if (!f()) {
                return -1;
            }
            this.f8055f = this.f8052c;
        }
        int iB = this.f8051b.b(bArr, i2, Math.min(this.f8055f, i3));
        if (iB != -1) {
            this.f8055f -= iB;
        }
        return iB;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        throw new UnsupportedOperationException();
    }

    public final boolean f() {
        if (this.f8051b.b(this.f8054e, 0, 1) == -1) {
            return false;
        }
        int i2 = (this.f8054e[0] & 255) << 4;
        if (i2 == 0) {
            return true;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2;
        int i4 = 0;
        while (i3 > 0) {
            int iB = this.f8051b.b(bArr, i4, i3);
            if (iB == -1) {
                return false;
            }
            i4 += iB;
            i3 -= iB;
        }
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        if (i2 > 0) {
            this.f8053d.b(new c.f.a.b.j3.i0(bArr, i2));
        }
        return true;
    }

    @Override // c.f.a.b.i3.p
    public long g(c.f.a.b.i3.s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.a.b.i3.p
    public void h(c.f.a.b.i3.n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        this.f8051b.h(n0Var);
    }

    @Override // c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        return this.f8051b.q();
    }
}

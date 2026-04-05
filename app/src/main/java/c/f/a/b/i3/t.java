package c.f.a.b.i3;

import c.f.a.b.j3.x0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e[] f9085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e[] f9089h;

    public t(boolean z, int i2) {
        this(z, i2, 0);
    }

    public t(boolean z, int i2, int i3) {
        c.f.a.b.j3.g.a(i2 > 0);
        c.f.a.b.j3.g.a(i3 >= 0);
        this.f9082a = z;
        this.f9083b = i2;
        this.f9088g = i3;
        this.f9089h = new e[i3 + 100];
        if (i3 > 0) {
            this.f9084c = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.f9089h[i4] = new e(this.f9084c, i4 * i2);
            }
        } else {
            this.f9084c = null;
        }
        this.f9085d = new e[1];
    }

    @Override // c.f.a.b.i3.f
    public synchronized void a(e eVar) {
        e[] eVarArr = this.f9085d;
        eVarArr[0] = eVar;
        d(eVarArr);
    }

    @Override // c.f.a.b.i3.f
    public synchronized e b() {
        e eVar;
        this.f9087f++;
        int i2 = this.f9088g;
        if (i2 > 0) {
            e[] eVarArr = this.f9089h;
            int i3 = i2 - 1;
            this.f9088g = i3;
            eVar = (e) c.f.a.b.j3.g.e(eVarArr[i3]);
            this.f9089h[this.f9088g] = null;
        } else {
            eVar = new e(new byte[this.f9083b], 0);
        }
        return eVar;
    }

    @Override // c.f.a.b.i3.f
    public synchronized void c() {
        int i2 = 0;
        int iMax = Math.max(0, x0.k(this.f9086e, this.f9083b) - this.f9087f);
        int i3 = this.f9088g;
        if (iMax >= i3) {
            return;
        }
        if (this.f9084c != null) {
            int i4 = i3 - 1;
            while (i2 <= i4) {
                e eVar = (e) c.f.a.b.j3.g.e(this.f9089h[i2]);
                if (eVar.f8858a == this.f9084c) {
                    i2++;
                } else {
                    e eVar2 = (e) c.f.a.b.j3.g.e(this.f9089h[i4]);
                    if (eVar2.f8858a != this.f9084c) {
                        i4--;
                    } else {
                        e[] eVarArr = this.f9089h;
                        eVarArr[i2] = eVar2;
                        eVarArr[i4] = eVar;
                        i4--;
                        i2++;
                    }
                }
            }
            iMax = Math.max(iMax, i2);
            if (iMax >= this.f9088g) {
                return;
            }
        }
        Arrays.fill(this.f9089h, iMax, this.f9088g, (Object) null);
        this.f9088g = iMax;
    }

    @Override // c.f.a.b.i3.f
    public synchronized void d(e[] eVarArr) {
        int i2 = this.f9088g;
        int length = eVarArr.length + i2;
        e[] eVarArr2 = this.f9089h;
        if (length >= eVarArr2.length) {
            this.f9089h = (e[]) Arrays.copyOf(eVarArr2, Math.max(eVarArr2.length * 2, i2 + eVarArr.length));
        }
        for (e eVar : eVarArr) {
            e[] eVarArr3 = this.f9089h;
            int i3 = this.f9088g;
            this.f9088g = i3 + 1;
            eVarArr3[i3] = eVar;
        }
        this.f9087f -= eVarArr.length;
        notifyAll();
    }

    @Override // c.f.a.b.i3.f
    public int e() {
        return this.f9083b;
    }

    public synchronized int f() {
        return this.f9087f * this.f9083b;
    }

    public synchronized void g() {
        if (this.f9082a) {
            h(0);
        }
    }

    public synchronized void h(int i2) {
        boolean z = i2 < this.f9086e;
        this.f9086e = i2;
        if (z) {
            c();
        }
    }
}

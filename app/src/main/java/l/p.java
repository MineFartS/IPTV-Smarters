package l;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f31084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f31089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f31090g;

    public p() {
        this.f31084a = new byte[8192];
        this.f31088e = true;
        this.f31087d = false;
    }

    public p(p pVar) {
        this(pVar.f31084a, pVar.f31085b, pVar.f31086c);
        pVar.f31087d = true;
    }

    public p(byte[] bArr, int i2, int i3) {
        this.f31084a = bArr;
        this.f31085b = i2;
        this.f31086c = i3;
        this.f31088e = false;
        this.f31087d = true;
    }

    public void a() {
        p pVar = this.f31090g;
        if (pVar == this) {
            throw new IllegalStateException();
        }
        if (pVar.f31088e) {
            int i2 = this.f31086c - this.f31085b;
            if (i2 > (8192 - pVar.f31086c) + (pVar.f31087d ? 0 : pVar.f31085b)) {
                return;
            }
            e(pVar, i2);
            b();
            q.a(this);
        }
    }

    @Nullable
    public p b() {
        p pVar = this.f31089f;
        p pVar2 = pVar != this ? pVar : null;
        p pVar3 = this.f31090g;
        pVar3.f31089f = pVar;
        this.f31089f.f31090g = pVar3;
        this.f31089f = null;
        this.f31090g = null;
        return pVar2;
    }

    public p c(p pVar) {
        pVar.f31090g = this;
        pVar.f31089f = this.f31089f;
        this.f31089f.f31090g = pVar;
        this.f31089f = pVar;
        return pVar;
    }

    public p d(int i2) {
        p pVarB;
        if (i2 <= 0 || i2 > this.f31086c - this.f31085b) {
            throw new IllegalArgumentException();
        }
        if (i2 >= 1024) {
            pVarB = new p(this);
        } else {
            pVarB = q.b();
            System.arraycopy(this.f31084a, this.f31085b, pVarB.f31084a, 0, i2);
        }
        pVarB.f31086c = pVarB.f31085b + i2;
        this.f31085b += i2;
        this.f31090g.c(pVarB);
        return pVarB;
    }

    public void e(p pVar, int i2) {
        if (!pVar.f31088e) {
            throw new IllegalArgumentException();
        }
        int i3 = pVar.f31086c;
        if (i3 + i2 > 8192) {
            if (pVar.f31087d) {
                throw new IllegalArgumentException();
            }
            int i4 = pVar.f31085b;
            if ((i3 + i2) - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = pVar.f31084a;
            System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
            pVar.f31086c -= pVar.f31085b;
            pVar.f31085b = 0;
        }
        System.arraycopy(this.f31084a, this.f31085b, pVar.f31084a, pVar.f31086c, i2);
        pVar.f31086c += i2;
        this.f31085b += i2;
    }
}

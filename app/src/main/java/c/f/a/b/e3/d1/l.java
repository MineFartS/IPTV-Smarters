package c.f.a.b.e3.d1;

import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f7053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f7054k;

    public l(c.f.a.b.i3.p pVar, s sVar, int i2, k1 k1Var, int i3, Object obj, byte[] bArr) {
        l lVar;
        byte[] bArr2;
        super(pVar, sVar, i2, k1Var, i3, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = x0.f9301f;
            lVar = this;
        } else {
            lVar = this;
            bArr2 = bArr;
        }
        lVar.f7053j = bArr2;
    }

    @Override // c.f.a.b.i3.g0.e
    public final void a() {
        try {
            this.f7030i.g(this.f7023b);
            int iB = 0;
            int i2 = 0;
            while (iB != -1 && !this.f7054k) {
                i(i2);
                iB = this.f7030i.b(this.f7053j, i2, 16384);
                if (iB != -1) {
                    i2 += iB;
                }
            }
            if (!this.f7054k) {
                g(this.f7053j, i2);
            }
        } finally {
            x0.n(this.f7030i);
        }
    }

    @Override // c.f.a.b.i3.g0.e
    public final void c() {
        this.f7054k = true;
    }

    public abstract void g(byte[] bArr, int i2);

    public byte[] h() {
        return this.f7053j;
    }

    public final void i(int i2) {
        byte[] bArr = this.f7053j;
        if (bArr.length < i2 + 16384) {
            this.f7053j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}

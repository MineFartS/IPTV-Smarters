package c.f.a.b.i3;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f8933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f8934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8936e;

    public m0(p pVar, n nVar) {
        this.f8933b = (p) c.f.a.b.j3.g.e(pVar);
        this.f8934c = (n) c.f.a.b.j3.g.e(nVar);
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8933b.a();
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        if (this.f8936e == 0) {
            return -1;
        }
        int iB = this.f8933b.b(bArr, i2, i3);
        if (iB > 0) {
            this.f8934c.f(bArr, i2, iB);
            long j2 = this.f8936e;
            if (j2 != -1) {
                this.f8936e = j2 - ((long) iB);
            }
        }
        return iB;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        try {
            this.f8933b.close();
        } finally {
            if (this.f8935d) {
                this.f8935d = false;
                this.f8934c.close();
            }
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) {
        long jG = this.f8933b.g(sVar);
        this.f8936e = jG;
        if (jG == 0) {
            return 0L;
        }
        if (sVar.f9068h == -1 && jG != -1) {
            sVar = sVar.f(0L, jG);
        }
        this.f8935d = true;
        this.f8934c.g(sVar);
        return this.f8936e;
    }

    @Override // c.f.a.b.i3.p
    public void h(n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        this.f8933b.h(n0Var);
    }

    @Override // c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        return this.f8933b.q();
    }
}

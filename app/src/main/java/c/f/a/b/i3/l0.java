package c.f.a.b.i3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f8925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f8927d = Uri.EMPTY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, List<String>> f8928e = Collections.emptyMap();

    public l0(p pVar) {
        this.f8925b = (p) c.f.a.b.j3.g.e(pVar);
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8925b.a();
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        int iB = this.f8925b.b(bArr, i2, i3);
        if (iB != -1) {
            this.f8926c += (long) iB;
        }
        return iB;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8925b.close();
    }

    public long f() {
        return this.f8926c;
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) {
        this.f8927d = sVar.f9061a;
        this.f8928e = Collections.emptyMap();
        long jG = this.f8925b.g(sVar);
        this.f8927d = (Uri) c.f.a.b.j3.g.e(a());
        this.f8928e = q();
        return jG;
    }

    @Override // c.f.a.b.i3.p
    public void h(n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        this.f8925b.h(n0Var);
    }

    @Override // c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        return this.f8925b.q();
    }

    public Uri v() {
        return this.f8927d;
    }

    public Map<String, List<String>> w() {
        return this.f8928e;
    }

    public void x() {
        this.f8926c = 0L;
    }
}

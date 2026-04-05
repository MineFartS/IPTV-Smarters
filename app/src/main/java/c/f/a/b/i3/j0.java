package c.f.a.b.i3;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f8909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.k0 f8910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8911d;

    public j0(p pVar, c.f.a.b.j3.k0 k0Var, int i2) {
        this.f8909b = (p) c.f.a.b.j3.g.e(pVar);
        this.f8910c = (c.f.a.b.j3.k0) c.f.a.b.j3.g.e(k0Var);
        this.f8911d = i2;
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8909b.a();
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        this.f8910c.c(this.f8911d);
        return this.f8909b.b(bArr, i2, i3);
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8909b.close();
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) {
        this.f8910c.c(this.f8911d);
        return this.f8909b.g(sVar);
    }

    @Override // c.f.a.b.i3.p
    public void h(n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        this.f8909b.h(n0Var);
    }

    @Override // c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        return this.f8909b.q();
    }
}

package c.d.a.n.k.i;

import c.d.a.n.i.l;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class e implements c.d.a.n.e<InputStream, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.e<c.d.a.n.j.g, a> f5843a;

    public e(c.d.a.n.e<c.d.a.n.j.g, a> eVar) {
        this.f5843a = eVar;
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<a> a(InputStream inputStream, int i2, int i3) {
        return this.f5843a.a(new c.d.a.n.j.g(inputStream, null), i2, i3);
    }

    @Override // c.d.a.n.e
    public String getId() {
        return this.f5843a.getId();
    }
}

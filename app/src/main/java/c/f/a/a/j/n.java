package c.f.a.a.j;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n implements c.f.a.a.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<c.f.a.a.b> f6185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f6186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f6187c;

    public n(Set<c.f.a.a.b> set, m mVar, q qVar) {
        this.f6185a = set;
        this.f6186b = mVar;
        this.f6187c = qVar;
    }

    @Override // c.f.a.a.g
    public <T> c.f.a.a.f<T> a(String str, Class<T> cls, c.f.a.a.e<T, byte[]> eVar) {
        return b(str, cls, c.f.a.a.b.b("proto"), eVar);
    }

    @Override // c.f.a.a.g
    public <T> c.f.a.a.f<T> b(String str, Class<T> cls, c.f.a.a.b bVar, c.f.a.a.e<T, byte[]> eVar) {
        if (this.f6185a.contains(bVar)) {
            return new p(this.f6186b, str, bVar, eVar, this.f6187c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f6185a));
    }
}

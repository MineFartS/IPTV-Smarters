package c.d.a.n.j;

import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class r<T> implements l<URL, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<d, T> f5702a;

    public r(l<d, T> lVar) {
        this.f5702a = lVar;
    }

    @Override // c.d.a.n.j.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.h.c<T> a(URL url, int i2, int i3) {
        return this.f5702a.a(new d(url), i2, i3);
    }
}

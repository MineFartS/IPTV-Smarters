package c.d.a.r.g;

import c.d.a.r.g.c;

/* JADX INFO: loaded from: classes.dex */
public class e<R> implements c<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e<?> f5923a = new e<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d<?> f5924b = new a();

    public static class a<R> implements d<R> {
        @Override // c.d.a.r.g.d
        public c<R> a(boolean z, boolean z2) {
            return e.f5923a;
        }
    }

    public static <R> c<R> c() {
        return f5923a;
    }

    public static <R> d<R> d() {
        return (d<R>) f5924b;
    }

    @Override // c.d.a.r.g.c
    public boolean a(Object obj, c.a aVar) {
        return false;
    }
}

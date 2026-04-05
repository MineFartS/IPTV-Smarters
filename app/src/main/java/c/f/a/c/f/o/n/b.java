package c.f.a.c.f.o.n;

import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b<O extends a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.f.o.a<O> f12366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f12367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12368d;

    public b(c.f.a.c.f.o.a<O> aVar, O o2, String str) {
        this.f12366b = aVar;
        this.f12367c = o2;
        this.f12368d = str;
        this.f12365a = c.f.a.c.f.q.n.b(aVar, o2, str);
    }

    @RecentlyNonNull
    public static <O extends a.d> b<O> a(@RecentlyNonNull c.f.a.c.f.o.a<O> aVar, O o2, String str) {
        return new b<>(aVar, o2, str);
    }

    @RecentlyNonNull
    public final String b() {
        return this.f12366b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c.f.a.c.f.q.n.a(this.f12366b, bVar.f12366b) && c.f.a.c.f.q.n.a(this.f12367c, bVar.f12367c) && c.f.a.c.f.q.n.a(this.f12368d, bVar.f12368d);
    }

    public final int hashCode() {
        return this.f12365a;
    }
}

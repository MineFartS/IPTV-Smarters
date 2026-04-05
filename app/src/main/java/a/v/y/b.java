package a.v.y;

import a.v.l;
import android.annotation.SuppressLint;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Integer> f3689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.k.b.c f3690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3691c;

    /* JADX INFO: renamed from: a.v.y.b$b, reason: collision with other inner class name */
    public static final class C0085b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Integer> f3692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.k.b.c f3693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f3694c;

        public C0085b(l lVar) {
            HashSet hashSet = new HashSet();
            this.f3692a = hashSet;
            hashSet.add(Integer.valueOf(a.v.y.c.a(lVar).v()));
        }

        @SuppressLint({"SyntheticAccessor"})
        public b a() {
            return new b(this.f3692a, this.f3693b, this.f3694c);
        }
    }

    public interface c {
        boolean a();
    }

    public b(Set<Integer> set, a.k.b.c cVar, c cVar2) {
        this.f3689a = set;
        this.f3690b = cVar;
        this.f3691c = cVar2;
    }

    public c a() {
        return this.f3691c;
    }

    public a.k.b.c b() {
        return this.f3690b;
    }

    public Set<Integer> c() {
        return this.f3689a;
    }
}

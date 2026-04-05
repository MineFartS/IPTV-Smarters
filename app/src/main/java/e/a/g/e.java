package e.a.g;

import e.a.g.e.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class e<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<T> f30345a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30346b = false;

    public interface a<T extends b> {
        void a(T t, Object obj);
    }

    public static abstract class b<T, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<T> f30347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S f30348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30349c = false;

        public b(T t, S s) {
            this.f30348b = s;
            this.f30347a = new WeakReference<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30348b.equals(bVar.f30348b) && this.f30347a.get() == bVar.f30347a.get();
        }

        public int hashCode() {
            T t = this.f30347a.get();
            int iHashCode = (527 + (t != null ? t.hashCode() : 0)) * 31;
            S s = this.f30348b;
            return iHashCode + (s != null ? s.hashCode() : 0);
        }
    }

    public void a(T t) {
        if (!this.f30345a.contains(t)) {
            this.f30345a.add(t);
            t.f30349c = false;
        }
        if (this.f30346b) {
            this.f30346b = false;
        }
    }

    public void b() {
        this.f30346b = true;
        this.f30345a.clear();
    }

    public void c(a<T> aVar) {
        for (T t : this.f30345a) {
            if (this.f30346b) {
                return;
            }
            Object obj = t.f30347a.get();
            if (obj == null) {
                this.f30345a.remove(t);
            } else if (!t.f30349c) {
                aVar.a(t, obj);
            }
        }
    }

    public boolean d() {
        return this.f30345a.isEmpty();
    }

    public <S, U> void e(S s, U u) {
        for (T t : this.f30345a) {
            if (s == t.f30347a.get() && u.equals(t.f30348b)) {
                t.f30349c = true;
                this.f30345a.remove(t);
                return;
            }
        }
    }

    public void f(Object obj) {
        for (T t : this.f30345a) {
            Object obj2 = t.f30347a.get();
            if (obj2 == null || obj2 == obj) {
                t.f30349c = true;
                this.f30345a.remove(t);
            }
        }
    }

    public int g() {
        return this.f30345a.size();
    }
}

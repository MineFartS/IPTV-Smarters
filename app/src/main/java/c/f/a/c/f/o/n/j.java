package c.f.a.c.f.o.n;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes2.dex */
public final class j<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f12423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile L f12424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a<L> f12425c;

    public static final class a<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L f12426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12427b;

        public a(L l2, String str) {
            this.f12426a = l2;
            this.f12427b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12426a == aVar.f12426a && this.f12427b.equals(aVar.f12427b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12426a) * 31) + this.f12427b.hashCode();
        }
    }

    public interface b<L> {
        void a(@RecentlyNonNull L l2);

        void b();
    }

    public j(Looper looper, L l2, String str) {
        this.f12423a = new k0(this, looper);
        this.f12424b = (L) c.f.a.c.f.q.o.j(l2, "Listener must not be null");
        this.f12425c = new a<>(l2, c.f.a.c.f.q.o.e(str));
    }

    public void a() {
        this.f12424b = null;
        this.f12425c = null;
    }

    @RecentlyNullable
    public a<L> b() {
        return this.f12425c;
    }

    public void c(b<? super L> bVar) {
        L l2 = this.f12424b;
        if (l2 == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(l2);
        } catch (RuntimeException e2) {
            bVar.b();
            throw e2;
        }
    }
}

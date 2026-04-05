package c.d.a.n.j;

import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class k<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.t.e<b<A>, B> f5691a;

    public class a extends c.d.a.t.e<b<A>, B> {
        public a(int i2) {
            super(i2);
        }

        @Override // c.d.a.t.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b2) {
            bVar.c();
        }
    }

    public static final class b<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Queue<b<?>> f5693a = c.d.a.t.h.c(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public A f5696d;

        public static <A> b<A> a(A a2, int i2, int i3) {
            b<A> bVar = (b) f5693a.poll();
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a2, i2, i3);
            return bVar;
        }

        public final void b(A a2, int i2, int i3) {
            this.f5696d = a2;
            this.f5695c = i2;
            this.f5694b = i3;
        }

        public void c() {
            f5693a.offer(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5695c == bVar.f5695c && this.f5694b == bVar.f5694b && this.f5696d.equals(bVar.f5696d);
        }

        public int hashCode() {
            return (((this.f5694b * 31) + this.f5695c) * 31) + this.f5696d.hashCode();
        }
    }

    public k(int i2) {
        this.f5691a = new a(i2);
    }

    public B a(A a2, int i2, int i3) {
        b<A> bVarA = b.a(a2, i2, i3);
        B bG = this.f5691a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a2, int i2, int i3, B b2) {
        this.f5691a.k(b.a(a2, i2, i3), b2);
    }
}

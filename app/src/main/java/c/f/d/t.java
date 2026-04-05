package c.f.d;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t<T> {

    public class a extends t<T> {
        public a() {
        }

        @Override // c.f.d.t
        public T b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return (T) t.this.b(aVar);
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        public void d(c.f.d.y.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.v();
            } else {
                t.this.d(cVar, t);
            }
        }
    }

    public final t<T> a() {
        return new a();
    }

    public abstract T b(c.f.d.y.a aVar);

    public final j c(T t) {
        try {
            c.f.d.w.n.f fVar = new c.f.d.w.n.f();
            d(fVar, t);
            return fVar.H0();
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public abstract void d(c.f.d.y.c cVar, T t);
}

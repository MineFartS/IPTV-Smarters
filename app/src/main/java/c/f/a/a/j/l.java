package c.f.a.a.j;

import c.f.a.a.j.b;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class l {

    @AutoValue.Builder
    public static abstract class a {
        public abstract l a();

        public abstract a b(c.f.a.a.b bVar);

        public abstract a c(c.f.a.a.c<?> cVar);

        public abstract a d(c.f.a.a.e<?, byte[]> eVar);

        public abstract a e(m mVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new b.C0119b();
    }

    public abstract c.f.a.a.b b();

    public abstract c.f.a.a.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract c.f.a.a.e<?, byte[]> e();

    public abstract m f();

    public abstract String g();
}

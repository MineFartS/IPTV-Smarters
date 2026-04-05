package c.f.c.s;

import c.f.c.s.a;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class l {

    @AutoValue.Builder
    public static abstract class a {
        public abstract l a();

        public abstract a b(String str);

        public abstract a c(long j2);

        public abstract a d(long j2);
    }

    public static a a() {
        return new a.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}

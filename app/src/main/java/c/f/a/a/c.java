package c.f.a.a;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class c<T> {
    public static <T> c<T> d(int i2, T t) {
        return new a(Integer.valueOf(i2), t, d.DEFAULT);
    }

    public static <T> c<T> e(int i2, T t) {
        return new a(Integer.valueOf(i2), t, d.VERY_LOW);
    }

    public static <T> c<T> f(T t) {
        return new a(null, t, d.VERY_LOW);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}

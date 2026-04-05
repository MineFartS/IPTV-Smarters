package c.e.b.a.a.f;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> extends Property<T, Integer> {
    public c(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(T t, Integer num) {
        b(t, num.intValue());
    }

    public abstract void b(T t, int i2);
}

package c.e.b.a.a.f;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends Property<T, Float> {
    public b(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(T t, Float f2) {
        b(t, f2.floatValue());
    }

    public abstract void b(T t, float f2);
}

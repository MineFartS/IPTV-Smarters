package c.d.a.n.k.f;

import android.graphics.drawable.Drawable;
import c.d.a.n.i.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends Drawable> implements l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f5765a;

    public a(T t) {
        if (t == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.f5765a = t;
    }

    @Override // c.d.a.n.i.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T get() {
        return (T) this.f5765a.getConstantState().newDrawable();
    }
}

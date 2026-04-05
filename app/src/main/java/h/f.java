package h;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f<T> implements c<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h.l.b.a<? extends T> f30358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f30359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30360d;

    public f(@NotNull h.l.b.a<? extends T> aVar, @Nullable Object obj) {
        h.l.c.g.c(aVar, "initializer");
        this.f30358b = aVar;
        this.f30359c = i.f30361a;
        this.f30360d = obj == null ? this : obj;
    }

    public /* synthetic */ f(h.l.b.a aVar, Object obj, int i2, h.l.c.e eVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f30359c != i.f30361a;
    }

    @Override // h.c
    public T getValue() {
        T tInvoke;
        T t = (T) this.f30359c;
        i iVar = i.f30361a;
        if (t != iVar) {
            return t;
        }
        synchronized (this.f30360d) {
            tInvoke = (T) this.f30359c;
            if (tInvoke == iVar) {
                h.l.b.a<? extends T> aVar = this.f30358b;
                if (aVar == null) {
                    h.l.c.g.f();
                }
                tInvoke = aVar.invoke();
                this.f30359c = tInvoke;
                this.f30358b = null;
            }
        }
        return tInvoke;
    }

    @NotNull
    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

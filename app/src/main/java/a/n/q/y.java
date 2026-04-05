package a.n.q;

import android.database.Observable;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2980a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f2982c;

    public static final class a extends Observable<b> {
        public void a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    public static abstract class b {
        public void a() {
        }
    }

    public y(h0 h0Var) {
        h(new u0(h0Var));
    }

    public abstract Object a(int i2);

    public long b(int i2) {
        return -1L;
    }

    public final i0 c() {
        return this.f2982c;
    }

    public final boolean d() {
        return this.f2981b;
    }

    public final void e() {
        this.f2980a.a();
    }

    public void f() {
    }

    public final void g(b bVar) {
        this.f2980a.registerObserver(bVar);
    }

    public final void h(i0 i0Var) {
        if (i0Var == null) {
            throw new IllegalArgumentException("Presenter selector must not be null");
        }
        i0 i0Var2 = this.f2982c;
        boolean z = i0Var2 != null;
        boolean z2 = z && i0Var2 != i0Var;
        this.f2982c = i0Var;
        if (z2) {
            f();
        }
        if (z) {
            e();
        }
    }

    public abstract int i();

    public final void j(b bVar) {
        this.f2980a.unregisterObserver(bVar);
    }
}

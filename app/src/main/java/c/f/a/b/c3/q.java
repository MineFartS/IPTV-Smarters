package c.f.a.b.c3;

import android.util.SparseArray;
import c.f.a.b.i3.p0.d;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class q implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray<Constructor<? extends c0>> f6763a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.c f6764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6765c;

    public q(d.c cVar, Executor executor) {
        this.f6764b = (d.c) c.f.a.b.j3.g.e(cVar);
        this.f6765c = (Executor) c.f.a.b.j3.g.e(executor);
    }

    public static SparseArray<Constructor<? extends c0>> c() {
        SparseArray<Constructor<? extends c0>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, d(Class.forName("c.f.a.b.e3.e1.q.a")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, d(Class.forName("c.f.a.b.e3.f1.w.a")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, d(Class.forName("c.f.a.b.e3.h1.g.a")));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    public static Constructor<? extends c0> d(Class<?> cls) {
        try {
            return cls.asSubclass(c0.class).getConstructor(p1.class, d.c.class, Executor.class);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Downloader constructor missing", e2);
        }
    }

    @Override // c.f.a.b.c3.d0
    public c0 a(a0 a0Var) {
        int iO0 = x0.o0(a0Var.f6664c, a0Var.f6665d);
        if (iO0 == 0 || iO0 == 1 || iO0 == 2) {
            return b(a0Var, iO0);
        }
        if (iO0 == 4) {
            return new g0(new p1.c().B(a0Var.f6664c).g(a0Var.f6668g).a(), this.f6764b, this.f6765c);
        }
        throw new IllegalArgumentException("Unsupported type: " + iO0);
    }

    public final c0 b(a0 a0Var, int i2) {
        Constructor<? extends c0> constructor = f6763a.get(i2);
        if (constructor == null) {
            throw new IllegalStateException("Module missing for content type " + i2);
        }
        try {
            return constructor.newInstance(new p1.c().B(a0Var.f6664c).y(a0Var.f6666e).g(a0Var.f6668g).i(a0Var.f6667f).a(), this.f6764b, this.f6765c);
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to instantiate downloader for content type " + i2);
        }
    }
}

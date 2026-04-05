package c.f.d.w.o;

import c.f.d.w.e;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16631a;

    static {
        f16631a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f16631a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}

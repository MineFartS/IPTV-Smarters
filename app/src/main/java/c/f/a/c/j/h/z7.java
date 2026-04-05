package c.f.a.c.j.h;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z7 f13687a = new z7();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, c8<?>> f13689c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8 f13688b = new i7();

    public static z7 a() {
        return f13687a;
    }

    public final <T> c8<T> b(Class<T> cls) {
        u6.b(cls, "messageType");
        c8<T> c8VarA = (c8) this.f13689c.get(cls);
        if (c8VarA == null) {
            c8VarA = this.f13688b.a(cls);
            u6.b(cls, "messageType");
            u6.b(c8VarA, "schema");
            c8<T> c8Var = (c8) this.f13689c.putIfAbsent(cls, c8VarA);
            if (c8Var != null) {
                return c8Var;
            }
        }
        return c8VarA;
    }
}

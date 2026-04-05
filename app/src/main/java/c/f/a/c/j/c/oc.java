package c.f.a.c.j.c;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oc f13012a = new oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, pc<?>> f13014c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sc f13013b = new ob();

    public static oc b() {
        return f13012a;
    }

    public final <T> pc<T> a(Class<T> cls) {
        sa.d(cls, "messageType");
        pc<T> pcVar = (pc) this.f13014c.get(cls);
        if (pcVar != null) {
            return pcVar;
        }
        pc<T> pcVarA = this.f13013b.a(cls);
        sa.d(cls, "messageType");
        sa.d(pcVarA, "schema");
        pc<T> pcVar2 = (pc) this.f13014c.putIfAbsent(cls, pcVarA);
        return pcVar2 != null ? pcVar2 : pcVarA;
    }

    public final <T> pc<T> c(T t) {
        return a(t.getClass());
    }
}

package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class lb extends kb {
    public lb() {
        super();
    }

    public static <E> xa<E> e(Object obj, long j2) {
        return (xa) nd.G(obj, j2);
    }

    @Override // c.f.a.c.j.c.kb
    public final void a(Object obj, long j2) {
        e(obj, j2).l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [c.f.a.c.j.c.xa, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // c.f.a.c.j.c.kb
    public final <E> void b(Object obj, Object obj2, long j2) {
        xa xaVarE = e(obj, j2);
        ?? E = e(obj2, j2);
        int size = xaVarE.size();
        int size2 = E.size();
        ?? r0 = xaVarE;
        r0 = xaVarE;
        if (size > 0 && size2 > 0) {
            boolean z = xaVarE.z();
            ?? E2 = xaVarE;
            if (!z) {
                E2 = xaVarE.E(size2 + size);
            }
            E2.addAll(E);
            r0 = E2;
        }
        if (size > 0) {
            E = r0;
        }
        nd.g(obj, j2, E);
    }
}

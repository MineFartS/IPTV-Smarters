package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d7 extends e7 {
    public /* synthetic */ d7(b7 b7Var) {
        super(null);
    }

    @Override // c.f.a.c.j.h.e7
    public final void a(Object obj, long j2) {
        ((t6) c9.y(obj, j2)).k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [c.f.a.c.j.h.t6, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // c.f.a.c.j.h.e7
    public final <E> void b(Object obj, Object obj2, long j2) {
        t6 t6Var = (t6) c9.y(obj, j2);
        ?? r6 = (t6) c9.y(obj2, j2);
        int size = t6Var.size();
        int size2 = r6.size();
        ?? r0 = t6Var;
        r0 = t6Var;
        if (size > 0 && size2 > 0) {
            boolean zZza = t6Var.zza();
            ?? N = t6Var;
            if (!zZza) {
                N = t6Var.n(size2 + size);
            }
            N.addAll(r6);
            r0 = N;
        }
        if (size > 0) {
            r6 = r0;
        }
        c9.z(obj, j2, r6);
    }
}

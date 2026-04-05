package c.f.a.c.j.h;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c7 extends e7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f13237c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ c7(b7 b7Var) {
        super(null);
    }

    @Override // c.f.a.c.j.h.e7
    public final void a(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) c9.y(obj, j2);
        if (list instanceof a7) {
            objUnmodifiableList = ((a7) list).o();
        } else {
            if (f13237c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof y7) && (list instanceof t6)) {
                t6 t6Var = (t6) list;
                if (t6Var.zza()) {
                    t6Var.k();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        c9.z(obj, j2, objUnmodifiableList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // c.f.a.c.j.h.e7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E> void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = c.f.a.c.j.h.c9.y(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = c.f.a.c.j.h.c9.y(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof c.f.a.c.j.h.a7
            if (r2 == 0) goto L20
            c.f.a.c.j.h.z6 r1 = new c.f.a.c.j.h.z6
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof c.f.a.c.j.h.y7
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof c.f.a.c.j.h.t6
            if (r2 == 0) goto L30
            c.f.a.c.j.h.t6 r1 = (c.f.a.c.j.h.t6) r1
            c.f.a.c.j.h.t6 r0 = r1.n(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            c.f.a.c.j.h.c9.z(r5, r7, r1)
            goto L8a
        L39:
            java.lang.Class<?> r2 = c.f.a.c.j.h.c7.f13237c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L52:
            c.f.a.c.j.h.c9.z(r5, r7, r2)
            r1 = r2
            goto L8a
        L57:
            boolean r2 = r1 instanceof c.f.a.c.j.h.w8
            if (r2 == 0) goto L6f
            c.f.a.c.j.h.z6 r2 = new c.f.a.c.j.h.z6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            c.f.a.c.j.h.w8 r1 = (c.f.a.c.j.h.w8) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L52
        L6f:
            boolean r2 = r1 instanceof c.f.a.c.j.h.y7
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof c.f.a.c.j.h.t6
            if (r2 == 0) goto L8a
            r2 = r1
            c.f.a.c.j.h.t6 r2 = (c.f.a.c.j.h.t6) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            c.f.a.c.j.h.t6 r1 = r2.n(r1)
            goto L35
        L8a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L99
            if (r2 <= 0) goto L99
            r1.addAll(r6)
        L99:
            if (r0 > 0) goto L9c
            goto L9d
        L9c:
            r6 = r1
        L9d:
            c.f.a.c.j.h.c9.z(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.h.c7.b(java.lang.Object, java.lang.Object, long):void");
    }
}

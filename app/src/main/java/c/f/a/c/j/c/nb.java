package c.f.a.c.j.c;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nb extends kb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f12956c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public nb() {
        super();
    }

    public static <E> List<E> e(Object obj, long j2) {
        return (List) nd.G(obj, j2);
    }

    @Override // c.f.a.c.j.c.kb
    public final void a(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) nd.G(obj, j2);
        if (list instanceof hb) {
            objUnmodifiableList = ((hb) list).A();
        } else {
            if (f12956c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof kc) && (list instanceof xa)) {
                xa xaVar = (xa) list;
                if (xaVar.z()) {
                    xaVar.l();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        nd.g(obj, j2, objUnmodifiableList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    @Override // c.f.a.c.j.c.kb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E> void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = e(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = e(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L35
            boolean r2 = r1 instanceof c.f.a.c.j.c.hb
            if (r2 == 0) goto L1c
            c.f.a.c.j.c.ib r1 = new c.f.a.c.j.c.ib
            r1.<init>(r0)
            goto L31
        L1c:
            boolean r2 = r1 instanceof c.f.a.c.j.c.kc
            if (r2 == 0) goto L2c
            boolean r2 = r1 instanceof c.f.a.c.j.c.xa
            if (r2 == 0) goto L2c
            c.f.a.c.j.c.xa r1 = (c.f.a.c.j.c.xa) r1
            c.f.a.c.j.c.xa r0 = r1.E(r0)
            r1 = r0
            goto L31
        L2c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L31:
            c.f.a.c.j.c.nd.g(r5, r7, r1)
            goto L82
        L35:
            java.lang.Class<?> r2 = c.f.a.c.j.c.nb.f12956c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L53
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L4e:
            c.f.a.c.j.c.nd.g(r5, r7, r2)
            r1 = r2
            goto L82
        L53:
            boolean r2 = r1 instanceof c.f.a.c.j.c.md
            if (r2 == 0) goto L67
            c.f.a.c.j.c.ib r2 = new c.f.a.c.j.c.ib
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            c.f.a.c.j.c.md r1 = (c.f.a.c.j.c.md) r1
            r2.addAll(r1)
            goto L4e
        L67:
            boolean r2 = r1 instanceof c.f.a.c.j.c.kc
            if (r2 == 0) goto L82
            boolean r2 = r1 instanceof c.f.a.c.j.c.xa
            if (r2 == 0) goto L82
            r2 = r1
            c.f.a.c.j.c.xa r2 = (c.f.a.c.j.c.xa) r2
            boolean r3 = r2.z()
            if (r3 != 0) goto L82
            int r1 = r1.size()
            int r1 = r1 + r0
            c.f.a.c.j.c.xa r1 = r2.E(r1)
            goto L31
        L82:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L91
            if (r2 <= 0) goto L91
            r1.addAll(r6)
        L91:
            if (r0 <= 0) goto L94
            r6 = r1
        L94:
            c.f.a.c.j.c.nd.g(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.nb.b(java.lang.Object, java.lang.Object, long):void");
    }
}

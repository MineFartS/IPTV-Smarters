package c.f.a.c.j.h;

import c.f.a.c.j.h.c6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d6<T extends c6<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6 f13263a = new d6(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8<T, Object> f13264b = new f8(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13266d;

    public d6() {
    }

    public d6(boolean z) {
        b();
        b();
    }

    public static <T extends c6<T>> d6<T> a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(T r4, java.lang.Object r5) {
        /*
            c.f.a.c.j.h.j9 r0 = r4.k()
            c.f.a.c.j.h.u6.a(r5)
            c.f.a.c.j.h.j9 r1 = c.f.a.c.j.h.j9.zza
            c.f.a.c.j.h.k9 r1 = c.f.a.c.j.h.k9.INT
            c.f.a.c.j.h.k9 r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof c.f.a.c.j.h.q7
            if (r0 != 0) goto L41
            goto L42
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof c.f.a.c.j.h.n6
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof c.f.a.c.j.h.l5
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            c.f.a.c.j.h.j9 r4 = r4.k()
            c.f.a.c.j.h.k9 r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.h.d6.d(c.f.a.c.j.h.c6, java.lang.Object):void");
    }

    public final void b() {
        if (this.f13265c) {
            return;
        }
        this.f13264b.b();
        this.f13265c = true;
    }

    public final void c(T t, Object obj) {
        if (!t.l()) {
            d(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(t, arrayList.get(i2));
            }
            obj = arrayList;
        }
        this.f13264b.put(t, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ Object clone() {
        d6 d6Var = new d6();
        for (int i2 = 0; i2 < this.f13264b.d(); i2++) {
            Map.Entry<K, Object> entryE = this.f13264b.e(i2);
            d6Var.c((c6) entryE.getKey(), entryE.getValue());
        }
        Iterator it = this.f13264b.f().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            d6Var.c((c6) entry.getKey(), entry.getValue());
        }
        d6Var.f13266d = this.f13266d;
        return d6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d6) {
            return this.f13264b.equals(((d6) obj).f13264b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13264b.hashCode();
    }
}

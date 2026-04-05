package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bkp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bkq<T extends bkp<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bkq f21301b = new bkq(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bmu<T, Object> f21302a = bmu.c(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21304d;

    private bkq() {
    }

    private bkq(byte[] bArr) {
        b();
        b();
    }

    public static <T extends bkp<T>> bkq<T> a() {
        throw null;
    }

    public static int d(int i2, Object obj) {
        int iD = bki.D(i2);
        if (bnn.f21467j == null) {
            bld.g((blz) obj);
            iD += iD;
        }
        return iD + e();
    }

    public static int e() {
        int i2 = bko.f21300c;
        throw null;
    }

    public static void f(bki bkiVar, int i2, Object obj) {
        if (bnn.f21467j != null) {
            throw null;
        }
        blz blzVar = (blz) obj;
        bld.g(blzVar);
        bkiVar.ai(i2, 3);
        bkiVar.P(blzVar);
        bkiVar.ai(i2, 4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void g(T r4, java.lang.Object r5) {
        /*
            com.google.ads.interactivemedia.v3.internal.bnn r0 = r4.b()
            com.google.ads.interactivemedia.v3.internal.bld.i(r5)
            com.google.ads.interactivemedia.v3.internal.bnn r1 = com.google.ads.interactivemedia.v3.internal.bnn.f21458a
            com.google.ads.interactivemedia.v3.internal.bno r1 = com.google.ads.interactivemedia.v3.internal.bno.INT
            com.google.ads.interactivemedia.v3.internal.bno r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.blz
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.blh
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.bkz
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.bkd
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.ads.interactivemedia.v3.internal.bnn r4 = r4.b()
            com.google.ads.interactivemedia.v3.internal.bno r4 = r4.a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bkq.g(com.google.ads.interactivemedia.v3.internal.bkp, java.lang.Object):void");
    }

    public final void b() {
        if (this.f21303c) {
            return;
        }
        this.f21302a.a();
        this.f21303c = true;
    }

    public final void c(T t, Object obj) {
        if (!t.c()) {
            g(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                g(t, arrayList.get(i2));
            }
            obj = arrayList;
        }
        if (obj instanceof blh) {
            this.f21304d = true;
        }
        this.f21302a.put(t, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ Object clone() {
        bkq bkqVar = new bkq();
        for (int i2 = 0; i2 < this.f21302a.b(); i2++) {
            Map.Entry<K, Object> entryG = this.f21302a.g(i2);
            bkqVar.c((bkp) entryG.getKey(), entryG.getValue());
        }
        Iterator it = this.f21302a.d().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bkqVar.c((bkp) entry.getKey(), entry.getValue());
        }
        bkqVar.f21304d = this.f21304d;
        return bkqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bkq) {
            return this.f21302a.equals(((bkq) obj).f21302a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21302a.hashCode();
    }
}

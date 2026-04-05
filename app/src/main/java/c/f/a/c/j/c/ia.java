package c.f.a.c.j.c;

import c.f.a.c.j.c.ka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ia<T extends ka<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ia f12877a = new ia(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc<T, Object> f12878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12880d;

    public ia() {
        this.f12878b = uc.h(16);
    }

    public ia(uc<T, Object> ucVar) {
        this.f12878b = ucVar;
        p();
    }

    public ia(boolean z) {
        this(uc.h(0));
        p();
    }

    public static int e(wd wdVar, int i2, Object obj) {
        int iU = z9.u(i2);
        if (wdVar == wd.zzbwl) {
            sa.h((bc) obj);
            iU <<= 1;
        }
        return iU + k(wdVar, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(c.f.a.c.j.c.wd r2, java.lang.Object r3) {
        /*
            c.f.a.c.j.c.sa.a(r3)
            int[] r0 = c.f.a.c.j.c.ha.f12860a
            c.f.a.c.j.c.de r2 = r2.zzlw()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof c.f.a.c.j.c.bc
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof c.f.a.c.j.c.bb
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof c.f.a.c.j.c.ra
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof c.f.a.c.j.c.m9
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L4e
        L4d:
            throw r2
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.ia.i(c.f.a.c.j.c.wd, java.lang.Object):void");
    }

    public static int j(ka<?> kaVar, Object obj) {
        wd wdVarE = kaVar.e();
        int iZzgj = kaVar.zzgj();
        if (!kaVar.j()) {
            return e(wdVarE, iZzgj, obj);
        }
        int iE = 0;
        List list = (List) obj;
        if (kaVar.m()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iE += k(wdVarE, it.next());
            }
            return z9.u(iZzgj) + iE + z9.P(iE);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iE += e(wdVarE, iZzgj, it2.next());
        }
        return iE;
    }

    public static int k(wd wdVar, Object obj) {
        switch (ha.f12861b[wdVar.ordinal()]) {
            case 1:
                return z9.Y(((Double) obj).doubleValue());
            case 2:
                return z9.C(((Float) obj).floatValue());
            case 3:
                return z9.x0(((Long) obj).longValue());
            case 4:
                return z9.A0(((Long) obj).longValue());
            case 5:
                return z9.w(((Integer) obj).intValue());
            case 6:
                return z9.C0(((Long) obj).longValue());
            case 7:
                return z9.z(((Integer) obj).intValue());
            case 8:
                return z9.y0(((Boolean) obj).booleanValue());
            case 9:
                return z9.c0((bc) obj);
            case 10:
                return obj instanceof bb ? z9.d((bb) obj) : z9.T((bc) obj);
            case 11:
                return obj instanceof m9 ? z9.I((m9) obj) : z9.v((String) obj);
            case 12:
                return obj instanceof m9 ? z9.I((m9) obj) : z9.J((byte[]) obj);
            case 13:
                return z9.x(((Integer) obj).intValue());
            case 14:
                return z9.A(((Integer) obj).intValue());
            case 15:
                return z9.D0(((Long) obj).longValue());
            case 16:
                return z9.y(((Integer) obj).intValue());
            case 17:
                return z9.B0(((Long) obj).longValue());
            case 18:
                return obj instanceof ra ? z9.B(((ra) obj).zzgj()) : z9.B(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends ka<T>> boolean l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.h() == de.MESSAGE) {
            boolean zJ = key.j();
            Object value = entry.getValue();
            if (zJ) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((bc) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof bc)) {
                    if (value instanceof bb) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((bc) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int n(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.h() != de.MESSAGE || key.j() || key.m()) {
            return j(key, value);
        }
        boolean z = value instanceof bb;
        int iZzgj = entry.getKey().zzgj();
        return z ? z9.F(iZzgj, (bb) value) : z9.G(iZzgj, (bc) value);
    }

    public static Object o(Object obj) {
        if (obj instanceof hc) {
            return ((hc) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends ka<T>> ia<T> q() {
        return f12877a;
    }

    public final Iterator<Map.Entry<T, Object>> a() {
        return this.f12880d ? new gb(this.f12878b.p().iterator()) : this.f12878b.p().iterator();
    }

    public final boolean b() {
        return this.f12879c;
    }

    public final boolean c() {
        for (int i2 = 0; i2 < this.f12878b.n(); i2++) {
            if (!l(this.f12878b.i(i2))) {
                return false;
            }
        }
        Iterator it = this.f12878b.o().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        ia iaVar = new ia();
        for (int i2 = 0; i2 < this.f12878b.n(); i2++) {
            Map.Entry<K, Object> entryI = this.f12878b.i(i2);
            iaVar.h((ka) entryI.getKey(), entryI.getValue());
        }
        Iterator it = this.f12878b.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iaVar.h((ka) entry.getKey(), entry.getValue());
        }
        iaVar.f12880d = this.f12880d;
        return iaVar;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.f12880d ? new gb(this.f12878b.entrySet().iterator()) : this.f12878b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ia) {
            return this.f12878b.equals(((ia) obj).f12878b);
        }
        return false;
    }

    public final Object f(T t) {
        Object obj = this.f12878b.get(t);
        if (!(obj instanceof bb)) {
            return obj;
        }
        return bb.e();
    }

    public final void g(ia<T> iaVar) {
        for (int i2 = 0; i2 < iaVar.f12878b.n(); i2++) {
            m(iaVar.f12878b.i(i2));
        }
        Iterator it = iaVar.f12878b.o().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final void h(T t, Object obj) {
        if (!t.j()) {
            i(t.e(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                i(t.e(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof bb) {
            this.f12880d = true;
        }
        this.f12878b.put(t, obj);
    }

    public final int hashCode() {
        return this.f12878b.hashCode();
    }

    public final void m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof bb) {
            value = bb.e();
        }
        if (key.j()) {
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objF).add(o(it.next()));
            }
            this.f12878b.put(key, objF);
            return;
        }
        if (key.h() != de.MESSAGE) {
            this.f12878b.put(key, o(value));
            return;
        }
        Object objF2 = f(key);
        if (objF2 == null) {
            this.f12878b.put(key, o(value));
        } else {
            this.f12878b.put(key, objF2 instanceof hc ? key.f((hc) objF2, (hc) value) : key.n(((bc) objF2).a(), (bc) value).v());
        }
    }

    public final void p() {
        if (this.f12879c) {
            return;
        }
        this.f12878b.m();
        this.f12879c = true;
    }

    public final int r() {
        int iN = 0;
        for (int i2 = 0; i2 < this.f12878b.n(); i2++) {
            iN += n(this.f12878b.i(i2));
        }
        Iterator it = this.f12878b.o().iterator();
        while (it.hasNext()) {
            iN += n((Map.Entry) it.next());
        }
        return iN;
    }
}

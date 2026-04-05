package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class s7 extends oa<s7, a> implements dc {
    private static volatile lc<s7> zzahx;
    private static final s7 zzbly;
    private int zzahj;
    private xa<x7> zzblv = oa.u();
    private xa<l8> zzblw = oa.u();
    private w7 zzblx;

    public static final class a extends oa.b<s7, a> implements dc {
        public a() {
            super(s7.zzbly);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        s7 s7Var = new s7();
        zzbly = s7Var;
        oa.n(s7.class, s7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new s7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbly, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzahj", "zzblv", x7.class, "zzblw", l8.class, "zzblx"});
            case 4:
                return zzbly;
            case 5:
                lc<s7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (s7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbly);
                            zzahx = aVar;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

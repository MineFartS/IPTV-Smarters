package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class i8 extends oa<i8, a> implements dc {
    private static volatile lc<i8> zzahx;
    private static final i8 zzbgm;
    private int zzahj;
    private int zzbgh;
    private int zzbgi;
    private int zzbgj;
    private boolean zzbgk;
    private int zzbgl;

    public static final class a extends oa.b<i8, a> implements dc {
        public a() {
            super(i8.zzbgm);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        i8 i8Var = new i8();
        zzbgm = i8Var;
        oa.n(i8.class, i8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new i8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbgm, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzahj", "zzbgh", p5.zzgk(), "zzbgi", j5.zzgk(), "zzbgj", o5.zzgk(), "zzbgk", "zzbgl"});
            case 4:
                return zzbgm;
            case 5:
                lc<i8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (i8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbgm);
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

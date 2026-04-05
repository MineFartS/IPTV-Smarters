package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b8 extends oa<b8, a> implements dc {
    private static volatile lc<b8> zzahx;
    private static final va<Integer, g7> zzbex = new b9();
    private static final b8 zzbey;
    private int zzahj;
    private e8 zzbet;
    private x8 zzbeu;
    private xa<v8> zzbev = oa.u();
    private wa zzbew = oa.q();

    public static final class a extends oa.b<b8, a> implements dc {
        public a() {
            super(b8.zzbey);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }

        public final a n(e8 e8Var) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((b8) this.f12994c).y(e8Var);
            return this;
        }

        public final a o(Iterable<? extends g7> iterable) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((b8) this.f12994c).z(iterable);
            return this;
        }
    }

    static {
        b8 b8Var = new b8();
        zzbey = b8Var;
        oa.n(b8.class, b8Var);
    }

    public static a A() {
        return zzbey.p();
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new b8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbey, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzahj", "zzbet", "zzbeu", "zzbev", v8.class, "zzbew", g7.zzgk()});
            case 4:
                return zzbey;
            case 5:
                lc<b8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (b8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbey);
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

    public final void y(e8 e8Var) {
        e8Var.getClass();
        this.zzbet = e8Var;
        this.zzahj |= 1;
    }

    public final void z(Iterable<? extends g7> iterable) {
        wa waVar = this.zzbew;
        if (!waVar.z()) {
            int size = waVar.size();
            this.zzbew = waVar.E(size == 0 ? 10 : size << 1);
        }
        Iterator<? extends g7> it = iterable.iterator();
        while (it.hasNext()) {
            this.zzbew.y(it.next().zzgj());
        }
    }
}

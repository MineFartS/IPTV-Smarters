package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 extends oa<c2, c> implements dc {
    private static final c2 zzahw;
    private static volatile lc<c2> zzahx;
    private int zzahj;
    private int zzahk;
    private int zzahl;
    private int zzahm;
    private int zzahn;
    private int zzaho;
    private int zzahp;
    private int zzahq;
    private int zzahr;
    private int zzahs;
    private int zzaht;
    private int zzahu;
    private boolean zzahv;

    public enum a implements ra {
        AUDIO_FORMAT_UNKNOWN(0),
        AUDIO_FORMAT_AV_AUDIO_PCM_FLOAT_32(1),
        AUDIO_FORMAT_AV_AUDIO_PCM_FLOAT_64(2),
        AUDIO_FORMAT_AV_AUDIO_PCM_INT_16(3),
        AUDIO_FORMAT_AV_AUDIO_PCM_INT_32(4);

        private static final ua<a> zzahh = new f2();
        private final int value;

        a(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return e2.f12795a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        @Override // c.f.a.c.j.c.ra
        public final int zzgj() {
            return this.value;
        }
    }

    public enum b implements ra {
        BITRATE_MODE_UNKNOWN(0),
        BITRATE_MODE_FIXED(1),
        BITRATE_MODE_ADAPTIVE(2);

        private static final ua<b> zzahh = new g2();
        private final int value;

        b(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return h2.f12858a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        @Override // c.f.a.c.j.c.ra
        public final int zzgj() {
            return this.value;
        }
    }

    public static final class c extends oa.b<c2, c> implements dc {
        public c() {
            super(c2.zzahw);
        }

        public /* synthetic */ c(b2 b2Var) {
            this();
        }
    }

    public enum d implements ra {
        RENDER_BACKEND_UNKNOWN(0),
        RENDER_BACKEND_OPENGL_ES_2(1),
        RENDER_BACKEND_OPENGL_ES_3(2),
        RENDER_BACKEND_METAL(3);

        private static final ua<d> zzahh = new i2();
        private final int value;

        d(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return j2.f12890a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        @Override // c.f.a.c.j.c.ra
        public final int zzgj() {
            return this.value;
        }
    }

    public enum e implements ra {
        RENDER_TARGET_UNKNOWN(0),
        RENDER_TARGET_CAMERA(1),
        RENDER_TARGET_RENDER_TEXTURE_SET_ON_CAMERA(2),
        RENDER_TARGET_RENDER_TEXTURE(3);

        private static final ua<e> zzahh = new l2();
        private final int value;

        e(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return k2.f12900a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        @Override // c.f.a.c.j.c.ra
        public final int zzgj() {
            return this.value;
        }
    }

    public enum f implements ra {
        TARGET_DELAY_UNKNOWN(0),
        TARGET_DELAY_MINIMUM(1),
        TARGET_DELAY_LOW(2),
        TARGET_DELAY_NORMAL(3),
        TARGET_DELAY_HIGH(4);

        private static final ua<f> zzahh = new m2();
        private final int value;

        f(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return n2.f12953a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + f.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        @Override // c.f.a.c.j.c.ra
        public final int zzgj() {
            return this.value;
        }
    }

    public enum g implements ra {
        TARGET_FPS_UNKNOWN(0),
        TARGET_FPS_15(1),
        TARGET_FPS_24(2),
        TARGET_FPS_25(3),
        TARGET_FPS_30(4),
        TARGET_FPS_60(5);

        private static final ua<g> zzahh = new p2();
        private final int value;

        g(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return o2.f12991a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + g.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        @Override // c.f.a.c.j.c.ra
        public final int zzgj() {
            return this.value;
        }
    }

    static {
        c2 c2Var = new c2();
        zzahw = c2Var;
        oa.n(c2.class, c2Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        b2 b2Var = null;
        switch (b2.f12772a[i2 - 1]) {
            case 1:
                return new c2();
            case 2:
                return new c(b2Var);
            case 3:
                return oa.l(zzahw, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tင\b\nင\t\u000bင\n\fဇ\u000b", new Object[]{"zzahj", "zzahk", "zzahl", "zzahm", d.zzgk(), "zzahn", e.zzgk(), "zzaho", b.zzgk(), "zzahp", f.zzgk(), "zzahq", g.zzgk(), "zzahr", a.zzgk(), "zzahs", "zzaht", "zzahu", "zzahv"});
            case 4:
                return zzahw;
            case 5:
                lc<c2> aVar = zzahx;
                if (aVar == null) {
                    synchronized (c2.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzahw);
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

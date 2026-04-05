package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends oa<d2, a> implements dc {
    private static volatile lc<d2> zzahx;
    private static final d2 zzajg;
    private int zzahj;
    private int zzaja;
    private int zzajb;
    private int zzajc;
    private int zzajd;
    private c2 zzaje;
    private int zzajf;

    public static final class a extends oa.b<d2, a> implements dc {
        public a() {
            super(d2.zzajg);
        }

        public /* synthetic */ a(b2 b2Var) {
            this();
        }
    }

    public enum b implements ra {
        ERROR_UNKNOWN(0),
        ERROR_SETUP_DEVICE_NOT_SUPPORTED(1),
        ERROR_SETUP_GOOGLE_PLAY_SERVICES_UPDATE_REQUIRED(2),
        ERROR_SETUP_CONFIGURATION_REJECTED_BY_RECEIVER(3),
        ERROR_OPENGL_UNKNOWN_ERROR(4),
        ERROR_OPENGL_INITIALIZATION_ERROR(5),
        ERROR_OPENGL_CONTEXT_CREATION_ERROR(6),
        ERROR_OPENGL_SHADER_COMPILATION_ERROR(7),
        ERROR_OPENGL_SHADER_LINKING_ERROR(8),
        ERROR_OPENGL_RENDERING_ERROR(9),
        ERROR_OPENGL_TEXTURE_BINDING_ERROR(10),
        ERROR_OPENGL_SHUTDOWN_ERROR(11),
        ERROR_OPENGL_UNSUPPORTED_OPENGL_API_ERROR(12),
        ERROR_OPENGL_TEXTURE_CACHE_CREATION_ERROR(13),
        ERROR_OPENGL_LUMA_PASS_PIPELINE_CREATION_ERROR(14),
        ERROR_OPENGL_CHROMA_PASS_PIPELINE_CREATION_ERROR(15),
        ERROR_OPENGL_SHADER_DECOMPRESSION_ERROR(16),
        ERROR_OPENGL_PIXELBUFFER_CREATION_ERROR(17),
        ERROR_OPENGL_LUMA_TEXTURE_CACHE_CREATION_ERROR(18),
        ERROR_OPENGL_CHROMA_TEXTURE_CACHE_CREATION_ERROR(19),
        ERROR_OPENGL_MAKE_CURRENT_ERROR(20),
        ERROR_OPENGL_EGL_CONTEXT_ERROR(21),
        ERROR_OPENGL_EGL_BAD_NATIVE_SURFACE_ERROR(22),
        ERROR_METAL_UNKNOWN_ERROR(23),
        ERROR_METAL_TEXTURE_CACHE_CREATION_ERROR(24),
        ERROR_METAL_SHADER_DECOMPRESSION_ERROR(25),
        ERROR_METAL_SHADER_LOADING_ERROR(26),
        ERROR_METAL_BUFFER_ALLOCATION_ERROR(27),
        ERROR_METAL_LUMA_PASS_PIPELINE_CREATION_ERROR(28),
        ERROR_METAL_CHROMA_PASS_BUFFER_CREATION_ERROR(29),
        ERROR_METAL_CHROMA_PASS_TEXTURE_CREATION_ERROR(30),
        ERROR_METAL_CHROMA_PASS_PIPELINE_CREATION_ERROR(31),
        ERROR_METAL_PIXELBUFFER_CREATION_ERROR(32),
        ERROR_METAL_TEXTURE_CREATION_ERROR(33),
        ERROR_METAL_LUMA_RENDER_COMMAND_ENCODER_CREATION_ERROR(34),
        ERROR_METAL_CHROMA_RENDER_COMMAND_ENCODER_CREATION_ERROR(35),
        ERROR_METAL_COMMAND_BUFFER_EXECUTION_ERROR(36),
        ERROR_AUDIO_CONVERTER_CREATION_ERROR(37),
        ERROR_AUDIO_CONVERTER_PRIMEMETHOD_ERROR(38),
        ERROR_AUDIO_CONVERTER_CONVERSION_ERROR(39),
        ERROR_SETUP_FEATURE_NOT_SUPPORTED(40),
        ERROR_DUPLICATE_REQUEST(41),
        ERROR_PROTOCOL_ERROR(42);

        private static final ua<b> zzahh = new q2();
        private final int value;

        b(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return r2.f13058a;
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

    public enum c implements ra {
        PLUGIN_TYPE_UNKNOWN(0),
        PLUGIN_TYPE_UNITY_3D(1);

        private static final ua<c> zzahh = new u2();
        private final int value;

        c(int i2) {
            this.value = i2;
        }

        public static ta zzgk() {
            return t2.f13084a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        @Override // c.f.a.c.j.c.ra
        public final int zzgj() {
            return this.value;
        }
    }

    static {
        d2 d2Var = new d2();
        zzajg = d2Var;
        oa.n(d2.class, d2Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        b2 b2Var = null;
        switch (b2.f12772a[i2 - 1]) {
            case 1:
                return new d2();
            case 2:
                return new a(b2Var);
            case 3:
                return oa.l(zzajg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzahj", "zzaja", "zzajb", c.zzgk(), "zzajc", "zzajd", "zzaje", "zzajf", b.zzgk()});
            case 4:
                return zzajg;
            case 5:
                lc<d2> aVar = zzahx;
                if (aVar == null) {
                    synchronized (d2.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzajg);
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

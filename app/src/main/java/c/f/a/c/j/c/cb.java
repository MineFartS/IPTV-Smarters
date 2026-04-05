package c.f.a.c.j.c;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzbsa' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class cb {
    public static final cb zzbrz;
    public static final cb zzbsa;
    public static final cb zzbsb;
    public static final cb zzbsc;
    public static final cb zzbsd;
    public static final cb zzbse;
    public static final cb zzbsf;
    public static final cb zzbsg;
    public static final cb zzbsh;
    public static final cb zzbsi;
    private static final /* synthetic */ cb[] zzbsm;
    private final Class<?> zzbsj;
    private final Class<?> zzbsk;
    private final Object zzbsl;

    static {
        cb cbVar = new cb("VOID", 0, Void.class, Void.class, null);
        zzbrz = cbVar;
        Class cls = Integer.TYPE;
        cb cbVar2 = new cb("INT", 1, cls, Integer.class, 0);
        zzbsa = cbVar2;
        cb cbVar3 = new cb("LONG", 2, Long.TYPE, Long.class, 0L);
        zzbsb = cbVar3;
        cb cbVar4 = new cb("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzbsc = cbVar4;
        cb cbVar5 = new cb("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zzbsd = cbVar5;
        cb cbVar6 = new cb("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzbse = cbVar6;
        cb cbVar7 = new cb("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        zzbsf = cbVar7;
        cb cbVar8 = new cb("BYTE_STRING", 7, m9.class, m9.class, m9.f12941b);
        zzbsg = cbVar8;
        cb cbVar9 = new cb("ENUM", 8, cls, Integer.class, null);
        zzbsh = cbVar9;
        cb cbVar10 = new cb("MESSAGE", 9, Object.class, Object.class, null);
        zzbsi = cbVar10;
        zzbsm = new cb[]{cbVar, cbVar2, cbVar3, cbVar4, cbVar5, cbVar6, cbVar7, cbVar8, cbVar9, cbVar10};
    }

    private cb(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzbsj = cls;
        this.zzbsk = cls2;
        this.zzbsl = obj;
    }

    public static cb[] values() {
        return (cb[]) zzbsm.clone();
    }

    public final Class<?> zzke() {
        return this.zzbsk;
    }
}

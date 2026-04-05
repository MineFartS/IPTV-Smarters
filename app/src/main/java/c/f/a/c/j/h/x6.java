package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class x6 {
    public static final x6 zza;
    public static final x6 zzb;
    public static final x6 zzc;
    public static final x6 zzd;
    public static final x6 zze;
    public static final x6 zzf;
    public static final x6 zzg;
    public static final x6 zzh;
    public static final x6 zzi;
    public static final x6 zzj;
    private static final /* synthetic */ x6[] zzn;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    static {
        x6 x6Var = new x6("VOID", 0, Void.class, Void.class, null);
        zza = x6Var;
        Class cls = Integer.TYPE;
        x6 x6Var2 = new x6("INT", 1, cls, Integer.class, 0);
        zzb = x6Var2;
        x6 x6Var3 = new x6("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = x6Var3;
        x6 x6Var4 = new x6("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = x6Var4;
        x6 x6Var5 = new x6("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = x6Var5;
        x6 x6Var6 = new x6("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = x6Var6;
        x6 x6Var7 = new x6("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        zzg = x6Var7;
        x6 x6Var8 = new x6("BYTE_STRING", 7, l5.class, l5.class, l5.f13413b);
        zzh = x6Var8;
        x6 x6Var9 = new x6("ENUM", 8, cls, Integer.class, null);
        zzi = x6Var9;
        x6 x6Var10 = new x6("MESSAGE", 9, Object.class, Object.class, null);
        zzj = x6Var10;
        zzn = new x6[]{x6Var, x6Var2, x6Var3, x6Var4, x6Var5, x6Var6, x6Var7, x6Var8, x6Var9, x6Var10};
    }

    private x6(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public static x6[] values() {
        return (x6[]) zzn.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}

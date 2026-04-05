package c.f.a.c.j.h;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class j9 {
    public static final j9 zza;
    public static final j9 zzb;
    public static final j9 zzc;
    public static final j9 zzd;
    public static final j9 zze;
    public static final j9 zzf;
    public static final j9 zzg;
    public static final j9 zzh;
    public static final j9 zzi;
    public static final j9 zzj;
    public static final j9 zzk;
    public static final j9 zzl;
    public static final j9 zzm;
    public static final j9 zzn;
    public static final j9 zzo;
    public static final j9 zzp;
    public static final j9 zzq;
    public static final j9 zzr;
    private static final /* synthetic */ j9[] zzt;
    private final k9 zzs;

    static {
        j9 j9Var = new j9("DOUBLE", 0, k9.DOUBLE, 1);
        zza = j9Var;
        j9 j9Var2 = new j9("FLOAT", 1, k9.FLOAT, 5);
        zzb = j9Var2;
        k9 k9Var = k9.LONG;
        j9 j9Var3 = new j9("INT64", 2, k9Var, 0);
        zzc = j9Var3;
        j9 j9Var4 = new j9("UINT64", 3, k9Var, 0);
        zzd = j9Var4;
        k9 k9Var2 = k9.INT;
        j9 j9Var5 = new j9("INT32", 4, k9Var2, 0);
        zze = j9Var5;
        j9 j9Var6 = new j9("FIXED64", 5, k9Var, 1);
        zzf = j9Var6;
        j9 j9Var7 = new j9("FIXED32", 6, k9Var2, 5);
        zzg = j9Var7;
        j9 j9Var8 = new j9("BOOL", 7, k9.BOOLEAN, 0);
        zzh = j9Var8;
        j9 j9Var9 = new j9("STRING", 8, k9.STRING, 2);
        zzi = j9Var9;
        k9 k9Var3 = k9.MESSAGE;
        j9 j9Var10 = new j9("GROUP", 9, k9Var3, 3);
        zzj = j9Var10;
        j9 j9Var11 = new j9("MESSAGE", 10, k9Var3, 2);
        zzk = j9Var11;
        j9 j9Var12 = new j9("BYTES", 11, k9.BYTE_STRING, 2);
        zzl = j9Var12;
        j9 j9Var13 = new j9("UINT32", 12, k9Var2, 0);
        zzm = j9Var13;
        j9 j9Var14 = new j9("ENUM", 13, k9.ENUM, 0);
        zzn = j9Var14;
        j9 j9Var15 = new j9("SFIXED32", 14, k9Var2, 5);
        zzo = j9Var15;
        j9 j9Var16 = new j9("SFIXED64", 15, k9Var, 1);
        zzp = j9Var16;
        j9 j9Var17 = new j9("SINT32", 16, k9Var2, 0);
        zzq = j9Var17;
        j9 j9Var18 = new j9("SINT64", 17, k9Var, 0);
        zzr = j9Var18;
        zzt = new j9[]{j9Var, j9Var2, j9Var3, j9Var4, j9Var5, j9Var6, j9Var7, j9Var8, j9Var9, j9Var10, j9Var11, j9Var12, j9Var13, j9Var14, j9Var15, j9Var16, j9Var17, j9Var18};
    }

    private j9(String str, int i2, k9 k9Var, int i3) {
        this.zzs = k9Var;
    }

    public static j9[] values() {
        return (j9[]) zzt.clone();
    }

    public final k9 zza() {
        return this.zzs;
    }
}

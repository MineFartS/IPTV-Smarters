package c.f.a.c.j.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzbwe' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class wd {
    public static final wd zzbwc;
    public static final wd zzbwd;
    public static final wd zzbwe;
    public static final wd zzbwf;
    public static final wd zzbwg;
    public static final wd zzbwh;
    public static final wd zzbwi;
    public static final wd zzbwj;
    public static final wd zzbwk;
    public static final wd zzbwl;
    public static final wd zzbwm;
    public static final wd zzbwn;
    public static final wd zzbwo;
    public static final wd zzbwp;
    public static final wd zzbwq;
    public static final wd zzbwr;
    public static final wd zzbws;
    public static final wd zzbwt;
    private static final /* synthetic */ wd[] zzbww;
    private final de zzbwu;
    private final int zzbwv;

    static {
        wd wdVar = new wd("DOUBLE", 0, de.DOUBLE, 1);
        zzbwc = wdVar;
        wd wdVar2 = new wd("FLOAT", 1, de.FLOAT, 5);
        zzbwd = wdVar2;
        de deVar = de.LONG;
        final int i2 = 2;
        wd wdVar3 = new wd("INT64", 2, deVar, 0);
        zzbwe = wdVar3;
        final int i3 = 3;
        wd wdVar4 = new wd("UINT64", 3, deVar, 0);
        zzbwf = wdVar4;
        de deVar2 = de.INT;
        wd wdVar5 = new wd("INT32", 4, deVar2, 0);
        zzbwg = wdVar5;
        wd wdVar6 = new wd("FIXED64", 5, deVar, 1);
        zzbwh = wdVar6;
        wd wdVar7 = new wd("FIXED32", 6, deVar2, 5);
        zzbwi = wdVar7;
        wd wdVar8 = new wd("BOOL", 7, de.BOOLEAN, 0);
        zzbwj = wdVar8;
        final de deVar3 = de.STRING;
        final String str = "STRING";
        final int i4 = 8;
        wd wdVar9 = new wd(str, i4, deVar3, i2) { // from class: c.f.a.c.j.c.zd
            {
                int i5 = 8;
                int i6 = 2;
            }
        };
        zzbwk = wdVar9;
        final de deVar4 = de.MESSAGE;
        final String str2 = "GROUP";
        final int i5 = 9;
        wd wdVar10 = new wd(str2, i5, deVar4, i3) { // from class: c.f.a.c.j.c.yd
            {
                int i6 = 9;
                int i7 = 3;
            }
        };
        zzbwl = wdVar10;
        final String str3 = "MESSAGE";
        final int i6 = 10;
        final int i7 = 2;
        wd wdVar11 = new wd(str3, i6, deVar4, i7) { // from class: c.f.a.c.j.c.be
            {
                int i8 = 10;
                int i9 = 2;
            }
        };
        zzbwm = wdVar11;
        final de deVar5 = de.BYTE_STRING;
        final String str4 = "BYTES";
        final int i8 = 11;
        wd wdVar12 = new wd(str4, i8, deVar5, i7) { // from class: c.f.a.c.j.c.ae
            {
                int i9 = 11;
                int i10 = 2;
            }
        };
        zzbwn = wdVar12;
        wd wdVar13 = new wd("UINT32", 12, deVar2, 0);
        zzbwo = wdVar13;
        wd wdVar14 = new wd("ENUM", 13, de.ENUM, 0);
        zzbwp = wdVar14;
        wd wdVar15 = new wd("SFIXED32", 14, deVar2, 5);
        zzbwq = wdVar15;
        wd wdVar16 = new wd("SFIXED64", 15, deVar, 1);
        zzbwr = wdVar16;
        wd wdVar17 = new wd("SINT32", 16, deVar2, 0);
        zzbws = wdVar17;
        wd wdVar18 = new wd("SINT64", 17, deVar, 0);
        zzbwt = wdVar18;
        zzbww = new wd[]{wdVar, wdVar2, wdVar3, wdVar4, wdVar5, wdVar6, wdVar7, wdVar8, wdVar9, wdVar10, wdVar11, wdVar12, wdVar13, wdVar14, wdVar15, wdVar16, wdVar17, wdVar18};
    }

    private wd(String str, int i2, de deVar, int i3) {
        this.zzbwu = deVar;
        this.zzbwv = i3;
    }

    public static wd[] values() {
        return (wd[]) zzbww.clone();
    }

    public final de zzlw() {
        return this.zzbwu;
    }

    public final int zzlx() {
        return this.zzbwv;
    }
}

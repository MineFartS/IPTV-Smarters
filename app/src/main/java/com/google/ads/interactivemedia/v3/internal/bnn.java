package com.google.ads.interactivemedia.v3.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class bnn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bnn f21458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bnn f21459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bnn f21460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bnn f21461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bnn f21462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bnn f21463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bnn f21464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bnn f21465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bnn f21466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bnn f21467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bnn f21468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bnn f21469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final bnn f21470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final bnn f21471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bnn f21472o;
    public static final bnn p;
    public static final bnn q;
    public static final bnn r;
    private static final /* synthetic */ bnn[] s;
    private final bno t;
    private final int u;

    static {
        bnn bnnVar = new bnn("DOUBLE", 0, bno.DOUBLE, 1);
        f21458a = bnnVar;
        bnn bnnVar2 = new bnn("FLOAT", 1, bno.FLOAT, 5);
        f21459b = bnnVar2;
        bno bnoVar = bno.LONG;
        bnn bnnVar3 = new bnn("INT64", 2, bnoVar, 0);
        f21460c = bnnVar3;
        bnn bnnVar4 = new bnn("UINT64", 3, bnoVar, 0);
        f21461d = bnnVar4;
        bno bnoVar2 = bno.INT;
        bnn bnnVar5 = new bnn("INT32", 4, bnoVar2, 0);
        f21462e = bnnVar5;
        bnn bnnVar6 = new bnn("FIXED64", 5, bnoVar, 1);
        f21463f = bnnVar6;
        bnn bnnVar7 = new bnn("FIXED32", 6, bnoVar2, 5);
        f21464g = bnnVar7;
        bnn bnnVar8 = new bnn("BOOL", 7, bno.BOOLEAN, 0);
        f21465h = bnnVar8;
        bnn bnnVar9 = new bnn("STRING", 8, bno.STRING, 2);
        f21466i = bnnVar9;
        bno bnoVar3 = bno.MESSAGE;
        bnn bnnVar10 = new bnn("GROUP", 9, bnoVar3, 3);
        f21467j = bnnVar10;
        bnn bnnVar11 = new bnn("MESSAGE", 10, bnoVar3, 2);
        f21468k = bnnVar11;
        bnn bnnVar12 = new bnn("BYTES", 11, bno.BYTE_STRING, 2);
        f21469l = bnnVar12;
        bnn bnnVar13 = new bnn("UINT32", 12, bnoVar2, 0);
        f21470m = bnnVar13;
        bnn bnnVar14 = new bnn("ENUM", 13, bno.ENUM, 0);
        f21471n = bnnVar14;
        bnn bnnVar15 = new bnn("SFIXED32", 14, bnoVar2, 5);
        f21472o = bnnVar15;
        bnn bnnVar16 = new bnn("SFIXED64", 15, bnoVar, 1);
        p = bnnVar16;
        bnn bnnVar17 = new bnn("SINT32", 16, bnoVar2, 0);
        q = bnnVar17;
        bnn bnnVar18 = new bnn("SINT64", 17, bnoVar, 0);
        r = bnnVar18;
        s = new bnn[]{bnnVar, bnnVar2, bnnVar3, bnnVar4, bnnVar5, bnnVar6, bnnVar7, bnnVar8, bnnVar9, bnnVar10, bnnVar11, bnnVar12, bnnVar13, bnnVar14, bnnVar15, bnnVar16, bnnVar17, bnnVar18};
    }

    private bnn(String str, int i2, bno bnoVar, int i3) {
        this.t = bnoVar;
        this.u = i3;
    }

    public static bnn[] values() {
        return (bnn[]) s.clone();
    }

    public final bno a() {
        return this.t;
    }
}

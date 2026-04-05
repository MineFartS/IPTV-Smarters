package com.google.ads.interactivemedia.v3.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class bks {
    public static final bks A;
    public static final bks B;
    public static final bks C;
    public static final bks D;
    public static final bks E;
    public static final bks F;
    public static final bks G;
    public static final bks H;
    public static final bks I;
    public static final bks J;
    public static final bks K;
    public static final bks L;
    public static final bks M;
    public static final bks N;
    public static final bks O;
    public static final bks P;
    public static final bks Q;
    public static final bks R;
    public static final bks S;
    public static final bks T;
    public static final bks U;
    public static final bks V;
    public static final bks W;
    public static final bks X;
    public static final bks Y;
    private static final bks[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bks f21311a;
    private static final /* synthetic */ bks[] aa;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bks f21312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bks f21313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bks f21314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bks f21315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bks f21316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bks f21317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bks f21318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bks f21319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bks f21320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bks f21321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bks f21322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final bks f21323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final bks f21324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bks f21325o;
    public static final bks p;
    public static final bks q;
    public static final bks r;
    public static final bks s;
    public static final bks t;
    public static final bks u;
    public static final bks v;
    public static final bks w;
    public static final bks x;
    public static final bks y;
    public static final bks z;
    private final int ab;
    private final bkr ac;

    static {
        bkr bkrVar = bkr.SCALAR;
        blg blgVar = blg.DOUBLE;
        f21311a = new bks("DOUBLE", 0, 0, bkrVar, blgVar);
        blg blgVar2 = blg.FLOAT;
        f21312b = new bks("FLOAT", 1, 1, bkrVar, blgVar2);
        blg blgVar3 = blg.LONG;
        f21313c = new bks("INT64", 2, 2, bkrVar, blgVar3);
        f21314d = new bks("UINT64", 3, 3, bkrVar, blgVar3);
        blg blgVar4 = blg.INT;
        f21315e = new bks("INT32", 4, 4, bkrVar, blgVar4);
        f21316f = new bks("FIXED64", 5, 5, bkrVar, blgVar3);
        f21317g = new bks("FIXED32", 6, 6, bkrVar, blgVar4);
        blg blgVar5 = blg.BOOLEAN;
        f21318h = new bks("BOOL", 7, 7, bkrVar, blgVar5);
        blg blgVar6 = blg.STRING;
        f21319i = new bks("STRING", 8, 8, bkrVar, blgVar6);
        blg blgVar7 = blg.MESSAGE;
        f21320j = new bks("MESSAGE", 9, 9, bkrVar, blgVar7);
        blg blgVar8 = blg.BYTE_STRING;
        f21321k = new bks("BYTES", 10, 10, bkrVar, blgVar8);
        f21322l = new bks("UINT32", 11, 11, bkrVar, blgVar4);
        blg blgVar9 = blg.ENUM;
        f21323m = new bks("ENUM", 12, 12, bkrVar, blgVar9);
        f21324n = new bks("SFIXED32", 13, 13, bkrVar, blgVar4);
        f21325o = new bks("SFIXED64", 14, 14, bkrVar, blgVar3);
        p = new bks("SINT32", 15, 15, bkrVar, blgVar4);
        q = new bks("SINT64", 16, 16, bkrVar, blgVar3);
        r = new bks("GROUP", 17, 17, bkrVar, blgVar7);
        bkr bkrVar2 = bkr.VECTOR;
        s = new bks("DOUBLE_LIST", 18, 18, bkrVar2, blgVar);
        t = new bks("FLOAT_LIST", 19, 19, bkrVar2, blgVar2);
        u = new bks("INT64_LIST", 20, 20, bkrVar2, blgVar3);
        v = new bks("UINT64_LIST", 21, 21, bkrVar2, blgVar3);
        w = new bks("INT32_LIST", 22, 22, bkrVar2, blgVar4);
        x = new bks("FIXED64_LIST", 23, 23, bkrVar2, blgVar3);
        y = new bks("FIXED32_LIST", 24, 24, bkrVar2, blgVar4);
        z = new bks("BOOL_LIST", 25, 25, bkrVar2, blgVar5);
        A = new bks("STRING_LIST", 26, 26, bkrVar2, blgVar6);
        B = new bks("MESSAGE_LIST", 27, 27, bkrVar2, blgVar7);
        C = new bks("BYTES_LIST", 28, 28, bkrVar2, blgVar8);
        D = new bks("UINT32_LIST", 29, 29, bkrVar2, blgVar4);
        E = new bks("ENUM_LIST", 30, 30, bkrVar2, blgVar9);
        F = new bks("SFIXED32_LIST", 31, 31, bkrVar2, blgVar4);
        G = new bks("SFIXED64_LIST", 32, 32, bkrVar2, blgVar3);
        H = new bks("SINT32_LIST", 33, 33, bkrVar2, blgVar4);
        I = new bks("SINT64_LIST", 34, 34, bkrVar2, blgVar3);
        bkr bkrVar3 = bkr.PACKED_VECTOR;
        J = new bks("DOUBLE_LIST_PACKED", 35, 35, bkrVar3, blgVar);
        K = new bks("FLOAT_LIST_PACKED", 36, 36, bkrVar3, blgVar2);
        L = new bks("INT64_LIST_PACKED", 37, 37, bkrVar3, blgVar3);
        M = new bks("UINT64_LIST_PACKED", 38, 38, bkrVar3, blgVar3);
        N = new bks("INT32_LIST_PACKED", 39, 39, bkrVar3, blgVar4);
        O = new bks("FIXED64_LIST_PACKED", 40, 40, bkrVar3, blgVar3);
        P = new bks("FIXED32_LIST_PACKED", 41, 41, bkrVar3, blgVar4);
        Q = new bks("BOOL_LIST_PACKED", 42, 42, bkrVar3, blgVar5);
        R = new bks("UINT32_LIST_PACKED", 43, 43, bkrVar3, blgVar4);
        S = new bks("ENUM_LIST_PACKED", 44, 44, bkrVar3, blgVar9);
        T = new bks("SFIXED32_LIST_PACKED", 45, 45, bkrVar3, blgVar4);
        blg blgVar10 = blg.LONG;
        U = new bks("SFIXED64_LIST_PACKED", 46, 46, bkrVar3, blgVar10);
        V = new bks("SINT32_LIST_PACKED", 47, 47, bkrVar3, blg.INT);
        W = new bks("SINT64_LIST_PACKED", 48, 48, bkrVar3, blgVar10);
        X = new bks("GROUP_LIST", 49, 49, bkrVar2, blgVar7);
        Y = new bks("MAP", 50, 50, bkr.MAP, blg.VOID);
        aa = new bks[]{f21311a, f21312b, f21313c, f21314d, f21315e, f21316f, f21317g, f21318h, f21319i, f21320j, f21321k, f21322l, f21323m, f21324n, f21325o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y};
        bks[] bksVarArrValues = values();
        Z = new bks[bksVarArrValues.length];
        for (bks bksVar : bksVarArrValues) {
            Z[bksVar.ab] = bksVar;
        }
    }

    private bks(String str, int i2, int i3, bkr bkrVar, blg blgVar) {
        this.ab = i3;
        this.ac = bkrVar;
        blg blgVar2 = blg.VOID;
        bkr bkrVar2 = bkr.SCALAR;
        int iOrdinal = bkrVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            blgVar.a();
        }
        if (bkrVar == bkrVar2) {
            blgVar.ordinal();
        }
    }

    public static bks[] values() {
        return (bks[]) aa.clone();
    }

    public final int a() {
        return this.ab;
    }
}

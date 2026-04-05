package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class ul implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23199a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f23200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ke f23201c;
    private long A;
    private uk B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private rm G;
    private sf[] H;
    private sf[] I;
    private boolean J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<ke> f23203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<uk> f23204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final alx f23205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final alx f23206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final alx f23207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f23208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final alx f23209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aml f23210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final yx f23211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final alx f23212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque<tx> f23213o;
    private final ArrayDeque<uj> p;
    private final sf q;
    private int r;
    private int s;
    private long t;
    private int u;
    private alx v;
    private long w;
    private int x;
    private long y;
    private long z;

    static {
        un unVar = un.f23216a;
        f23200b = new byte[]{-94, 57, 79, 82, 90, -101, 79, DateTimeFieldType.SECOND_OF_DAY, -94, 68, 108, 66, 124, 100, -115, -12};
        kd kdVar = new kd();
        kdVar.ae("application/x-emsg");
        f23201c = kdVar.s();
    }

    public ul() {
        this(null);
    }

    public ul(int i2, aml amlVar, List<ke> list) {
        this(i2, amlVar, list, null);
    }

    public ul(int i2, aml amlVar, List<ke> list, sf sfVar) {
        this.f23202d = i2;
        this.f23210l = amlVar;
        this.f23203e = Collections.unmodifiableList(list);
        this.q = sfVar;
        this.f23211m = new yx();
        this.f23212n = new alx(16);
        this.f23205g = new alx(alr.f20069a);
        this.f23206h = new alx(5);
        this.f23207i = new alx();
        byte[] bArr = new byte[16];
        this.f23208j = bArr;
        this.f23209k = new alx(bArr);
        this.f23213o = new ArrayDeque<>();
        this.p = new ArrayDeque<>();
        this.f23204f = new SparseArray<>();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.G = rm.f22897a;
        this.H = new sf[0];
        this.I = new sf[0];
    }

    public ul(byte[] bArr) {
        this(0, null, Collections.emptyList());
    }

    private static qg e(List<ty> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ty tyVar = list.get(i2);
            if (tyVar.f23137d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrK = tyVar.f23136a.K();
                UUID uuidA = us.a(bArrK);
                if (uuidA == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new qf(uuidA, "video/mp4", bArrK));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new qg(arrayList);
    }

    private final void g() {
        this.r = 0;
        this.u = 0;
    }

    private static void h(alx alxVar, int i2, ux uxVar) throws lb {
        alxVar.I(i2 + 8);
        int iE = tz.e(alxVar.e());
        if ((iE & 1) != 0) {
            throw new lb("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iE & 2) != 0;
        int iN = alxVar.n();
        if (iN == 0) {
            Arrays.fill(uxVar.f23272m, 0, uxVar.f23264e, false);
            return;
        }
        int i3 = uxVar.f23264e;
        if (iN == i3) {
            Arrays.fill(uxVar.f23272m, 0, iN, z);
            uxVar.b(alxVar.a());
            alxVar.D(uxVar.f23274o.K(), 0, uxVar.f23274o.d());
            uxVar.f23274o.I(0);
            uxVar.p = false;
            return;
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append("Senc sample count ");
        sb.append(iN);
        sb.append(" is different from fragment sample count");
        sb.append(i3);
        throw new lb(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0667  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(long r47) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 1849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ul.i(long):void");
    }

    private static void j(int i2) throws lb {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i2);
        throw new lb(sb.toString());
    }

    private static final uh k(SparseArray<uh> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        uh uhVar = sparseArray.get(i2);
        ajr.b(uhVar);
        return uhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0237, code lost:
    
        r21 = r2.a();
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023f, code lost:
    
        if (r1 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0241, code lost:
    
        r24 = r1.f23257c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0246, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0248, code lost:
    
        r5.d(r9, r21, r28.C, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025b, code lost:
    
        if (r28.p.isEmpty() != false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025d, code lost:
    
        r1 = r28.p.removeFirst();
        r28.x -= r1.f23186b;
        r3 = r1.f23185a + r9;
        r5 = r28.f23210l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0271, code lost:
    
        if (r5 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0273, code lost:
    
        r3 = r5.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0277, code lost:
    
        r5 = r28.H;
        r7 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027b, code lost:
    
        if (r8 >= r7) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027d, code lost:
    
        r5[r8].d(r3, 1, r1.f23186b, r28.x, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0297, code lost:
    
        if (r2.j() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0299, code lost:
    
        r28.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x029b, code lost:
    
        r28.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (r28.r != 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        r3 = r2.b();
        r28.C = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r2.f23192f >= r2.f23195i) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r1.j(r3);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        r3 = r2.f23188b.f23274o;
        r1 = r1.f23258d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        r3.J(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        if (r2.f23188b.c(r2.f23192f) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        r3.J(r3.o() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        if (r2.j() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        r28.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r28.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        if (r2.f23190d.f23275a.f23250g != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
    
        r28.C = r3 - 8;
        r1.j(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        if ("audio/ac4".equals(r2.f23190d.f23275a.f23249f.f22156l) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        r28.D = r2.c(r28.C, 7);
        com.google.ads.interactivemedia.v3.internal.nt.b(r28.C, r28.f23209k);
        r2.f23187a.c(r28.f23209k, 7);
        r3 = r28.D + 7;
        r28.D = r3;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
    
        r5 = 0;
        r3 = r2.c(r28.C, 0);
        r28.D = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        r28.C += r3;
        r28.r = 4;
        r28.E = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        r3 = r2.f23190d.f23275a;
        r5 = r2.f23187a;
        r9 = r2.e();
        r7 = r28.f23210l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0137, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        r9 = r7.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        if (r3.f23253j != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
    
        r3 = r28.D;
        r4 = r28.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0145, code lost:
    
        if (r3 >= r4) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
    
        r28.D += r5.a(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0153, code lost:
    
        r11 = r28.f23206h.K();
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r7 = r3.f23253j;
        r13 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016c, code lost:
    
        if (r28.D >= r28.C) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        r14 = r28.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0172, code lost:
    
        if (r14 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        r1.h(r11, r7, r13);
        r28.f23206h.I(0);
        r14 = r28.f23206h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0183, code lost:
    
        if (r14 <= 0) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        r28.E = r14 - 1;
        r28.f23205g.I(0);
        r5.c(r28.f23205g, 4);
        r5.c(r28.f23206h, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019c, code lost:
    
        if (r28.I.length <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019e, code lost:
    
        r12 = r3.f23249f.f22156l;
        r18 = r11[4];
        r14 = com.google.ads.interactivemedia.v3.internal.alr.f20069a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ac, code lost:
    
        if ("video/avc".equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        if ((r18 & 31) == r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b3, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b9, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c0, code lost:
    
        if (((r18 & 126) >> r8) != 39) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c4, code lost:
    
        r28.F = r12;
        r28.D += 5;
        r28.C += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d9, code lost:
    
        throw new com.google.ads.interactivemedia.v3.internal.lb("Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dc, code lost:
    
        if (r28.F == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01de, code lost:
    
        r28.f23207i.E(r14);
        r1.h(r28.f23207i.K(), 0, r28.E);
        r5.c(r28.f23207i, r28.E);
        r4 = r28.E;
        r12 = com.google.ads.interactivemedia.v3.internal.alr.b(r28.f23207i.K(), r28.f23207i.d());
        r28.f23207i.I("video/hevc".equals(r3.f23249f.f22156l) ? 1 : 0);
        r28.f23207i.H(r12);
        com.google.ads.interactivemedia.v3.internal.us.q(r9, r28.f23207i, r28.I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0222, code lost:
    
        r4 = r5.a(r1, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0228, code lost:
    
        r28.D += r4;
        r28.E -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0714 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.rk r29, com.google.ads.interactivemedia.v3.internal.rz r30) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 1822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ul.a(com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.rz):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        int i2;
        this.G = rmVar;
        g();
        sf[] sfVarArr = new sf[2];
        this.H = sfVarArr;
        sf sfVar = this.q;
        int i3 = 0;
        if (sfVar != null) {
            sfVarArr[0] = sfVar;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.f23202d & 4) != 0) {
            sfVarArr[i2] = this.G.aZ(100, 5);
            i4 = 101;
            i2++;
        }
        sf[] sfVarArr2 = (sf[]) amn.ab(this.H, i2);
        this.H = sfVarArr2;
        for (sf sfVar2 : sfVarArr2) {
            sfVar2.b(f23201c);
        }
        this.I = new sf[this.f23203e.size()];
        while (i3 < this.I.length) {
            sf sfVarAZ = this.G.aZ(i4, 3);
            sfVarAZ.b(this.f23203e.get(i3));
            this.I[i3] = sfVarAZ;
            i3++;
            i4++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        int size = this.f23204f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f23204f.valueAt(i2).h();
        }
        this.p.clear();
        this.x = 0;
        this.y = j3;
        this.f23213o.clear();
        g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        return uu.a(rkVar);
    }
}

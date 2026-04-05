package c.f.a.b.b3.m;

import c.f.a.b.j3.h0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends c.f.a.b.b3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6574a = new a() { // from class: c.f.a.b.b3.m.a
        @Override // c.f.a.b.b3.m.h.a
        public final boolean a(int i2, int i3, int i4, int i5, int i6) {
            return h.y(i2, i3, i4, i5, i6);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6575b;

    public interface a {
        boolean a(int i2, int i3, int i4, int i5, int i6);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6578c;

        public b(int i2, boolean z, int i3) {
            this.f6576a = i2;
            this.f6577b = z;
            this.f6578c = i3;
        }
    }

    public h() {
        this(null);
    }

    public h(a aVar) {
        this.f6575b = aVar;
    }

    public static boolean A(i0 i0Var, int i2, int i3, boolean z) {
        int iG;
        long jG;
        int iJ;
        int i4;
        int iE = i0Var.e();
        while (true) {
            try {
                boolean z2 = true;
                if (i0Var.a() < i3) {
                    return true;
                }
                if (i2 >= 3) {
                    iG = i0Var.n();
                    jG = i0Var.F();
                    iJ = i0Var.J();
                } else {
                    iG = i0Var.G();
                    jG = i0Var.G();
                    iJ = 0;
                }
                if (iG == 0 && jG == 0 && iJ == 0) {
                    return true;
                }
                if (i2 == 4 && !z) {
                    if ((8421504 & jG) != 0) {
                        return false;
                    }
                    jG = (((jG >> 24) & 255) << 21) | (jG & 255) | (((jG >> 8) & 255) << 7) | (((jG >> 16) & 255) << 14);
                }
                if (i2 == 4) {
                    i4 = (iJ & 64) != 0 ? 1 : 0;
                    if ((iJ & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i2 == 3) {
                        i4 = (iJ & 32) != 0 ? 1 : 0;
                        if ((iJ & 128) == 0) {
                        }
                    } else {
                        i4 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i4 += 4;
                }
                if (jG < i4) {
                    return false;
                }
                if (i0Var.a() < jG) {
                    return false;
                }
                i0Var.Q((int) jG);
            } finally {
                i0Var.P(iE);
            }
        }
    }

    public static byte[] c(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? x0.f9301f : Arrays.copyOfRange(bArr, i2, i3);
    }

    public static c.f.a.b.b3.m.b e(i0 i0Var, int i2, int i3) {
        int iX;
        String str;
        int iD = i0Var.D();
        String strU = u(iD);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        i0Var.j(bArr, 0, i4);
        if (i3 == 2) {
            str = "image/" + c.f.b.a.b.e(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iX = 2;
        } else {
            iX = x(bArr, 0);
            String strE = c.f.b.a.b.e(new String(bArr, 0, iX, "ISO-8859-1"));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i5 = bArr[iX + 1] & 255;
        int i6 = iX + 2;
        int iW = w(bArr, i6, iD);
        return new c.f.a.b.b3.m.b(str, new String(bArr, i6, iW - i6, strU), i5, c(bArr, iW + t(iD), i4));
    }

    public static c f(i0 i0Var, int i2, String str) {
        byte[] bArr = new byte[i2];
        i0Var.j(bArr, 0, i2);
        return new c(str, bArr);
    }

    public static d g(i0 i0Var, int i2, int i3, boolean z, int i4, a aVar) {
        int iE = i0Var.e();
        int iX = x(i0Var.d(), iE);
        String str = new String(i0Var.d(), iE, iX - iE, "ISO-8859-1");
        i0Var.P(iX + 1);
        int iN = i0Var.n();
        int iN2 = i0Var.n();
        long jF = i0Var.F();
        long j2 = jF == 4294967295L ? -1L : jF;
        long jF2 = i0Var.F();
        long j3 = jF2 == 4294967295L ? -1L : jF2;
        ArrayList arrayList = new ArrayList();
        int i5 = iE + i2;
        while (i0Var.e() < i5) {
            i iVarJ = j(i3, i0Var, z, i4, aVar);
            if (iVarJ != null) {
                arrayList.add(iVarJ);
            }
        }
        return new d(str, iN, iN2, j2, j3, (i[]) arrayList.toArray(new i[0]));
    }

    public static e h(i0 i0Var, int i2, int i3, boolean z, int i4, a aVar) {
        int iE = i0Var.e();
        int iX = x(i0Var.d(), iE);
        String str = new String(i0Var.d(), iE, iX - iE, "ISO-8859-1");
        i0Var.P(iX + 1);
        int iD = i0Var.D();
        boolean z2 = (iD & 2) != 0;
        boolean z3 = (iD & 1) != 0;
        int iD2 = i0Var.D();
        String[] strArr = new String[iD2];
        for (int i5 = 0; i5 < iD2; i5++) {
            int iE2 = i0Var.e();
            int iX2 = x(i0Var.d(), iE2);
            strArr[i5] = new String(i0Var.d(), iE2, iX2 - iE2, "ISO-8859-1");
            i0Var.P(iX2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = iE + i2;
        while (i0Var.e() < i6) {
            i iVarJ = j(i3, i0Var, z, i4, aVar);
            if (iVarJ != null) {
                arrayList.add(iVarJ);
            }
        }
        return new e(str, z2, z3, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static f i(i0 i0Var, int i2) {
        if (i2 < 4) {
            return null;
        }
        int iD = i0Var.D();
        String strU = u(iD);
        byte[] bArr = new byte[3];
        i0Var.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        i0Var.j(bArr2, 0, i3);
        int iW = w(bArr2, 0, iD);
        String str2 = new String(bArr2, 0, iW, strU);
        int iT = iW + t(iD);
        return new f(str, str2, o(bArr2, iT, w(bArr2, iT, iD), strU));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea A[Catch: all -> 0x012e, UnsupportedEncodingException -> 0x0218, TryCatch #0 {UnsupportedEncodingException -> 0x0218, blocks: (B:91:0x011c, B:159:0x01f4, B:93:0x0124, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.b3.m.i j(int r19, c.f.a.b.j3.i0 r20, boolean r21, int r22, c.f.a.b.b3.m.h.a r23) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.b3.m.h.j(int, c.f.a.b.j3.i0, boolean, int, c.f.a.b.b3.m.h$a):c.f.a.b.b3.m.i");
    }

    public static g k(i0 i0Var, int i2) {
        int iD = i0Var.D();
        String strU = u(iD);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        i0Var.j(bArr, 0, i3);
        int iX = x(bArr, 0);
        String str = new String(bArr, 0, iX, "ISO-8859-1");
        int i4 = iX + 1;
        int iW = w(bArr, i4, iD);
        String strO = o(bArr, i4, iW, strU);
        int iT = iW + t(iD);
        int iW2 = w(bArr, iT, iD);
        return new g(str, strO, o(bArr, iT, iW2, strU), c(bArr, iW2 + t(iD), i3));
    }

    public static b l(i0 i0Var) {
        StringBuilder sb;
        String string;
        if (i0Var.a() < 10) {
            string = "Data too short to be an ID3 tag";
        } else {
            int iG = i0Var.G();
            boolean z = false;
            if (iG == 4801587) {
                int iD = i0Var.D();
                i0Var.Q(1);
                int iD2 = i0Var.D();
                int iC = i0Var.C();
                if (iD == 2) {
                    if ((iD2 & 64) != 0) {
                        string = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (iD == 3) {
                    if ((iD2 & 64) != 0) {
                        int iN = i0Var.n();
                        i0Var.Q(iN);
                        iC -= iN + 4;
                    }
                } else if (iD == 4) {
                    if ((iD2 & 64) != 0) {
                        int iC2 = i0Var.C();
                        i0Var.Q(iC2 - 4);
                        iC -= iC2;
                    }
                    if ((iD2 & 16) != 0) {
                        iC -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(iD);
                }
                if (iD < 4 && (iD2 & 128) != 0) {
                    z = true;
                }
                return new b(iD, z, iC);
            }
            sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", Integer.valueOf(iG)));
            string = sb.toString();
        }
        z.i("Id3Decoder", string);
        return null;
    }

    public static k m(i0 i0Var, int i2) {
        int iJ = i0Var.J();
        int iG = i0Var.G();
        int iG2 = i0Var.G();
        int iD = i0Var.D();
        int iD2 = i0Var.D();
        h0 h0Var = new h0();
        h0Var.m(i0Var);
        int i3 = ((i2 - 10) * 8) / (iD + iD2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iH = h0Var.h(iD);
            int iH2 = h0Var.h(iD2);
            iArr[i4] = iH;
            iArr2[i4] = iH2;
        }
        return new k(iJ, iG, iG2, iArr, iArr2);
    }

    public static l n(i0 i0Var, int i2) {
        byte[] bArr = new byte[i2];
        i0Var.j(bArr, 0, i2);
        int iX = x(bArr, 0);
        return new l(new String(bArr, 0, iX, "ISO-8859-1"), c(bArr, iX + 1, i2));
    }

    public static String o(byte[] bArr, int i2, int i3, String str) {
        return (i3 <= i2 || i3 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i2, i3 - i2, str);
    }

    public static m p(i0 i0Var, int i2, String str) {
        if (i2 < 1) {
            return null;
        }
        int iD = i0Var.D();
        String strU = u(iD);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        i0Var.j(bArr, 0, i3);
        return new m(str, null, new String(bArr, 0, w(bArr, 0, iD), strU));
    }

    public static m q(i0 i0Var, int i2) {
        if (i2 < 1) {
            return null;
        }
        int iD = i0Var.D();
        String strU = u(iD);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        i0Var.j(bArr, 0, i3);
        int iW = w(bArr, 0, iD);
        String str = new String(bArr, 0, iW, strU);
        int iT = iW + t(iD);
        return new m("TXXX", str, o(bArr, iT, w(bArr, iT, iD), strU));
    }

    public static n r(i0 i0Var, int i2, String str) {
        byte[] bArr = new byte[i2];
        i0Var.j(bArr, 0, i2);
        return new n(str, null, new String(bArr, 0, x(bArr, 0), "ISO-8859-1"));
    }

    public static n s(i0 i0Var, int i2) {
        if (i2 < 1) {
            return null;
        }
        int iD = i0Var.D();
        String strU = u(iD);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        i0Var.j(bArr, 0, i3);
        int iW = w(bArr, 0, iD);
        String str = new String(bArr, 0, iW, strU);
        int iT = iW + t(iD);
        return new n("WXXX", str, o(bArr, iT, x(bArr, iT), "ISO-8859-1"));
    }

    public static int t(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static String u(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String v(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int w(byte[] bArr, int i2, int i3) {
        int iX = x(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iX;
        }
        while (iX < bArr.length - 1) {
            if (iX % 2 == 0 && bArr[iX + 1] == 0) {
                return iX;
            }
            iX = x(bArr, iX + 1);
        }
        return bArr.length;
    }

    public static int x(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean y(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    public static int z(i0 i0Var, int i2) {
        byte[] bArrD = i0Var.d();
        int iE = i0Var.e();
        int i3 = iE;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iE + i2) {
                return i2;
            }
            if ((bArrD[i3] & 255) == 255 && bArrD[i4] == 0) {
                System.arraycopy(bArrD, i3 + 2, bArrD, i4, (i2 - (i3 - iE)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    @Override // c.f.a.b.b3.h
    public c.f.a.b.b3.a b(c.f.a.b.b3.e eVar, ByteBuffer byteBuffer) {
        return d(byteBuffer.array(), byteBuffer.limit());
    }

    public c.f.a.b.b3.a d(byte[] bArr, int i2) {
        ArrayList arrayList = new ArrayList();
        i0 i0Var = new i0(bArr, i2);
        b bVarL = l(i0Var);
        if (bVarL == null) {
            return null;
        }
        int iE = i0Var.e();
        int i3 = bVarL.f6576a == 2 ? 6 : 10;
        int iZ = bVarL.f6578c;
        if (bVarL.f6577b) {
            iZ = z(i0Var, bVarL.f6578c);
        }
        i0Var.O(iE + iZ);
        boolean z = false;
        if (!A(i0Var, bVarL.f6576a, i3, false)) {
            if (bVarL.f6576a != 4 || !A(i0Var, 4, i3, true)) {
                z.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarL.f6576a);
                return null;
            }
            z = true;
        }
        while (i0Var.a() >= i3) {
            i iVarJ = j(bVarL.f6576a, i0Var, z, i3, this.f6575b);
            if (iVarJ != null) {
                arrayList.add(iVarJ);
            }
        }
        return new c.f.a.b.b3.a(arrayList);
    }
}

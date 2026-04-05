package k;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f30954a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f30960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<String> f30961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f30962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f30963j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f30964a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f30967d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f30969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public List<String> f30970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public String f30971h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30965b = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30966c = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30968e = -1;

        /* JADX INFO: renamed from: k.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes2.dex */
        public enum EnumC0314a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f30969f = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        public static String d(String str, int i2, int i3) {
            String strT = t.t(str, i2, i3, false);
            if (!strT.contains(":")) {
                return k.g0.c.j(strT);
            }
            InetAddress inetAddressF = (strT.startsWith("[") && strT.endsWith("]")) ? f(strT, 1, strT.length() - 1) : f(strT, 0, strT.length());
            if (inetAddressF == null) {
                return null;
            }
            byte[] address = inetAddressF.getAddress();
            if (address.length == 16) {
                return j(address);
            }
            throw new AssertionError();
        }

        public static boolean e(String str, int i2, int i3, byte[] bArr, int i4) {
            int i5 = i4;
            while (i2 < i3) {
                if (i5 == bArr.length) {
                    return false;
                }
                if (i5 != i4) {
                    if (str.charAt(i2) != '.') {
                        return false;
                    }
                    i2++;
                }
                int i6 = i2;
                int i7 = 0;
                while (i6 < i3) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                        return false;
                    }
                    i6++;
                }
                if (i6 - i2 == 0) {
                    return false;
                }
                bArr[i5] = (byte) i7;
                i5++;
                i2 = i6;
            }
            return i5 == i4 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        
            if (r4 == 16) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
        
            if (r5 != (-1)) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
        
            r11 = r4 - r5;
            java.lang.System.arraycopy(r1, r5, r1, 16 - r11, r11);
            java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
        
            return java.net.InetAddress.getByAddress(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
        
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
        @javax.annotation.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.net.InetAddress f(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = -1
                r3 = 0
                r4 = 0
                r5 = -1
                r6 = -1
            L9:
                r7 = 0
                if (r12 >= r13) goto L7a
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L27
                java.lang.String r9 = "::"
                r10 = 2
                boolean r9 = r11.regionMatches(r12, r9, r3, r10)
                if (r9 == 0) goto L27
                if (r5 == r2) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r13) goto L25
                goto L7a
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L4a
                java.lang.String r8 = ":"
                r9 = 1
                boolean r8 = r11.regionMatches(r12, r8, r3, r9)
                if (r8 == 0) goto L35
                int r12 = r12 + 1
                goto L4a
            L35:
                java.lang.String r8 = "."
                boolean r12 = r11.regionMatches(r12, r8, r3, r9)
                if (r12 == 0) goto L49
                int r12 = r4 + (-2)
                boolean r11 = e(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L46
                return r7
            L46:
                int r4 = r4 + 2
                goto L7a
            L49:
                return r7
            L4a:
                r6 = r12
            L4b:
                r12 = r6
                r8 = 0
            L4d:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = k.t.d(r9)
                if (r9 != r2) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4d
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L79
                r10 = 4
                if (r9 <= r10) goto L68
                goto L79
            L68:
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                r9 = r9 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L79:
                return r7
            L7a:
                if (r4 == r0) goto L8b
                if (r5 != r2) goto L7f
                return r7
            L7f:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r3)
            L8b:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
                return r11
            L90:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                goto L97
            L96:
                throw r11
            L97:
                goto L96
            */
            throw new UnsupportedOperationException("Method not decompiled: k.t.a.f(java.lang.String, int, int):java.net.InetAddress");
        }

        public static String j(byte[] bArr) {
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i4 < bArr.length) {
                int i6 = i4;
                while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                    i6 += 2;
                }
                int i7 = i6 - i4;
                if (i7 > i5 && i7 >= 4) {
                    i3 = i4;
                    i5 = i7;
                }
                i4 = i6 + 2;
            }
            l.c cVar = new l.c();
            while (i2 < bArr.length) {
                if (i2 == i3) {
                    cVar.I(58);
                    i2 += i5;
                    if (i2 == 16) {
                        cVar.I(58);
                    }
                } else {
                    if (i2 > 0) {
                        cVar.I(58);
                    }
                    cVar.Y(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                    i2 += 2;
                }
            }
            return cVar.D0();
        }

        public static int n(String str, int i2, int i3) {
            int i4;
            try {
                i4 = Integer.parseInt(t.a(str, i2, i3, BuildConfig.FLAVOR, false, false, false, true));
            } catch (NumberFormatException unused) {
            }
            if (i4 <= 0 || i4 > 65535) {
                return -1;
            }
            return i4;
        }

        public static int r(String str, int i2, int i3) {
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == ':') {
                    return i2;
                }
                if (cCharAt == '[') {
                    do {
                        i2++;
                        if (i2 < i3) {
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }

        public static int w(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i2);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public static int x(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        public a a(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f30970g == null) {
                this.f30970g = new ArrayList();
            }
            this.f30970g.add(t.b(str, " \"'<>#&=", true, false, true, true));
            this.f30970g.add(str2 != null ? t.b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public a b(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f30970g == null) {
                this.f30970g = new ArrayList();
            }
            this.f30970g.add(t.b(str, " \"'<>#&=", false, false, true, true));
            this.f30970g.add(str2 != null ? t.b(str2, " \"'<>#&=", false, false, true, true) : null);
            return this;
        }

        public t c() {
            if (this.f30964a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f30967d != null) {
                return new t(this);
            }
            throw new IllegalStateException("host == null");
        }

        public int g() {
            int i2 = this.f30968e;
            return i2 != -1 ? i2 : t.e(this.f30964a);
        }

        public a h(@Nullable String str) {
            this.f30970g = str != null ? t.A(t.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a i(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strD = d(str, 0, str.length());
            if (strD != null) {
                this.f30967d = strD;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final boolean k(String str) {
            return str.equals(InstructionFileId.DOT) || str.equalsIgnoreCase("%2e");
        }

        public final boolean l(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public EnumC0314a m(@Nullable t tVar, String str) {
            int iH;
            int i2;
            int iV = k.g0.c.v(str, 0, str.length());
            int iW = k.g0.c.w(str, iV, str.length());
            if (w(str, iV, iW) != -1) {
                if (str.regionMatches(true, iV, "https:", 0, 6)) {
                    this.f30964a = ClientConstants.DOMAIN_SCHEME;
                    iV += 6;
                } else {
                    if (!str.regionMatches(true, iV, "http:", 0, 5)) {
                        return EnumC0314a.UNSUPPORTED_SCHEME;
                    }
                    this.f30964a = "http";
                    iV += 5;
                }
            } else {
                if (tVar == null) {
                    return EnumC0314a.MISSING_SCHEME;
                }
                this.f30964a = tVar.f30955b;
            }
            int iX = x(str, iV, iW);
            char c2 = '?';
            char c3 = '#';
            if (iX >= 2 || tVar == null || !tVar.f30955b.equals(this.f30964a)) {
                int i3 = iV + iX;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iH = k.g0.c.h(str, i3, iW, "@/\\?#");
                    byte bCharAt = iH != iW ? str.charAt(iH) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c3 || bCharAt == 47 || bCharAt == 92 || bCharAt == c2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            i2 = iH;
                            this.f30966c += "%40" + t.a(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        } else {
                            int iG = k.g0.c.g(str, i3, iH, ':');
                            i2 = iH;
                            String strA = t.a(str, i3, iG, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (z2) {
                                strA = this.f30965b + "%40" + strA;
                            }
                            this.f30965b = strA;
                            if (iG != i2) {
                                this.f30966c = t.a(str, iG + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                z = true;
                            }
                            z2 = true;
                        }
                        i3 = i2 + 1;
                    }
                    c2 = '?';
                    c3 = '#';
                }
                int iR = r(str, i3, iH);
                int i4 = iR + 1;
                this.f30967d = d(str, i3, iR);
                if (i4 < iH) {
                    int iN = n(str, i4, iH);
                    this.f30968e = iN;
                    if (iN == -1) {
                        return EnumC0314a.INVALID_PORT;
                    }
                } else {
                    this.f30968e = t.e(this.f30964a);
                }
                if (this.f30967d == null) {
                    return EnumC0314a.INVALID_HOST;
                }
                iV = iH;
            } else {
                this.f30965b = tVar.k();
                this.f30966c = tVar.g();
                this.f30967d = tVar.f30958e;
                this.f30968e = tVar.f30959f;
                this.f30969f.clear();
                this.f30969f.addAll(tVar.i());
                if (iV == iW || str.charAt(iV) == '#') {
                    h(tVar.j());
                }
            }
            int iH2 = k.g0.c.h(str, iV, iW, "?#");
            u(str, iV, iH2);
            if (iH2 < iW && str.charAt(iH2) == '?') {
                int iG2 = k.g0.c.g(str, iH2, iW, '#');
                this.f30970g = t.A(t.a(str, iH2 + 1, iG2, " \"'<>#", true, false, true, true));
                iH2 = iG2;
            }
            if (iH2 < iW && str.charAt(iH2) == '#') {
                this.f30971h = t.a(str, 1 + iH2, iW, BuildConfig.FLAVOR, true, false, false, false);
            }
            return EnumC0314a.SUCCESS;
        }

        public a o(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f30966c = t.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public final void p() {
            if (!this.f30969f.remove(r0.size() - 1).isEmpty() || this.f30969f.isEmpty()) {
                this.f30969f.add(BuildConfig.FLAVOR);
            } else {
                this.f30969f.set(r0.size() - 1, BuildConfig.FLAVOR);
            }
        }

        public a q(int i2) {
            if (i2 > 0 && i2 <= 65535) {
                this.f30968e = i2;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i2);
        }

        public final void s(String str, int i2, int i3, boolean z, boolean z2) {
            String strA = t.a(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, true);
            if (k(strA)) {
                return;
            }
            if (l(strA)) {
                p();
                return;
            }
            if (this.f30969f.get(r10.size() - 1).isEmpty()) {
                this.f30969f.set(r10.size() - 1, strA);
            } else {
                this.f30969f.add(strA);
            }
            if (z) {
                this.f30969f.add(BuildConfig.FLAVOR);
            }
        }

        public a t() {
            int size = this.f30969f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f30969f.set(i2, t.b(this.f30969f.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.f30970g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.f30970g.get(i3);
                    if (str != null) {
                        this.f30970g.set(i3, t.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f30971h;
            if (str2 != null) {
                this.f30971h = t.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30964a);
            sb.append("://");
            if (!this.f30965b.isEmpty() || !this.f30966c.isEmpty()) {
                sb.append(this.f30965b);
                if (!this.f30966c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f30966c);
                }
                sb.append('@');
            }
            if (this.f30967d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f30967d);
                sb.append(']');
            } else {
                sb.append(this.f30967d);
            }
            int iG = g();
            if (iG != t.e(this.f30964a)) {
                sb.append(':');
                sb.append(iG);
            }
            t.s(sb, this.f30969f);
            if (this.f30970g != null) {
                sb.append('?');
                t.n(sb, this.f30970g);
            }
            if (this.f30971h != null) {
                sb.append('#');
                sb.append(this.f30971h);
            }
            return sb.toString();
        }

        public final void u(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f30969f.clear();
                this.f30969f.add(BuildConfig.FLAVOR);
                i2++;
            } else {
                List<String> list = this.f30969f;
                list.set(list.size() - 1, BuildConfig.FLAVOR);
            }
            while (true) {
                int i4 = i2;
                if (i4 >= i3) {
                    return;
                }
                i2 = k.g0.c.h(str, i4, i3, "/\\");
                boolean z = i2 < i3;
                s(str, i4, i2, z, true);
                if (z) {
                    i2++;
                }
            }
        }

        public a v(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            String str2 = "http";
            if (!str.equalsIgnoreCase("http")) {
                str2 = ClientConstants.DOMAIN_SCHEME;
                if (!str.equalsIgnoreCase(ClientConstants.DOMAIN_SCHEME)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f30964a = str2;
            return this;
        }

        public a y(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f30965b = t.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    public t(a aVar) {
        this.f30955b = aVar.f30964a;
        this.f30956c = u(aVar.f30965b, false);
        this.f30957d = u(aVar.f30966c, false);
        this.f30958e = aVar.f30967d;
        this.f30959f = aVar.g();
        this.f30960g = v(aVar.f30969f, false);
        List<String> list = aVar.f30970g;
        this.f30961h = list != null ? v(list, true) : null;
        String str = aVar.f30971h;
        this.f30962i = str != null ? u(str, false) : null;
        this.f30963j = aVar.toString();
    }

    public static List<String> A(String str) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int iIndexOf = str.indexOf(38, i2);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i2);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i2, iIndexOf));
                strSubstring = null;
            } else {
                arrayList.add(str.substring(i2, iIndexOf2));
                strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
            }
            arrayList.add(strSubstring);
            i2 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iCharCount = i2;
        while (iCharCount < i3) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || (iCodePointAt >= 128 && z4)) {
                l.c cVar = new l.c();
                cVar.U0(str, i2, iCharCount);
                c(cVar, str, iCharCount, i3, str2, z, z2, z3, z4);
                return cVar.D0();
            }
            if (str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !x(str, iCharCount, i3)))) || (iCodePointAt == 43 && z3))) {
                l.c cVar2 = new l.c();
                cVar2.U0(str, i2, iCharCount);
                c(cVar2, str, iCharCount, i3, str2, z, z2, z3, z4);
                return cVar2.D0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i2, i3);
    }

    public static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    public static void c(l.c cVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        l.c cVar2 = null;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    cVar.P(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !x(str, i2, i3)))))) {
                    if (cVar2 == null) {
                        cVar2 = new l.c();
                    }
                    cVar2.V0(iCodePointAt);
                    while (!cVar2.H()) {
                        int iT = cVar2.T() & 255;
                        cVar.I(37);
                        char[] cArr = f30954a;
                        cVar.I(cArr[(iT >> 4) & 15]);
                        cVar.I(cArr[iT & 15]);
                    }
                } else {
                    cVar.V0(iCodePointAt);
                }
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    public static int d(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static int e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(ClientConstants.DOMAIN_SCHEME) ? 443 : -1;
    }

    public static void n(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    @Nullable
    public static t q(String str) {
        a aVar = new a();
        if (aVar.m(null, str) == a.EnumC0314a.SUCCESS) {
            return aVar.c();
        }
        return null;
    }

    public static void s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    public static String t(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                l.c cVar = new l.c();
                cVar.U0(str, i2, i4);
                w(cVar, str, i4, i3, z);
                return cVar.D0();
            }
        }
        return str.substring(i2, i3);
    }

    public static String u(String str, boolean z) {
        return t(str, 0, str.length(), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(l.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = d(r2)
            char r3 = r6.charAt(r1)
            int r3 = d(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.I(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.I(r1)
            goto L3c
        L39:
            r5.V0(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.t.w(l.c, java.lang.String, int, int, boolean):void");
    }

    public static boolean x(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && d(str.charAt(i2 + 1)) != -1 && d(str.charAt(i4)) != -1;
    }

    public String B() {
        return p("/...").y(BuildConfig.FLAVOR).o(BuildConfig.FLAVOR).c().toString();
    }

    @Nullable
    public t C(String str) {
        a aVarP = p(str);
        if (aVarP != null) {
            return aVarP.c();
        }
        return null;
    }

    public String D() {
        return this.f30955b;
    }

    public URI E() {
        String string = o().t().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", BuildConfig.FLAVOR));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof t) && ((t) obj).f30963j.equals(this.f30963j);
    }

    @Nullable
    public String f() {
        if (this.f30962i == null) {
            return null;
        }
        return this.f30963j.substring(this.f30963j.indexOf(35) + 1);
    }

    public String g() {
        if (this.f30957d.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return this.f30963j.substring(this.f30963j.indexOf(58, this.f30955b.length() + 3) + 1, this.f30963j.indexOf(64));
    }

    public String h() {
        int iIndexOf = this.f30963j.indexOf(47, this.f30955b.length() + 3);
        String str = this.f30963j;
        return this.f30963j.substring(iIndexOf, k.g0.c.h(str, iIndexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f30963j.hashCode();
    }

    public List<String> i() {
        int iIndexOf = this.f30963j.indexOf(47, this.f30955b.length() + 3);
        String str = this.f30963j;
        int iH = k.g0.c.h(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iH) {
            int i2 = iIndexOf + 1;
            int iG = k.g0.c.g(this.f30963j, i2, iH, '/');
            arrayList.add(this.f30963j.substring(i2, iG));
            iIndexOf = iG;
        }
        return arrayList;
    }

    @Nullable
    public String j() {
        if (this.f30961h == null) {
            return null;
        }
        int iIndexOf = this.f30963j.indexOf(63) + 1;
        String str = this.f30963j;
        return this.f30963j.substring(iIndexOf, k.g0.c.g(str, iIndexOf + 1, str.length(), '#'));
    }

    public String k() {
        if (this.f30956c.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f30955b.length() + 3;
        String str = this.f30963j;
        return this.f30963j.substring(length, k.g0.c.h(str, length, str.length(), ":@"));
    }

    public String l() {
        return this.f30958e;
    }

    public boolean m() {
        return this.f30955b.equals(ClientConstants.DOMAIN_SCHEME);
    }

    public a o() {
        a aVar = new a();
        aVar.f30964a = this.f30955b;
        aVar.f30965b = k();
        aVar.f30966c = g();
        aVar.f30967d = this.f30958e;
        aVar.f30968e = this.f30959f != e(this.f30955b) ? this.f30959f : -1;
        aVar.f30969f.clear();
        aVar.f30969f.addAll(i());
        aVar.h(j());
        aVar.f30971h = f();
        return aVar;
    }

    @Nullable
    public a p(String str) {
        a aVar = new a();
        if (aVar.m(this, str) == a.EnumC0314a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    public List<String> r() {
        return this.f30960g;
    }

    public String toString() {
        return this.f30963j;
    }

    public final List<String> v(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? u(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int y() {
        return this.f30959f;
    }

    @Nullable
    public String z() {
        if (this.f30961h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        n(sb, this.f30961h);
        return sb.toString();
    }
}

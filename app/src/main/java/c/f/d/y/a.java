package c.f.d.y;

import c.f.d.w.f;
import c.f.d.w.n.e;
import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f16638b = ")]}'\n".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Reader f16639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16640d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final char[] f16641e = new char[1024];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16642f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16643g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16644h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16645i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16646j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f16650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16651o;
    public String[] p;
    public int[] q;

    /* JADX INFO: renamed from: c.f.d.y.a$a, reason: collision with other inner class name */
    public class C0206a extends f {
        @Override // c.f.d.w.f
        public void a(a aVar) throws IOException {
            int i2;
            if (aVar instanceof e) {
                ((e) aVar).Q0();
                return;
            }
            int iN = aVar.f16646j;
            if (iN == 0) {
                iN = aVar.n();
            }
            if (iN == 13) {
                i2 = 9;
            } else if (iN == 12) {
                i2 = 8;
            } else {
                if (iN != 14) {
                    throw new IllegalStateException("Expected a name but was " + aVar.B0() + aVar.v());
                }
                i2 = 10;
            }
            aVar.f16646j = i2;
        }
    }

    static {
        f.f16511a = new C0206a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f16650n = iArr;
        this.f16651o = 0;
        this.f16651o = 0 + 1;
        iArr[0] = 6;
        this.p = new String[32];
        this.q = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f16639c = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        l();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f16642f
            int r4 = r3 + r2
            int r5 = r6.f16643g
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f16641e
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.l()
            goto L5c
        L4e:
            char[] r3 = r6.f16641e
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.q(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f16641e
            int r4 = r6.f16642f
            r1.append(r3, r4, r2)
            int r3 = r6.f16642f
            int r3 = r3 + r2
            r6.f16642f = r3
            r2 = 1
            boolean r2 = r6.q(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f16641e
            int r3 = r6.f16642f
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f16641e
            int r3 = r6.f16642f
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f16642f
            int r2 = r2 + r0
            r6.f16642f = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.d.y.a.A0():java.lang.String");
    }

    public b B0() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        switch (iN) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int C0() {
        int i2;
        String str;
        String str2;
        char c2 = this.f16641e[this.f16642f];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            i2 = 7;
            str = Constants.NULL_VERSION_ID;
            str2 = "NULL";
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f16642f + i3 >= this.f16643g && !q(i3 + 1)) {
                return 0;
            }
            char c3 = this.f16641e[this.f16642f + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f16642f + length < this.f16643g || q(length + 1)) && u(this.f16641e[this.f16642f + length])) {
            return 0;
        }
        this.f16642f += length;
        this.f16646j = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (u(r14) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r9 != 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r10 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r13 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        if (r11 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if (r13 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
    
        if (r13 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        r18.f16647k = r11;
        r18.f16642f += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ba, code lost:
    
        r18.f16646j = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
    
        if (r9 == 2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c0, code lost:
    
        if (r9 == 4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c3, code lost:
    
        if (r9 != 7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c8, code lost:
    
        r18.f16648l = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cd, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D0() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.d.y.a.D0():int");
    }

    public final void E0(int i2) {
        int i3 = this.f16651o;
        int[] iArr = this.f16650n;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f16650n = Arrays.copyOf(iArr, i4);
            this.q = Arrays.copyOf(this.q, i4);
            this.p = (String[]) Arrays.copyOf(this.p, i4);
        }
        int[] iArr2 = this.f16650n;
        int i5 = this.f16651o;
        this.f16651o = i5 + 1;
        iArr2[i5] = i2;
    }

    public final char F0() throws IOException {
        int i2;
        int i3;
        if (this.f16642f == this.f16643g && !q(1)) {
            throw M0("Unterminated escape sequence");
        }
        char[] cArr = this.f16641e;
        int i4 = this.f16642f;
        int i5 = i4 + 1;
        this.f16642f = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f16644h++;
            this.f16645i = i5;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                throw M0("Invalid escape sequence");
            }
            if (i5 + 4 > this.f16643g && !q(4)) {
                throw M0("Unterminated escape sequence");
            }
            char c3 = 0;
            int i6 = this.f16642f;
            int i7 = i6 + 4;
            while (i6 < i7) {
                char c4 = this.f16641e[i6];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i2 = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f16641e, this.f16642f, 4));
                        }
                        i2 = c4 - 'A';
                    }
                    i3 = i2 + 10;
                } else {
                    i3 = c4 - '0';
                }
                c3 = (char) (c5 + i3);
                i6++;
            }
            this.f16642f += 4;
            return c3;
        }
        return c2;
    }

    public final void G0(boolean z) {
        this.f16640d = z;
    }

    public final void H0(char c2) throws IOException {
        char[] cArr = this.f16641e;
        while (true) {
            int i2 = this.f16642f;
            int i3 = this.f16643g;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f16642f = i4;
                        return;
                    }
                    if (c3 == '\\') {
                        this.f16642f = i4;
                        F0();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f16644h++;
                            this.f16645i = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f16642f = i2;
                    if (!q(1)) {
                        throw M0("Unterminated string");
                    }
                }
            }
        }
    }

    public final boolean I0(String str) {
        int length = str.length();
        while (true) {
            if (this.f16642f + length > this.f16643g && !q(length)) {
                return false;
            }
            char[] cArr = this.f16641e;
            int i2 = this.f16642f;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f16641e[this.f16642f + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.f16644h++;
            this.f16645i = i2 + 1;
            this.f16642f++;
        }
    }

    public final void J0() {
        char c2;
        do {
            if (this.f16642f >= this.f16643g && !q(1)) {
                return;
            }
            char[] cArr = this.f16641e;
            int i2 = this.f16642f;
            int i3 = i2 + 1;
            this.f16642f = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f16644h++;
                this.f16645i = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f16642f
            int r2 = r1 + r0
            int r3 = r4.f16643g
            if (r2 >= r3) goto L51
            char[] r2 = r4.f16641e
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.l()
        L4b:
            int r1 = r4.f16642f
            int r1 = r1 + r0
            r4.f16642f = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f16642f = r1
            r0 = 1
            boolean r0 = r4.q(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.d.y.a.K0():void");
    }

    public void L0() throws IOException {
        char c2;
        int i2 = 0;
        do {
            int iN = this.f16646j;
            if (iN == 0) {
                iN = n();
            }
            if (iN == 3) {
                E0(1);
            } else if (iN == 1) {
                E0(3);
            } else {
                if (iN == 4 || iN == 2) {
                    this.f16651o--;
                    i2--;
                } else if (iN == 14 || iN == 10) {
                    K0();
                } else {
                    if (iN == 8 || iN == 12) {
                        c2 = '\'';
                    } else if (iN == 9 || iN == 13) {
                        c2 = '\"';
                    } else if (iN == 16) {
                        this.f16642f += this.f16648l;
                    }
                    H0(c2);
                }
                this.f16646j = 0;
            }
            i2++;
            this.f16646j = 0;
        } while (i2 != 0);
        int[] iArr = this.q;
        int i3 = this.f16651o;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.p[i3 - 1] = Constants.NULL_VERSION_ID;
    }

    public final IOException M0(String str) throws d {
        throw new d(str + v());
    }

    public long Q() throws IOException {
        String strS0;
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.f16646j = 0;
            int[] iArr = this.q;
            int i2 = this.f16651o - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f16647k;
        }
        if (iN == 16) {
            this.f16649m = new String(this.f16641e, this.f16642f, this.f16648l);
            this.f16642f += this.f16648l;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw new IllegalStateException("Expected a long but was " + B0() + v());
            }
            if (iN == 10) {
                strS0 = A0();
            } else {
                strS0 = s0(iN == 8 ? '\'' : '\"');
            }
            this.f16649m = strS0;
            try {
                long j2 = Long.parseLong(this.f16649m);
                this.f16646j = 0;
                int[] iArr2 = this.q;
                int i3 = this.f16651o - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16646j = 11;
        double d2 = Double.parseDouble(this.f16649m);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.f16649m + v());
        }
        this.f16649m = null;
        this.f16646j = 0;
        int[] iArr3 = this.q;
        int i4 = this.f16651o - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    public String U() throws IOException {
        char c2;
        String strS0;
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 14) {
            strS0 = A0();
        } else {
            if (iN == 12) {
                c2 = '\'';
            } else {
                if (iN != 13) {
                    throw new IllegalStateException("Expected a name but was " + B0() + v());
                }
                c2 = '\"';
            }
            strS0 = s0(c2);
        }
        this.f16646j = 0;
        this.p[this.f16651o - 1] = strS0;
        return strS0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r1 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r7.f16642f = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r7.f16642f = r4 - 1;
        r2 = q(2);
        r7.f16642f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        l();
        r2 = r7.f16642f;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r3 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r3 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        r7.f16642f = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r7.f16642f = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (I0("*\/") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        throw M0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        r7.f16642f = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        if (r1 != '#') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int V(boolean r8) throws java.io.IOException {
        /*
            r7 = this;
            char[] r0 = r7.f16641e
        L2:
            int r1 = r7.f16642f
        L4:
            int r2 = r7.f16643g
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f16642f = r1
            boolean r1 = r7.q(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.v()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f16642f
            int r2 = r7.f16643g
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f16644h
            int r1 = r1 + r3
            r7.f16644h = r1
            r7.f16645i = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.f16642f = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f16642f = r4
            boolean r2 = r7.q(r6)
            int r4 = r7.f16642f
            int r4 = r4 + r3
            r7.f16642f = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.l()
            int r2 = r7.f16642f
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f16642f = r2
        L7c:
            r7.J0()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f16642f = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.I0(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f16642f
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.M0(r8)
            throw r8
        L98:
            r2 = 35
            r7.f16642f = r4
            if (r1 != r2) goto La2
            r7.l()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.d.y.a.V(boolean):int");
    }

    public void c0() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 7) {
            this.f16646j = 0;
            int[] iArr = this.q;
            int i2 = this.f16651o - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + B0() + v());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16646j = 0;
        this.f16650n[0] = 8;
        this.f16651o = 1;
        this.f16639c.close();
    }

    public void d() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 3) {
            E0(1);
            this.q[this.f16651o - 1] = 0;
            this.f16646j = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + B0() + v());
        }
    }

    public void i() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 1) {
            E0(3);
            this.f16646j = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + B0() + v());
        }
    }

    public final void l() throws IOException {
        if (!this.f16640d) {
            throw M0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final void m() throws IOException {
        V(true);
        int i2 = this.f16642f - 1;
        this.f16642f = i2;
        char[] cArr = f16638b;
        if (i2 + cArr.length > this.f16643g && !q(cArr.length)) {
            return;
        }
        int i3 = 0;
        while (true) {
            char[] cArr2 = f16638b;
            if (i3 >= cArr2.length) {
                this.f16642f += cArr2.length;
                return;
            } else if (this.f16641e[this.f16642f + i3] != cArr2[i3]) {
                return;
            } else {
                i3++;
            }
        }
    }

    public int n() throws IOException {
        int i2;
        int iV;
        int[] iArr = this.f16650n;
        int i3 = this.f16651o;
        int i4 = iArr[i3 - 1];
        if (i4 == 1) {
            iArr[i3 - 1] = 2;
        } else {
            if (i4 != 2) {
                if (i4 == 3 || i4 == 5) {
                    iArr[i3 - 1] = 4;
                    if (i4 == 5 && (iV = V(true)) != 44) {
                        if (iV != 59) {
                            if (iV != 125) {
                                throw M0("Unterminated object");
                            }
                            this.f16646j = 2;
                            return 2;
                        }
                        l();
                    }
                    int iV2 = V(true);
                    if (iV2 == 34) {
                        i2 = 13;
                    } else if (iV2 == 39) {
                        l();
                        i2 = 12;
                    } else {
                        if (iV2 == 125) {
                            if (i4 == 5) {
                                throw M0("Expected name");
                            }
                            this.f16646j = 2;
                            return 2;
                        }
                        l();
                        this.f16642f--;
                        if (!u((char) iV2)) {
                            throw M0("Expected name");
                        }
                        i2 = 14;
                    }
                } else if (i4 == 4) {
                    iArr[i3 - 1] = 5;
                    int iV3 = V(true);
                    if (iV3 != 58) {
                        if (iV3 != 61) {
                            throw M0("Expected ':'");
                        }
                        l();
                        if (this.f16642f < this.f16643g || q(1)) {
                            char[] cArr = this.f16641e;
                            int i5 = this.f16642f;
                            if (cArr[i5] == '>') {
                                this.f16642f = i5 + 1;
                            }
                        }
                    }
                } else if (i4 == 6) {
                    if (this.f16640d) {
                        m();
                    }
                    this.f16650n[this.f16651o - 1] = 7;
                } else if (i4 == 7) {
                    if (V(false) == -1) {
                        i2 = 17;
                    } else {
                        l();
                        this.f16642f--;
                    }
                } else if (i4 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f16646j = i2;
                return i2;
            }
            int iV4 = V(true);
            if (iV4 != 44) {
                if (iV4 != 59) {
                    if (iV4 != 93) {
                        throw M0("Unterminated array");
                    }
                    this.f16646j = 4;
                    return 4;
                }
                l();
            }
        }
        int iV5 = V(true);
        if (iV5 != 34) {
            if (iV5 == 39) {
                l();
                this.f16646j = 8;
                return 8;
            }
            if (iV5 != 44 && iV5 != 59) {
                if (iV5 == 91) {
                    this.f16646j = 3;
                    return 3;
                }
                if (iV5 != 93) {
                    if (iV5 == 123) {
                        this.f16646j = 1;
                        return 1;
                    }
                    this.f16642f--;
                    int iC0 = C0();
                    if (iC0 != 0) {
                        return iC0;
                    }
                    int iD0 = D0();
                    if (iD0 != 0) {
                        return iD0;
                    }
                    if (!u(this.f16641e[this.f16642f])) {
                        throw M0("Expected value");
                    }
                    l();
                    i2 = 10;
                } else if (i4 == 1) {
                    this.f16646j = 4;
                    return 4;
                }
            }
            if (i4 != 1 && i4 != 2) {
                throw M0("Unexpected value");
            }
            l();
            this.f16642f--;
            this.f16646j = 7;
            return 7;
        }
        i2 = 9;
        this.f16646j = i2;
        return i2;
    }

    public void o() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + B0() + v());
        }
        int i2 = this.f16651o - 1;
        this.f16651o = i2;
        int[] iArr = this.q;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f16646j = 0;
    }

    public void p() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + B0() + v());
        }
        int i2 = this.f16651o - 1;
        this.f16651o = i2;
        this.p[i2] = null;
        int[] iArr = this.q;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f16646j = 0;
    }

    public final boolean q(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f16641e;
        int i5 = this.f16645i;
        int i6 = this.f16642f;
        this.f16645i = i5 - i6;
        int i7 = this.f16643g;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f16643g = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f16643g = 0;
        }
        this.f16642f = 0;
        do {
            Reader reader = this.f16639c;
            int i9 = this.f16643g;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f16643g + i10;
            this.f16643g = i3;
            if (this.f16644h == 0 && (i4 = this.f16645i) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f16642f++;
                this.f16645i = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    public String r() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.f16651o;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f16650n[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.q[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.p;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean s() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        return (iN == 2 || iN == 4) ? false : true;
    }

    public final String s0(char c2) throws IOException {
        char[] cArr = this.f16641e;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f16642f;
            int i3 = this.f16643g;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f16642f = i4;
                        int i5 = (i4 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i5);
                        }
                        sb.append(cArr, i2, i5);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        this.f16642f = i4;
                        int i6 = (i4 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i2, i6);
                        sb.append(F0());
                    } else {
                        if (c3 == '\n') {
                            this.f16644h++;
                            this.f16645i = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i2 - i2);
                    this.f16642f = i2;
                    if (!q(1)) {
                        throw M0("Unterminated string");
                    }
                }
            }
        }
    }

    public final boolean t() {
        return this.f16640d;
    }

    public String toString() {
        return getClass().getSimpleName() + v();
    }

    public final boolean u(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        l();
        return false;
    }

    public String v() {
        return " at line " + (this.f16644h + 1) + " column " + ((this.f16642f - this.f16645i) + 1) + " path " + r();
    }

    public boolean w() throws IOException {
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 5) {
            this.f16646j = 0;
            int[] iArr = this.q;
            int i2 = this.f16651o - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iN == 6) {
            this.f16646j = 0;
            int[] iArr2 = this.q;
            int i3 = this.f16651o - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + B0() + v());
    }

    public String w0() throws IOException {
        String str;
        char c2;
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 10) {
            str = A0();
        } else {
            if (iN == 8) {
                c2 = '\'';
            } else if (iN == 9) {
                c2 = '\"';
            } else if (iN == 11) {
                str = this.f16649m;
                this.f16649m = null;
            } else if (iN == 15) {
                str = Long.toString(this.f16647k);
            } else {
                if (iN != 16) {
                    throw new IllegalStateException("Expected a string but was " + B0() + v());
                }
                str = new String(this.f16641e, this.f16642f, this.f16648l);
                this.f16642f += this.f16648l;
            }
            str = s0(c2);
        }
        this.f16646j = 0;
        int[] iArr = this.q;
        int i2 = this.f16651o - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public double x() throws IOException {
        String strS0;
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.f16646j = 0;
            int[] iArr = this.q;
            int i2 = this.f16651o - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f16647k;
        }
        if (iN == 16) {
            this.f16649m = new String(this.f16641e, this.f16642f, this.f16648l);
            this.f16642f += this.f16648l;
        } else {
            if (iN == 8 || iN == 9) {
                strS0 = s0(iN == 8 ? '\'' : '\"');
            } else if (iN == 10) {
                strS0 = A0();
            } else if (iN != 11) {
                throw new IllegalStateException("Expected a double but was " + B0() + v());
            }
            this.f16649m = strS0;
        }
        this.f16646j = 11;
        double d2 = Double.parseDouble(this.f16649m);
        if (!this.f16640d && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new d("JSON forbids NaN and infinities: " + d2 + v());
        }
        this.f16649m = null;
        this.f16646j = 0;
        int[] iArr2 = this.q;
        int i3 = this.f16651o - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }

    public int y() throws IOException {
        String strS0;
        int iN = this.f16646j;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            long j2 = this.f16647k;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f16646j = 0;
                int[] iArr = this.q;
                int i3 = this.f16651o - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f16647k + v());
        }
        if (iN == 16) {
            this.f16649m = new String(this.f16641e, this.f16642f, this.f16648l);
            this.f16642f += this.f16648l;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw new IllegalStateException("Expected an int but was " + B0() + v());
            }
            if (iN == 10) {
                strS0 = A0();
            } else {
                strS0 = s0(iN == 8 ? '\'' : '\"');
            }
            this.f16649m = strS0;
            try {
                int i4 = Integer.parseInt(this.f16649m);
                this.f16646j = 0;
                int[] iArr2 = this.q;
                int i5 = this.f16651o - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16646j = 11;
        double d2 = Double.parseDouble(this.f16649m);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.f16649m + v());
        }
        this.f16649m = null;
        this.f16646j = 0;
        int[] iArr3 = this.q;
        int i7 = this.f16651o - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }
}

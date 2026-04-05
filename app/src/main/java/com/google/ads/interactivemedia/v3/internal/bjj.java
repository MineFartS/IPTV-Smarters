package com.google.ads.interactivemedia.v3.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class bjj implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f21218b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f21227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f21228l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f21230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f21231o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21219c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f21220d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21221e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21222f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21223g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21224h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21217a = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21229m = 1;

    static {
        bgm.f21086a = new bji();
    }

    public bjj(Reader reader) {
        int[] iArr = new int[32];
        this.f21228l = iArr;
        iArr[0] = 6;
        this.f21230n = new String[32];
        this.f21231o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f21218b = reader;
    }

    private final void A(char c2) throws IOException {
        char[] cArr = this.f21220d;
        while (true) {
            int i2 = this.f21221e;
            int i3 = this.f21222f;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f21221e = i4;
                        return;
                    }
                    if (c3 == '\\') {
                        this.f21221e = i4;
                        l();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f21223g++;
                            this.f21224h = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f21221e = i2;
                    if (!C(1)) {
                        throw v("Unterminated string");
                    }
                }
            }
        }
    }

    private final void B() {
        char c2;
        do {
            if (this.f21221e >= this.f21222f && !C(1)) {
                return;
            }
            char[] cArr = this.f21220d;
            int i2 = this.f21221e;
            int i3 = i2 + 1;
            this.f21221e = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f21223g++;
                this.f21224h = i3;
                return;
            }
        } while (c2 != '\r');
    }

    private final boolean C(int i2) throws IOException {
        int i3;
        char[] cArr = this.f21220d;
        int i4 = this.f21224h;
        int i5 = this.f21221e;
        this.f21224h = i4 - i5;
        int i6 = this.f21222f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f21222f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f21222f = 0;
        }
        this.f21221e = 0;
        do {
            Reader reader = this.f21218b;
            int i8 = this.f21222f;
            int i9 = reader.read(cArr, i8, 1024 - i8);
            if (i9 == -1) {
                return false;
            }
            i3 = this.f21222f + i9;
            this.f21222f = i3;
            if (this.f21223g == 0 && this.f21224h == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f21221e++;
                this.f21224h = 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private final boolean D(char c2) throws IOException {
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
        y();
        return false;
    }

    private final char l() throws IOException {
        int i2;
        if (this.f21221e == this.f21222f && !C(1)) {
            throw v("Unterminated escape sequence");
        }
        char[] cArr = this.f21220d;
        int i3 = this.f21221e;
        int i4 = i3 + 1;
        this.f21221e = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f21223g++;
            this.f21224h = i4;
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
                throw v("Invalid escape sequence");
            }
            if (i4 + 4 > this.f21222f && !C(4)) {
                throw v("Unterminated escape sequence");
            }
            int i5 = this.f21221e;
            int i6 = i5 + 4;
            char c3 = 0;
            while (i5 < i6) {
                char[] cArr2 = this.f21220d;
                char c4 = cArr2[i5];
                char c5 = (char) (c3 << 4);
                if (c4 >= '0' && c4 <= '9') {
                    i2 = c4 - '0';
                } else if (c4 >= 'a' && c4 <= 'f') {
                    i2 = c4 - 'W';
                } else {
                    if (c4 < 'A' || c4 > 'F') {
                        String str = new String(cArr2, this.f21221e, 4);
                        throw new NumberFormatException(str.length() != 0 ? "\\u".concat(str) : new String("\\u"));
                    }
                    i2 = c4 - '7';
                }
                c3 = (char) (c5 + i2);
                i5++;
            }
            this.f21221e += 4;
            return c3;
        }
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r1 != '/') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        r8.f21221e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r4 != r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r8.f21221e = r4 - 1;
        r2 = C(2);
        r8.f21221e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r2 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        y();
        r2 = r8.f21221e;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r4 == '*') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        if (r4 == '/') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        r8.f21221e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        r8.f21221e = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if ((r8.f21221e + 2) <= r8.f21222f) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        if (C(2) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        throw v("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        r2 = r8.f21220d;
        r4 = r8.f21221e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r2[r4] != '\n') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        r8.f21223g++;
        r8.f21224h = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
    
        if (r2 >= 2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
    
        if (r8.f21220d[r8.f21221e + r2] != "*\/".charAt(r2)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c5, code lost:
    
        r2 = r8.f21221e + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        r8.f21221e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        if (r1 != '#') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d4, code lost:
    
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dc, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int u(boolean r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjj.u(boolean):int");
    }

    private final IOException v(String str) throws bjm {
        String strValueOf = String.valueOf(r());
        throw new bjm(strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str));
    }

    private final String w(char c2) throws IOException {
        char[] cArr = this.f21220d;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f21221e;
            int i3 = this.f21222f;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f21221e = i4;
                        int i5 = (i4 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i5);
                        }
                        sb.append(cArr, i2, i5);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        this.f21221e = i4;
                        int i6 = (i4 - i2) - 1;
                        if (sb == null) {
                            int i7 = i6 + 1;
                            sb = new StringBuilder(Math.max(i7 + i7, 16));
                        }
                        sb.append(cArr, i2, i6);
                        sb.append(l());
                    } else {
                        if (c3 == '\n') {
                            this.f21223g++;
                            this.f21224h = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    if (sb == null) {
                        int i8 = i2 - i2;
                        sb = new StringBuilder(Math.max(i8 + i8, 16));
                    }
                    sb.append(cArr, i2, i2 - i2);
                    this.f21221e = i2;
                    if (!C(1)) {
                        throw v("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        y();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String x() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.f21221e
            int r3 = r3 + r2
            int r4 = r5.f21222f
            if (r3 >= r4) goto L4c
            char[] r4 = r5.f21220d
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.y()
            goto L58
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r5.C(r3)
            if (r3 != 0) goto L3
        L58:
            r0 = r2
            goto L7a
        L5a:
            if (r1 != 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L67:
            char[] r3 = r5.f21220d
            int r4 = r5.f21221e
            r1.append(r3, r4, r2)
            int r3 = r5.f21221e
            int r3 = r3 + r2
            r5.f21221e = r3
            r2 = 1
            boolean r2 = r5.C(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r1 != 0) goto L86
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.f21220d
            int r3 = r5.f21221e
            r1.<init>(r2, r3, r0)
            goto L91
        L86:
            char[] r2 = r5.f21220d
            int r3 = r5.f21221e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L91:
            int r2 = r5.f21221e
            int r2 = r2 + r0
            r5.f21221e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjj.x():java.lang.String");
    }

    private final void y() throws IOException {
        if (!this.f21219c) {
            throw v("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private final void z(int i2) {
        int i3 = this.f21229m;
        int[] iArr = this.f21228l;
        if (i3 == iArr.length) {
            int i4 = i3 + i3;
            this.f21228l = Arrays.copyOf(iArr, i4);
            this.f21231o = Arrays.copyOf(this.f21231o, i4);
            this.f21230n = (String[]) Arrays.copyOf(this.f21230n, i4);
        }
        int[] iArr2 = this.f21228l;
        int i5 = this.f21229m;
        this.f21229m = i5 + 1;
        iArr2[i5] = i2;
    }

    public double a() throws IOException {
        String strW;
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            this.f21217a = 0;
            int[] iArr = this.f21231o;
            int i2 = this.f21229m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f21225i;
        }
        if (iQ == 16) {
            this.f21227k = new String(this.f21220d, this.f21221e, this.f21226j);
            this.f21221e += this.f21226j;
        } else {
            if (iQ == 8 || iQ == 9) {
                strW = w(iQ == 8 ? '\'' : '\"');
            } else if (iQ == 10) {
                strW = x();
            } else if (iQ != 11) {
                String strA = bjk.a(p());
                String strR = r();
                StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 26 + String.valueOf(strR).length());
                sb.append("Expected a double but was ");
                sb.append(strA);
                sb.append(strR);
                throw new IllegalStateException(sb.toString());
            }
            this.f21227k = strW;
        }
        this.f21217a = 11;
        double d2 = Double.parseDouble(this.f21227k);
        if (this.f21219c || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            this.f21227k = null;
            this.f21217a = 0;
            int[] iArr2 = this.f21231o;
            int i3 = this.f21229m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d2;
        }
        String strR2 = r();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strR2).length() + 57);
        sb2.append("JSON forbids NaN and infinities: ");
        sb2.append(d2);
        sb2.append(strR2);
        throw new bjm(sb2.toString());
    }

    public int b() throws IOException {
        String strW;
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            long j2 = this.f21225i;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f21217a = 0;
                int[] iArr = this.f21231o;
                int i3 = this.f21229m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            String strR = r();
            StringBuilder sb = new StringBuilder(String.valueOf(strR).length() + 44);
            sb.append("Expected an int but was ");
            sb.append(j2);
            sb.append(strR);
            throw new NumberFormatException(sb.toString());
        }
        if (iQ == 16) {
            this.f21227k = new String(this.f21220d, this.f21221e, this.f21226j);
            this.f21221e += this.f21226j;
        } else {
            if (iQ != 8 && iQ != 9 && iQ != 10) {
                String strA = bjk.a(p());
                String strR2 = r();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + 24 + String.valueOf(strR2).length());
                sb2.append("Expected an int but was ");
                sb2.append(strA);
                sb2.append(strR2);
                throw new IllegalStateException(sb2.toString());
            }
            if (iQ == 10) {
                strW = x();
            } else {
                strW = w(iQ == 8 ? '\'' : '\"');
            }
            this.f21227k = strW;
            try {
                int i4 = Integer.parseInt(this.f21227k);
                this.f21217a = 0;
                int[] iArr2 = this.f21231o;
                int i5 = this.f21229m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21217a = 11;
        double d2 = Double.parseDouble(this.f21227k);
        int i6 = (int) d2;
        if (i6 == d2) {
            this.f21227k = null;
            this.f21217a = 0;
            int[] iArr3 = this.f21231o;
            int i7 = this.f21229m - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        String str = this.f21227k;
        String strR3 = r();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(strR3).length());
        sb3.append("Expected an int but was ");
        sb3.append(str);
        sb3.append(strR3);
        throw new NumberFormatException(sb3.toString());
    }

    public long c() throws IOException {
        String strW;
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            this.f21217a = 0;
            int[] iArr = this.f21231o;
            int i2 = this.f21229m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f21225i;
        }
        if (iQ == 16) {
            this.f21227k = new String(this.f21220d, this.f21221e, this.f21226j);
            this.f21221e += this.f21226j;
        } else {
            if (iQ != 8 && iQ != 9 && iQ != 10) {
                String strA = bjk.a(p());
                String strR = r();
                StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 24 + String.valueOf(strR).length());
                sb.append("Expected a long but was ");
                sb.append(strA);
                sb.append(strR);
                throw new IllegalStateException(sb.toString());
            }
            if (iQ == 10) {
                strW = x();
            } else {
                strW = w(iQ == 8 ? '\'' : '\"');
            }
            this.f21227k = strW;
            try {
                long j2 = Long.parseLong(this.f21227k);
                this.f21217a = 0;
                int[] iArr2 = this.f21231o;
                int i3 = this.f21229m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21217a = 11;
        double d2 = Double.parseDouble(this.f21227k);
        long j3 = (long) d2;
        if (j3 == d2) {
            this.f21227k = null;
            this.f21217a = 0;
            int[] iArr3 = this.f21231o;
            int i4 = this.f21229m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j3;
        }
        String str = this.f21227k;
        String strR2 = r();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(strR2).length());
        sb2.append("Expected a long but was ");
        sb2.append(str);
        sb2.append(strR2);
        throw new NumberFormatException(sb2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21217a = 0;
        this.f21228l[0] = 8;
        this.f21229m = 1;
        this.f21218b.close();
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.f21229m;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f21228l[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.f21231o[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.f21230n[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public String e() throws IOException {
        char c2;
        String strW;
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 14) {
            strW = x();
        } else {
            if (iQ == 12) {
                c2 = '\'';
            } else {
                if (iQ != 13) {
                    String strA = bjk.a(p());
                    String strR = r();
                    StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 24 + String.valueOf(strR).length());
                    sb.append("Expected a name but was ");
                    sb.append(strA);
                    sb.append(strR);
                    throw new IllegalStateException(sb.toString());
                }
                c2 = '\"';
            }
            strW = w(c2);
        }
        this.f21217a = 0;
        this.f21230n[this.f21229m - 1] = strW;
        return strW;
    }

    public String f() throws IOException {
        String str;
        char c2;
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 10) {
            str = x();
        } else {
            if (iQ == 8) {
                c2 = '\'';
            } else if (iQ == 9) {
                c2 = '\"';
            } else if (iQ == 11) {
                str = this.f21227k;
                this.f21227k = null;
            } else if (iQ == 15) {
                str = Long.toString(this.f21225i);
            } else {
                if (iQ != 16) {
                    String strA = bjk.a(p());
                    String strR = r();
                    StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 26 + String.valueOf(strR).length());
                    sb.append("Expected a string but was ");
                    sb.append(strA);
                    sb.append(strR);
                    throw new IllegalStateException(sb.toString());
                }
                str = new String(this.f21220d, this.f21221e, this.f21226j);
                this.f21221e += this.f21226j;
            }
            str = w(c2);
        }
        this.f21217a = 0;
        int[] iArr = this.f21231o;
        int i2 = this.f21229m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public void g() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 3) {
            z(1);
            this.f21231o[this.f21229m - 1] = 0;
            this.f21217a = 0;
            return;
        }
        String strA = bjk.a(p());
        String strR = r();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 29 + String.valueOf(strR).length());
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(strA);
        sb.append(strR);
        throw new IllegalStateException(sb.toString());
    }

    public void h() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 1) {
            z(3);
            this.f21217a = 0;
            return;
        }
        String strA = bjk.a(p());
        String strR = r();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 30 + String.valueOf(strR).length());
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(strA);
        sb.append(strR);
        throw new IllegalStateException(sb.toString());
    }

    public void i() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 4) {
            int i2 = this.f21229m - 1;
            this.f21229m = i2;
            int[] iArr = this.f21231o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f21217a = 0;
            return;
        }
        String strA = bjk.a(p());
        String strR = r();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 27 + String.valueOf(strR).length());
        sb.append("Expected END_ARRAY but was ");
        sb.append(strA);
        sb.append(strR);
        throw new IllegalStateException(sb.toString());
    }

    public void j() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 2) {
            int i2 = this.f21229m - 1;
            this.f21229m = i2;
            this.f21230n[i2] = null;
            int[] iArr = this.f21231o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f21217a = 0;
            return;
        }
        String strA = bjk.a(p());
        String strR = r();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 28 + String.valueOf(strR).length());
        sb.append("Expected END_OBJECT but was ");
        sb.append(strA);
        sb.append(strR);
        throw new IllegalStateException(sb.toString());
    }

    public void k() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 7) {
            this.f21217a = 0;
            int[] iArr = this.f21231o;
            int i2 = this.f21229m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        String strA = bjk.a(p());
        String strR = r();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 22 + String.valueOf(strR).length());
        sb.append("Expected null but was ");
        sb.append(strA);
        sb.append(strR);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x009a, code lost:
    
        y();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0094. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjj.m():void");
    }

    public boolean n() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        return (iQ == 2 || iQ == 4) ? false : true;
    }

    public boolean o() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 5) {
            this.f21217a = 0;
            int[] iArr = this.f21231o;
            int i2 = this.f21229m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iQ == 6) {
            this.f21217a = 0;
            int[] iArr2 = this.f21231o;
            int i3 = this.f21229m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        String strA = bjk.a(p());
        String strR = r();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 27 + String.valueOf(strR).length());
        sb.append("Expected a boolean but was ");
        sb.append(strA);
        sb.append(strR);
        throw new IllegalStateException(sb.toString());
    }

    public int p() {
        int iQ = this.f21217a;
        if (iQ == 0) {
            iQ = q();
        }
        switch (iQ) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0217, code lost:
    
        if (D(r1) == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0299 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q() {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjj.q():int");
    }

    public String r() {
        int i2 = this.f21223g;
        int i3 = this.f21221e;
        int i4 = this.f21224h;
        String strD = d();
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 45);
        sb.append(" at line ");
        sb.append(i2 + 1);
        sb.append(" column ");
        sb.append((i3 - i4) + 1);
        sb.append(" path ");
        sb.append(strD);
        return sb.toString();
    }

    public final void s(boolean z) {
        this.f21219c = z;
    }

    public final boolean t() {
        return this.f21219c;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String strValueOf = String.valueOf(r());
        return strValueOf.length() != 0 ? simpleName.concat(strValueOf) : new String(simpleName);
    }
}

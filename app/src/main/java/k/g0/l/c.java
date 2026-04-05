package k.g0.l;

import javax.security.auth.x500.X500Principal;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f30879g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f30873a = name;
        this.f30874b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r1 = r8.f30879g;
        r2 = r8.f30876d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return new java.lang.String(r1, r2, r8.f30877e - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f30875c
            r8.f30876d = r0
            r8.f30877e = r0
        L6:
            int r0 = r8.f30875c
            int r1 = r8.f30874b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f30879g
            int r2 = r8.f30876d
            int r3 = r8.f30877e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f30879g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L4f
            r5 = 92
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L4f
            if (r2 == r3) goto L4f
            int r2 = r8.f30877e
            int r3 = r2 + 1
            r8.f30877e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L4a
        L3c:
            int r0 = r8.f30877e
            int r2 = r0 + 1
            r8.f30877e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f30875c
        L4a:
            int r0 = r0 + 1
            r8.f30875c = r0
            goto L6
        L4f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f30879g
            int r2 = r8.f30876d
            int r3 = r8.f30877e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f30877e
            r8.f30878f = r2
            int r0 = r0 + 1
            r8.f30875c = r0
            int r0 = r2 + 1
            r8.f30877e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f30875c
            int r1 = r8.f30874b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f30879g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f30877e
            int r7 = r1 + 1
            r8.f30877e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f30875c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L93
            char[] r1 = r8.f30879g
            char r2 = r1[r0]
            if (r2 == r3) goto L93
            char r2 = r1[r0]
            if (r2 == r4) goto L93
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L93:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f30879g
            int r2 = r8.f30876d
            int r3 = r8.f30878f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g0.l.c.a():java.lang.String");
    }

    public String b(String str) {
        this.f30875c = 0;
        this.f30876d = 0;
        this.f30877e = 0;
        this.f30878f = 0;
        this.f30879g = this.f30873a.toCharArray();
        String strG = g();
        if (strG == null) {
            return null;
        }
        do {
            int i2 = this.f30875c;
            if (i2 == this.f30874b) {
                return null;
            }
            char c2 = this.f30879g[i2];
            String strA = c2 != '\"' ? c2 != '#' ? (c2 == '+' || c2 == ',' || c2 == ';') ? BuildConfig.FLAVOR : a() : f() : h();
            if (str.equalsIgnoreCase(strG)) {
                return strA;
            }
            int i3 = this.f30875c;
            if (i3 >= this.f30874b) {
                return null;
            }
            char[] cArr = this.f30879g;
            if (cArr[i3] != ',' && cArr[i3] != ';' && cArr[i3] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f30873a);
            }
            this.f30875c = i3 + 1;
            strG = g();
        } while (strG != null);
        throw new IllegalStateException("Malformed DN: " + this.f30873a);
    }

    public final int c(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 >= this.f30874b) {
            throw new IllegalStateException("Malformed DN: " + this.f30873a);
        }
        char[] cArr = this.f30879g;
        char c2 = cArr[i2];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f30873a);
            }
            i3 = c2 - '7';
        }
        char c3 = cArr[i5];
        if (c3 >= '0' && c3 <= '9') {
            i4 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i4 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f30873a);
            }
            i4 = c3 - '7';
        }
        return (i3 << 4) + i4;
    }

    public final char d() {
        int i2 = this.f30875c + 1;
        this.f30875c = i2;
        if (i2 == this.f30874b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f30873a);
        }
        char[] cArr = this.f30879g;
        char c2 = cArr[i2];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
            switch (c2) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c2) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return e();
                    }
                    break;
            }
        }
        return cArr[i2];
    }

    public final char e() {
        int i2;
        int i3;
        int iC = c(this.f30875c);
        this.f30875c++;
        if (iC < 128) {
            return (char) iC;
        }
        if (iC < 192 || iC > 247) {
            return '?';
        }
        if (iC <= 223) {
            i3 = iC & 31;
            i2 = 1;
        } else if (iC <= 239) {
            i2 = 2;
            i3 = iC & 15;
        } else {
            i2 = 3;
            i3 = iC & 7;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = this.f30875c + 1;
            this.f30875c = i5;
            if (i5 == this.f30874b || this.f30879g[i5] != '\\') {
                return '?';
            }
            int i6 = i5 + 1;
            this.f30875c = i6;
            int iC2 = c(i6);
            this.f30875c++;
            if ((iC2 & 192) != 128) {
                return '?';
            }
            i3 = (i3 << 6) + (iC2 & 63);
        }
        return (char) i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r6.f30877e = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f() {
        /*
            r6 = this;
            int r0 = r6.f30875c
            int r1 = r0 + 4
            int r2 = r6.f30874b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L9b
            r6.f30876d = r0
        Lc:
            int r0 = r0 + 1
            r6.f30875c = r0
            int r0 = r6.f30875c
            int r1 = r6.f30874b
            if (r0 == r1) goto L57
            char[] r1 = r6.f30879g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L57
            char r2 = r1[r0]
            r4 = 44
            if (r2 == r4) goto L57
            char r2 = r1[r0]
            r4 = 59
            if (r2 != r4) goto L2b
            goto L57
        L2b:
            char r2 = r1[r0]
            r4 = 32
            if (r2 != r4) goto L44
            r6.f30877e = r0
        L33:
            int r0 = r0 + 1
            r6.f30875c = r0
            int r0 = r6.f30875c
            int r1 = r6.f30874b
            if (r0 >= r1) goto L59
            char[] r1 = r6.f30879g
            char r1 = r1[r0]
            if (r1 != r4) goto L59
            goto L33
        L44:
            char r2 = r1[r0]
            r5 = 65
            if (r2 < r5) goto Lc
            char r2 = r1[r0]
            r5 = 70
            if (r2 > r5) goto Lc
            char r2 = r1[r0]
            int r2 = r2 + r4
            char r2 = (char) r2
            r1[r0] = r2
            goto Lc
        L57:
            r6.f30877e = r0
        L59:
            int r0 = r6.f30877e
            int r1 = r6.f30876d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L84
            r2 = r0 & 1
            if (r2 == 0) goto L84
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            r4 = 0
            int r1 = r1 + 1
        L6c:
            if (r4 >= r2) goto L7a
            int r5 = r6.c(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L6c
        L7a:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f30879g
            int r3 = r6.f30876d
            r1.<init>(r2, r3, r0)
            return r1
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f30873a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f30873a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto Lb3
        Lb2:
            throw r0
        Lb3:
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g0.l.c.f():java.lang.String");
    }

    public final String g() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char[] cArr;
        while (true) {
            i2 = this.f30875c;
            i3 = this.f30874b;
            if (i2 >= i3 || this.f30879g[i2] != ' ') {
                break;
            }
            this.f30875c = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.f30876d = i2;
        do {
            this.f30875c = i2 + 1;
            i2 = this.f30875c;
            i4 = this.f30874b;
            if (i2 >= i4) {
                break;
            }
            cArr = this.f30879g;
            if (cArr[i2] == '=') {
                break;
            }
        } while (cArr[i2] != ' ');
        if (i2 >= i4) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f30873a);
        }
        this.f30877e = i2;
        if (this.f30879g[i2] == ' ') {
            while (true) {
                i5 = this.f30875c;
                i6 = this.f30874b;
                if (i5 >= i6) {
                    break;
                }
                char[] cArr2 = this.f30879g;
                if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                    break;
                }
                this.f30875c = i5 + 1;
            }
            if (this.f30879g[i5] != '=' || i5 == i6) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f30873a);
            }
        }
        int i7 = this.f30875c;
        do {
            this.f30875c = i7 + 1;
            i7 = this.f30875c;
            if (i7 >= this.f30874b) {
                break;
            }
        } while (this.f30879g[i7] == ' ');
        int i8 = this.f30877e;
        int i9 = this.f30876d;
        if (i8 - i9 > 4) {
            char[] cArr3 = this.f30879g;
            if (cArr3[i9 + 3] == '.' && ((cArr3[i9] == 'O' || cArr3[i9] == 'o') && ((cArr3[i9 + 1] == 'I' || cArr3[i9 + 1] == 'i') && (cArr3[i9 + 2] == 'D' || cArr3[i9 + 2] == 'd')))) {
                this.f30876d = i9 + 4;
            }
        }
        char[] cArr4 = this.f30879g;
        int i10 = this.f30876d;
        return new String(cArr4, i10, this.f30877e - i10);
    }

    public final String h() {
        int i2 = this.f30875c + 1;
        this.f30875c = i2;
        this.f30876d = i2;
        while (true) {
            this.f30877e = i2;
            int i3 = this.f30875c;
            if (i3 == this.f30874b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f30873a);
            }
            char[] cArr = this.f30879g;
            if (cArr[i3] == '\"') {
                do {
                    this.f30875c = i3 + 1;
                    i3 = this.f30875c;
                    if (i3 >= this.f30874b) {
                        break;
                    }
                } while (this.f30879g[i3] == ' ');
                char[] cArr2 = this.f30879g;
                int i4 = this.f30876d;
                return new String(cArr2, i4, this.f30877e - i4);
            }
            if (cArr[i3] == '\\') {
                cArr[this.f30877e] = d();
            } else {
                cArr[this.f30877e] = cArr[i3];
            }
            this.f30875c++;
            i2 = this.f30877e + 1;
        }
    }
}

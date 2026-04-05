package a.i.p;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f1917h;

    /* JADX INFO: renamed from: a.i.p.a$a, reason: collision with other inner class name */
    public static final class C0037a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f1920c;

        public C0037a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z) {
            return z ? a.f1914e : a.f1913d;
        }

        public a a() {
            return (this.f1919b == 2 && this.f1920c == a.f1910a) ? b(this.f1918a) : new a(this.f1918a, this.f1919b, this.f1920c);
        }

        public final void c(boolean z) {
            this.f1918a = z;
            this.f1920c = a.f1910a;
            this.f1919b = 2;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f1921a = new byte[1792];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f1922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f1923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public char f1926f;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f1921a[i2] = Character.getDirectionality(i2);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.f1922b = charSequence;
            this.f1923c = z;
            this.f1924d = charSequence.length();
        }

        public static byte c(char c2) {
            return c2 < 1792 ? f1921a[c2] : Character.getDirectionality(c2);
        }

        public byte a() {
            char cCharAt = this.f1922b.charAt(this.f1925e - 1);
            this.f1926f = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f1922b, this.f1925e);
                this.f1925e -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f1925e--;
            byte bC = c(this.f1926f);
            if (!this.f1923c) {
                return bC;
            }
            char c2 = this.f1926f;
            return c2 == '>' ? h() : c2 == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f1922b.charAt(this.f1925e);
            this.f1926f = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f1922b, this.f1925e);
                this.f1925e += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f1925e++;
            byte bC = c(this.f1926f);
            if (!this.f1923c) {
                return bC;
            }
            char c2 = this.f1926f;
            return c2 == '<' ? i() : c2 == '&' ? g() : bC;
        }

        public int d() {
            this.f1925e = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.f1925e < this.f1924d && i2 == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f1925e > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case 18:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        public int e() {
            this.f1925e = this.f1924d;
            int i2 = 0;
            int i3 = 0;
            while (this.f1925e > 0) {
                byte bA = a();
                if (bA == 0) {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i3 == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i3 == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case 18:
                            i2++;
                            break;
                        default:
                            if (i3 == 0) {
                                i3 = i2;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }

        public final byte f() {
            char cCharAt;
            int i2 = this.f1925e;
            do {
                int i3 = this.f1925e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1922b;
                int i4 = i3 - 1;
                this.f1925e = i4;
                cCharAt = charSequence.charAt(i4);
                this.f1926f = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f1925e = i2;
            this.f1926f = ';';
            return DateTimeFieldType.HALFDAY_OF_DAY;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i2 = this.f1925e;
                if (i2 >= this.f1924d) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f1922b;
                this.f1925e = i2 + 1;
                cCharAt = charSequence.charAt(i2);
                this.f1926f = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char cCharAt;
            int i2 = this.f1925e;
            while (true) {
                int i3 = this.f1925e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1922b;
                int i4 = i3 - 1;
                this.f1925e = i4;
                char cCharAt2 = charSequence.charAt(i4);
                this.f1926f = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i5 = this.f1925e;
                        if (i5 > 0) {
                            CharSequence charSequence2 = this.f1922b;
                            int i6 = i5 - 1;
                            this.f1925e = i6;
                            cCharAt = charSequence2.charAt(i6);
                            this.f1926f = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f1925e = i2;
            this.f1926f = '>';
            return DateTimeFieldType.HALFDAY_OF_DAY;
        }

        public final byte i() {
            char cCharAt;
            int i2 = this.f1925e;
            while (true) {
                int i3 = this.f1925e;
                if (i3 >= this.f1924d) {
                    this.f1925e = i2;
                    this.f1926f = '<';
                    return DateTimeFieldType.HALFDAY_OF_DAY;
                }
                CharSequence charSequence = this.f1922b;
                this.f1925e = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                this.f1926f = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f1925e;
                        if (i4 < this.f1924d) {
                            CharSequence charSequence2 = this.f1922b;
                            this.f1925e = i4 + 1;
                            cCharAt = charSequence2.charAt(i4);
                            this.f1926f = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        d dVar = e.f1944c;
        f1910a = dVar;
        f1911b = Character.toString((char) 8206);
        f1912c = Character.toString((char) 8207);
        f1913d = new a(false, 2, dVar);
        f1914e = new a(true, 2, dVar);
    }

    public a(boolean z, int i2, d dVar) {
        this.f1915f = z;
        this.f1916g = i2;
        this.f1917h = dVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0037a().a();
    }

    public static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    public boolean d() {
        return (this.f1916g & 2) != 0;
    }

    public final String f(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.f1915f || !(zA || b(charSequence) == 1)) ? this.f1915f ? (!zA || b(charSequence) == -1) ? f1912c : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f1911b;
    }

    public final String g(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.f1915f || !(zA || a(charSequence) == 1)) ? this.f1915f ? (!zA || a(charSequence) == -1) ? f1912c : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f1911b;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f1917h, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? e.f1943b : e.f1942a));
        }
        if (zA != this.f1915f) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? e.f1943b : e.f1942a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f1917h, true);
    }

    public String k(String str, d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z).toString();
    }
}

package c.f.d.y;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f16652b = new String[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f16653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Writer f16654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16655e = new int[32];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16656f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16662l;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f16652b[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f16652b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f16653c = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        y(6);
        this.f16658h = ":";
        this.f16662l = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f16654d = writer;
    }

    public c A0(double d2) throws IOException {
        G0();
        if (this.f16659i || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            i();
            this.f16654d.append((CharSequence) Double.toString(d2));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
    }

    public c B0(long j2) throws IOException {
        G0();
        i();
        this.f16654d.write(Long.toString(j2));
        return this;
    }

    public c C0(Boolean bool) throws IOException {
        if (bool == null) {
            return v();
        }
        G0();
        i();
        this.f16654d.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c D0(Number number) throws IOException {
        if (number == null) {
            return v();
        }
        G0();
        String string = number.toString();
        if (this.f16659i || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            i();
            this.f16654d.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c E0(String str) throws IOException {
        if (str == null) {
            return v();
        }
        G0();
        i();
        w0(str);
        return this;
    }

    public c F0(boolean z) throws IOException {
        G0();
        i();
        this.f16654d.write(z ? "true" : "false");
        return this;
    }

    public final void G0() throws IOException {
        if (this.f16661k != null) {
            d();
            w0(this.f16661k);
            this.f16661k = null;
        }
    }

    public final void Q(int i2) {
        this.f16655e[this.f16656f - 1] = i2;
    }

    public final void U(boolean z) {
        this.f16660j = z;
    }

    public final void V(String str) {
        String str2;
        if (str.length() == 0) {
            this.f16657g = null;
            str2 = ":";
        } else {
            this.f16657g = str;
            str2 = ": ";
        }
        this.f16658h = str2;
    }

    public final void c0(boolean z) {
        this.f16659i = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16654d.close();
        int i2 = this.f16656f;
        if (i2 > 1 || (i2 == 1 && this.f16655e[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f16656f = 0;
    }

    public final void d() throws IOException {
        int iX = x();
        if (iX == 5) {
            this.f16654d.write(44);
        } else if (iX != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        u();
        Q(4);
    }

    public void flush() throws IOException {
        if (this.f16656f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f16654d.flush();
    }

    public final void i() throws IOException {
        int iX = x();
        if (iX == 1) {
            Q(2);
        } else {
            if (iX != 2) {
                if (iX == 4) {
                    this.f16654d.append((CharSequence) this.f16658h);
                    Q(5);
                    return;
                }
                if (iX != 6) {
                    if (iX != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f16659i) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                Q(7);
                return;
            }
            this.f16654d.append(',');
        }
        u();
    }

    public c l() throws IOException {
        G0();
        return w(1, '[');
    }

    public c m() throws IOException {
        G0();
        return w(3, '{');
    }

    public final c n(int i2, int i3, char c2) throws IOException {
        int iX = x();
        if (iX != i3 && iX != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f16661k != null) {
            throw new IllegalStateException("Dangling name: " + this.f16661k);
        }
        this.f16656f--;
        if (iX == i3) {
            u();
        }
        this.f16654d.write(c2);
        return this;
    }

    public c o() {
        return n(1, 2, ']');
    }

    public c p() {
        return n(3, 5, '}');
    }

    public final boolean q() {
        return this.f16662l;
    }

    public final boolean r() {
        return this.f16660j;
    }

    public boolean s() {
        return this.f16659i;
    }

    public final void s0(boolean z) {
        this.f16662l = z;
    }

    public c t(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f16661k != null) {
            throw new IllegalStateException();
        }
        if (this.f16656f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f16661k = str;
        return this;
    }

    public final void u() throws IOException {
        if (this.f16657g == null) {
            return;
        }
        this.f16654d.write(10);
        int i2 = this.f16656f;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f16654d.write(this.f16657g);
        }
    }

    public c v() throws IOException {
        if (this.f16661k != null) {
            if (!this.f16662l) {
                this.f16661k = null;
                return this;
            }
            G0();
        }
        i();
        this.f16654d.write(Constants.NULL_VERSION_ID);
        return this;
    }

    public final c w(int i2, char c2) throws IOException {
        i();
        y(i2);
        this.f16654d.write(c2);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f16660j
            if (r0 == 0) goto L7
            java.lang.String[] r0 = c.f.d.y.c.f16653c
            goto L9
        L7:
            java.lang.String[] r0 = c.f.d.y.c.f16652b
        L9:
            java.io.Writer r1 = r8.f16654d
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f16654d
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f16654d
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f16654d
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f16654d
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.d.y.c.w0(java.lang.String):void");
    }

    public final int x() {
        int i2 = this.f16656f;
        if (i2 != 0) {
            return this.f16655e[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void y(int i2) {
        int i3 = this.f16656f;
        int[] iArr = this.f16655e;
        if (i3 == iArr.length) {
            this.f16655e = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f16655e;
        int i4 = this.f16656f;
        this.f16656f = i4 + 1;
        iArr2[i4] = i2;
    }
}

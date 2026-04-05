package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class bjl implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f21232a = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f21233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Writer f21234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f21235d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21236e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21241j;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f21232a[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f21232a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f21233b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public bjl(Writer writer) {
        t(6);
        this.f21237f = ":";
        this.f21241j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f21234c = writer;
    }

    private final int a() {
        int i2 = this.f21236e;
        if (i2 != 0) {
            return this.f21235d[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void s() throws IOException {
        int iA = a();
        if (iA == 1) {
            u(2);
            return;
        }
        if (iA == 2) {
            this.f21234c.append(',');
            return;
        }
        if (iA == 4) {
            this.f21234c.append((CharSequence) this.f21237f);
            u(5);
            return;
        }
        if (iA != 6) {
            if (iA != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.f21238g) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        u(7);
    }

    private final void t(int i2) {
        int i3 = this.f21236e;
        int[] iArr = this.f21235d;
        if (i3 == iArr.length) {
            this.f21235d = Arrays.copyOf(iArr, i3 + i3);
        }
        int[] iArr2 = this.f21235d;
        int i4 = this.f21236e;
        this.f21236e = i4 + 1;
        iArr2[i4] = i2;
    }

    private final void u(int i2) {
        this.f21235d[this.f21236e - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f21239h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.bjl.f21233b
            goto L9
        L7:
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.bjl.f21232a
        L9:
            java.io.Writer r1 = r8.f21234c
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
            java.io.Writer r6 = r8.f21234c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f21234c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f21234c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f21234c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjl.v(java.lang.String):void");
    }

    private final void w() throws IOException {
        if (this.f21240i != null) {
            int iA = a();
            if (iA == 5) {
                this.f21234c.write(44);
            } else if (iA != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            u(4);
            v(this.f21240i);
            this.f21240i = null;
        }
    }

    private final void x(int i2, int i3, char c2) throws IOException {
        int iA = a();
        if (iA != i3 && iA != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f21240i;
        if (str != null) {
            throw new IllegalStateException(str.length() != 0 ? "Dangling name: ".concat(str) : new String("Dangling name: "));
        }
        this.f21236e--;
        this.f21234c.write(c2);
    }

    private final void y(int i2, char c2) throws IOException {
        s();
        t(i2);
        this.f21234c.write(c2);
    }

    public void b() throws IOException {
        w();
        y(1, '[');
    }

    public void c() throws IOException {
        w();
        y(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21234c.close();
        int i2 = this.f21236e;
        if (i2 > 1 || (i2 == 1 && this.f21235d[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f21236e = 0;
    }

    public void d() throws IOException {
        x(1, 2, ']');
    }

    public void e() throws IOException {
        x(3, 5, '}');
    }

    public void f(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f21240i != null) {
            throw new IllegalStateException();
        }
        if (this.f21236e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21240i = str;
    }

    public void flush() throws IOException {
        if (this.f21236e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21234c.flush();
    }

    public void g() throws IOException {
        if (this.f21240i != null) {
            if (!this.f21241j) {
                this.f21240i = null;
                return;
            }
            w();
        }
        s();
        this.f21234c.write(Constants.NULL_VERSION_ID);
    }

    public void h(long j2) throws IOException {
        w();
        s();
        this.f21234c.write(Long.toString(j2));
    }

    public void i(Boolean bool) throws IOException {
        if (bool == null) {
            g();
            return;
        }
        w();
        s();
        this.f21234c.write(true != bool.booleanValue() ? "false" : "true");
    }

    public void j(Number number) throws IOException {
        if (number == null) {
            g();
            return;
        }
        w();
        String string = number.toString();
        if (this.f21238g || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            s();
            this.f21234c.append((CharSequence) string);
        } else {
            String strValueOf = String.valueOf(number);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
            sb.append("Numeric values must be finite, but was ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void k(String str) throws IOException {
        if (str == null) {
            g();
            return;
        }
        w();
        s();
        v(str);
    }

    public void l(boolean z) throws IOException {
        w();
        s();
        this.f21234c.write(true != z ? "false" : "true");
    }

    public final void m(boolean z) {
        this.f21239h = z;
    }

    public final void n(boolean z) {
        this.f21238g = z;
    }

    public final void o(boolean z) {
        this.f21241j = z;
    }

    public final boolean p() {
        return this.f21241j;
    }

    public final boolean q() {
        return this.f21239h;
    }

    public final boolean r() {
        return this.f21238g;
    }
}

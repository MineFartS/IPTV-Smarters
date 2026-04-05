package c.f.d.w.n;

import c.f.d.o;
import com.amazonaws.services.s3.internal.Constants;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends c.f.d.y.a {
    public static final Reader r = new a();
    public static final Object s = new Object();
    public Object[] t;
    public int u;
    public String[] v;
    public int[] w;

    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    private String v() {
        return " at path " + r();
    }

    @Override // c.f.d.y.a
    public c.f.d.y.b B0() {
        if (this.u == 0) {
            return c.f.d.y.b.END_DOCUMENT;
        }
        Object objO0 = O0();
        if (objO0 instanceof Iterator) {
            boolean z = this.t[this.u - 2] instanceof c.f.d.m;
            Iterator it = (Iterator) objO0;
            if (!it.hasNext()) {
                return z ? c.f.d.y.b.END_OBJECT : c.f.d.y.b.END_ARRAY;
            }
            if (z) {
                return c.f.d.y.b.NAME;
            }
            R0(it.next());
            return B0();
        }
        if (objO0 instanceof c.f.d.m) {
            return c.f.d.y.b.BEGIN_OBJECT;
        }
        if (objO0 instanceof c.f.d.g) {
            return c.f.d.y.b.BEGIN_ARRAY;
        }
        if (!(objO0 instanceof o)) {
            if (objO0 instanceof c.f.d.l) {
                return c.f.d.y.b.NULL;
            }
            if (objO0 == s) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        o oVar = (o) objO0;
        if (oVar.M()) {
            return c.f.d.y.b.STRING;
        }
        if (oVar.J()) {
            return c.f.d.y.b.BOOLEAN;
        }
        if (oVar.L()) {
            return c.f.d.y.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // c.f.d.y.a
    public void L0() {
        if (B0() == c.f.d.y.b.NAME) {
            U();
            this.v[this.u - 2] = Constants.NULL_VERSION_ID;
        } else {
            P0();
            int i2 = this.u;
            if (i2 > 0) {
                this.v[i2 - 1] = Constants.NULL_VERSION_ID;
            }
        }
        int i3 = this.u;
        if (i3 > 0) {
            int[] iArr = this.w;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final void N0(c.f.d.y.b bVar) {
        if (B0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + B0() + v());
    }

    public final Object O0() {
        return this.t[this.u - 1];
    }

    public final Object P0() {
        Object[] objArr = this.t;
        int i2 = this.u - 1;
        this.u = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    @Override // c.f.d.y.a
    public long Q() {
        c.f.d.y.b bVarB0 = B0();
        c.f.d.y.b bVar = c.f.d.y.b.NUMBER;
        if (bVarB0 != bVar && bVarB0 != c.f.d.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarB0 + v());
        }
        long jF = ((o) O0()).F();
        P0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jF;
    }

    public void Q0() {
        N0(c.f.d.y.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) O0()).next();
        R0(entry.getValue());
        R0(new o((String) entry.getKey()));
    }

    public final void R0(Object obj) {
        int i2 = this.u;
        Object[] objArr = this.t;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.t = Arrays.copyOf(objArr, i3);
            this.w = Arrays.copyOf(this.w, i3);
            this.v = (String[]) Arrays.copyOf(this.v, i3);
        }
        Object[] objArr2 = this.t;
        int i4 = this.u;
        this.u = i4 + 1;
        objArr2[i4] = obj;
    }

    @Override // c.f.d.y.a
    public String U() {
        N0(c.f.d.y.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) O0()).next();
        String str = (String) entry.getKey();
        this.v[this.u - 1] = str;
        R0(entry.getValue());
        return str;
    }

    @Override // c.f.d.y.a
    public void c0() {
        N0(c.f.d.y.b.NULL);
        P0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // c.f.d.y.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.t = new Object[]{s};
        this.u = 1;
    }

    @Override // c.f.d.y.a
    public void d() {
        N0(c.f.d.y.b.BEGIN_ARRAY);
        R0(((c.f.d.g) O0()).iterator());
        this.w[this.u - 1] = 0;
    }

    @Override // c.f.d.y.a
    public void i() {
        N0(c.f.d.y.b.BEGIN_OBJECT);
        R0(((c.f.d.m) O0()).D().iterator());
    }

    @Override // c.f.d.y.a
    public void o() {
        N0(c.f.d.y.b.END_ARRAY);
        P0();
        P0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // c.f.d.y.a
    public void p() {
        N0(c.f.d.y.b.END_OBJECT);
        P0();
        P0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // c.f.d.y.a
    public String r() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.u) {
            Object[] objArr = this.t;
            if (objArr[i2] instanceof c.f.d.g) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.w[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof c.f.d.m) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.v;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // c.f.d.y.a
    public boolean s() {
        c.f.d.y.b bVarB0 = B0();
        return (bVarB0 == c.f.d.y.b.END_OBJECT || bVarB0 == c.f.d.y.b.END_ARRAY) ? false : true;
    }

    @Override // c.f.d.y.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // c.f.d.y.a
    public boolean w() {
        N0(c.f.d.y.b.BOOLEAN);
        boolean zB = ((o) P0()).B();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zB;
    }

    @Override // c.f.d.y.a
    public String w0() {
        c.f.d.y.b bVarB0 = B0();
        c.f.d.y.b bVar = c.f.d.y.b.STRING;
        if (bVarB0 == bVar || bVarB0 == c.f.d.y.b.NUMBER) {
            String strI = ((o) P0()).i();
            int i2 = this.u;
            if (i2 > 0) {
                int[] iArr = this.w;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return strI;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarB0 + v());
    }

    @Override // c.f.d.y.a
    public double x() {
        c.f.d.y.b bVarB0 = B0();
        c.f.d.y.b bVar = c.f.d.y.b.NUMBER;
        if (bVarB0 != bVar && bVarB0 != c.f.d.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarB0 + v());
        }
        double dC = ((o) O0()).C();
        if (!t() && (Double.isNaN(dC) || Double.isInfinite(dC))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dC);
        }
        P0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dC;
    }

    @Override // c.f.d.y.a
    public int y() {
        c.f.d.y.b bVarB0 = B0();
        c.f.d.y.b bVar = c.f.d.y.b.NUMBER;
        if (bVarB0 != bVar && bVarB0 != c.f.d.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarB0 + v());
        }
        int iD = ((o) O0()).D();
        P0();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iD;
    }
}

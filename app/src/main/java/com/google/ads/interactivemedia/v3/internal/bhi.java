package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bhi extends bjj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Reader f21126b = new bhh();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f21127c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f21128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f21130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f21131g;

    public bhi(bfl bflVar) {
        super(f21126b);
        this.f21128d = new Object[32];
        this.f21129e = 0;
        this.f21130f = new String[32];
        this.f21131g = new int[32];
        x(bflVar);
    }

    private final Object u() {
        return this.f21128d[this.f21129e - 1];
    }

    private final Object v() {
        Object[] objArr = this.f21128d;
        int i2 = this.f21129e - 1;
        this.f21129e = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private final String w() {
        String strValueOf = String.valueOf(d());
        return strValueOf.length() != 0 ? " at path ".concat(strValueOf) : new String(" at path ");
    }

    private final void x(Object obj) {
        int i2 = this.f21129e;
        Object[] objArr = this.f21128d;
        if (i2 == objArr.length) {
            int i3 = i2 + i2;
            this.f21128d = Arrays.copyOf(objArr, i3);
            this.f21131g = Arrays.copyOf(this.f21131g, i3);
            this.f21130f = (String[]) Arrays.copyOf(this.f21130f, i3);
        }
        Object[] objArr2 = this.f21128d;
        int i4 = this.f21129e;
        this.f21129e = i4 + 1;
        objArr2[i4] = obj;
    }

    private final void y(int i2) {
        if (p() == i2) {
            return;
        }
        String strA = bjk.a(i2);
        String strA2 = bjk.a(p());
        String strW = w();
        int length = String.valueOf(strA).length();
        StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(strA2).length() + String.valueOf(strW).length());
        sb.append("Expected ");
        sb.append(strA);
        sb.append(" but was ");
        sb.append(strA2);
        sb.append(strW);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final double a() {
        int iP = p();
        if (iP != 7 && iP != 6) {
            String strA = bjk.a(iP);
            String strW = w();
            StringBuilder sb = new StringBuilder("NUMBER".length() + 18 + String.valueOf(strA).length() + String.valueOf(strW).length());
            sb.append("Expected ");
            sb.append("NUMBER");
            sb.append(" but was ");
            sb.append(strA);
            sb.append(strW);
            throw new IllegalStateException(sb.toString());
        }
        bfq bfqVar = (bfq) u();
        double dDoubleValue = bfqVar.e() ? bfqVar.a().doubleValue() : Double.parseDouble(bfqVar.b());
        if (!t() && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("JSON forbids NaN and infinities: ");
            sb2.append(dDoubleValue);
            throw new NumberFormatException(sb2.toString());
        }
        v();
        int i2 = this.f21129e;
        if (i2 > 0) {
            int[] iArr = this.f21131g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dDoubleValue;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final int b() {
        int iP = p();
        if (iP == 7 || iP == 6) {
            bfq bfqVar = (bfq) u();
            int iIntValue = bfqVar.e() ? bfqVar.a().intValue() : Integer.parseInt(bfqVar.b());
            v();
            int i2 = this.f21129e;
            if (i2 > 0) {
                int[] iArr = this.f21131g;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return iIntValue;
        }
        String strA = bjk.a(iP);
        String strW = w();
        StringBuilder sb = new StringBuilder("NUMBER".length() + 18 + String.valueOf(strA).length() + String.valueOf(strW).length());
        sb.append("Expected ");
        sb.append("NUMBER");
        sb.append(" but was ");
        sb.append(strA);
        sb.append(strW);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final long c() {
        int iP = p();
        if (iP == 7 || iP == 6) {
            bfq bfqVar = (bfq) u();
            long jLongValue = bfqVar.e() ? bfqVar.a().longValue() : Long.parseLong(bfqVar.b());
            v();
            int i2 = this.f21129e;
            if (i2 > 0) {
                int[] iArr = this.f21131g;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return jLongValue;
        }
        String strA = bjk.a(iP);
        String strW = w();
        StringBuilder sb = new StringBuilder("NUMBER".length() + 18 + String.valueOf(strA).length() + String.valueOf(strW).length());
        sb.append("Expected ");
        sb.append("NUMBER");
        sb.append(" but was ");
        sb.append(strA);
        sb.append(strW);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21128d = new Object[]{f21127c};
        this.f21129e = 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.f21129e) {
            Object[] objArr = this.f21128d;
            Object obj = objArr[i2];
            if (obj instanceof bfj) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f21131g[i2]);
                    sb.append(']');
                }
            } else if (obj instanceof bfo) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f21130f[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final String e() {
        y(5);
        Map.Entry entry = (Map.Entry) ((Iterator) u()).next();
        String str = (String) entry.getKey();
        this.f21130f[this.f21129e - 1] = str;
        x(entry.getValue());
        return str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final String f() {
        int iP = p();
        if (iP == 6 || iP == 7) {
            String strB = ((bfq) v()).b();
            int i2 = this.f21129e;
            if (i2 > 0) {
                int[] iArr = this.f21131g;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return strB;
        }
        String strA = bjk.a(iP);
        String strW = w();
        StringBuilder sb = new StringBuilder("STRING".length() + 18 + String.valueOf(strA).length() + String.valueOf(strW).length());
        sb.append("Expected ");
        sb.append("STRING");
        sb.append(" but was ");
        sb.append(strA);
        sb.append(strW);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final void g() {
        y(1);
        x(((bfj) u()).iterator());
        this.f21131g[this.f21129e - 1] = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final void h() {
        y(3);
        x(((bfo) u()).a().iterator());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final void i() {
        y(2);
        v();
        v();
        int i2 = this.f21129e;
        if (i2 > 0) {
            int[] iArr = this.f21131g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final void j() {
        y(4);
        v();
        v();
        int i2 = this.f21129e;
        if (i2 > 0) {
            int[] iArr = this.f21131g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final void k() {
        y(9);
        v();
        int i2 = this.f21129e;
        if (i2 > 0) {
            int[] iArr = this.f21131g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void l() {
        y(5);
        Map.Entry entry = (Map.Entry) ((Iterator) u()).next();
        x(entry.getValue());
        x(new bfq((String) entry.getKey()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final void m() throws IOException {
        if (p() == 5) {
            e();
            this.f21130f[this.f21129e - 2] = Constants.NULL_VERSION_ID;
        } else {
            v();
            int i2 = this.f21129e;
            if (i2 > 0) {
                this.f21130f[i2 - 1] = Constants.NULL_VERSION_ID;
            }
        }
        int i3 = this.f21129e;
        if (i3 > 0) {
            int[] iArr = this.f21131g;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final boolean n() {
        int iP = p();
        return (iP == 4 || iP == 2) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final boolean o() {
        y(8);
        boolean zC = ((bfq) v()).c();
        int i2 = this.f21129e;
        if (i2 > 0) {
            int[] iArr = this.f21131g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final int p() {
        if (this.f21129e == 0) {
            return 10;
        }
        Object objU = u();
        if (objU instanceof Iterator) {
            boolean z = this.f21128d[this.f21129e - 2] instanceof bfo;
            Iterator it = (Iterator) objU;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            x(it.next());
            return p();
        }
        if (objU instanceof bfo) {
            return 3;
        }
        if (objU instanceof bfj) {
            return 1;
        }
        if (!(objU instanceof bfq)) {
            if (objU instanceof bfn) {
                return 9;
            }
            if (objU == f21127c) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        bfq bfqVar = (bfq) objU;
        if (bfqVar.f()) {
            return 6;
        }
        if (bfqVar.d()) {
            return 8;
        }
        if (bfqVar.e()) {
            return 7;
        }
        throw new AssertionError();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjj
    public final String toString() {
        return bhi.class.getSimpleName();
    }
}

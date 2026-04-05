package c.f.d.w;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends Number {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16512b;

    public g(String str) {
        this.f16512b = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f16512b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f16512b;
        String str2 = ((g) obj).f16512b;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f16512b);
    }

    public int hashCode() {
        return this.f16512b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f16512b);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f16512b).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f16512b);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f16512b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f16512b).longValue();
        }
    }

    public String toString() {
        return this.f16512b;
    }
}

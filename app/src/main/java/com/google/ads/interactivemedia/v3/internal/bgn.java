package com.google.ads.interactivemedia.v3.internal;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class bgn extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21087a;

    public bgn(String str) {
        this.f21087a = str;
    }

    private Object writeReplace() {
        return new BigDecimal(this.f21087a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f21087a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgn)) {
            return false;
        }
        String str = this.f21087a;
        String str2 = ((bgn) obj).f21087a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f21087a);
    }

    public final int hashCode() {
        return this.f21087a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f21087a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f21087a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f21087a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f21087a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f21087a).longValue();
        }
    }

    public final String toString() {
        return this.f21087a;
    }
}

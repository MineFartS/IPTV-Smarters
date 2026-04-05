package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bfq extends bfl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21048a;

    public bfq(Boolean bool) {
        this.f21048a = bool;
    }

    public bfq(Number number) {
        this.f21048a = number;
    }

    public bfq(String str) {
        art.f(str);
        this.f21048a = str;
    }

    private static boolean g(bfq bfqVar) {
        Object obj = bfqVar.f21048a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number a() {
        Object obj = this.f21048a;
        return obj instanceof String ? new bgn((String) obj) : (Number) obj;
    }

    public final String b() {
        return e() ? a().toString() : d() ? ((Boolean) this.f21048a).toString() : (String) this.f21048a;
    }

    public final boolean c() {
        return d() ? ((Boolean) this.f21048a).booleanValue() : Boolean.parseBoolean(b());
    }

    public final boolean d() {
        return this.f21048a instanceof Boolean;
    }

    public final boolean e() {
        return this.f21048a instanceof Number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bfq.class != obj.getClass()) {
            return false;
        }
        bfq bfqVar = (bfq) obj;
        if (g(this) && g(bfqVar)) {
            return a().longValue() == bfqVar.a().longValue();
        }
        Object obj2 = this.f21048a;
        if (!(obj2 instanceof Number) || !(bfqVar.f21048a instanceof Number)) {
            return obj2.equals(bfqVar.f21048a);
        }
        double dDoubleValue = a().doubleValue();
        double dDoubleValue2 = bfqVar.a().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final boolean f() {
        return this.f21048a instanceof String;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (g(this)) {
            jDoubleToLongBits = a().longValue();
        } else {
            Object obj = this.f21048a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }
}

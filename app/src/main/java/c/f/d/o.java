package c.f.d;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16463a;

    public o(Boolean bool) {
        this.f16463a = c.f.d.w.a.b(bool);
    }

    public o(Number number) {
        this.f16463a = c.f.d.w.a.b(number);
    }

    public o(String str) {
        this.f16463a = c.f.d.w.a.b(str);
    }

    public static boolean K(o oVar) {
        Object obj = oVar.f16463a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean B() {
        return J() ? ((Boolean) this.f16463a).booleanValue() : Boolean.parseBoolean(i());
    }

    public double C() {
        return L() ? I().doubleValue() : Double.parseDouble(i());
    }

    public int D() {
        return L() ? I().intValue() : Integer.parseInt(i());
    }

    public long F() {
        return L() ? I().longValue() : Long.parseLong(i());
    }

    public Number I() {
        Object obj = this.f16463a;
        return obj instanceof String ? new c.f.d.w.g((String) this.f16463a) : (Number) obj;
    }

    public boolean J() {
        return this.f16463a instanceof Boolean;
    }

    public boolean L() {
        return this.f16463a instanceof Number;
    }

    public boolean M() {
        return this.f16463a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f16463a == null) {
            return oVar.f16463a == null;
        }
        if (K(this) && K(oVar)) {
            return I().longValue() == oVar.I().longValue();
        }
        Object obj2 = this.f16463a;
        if (!(obj2 instanceof Number) || !(oVar.f16463a instanceof Number)) {
            return obj2.equals(oVar.f16463a);
        }
        double dDoubleValue = I().doubleValue();
        double dDoubleValue2 = oVar.I().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f16463a == null) {
            return 31;
        }
        if (K(this)) {
            jDoubleToLongBits = I().longValue();
        } else {
            Object obj = this.f16463a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(I().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // c.f.d.j
    public String i() {
        return L() ? I().toString() : J() ? ((Boolean) this.f16463a).toString() : (String) this.f16463a;
    }
}

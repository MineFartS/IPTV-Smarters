package c.f.c.k;

import com.amazonaws.mobile.client.AWSMobileClient;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f16113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16115c;

    public q(Class<?> cls, int i2, int i3) {
        this.f16113a = (Class) c0.c(cls, "Null dependency anInterface.");
        this.f16114b = i2;
        this.f16115c = i3;
    }

    public static String a(int i2) {
        if (i2 == 0) {
            return "direct";
        }
        if (i2 == 1) {
            return AWSMobileClient.PROVIDER_KEY;
        }
        if (i2 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i2);
    }

    public static q g(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> b() {
        return this.f16113a;
    }

    public boolean c() {
        return this.f16115c == 2;
    }

    public boolean d() {
        return this.f16115c == 0;
    }

    public boolean e() {
        return this.f16114b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f16113a == qVar.f16113a && this.f16114b == qVar.f16114b && this.f16115c == qVar.f16115c;
    }

    public boolean f() {
        return this.f16114b == 2;
    }

    public int hashCode() {
        return ((((this.f16113a.hashCode() ^ 1000003) * 1000003) ^ this.f16114b) * 1000003) ^ this.f16115c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f16113a);
        sb.append(", type=");
        int i2 = this.f16114b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.f16115c));
        sb.append("}");
        return sb.toString();
    }
}

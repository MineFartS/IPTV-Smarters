package c.f.a.e.a.b;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f15399f;

    public d2() {
    }

    public d2(String str, long j2, int i2, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f15394a = str;
        this.f15395b = j2;
        this.f15396c = i2;
        this.f15397d = z;
        this.f15398e = z2;
        this.f15399f = bArr;
    }

    public static d2 a(String str, long j2, int i2, boolean z, byte[] bArr, boolean z2) {
        return new d2(str, j2, i2, z, z2, bArr);
    }

    public final boolean b() {
        if (d() == null) {
            return false;
        }
        return d().endsWith("/");
    }

    public final boolean c() {
        return f() == 0;
    }

    public String d() {
        return this.f15394a;
    }

    public long e() {
        return this.f15395b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            String str = this.f15394a;
            if (str != null ? str.equals(d2Var.d()) : d2Var.d() == null) {
                if (this.f15395b == d2Var.e() && this.f15396c == d2Var.f() && this.f15397d == d2Var.g() && this.f15398e == d2Var.h() && Arrays.equals(this.f15399f, d2Var.f15399f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int f() {
        return this.f15396c;
    }

    public boolean g() {
        return this.f15397d;
    }

    public boolean h() {
        return this.f15398e;
    }

    public int hashCode() {
        String str = this.f15394a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f15395b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f15396c) * 1000003) ^ (true != this.f15397d ? 1237 : 1231)) * 1000003) ^ (true == this.f15398e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f15399f);
    }

    public byte[] i() {
        return this.f15399f;
    }

    public String toString() {
        String str = this.f15394a;
        long j2 = this.f15395b;
        int i2 = this.f15396c;
        boolean z = this.f15397d;
        boolean z2 = this.f15398e;
        String string = Arrays.toString(this.f15399f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(string).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}

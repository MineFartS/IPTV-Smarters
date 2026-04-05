package c.f.a.a.j;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.a.b f6180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6181b;

    public g(c.f.a.a.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f6180a = bVar;
        this.f6181b = bArr;
    }

    public byte[] a() {
        return this.f6181b;
    }

    public c.f.a.a.b b() {
        return this.f6180a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f6180a.equals(gVar.f6180a)) {
            return Arrays.equals(this.f6181b, gVar.f6181b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6180a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6181b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f6180a + ", bytes=[...]}";
    }
}

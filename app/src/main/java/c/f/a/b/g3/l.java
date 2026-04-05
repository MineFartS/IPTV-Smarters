package c.f.a.b.g3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k[] f8489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8490c;

    public l(k... kVarArr) {
        this.f8489b = kVarArr;
        this.f8488a = kVarArr.length;
    }

    public k a(int i2) {
        return this.f8489b[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8489b, ((l) obj).f8489b);
    }

    public int hashCode() {
        if (this.f8490c == 0) {
            this.f8490c = 527 + Arrays.hashCode(this.f8489b);
        }
        return this.f8490c;
    }
}

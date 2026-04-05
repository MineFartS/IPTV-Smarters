package c.f.a.b.z2;

import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public interface a0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f10627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10629d;

        public a(int i2, byte[] bArr, int i3, int i4) {
            this.f10626a = i2;
            this.f10627b = bArr;
            this.f10628c = i3;
            this.f10629d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10626a == aVar.f10626a && this.f10628c == aVar.f10628c && this.f10629d == aVar.f10629d && Arrays.equals(this.f10627b, aVar.f10627b);
        }

        public int hashCode() {
            return (((((this.f10626a * 31) + Arrays.hashCode(this.f10627b)) * 31) + this.f10628c) * 31) + this.f10629d;
        }
    }

    int a(c.f.a.b.i3.l lVar, int i2, boolean z, int i3);

    int b(c.f.a.b.i3.l lVar, int i2, boolean z);

    void c(i0 i0Var, int i2);

    void d(long j2, int i2, int i3, int i4, a aVar);

    void e(k1 k1Var);

    void f(i0 i0Var, int i2, int i3);
}

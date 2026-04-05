package c.f.a.b.e3.d1;

import c.f.a.b.e3.d1.g;
import c.f.a.b.e3.r0;
import c.f.a.b.j3.z;
import c.f.a.b.z2.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0[] f7003b;

    public d(int[] iArr, r0[] r0VarArr) {
        this.f7002a = iArr;
        this.f7003b = r0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f7003b.length];
        int i2 = 0;
        while (true) {
            r0[] r0VarArr = this.f7003b;
            if (i2 >= r0VarArr.length) {
                return iArr;
            }
            iArr[i2] = r0VarArr[i2].F();
            i2++;
        }
    }

    public void b(long j2) {
        for (r0 r0Var : this.f7003b) {
            r0Var.Z(j2);
        }
    }

    @Override // c.f.a.b.e3.d1.g.b
    public a0 e(int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = this.f7002a;
            if (i4 >= iArr.length) {
                z.d("BaseMediaChunkOutput", "Unmatched track of type: " + i3);
                return new c.f.a.b.z2.i();
            }
            if (i3 == iArr[i4]) {
                return this.f7003b[i4];
            }
            i4++;
        }
    }
}

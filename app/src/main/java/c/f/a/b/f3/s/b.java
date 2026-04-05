package c.f.a.b.f3.s;

import c.f.a.b.f3.c;
import c.f.a.b.f3.f;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c[] f8269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f8270c;

    public b(c[] cVarArr, long[] jArr) {
        this.f8269b = cVarArr;
        this.f8270c = jArr;
    }

    @Override // c.f.a.b.f3.f
    public int a(long j2) {
        int iD = x0.d(this.f8270c, j2, false, false);
        if (iD < this.f8270c.length) {
            return iD;
        }
        return -1;
    }

    @Override // c.f.a.b.f3.f
    public long b(int i2) {
        g.a(i2 >= 0);
        g.a(i2 < this.f8270c.length);
        return this.f8270c[i2];
    }

    @Override // c.f.a.b.f3.f
    public List<c> c(long j2) {
        int iH = x0.h(this.f8270c, j2, true, false);
        if (iH != -1) {
            c[] cVarArr = this.f8269b;
            if (cVarArr[iH] != c.f8063a) {
                return Collections.singletonList(cVarArr[iH]);
            }
        }
        return Collections.emptyList();
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return this.f8270c.length;
    }
}

package c.f.a.b.g3;

import c.f.a.b.j3.x0;
import c.f.a.b.k2;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2[] f8523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h[] f8524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8525d;

    public p(k2[] k2VarArr, h[] hVarArr, Object obj) {
        this.f8523b = k2VarArr;
        this.f8524c = (h[]) hVarArr.clone();
        this.f8525d = obj;
        this.f8522a = k2VarArr.length;
    }

    public boolean a(p pVar) {
        if (pVar == null || pVar.f8524c.length != this.f8524c.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.f8524c.length; i2++) {
            if (!b(pVar, i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(p pVar, int i2) {
        return pVar != null && x0.b(this.f8523b[i2], pVar.f8523b[i2]) && x0.b(this.f8524c[i2], pVar.f8524c[i2]);
    }

    public boolean c(int i2) {
        return this.f8523b[i2] != null;
    }
}

package c.f.a.e.a.a;

import android.content.Context;
import c.f.a.e.a.e.c0;
import c.f.a.e.a.e.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements c0<?> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f15353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15354b = 3;

    public c(c0<Context> c0Var, short[] sArr) {
        this.f15353a = c0Var;
    }

    public static c b(c0<Context> c0Var) {
        return new c(c0Var, null);
    }

    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ Object a() {
        int i2 = this.f15354b;
        if (i2 != 0) {
            return i2 != 1 ? i2 != 2 ? new c.f.a.e.a.h.a((Context) this.f15353a.a()) : new e(((d) this.f15353a).a()) : new a(((d) this.f15353a).a());
        }
        b bVar = (b) this.f15353a.a();
        n.d(bVar);
        return bVar;
    }
}

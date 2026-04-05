package c.f.a.c.j.h;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class b5 implements Comparator<l5> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(l5 l5Var, l5 l5Var2) {
        l5 l5Var3 = l5Var;
        l5 l5Var4 = l5Var2;
        a5 a5Var = new a5(l5Var3);
        a5 a5Var2 = new a5(l5Var4);
        while (a5Var.hasNext() && a5Var2.hasNext()) {
            int iA = c.f.a.b.e3.e1.e.a(a5Var.zza() & 255, a5Var2.zza() & 255);
            if (iA != 0) {
                return iA;
            }
        }
        return c.f.a.b.e3.e1.e.a(l5Var3.d(), l5Var4.d());
    }
}

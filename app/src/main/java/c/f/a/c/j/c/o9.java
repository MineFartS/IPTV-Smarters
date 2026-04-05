package c.f.a.c.j.c;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class o9 implements Comparator<m9> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(m9 m9Var, m9 m9Var2) {
        m9 m9Var3 = m9Var;
        m9 m9Var4 = m9Var2;
        r9 r9Var = (r9) m9Var3.iterator();
        r9 r9Var2 = (r9) m9Var4.iterator();
        while (r9Var.hasNext() && r9Var2.hasNext()) {
            int iA = c.f.a.b.e3.e1.e.a(m9.a(r9Var.d()), m9.a(r9Var2.d()));
            if (iA != 0) {
                return iA;
            }
        }
        return c.f.a.b.e3.e1.e.a(m9Var3.size(), m9Var4.size());
    }
}

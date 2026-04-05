package c.f.a.c.j.h;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l7 {
    public static final int a(int i2, Object obj, Object obj2) {
        k7 k7Var = (k7) obj;
        if (k7Var.isEmpty()) {
            return 0;
        }
        Iterator it = k7Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        k7 k7VarE = (k7) obj;
        k7 k7Var = (k7) obj2;
        if (!k7Var.isEmpty()) {
            if (!k7VarE.g()) {
                k7VarE = k7VarE.e();
            }
            k7VarE.c(k7Var);
        }
        return k7VarE;
    }
}

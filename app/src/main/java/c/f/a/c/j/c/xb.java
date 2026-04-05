package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xb implements ub {
    @Override // c.f.a.c.j.c.ub
    public final Map<?, ?> b(Object obj) {
        return (vb) obj;
    }

    @Override // c.f.a.c.j.c.ub
    public final Object c(Object obj, Object obj2) {
        vb vbVarF = (vb) obj;
        vb vbVar = (vb) obj2;
        if (!vbVar.isEmpty()) {
            if (!vbVarF.b()) {
                vbVarF = vbVarF.f();
            }
            vbVarF.c(vbVar);
        }
        return vbVarF;
    }

    @Override // c.f.a.c.j.c.ub
    public final sb<?, ?> d(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // c.f.a.c.j.c.ub
    public final Object e(Object obj) {
        ((vb) obj).e();
        return obj;
    }

    @Override // c.f.a.c.j.c.ub
    public final int f(int i2, Object obj, Object obj2) {
        vb vbVar = (vb) obj;
        if (vbVar.isEmpty()) {
            return 0;
        }
        Iterator it = vbVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}

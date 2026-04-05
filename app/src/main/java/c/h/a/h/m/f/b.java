package c.h.a.h.m.f;

import c.f.a.c.d.o;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static o[] a(List<o> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        o[] oVarArr = new o[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            oVarArr[i2] = b(list.get(i2));
        }
        return oVarArr;
    }

    public static o b(o oVar) {
        return new o.a(oVar).b().a();
    }
}

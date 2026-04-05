package c.f.a.c.j.h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile y5 f13658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile y5 f13659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y5 f13660c = new y5(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<x5, k6<?, ?>> f13661d;

    public y5() {
        this.f13661d = new HashMap();
    }

    public y5(boolean z) {
        this.f13661d = Collections.emptyMap();
    }

    public static y5 a() {
        y5 y5Var = f13658a;
        if (y5Var == null) {
            synchronized (y5.class) {
                y5Var = f13658a;
                if (y5Var == null) {
                    y5Var = f13660c;
                    f13658a = y5Var;
                }
            }
        }
        return y5Var;
    }

    public static y5 b() {
        y5 y5Var = f13659b;
        if (y5Var != null) {
            return y5Var;
        }
        synchronized (y5.class) {
            y5 y5Var2 = f13659b;
            if (y5Var2 != null) {
                return y5Var2;
            }
            y5 y5VarB = g6.b(y5.class);
            f13659b = y5VarB;
            return y5VarB;
        }
    }

    public final <ContainingType extends q7> k6<ContainingType, ?> c(ContainingType containingtype, int i2) {
        return (k6) this.f13661d.get(new x5(containingtype, i2));
    }
}

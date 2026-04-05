package c.f.a.e.a.b;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Double> f15567a = new HashMap();

    public final synchronized void a(String str) {
        this.f15567a.put(str, Double.valueOf(0.0d));
    }

    public final synchronized double b(String str) {
        Double d2 = this.f15567a.get(str);
        if (d2 == null) {
            return 0.0d;
        }
        return d2.doubleValue();
    }

    public final synchronized double c(String str, c1 c1Var) {
        double d2;
        double d3 = ((i0) c1Var).f15469g;
        Double.isNaN(d3);
        double d4 = d3 + 1.0d;
        double d5 = ((i0) c1Var).f15470h;
        Double.isNaN(d5);
        d2 = d4 / d5;
        this.f15567a.put(str, Double.valueOf(d2));
        return d2;
    }
}

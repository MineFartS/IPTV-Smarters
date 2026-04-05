package a.n.q;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<?> f2777a = new ArrayList(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Float> f2778b = new ArrayList(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Float> f2779c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g0> f2780d = new ArrayList(4);

    public abstract Number a(e0 e0Var);

    public abstract float b(e0 e0Var);

    public final void c(e0 e0Var) {
        if (this.f2777a.size() < 2) {
            return;
        }
        e0Var.c();
        float fB = 0.0f;
        Number numberA = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f2780d.size(); i2++) {
            g0 g0Var = this.f2780d.get(i2);
            if (g0Var.b()) {
                if (numberA == null) {
                    numberA = a(e0Var);
                }
                g0Var.a(numberA);
            } else {
                if (!z) {
                    fB = b(e0Var);
                    z = true;
                }
                g0Var.c(fB);
            }
        }
    }
}

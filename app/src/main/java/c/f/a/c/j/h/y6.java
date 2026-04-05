package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y5 f13662a = y5.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile q7 f13663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile l5 f13664c;

    public final int a() {
        if (this.f13664c != null) {
            return ((j5) this.f13664c).f13381f.length;
        }
        if (this.f13663b != null) {
            return this.f13663b.f();
        }
        return 0;
    }

    public final l5 b() {
        if (this.f13664c != null) {
            return this.f13664c;
        }
        synchronized (this) {
            if (this.f13664c != null) {
                return this.f13664c;
            }
            this.f13664c = this.f13663b == null ? l5.f13413b : this.f13663b.e();
            return this.f13664c;
        }
    }

    public final void c(q7 q7Var) {
        if (this.f13663b != null) {
            return;
        }
        synchronized (this) {
            if (this.f13663b == null) {
                try {
                    this.f13663b = q7Var;
                    this.f13664c = l5.f13413b;
                } catch (w6 unused) {
                    this.f13663b = q7Var;
                    this.f13664c = l5.f13413b;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        q7 q7Var = this.f13663b;
        q7 q7Var2 = y6Var.f13663b;
        if (q7Var == null && q7Var2 == null) {
            return b().equals(y6Var.b());
        }
        if (q7Var != null && q7Var2 != null) {
            return q7Var.equals(q7Var2);
        }
        if (q7Var != null) {
            y6Var.c(q7Var.g());
            return q7Var.equals(y6Var.f13663b);
        }
        c(q7Var2.g());
        return this.f13663b.equals(q7Var2);
    }

    public int hashCode() {
        return 1;
    }
}

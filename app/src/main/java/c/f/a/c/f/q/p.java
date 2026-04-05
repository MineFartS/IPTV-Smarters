package c.f.a.c.f.q;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p f12652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f12653b = new q(0, false, false, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f12654c;

    @RecentlyNonNull
    public static synchronized p b() {
        if (f12652a == null) {
            f12652a = new p();
        }
        return f12652a;
    }

    @RecentlyNullable
    public q a() {
        return this.f12654c;
    }

    public final synchronized void c(q qVar) {
        if (qVar == null) {
            this.f12654c = f12653b;
            return;
        }
        q qVar2 = this.f12654c;
        if (qVar2 == null || qVar2.M() < qVar.M()) {
            this.f12654c = qVar;
        }
    }
}

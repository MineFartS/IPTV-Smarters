package c.f.a.c.f;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable<String> f12686e;

    public /* synthetic */ q0(Callable callable, p0 p0Var) {
        super(false, null, null);
        this.f12686e = callable;
    }

    @Override // c.f.a.c.f.r0
    public final String a() {
        try {
            return this.f12686e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}

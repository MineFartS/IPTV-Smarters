package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class j extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f31061e;

    public j(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f31061e = uVar;
    }

    @Override // l.u
    public u a() {
        return this.f31061e.a();
    }

    @Override // l.u
    public u b() {
        return this.f31061e.b();
    }

    @Override // l.u
    public long c() {
        return this.f31061e.c();
    }

    @Override // l.u
    public u d(long j2) {
        return this.f31061e.d(j2);
    }

    @Override // l.u
    public boolean e() {
        return this.f31061e.e();
    }

    @Override // l.u
    public void f() throws InterruptedIOException {
        this.f31061e.f();
    }

    @Override // l.u
    public u g(long j2, TimeUnit timeUnit) {
        return this.f31061e.g(j2, timeUnit);
    }

    @Override // l.u
    public long h() {
        return this.f31061e.h();
    }

    public final u i() {
        return this.f31061e;
    }

    public final j j(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f31061e = uVar;
        return this;
    }
}

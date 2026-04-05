package c.f.a.b.e3.d1;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7001d;

    public c(long j2, long j3) {
        this.f6999b = j2;
        this.f7000c = j3;
        f();
    }

    public final void c() {
        long j2 = this.f7001d;
        if (j2 < this.f6999b || j2 > this.f7000c) {
            throw new NoSuchElementException();
        }
    }

    public final long d() {
        return this.f7001d;
    }

    public boolean e() {
        return this.f7001d > this.f7000c;
    }

    public void f() {
        this.f7001d = this.f6999b - 1;
    }

    @Override // c.f.a.b.e3.d1.o
    public boolean next() {
        this.f7001d++;
        return !e();
    }
}

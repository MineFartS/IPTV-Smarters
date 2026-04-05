package c.f.a.b.j3;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9220b;

    public l() {
        this(i.f9202a);
    }

    public l(i iVar) {
        this.f9219a = iVar;
    }

    public synchronized void a() {
        while (!this.f9220b) {
            wait();
        }
    }

    public synchronized boolean b(long j2) {
        if (j2 <= 0) {
            return this.f9220b;
        }
        long jB = this.f9219a.b();
        long j3 = j2 + jB;
        if (j3 < jB) {
            a();
        } else {
            while (!this.f9220b && jB < j3) {
                wait(j3 - jB);
                jB = this.f9219a.b();
            }
        }
        return this.f9220b;
    }

    public synchronized void c() {
        boolean z = false;
        while (!this.f9220b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        boolean z;
        z = this.f9220b;
        this.f9220b = false;
        return z;
    }

    public synchronized boolean e() {
        return this.f9220b;
    }

    public synchronized boolean f() {
        if (this.f9220b) {
            return false;
        }
        this.f9220b = true;
        notifyAll();
        return true;
    }
}

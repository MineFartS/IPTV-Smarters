package c.f.a.b;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.i f6853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f6854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Looper f6857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6859i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6860j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6864n;

    public interface a {
        void b(d2 d2Var);
    }

    public interface b {
        void p(int i2, Object obj);
    }

    public d2(a aVar, b bVar, p2 p2Var, int i2, c.f.a.b.j3.i iVar, Looper looper) {
        this.f6852b = aVar;
        this.f6851a = bVar;
        this.f6854d = p2Var;
        this.f6857g = looper;
        this.f6853c = iVar;
        this.f6858h = i2;
    }

    public synchronized boolean a(long j2) {
        boolean z;
        c.f.a.b.j3.g.g(this.f6861k);
        c.f.a.b.j3.g.g(this.f6857g.getThread() != Thread.currentThread());
        long jB = this.f6853c.b() + j2;
        while (true) {
            z = this.f6863m;
            if (z || j2 <= 0) {
                break;
            }
            this.f6853c.e();
            wait(j2);
            j2 = jB - this.f6853c.b();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f6862l;
    }

    public boolean b() {
        return this.f6860j;
    }

    public Looper c() {
        return this.f6857g;
    }

    public Object d() {
        return this.f6856f;
    }

    public long e() {
        return this.f6859i;
    }

    public b f() {
        return this.f6851a;
    }

    public p2 g() {
        return this.f6854d;
    }

    public int h() {
        return this.f6855e;
    }

    public int i() {
        return this.f6858h;
    }

    public synchronized boolean j() {
        return this.f6864n;
    }

    public synchronized void k(boolean z) {
        this.f6862l = z | this.f6862l;
        this.f6863m = true;
        notifyAll();
    }

    public d2 l() {
        c.f.a.b.j3.g.g(!this.f6861k);
        if (this.f6859i == -9223372036854775807L) {
            c.f.a.b.j3.g.a(this.f6860j);
        }
        this.f6861k = true;
        this.f6852b.b(this);
        return this;
    }

    public d2 m(Object obj) {
        c.f.a.b.j3.g.g(!this.f6861k);
        this.f6856f = obj;
        return this;
    }

    public d2 n(int i2) {
        c.f.a.b.j3.g.g(!this.f6861k);
        this.f6855e = i2;
        return this;
    }
}

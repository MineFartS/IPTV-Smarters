package c.f.a.b.t2;

import c.f.a.b.t2.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.a f9989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.a f9990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s.a f9991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.a f9992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f9993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f9994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9995h;

    public a0() {
        ByteBuffer byteBuffer = s.f10170a;
        this.f9993f = byteBuffer;
        this.f9994g = byteBuffer;
        s.a aVar = s.a.f10171a;
        this.f9991d = aVar;
        this.f9992e = aVar;
        this.f9989b = aVar;
        this.f9990c = aVar;
    }

    @Override // c.f.a.b.t2.s
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f9994g;
        this.f9994g = s.f10170a;
        return byteBuffer;
    }

    @Override // c.f.a.b.t2.s
    public boolean b() {
        return this.f9995h && this.f9994g == s.f10170a;
    }

    @Override // c.f.a.b.t2.s
    public final s.a d(s.a aVar) {
        this.f9991d = aVar;
        this.f9992e = g(aVar);
        return isActive() ? this.f9992e : s.a.f10171a;
    }

    @Override // c.f.a.b.t2.s
    public final void e() {
        this.f9995h = true;
        i();
    }

    public final boolean f() {
        return this.f9994g.hasRemaining();
    }

    @Override // c.f.a.b.t2.s
    public final void flush() {
        this.f9994g = s.f10170a;
        this.f9995h = false;
        this.f9989b = this.f9991d;
        this.f9990c = this.f9992e;
        h();
    }

    public abstract s.a g(s.a aVar);

    public void h() {
    }

    public void i() {
    }

    @Override // c.f.a.b.t2.s
    public boolean isActive() {
        return this.f9992e != s.a.f10171a;
    }

    public void j() {
    }

    public final ByteBuffer k(int i2) {
        if (this.f9993f.capacity() < i2) {
            this.f9993f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f9993f.clear();
        }
        ByteBuffer byteBuffer = this.f9993f;
        this.f9994g = byteBuffer;
        return byteBuffer;
    }

    @Override // c.f.a.b.t2.s
    public final void reset() {
        flush();
        this.f9993f = s.f10170a;
        s.a aVar = s.a.f10171a;
        this.f9991d = aVar;
        this.f9992e = aVar;
        this.f9989b = aVar;
        this.f9990c = aVar;
        j();
    }
}

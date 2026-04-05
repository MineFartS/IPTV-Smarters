package c.f.a.b.k3.f0;

import c.f.a.b.i2;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.u0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends u0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c.f.a.b.v2.f f9382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f9383o;
    public long p;
    public d q;
    public long r;

    public e() {
        super(6);
        this.f9382n = new c.f.a.b.v2.f(1);
        this.f9383o = new i0();
    }

    @Override // c.f.a.b.u0
    public void D() {
        N();
    }

    @Override // c.f.a.b.u0
    public void F(long j2, boolean z) {
        this.r = Long.MIN_VALUE;
        N();
    }

    @Override // c.f.a.b.u0
    public void J(k1[] k1VarArr, long j2, long j3) {
        this.p = j3;
    }

    public final float[] M(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f9383o.N(byteBuffer.array(), byteBuffer.limit());
        this.f9383o.P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2] = Float.intBitsToFloat(this.f9383o.q());
        }
        return fArr;
    }

    public final void N() {
        d dVar = this.q;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // c.f.a.b.j2
    public int a(k1 k1Var) {
        return i2.a("application/x-camera-motion".equals(k1Var.f9338m) ? 4 : 0);
    }

    @Override // c.f.a.b.h2
    public boolean b() {
        return f();
    }

    @Override // c.f.a.b.h2
    public boolean e() {
        return true;
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // c.f.a.b.h2
    public void o(long j2, long j3) {
        while (!f() && this.r < 100000 + j2) {
            this.f9382n.clear();
            if (K(z(), this.f9382n, 0) != -4 || this.f9382n.isEndOfStream()) {
                return;
            }
            c.f.a.b.v2.f fVar = this.f9382n;
            this.r = fVar.f10278e;
            if (this.q != null && !fVar.isDecodeOnly()) {
                this.f9382n.o();
                float[] fArrM = M((ByteBuffer) x0.i(this.f9382n.f10276c));
                if (fArrM != null) {
                    ((d) x0.i(this.q)).a(this.r - this.p, fArrM);
                }
            }
        }
    }

    @Override // c.f.a.b.u0, c.f.a.b.d2.b
    public void p(int i2, Object obj) {
        if (i2 == 7) {
            this.q = (d) obj;
        } else {
            super.p(i2, obj);
        }
    }
}

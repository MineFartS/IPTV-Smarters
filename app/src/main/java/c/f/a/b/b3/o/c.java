package c.f.a.b.b3.o;

import c.f.a.b.b3.a;
import c.f.a.b.b3.h;
import c.f.a.b.j3.h0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.u0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f6614a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f6615b = new h0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f6616c;

    @Override // c.f.a.b.b3.h
    public c.f.a.b.b3.a b(c.f.a.b.b3.e eVar, ByteBuffer byteBuffer) {
        u0 u0Var = this.f6616c;
        if (u0Var == null || eVar.f6521i != u0Var.e()) {
            u0 u0Var2 = new u0(eVar.f10278e);
            this.f6616c = u0Var2;
            u0Var2.a(eVar.f10278e - eVar.f6521i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f6614a.N(bArrArray, iLimit);
        this.f6615b.o(bArrArray, iLimit);
        this.f6615b.r(39);
        long jH = (((long) this.f6615b.h(1)) << 32) | ((long) this.f6615b.h(32));
        this.f6615b.r(20);
        int iH = this.f6615b.h(12);
        int iH2 = this.f6615b.h(8);
        a.b eVar2 = null;
        this.f6614a.Q(14);
        if (iH2 == 0) {
            eVar2 = new e();
        } else if (iH2 == 255) {
            eVar2 = a.b(this.f6614a, iH, jH);
        } else if (iH2 == 4) {
            eVar2 = f.b(this.f6614a);
        } else if (iH2 == 5) {
            eVar2 = d.b(this.f6614a, jH, this.f6616c);
        } else if (iH2 == 6) {
            eVar2 = g.b(this.f6614a, jH, this.f6616c);
        }
        return eVar2 == null ? new c.f.a.b.b3.a(new a.b[0]) : new c.f.a.b.b3.a(eVar2);
    }
}

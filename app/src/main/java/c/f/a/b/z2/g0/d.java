package c.f.a.b.z2.g0;

import c.f.a.b.z2.a0;
import c.f.a.b.z2.l;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f10782c;

    public class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f10783a;

        public a(x xVar) {
            this.f10783a = xVar;
        }

        @Override // c.f.a.b.z2.x
        public boolean f() {
            return this.f10783a.f();
        }

        @Override // c.f.a.b.z2.x
        public x.a h(long j2) {
            x.a aVarH = this.f10783a.h(j2);
            y yVar = aVarH.f11507a;
            y yVar2 = new y(yVar.f11512b, yVar.f11513c + d.this.f10781b);
            y yVar3 = aVarH.f11508b;
            return new x.a(yVar2, new y(yVar3.f11512b, yVar3.f11513c + d.this.f10781b));
        }

        @Override // c.f.a.b.z2.x
        public long i() {
            return this.f10783a.i();
        }
    }

    public d(long j2, l lVar) {
        this.f10781b = j2;
        this.f10782c = lVar;
    }

    @Override // c.f.a.b.z2.l
    public a0 e(int i2, int i3) {
        return this.f10782c.e(i2, i3);
    }

    @Override // c.f.a.b.z2.l
    public void i(x xVar) {
        this.f10782c.i(new a(xVar));
    }

    @Override // c.f.a.b.z2.l
    public void p() {
        this.f10782c.p();
    }
}

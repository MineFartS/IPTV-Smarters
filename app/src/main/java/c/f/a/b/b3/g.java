package c.f.a.b.b3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.f.a.b.b3.a;
import c.f.a.b.i2;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends u0 implements Handler.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f6522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f6523o;
    public final Handler p;
    public final e q;
    public c r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public a w;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f6520a);
    }

    public g(f fVar, Looper looper, d dVar) {
        super(5);
        this.f6523o = (f) c.f.a.b.j3.g.e(fVar);
        this.p = looper == null ? null : x0.w(looper, this);
        this.f6522n = (d) c.f.a.b.j3.g.e(dVar);
        this.q = new e();
        this.v = -9223372036854775807L;
    }

    @Override // c.f.a.b.u0
    public void D() {
        this.w = null;
        this.v = -9223372036854775807L;
        this.r = null;
    }

    @Override // c.f.a.b.u0
    public void F(long j2, boolean z) {
        this.w = null;
        this.v = -9223372036854775807L;
        this.s = false;
        this.t = false;
    }

    @Override // c.f.a.b.u0
    public void J(k1[] k1VarArr, long j2, long j3) {
        this.r = this.f6522n.b(k1VarArr[0]);
    }

    public final void M(a aVar, List<a.b> list) {
        for (int i2 = 0; i2 < aVar.e(); i2++) {
            k1 wrappedMetadataFormat = aVar.d(i2).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f6522n.a(wrappedMetadataFormat)) {
                list.add(aVar.d(i2));
            } else {
                c cVarB = this.f6522n.b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) c.f.a.b.j3.g.e(aVar.d(i2).getWrappedMetadataBytes());
                this.q.clear();
                this.q.i(bArr.length);
                ((ByteBuffer) x0.i(this.q.f10276c)).put(bArr);
                this.q.o();
                a aVarA = cVarB.a(this.q);
                if (aVarA != null) {
                    M(aVarA, list);
                }
            }
        }
    }

    public final void N(a aVar) {
        Handler handler = this.p;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            O(aVar);
        }
    }

    public final void O(a aVar) {
        this.f6523o.D(aVar);
    }

    public final boolean P(long j2) {
        boolean z;
        a aVar = this.w;
        if (aVar == null || this.v > j2) {
            z = false;
        } else {
            N(aVar);
            this.w = null;
            this.v = -9223372036854775807L;
            z = true;
        }
        if (this.s && this.w == null) {
            this.t = true;
        }
        return z;
    }

    public final void Q() {
        if (this.s || this.w != null) {
            return;
        }
        this.q.clear();
        l1 l1VarZ = z();
        int iK = K(l1VarZ, this.q, 0);
        if (iK != -4) {
            if (iK == -5) {
                this.u = ((k1) c.f.a.b.j3.g.e(l1VarZ.f9575b)).q;
                return;
            }
            return;
        }
        if (this.q.isEndOfStream()) {
            this.s = true;
            return;
        }
        e eVar = this.q;
        eVar.f6521i = this.u;
        eVar.o();
        a aVarA = ((c) x0.i(this.r)).a(this.q);
        if (aVarA != null) {
            ArrayList arrayList = new ArrayList(aVarA.e());
            M(aVarA, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.w = new a(arrayList);
            this.v = this.q.f10278e;
        }
    }

    @Override // c.f.a.b.j2
    public int a(k1 k1Var) {
        if (this.f6522n.a(k1Var)) {
            return i2.a(k1Var.F == null ? 4 : 2);
        }
        return i2.a(0);
    }

    @Override // c.f.a.b.h2
    public boolean b() {
        return this.t;
    }

    @Override // c.f.a.b.h2
    public boolean e() {
        return true;
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        O((a) message.obj);
        return true;
    }

    @Override // c.f.a.b.h2
    public void o(long j2, long j3) {
        boolean zP = true;
        while (zP) {
            Q();
            zP = P(j2);
        }
    }
}

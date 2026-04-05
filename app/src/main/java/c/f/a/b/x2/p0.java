package c.f.a.b.x2;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import c.f.a.b.e3.i0;
import c.f.a.b.i3.c0;
import c.f.a.b.k1;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.u;
import c.f.a.b.x2.w;
import c.f.a.b.x2.y;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f10377a = new k1.b().L(new w(new w.b[0])).E();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConditionVariable f10378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f10379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HandlerThread f10380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.a f10381e;

    public class a implements a0 {
        public a() {
        }

        @Override // c.f.a.b.x2.a0
        public void K(int i2, i0.a aVar) {
            p0.this.f10378b.open();
        }

        @Override // c.f.a.b.x2.a0
        public /* synthetic */ void P(int i2, i0.a aVar) {
            z.a(this, i2, aVar);
        }

        @Override // c.f.a.b.x2.a0
        public void V(int i2, i0.a aVar) {
            p0.this.f10378b.open();
        }

        @Override // c.f.a.b.x2.a0
        public /* synthetic */ void e0(int i2, i0.a aVar, int i3) {
            z.b(this, i2, aVar, i3);
        }

        @Override // c.f.a.b.x2.a0
        public /* synthetic */ void f0(int i2, i0.a aVar) {
            z.c(this, i2, aVar);
        }

        @Override // c.f.a.b.x2.a0
        public void l0(int i2, i0.a aVar) {
            p0.this.f10378b.open();
        }

        @Override // c.f.a.b.x2.a0
        public void u(int i2, i0.a aVar, Exception exc) {
            p0.this.f10378b.open();
        }
    }

    public p0(u uVar, a0.a aVar) {
        this.f10379c = uVar;
        this.f10381e = aVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.f10380d = handlerThread;
        handlerThread.start();
        this.f10378b = new ConditionVariable();
        aVar.a(new Handler(handlerThread.getLooper()), new a());
    }

    public static p0 d(String str, boolean z, c0.b bVar, Map<String, String> map, a0.a aVar) {
        return new p0(new u.b().b(map).a(new l0(str, z, bVar)), aVar);
    }

    public final byte[] b(int i2, byte[] bArr, k1 k1Var) throws y.a {
        this.f10379c.prepare();
        y yVarE = e(i2, bArr, k1Var);
        y.a error = yVarE.getError();
        byte[] bArrG = yVarE.g();
        yVarE.b(this.f10381e);
        this.f10379c.release();
        if (error == null) {
            return (byte[]) c.f.a.b.j3.g.e(bArrG);
        }
        throw error;
    }

    public synchronized byte[] c(k1 k1Var) {
        c.f.a.b.j3.g.a(k1Var.p != null);
        return b(2, null, k1Var);
    }

    public final y e(int i2, byte[] bArr, k1 k1Var) {
        c.f.a.b.j3.g.e(k1Var.p);
        this.f10379c.C(i2, bArr);
        this.f10378b.close();
        y yVarB = this.f10379c.b(this.f10380d.getLooper(), this.f10381e, k1Var);
        this.f10378b.block();
        return (y) c.f.a.b.j3.g.e(yVarB);
    }

    public void f() {
        this.f10380d.quit();
    }
}

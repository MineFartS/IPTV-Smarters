package c.f.a.b.e3.g1;

import android.net.Uri;
import c.f.a.b.e3.g1.y;
import c.f.a.b.i3.o0;
import c.f.a.b.j3.x0;
import com.facebook.ads.AdError;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f7594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f7595c;

    public m0(long j2) {
        this.f7594b = new o0(AdError.SERVER_ERROR_CODE, c.f.b.f.c.c(j2));
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f7594b.a();
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws o0.a {
        try {
            return this.f7594b.b(bArr, i2, i3);
        } catch (o0.a e2) {
            if (e2.f9054b == 2002) {
                return -1;
            }
            throw e2;
        }
    }

    @Override // c.f.a.b.e3.g1.l
    public String c() {
        int iE = e();
        c.f.a.b.j3.g.g(iE != -1);
        return x0.D("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(iE), Integer.valueOf(iE + 1));
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f7594b.close();
        m0 m0Var = this.f7595c;
        if (m0Var != null) {
            m0Var.close();
        }
    }

    @Override // c.f.a.b.e3.g1.l
    public int e() {
        int iE = this.f7594b.e();
        if (iE == -1) {
            return -1;
        }
        return iE;
    }

    public void f(m0 m0Var) {
        c.f.a.b.j3.g.a(this != m0Var);
        this.f7595c = m0Var;
    }

    @Override // c.f.a.b.i3.p
    public long g(c.f.a.b.i3.s sVar) {
        return this.f7594b.g(sVar);
    }

    @Override // c.f.a.b.i3.p
    public void h(c.f.a.b.i3.n0 n0Var) {
        this.f7594b.h(n0Var);
    }

    @Override // c.f.a.b.e3.g1.l
    public y.b k() {
        return null;
    }

    @Override // c.f.a.b.i3.p
    public /* synthetic */ Map q() {
        return c.f.a.b.i3.o.a(this);
    }
}

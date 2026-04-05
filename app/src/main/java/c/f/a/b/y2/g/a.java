package c.f.a.b.y2.g;

import android.net.Uri;
import c.f.a.b.i1;
import c.f.a.b.i3.j;
import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import net.butterflytv.rtmp_client.RtmpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RtmpClient f10594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f10595g;

    static {
        i1.a("goog.exo.rtmp");
    }

    public a() {
        super(true);
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f10595g;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws RtmpClient.a {
        int iC = ((RtmpClient) x0.i(this.f10594f)).c(bArr, i2, i3);
        if (iC == -1) {
            return -1;
        }
        v(iC);
        return iC;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        if (this.f10595g != null) {
            this.f10595g = null;
            w();
        }
        RtmpClient rtmpClient = this.f10594f;
        if (rtmpClient != null) {
            rtmpClient.a();
            this.f10594f = null;
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws RtmpClient.a {
        x(sVar);
        RtmpClient rtmpClient = new RtmpClient();
        this.f10594f = rtmpClient;
        rtmpClient.b(sVar.f9061a.toString(), false);
        this.f10595g = sVar.f9061a;
        y(sVar);
        return -1L;
    }
}

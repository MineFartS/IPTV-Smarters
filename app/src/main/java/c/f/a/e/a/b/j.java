package c.f.a.e.a.b;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class j<T> extends c.f.a.e.a.e.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.i.m<T> f15492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f15493c;

    public j(o oVar, c.f.a.e.a.i.m<T> mVar) {
        this.f15493c = oVar;
        this.f15492b = mVar;
    }

    public j(o oVar, c.f.a.e.a.i.m mVar, byte[] bArr) {
        this(oVar, mVar);
    }

    public j(o oVar, c.f.a.e.a.i.m mVar, char[] cArr) {
        this(oVar, mVar);
    }

    public j(o oVar, c.f.a.e.a.i.m mVar, int[] iArr) {
        this(oVar, mVar);
    }

    @Override // c.f.a.e.a.e.l0
    public void A1(Bundle bundle) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // c.f.a.e.a.e.l0
    public void F1(Bundle bundle, Bundle bundle2) {
        this.f15493c.f15565f.b();
        o.f15560a.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // c.f.a.e.a.e.l0
    public void a2(Bundle bundle) {
        this.f15493c.f15564e.b();
        int i2 = bundle.getInt("error_code");
        o.f15560a.b("onError(%d)", Integer.valueOf(i2));
        this.f15492b.d(new a(i2));
    }

    @Override // c.f.a.e.a.e.l0
    public void c2(Bundle bundle, Bundle bundle2) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // c.f.a.e.a.e.l0
    public void f0(Bundle bundle) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // c.f.a.e.a.e.l0
    public void f1(Bundle bundle) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // c.f.a.e.a.e.l0
    public final void h(int i2) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onCancelDownload(%d)", Integer.valueOf(i2));
    }

    @Override // c.f.a.e.a.e.l0
    public void h1(int i2, Bundle bundle) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onStartDownload(%d)", Integer.valueOf(i2));
    }

    @Override // c.f.a.e.a.e.l0
    public void i() {
        this.f15493c.f15564e.b();
        o.f15560a.d("onCancelDownloads()", new Object[0]);
    }

    @Override // c.f.a.e.a.e.l0
    public final void j(int i2) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onGetSession(%d)", Integer.valueOf(i2));
    }

    @Override // c.f.a.e.a.e.l0
    public void n() {
        this.f15493c.f15564e.b();
        o.f15560a.d("onRemoveModule()", new Object[0]);
    }

    @Override // c.f.a.e.a.e.l0
    public void n2(List<Bundle> list) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onGetSessionStates", new Object[0]);
    }

    @Override // c.f.a.e.a.e.l0
    public void x2(Bundle bundle, Bundle bundle2) {
        this.f15493c.f15564e.b();
        o.f15560a.d("onRequestDownloadInfo()", new Object[0]);
    }
}

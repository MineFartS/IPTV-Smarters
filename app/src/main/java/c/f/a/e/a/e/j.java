package c.f.a.e.a.e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15721a;

    public /* synthetic */ j(k kVar) {
        this.f15721a = kVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15721a.f15724c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f15721a.r(new h(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15721a.f15724c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f15721a.r(new i(this));
    }
}

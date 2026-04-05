package c.f.a.c.f;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12296a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue<IBinder> f12297b = new LinkedBlockingQueue();

    @RecentlyNonNull
    public IBinder a(long j2, @RecentlyNonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        o.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f12296a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f12296a = true;
        IBinder iBinderPoll = this.f12297b.poll(j2, timeUnit);
        if (iBinderPoll != null) {
            return iBinderPoll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f12297b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}

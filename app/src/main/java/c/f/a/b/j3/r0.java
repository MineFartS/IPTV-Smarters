package c.f.a.b.j3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class r0 implements i {
    @Override // c.f.a.b.j3.i
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // c.f.a.b.j3.i
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // c.f.a.b.j3.i
    public v d(Looper looper, Handler.Callback callback) {
        return new s0(new Handler(looper, callback));
    }

    @Override // c.f.a.b.j3.i
    public void e() {
    }
}

package c.d.a.t;

import android.util.Log;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5948a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue<byte[]> f5949b = h.c(0);

    public static a a() {
        return f5948a;
    }

    public byte[] b() {
        byte[] bArrPoll;
        synchronized (this.f5949b) {
            bArrPoll = this.f5949b.poll();
        }
        if (bArrPoll == null) {
            bArrPoll = new byte[65536];
            if (Log.isLoggable("ByteArrayPool", 3)) {
                Log.d("ByteArrayPool", "Created temp bytes");
            }
        }
        return bArrPoll;
    }

    public boolean c(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f5949b) {
            if (this.f5949b.size() < 32) {
                z = true;
                this.f5949b.offer(bArr);
            }
        }
        return z;
    }
}

package c.d.a.n.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5593b = new Handler(Looper.getMainLooper(), new b());

    public static class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((l) message.obj).b();
            return true;
        }
    }

    public void a(l<?> lVar) {
        c.d.a.t.h.a();
        if (this.f5592a) {
            this.f5593b.obtainMessage(1, lVar).sendToTarget();
            return;
        }
        this.f5592a = true;
        lVar.b();
        this.f5592a = false;
    }
}

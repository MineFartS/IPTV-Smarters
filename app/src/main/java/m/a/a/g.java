package m.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class g extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<b> f31122a;

    public g(b bVar) {
        super(Looper.getMainLooper());
        this.f31122a = new WeakReference<>(bVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        b bVar = this.f31122a.get();
        if (bVar == null) {
            return;
        }
        if (message.what == -1) {
            bVar.invalidateSelf();
            return;
        }
        Iterator<a> it = bVar.f31107i.iterator();
        while (it.hasNext()) {
            it.next().a(message.what);
        }
    }
}

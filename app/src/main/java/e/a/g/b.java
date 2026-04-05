package e.a.g;

import io.realm.internal.NativeObjectReference;
import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<d> f30341b;

    public b(ReferenceQueue<d> referenceQueue) {
        this.f30341b = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f30341b.remove()).e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.a("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}

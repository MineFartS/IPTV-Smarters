package e.a.g;

import io.realm.internal.NativeObjectReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReferenceQueue<d> f30342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Thread f30343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f30344c;

    static {
        ReferenceQueue<d> referenceQueue = new ReferenceQueue<>();
        f30342a = referenceQueue;
        Thread thread = new Thread(new b(referenceQueue));
        f30343b = thread;
        f30344c = new c();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void a(d dVar) {
        new NativeObjectReference(this, dVar, f30342a);
    }
}

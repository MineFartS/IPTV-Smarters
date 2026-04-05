package c.f.a.c.j.h;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<l4, List<Throwable>> f13427a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<Throwable> f13428b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> referencePoll = this.f13428b.poll();
            if (referencePoll == null) {
                break;
            }
            this.f13427a.remove(referencePoll);
        }
        List<Throwable> list = this.f13427a.get(new l4(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f13427a.putIfAbsent(new l4(th, this.f13428b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}

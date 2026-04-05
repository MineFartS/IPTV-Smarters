package c.f.a.e.a.e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<t, List<Throwable>> f15739a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<Throwable> f15740b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> referencePoll = this.f15740b.poll();
            if (referencePoll == null) {
                break;
            }
            this.f15739a.remove(referencePoll);
        }
        List<Throwable> list = this.f15739a.get(new t(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f15739a.putIfAbsent(new t(th, this.f15740b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}

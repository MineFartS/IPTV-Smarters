package c.d.a.n.i.o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c.d.a.n.c, b> f5629a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0105c f5630b = new C0105c();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f5631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5632b;

        public b() {
            this.f5631a = new ReentrantLock();
        }
    }

    /* JADX INFO: renamed from: c.d.a.n.i.o.c$c, reason: collision with other inner class name */
    public static class C0105c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<b> f5633a;

        public C0105c() {
            this.f5633a = new ArrayDeque();
        }

        public b a() {
            b bVarPoll;
            synchronized (this.f5633a) {
                bVarPoll = this.f5633a.poll();
            }
            return bVarPoll == null ? new b() : bVarPoll;
        }

        public void b(b bVar) {
            synchronized (this.f5633a) {
                if (this.f5633a.size() < 10) {
                    this.f5633a.offer(bVar);
                }
            }
        }
    }

    public void a(c.d.a.n.c cVar) {
        b bVarA;
        synchronized (this) {
            bVarA = this.f5629a.get(cVar);
            if (bVarA == null) {
                bVarA = this.f5630b.a();
                this.f5629a.put(cVar, bVarA);
            }
            bVarA.f5632b++;
        }
        bVarA.f5631a.lock();
    }

    public void b(c.d.a.n.c cVar) {
        b bVar;
        int i2;
        synchronized (this) {
            bVar = this.f5629a.get(cVar);
            if (bVar != null && (i2 = bVar.f5632b) > 0) {
                int i3 = i2 - 1;
                bVar.f5632b = i3;
                if (i3 == 0) {
                    b bVarRemove = this.f5629a.remove(cVar);
                    if (!bVarRemove.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVarRemove + ", key: " + cVar);
                    }
                    this.f5630b.b(bVarRemove);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot release a lock that is not held, key: ");
            sb.append(cVar);
            sb.append(", interestedThreads: ");
            sb.append(bVar == null ? 0 : bVar.f5632b);
            throw new IllegalArgumentException(sb.toString());
        }
        bVar.f5631a.unlock();
    }
}

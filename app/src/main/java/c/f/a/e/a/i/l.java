package c.f.a.e.a.i;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class l<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15765a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue<k<ResultT>> f15766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15767c;

    public final void a(k<ResultT> kVar) {
        synchronized (this.f15765a) {
            if (this.f15766b == null) {
                this.f15766b = new ArrayDeque();
            }
            this.f15766b.add(kVar);
        }
    }

    public final void b(d<ResultT> dVar) {
        k<ResultT> kVarPoll;
        synchronized (this.f15765a) {
            if (this.f15766b != null && !this.f15767c) {
                this.f15767c = true;
                while (true) {
                    synchronized (this.f15765a) {
                        kVarPoll = this.f15766b.poll();
                        if (kVarPoll == null) {
                            this.f15767c = false;
                            return;
                        }
                    }
                    kVarPoll.a(dVar);
                }
            }
        }
    }
}

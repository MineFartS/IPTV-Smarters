package c.f.a.c.k.b;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue<x4<?>> f14478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14479d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z4 f14480e;

    public y4(z4 z4Var, String str, BlockingQueue<x4<?>> blockingQueue) {
        this.f14480e = z4Var;
        c.f.a.c.f.q.o.i(str);
        c.f.a.c.f.q.o.i(blockingQueue);
        this.f14477b = new Object();
        this.f14478c = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f14477b) {
            this.f14477b.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.f14480e.f14504j) {
            if (!this.f14479d) {
                this.f14480e.f14505k.release();
                this.f14480e.f14504j.notifyAll();
                if (this == this.f14480e.f14498d) {
                    z4.z(this.f14480e, null);
                } else if (this == this.f14480e.f14499e) {
                    z4.B(this.f14480e, null);
                } else {
                    this.f14480e.f14413a.c().o().a("Current scheduler thread is neither worker nor network");
                }
                this.f14479d = true;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f14480e.f14413a.c().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f14480e.f14505k.acquire();
                z = true;
            } catch (InterruptedException e2) {
                c(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                x4<?> x4VarPoll = this.f14478c.poll();
                if (x4VarPoll == null) {
                    synchronized (this.f14477b) {
                        if (this.f14478c.peek() == null) {
                            z4.w(this.f14480e);
                            try {
                                this.f14477b.wait(30000L);
                            } catch (InterruptedException e3) {
                                c(e3);
                            }
                        }
                    }
                    synchronized (this.f14480e.f14504j) {
                        if (this.f14478c.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(true != x4VarPoll.f14435c ? 10 : threadPriority);
                    x4VarPoll.run();
                }
            }
            if (this.f14480e.f14413a.z().w(null, m3.r0)) {
                b();
            }
        } finally {
            b();
        }
    }
}

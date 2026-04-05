package c.h.a.h;

import android.util.Log;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f16936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Condition f16937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16939d;

    public l() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f16936a = reentrantLock;
        this.f16937b = reentrantLock.newCondition();
        this.f16938c = false;
        this.f16939d = false;
    }

    public void a() {
        this.f16936a.lock();
        try {
            Log.v("ThreadControl", "Cancelling");
            if (this.f16939d) {
                return;
            }
            this.f16939d = true;
            this.f16937b.signalAll();
        } finally {
            this.f16936a.unlock();
        }
    }

    public boolean b() {
        return this.f16939d;
    }

    public void c() {
        this.f16936a.lock();
        Log.v("ThreadControl", "Pausing");
        this.f16938c = true;
        this.f16936a.unlock();
    }

    public void d() {
        this.f16936a.lock();
        try {
            Log.v("ThreadControl", "Resuming");
            if (this.f16938c) {
                this.f16938c = false;
                this.f16937b.signalAll();
            }
        } finally {
            this.f16936a.unlock();
        }
    }

    public void e() {
        this.f16936a.lock();
        while (this.f16938c && !this.f16939d) {
            try {
                Log.v("ThreadControl", "Going to wait");
                this.f16937b.await();
                Log.v("ThreadControl", "Done waiting");
            } finally {
                this.f16936a.unlock();
            }
        }
    }
}

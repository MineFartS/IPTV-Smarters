package c.k.b;

import android.net.NetworkInfo;
import c.k.b.g0;
import c.k.b.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class v extends ThreadPoolExecutor {

    public static final class a extends FutureTask<c> implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f18782b;

        public a(c cVar) {
            super(cVar, null);
            this.f18782b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            t.f fVarP = this.f18782b.p();
            t.f fVarP2 = aVar.f18782b.p();
            return fVarP == fVarP2 ? this.f18782b.f18675f - aVar.f18782b.f18675f : fVarP2.ordinal() - fVarP.ordinal();
        }
    }

    public v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new g0.f());
    }

    public void a(NetworkInfo networkInfo) {
        int i2;
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                i2 = 4;
                b(i2);
                return;
            }
            b(3);
            return;
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                    default:
                        b(3);
                        break;
                }
                b(i2);
            case 3:
            case 4:
            case 5:
            case 6:
                i2 = 2;
                b(i2);
                break;
        }
    }

    public final void b(int i2) {
        setCorePoolSize(i2);
        setMaximumPoolSize(i2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}

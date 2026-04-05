package c.f.a.e.a.i;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static <ResultT> d<ResultT> a(ResultT resultt) {
        q qVar = new q();
        qVar.g(resultt);
        return qVar;
    }

    public static <ResultT> ResultT b(d<ResultT> dVar) throws InterruptedException {
        c.f.a.e.a.e.m.c(dVar, "Task must not be null");
        if (dVar.e()) {
            return (ResultT) d(dVar);
        }
        r rVar = new r(null);
        e(dVar, rVar);
        rVar.b();
        return (ResultT) d(dVar);
    }

    public static <ResultT> d<ResultT> c(Exception exc) {
        q qVar = new q();
        qVar.i(exc);
        return qVar;
    }

    public static <ResultT> ResultT d(d<ResultT> dVar) throws ExecutionException {
        if (dVar.f()) {
            return dVar.d();
        }
        throw new ExecutionException(dVar.c());
    }

    public static void e(d<?> dVar, r rVar) {
        Executor executor = e.f15754b;
        dVar.b(executor, rVar);
        dVar.a(executor, rVar);
    }
}

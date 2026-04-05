package c.f.a.c.o;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i<TResult> {
    public i<TResult> a(@RecentlyNonNull Executor executor, @RecentlyNonNull c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public i<TResult> b(@RecentlyNonNull d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public i<TResult> c(@RecentlyNonNull Executor executor, @RecentlyNonNull d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract i<TResult> d(@RecentlyNonNull e eVar);

    public abstract i<TResult> e(@RecentlyNonNull Executor executor, @RecentlyNonNull e eVar);

    public abstract i<TResult> f(@RecentlyNonNull f<? super TResult> fVar);

    public abstract i<TResult> g(@RecentlyNonNull Executor executor, @RecentlyNonNull f<? super TResult> fVar);

    public <TContinuationResult> i<TContinuationResult> h(@RecentlyNonNull Executor executor, @RecentlyNonNull a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> i(@RecentlyNonNull Executor executor, @RecentlyNonNull a<TResult, i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @RecentlyNullable
    public abstract Exception j();

    @RecentlyNonNull
    public abstract TResult k();

    @RecentlyNonNull
    public abstract <X extends Throwable> TResult l(@RecentlyNonNull Class<X> cls);

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public <TContinuationResult> i<TContinuationResult> p(@RecentlyNonNull Executor executor, @RecentlyNonNull h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}

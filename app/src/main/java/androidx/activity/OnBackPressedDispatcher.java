package androidx.activity;

import a.a.b;
import a.p.f;
import a.p.i;
import a.p.k;
import android.annotation.SuppressLint;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f4009b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements i, a.a.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f4010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f4011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a.a.a f4012d;

        public LifecycleOnBackPressedCancellable(f fVar, b bVar) {
            this.f4010b = fVar;
            this.f4011c = bVar;
            fVar.a(this);
        }

        @Override // a.a.a
        public void cancel() {
            this.f4010b.c(this);
            this.f4011c.e(this);
            a.a.a aVar = this.f4012d;
            if (aVar != null) {
                aVar.cancel();
                this.f4012d = null;
            }
        }

        @Override // a.p.i
        public void d(k kVar, f.b bVar) {
            if (bVar == f.b.ON_START) {
                this.f4012d = OnBackPressedDispatcher.this.b(this.f4011c);
                return;
            }
            if (bVar != f.b.ON_STOP) {
                if (bVar == f.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                a.a.a aVar = this.f4012d;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    public class a implements a.a.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f4014b;

        public a(b bVar) {
            this.f4014b = bVar;
        }

        @Override // a.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.f4009b.remove(this.f4014b);
            this.f4014b.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f4008a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(k kVar, b bVar) {
        f lifecycle = kVar.getLifecycle();
        if (lifecycle.b() == f.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
    }

    public a.a.a b(b bVar) {
        this.f4009b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> itDescendingIterator = this.f4009b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f4008a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

package c.f.a.b.j3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.f.a.b.j3.t;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes2.dex */
public final class y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f9312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<T> f9313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f9314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f9315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f9316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9317g;

    public interface a<T> {
        void a(T t);
    }

    public interface b<T> {
        void a(T t, t tVar);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nonnull
        public final T f9318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t.b f9319b = new t.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9321d;

        public c(@Nonnull T t) {
            this.f9318a = t;
        }

        public void a(int i2, a<T> aVar) {
            if (this.f9321d) {
                return;
            }
            if (i2 != -1) {
                this.f9319b.a(i2);
            }
            this.f9320c = true;
            aVar.a(this.f9318a);
        }

        public void b(b<T> bVar) {
            if (this.f9321d || !this.f9320c) {
                return;
            }
            t tVarE = this.f9319b.e();
            this.f9319b = new t.b();
            this.f9320c = false;
            bVar.a(this.f9318a, tVarE);
        }

        public void c(b<T> bVar) {
            this.f9321d = true;
            if (this.f9320c) {
                bVar.a(this.f9318a, this.f9319b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f9318a.equals(((c) obj).f9318a);
        }

        public int hashCode() {
            return this.f9318a.hashCode();
        }
    }

    public y(Looper looper, i iVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, iVar, bVar);
    }

    public y(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, i iVar, b<T> bVar) {
        this.f9311a = iVar;
        this.f9314d = copyOnWriteArraySet;
        this.f9313c = bVar;
        this.f9315e = new ArrayDeque<>();
        this.f9316f = new ArrayDeque<>();
        this.f9312b = iVar.d(looper, new Handler.Callback() { // from class: c.f.a.b.j3.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f9153b.d(message);
            }
        });
    }

    public static /* synthetic */ void f(CopyOnWriteArraySet copyOnWriteArraySet, int i2, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i2, aVar);
        }
    }

    public void a(T t) {
        if (this.f9317g) {
            return;
        }
        g.e(t);
        this.f9314d.add(new c<>(t));
    }

    public y<T> b(Looper looper, b<T> bVar) {
        return new y<>(this.f9314d, looper, this.f9311a, bVar);
    }

    public void c() {
        if (this.f9316f.isEmpty()) {
            return;
        }
        if (!this.f9312b.e(0)) {
            v vVar = this.f9312b;
            vVar.d(vVar.c(0));
        }
        boolean z = !this.f9315e.isEmpty();
        this.f9315e.addAll(this.f9316f);
        this.f9316f.clear();
        if (z) {
            return;
        }
        while (!this.f9315e.isEmpty()) {
            this.f9315e.peekFirst().run();
            this.f9315e.removeFirst();
        }
    }

    public final boolean d(Message message) {
        Iterator<c<T>> it = this.f9314d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f9313c);
            if (this.f9312b.e(0)) {
                return true;
            }
        }
        return true;
    }

    public void g(final int i2, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f9314d);
        this.f9316f.add(new Runnable() { // from class: c.f.a.b.j3.a
            @Override // java.lang.Runnable
            public final void run() {
                y.f(copyOnWriteArraySet, i2, aVar);
            }
        });
    }

    public void h() {
        Iterator<c<T>> it = this.f9314d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f9313c);
        }
        this.f9314d.clear();
        this.f9317g = true;
    }

    public void i(T t) {
        for (c<T> cVar : this.f9314d) {
            if (cVar.f9318a.equals(t)) {
                cVar.c(this.f9313c);
                this.f9314d.remove(cVar);
            }
        }
    }

    public void j(int i2, a<T> aVar) {
        g(i2, aVar);
        c();
    }
}

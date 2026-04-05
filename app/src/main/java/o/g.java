package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import o.c;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31245a;

    public class a implements c<Object, o.b<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f31246a;

        public a(Type type) {
            this.f31246a = type;
        }

        @Override // o.c
        public Type a() {
            return this.f31246a;
        }

        @Override // o.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o.b<Object> b(o.b<Object> bVar) {
            return new b(g.this.f31245a, bVar);
        }
    }

    public static final class b<T> implements o.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f31248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o.b<T> f31249c;

        public class a implements d<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f31250a;

            /* JADX INFO: renamed from: o.g$b$a$a, reason: collision with other inner class name */
            public class RunnableC0321a implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f31252b;

                public RunnableC0321a(l lVar) {
                    this.f31252b = lVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f31249c.d()) {
                        a aVar = a.this;
                        aVar.f31250a.a(b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.f31250a.b(b.this, this.f31252b);
                    }
                }
            }

            /* JADX INFO: renamed from: o.g$b$a$b, reason: collision with other inner class name */
            public class RunnableC0322b implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Throwable f31254b;

                public RunnableC0322b(Throwable th) {
                    this.f31254b = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.f31250a.a(b.this, this.f31254b);
                }
            }

            public a(d dVar) {
                this.f31250a = dVar;
            }

            @Override // o.d
            public void a(o.b<T> bVar, Throwable th) {
                b.this.f31248b.execute(new RunnableC0322b(th));
            }

            @Override // o.d
            public void b(o.b<T> bVar, l<T> lVar) {
                b.this.f31248b.execute(new RunnableC0321a(lVar));
            }
        }

        public b(Executor executor, o.b<T> bVar) {
            this.f31248b = executor;
            this.f31249c = bVar;
        }

        @Override // o.b
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public o.b<T> clone() {
            return new b(this.f31248b, this.f31249c.clone());
        }

        @Override // o.b
        public boolean d() {
            return this.f31249c.d();
        }

        @Override // o.b
        public void x(d<T> dVar) {
            o.b(dVar, "callback == null");
            this.f31249c.x(new a(dVar));
        }
    }

    public g(Executor executor) {
        this.f31245a = executor;
    }

    @Override // o.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, m mVar) {
        if (c.a.b(type) != o.b.class) {
            return null;
        }
        return new a(o.g(type));
    }
}

package c.f.a.b.i3;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface i {

    public interface a {

        /* JADX INFO: renamed from: c.f.a.b.i3.i$a$a, reason: collision with other inner class name */
        public static final class C0136a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0137a> f8895a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: c.f.a.b.i3.i$a$a$a, reason: collision with other inner class name */
            public static final class C0137a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f8896a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f8897b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f8898c;

                public C0137a(Handler handler, a aVar) {
                    this.f8896a = handler;
                    this.f8897b = aVar;
                }

                public void d() {
                    this.f8898c = true;
                }
            }

            public void a(Handler handler, a aVar) {
                c.f.a.b.j3.g.e(handler);
                c.f.a.b.j3.g.e(aVar);
                d(aVar);
                this.f8895a.add(new C0137a(handler, aVar));
            }

            public void b(final int i2, final long j2, final long j3) {
                for (final C0137a c0137a : this.f8895a) {
                    if (!c0137a.f8898c) {
                        c0137a.f8896a.post(new Runnable() { // from class: c.f.a.b.i3.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0137a.f8897b.y(i2, j2, j3);
                            }
                        });
                    }
                }
            }

            public void d(a aVar) {
                for (C0137a c0137a : this.f8895a) {
                    if (c0137a.f8897b == aVar) {
                        c0137a.d();
                        this.f8895a.remove(c0137a);
                    }
                }
            }
        }

        void y(int i2, long j2, long j3);
    }

    long a();

    n0 d();

    void e(a aVar);

    long f();

    void h(Handler handler, a aVar);
}

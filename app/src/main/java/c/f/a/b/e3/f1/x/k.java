package c.f.a.b.e3.f1.x;

import android.net.Uri;
import c.f.a.b.e3.j0;
import c.f.a.b.i3.f0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface k {

    public interface a {
        k a(c.f.a.b.e3.f1.k kVar, f0 f0Var, j jVar);
    }

    public interface b {
        void a();

        boolean e(Uri uri, f0.c cVar, boolean z);
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f7470b;

        public c(Uri uri) {
            this.f7470b = uri;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f7471b;

        public d(Uri uri) {
            this.f7471b = uri;
        }
    }

    public interface e {
        void c(g gVar);
    }

    boolean a(Uri uri);

    void b(b bVar);

    void c(Uri uri);

    long d();

    boolean e();

    boolean f(Uri uri, long j2);

    f g();

    void h(Uri uri, j0.a aVar, e eVar);

    void i();

    void j(Uri uri);

    void l(b bVar);

    g n(Uri uri, boolean z);

    void stop();
}

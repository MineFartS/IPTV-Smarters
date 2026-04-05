package c.d.a.n.i.o;

import android.util.Log;
import c.d.a.k.a;
import c.d.a.n.i.o.a;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f5636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5637b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f5638c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f5639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.d.a.k.a f5641f;

    public e(File file, int i2) {
        this.f5639d = file;
        this.f5640e = i2;
    }

    public static synchronized a d(File file, int i2) {
        if (f5636a == null) {
            f5636a = new e(file, i2);
        }
        return f5636a;
    }

    @Override // c.d.a.n.i.o.a
    public void a(c.d.a.n.c cVar, a.b bVar) {
        String strA = this.f5638c.a(cVar);
        this.f5637b.a(cVar);
        try {
            try {
                a.b bVarV = e().v(strA);
                if (bVarV != null) {
                    try {
                        if (bVar.a(bVarV.f(0))) {
                            bVarV.e();
                        }
                        bVarV.b();
                    } catch (Throwable th) {
                        bVarV.b();
                        throw th;
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            this.f5637b.b(cVar);
        }
    }

    @Override // c.d.a.n.i.o.a
    public File b(c.d.a.n.c cVar) {
        try {
            a.d dVarX = e().x(this.f5638c.a(cVar));
            if (dVarX != null) {
                return dVarX.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    @Override // c.d.a.n.i.o.a
    public void c(c.d.a.n.c cVar) {
        try {
            e().w0(this.f5638c.a(cVar));
        } catch (IOException e2) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e2);
            }
        }
    }

    public final synchronized c.d.a.k.a e() {
        if (this.f5641f == null) {
            this.f5641f = c.d.a.k.a.Q(this.f5639d, 1, 1, this.f5640e);
        }
        return this.f5641f;
    }
}

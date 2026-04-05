package c.d.a.n.i;

import android.util.Log;
import c.d.a.n.i.o.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class a<A, T, Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5517a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.h.c<A> f5521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.d.a.q.b<A, T> f5522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.d.a.n.g<T> f5523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.d.a.n.k.j.c<T, Z> f5524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC0101a f5525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.d.a.n.i.b f5526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.d.a.i f5527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f5528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f5529m;

    /* JADX INFO: renamed from: c.d.a.n.i.a$a, reason: collision with other inner class name */
    public interface InterfaceC0101a {
        c.d.a.n.i.o.a a();
    }

    public static class b {
        public OutputStream a(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    public class c<DataType> implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.d.a.n.b<DataType> f5530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataType f5531b;

        public c(c.d.a.n.b<DataType> bVar, DataType datatype) {
            this.f5530a = bVar;
            this.f5531b = datatype;
        }

        @Override // c.d.a.n.i.o.a.b
        public boolean a(File file) {
            OutputStream outputStreamA = null;
            try {
                try {
                    outputStreamA = a.this.f5528l.a(file);
                    boolean zA = this.f5530a.a(this.f5531b, outputStreamA);
                    if (outputStreamA == null) {
                        return zA;
                    }
                    try {
                        outputStreamA.close();
                        return zA;
                    } catch (IOException unused) {
                        return zA;
                    }
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "Failed to find file to write to disk cache", e2);
                    }
                    if (outputStreamA != null) {
                        try {
                            outputStreamA.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (outputStreamA != null) {
                    try {
                        outputStreamA.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }

    public a(f fVar, int i2, int i3, c.d.a.n.h.c<A> cVar, c.d.a.q.b<A, T> bVar, c.d.a.n.g<T> gVar, c.d.a.n.k.j.c<T, Z> cVar2, InterfaceC0101a interfaceC0101a, c.d.a.n.i.b bVar2, c.d.a.i iVar) {
        this(fVar, i2, i3, cVar, bVar, gVar, cVar2, interfaceC0101a, bVar2, iVar, f5517a);
    }

    public a(f fVar, int i2, int i3, c.d.a.n.h.c<A> cVar, c.d.a.q.b<A, T> bVar, c.d.a.n.g<T> gVar, c.d.a.n.k.j.c<T, Z> cVar2, InterfaceC0101a interfaceC0101a, c.d.a.n.i.b bVar2, c.d.a.i iVar, b bVar3) {
        this.f5518b = fVar;
        this.f5519c = i2;
        this.f5520d = i3;
        this.f5521e = cVar;
        this.f5522f = bVar;
        this.f5523g = gVar;
        this.f5524h = cVar2;
        this.f5525i = interfaceC0101a;
        this.f5526j = bVar2;
        this.f5527k = iVar;
        this.f5528l = bVar3;
    }

    public final l<T> b(A a2) {
        long jB = c.d.a.t.d.b();
        this.f5525i.a().a(this.f5518b.b(), new c(this.f5522f.a(), a2));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote source to cache", jB);
        }
        long jB2 = c.d.a.t.d.b();
        l<T> lVarI = i(this.f5518b.b());
        if (Log.isLoggable("DecodeJob", 2) && lVarI != null) {
            j("Decoded source from cache", jB2);
        }
        return lVarI;
    }

    public void c() {
        this.f5529m = true;
        this.f5521e.cancel();
    }

    public l<Z> d() {
        return m(g());
    }

    public final l<T> e(A a2) {
        if (this.f5526j.cacheSource()) {
            return b(a2);
        }
        long jB = c.d.a.t.d.b();
        l<T> lVarA = this.f5522f.e().a(a2, this.f5519c, this.f5520d);
        if (!Log.isLoggable("DecodeJob", 2)) {
            return lVarA;
        }
        j("Decoded from source", jB);
        return lVarA;
    }

    public l<Z> f() {
        if (!this.f5526j.cacheResult()) {
            return null;
        }
        long jB = c.d.a.t.d.b();
        l<T> lVarI = i(this.f5518b);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded transformed from cache", jB);
        }
        long jB2 = c.d.a.t.d.b();
        l<Z> lVarK = k(lVarI);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transcoded transformed from cache", jB2);
        }
        return lVarK;
    }

    public final l<T> g() {
        try {
            long jB = c.d.a.t.d.b();
            A aB = this.f5521e.b(this.f5527k);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Fetched data", jB);
            }
            if (this.f5529m) {
                return null;
            }
            return e(aB);
        } finally {
            this.f5521e.a();
        }
    }

    public l<Z> h() {
        if (!this.f5526j.cacheSource()) {
            return null;
        }
        long jB = c.d.a.t.d.b();
        l<T> lVarI = i(this.f5518b.b());
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded source from cache", jB);
        }
        return m(lVarI);
    }

    public final l<T> i(c.d.a.n.c cVar) {
        File fileB = this.f5525i.a().b(cVar);
        if (fileB == null) {
            return null;
        }
        try {
            l<T> lVarA = this.f5522f.f().a(fileB, this.f5519c, this.f5520d);
            if (lVarA == null) {
            }
            return lVarA;
        } finally {
            this.f5525i.a().c(cVar);
        }
    }

    public final void j(String str, long j2) {
        Log.v("DecodeJob", str + " in " + c.d.a.t.d.a(j2) + ", key: " + this.f5518b);
    }

    public final l<Z> k(l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        return this.f5524h.a(lVar);
    }

    public final l<T> l(l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        l<T> lVarA = this.f5523g.a(lVar, this.f5519c, this.f5520d);
        if (!lVar.equals(lVarA)) {
            lVar.b();
        }
        return lVarA;
    }

    public final l<Z> m(l<T> lVar) {
        long jB = c.d.a.t.d.b();
        l<T> lVarL = l(lVar);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transformed resource from source", jB);
        }
        n(lVarL);
        long jB2 = c.d.a.t.d.b();
        l<Z> lVarK = k(lVarL);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transcoded transformed from source", jB2);
        }
        return lVarK;
    }

    public final void n(l<T> lVar) {
        if (lVar == null || !this.f5526j.cacheResult()) {
            return;
        }
        long jB = c.d.a.t.d.b();
        this.f5525i.a().a(this.f5518b, new c(this.f5522f.c(), lVar));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote transformed from source to cache", jB);
        }
    }
}

package c.d.a.n.j;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f<A> implements l<A, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<A, InputStream> f5673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<A, ParcelFileDescriptor> f5674b;

    public static class a implements c.d.a.n.h.c<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.d.a.n.h.c<InputStream> f5675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.d.a.n.h.c<ParcelFileDescriptor> f5676b;

        public a(c.d.a.n.h.c<InputStream> cVar, c.d.a.n.h.c<ParcelFileDescriptor> cVar2) {
            this.f5675a = cVar;
            this.f5676b = cVar2;
        }

        @Override // c.d.a.n.h.c
        public void a() {
            c.d.a.n.h.c<InputStream> cVar = this.f5675a;
            if (cVar != null) {
                cVar.a();
            }
            c.d.a.n.h.c<ParcelFileDescriptor> cVar2 = this.f5676b;
            if (cVar2 != null) {
                cVar2.a();
            }
        }

        @Override // c.d.a.n.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(c.d.a.i iVar) throws Exception {
            InputStream inputStreamB;
            c.d.a.n.h.c<InputStream> cVar = this.f5675a;
            ParcelFileDescriptor parcelFileDescriptorB = null;
            if (cVar != null) {
                try {
                    inputStreamB = cVar.b(iVar);
                } catch (Exception e2) {
                    if (Log.isLoggable("IVML", 2)) {
                        Log.v("IVML", "Exception fetching input stream, trying ParcelFileDescriptor", e2);
                    }
                    if (this.f5676b == null) {
                        throw e2;
                    }
                    inputStreamB = null;
                }
            } else {
                inputStreamB = null;
            }
            c.d.a.n.h.c<ParcelFileDescriptor> cVar2 = this.f5676b;
            if (cVar2 != null) {
                try {
                    parcelFileDescriptorB = cVar2.b(iVar);
                } catch (Exception e3) {
                    if (Log.isLoggable("IVML", 2)) {
                        Log.v("IVML", "Exception fetching ParcelFileDescriptor", e3);
                    }
                    if (inputStreamB == null) {
                        throw e3;
                    }
                }
            }
            return new g(inputStreamB, parcelFileDescriptorB);
        }

        @Override // c.d.a.n.h.c
        public void cancel() {
            c.d.a.n.h.c<InputStream> cVar = this.f5675a;
            if (cVar != null) {
                cVar.cancel();
            }
            c.d.a.n.h.c<ParcelFileDescriptor> cVar2 = this.f5676b;
            if (cVar2 != null) {
                cVar2.cancel();
            }
        }

        @Override // c.d.a.n.h.c
        public String getId() {
            c.d.a.n.h.c<InputStream> cVar = this.f5675a;
            return cVar != null ? cVar.getId() : this.f5676b.getId();
        }
    }

    public f(l<A, InputStream> lVar, l<A, ParcelFileDescriptor> lVar2) {
        if (lVar == null && lVar2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f5673a = lVar;
        this.f5674b = lVar2;
    }

    @Override // c.d.a.n.j.l
    public c.d.a.n.h.c<g> a(A a2, int i2, int i3) {
        l<A, InputStream> lVar = this.f5673a;
        c.d.a.n.h.c<InputStream> cVarA = lVar != null ? lVar.a(a2, i2, i3) : null;
        l<A, ParcelFileDescriptor> lVar2 = this.f5674b;
        c.d.a.n.h.c<ParcelFileDescriptor> cVarA2 = lVar2 != null ? lVar2.a(a2, i2, i3) : null;
        if (cVarA == null && cVarA2 == null) {
            return null;
        }
        return new a(cVarA, cVarA2);
    }
}

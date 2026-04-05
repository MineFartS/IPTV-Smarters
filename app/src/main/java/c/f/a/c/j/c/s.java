package c.f.a.c.j.c;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static <R extends c.f.a.c.f.o.j, T> c.f.a.c.f.o.g<R> a(c.f.a.c.o.i<T> iVar, final x<R, T> xVar, final x<R, Status> xVar2) {
        final y yVar = new y(xVar2);
        iVar.f(new c.f.a.c.o.f(yVar, xVar) { // from class: c.f.a.c.j.c.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final y f13121a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final x f13122b;

            {
                this.f13121a = yVar;
                this.f13122b = xVar;
            }

            @Override // c.f.a.c.o.f
            public final void a(Object obj) {
                this.f13121a.i(this.f13122b.a(obj));
            }
        }).d(new c.f.a.c.o.e(yVar, xVar2) { // from class: c.f.a.c.j.c.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final y f13111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final x f13112b;

            {
                this.f13111a = yVar;
                this.f13112b = xVar2;
            }

            @Override // c.f.a.c.o.e
            public final void onFailure(Exception exc) {
                y yVar2 = this.f13111a;
                x xVar3 = this.f13112b;
                Status status = new Status(8, "unknown error");
                if (exc instanceof c.f.a.c.f.o.b) {
                    c.f.a.c.f.o.b bVar = (c.f.a.c.f.o.b) exc;
                    status = new Status(bVar.b(), bVar.getMessage());
                }
                yVar2.i(xVar3.a(status));
            }
        });
        return yVar;
    }
}

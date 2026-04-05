package c.d.a.n.j.t;

import android.content.Context;
import c.d.a.n.j.k;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<c.d.a.n.j.d, c.d.a.n.j.d> f5703a;

    /* JADX INFO: renamed from: c.d.a.n.j.t.a$a, reason: collision with other inner class name */
    public static class C0110a implements m<c.d.a.n.j.d, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k<c.d.a.n.j.d, c.d.a.n.j.d> f5704a = new k<>(500);

        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<c.d.a.n.j.d, InputStream> b(Context context, c.d.a.n.j.c cVar) {
            return new a(this.f5704a);
        }
    }

    public a(k<c.d.a.n.j.d, c.d.a.n.j.d> kVar) {
        this.f5703a = kVar;
    }

    @Override // c.d.a.n.j.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.h.c<InputStream> a(c.d.a.n.j.d dVar, int i2, int i3) {
        k<c.d.a.n.j.d, c.d.a.n.j.d> kVar = this.f5703a;
        if (kVar != null) {
            c.d.a.n.j.d dVarA = kVar.a(dVar, 0, 0);
            if (dVarA == null) {
                this.f5703a.b(dVar, 0, 0, dVar);
            } else {
                dVar = dVarA;
            }
        }
        return new c.d.a.n.h.f(dVar);
    }
}

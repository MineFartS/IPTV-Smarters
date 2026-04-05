package c.f.a.b.e3.h1.g;

import c.f.a.b.c3.h0;
import c.f.a.b.e3.h1.f.a;
import c.f.a.b.e3.h1.f.b;
import c.f.a.b.i3.i0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.p0.d;
import c.f.a.b.i3.s;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h0<c.f.a.b.e3.h1.f.a> {
    public a(p1 p1Var, i0.a<c.f.a.b.e3.h1.f.a> aVar, d.c cVar, Executor executor) {
        super(p1Var, aVar, cVar, executor);
    }

    public a(p1 p1Var, d.c cVar, Executor executor) {
        this(p1Var.a().B(x0.C(((p1.g) g.e(p1Var.f9643d)).f9685a)).a(), new b(), cVar, executor);
    }

    @Override // c.f.a.b.c3.h0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<h0.c> h(p pVar, c.f.a.b.e3.h1.f.a aVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (a.b bVar : aVar.f7778f) {
            for (int i2 = 0; i2 < bVar.f7793j.length; i2++) {
                for (int i3 = 0; i3 < bVar.f7794k; i3++) {
                    arrayList.add(new h0.c(bVar.e(i3), new s(bVar.a(i2, i3))));
                }
            }
        }
        return arrayList;
    }
}

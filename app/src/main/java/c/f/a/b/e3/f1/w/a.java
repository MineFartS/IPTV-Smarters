package c.f.a.b.e3.f1.w;

import android.net.Uri;
import c.f.a.b.c3.h0;
import c.f.a.b.e3.f1.x.f;
import c.f.a.b.e3.f1.x.g;
import c.f.a.b.e3.f1.x.h;
import c.f.a.b.e3.f1.x.i;
import c.f.a.b.i3.i0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.p0.d;
import c.f.a.b.i3.s;
import c.f.a.b.j3.w0;
import c.f.a.b.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h0<h> {
    public a(p1 p1Var, i0.a<h> aVar, d.c cVar, Executor executor) {
        super(p1Var, aVar, cVar, executor);
    }

    public a(p1 p1Var, d.c cVar, Executor executor) {
        this(p1Var, new i(), cVar, executor);
    }

    public final void l(List<Uri> list, List<s> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            list2.add(h0.f(list.get(i2)));
        }
    }

    public final void m(g gVar, g.d dVar, HashSet<Uri> hashSet, ArrayList<h0.c> arrayList) {
        String str = gVar.f7450a;
        long j2 = gVar.f7419h + dVar.f7438f;
        String str2 = dVar.f7440h;
        if (str2 != null) {
            Uri uriE = w0.e(str, str2);
            if (hashSet.add(uriE)) {
                arrayList.add(new h0.c(j2, h0.f(uriE)));
            }
        }
        arrayList.add(new h0.c(j2, new s(w0.e(str, dVar.f7434b), dVar.f7442j, dVar.f7443k)));
    }

    @Override // c.f.a.b.c3.h0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<h0.c> h(p pVar, h hVar, boolean z) throws IOException {
        ArrayList<s> arrayList = new ArrayList();
        if (hVar instanceof f) {
            l(((f) hVar).f7395e, arrayList);
        } else {
            arrayList.add(h0.f(Uri.parse(hVar.f7450a)));
        }
        ArrayList<h0.c> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        for (s sVar : arrayList) {
            arrayList2.add(new h0.c(0L, sVar));
            try {
                g gVar = (g) g(pVar, sVar, z);
                g.d dVar = null;
                List<g.d> list = gVar.r;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    g.d dVar2 = list.get(i2);
                    g.d dVar3 = dVar2.f7435c;
                    if (dVar3 != null && dVar3 != dVar) {
                        m(gVar, dVar3, hashSet, arrayList2);
                        dVar = dVar3;
                    }
                    m(gVar, dVar2, hashSet, arrayList2);
                }
            } catch (IOException e2) {
                if (!z) {
                    throw e2;
                }
            }
        }
        return arrayList2;
    }
}

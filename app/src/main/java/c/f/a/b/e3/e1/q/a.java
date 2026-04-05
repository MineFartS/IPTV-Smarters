package c.f.a.b.e3.e1.q;

import c.f.a.b.c3.h0;
import c.f.a.b.c3.u;
import c.f.a.b.e3.e1.k;
import c.f.a.b.e3.e1.l;
import c.f.a.b.e3.e1.p.c;
import c.f.a.b.e3.e1.p.g;
import c.f.a.b.e3.e1.p.i;
import c.f.a.b.e3.e1.p.j;
import c.f.a.b.i3.i0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.p0.d;
import c.f.a.b.i3.s;
import c.f.a.b.j3.n0;
import c.f.a.b.p1;
import c.f.a.b.w0;
import c.f.a.b.z2.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h0<c> {

    /* JADX INFO: renamed from: c.f.a.b.e3.e1.q.a$a, reason: collision with other inner class name */
    public class C0127a extends n0<e, IOException> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p f7244i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f7245j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ j f7246k;

        public C0127a(p pVar, int i2, j jVar) {
            this.f7244i = pVar;
            this.f7245j = i2;
            this.f7246k = jVar;
        }

        @Override // c.f.a.b.j3.n0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public e d() {
            return k.b(this.f7244i, this.f7245j, this.f7246k);
        }
    }

    public a(p1 p1Var, i0.a<c> aVar, d.c cVar, Executor executor) {
        super(p1Var, aVar, cVar, executor);
    }

    public a(p1 p1Var, d.c cVar, Executor executor) {
        this(p1Var, new c.f.a.b.e3.e1.p.d(), cVar, executor);
    }

    public static void l(long j2, String str, i iVar, ArrayList<h0.c> arrayList) {
        arrayList.add(new h0.c(j2, new s(iVar.b(str), iVar.f7199a, iVar.f7200b)));
    }

    public final void m(p pVar, c.f.a.b.e3.e1.p.a aVar, long j2, long j3, boolean z, ArrayList<h0.c> arrayList) throws IOException {
        c.f.a.b.e3.e1.j jVarN;
        c.f.a.b.e3.e1.p.a aVar2 = aVar;
        int i2 = 0;
        int i3 = 0;
        while (i3 < aVar2.f7148c.size()) {
            j jVar = aVar2.f7148c.get(i3);
            try {
                jVarN = n(pVar, aVar2.f7147b, jVar, z);
            } catch (IOException e2) {
                e = e2;
            }
            if (jVarN != null) {
                long jI = jVarN.i(j3);
                if (jI == -1) {
                    throw new u("Unbounded segment index");
                }
                String str = jVar.f7205c.get(i2).f7152a;
                i iVarN = jVar.n();
                if (iVarN != null) {
                    l(j2, str, iVarN, arrayList);
                }
                i iVarM = jVar.m();
                if (iVarM != null) {
                    l(j2, str, iVarM, arrayList);
                }
                long jH = jVarN.h();
                long j4 = (jH + jI) - 1;
                for (long j5 = jH; j5 <= j4; j5++) {
                    l(j2 + jVarN.b(j5), str, jVarN.e(j5), arrayList);
                }
                i3++;
                aVar2 = aVar;
                i2 = 0;
            } else {
                try {
                    throw new u("Missing segment index");
                } catch (IOException e3) {
                    e = e3;
                    if (!z) {
                        throw e;
                    }
                    i3++;
                    aVar2 = aVar;
                    i2 = 0;
                }
            }
        }
    }

    public final c.f.a.b.e3.e1.j n(p pVar, int i2, j jVar, boolean z) {
        c.f.a.b.e3.e1.j jVarL = jVar.l();
        if (jVarL != null) {
            return jVarL;
        }
        e eVar = (e) e(new C0127a(pVar, i2, jVar), z);
        if (eVar == null) {
            return null;
        }
        return new l(eVar, jVar.f7206d);
    }

    @Override // c.f.a.b.c3.h0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public List<h0.c> h(p pVar, c cVar, boolean z) throws IOException {
        ArrayList<h0.c> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < cVar.e(); i2++) {
            g gVarD = cVar.d(i2);
            long jD = w0.d(gVarD.f7190b);
            long jG = cVar.g(i2);
            int i3 = 0;
            for (List<c.f.a.b.e3.e1.p.a> list = gVarD.f7191c; i3 < list.size(); list = list) {
                m(pVar, list.get(i3), jD, jG, z, arrayList);
                i3++;
            }
        }
        return arrayList;
    }
}

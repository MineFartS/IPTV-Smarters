package c.f.a.c.k.b;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.c.j.h.f2 f14231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BitSet f14232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitSet f14233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<Integer, Long> f14234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<Integer, List<Long>> f14235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ua f14236h;

    public /* synthetic */ pa(ua uaVar, String str, c.f.a.c.j.h.f2 f2Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, oa oaVar) {
        this.f14236h = uaVar;
        this.f14229a = str;
        this.f14232d = bitSet;
        this.f14233e = bitSet2;
        this.f14234f = map;
        this.f14235g = new a.f.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f14235g.put(num, arrayList);
        }
        this.f14230b = false;
        this.f14231c = f2Var;
    }

    public /* synthetic */ pa(ua uaVar, String str, oa oaVar) {
        this.f14236h = uaVar;
        this.f14229a = str;
        this.f14230b = true;
        this.f14232d = new BitSet();
        this.f14233e = new BitSet();
        this.f14234f = new a.f.a();
        this.f14235g = new a.f.a();
    }

    public final void a(sa saVar) {
        int iA = saVar.a();
        Boolean bool = saVar.f14306c;
        if (bool != null) {
            this.f14233e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = saVar.f14307d;
        if (bool2 != null) {
            this.f14232d.set(iA, bool2.booleanValue());
        }
        if (saVar.f14308e != null) {
            Map<Integer, Long> map = this.f14234f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l2 = map.get(numValueOf);
            long jLongValue = saVar.f14308e.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                this.f14234f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (saVar.f14309f != null) {
            Map<Integer, List<Long>> map2 = this.f14235g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List<Long> arrayList = map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f14235g.put(numValueOf2, arrayList);
            }
            if (saVar.b()) {
                arrayList.clear();
            }
            c.f.a.c.j.h.ta.a();
            f fVarZ = this.f14236h.f14413a.z();
            String str = this.f14229a;
            l3<Boolean> l3Var = m3.c0;
            if (fVarZ.w(str, l3Var) && saVar.c()) {
                arrayList.clear();
            }
            c.f.a.c.j.h.ta.a();
            boolean zW = this.f14236h.f14413a.z().w(this.f14229a, l3Var);
            Long lValueOf = Long.valueOf(saVar.f14309f.longValue() / 1000);
            if (!zW) {
                arrayList.add(lValueOf);
            } else {
                if (arrayList.contains(lValueOf)) {
                    return;
                }
                arrayList.add(lValueOf);
            }
        }
    }

    public final c.f.a.c.j.h.l1 b(int i2) {
        ArrayList arrayList;
        List listEmptyList;
        c.f.a.c.j.h.k1 k1VarD = c.f.a.c.j.h.l1.D();
        k1VarD.u(i2);
        k1VarD.z(this.f14230b);
        c.f.a.c.j.h.f2 f2Var = this.f14231c;
        if (f2Var != null) {
            k1VarD.y(f2Var);
        }
        c.f.a.c.j.h.e2 e2VarG = c.f.a.c.j.h.f2.G();
        e2VarG.y(z9.D(this.f14232d));
        e2VarG.u(z9.D(this.f14233e));
        Map<Integer, Long> map = this.f14234f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator<Integer> it = this.f14234f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                c.f.a.c.j.h.m1 m1VarA = c.f.a.c.j.h.n1.A();
                m1VarA.u(iIntValue);
                m1VarA.w(this.f14234f.get(Integer.valueOf(iIntValue)).longValue());
                arrayList2.add(m1VarA.m());
            }
            arrayList = arrayList2;
        }
        e2VarG.A(arrayList);
        Map<Integer, List<Long>> map2 = this.f14235g;
        if (map2 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f14235g.keySet()) {
                c.f.a.c.j.h.g2 g2VarB = c.f.a.c.j.h.h2.B();
                g2VarB.u(num.intValue());
                List<Long> list = this.f14235g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    g2VarB.w(list);
                }
                arrayList3.add((c.f.a.c.j.h.h2) g2VarB.m());
            }
            listEmptyList = arrayList3;
        }
        e2VarG.C(listEmptyList);
        k1VarD.w(e2VarG);
        return (c.f.a.c.j.h.l1) k1VarD.m();
    }
}

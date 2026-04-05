package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class la {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kz f22279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final abo f22280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qk f22281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<ky, kx> f22282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<ky> f22283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private akq f22285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private acn f22286k = new acn();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<abe, ky> f22277b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Object, ky> f22278c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ky> f22276a = new ArrayList();

    public la(kz kzVar, nl nlVar, Handler handler) {
        this.f22279d = kzVar;
        abo aboVar = new abo();
        this.f22280e = aboVar;
        qk qkVar = new qk();
        this.f22281f = qkVar;
        this.f22282g = new HashMap<>();
        this.f22283h = new HashSet();
        aboVar.b(handler, nlVar);
        qkVar.b(handler, nlVar);
    }

    private final void p(int i2, int i3) {
        while (i2 < this.f22276a.size()) {
            this.f22276a.get(i2).f22265d += i3;
            i2++;
        }
    }

    private final void q(ky kyVar) {
        kx kxVar = this.f22282g.get(kyVar);
        if (kxVar != null) {
            kxVar.f22259a.h(kxVar.f22260b);
        }
    }

    private final void r() {
        Iterator<ky> it = this.f22283h.iterator();
        while (it.hasNext()) {
            ky next = it.next();
            if (next.f22264c.isEmpty()) {
                q(next);
                it.remove();
            }
        }
    }

    private final void s(ky kyVar) {
        if (kyVar.f22266e && kyVar.f22264c.isEmpty()) {
            kx kxVarRemove = this.f22282g.remove(kyVar);
            ajr.b(kxVarRemove);
            kxVarRemove.f22259a.o(kxVarRemove.f22260b);
            kxVarRemove.f22259a.r(kxVarRemove.f22261c);
            kxVarRemove.f22259a.q(kxVarRemove.f22261c);
            this.f22283h.remove(kyVar);
        }
    }

    private final void t(ky kyVar) {
        abb abbVar = kyVar.f22262a;
        abh abhVar = new abh() { // from class: com.google.ads.interactivemedia.v3.internal.kv
            @Override // com.google.ads.interactivemedia.v3.internal.abh
            public final void a(abi abiVar, mg mgVar) {
                this.f22254a.n();
            }
        };
        kw kwVar = new kw(this, kyVar);
        this.f22282g.put(kyVar, new kx(abbVar, abhVar, kwVar));
        abbVar.g(amn.x(), kwVar);
        abbVar.f(amn.x(), kwVar);
        abbVar.l(abhVar, this.f22285j);
    }

    private final void u(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            ky kyVarRemove = this.f22276a.remove(i3);
            this.f22278c.remove(kyVarRemove.f22263b);
            p(i3, -kyVarRemove.f22262a.D().t());
            kyVarRemove.f22266e = true;
            if (this.f22284i) {
                s(kyVarRemove);
            }
        }
    }

    public final int a() {
        return this.f22276a.size();
    }

    public final mg b() {
        if (this.f22276a.isEmpty()) {
            return mg.f22416a;
        }
        int iT = 0;
        for (int i2 = 0; i2 < this.f22276a.size(); i2++) {
            ky kyVar = this.f22276a.get(i2);
            kyVar.f22265d = iT;
            iT += kyVar.f22262a.D().t();
        }
        return new lo(this.f22276a, this.f22286k);
    }

    public final void e(akq akqVar) {
        ajr.f(!this.f22284i);
        this.f22285j = akqVar;
        for (int i2 = 0; i2 < this.f22276a.size(); i2++) {
            ky kyVar = this.f22276a.get(i2);
            t(kyVar);
            this.f22283h.add(kyVar);
        }
        this.f22284i = true;
    }

    public final void f() {
        for (kx kxVar : this.f22282g.values()) {
            try {
                kxVar.f22259a.o(kxVar.f22260b);
            } catch (RuntimeException e2) {
                alj.a("MediaSourceList", "Failed to release child source.", e2);
            }
            kxVar.f22259a.r(kxVar.f22261c);
            kxVar.f22259a.q(kxVar.f22261c);
        }
        this.f22282g.clear();
        this.f22283h.clear();
        this.f22284i = false;
    }

    public final void g(abe abeVar) {
        ky kyVarRemove = this.f22277b.remove(abeVar);
        ajr.b(kyVarRemove);
        kyVarRemove.f22262a.W(abeVar);
        kyVarRemove.f22264c.remove(((aay) abeVar).f19024a);
        if (!this.f22277b.isEmpty()) {
            r();
        }
        s(kyVarRemove);
    }

    public final boolean h() {
        return this.f22284i;
    }

    public final mg i(int i2, List<ky> list, acn acnVar) {
        int iT;
        if (!list.isEmpty()) {
            this.f22286k = acnVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                ky kyVar = list.get(i3 - i2);
                if (i3 > 0) {
                    ky kyVar2 = this.f22276a.get(i3 - 1);
                    iT = kyVar2.f22265d + kyVar2.f22262a.D().t();
                } else {
                    iT = 0;
                }
                kyVar.c(iT);
                p(i3, kyVar.f22262a.D().t());
                this.f22276a.add(i3, kyVar);
                this.f22278c.put(kyVar.f22263b, kyVar);
                if (this.f22284i) {
                    t(kyVar);
                    if (this.f22277b.isEmpty()) {
                        this.f22283h.add(kyVar);
                    } else {
                        q(kyVar);
                    }
                }
            }
        }
        return b();
    }

    public final mg j(int i2, int i3, acn acnVar) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3 && i3 <= a()) {
            z = true;
        }
        ajr.d(z);
        this.f22286k = acnVar;
        u(i2, i3);
        return b();
    }

    public final mg k(List<ky> list, acn acnVar) {
        u(0, this.f22276a.size());
        return i(this.f22276a.size(), list, acnVar);
    }

    public final mg l(acn acnVar) {
        int iA = a();
        if (acnVar.c() != iA) {
            acnVar = acnVar.f().g(0, iA);
        }
        this.f22286k = acnVar;
        return b();
    }

    public final abe m(abg abgVar, ajm ajmVar, long j2) {
        Object objO = im.o(abgVar.f19056a);
        abg abgVarC = abgVar.c(im.n(abgVar.f19056a));
        ky kyVar = this.f22278c.get(objO);
        ajr.b(kyVar);
        this.f22283h.add(kyVar);
        kx kxVar = this.f22282g.get(kyVar);
        if (kxVar != null) {
            kxVar.f22259a.j(kxVar.f22260b);
        }
        kyVar.f22264c.add(abgVarC);
        aay aayVarX = kyVar.f22262a.X(abgVarC, ajmVar, j2);
        this.f22277b.put(aayVarX, kyVar);
        r();
        return aayVarX;
    }

    public final /* synthetic */ void n() {
        this.f22279d.h();
    }

    public final mg o() {
        ajr.d(a() >= 0);
        this.f22286k = null;
        return b();
    }
}

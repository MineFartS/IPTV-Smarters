package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aar extends aak<aap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kn f19004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<aap> f19005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<awa> f19006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f19007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<aap> f19008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IdentityHashMap<abe, aap> f19009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Object, aap> f19010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<aap> f19011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Set<awa> f19013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private acn f19014k;

    static {
        ki kiVar = new ki();
        kiVar.f(Uri.EMPTY);
        f19004a = kiVar.a();
    }

    public aar(acn acnVar, abi... abiVarArr) {
        this.f19014k = acnVar.c() > 0 ? acnVar.f() : acnVar;
        this.f19009f = new IdentityHashMap<>();
        this.f19010g = new HashMap();
        this.f19005b = new ArrayList();
        this.f19008e = new ArrayList();
        this.f19013j = new HashSet();
        this.f19006c = new HashSet();
        this.f19011h = new HashSet();
        H(Arrays.asList(abiVarArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I(aar aarVar, Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            Object obj = message.obj;
            int i3 = amn.f20135a;
            aaq aaqVar = (aaq) obj;
            aarVar.f19014k = aarVar.f19014k.g(aaqVar.f19001a, ((Collection) aaqVar.f19002b).size());
            aarVar.L(aaqVar.f19001a, (Collection) aaqVar.f19002b);
            aarVar.U(null);
            return;
        }
        if (i2 == 1) {
            Object obj2 = message.obj;
            int i4 = amn.f20135a;
            aaq aaqVar2 = (aaq) obj2;
            int i5 = aaqVar2.f19001a;
            int iIntValue = ((Integer) aaqVar2.f19002b).intValue();
            int i6 = 0;
            if (i5 != 0) {
                aarVar.f19014k = aarVar.f19014k.h(i5, iIntValue);
                i6 = i5;
            } else if (iIntValue == aarVar.f19014k.c()) {
                aarVar.f19014k = aarVar.f19014k.f();
            } else {
                i5 = 0;
                aarVar.f19014k = aarVar.f19014k.h(i5, iIntValue);
                i6 = i5;
            }
            for (int i7 = iIntValue - 1; i7 >= i6; i7--) {
                aap aapVarRemove = aarVar.f19008e.remove(i7);
                aarVar.f19010g.remove(aapVarRemove.f18996b);
                aarVar.M(i7, -1, -aapVarRemove.f18995a.D().t());
                aapVarRemove.f19000f = true;
                aarVar.P(aapVarRemove);
            }
            aarVar.U(null);
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                Object obj3 = message.obj;
                int i8 = amn.f20135a;
                aarVar.f19014k = (acn) ((aaq) obj3).f19002b;
                aarVar.U(null);
                return;
            }
            if (i2 == 4) {
                aarVar.S();
                return;
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException();
                }
                Object obj4 = message.obj;
                int i9 = amn.f20135a;
                aarVar.O((Set) obj4);
                return;
            }
        }
        Object obj5 = message.obj;
        int i10 = amn.f20135a;
        aaq aaqVar3 = (aaq) obj5;
        acn acnVar = aarVar.f19014k;
        int i11 = aaqVar3.f19001a;
        acn acnVarH = acnVar.h(i11, i11 + 1);
        aarVar.f19014k = acnVarH;
        aarVar.f19014k = acnVarH.g(((Integer) aaqVar3.f19002b).intValue(), 1);
        int i12 = aaqVar3.f19001a;
        int iIntValue2 = ((Integer) aaqVar3.f19002b).intValue();
        int iMin = Math.min(i12, iIntValue2);
        int iMax = Math.max(i12, iIntValue2);
        int iT = aarVar.f19008e.get(iMin).f18999e;
        List<aap> list = aarVar.f19008e;
        list.add(iIntValue2, list.remove(i12));
        while (iMin <= iMax) {
            aap aapVar = aarVar.f19008e.get(iMin);
            aapVar.f18998d = iMin;
            aapVar.f18999e = iT;
            iT += aapVar.f18995a.D().t();
            iMin++;
        }
        aarVar.U(null);
    }

    private final Handler K() {
        Handler handler = this.f19007d;
        ajr.b(handler);
        return handler;
    }

    private final void L(int i2, Collection<aap> collection) {
        int iT;
        for (aap aapVar : collection) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                aap aapVar2 = this.f19008e.get(i2 - 1);
                iT = aapVar2.f18999e + aapVar2.f18995a.D().t();
            } else {
                iT = 0;
            }
            aapVar.a(i2, iT);
            M(i2, 1, aapVar.f18995a.D().t());
            this.f19008e.add(i2, aapVar);
            this.f19010g.put(aapVar.f18996b, aapVar);
            A(aapVar, aapVar.f18995a);
            if (s() && this.f19009f.isEmpty()) {
                this.f19011h.add(aapVar);
            } else {
                x(aapVar);
            }
            i2 = i3;
        }
    }

    private final void M(int i2, int i3, int i4) {
        while (i2 < this.f19008e.size()) {
            aap aapVar = this.f19008e.get(i2);
            aapVar.f18998d += i3;
            aapVar.f18999e += i4;
            i2++;
        }
    }

    private final void N() {
        Iterator<aap> it = this.f19011h.iterator();
        while (it.hasNext()) {
            aap next = it.next();
            if (next.f18997c.isEmpty()) {
                x(next);
                it.remove();
            }
        }
    }

    private final synchronized void O(Set<awa> set) {
        Iterator<awa> it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        this.f19006c.removeAll(set);
    }

    private final void P(aap aapVar) {
        if (aapVar.f19000f && aapVar.f18997c.isEmpty()) {
            this.f19011h.remove(aapVar);
            B(aapVar);
        }
    }

    private final void Q() {
        U(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.ads.interactivemedia.v3.internal.aak
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void C(aap aapVar, mg mgVar) {
        if (aapVar.f18998d + 1 < this.f19008e.size()) {
            int iT = mgVar.t() - (this.f19008e.get(aapVar.f18998d + 1).f18999e - aapVar.f18999e);
            if (iT != 0) {
                M(aapVar.f18998d + 1, 0, iT);
            }
        }
        Q();
    }

    private final void S() {
        this.f19012i = false;
        Set<awa> set = this.f19013j;
        this.f19013j = new HashSet();
        n(new aan(this.f19008e, this.f19014k));
        K().obtainMessage(5, set).sendToTarget();
    }

    private final void T(int i2, Collection<abi> collection) {
        ajr.d(true);
        Handler handler = this.f19007d;
        Iterator<abi> it = collection.iterator();
        while (it.hasNext()) {
            ajr.b(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<abi> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new aap(it2.next()));
        }
        this.f19005b.addAll(i2, arrayList);
        if (handler == null || collection.isEmpty()) {
            return;
        }
        handler.obtainMessage(0, new aaq(i2, arrayList, null, null, null, null)).sendToTarget();
    }

    private final void U(awa awaVar) {
        if (this.f19012i) {
            return;
        }
        K().obtainMessage(4).sendToTarget();
        this.f19012i = true;
    }

    public final synchronized abi E(int i2) {
        return this.f19005b.get(i2).f18995a;
    }

    public final synchronized void F(abi abiVar) {
        G(this.f19005b.size(), abiVar);
    }

    public final synchronized void G(int i2, abi abiVar) {
        T(i2, Collections.singletonList(abiVar));
    }

    public final synchronized void H(Collection<abi> collection) {
        T(this.f19005b.size(), collection);
    }

    public final synchronized void J(int i2) {
        E(i2);
        int i3 = i2 + 1;
        ajr.d(true);
        Handler handler = this.f19007d;
        amn.M(this.f19005b, i2, i3);
        if (handler != null) {
            handler.obtainMessage(1, new aaq(i2, Integer.valueOf(i3), null, null, null, null)).sendToTarget();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final kn V() {
        return f19004a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void W(abe abeVar) {
        aap aapVarRemove = this.f19009f.remove(abeVar);
        ajr.b(aapVarRemove);
        aapVarRemove.f18995a.W(abeVar);
        aapVarRemove.f18997c.remove(((aay) abeVar).f19024a);
        if (!this.f19009f.isEmpty()) {
            N();
        }
        P(aapVarRemove);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final abe X(abg abgVar, ajm ajmVar, long j2) {
        Object objO = im.o(abgVar.f19056a);
        abg abgVarC = abgVar.c(im.n(abgVar.f19056a));
        aap aapVar = this.f19010g.get(objO);
        if (aapVar == null) {
            aapVar = new aap(new aao(null));
            aapVar.f19000f = true;
            A(aapVar, aapVar.f18995a);
        }
        this.f19011h.add(aapVar);
        y(aapVar);
        aapVar.f18997c.add(abgVarC);
        aay aayVarX = aapVar.f18995a.X(abgVarC, ajmVar, j2);
        this.f19009f.put(aayVarX, aapVar);
        N();
        return aayVarX;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac, com.google.ads.interactivemedia.v3.internal.abi
    public final synchronized mg Y() {
        return new aan(this.f19005b, this.f19014k.c() != this.f19005b.size() ? this.f19014k.f().g(0, this.f19005b.size()) : this.f19014k);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak, com.google.ads.interactivemedia.v3.internal.aac
    public final void i() {
        super.i();
        this.f19011h.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak, com.google.ads.interactivemedia.v3.internal.aac
    public final void k() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak, com.google.ads.interactivemedia.v3.internal.aac
    public final synchronized void m(akq akqVar) {
        super.m(akqVar);
        this.f19007d = new Handler(new Handler.Callback() { // from class: com.google.ads.interactivemedia.v3.internal.aam
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                aar.I(this.f18987a, message);
                return true;
            }
        });
        if (this.f19005b.isEmpty()) {
            S();
            return;
        }
        this.f19014k = this.f19014k.g(0, this.f19005b.size());
        L(0, this.f19005b);
        Q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak, com.google.ads.interactivemedia.v3.internal.aac
    public final synchronized void p() {
        super.p();
        this.f19008e.clear();
        this.f19011h.clear();
        this.f19010g.clear();
        this.f19014k = this.f19014k.f();
        Handler handler = this.f19007d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f19007d = null;
        }
        this.f19012i = false;
        this.f19013j.clear();
        O(this.f19006c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac, com.google.ads.interactivemedia.v3.internal.abi
    public final boolean t() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak
    public final /* bridge */ /* synthetic */ int v(aap aapVar, int i2) {
        return i2 + aapVar.f18999e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak
    public final /* bridge */ /* synthetic */ abg w(aap aapVar, abg abgVar) {
        int i2 = 0;
        while (true) {
            aap aapVar2 = aapVar;
            if (i2 >= aapVar2.f18997c.size()) {
                return null;
            }
            if (aapVar2.f18997c.get(i2).f19059d == abgVar.f19059d) {
                return abgVar.c(Pair.create(aapVar2.f18996b, abgVar.f19056a));
            }
            i2++;
        }
    }
}

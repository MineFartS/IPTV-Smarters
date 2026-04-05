package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class aak<T> extends aac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<T, aaj<T>> f18983a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f18984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private akq f18985c;

    public final void A(final T t, abi abiVar) {
        ajr.d(!this.f18983a.containsKey(t));
        abh abhVar = new abh() { // from class: com.google.ads.interactivemedia.v3.internal.aah
            @Override // com.google.ads.interactivemedia.v3.internal.abh
            public final void a(abi abiVar2, mg mgVar) {
                this.f18974a.C(t, mgVar);
            }
        };
        aai aaiVar = new aai(this, t);
        this.f18983a.put(t, new aaj<>(abiVar, abhVar, aaiVar));
        Handler handler = this.f18984b;
        ajr.b(handler);
        abiVar.g(handler, aaiVar);
        Handler handler2 = this.f18984b;
        ajr.b(handler2);
        abiVar.f(handler2, aaiVar);
        abiVar.l(abhVar, this.f18985c);
        if (s()) {
            return;
        }
        abiVar.h(abhVar);
    }

    public final void B(T t) {
        aaj<T> aajVarRemove = this.f18983a.remove(t);
        ajr.b(aajVarRemove);
        aajVarRemove.f18980a.o(aajVarRemove.f18981b);
        aajVarRemove.f18980a.r(aajVarRemove.f18982c);
        aajVarRemove.f18980a.q(aajVarRemove.f18982c);
    }

    public abstract void C(T t, mg mgVar);

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public void i() {
        for (aaj<T> aajVar : this.f18983a.values()) {
            aajVar.f18980a.h(aajVar.f18981b);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public void k() {
        for (aaj<T> aajVar : this.f18983a.values()) {
            aajVar.f18980a.j(aajVar.f18981b);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public void m(akq akqVar) {
        this.f18985c = akqVar;
        this.f18984b = amn.v();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public void p() {
        for (aaj<T> aajVar : this.f18983a.values()) {
            aajVar.f18980a.o(aajVar.f18981b);
            aajVar.f18980a.r(aajVar.f18982c);
            aajVar.f18980a.q(aajVar.f18982c);
        }
        this.f18983a.clear();
    }

    public int v(T t, int i2) {
        return i2;
    }

    public abg w(T t, abg abgVar) {
        throw null;
    }

    public final void x(T t) {
        aaj<T> aajVar = this.f18983a.get(t);
        ajr.b(aajVar);
        aajVar.f18980a.h(aajVar.f18981b);
    }

    public final void y(T t) {
        aaj<T> aajVar = this.f18983a.get(t);
        ajr.b(aajVar);
        aajVar.f18980a.j(aajVar.f18981b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public void z() {
        Iterator<aaj<T>> it = this.f18983a.values().iterator();
        while (it.hasNext()) {
            it.next().f18980a.z();
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bhd<E> extends bfv<Collection<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bfv<E> f21119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bgw<? extends Collection<E>> f21120b;

    public bhd(bfg bfgVar, Type type, bfv<E> bfvVar, bgw<? extends Collection<E>> bgwVar) {
        this.f21119a = new bhv(bfgVar, bfvVar, type);
        this.f21120b = bgwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Object read(bjj bjjVar) {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        Collection<E> collectionA = this.f21120b.a();
        bjjVar.g();
        while (bjjVar.n()) {
            collectionA.add(this.f21119a.read(bjjVar));
        }
        bjjVar.i();
        return collectionA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            bjlVar.g();
            return;
        }
        bjlVar.b();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            this.f21119a.write(bjlVar, it.next());
        }
        bjlVar.d();
    }
}

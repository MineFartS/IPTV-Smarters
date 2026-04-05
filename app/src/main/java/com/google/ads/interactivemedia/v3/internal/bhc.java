package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bhc<E> extends bfv<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfw f21116a = new bhe(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<E> f21117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bfv<E> f21118c;

    public bhc(bfg bfgVar, bfv<E> bfvVar, Class<E> cls) {
        this.f21118c = new bhv(bfgVar, bfvVar, cls);
        this.f21117b = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final Object read(bjj bjjVar) {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bjjVar.g();
        while (bjjVar.n()) {
            arrayList.add(this.f21118c.read(bjjVar));
        }
        bjjVar.i();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f21117b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, Object obj) throws IOException {
        if (obj == null) {
            bjlVar.g();
            return;
        }
        bjlVar.b();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f21118c.write(bjlVar, (E) Array.get(obj, i2));
        }
        bjlVar.d();
    }
}

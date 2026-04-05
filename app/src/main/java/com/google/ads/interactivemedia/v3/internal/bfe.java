package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class bfe extends bfv<AtomicLongArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bfv f21028a;

    public bfe(bfv bfvVar) {
        this.f21028a = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ AtomicLongArray read(bjj bjjVar) {
        ArrayList arrayList = new ArrayList();
        bjjVar.g();
        while (bjjVar.n()) {
            arrayList.add(Long.valueOf(((Number) this.f21028a.read(bjjVar)).longValue()));
        }
        bjjVar.i();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        bjlVar.b();
        int length = atomicLongArray2.length();
        for (int i2 = 0; i2 < length; i2++) {
            this.f21028a.write(bjlVar, Long.valueOf(atomicLongArray2.get(i2)));
        }
        bjlVar.d();
    }
}

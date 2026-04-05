package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class bhw extends bfv<AtomicIntegerArray> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ AtomicIntegerArray read(bjj bjjVar) {
        ArrayList arrayList = new ArrayList();
        bjjVar.g();
        while (bjjVar.n()) {
            try {
                arrayList.add(Integer.valueOf(bjjVar.b()));
            } catch (NumberFormatException e2) {
                throw new bfs(e2);
            }
        }
        bjjVar.i();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
        bjlVar.b();
        int length = atomicIntegerArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            bjlVar.h(r6.get(i2));
        }
        bjlVar.d();
    }
}

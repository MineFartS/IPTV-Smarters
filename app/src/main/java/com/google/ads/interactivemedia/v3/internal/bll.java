package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bll extends bln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f21359a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private bll() {
    }

    public /* synthetic */ bll(byte[] bArr) {
    }

    public static <E> List<E> a(Object obj, long j2) {
        return (List) bnh.f(obj, j2);
    }

    private static <L> List<L> g(Object obj, long j2, int i2) {
        Object obj2;
        List<L> listA = a(obj, j2);
        if (listA.isEmpty()) {
            List<L> bljVar = listA instanceof blk ? new blj(i2) : ((listA instanceof bmf) && (listA instanceof blc)) ? ((blc) listA).d(i2) : new ArrayList<>(i2);
            bnh.t(obj, j2, bljVar);
            return bljVar;
        }
        if (f21359a.isAssignableFrom(listA.getClass())) {
            ArrayList arrayList = new ArrayList(listA.size() + i2);
            arrayList.addAll(listA);
            obj2 = arrayList;
        } else {
            if (!(listA instanceof bnc)) {
                if (!(listA instanceof bmf) || !(listA instanceof blc)) {
                    return listA;
                }
                blc blcVar = (blc) listA;
                if (blcVar.c()) {
                    return listA;
                }
                blc blcVarD = blcVar.d(listA.size() + i2);
                bnh.t(obj, j2, blcVarD);
                return blcVarD;
            }
            blj bljVar2 = new blj(listA.size() + i2);
            bljVar2.addAll((bnc) listA);
            obj2 = bljVar2;
        }
        bnh.t(obj, j2, obj2);
        return (List<L>) obj2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bln
    public final <L> List<L> b(Object obj, long j2) {
        return g(obj, j2, 10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bln
    public final void c(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) bnh.f(obj, j2);
        if (list instanceof blk) {
            objUnmodifiableList = ((blk) list).e();
        } else {
            if (f21359a.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof bmf) && (list instanceof blc)) {
                blc blcVar = (blc) list;
                if (blcVar.c()) {
                    blcVar.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        bnh.t(obj, j2, objUnmodifiableList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bln
    public final <E> void d(Object obj, Object obj2, long j2) {
        List listA = a(obj2, j2);
        List listG = g(obj, j2, listA.size());
        int size = listG.size();
        int size2 = listA.size();
        if (size > 0 && size2 > 0) {
            listG.addAll(listA);
        }
        if (size > 0) {
            listA = listG;
        }
        bnh.t(obj, j2, listA);
    }
}

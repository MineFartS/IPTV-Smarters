package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aer implements zy<aer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final afl f19423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final afi f19424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f19425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final aex f19426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<aew> f19427m;

    public aer(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, aex aexVar, afl aflVar, afi afiVar, Uri uri, List<aew> list) {
        this.f19415a = j2;
        this.f19416b = j3;
        this.f19417c = j4;
        this.f19418d = z;
        this.f19419e = j5;
        this.f19420f = j6;
        this.f19421g = j7;
        this.f19422h = j8;
        this.f19426l = aexVar;
        this.f19423i = aflVar;
        this.f19425k = uri;
        this.f19424j = afiVar;
        this.f19427m = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zy
    public final /* bridge */ /* synthetic */ aer a(List list) {
        aer aerVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new aab());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (i2 < b()) {
            if (((aab) linkedList.peek()).f18954a != i2) {
                long jC = aerVar.c(i2);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
            } else {
                aew aewVarE = aerVar.e(i2);
                List<aeq> list2 = aewVarE.f19449c;
                aab aabVar = (aab) linkedList.poll();
                int i3 = aabVar.f18954a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i4 = aabVar.f18955b;
                    aeq aeqVar = list2.get(i4);
                    List<afb> list3 = aeqVar.f19411c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(aabVar.f18956c));
                        aabVar = (aab) linkedList.poll();
                        if (aabVar.f18954a != i3) {
                            break;
                        }
                    } while (aabVar.f18955b == i4);
                    List<aeq> list4 = list2;
                    arrayList2.add(new aeq(aeqVar.f19409a, aeqVar.f19410b, arrayList3, aeqVar.f19412d, aeqVar.f19413e, aeqVar.f19414f));
                    if (aabVar.f18954a != i3) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(aabVar);
                arrayList.add(new aew(aewVarE.f19447a, aewVarE.f19448b - j2, arrayList2, aewVarE.f19450d));
            }
            i2++;
            aerVar = this;
        }
        long j3 = aerVar.f19416b;
        return new aer(aerVar.f19415a, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, aerVar.f19417c, aerVar.f19418d, aerVar.f19419e, aerVar.f19420f, aerVar.f19421g, aerVar.f19422h, aerVar.f19426l, aerVar.f19423i, aerVar.f19424j, aerVar.f19425k, arrayList);
    }

    public final int b() {
        return this.f19427m.size();
    }

    public final long c(int i2) {
        if (i2 != this.f19427m.size() - 1) {
            return this.f19427m.get(i2 + 1).f19448b - this.f19427m.get(i2).f19448b;
        }
        long j2 = this.f19416b;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - this.f19427m.get(i2).f19448b;
    }

    public final long d(int i2) {
        return iw.b(c(i2));
    }

    public final aew e(int i2) {
        return this.f19427m.get(i2);
    }
}

package c.f.a.b.f3.v;

import c.f.a.b.j3.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements c.f.a.b.f3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f8385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f8386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f8387d;

    public k(List<g> list) {
        this.f8385b = Collections.unmodifiableList(new ArrayList(list));
        this.f8386c = new long[list.size() * 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            g gVar = list.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f8386c;
            jArr[i3] = gVar.f8357b;
            jArr[i3 + 1] = gVar.f8358c;
        }
        long[] jArr2 = this.f8386c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f8387d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public static /* synthetic */ int e(g gVar, g gVar2) {
        return (gVar.f8357b > gVar2.f8357b ? 1 : (gVar.f8357b == gVar2.f8357b ? 0 : -1));
    }

    @Override // c.f.a.b.f3.f
    public int a(long j2) {
        int iD = x0.d(this.f8387d, j2, false, false);
        if (iD < this.f8387d.length) {
            return iD;
        }
        return -1;
    }

    @Override // c.f.a.b.f3.f
    public long b(int i2) {
        c.f.a.b.j3.g.a(i2 >= 0);
        c.f.a.b.j3.g.a(i2 < this.f8387d.length);
        return this.f8387d[i2];
    }

    @Override // c.f.a.b.f3.f
    public List<c.f.a.b.f3.c> c(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f8385b.size(); i2++) {
            long[] jArr = this.f8386c;
            int i3 = i2 * 2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                g gVar = this.f8385b.get(i2);
                c.f.a.b.f3.c cVar = gVar.f8356a;
                if (cVar.f8069g == -3.4028235E38f) {
                    arrayList2.add(gVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: c.f.a.b.f3.v.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.e((g) obj, (g) obj2);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            arrayList.add(((g) arrayList2.get(i4)).f8356a.a().h((-1) - i4, 1).a());
        }
        return arrayList;
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return this.f8387d.length;
    }
}

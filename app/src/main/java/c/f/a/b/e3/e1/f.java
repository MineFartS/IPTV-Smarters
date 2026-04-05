package c.f.a.b.e3.e1;

import android.os.SystemClock;
import android.util.Pair;
import c.f.a.b.j3.x0;
import c.f.b.b.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Long> f7069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, Long> f7070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<List<Pair<String, Integer>>, c.f.a.b.e3.e1.p.b> f7071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f7072d;

    public f() {
        this(new Random());
    }

    public f(Random random) {
        this.f7071c = new HashMap();
        this.f7072d = random;
        this.f7069a = new HashMap();
        this.f7070b = new HashMap();
    }

    public static <T> void a(T t, long j2, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j2 = Math.max(j2, ((Long) x0.i(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j2));
    }

    public static int c(c.f.a.b.e3.e1.p.b bVar, c.f.a.b.e3.e1.p.b bVar2) {
        int iA = e.a(bVar.f7154c, bVar2.f7154c);
        return iA != 0 ? iA : bVar.f7153b.compareTo(bVar2.f7153b);
    }

    public static int e(List<c.f.a.b.e3.e1.p.b> list) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashSet.add(Integer.valueOf(list.get(i2).f7154c));
        }
        return hashSet.size();
    }

    public static <T> void h(long j2, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j2) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map.remove(arrayList.get(i2));
        }
    }

    public final List<c.f.a.b.e3.e1.p.b> b(List<c.f.a.b.e3.e1.p.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f7069a);
        h(jElapsedRealtime, this.f7070b);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c.f.a.b.e3.e1.p.b bVar = list.get(i2);
            if (!this.f7069a.containsKey(bVar.f7153b) && !this.f7070b.containsKey(Integer.valueOf(bVar.f7154c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void d(c.f.a.b.e3.e1.p.b bVar, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j2;
        a(bVar.f7153b, jElapsedRealtime, this.f7069a);
        a(Integer.valueOf(bVar.f7154c), jElapsedRealtime, this.f7070b);
    }

    public int f(List<c.f.a.b.e3.e1.p.b> list) {
        HashSet hashSet = new HashSet();
        List<c.f.a.b.e3.e1.p.b> listB = b(list);
        for (int i2 = 0; i2 < listB.size(); i2++) {
            hashSet.add(Integer.valueOf(listB.get(i2).f7154c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f7069a.clear();
        this.f7070b.clear();
        this.f7071c.clear();
    }

    public c.f.a.b.e3.e1.p.b j(List<c.f.a.b.e3.e1.p.b> list) {
        Object objB;
        List<c.f.a.b.e3.e1.p.b> listB = b(list);
        if (listB.size() >= 2) {
            Collections.sort(listB, new Comparator() { // from class: c.f.a.b.e3.e1.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f.c((c.f.a.b.e3.e1.p.b) obj, (c.f.a.b.e3.e1.p.b) obj2);
                }
            });
            ArrayList arrayList = new ArrayList();
            int i2 = listB.get(0).f7154c;
            int i3 = 0;
            while (true) {
                if (i3 >= listB.size()) {
                    break;
                }
                c.f.a.b.e3.e1.p.b bVar = listB.get(i3);
                if (i2 == bVar.f7154c) {
                    arrayList.add(new Pair(bVar.f7153b, Integer.valueOf(bVar.f7155d)));
                    i3++;
                } else if (arrayList.size() == 1) {
                    objB = listB.get(0);
                }
            }
            c.f.a.b.e3.e1.p.b bVar2 = this.f7071c.get(arrayList);
            if (bVar2 != null) {
                return bVar2;
            }
            c.f.a.b.e3.e1.p.b bVarK = k(listB.subList(0, arrayList.size()));
            this.f7071c.put(arrayList, bVarK);
            return bVarK;
        }
        objB = y.b(listB, null);
        return (c.f.a.b.e3.e1.p.b) objB;
    }

    public final c.f.a.b.e3.e1.p.b k(List<c.f.a.b.e3.e1.p.b> list) {
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            i2 += list.get(i3).f7155d;
        }
        int iNextInt = this.f7072d.nextInt(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            c.f.a.b.e3.e1.p.b bVar = list.get(i5);
            i4 += bVar.f7155d;
            if (iNextInt < i4) {
                return bVar;
            }
        }
        return (c.f.a.b.e3.e1.p.b) y.c(list);
    }
}

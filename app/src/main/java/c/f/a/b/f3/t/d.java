package c.f.a.b.f3.t;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c.f.a.b.f3.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f8292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f8293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f8296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f8297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f8298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<d> f8299m;

    public d(String str, String str2, long j2, long j3, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f8287a = str;
        this.f8288b = str2;
        this.f8295i = str4;
        this.f8292f = gVar;
        this.f8293g = strArr;
        this.f8289c = str2 != null;
        this.f8290d = j2;
        this.f8291e = j3;
        this.f8294h = (String) c.f.a.b.j3.g.e(str3);
        this.f8296j = dVar;
        this.f8297k = new HashMap<>();
        this.f8298l = new HashMap<>();
    }

    public static d c(String str, long j2, long j3, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j2, j3, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, BuildConfig.FLAVOR, null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), BuildConfig.FLAVOR);
        }
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                int i3 = i2 + 1;
                int i4 = i3;
                while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                    i4++;
                }
                int i5 = i4 - i3;
                if (i5 > 0) {
                    spannableStringBuilder.delete(i2, i5 + i2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
            if (spannableStringBuilder.charAt(i6) == '\n') {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
            if (spannableStringBuilder.charAt(i8) == ' ') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map<String, c.b> map) {
        if (!map.containsKey(str)) {
            c.b bVar = new c.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) c.f.a.b.j3.g.e(map.get(str).e());
    }

    public void a(d dVar) {
        if (this.f8299m == null) {
            this.f8299m = new ArrayList();
        }
        this.f8299m.add(dVar);
    }

    public final void b(Map<String, g> map, c.b bVar, int i2, int i3, int i4) {
        g gVarF = f.f(this.f8292f, this.f8293g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i2, i3, gVarF, this.f8296j, map, i4);
            if ("p".equals(this.f8287a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    bVar.m((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    bVar.p(gVarF.m());
                }
                if (gVarF.h() != null) {
                    bVar.j(gVarF.h());
                }
            }
        }
    }

    public d f(int i2) {
        List<d> list = this.f8299m;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f8299m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<c.f.a.b.f3.c> h(long j2, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j2, this.f8294h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j2, false, this.f8294h, treeMap);
        o(j2, map, map2, this.f8294h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) c.f.a.b.j3.g.e(map2.get(pair.first));
                arrayList2.add(new c.b().f(bitmapDecodeByteArray).k(eVar.f8301b).l(0).h(eVar.f8302c, 0).i(eVar.f8304e).n(eVar.f8305f).g(eVar.f8306g).r(eVar.f8309j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) c.f.a.b.j3.g.e(map2.get(entry.getKey()));
            c.b bVar = (c.b) entry.getValue();
            e((SpannableStringBuilder) c.f.a.b.j3.g.e(bVar.e()));
            bVar.h(eVar2.f8302c, eVar2.f8303d);
            bVar.i(eVar2.f8304e);
            bVar.k(eVar2.f8301b);
            bVar.n(eVar2.f8305f);
            bVar.q(eVar2.f8308i, eVar2.f8307h);
            bVar.r(eVar2.f8309j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f8287a);
        boolean zEquals2 = "div".equals(this.f8287a);
        if (z || zEquals || (zEquals2 && this.f8295i != null)) {
            long j2 = this.f8290d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f8291e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f8299m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f8299m.size(); i2++) {
            this.f8299m.get(i2).i(treeSet, z || zEquals);
        }
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f8293g;
    }

    public boolean m(long j2) {
        long j3 = this.f8290d;
        return (j3 == -9223372036854775807L && this.f8291e == -9223372036854775807L) || (j3 <= j2 && this.f8291e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.f8291e) || (j3 <= j2 && j2 < this.f8291e));
    }

    public final void n(long j2, String str, List<Pair<String, String>> list) {
        if (!BuildConfig.FLAVOR.equals(this.f8294h)) {
            str = this.f8294h;
        }
        if (m(j2) && "div".equals(this.f8287a) && this.f8295i != null) {
            list.add(new Pair<>(str, this.f8295i));
            return;
        }
        for (int i2 = 0; i2 < g(); i2++) {
            f(i2).n(j2, str, list);
        }
    }

    public final void o(long j2, Map<String, g> map, Map<String, e> map2, String str, Map<String, c.b> map3) {
        int i2;
        if (m(j2)) {
            String str2 = BuildConfig.FLAVOR.equals(this.f8294h) ? str : this.f8294h;
            Iterator<Map.Entry<String, Integer>> it = this.f8298l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f8297k.containsKey(key) ? this.f8297k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (c.b) c.f.a.b.j3.g.e(map3.get(key)), iIntValue, iIntValue2, ((e) c.f.a.b.j3.g.e(map2.get(str2))).f8309j);
                }
            }
            for (i2 = 0; i2 < g(); i2++) {
                f(i2).o(j2, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j2, boolean z, String str, Map<String, c.b> map) {
        this.f8297k.clear();
        this.f8298l.clear();
        if ("metadata".equals(this.f8287a)) {
            return;
        }
        if (!BuildConfig.FLAVOR.equals(this.f8294h)) {
            str = this.f8294h;
        }
        if (this.f8289c && z) {
            k(str, map).append((CharSequence) c.f.a.b.j3.g.e(this.f8288b));
            return;
        }
        if ("br".equals(this.f8287a) && z) {
            k(str, map).append('\n');
            return;
        }
        if (m(j2)) {
            for (Map.Entry<String, c.b> entry : map.entrySet()) {
                this.f8297k.put(entry.getKey(), Integer.valueOf(((CharSequence) c.f.a.b.j3.g.e(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f8287a);
            for (int i2 = 0; i2 < g(); i2++) {
                f(i2).p(j2, z || zEquals, str, map);
            }
            if (zEquals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, c.b> entry2 : map.entrySet()) {
                this.f8298l.put(entry2.getKey(), Integer.valueOf(((CharSequence) c.f.a.b.j3.g.e(entry2.getValue().e())).length()));
            }
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class agz extends ahg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final agz f19668a = new agz(BuildConfig.FLAVOR, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Uri> f19669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<agy> f19670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<agx> f19671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<agx> f19672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ke f19673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<ke> f19674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<String, String> f19675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<qg> f19676i;

    public agz(String str, List<String> list, List<agy> list2, List<agx> list3, List<agx> list4, List<agx> list5, List<agx> list6, ke keVar, List<ke> list7, boolean z, Map<String, String> map, List<qg> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Uri uri = list2.get(i2).f19662a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        d(list3, arrayList);
        d(list4, arrayList);
        d(list5, arrayList);
        d(list6, arrayList);
        this.f19669b = Collections.unmodifiableList(arrayList);
        this.f19670c = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f19671d = Collections.unmodifiableList(list4);
        this.f19672e = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f19673f = keVar;
        this.f19674g = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f19675h = Collections.unmodifiableMap(map);
        this.f19676i = Collections.unmodifiableList(list8);
    }

    public static agz b(String str) {
        Uri uri = Uri.parse(str);
        kd kdVar = new kd();
        kdVar.S("0");
        kdVar.K("application/x-mpegURL");
        return new agz(BuildConfig.FLAVOR, Collections.emptyList(), Collections.singletonList(new agy(uri, kdVar.s(), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static <T> List<T> c(List<T> list, int i2, List<aab> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            T t = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 < list2.size()) {
                    aab aabVar = list2.get(i4);
                    if (aabVar.f18955b == i2 && aabVar.f18956c == i3) {
                        arrayList.add(t);
                        break;
                    }
                    i4++;
                }
            }
        }
        return arrayList;
    }

    private static void d(List<agx> list, List<Uri> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).f19659a;
            if (!list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zy
    public final /* bridge */ /* synthetic */ ahg a(List list) {
        return new agz(this.s, this.t, c(this.f19670c, 0, list), Collections.emptyList(), c(this.f19671d, 1, list), c(this.f19672e, 2, list), Collections.emptyList(), this.f19673f, this.f19674g, this.u, this.f19675h, this.f19676i);
    }
}

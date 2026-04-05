package c.f.a.b.e3.f1.x;

import android.net.Uri;
import c.f.a.b.c3.i0;
import c.f.a.b.k1;
import c.f.a.b.x2.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f7394d = new f(BuildConfig.FLAVOR, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Uri> f7395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b> f7396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f7397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f7398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f7399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<a> f7400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k1 f7401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<k1> f7402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, String> f7403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<w> f7404n;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k1 f7406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7408d;

        public a(Uri uri, k1 k1Var, String str, String str2) {
            this.f7405a = uri;
            this.f7406b = k1Var;
            this.f7407c = str;
            this.f7408d = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k1 f7410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f7413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f7414f;

        public b(Uri uri, k1 k1Var, String str, String str2, String str3, String str4) {
            this.f7409a = uri;
            this.f7410b = k1Var;
            this.f7411c = str;
            this.f7412d = str2;
            this.f7413e = str3;
            this.f7414f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new k1.b().S("0").K("application/x-mpegURL").E(), null, null, null, null);
        }

        public b a(k1 k1Var) {
            return new b(this.f7409a, k1Var, this.f7411c, this.f7412d, this.f7413e, this.f7414f);
        }
    }

    public f(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, k1 k1Var, List<k1> list7, boolean z, Map<String, String> map, List<w> list8) {
        super(str, list, z);
        this.f7395e = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f7396f = Collections.unmodifiableList(list2);
        this.f7397g = Collections.unmodifiableList(list3);
        this.f7398h = Collections.unmodifiableList(list4);
        this.f7399i = Collections.unmodifiableList(list5);
        this.f7400j = Collections.unmodifiableList(list6);
        this.f7401k = k1Var;
        this.f7402l = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f7403m = Collections.unmodifiableMap(map);
        this.f7404n = Collections.unmodifiableList(list8);
    }

    public static void b(List<a> list, List<Uri> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).f7405a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> d(List<T> list, int i2, List<i0> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            T t = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 < list2.size()) {
                    i0 i0Var = list2.get(i4);
                    if (i0Var.f6747c == i2 && i0Var.f6748d == i3) {
                        arrayList.add(t);
                        break;
                    }
                    i4++;
                }
            }
        }
        return arrayList;
    }

    public static f e(String str) {
        return new f(BuildConfig.FLAVOR, Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    public static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).f7409a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // c.f.a.b.c3.e0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f a(List<i0> list) {
        return new f(this.f7450a, this.f7451b, d(this.f7396f, 0, list), Collections.emptyList(), d(this.f7398h, 1, list), d(this.f7399i, 2, list), Collections.emptyList(), this.f7401k, this.f7402l, this.f7452c, this.f7403m, this.f7404n);
    }
}

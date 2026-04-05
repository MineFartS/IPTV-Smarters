package c.d.a.n.i.n;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f5618a = {Bitmap.Config.ARGB_8888, null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config[] f5619b = {Bitmap.Config.RGB_565};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Bitmap.Config[] f5620c = {Bitmap.Config.ARGB_4444};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f5621d = {Bitmap.Config.ALPHA_8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f5622e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e<b, Bitmap> f5623f = new e<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f5624g = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5625a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f5625a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5625a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5625a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5625a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f5626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f5628c;

        public b(c cVar) {
            this.f5626a = cVar;
        }

        @Override // c.d.a.n.i.n.h
        public void a() {
            this.f5626a.c(this);
        }

        public void c(int i2, Bitmap.Config config) {
            this.f5627b = i2;
            this.f5628c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f5627b != bVar.f5627b) {
                return false;
            }
            Bitmap.Config config = this.f5628c;
            Bitmap.Config config2 = bVar.f5628c;
            if (config == null) {
                if (config2 != null) {
                    return false;
                }
            } else if (!config.equals(config2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i2 = this.f5627b * 31;
            Bitmap.Config config = this.f5628c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return i.i(this.f5627b, this.f5628c);
        }
    }

    public static class c extends c.d.a.n.i.n.b<b> {
        @Override // c.d.a.n.i.n.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i2, Bitmap.Config config) {
            b bVarB = b();
            bVarB.c(i2, config);
            return bVarB;
        }
    }

    public static String i(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    public static Bitmap.Config[] j(Bitmap.Config config) {
        int i2 = a.f5625a[config.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new Bitmap.Config[]{config} : f5621d : f5620c : f5619b : f5618a;
    }

    @Override // c.d.a.n.i.n.g
    public void a(Bitmap bitmap) {
        b bVarE = this.f5622e.e(c.d.a.t.h.e(bitmap), bitmap.getConfig());
        this.f5623f.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapK = k(bitmap.getConfig());
        Integer num = (Integer) navigableMapK.get(Integer.valueOf(bVarE.f5627b));
        navigableMapK.put(Integer.valueOf(bVarE.f5627b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // c.d.a.n.i.n.g
    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        int iD = c.d.a.t.h.d(i2, i3, config);
        Bitmap bitmapA = this.f5623f.a(h(this.f5622e.e(iD, config), iD, config));
        if (bitmapA != null) {
            g(Integer.valueOf(c.d.a.t.h.e(bitmapA)), bitmapA.getConfig());
            bitmapA.reconfigure(i2, i3, bitmapA.getConfig() != null ? bitmapA.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return bitmapA;
    }

    @Override // c.d.a.n.i.n.g
    public String c(int i2, int i3, Bitmap.Config config) {
        return i(c.d.a.t.h.d(i2, i3, config), config);
    }

    @Override // c.d.a.n.i.n.g
    public int d(Bitmap bitmap) {
        return c.d.a.t.h.e(bitmap);
    }

    @Override // c.d.a.n.i.n.g
    public String e(Bitmap bitmap) {
        return i(c.d.a.t.h.e(bitmap), bitmap.getConfig());
    }

    public final void g(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMapK = k(config);
        Integer num2 = (Integer) navigableMapK.get(num);
        if (num2.intValue() == 1) {
            navigableMapK.remove(num);
        } else {
            navigableMapK.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final b h(b bVar, int i2, Bitmap.Config config) {
        for (Bitmap.Config config2 : j(config)) {
            Integer numCeilingKey = k(config2).ceilingKey(Integer.valueOf(i2));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i2 * 8) {
                if (numCeilingKey.intValue() == i2) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVar;
                        }
                    } else if (config2.equals(config)) {
                        return bVar;
                    }
                }
                this.f5622e.c(bVar);
                return this.f5622e.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVar;
    }

    public final NavigableMap<Integer, Integer> k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f5624g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f5624g.put(config, treeMap);
        return treeMap;
    }

    @Override // c.d.a.n.i.n.g
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f5623f.f();
        if (bitmapF != null) {
            g(Integer.valueOf(c.d.a.t.h.e(bitmapF)), bitmapF.getConfig());
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f5623f);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f5624g.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f5624g.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), BuildConfig.FLAVOR);
        }
        sb.append(")}");
        return sb.toString();
    }
}

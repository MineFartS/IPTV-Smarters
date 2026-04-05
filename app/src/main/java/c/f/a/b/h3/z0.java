package c.f.a.b.h3;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import c.f.a.b.h3.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8818a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f8820b;

        public b(String str, Map<String, String> map) {
            this.f8819a = str;
            this.f8820b = map;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Comparator<c> f8821a = new Comparator() { // from class: c.f.a.b.h3.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z0.c.c((z0.c) obj, (z0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Comparator<c> f8822b = new Comparator() { // from class: c.f.a.b.h3.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z0.c.d((z0.c) obj, (z0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f8825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f8826f;

        public c(int i2, int i3, String str, String str2) {
            this.f8823c = i2;
            this.f8824d = i3;
            this.f8825e = str;
            this.f8826f = str2;
        }

        public static /* synthetic */ int c(c cVar, c cVar2) {
            int iA = c.f.a.b.e3.e1.e.a(cVar2.f8824d, cVar.f8824d);
            if (iA != 0) {
                return iA;
            }
            int iCompareTo = cVar.f8825e.compareTo(cVar2.f8825e);
            return iCompareTo != 0 ? iCompareTo : cVar.f8826f.compareTo(cVar2.f8826f);
        }

        public static /* synthetic */ int d(c cVar, c cVar2) {
            int iA = c.f.a.b.e3.e1.e.a(cVar2.f8823c, cVar.f8823c);
            if (iA != 0) {
                return iA;
            }
            int iCompareTo = cVar2.f8825e.compareTo(cVar.f8825e);
            return iCompareTo != 0 ? iCompareTo : cVar2.f8826f.compareTo(cVar.f8826f);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c> f8827a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c> f8828b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f2) {
        if (charSequence == null) {
            return new b(BuildConfig.FLAVOR, c.f.b.b.v.k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), c.f.b.b.v.k());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(l0.a("bg_" + iIntValue), c.f.a.b.j3.x0.D("background-color:%s;", l0.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f2);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i3 = 0;
        while (i2 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i2);
            sb.append(b(spanned.subSequence(i3, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f8828b, c.f8822b);
            Iterator it2 = dVar.f8828b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).f8826f);
            }
            Collections.sort(dVar.f8827a, c.f8821a);
            Iterator it3 = dVar.f8827a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).f8825e);
            }
            i2++;
            i3 = iKeyAt;
        }
        sb.append(b(spanned.subSequence(i3, spanned.length())));
        return new b(sb.toString(), map);
    }

    public static String b(CharSequence charSequence) {
        return f8818a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static SparseArray<d> c(Spanned spanned, float f2) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f2);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                c.f.a.b.j3.g.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f8827a.add(cVar);
                f(sparseArray, spanEnd).f8828b.add(cVar);
            }
        }
        return sparseArray;
    }

    public static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof c.f.a.b.f3.q.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof c.f.a.b.f3.q.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof c.f.a.b.f3.q.c) {
                return "<rt>" + b(((c.f.a.b.f3.q.c) obj).f8232a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    public static String e(Object obj, float f2) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return c.f.a.b.j3.x0.D("<span style='color:%s;'>", l0.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return c.f.a.b.j3.x0.D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof c.f.a.b.f3.q.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            boolean dip = absoluteSizeSpan.getDip();
            float size = absoluteSizeSpan.getSize();
            if (!dip) {
                size /= f2;
            }
            return c.f.a.b.j3.x0.D("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return c.f.a.b.j3.x0.D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return c.f.a.b.j3.x0.D("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof c.f.a.b.f3.q.c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof c.f.a.b.f3.q.e)) {
                return null;
            }
            c.f.a.b.f3.q.e eVar = (c.f.a.b.f3.q.e) obj;
            return c.f.a.b.j3.x0.D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f8234a, eVar.f8235b), g(eVar.f8236c));
        }
        int i2 = ((c.f.a.b.f3.q.c) obj).f8233b;
        if (i2 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i2 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i2 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    public static d f(SparseArray<d> sparseArray, int i2) {
        d dVar = sparseArray.get(i2);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i2, dVar2);
        return dVar2;
    }

    public static String g(int i2) {
        return i2 != 2 ? "over right" : "under left";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String h(int r3, int r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto Lf
            if (r4 == r1) goto Lc
            goto L14
        Lc:
            java.lang.String r4 = "open "
            goto L11
        Lf:
            java.lang.String r4 = "filled "
        L11:
            r0.append(r4)
        L14:
            if (r3 == 0) goto L29
            if (r3 == r2) goto L26
            if (r3 == r1) goto L23
            r4 = 3
            if (r3 == r4) goto L20
            java.lang.String r3 = "unset"
            goto L2b
        L20:
            java.lang.String r3 = "sesame"
            goto L2b
        L23:
            java.lang.String r3 = "dot"
            goto L2b
        L26:
            java.lang.String r3 = "circle"
            goto L2b
        L29:
            java.lang.String r3 = "none"
        L2b:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.z0.h(int, int):java.lang.String");
    }
}

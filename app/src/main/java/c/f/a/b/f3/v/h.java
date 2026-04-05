package c.f.a.b.f3.v;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import c.f.a.b.f3.c;
import c.f.a.b.f3.v.h;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8359a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8360b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f8361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f8362d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Comparator<b> f8363a = new Comparator() { // from class: c.f.a.b.f3.v.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.f.a.b.e3.e1.e.a(((h.b) obj).f8364b.f8367b, ((h.b) obj2).f8364b.f8367b);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f8364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8365c;

        public b(c cVar, int i2) {
            this.f8364b = cVar;
            this.f8365c = i2;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f8369d;

        public c(String str, int i2, String str2, Set<String> set) {
            this.f8367b = i2;
            this.f8366a = str;
            this.f8368c = str2;
            this.f8369d = set;
        }

        public static c a(String str, int i2) {
            String str2;
            String strTrim = str.trim();
            c.f.a.b.j3.g.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = BuildConfig.FLAVOR;
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrU0 = x0.U0(strTrim, "\\.");
            String str3 = strArrU0[0];
            HashSet hashSet = new HashSet();
            for (int i3 = 1; i3 < strArrU0.length; i3++) {
                hashSet.add(strArrU0[i3]);
            }
            return new c(str3, i2, str2, hashSet);
        }

        public static c b() {
            return new c(BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, Collections.emptySet());
        }
    }

    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f8371c;

        public d(int i2, f fVar) {
            this.f8370b = i2;
            this.f8371c = fVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return c.f.a.b.e3.e1.e.a(this.f8370b, dVar.f8370b);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f8374c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8372a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f8373b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8375d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8376e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8377f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8378g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8379h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8380i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f8381j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8382k = Integer.MIN_VALUE;

        public static float b(float f2, int i2) {
            if (f2 == -3.4028235E38f || i2 != 0 || (f2 >= 0.0f && f2 <= 1.0f)) {
                return f2 != -3.4028235E38f ? f2 : i2 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment c(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            z.i("WebvttCueParser", "Unknown textAlignment: " + i2);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i2, float f2) {
            if (i2 == 0) {
                return 1.0f - f2;
            }
            if (i2 == 1) {
                return f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
            }
            if (i2 == 2) {
                return f2;
            }
            throw new IllegalStateException(String.valueOf(i2));
        }

        public static float e(int i2) {
            if (i2 != 4) {
                return i2 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        public g a() {
            return new g(g().a(), this.f8372a, this.f8373b);
        }

        public c.b g() {
            float fE = this.f8379h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f8375d);
            }
            int iF = this.f8380i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f8375d);
            }
            c.b bVarR = new c.b().p(c(this.f8375d)).h(b(this.f8376e, this.f8377f), this.f8377f).i(this.f8378g).k(fE).l(iF).n(Math.min(this.f8381j, d(iF, fE))).r(this.f8382k);
            CharSequence charSequence = this.f8374c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8361c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8362d = Collections.unmodifiableMap(map2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i2, int i3) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = f8361c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = f8362d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i2, i3, 33);
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        char c2;
        str.hashCode();
        switch (str) {
            case "gt":
                c2 = '>';
                break;
            case "lt":
                c2 = '<';
                break;
            case "amp":
                c2 = '&';
                break;
            case "nbsp":
                c2 = ' ';
                break;
            default:
                z.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c2);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<f> list2) {
        int i2 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f8363a);
        int i3 = cVar.f8367b;
        int length = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(((b) arrayList.get(i4)).f8364b.f8366a)) {
                b bVar = (b) arrayList.get(i4);
                int iG = g(i(list2, str, bVar.f8364b), i2, 1);
                int i5 = bVar.f8364b.f8367b - length;
                int i6 = bVar.f8365c - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                spannableStringBuilder.delete(i5, i6);
                spannableStringBuilder.setSpan(new c.f.a.b.f3.q.c(charSequenceSubSequence.toString(), iG), i3, i5, 33);
                length += charSequenceSubSequence.length();
                i3 = i5;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d A[LOOP:0: B:47:0x0097->B:49:0x009d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.String r8, c.f.a.b.f3.v.h.c r9, java.util.List<c.f.a.b.f3.v.h.b> r10, android.text.SpannableStringBuilder r11, java.util.List<c.f.a.b.f3.v.f> r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.v.h.d(java.lang.String, c.f.a.b.f3.v.h$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.text.SpannableStringBuilder r4, c.f.a.b.f3.v.f r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.i()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.i()
            r0.<init>(r1)
            c.f.a.b.f3.q.d.a(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.l()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.m()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.k()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.c()
            r0.<init>(r1)
            c.f.a.b.f3.q.d.a(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.j()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.a()
            r0.<init>(r1)
            c.f.a.b.f3.q.d.a(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.d()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.d()
            r0.<init>(r1)
            c.f.a.b.f3.q.d.a(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.f()
            r1 = 1
            if (r0 == r1) goto L8f
            r1 = 2
            if (r0 == r1) goto L85
            r1 = 3
            if (r0 == r1) goto L78
            goto L9c
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            goto L99
        L85:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r0.<init>(r1)
            goto L99
        L8f:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.e()
            int r3 = (int) r3
            r0.<init>(r3, r1)
        L99:
            c.f.a.b.f3.q.d.a(r4, r0, r6, r7, r2)
        L9c:
            boolean r5 = r5.b()
            if (r5 == 0) goto Laa
            c.f.a.b.f3.q.a r5 = new c.f.a.b.f3.q.a
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.v.h.e(android.text.SpannableStringBuilder, c.f.a.b.f3.v.f, int, int):void");
    }

    public static int f(String str, int i2) {
        int iIndexOf = str.indexOf(62, i2);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static int g(int i2, int i3, int i4) {
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        if (i4 != -1) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    public static List<d> h(List<f> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            f fVar = list.get(i2);
            int iH = fVar.h(str, cVar.f8366a, cVar.f8369d, cVar.f8368c);
            if (iH > 0) {
                arrayList.add(new d(iH, fVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int i(List<f> list, String str, c cVar) {
        List<d> listH = h(list, str, cVar);
        for (int i2 = 0; i2 < listH.size(); i2++) {
            f fVar = listH.get(i2).f8371c;
            if (fVar.g() != -1) {
                return fVar.g();
            }
        }
        return -1;
    }

    public static String j(String str) {
        String strTrim = str.trim();
        c.f.a.b.j3.g.a(!strTrim.isEmpty());
        return x0.V0(strTrim, "[ \\.]")[0];
    }

    public static boolean k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static c.f.a.b.f3.c l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f8374c = charSequence;
        return eVar.g().a();
    }

    public static g m(i0 i0Var, List<f> list) {
        String strP = i0Var.p();
        if (strP == null) {
            return null;
        }
        Pattern pattern = f8359a;
        Matcher matcher = pattern.matcher(strP);
        if (matcher.matches()) {
            return n(null, matcher, i0Var, list);
        }
        String strP2 = i0Var.p();
        if (strP2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strP2);
        if (matcher2.matches()) {
            return n(strP.trim(), matcher2, i0Var, list);
        }
        return null;
    }

    public static g n(String str, Matcher matcher, i0 i0Var, List<f> list) {
        e eVar = new e();
        try {
            eVar.f8372a = j.d((String) c.f.a.b.j3.g.e(matcher.group(1)));
            eVar.f8373b = j.d((String) c.f.a.b.j3.g.e(matcher.group(2)));
            p((String) c.f.a.b.j3.g.e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String strP = i0Var.p();
                if (TextUtils.isEmpty(strP)) {
                    eVar.f8374c = q(str, sb.toString(), list);
                    return eVar.a();
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strP.trim());
            }
        } catch (NumberFormatException unused) {
            z.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static c.b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    public static void p(String str, e eVar) {
        Matcher matcher = f8360b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) c.f.a.b.j3.g.e(matcher.group(1));
            String str3 = (String) c.f.a.b.j3.g.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f8375d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f8381j = j.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f8382k = w(str3);
                } else {
                    z.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                z.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString q(String str, String str2, List<f> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i2, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i2++;
            } else {
                int iF = i2 + 1;
                if (iF < str2.length()) {
                    boolean z = str2.charAt(iF) == '/';
                    iF = f(str2, iF);
                    int i3 = iF - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i2 + (z ? 2 : 1);
                    if (!z2) {
                        i3 = iF - 1;
                    }
                    String strSubstring = str2.substring(i4, i3);
                    if (!strSubstring.trim().isEmpty()) {
                        String strJ = j(strSubstring);
                        if (k(strJ)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f8366a.equals(strJ)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i2 = iF;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                z.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void s(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f8378g = r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f8376e = j.c(str);
            eVar.f8377f = 0;
        } else {
            eVar.f8376e = Integer.parseInt(str);
            eVar.f8377f = 1;
        }
    }

    public static int t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                z.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void u(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f8380i = t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.f8379h = j.c(str);
    }

    public static int v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                z.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        z.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}

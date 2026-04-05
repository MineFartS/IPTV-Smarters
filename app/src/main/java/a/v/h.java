package a.v;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3549a = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f3550b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, c> f3551c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Pattern f3552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Pattern f3557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3558j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3561c;

        public h a() {
            return new h(this.f3559a, this.f3560b, this.f3561c);
        }

        public a b(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f3560b = str;
            return this;
        }

        public a c(String str) {
            this.f3561c = str;
            return this;
        }

        public a d(String str) {
            this.f3559a = str;
            return this;
        }
    }

    public static class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3563c;

        public b(String str) {
            String[] strArrSplit = str.split("/", -1);
            this.f3562b = strArrSplit[0];
            this.f3563c = strArrSplit[1];
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i2 = this.f3562b.equals(bVar.f3562b) ? 2 : 0;
            return this.f3563c.equals(bVar.f3563c) ? i2 + 1 : i2;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<String> f3565b = new ArrayList<>();

        public void a(String str) {
            this.f3565b.add(str);
        }

        public String b(int i2) {
            return this.f3565b.get(i2);
        }

        public String c() {
            return this.f3564a;
        }

        public void d(String str) {
            this.f3564a = str;
        }

        public int e() {
            return this.f3565b.size();
        }
    }

    public h(String str, String str2, String str3) {
        this.f3552d = null;
        this.f3553e = false;
        this.f3554f = false;
        this.f3557i = null;
        this.f3555g = str;
        this.f3556h = str2;
        this.f3558j = str3;
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.f3554f = uri.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f3549a.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (this.f3554f) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, patternCompile);
                }
                this.f3553e = false;
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    Matcher matcher2 = patternCompile.matcher(queryParameter);
                    c cVar = new c();
                    int iEnd = 0;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd, matcher2.start())));
                        sb2.append("(.+?)?");
                        iEnd = matcher2.end();
                    }
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    cVar.d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.f3551c.put(str4, cVar);
                }
            } else {
                this.f3553e = a(str, sb, patternCompile);
            }
            this.f3552d = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            b bVar = new b(str3);
            this.f3557i = Pattern.compile(("^(" + bVar.f3562b + "|[*]+)/(" + bVar.f3563c + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int iEnd = 0;
        while (matcher.find()) {
            this.f3550b.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            sb.append("(.+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    public String b() {
        return this.f3556h;
    }

    public Bundle c(Uri uri, Map<String, d> map) {
        Matcher matcher;
        Matcher matcher2 = this.f3552d.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f3550b.size();
        int i2 = 0;
        while (i2 < size) {
            String str = this.f3550b.get(i2);
            i2++;
            if (f(bundle, str, Uri.decode(matcher2.group(i2)), map.get(str))) {
                return null;
            }
        }
        if (this.f3554f) {
            for (String str2 : this.f3551c.keySet()) {
                c cVar = this.f3551c.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                for (int i3 = 0; i3 < cVar.e(); i3++) {
                    String strDecode = matcher != null ? Uri.decode(matcher.group(i3 + 1)) : null;
                    String strB = cVar.b(i3);
                    d dVar = map.get(strB);
                    if (strDecode != null && !strDecode.replaceAll("[{}]", BuildConfig.FLAVOR).equals(strB) && f(bundle, strB, strDecode, dVar)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }

    public int d(String str) {
        if (this.f3558j == null || !this.f3557i.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f3558j).compareTo(new b(str));
    }

    public boolean e() {
        return this.f3553e;
    }

    public final boolean f(Bundle bundle, String str, String str2, d dVar) {
        if (dVar == null) {
            bundle.putString(str, str2);
            return false;
        }
        try {
            dVar.a().g(bundle, str, str2);
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}

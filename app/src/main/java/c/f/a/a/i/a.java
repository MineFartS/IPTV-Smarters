package c.f.a.a.i;

import c.f.a.a.j.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f6012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f6013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f6014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<c.f.a.a.b> f6015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f6017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6019h;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f6012a = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f6013b = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6014c = strA3;
        f6015d = Collections.unmodifiableSet(new HashSet(Arrays.asList(c.f.a.a.b.b("proto"), c.f.a.a.b.b("json"))));
        f6016e = new a(strA, null);
        f6017f = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f6018g = str;
        this.f6019h = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // c.f.a.a.j.f
    public Set<c.f.a.a.b> a() {
        return f6015d;
    }

    public byte[] b() {
        String str = this.f6019h;
        if (str == null && this.f6018g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f6018g;
        objArr[2] = "\\";
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f6019h;
    }

    public String e() {
        return this.f6018g;
    }

    @Override // c.f.a.a.j.e
    public byte[] getExtras() {
        return b();
    }

    @Override // c.f.a.a.j.e
    public String getName() {
        return "cct";
    }
}

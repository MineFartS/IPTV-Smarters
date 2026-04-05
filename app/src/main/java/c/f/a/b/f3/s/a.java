package c.f.a.b.f3.s;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c.f.a.b.f3.c;
import c.f.a.b.f3.d;
import c.f.a.b.f3.f;
import c.f.a.b.j3.a0;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.z;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f8268o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder q;
    public final ArrayList<String> r;

    public a() {
        super("SubripDecoder");
        this.q = new StringBuilder();
        this.r = new ArrayList<>();
    }

    public static float C(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long D(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j2 = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) g.e(matcher.group(i2 + 2))) * 60 * 1000) + (Long.parseLong((String) g.e(matcher.group(i2 + 3))) * 1000);
        String strGroup2 = matcher.group(i2 + 4);
        if (strGroup2 != null) {
            j2 += Long.parseLong(strGroup2);
        }
        return j2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.b.f3.c B(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.s.a.B(android.text.Spanned, java.lang.String):c.f.a.b.f3.c");
    }

    public final String E(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = p.matcher(strTrim);
        int i2 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i2;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, BuildConfig.FLAVOR);
            i2 += length;
        }
        return sb.toString();
    }

    @Override // c.f.a.b.f3.d
    public f y(byte[] bArr, int i2, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0();
        i0 i0Var = new i0(bArr, i2);
        while (true) {
            String strP = i0Var.p();
            int i3 = 0;
            if (strP == null) {
                break;
            }
            if (strP.length() != 0) {
                try {
                    Integer.parseInt(strP);
                    strP = i0Var.p();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (strP == null) {
                    z.i("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f8268o.matcher(strP);
                if (matcher.matches()) {
                    a0Var.a(D(matcher, 1));
                    a0Var.a(D(matcher, 6));
                    this.q.setLength(0);
                    this.r.clear();
                    while (true) {
                        String strP2 = i0Var.p();
                        if (TextUtils.isEmpty(strP2)) {
                            break;
                        }
                        if (this.q.length() > 0) {
                            this.q.append("<br>");
                        }
                        this.q.append(E(strP2, this.r));
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.q.toString());
                    String str2 = null;
                    while (true) {
                        if (i3 >= this.r.size()) {
                            break;
                        }
                        String str3 = this.r.get(i3);
                        if (str3.matches("\\{\\\\an[1-9]\\}")) {
                            str2 = str3;
                            break;
                        }
                        i3++;
                    }
                    arrayList.add(B(spannedFromHtml, str2));
                    arrayList.add(c.f8063a);
                } else {
                    sb = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb.append(str);
                    sb.append(strP);
                    z.i("SubripDecoder", sb.toString());
                }
            }
        }
        return new b((c[]) arrayList.toArray(new c[0]), a0Var.d());
    }
}

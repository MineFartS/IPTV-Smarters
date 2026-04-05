package k;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f30919a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f30920b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f30921c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f30922d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f30927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f30928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f30929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f30930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f30931m;

    public l(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f30923e = str;
        this.f30924f = str2;
        this.f30925g = j2;
        this.f30926h = str3;
        this.f30927i = str4;
        this.f30928j = z;
        this.f30929k = z2;
        this.f30931m = z3;
        this.f30930l = z4;
    }

    public static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !k.g0.c.z(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[PHI: r0
  0x00c0: PHI (r0v15 long) = (r0v2 long), (r0v5 long) binds: [B:42:0x00be, B:53:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k.l d(long r23, k.t r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.l.d(long, k.t, java.lang.String):k.l");
    }

    @Nullable
    public static l e(t tVar, String str) {
        return d(System.currentTimeMillis(), tVar, str);
    }

    public static List<l> f(t tVar, s sVar) {
        List<String> listH = sVar.h("Set-Cookie");
        int size = listH.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            l lVarE = e(tVar, listH.get(i2));
            if (lVarE != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVarE);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public static String g(String str) {
        if (str.endsWith(InstructionFileId.DOT)) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(InstructionFileId.DOT)) {
            str = str.substring(1);
        }
        String strJ = k.g0.c.j(str);
        if (strJ != null) {
            return strJ;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long h(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.l.h(java.lang.String, int, int):long");
    }

    public static long i(String str) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 <= 0) {
                return Long.MIN_VALUE;
            }
            return j2;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    public String c() {
        return this.f30923e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f30923e.equals(this.f30923e) && lVar.f30924f.equals(this.f30924f) && lVar.f30926h.equals(this.f30926h) && lVar.f30927i.equals(this.f30927i) && lVar.f30925g == this.f30925g && lVar.f30928j == this.f30928j && lVar.f30929k == this.f30929k && lVar.f30930l == this.f30930l && lVar.f30931m == this.f30931m;
    }

    public int hashCode() {
        int iHashCode = (((((((527 + this.f30923e.hashCode()) * 31) + this.f30924f.hashCode()) * 31) + this.f30926h.hashCode()) * 31) + this.f30927i.hashCode()) * 31;
        long j2 = this.f30925g;
        return ((((((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f30928j ? 1 : 0)) * 31) + (!this.f30929k ? 1 : 0)) * 31) + (!this.f30930l ? 1 : 0)) * 31) + (!this.f30931m ? 1 : 0);
    }

    public String j(boolean z) {
        String strA;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30923e);
        sb.append('=');
        sb.append(this.f30924f);
        if (this.f30930l) {
            if (this.f30925g == Long.MIN_VALUE) {
                strA = "; max-age=0";
            } else {
                sb.append("; expires=");
                strA = k.g0.g.d.a(new Date(this.f30925g));
            }
            sb.append(strA);
        }
        if (!this.f30931m) {
            sb.append("; domain=");
            if (z) {
                sb.append(InstructionFileId.DOT);
            }
            sb.append(this.f30926h);
        }
        sb.append("; path=");
        sb.append(this.f30927i);
        if (this.f30928j) {
            sb.append("; secure");
        }
        if (this.f30929k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String k() {
        return this.f30924f;
    }

    public String toString() {
        return j(false);
    }
}

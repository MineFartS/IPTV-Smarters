package c.f.a.b.f3.r;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f8245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8250h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8257g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8258h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f8259i;

        public a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f8251a = i2;
            this.f8252b = i3;
            this.f8253c = i4;
            this.f8254d = i5;
            this.f8255e = i6;
            this.f8256f = i7;
            this.f8257g = i8;
            this.f8258h = i9;
            this.f8259i = i10;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static c.f.a.b.f3.r.c.a a(java.lang.String r14) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.r.c.a.a(java.lang.String):c.f.a.b.f3.r.c$a");
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f8260a = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pattern f8261b = Pattern.compile(x0.D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f8262c = Pattern.compile(x0.D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f8263d = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final PointF f8265f;

        public b(int i2, PointF pointF) {
            this.f8264e = i2;
            this.f8265f = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f8263d.matcher(str);
            if (matcher.find()) {
                return c.d((String) g.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f8260a.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String str2 = (String) g.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i2 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i2, pointF);
        }

        public static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f8261b.matcher(str);
            Matcher matcher2 = f8262c.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    z.g("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) g.e(strGroup)).trim()), Float.parseFloat(((String) g.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f8260a.matcher(str).replaceAll(BuildConfig.FLAVOR);
        }
    }

    public c(String str, int i2, Integer num, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f8243a = str;
        this.f8244b = i2;
        this.f8245c = num;
        this.f8246d = f2;
        this.f8247e = z;
        this.f8248f = z2;
        this.f8249g = z3;
        this.f8250h = z4;
    }

    public static c b(String str, a aVar) {
        g.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = aVar.f8259i;
        if (length != i2) {
            z.i("SsaStyle", x0.D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f8251a].trim();
            int i3 = aVar.f8252b;
            int iD = i3 != -1 ? d(strArrSplit[i3].trim()) : -1;
            int i4 = aVar.f8253c;
            Integer numF = i4 != -1 ? f(strArrSplit[i4].trim()) : null;
            int i5 = aVar.f8254d;
            float fG = i5 != -1 ? g(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = aVar.f8255e;
            boolean z = i6 != -1 && e(strArrSplit[i6].trim());
            int i7 = aVar.f8256f;
            boolean z2 = i7 != -1 && e(strArrSplit[i7].trim());
            int i8 = aVar.f8257g;
            boolean z3 = i8 != -1 && e(strArrSplit[i8].trim());
            int i9 = aVar.f8258h;
            return new c(strTrim, iD, numF, fG, z, z2, z3, i9 != -1 && e(strArrSplit[i9].trim()));
        } catch (RuntimeException e2) {
            z.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    public static boolean c(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static int d(String str) {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (c(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        z.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean e(String str) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e2) {
            z.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    public static Integer f(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            g.a(j2 <= 4294967295L);
            return Integer.valueOf(Color.argb(c.f.b.f.c.c(((j2 >> 24) & 255) ^ 255), c.f.b.f.c.c(j2 & 255), c.f.b.f.c.c((j2 >> 8) & 255), c.f.b.f.c.c((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            z.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }

    public static float g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            z.j("SsaStyle", "Failed to parse font size: '" + str + "'", e2);
            return -3.4028235E38f;
        }
    }
}

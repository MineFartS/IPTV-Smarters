package a.i.n;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale[] f1851a = new Locale[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale f1852b = new Locale("en", "XA");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale f1853c = new Locale("ar", "XB");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Locale f1854d = d.b("en-Latn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Locale[] f1855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1856f;

    public e(Locale... localeArr) {
        String string;
        if (localeArr.length == 0) {
            this.f1855e = f1851a;
            string = BuildConfig.FLAVOR;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < localeArr.length; i2++) {
                Locale locale = localeArr[i2];
                if (locale == null) {
                    throw new NullPointerException("list[" + i2 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb, locale2);
                    if (i2 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f1855e = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            string = sb.toString();
        }
        this.f1856f = string;
    }

    public static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // a.i.n.f
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        Locale[] localeArr = ((e) obj).f1855e;
        if (this.f1855e.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.f1855e;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // a.i.n.f
    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.f1855e;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f1855e;
            if (i2 >= localeArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f1855e;
            if (i2 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i2]);
            if (i2 < this.f1855e.length - 1) {
                sb.append(',');
            }
            i2++;
        }
    }
}

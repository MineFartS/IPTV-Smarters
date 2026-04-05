package a.i.n;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1849a = a(new Locale[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f1850b;

    public d(f fVar) {
        this.f1850b = fVar;
    }

    public static d a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(new LocaleList(localeArr)) : new d(new e(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static d d(LocaleList localeList) {
        return new d(new g(localeList));
    }

    public Locale c(int i2) {
        return this.f1850b.get(i2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && this.f1850b.equals(((d) obj).f1850b);
    }

    public int hashCode() {
        return this.f1850b.hashCode();
    }

    public String toString() {
        return this.f1850b.toString();
    }
}

package c.k.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f18253a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f18254a = new ArrayList(20);

        public b b(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                return c(str, str2);
            }
            throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
        }

        public final b c(String str, String str2) {
            this.f18254a.add(str);
            this.f18254a.add(str2.trim());
            return this;
        }

        public b d(String str) {
            int iIndexOf = str.indexOf(":", 1);
            return iIndexOf != -1 ? c(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(":") ? c(BuildConfig.FLAVOR, str.substring(1)) : c(BuildConfig.FLAVOR, str);
        }

        public o e() {
            return new o(this);
        }

        public b f(String str) {
            int i2 = 0;
            while (i2 < this.f18254a.size()) {
                if (str.equalsIgnoreCase(this.f18254a.get(i2))) {
                    this.f18254a.remove(i2);
                    this.f18254a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public b g(String str, String str2) {
            f(str);
            b(str, str2);
            return this;
        }
    }

    public o(b bVar) {
        this.f18253a = (String[]) bVar.f18254a.toArray(new String[bVar.f18254a.size()]);
    }

    public static String b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String a(String str) {
        return b(this.f18253a, str);
    }

    public Date c(String str) {
        String strA = a(str);
        if (strA != null) {
            return c.k.a.y.j.f.b(strA);
        }
        return null;
    }

    public String d(int i2) {
        int i3 = i2 * 2;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f18253a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public b e() {
        b bVar = new b();
        bVar.f18254a.addAll(Arrays.asList(this.f18253a));
        return bVar;
    }

    public int f() {
        return this.f18253a.length / 2;
    }

    public String g(int i2) {
        int i3 = (i2 * 2) + 1;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f18253a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public List<String> h(String str) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < f(); i2++) {
            if (str.equalsIgnoreCase(d(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(g(i2));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < f(); i2++) {
            sb.append(d(i2));
            sb.append(": ");
            sb.append(g(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}

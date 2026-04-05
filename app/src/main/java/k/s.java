package k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f30952a;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f30953a = new ArrayList(20);

        public a a(String str, String str2) {
            e(str, str2);
            return c(str, str2);
        }

        public a b(String str) {
            int iIndexOf = str.indexOf(":", 1);
            return iIndexOf != -1 ? c(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(":") ? c(BuildConfig.FLAVOR, str.substring(1)) : c(BuildConfig.FLAVOR, str);
        }

        public a c(String str, String str2) {
            this.f30953a.add(str);
            this.f30953a.add(str2.trim());
            return this;
        }

        public s d() {
            return new s(this);
        }

        public final void e(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt <= ' ' || cCharAt >= 127) {
                    throw new IllegalArgumentException(k.g0.c.l("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 == null) {
                throw new NullPointerException("value for name " + str + " == null");
            }
            int length2 = str2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char cCharAt2 = str2.charAt(i3);
                if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(k.g0.c.l("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str, str2));
                }
            }
        }

        public a f(String str) {
            int i2 = 0;
            while (i2 < this.f30953a.size()) {
                if (str.equalsIgnoreCase(this.f30953a.get(i2))) {
                    this.f30953a.remove(i2);
                    this.f30953a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public a g(String str, String str2) {
            e(str, str2);
            f(str);
            c(str, str2);
            return this;
        }
    }

    public s(a aVar) {
        List<String> list = aVar.f30953a;
        this.f30952a = (String[]) list.toArray(new String[list.size()]);
    }

    public s(String[] strArr) {
        this.f30952a = strArr;
    }

    public static String b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static s e(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            if (strArr2[i2] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = strArr2[i2].trim();
        }
        for (int i3 = 0; i3 < strArr2.length; i3 += 2) {
            String str = strArr2[i3];
            String str2 = strArr2[i3 + 1];
            if (str.length() == 0 || str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
                throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
            }
        }
        return new s(strArr2);
    }

    @Nullable
    public String a(String str) {
        return b(this.f30952a, str);
    }

    public String c(int i2) {
        return this.f30952a[i2 * 2];
    }

    public a d() {
        a aVar = new a();
        Collections.addAll(aVar.f30953a, this.f30952a);
        return aVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && Arrays.equals(((s) obj).f30952a, this.f30952a);
    }

    public int f() {
        return this.f30952a.length / 2;
    }

    public String g(int i2) {
        return this.f30952a[(i2 * 2) + 1];
    }

    public List<String> h(String str) {
        int iF = f();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < iF; i2++) {
            if (str.equalsIgnoreCase(c(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(g(i2));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f30952a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iF = f();
        for (int i2 = 0; i2 < iF; i2++) {
            sb.append(c(i2));
            sb.append(": ");
            sb.append(g(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}

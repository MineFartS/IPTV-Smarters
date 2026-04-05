package c.f.a.b.f3.v;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8346f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8348h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f8355o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8341a = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8342b = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f8343c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8344d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8345e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8347g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8349i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8350j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8351k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8352l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8353m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8354n = -1;
    public int p = -1;
    public boolean q = false;

    public static int B(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public f A(boolean z) {
        this.f8351k = z ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f8349i) {
            return this.f8348h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.q;
    }

    public int c() {
        if (this.f8347g) {
            return this.f8346f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f8345e;
    }

    public float e() {
        return this.f8355o;
    }

    public int f() {
        return this.f8354n;
    }

    public int g() {
        return this.p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f8341a.isEmpty() && this.f8342b.isEmpty() && this.f8343c.isEmpty() && this.f8344d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f8341a, str, 1073741824), this.f8342b, str2, 2), this.f8344d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f8343c)) {
            return 0;
        }
        return iB + (this.f8343c.size() * 4);
    }

    public int i() {
        int i2 = this.f8352l;
        if (i2 == -1 && this.f8353m == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f8353m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f8349i;
    }

    public boolean k() {
        return this.f8347g;
    }

    public boolean l() {
        return this.f8350j == 1;
    }

    public boolean m() {
        return this.f8351k == 1;
    }

    public f n(int i2) {
        this.f8348h = i2;
        this.f8349i = true;
        return this;
    }

    public f o(boolean z) {
        this.f8352l = z ? 1 : 0;
        return this;
    }

    public f p(boolean z) {
        this.q = z;
        return this;
    }

    public f q(int i2) {
        this.f8346f = i2;
        this.f8347g = true;
        return this;
    }

    public f r(String str) {
        this.f8345e = str == null ? null : c.f.b.a.b.e(str);
        return this;
    }

    public f s(float f2) {
        this.f8355o = f2;
        return this;
    }

    public f t(int i2) {
        this.f8354n = i2;
        return this;
    }

    public f u(boolean z) {
        this.f8353m = z ? 1 : 0;
        return this;
    }

    public f v(int i2) {
        this.p = i2;
        return this;
    }

    public void w(String[] strArr) {
        this.f8343c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f8341a = str;
    }

    public void y(String str) {
        this.f8342b = str;
    }

    public void z(String str) {
        this.f8344d = str;
    }
}

package c.h.a.i;

import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p f17212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<e> f17213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<f> f17214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<f> f17215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<e> f17216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<f> f17217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17218g = BuildConfig.FLAVOR;

    public static p b() {
        if (f17212a == null) {
            f17212a = new p();
        }
        return f17212a;
    }

    public ArrayList<f> a() {
        return this.f17215d;
    }

    public ArrayList<e> c() {
        return this.f17216e;
    }

    public ArrayList<f> d() {
        return this.f17217f;
    }

    public String e() {
        return this.f17218g;
    }

    public ArrayList<e> f() {
        return this.f17213b;
    }

    public ArrayList<f> g() {
        return this.f17214c;
    }

    public void h(ArrayList<f> arrayList) {
        this.f17215d = arrayList;
    }

    public void i(ArrayList<e> arrayList) {
        this.f17216e = arrayList;
    }

    public void j(ArrayList<f> arrayList) {
        this.f17217f = arrayList;
    }

    public void k(String str) {
        this.f17218g = str;
    }

    public void l(ArrayList<e> arrayList) {
        this.f17213b = arrayList;
    }

    public void m(ArrayList<f> arrayList) {
        this.f17214c = arrayList;
    }
}

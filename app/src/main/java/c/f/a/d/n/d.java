package c.f.a.d.n;

import a.i.r.x;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15090f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15091g = true;

    public d(View view) {
        this.f15085a = view;
    }

    public void a() {
        View view = this.f15085a;
        x.a0(view, this.f15088d - (view.getTop() - this.f15086b));
        View view2 = this.f15085a;
        x.Z(view2, this.f15089e - (view2.getLeft() - this.f15087c));
    }

    public int b() {
        return this.f15088d;
    }

    public void c() {
        this.f15086b = this.f15085a.getTop();
        this.f15087c = this.f15085a.getLeft();
    }

    public boolean d(int i2) {
        if (!this.f15091g || this.f15089e == i2) {
            return false;
        }
        this.f15089e = i2;
        a();
        return true;
    }

    public boolean e(int i2) {
        if (!this.f15090f || this.f15088d == i2) {
            return false;
        }
        this.f15088d = i2;
        a();
        return true;
    }
}

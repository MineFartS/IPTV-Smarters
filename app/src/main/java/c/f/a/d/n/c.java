package c.f.a.d.n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f15082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15084c;

    public c() {
        this.f15083b = 0;
        this.f15084c = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15083b = 0;
        this.f15084c = 0;
    }

    public int E() {
        d dVar = this.f15082a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.J(v, i2);
    }

    public boolean G(int i2) {
        d dVar = this.f15082a;
        if (dVar != null) {
            return dVar.e(i2);
        }
        this.f15083b = i2;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        F(coordinatorLayout, v, i2);
        if (this.f15082a == null) {
            this.f15082a = new d(v);
        }
        this.f15082a.c();
        this.f15082a.a();
        int i3 = this.f15083b;
        if (i3 != 0) {
            this.f15082a.e(i3);
            this.f15083b = 0;
        }
        int i4 = this.f15084c;
        if (i4 == 0) {
            return true;
        }
        this.f15082a.d(i4);
        this.f15084c = 0;
        return true;
    }
}

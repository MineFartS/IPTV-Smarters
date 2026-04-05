package c.f.a.d.b0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14640b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14641c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f14639a = (View) aVar;
    }

    public final void a() {
        ViewParent parent = this.f14639a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f14639a);
        }
    }

    public int b() {
        return this.f14641c;
    }

    public boolean c() {
        return this.f14640b;
    }

    public void d(Bundle bundle) {
        this.f14640b = bundle.getBoolean("expanded", false);
        this.f14641c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f14640b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f14640b);
        bundle.putInt("expandedComponentIdHint", this.f14641c);
        return bundle;
    }

    public void f(int i2) {
        this.f14641c = i2;
    }
}

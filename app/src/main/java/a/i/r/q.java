package a.i.r;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2090b;

    public q(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2089a | this.f2090b;
    }

    public void b(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    public void c(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.f2090b = i2;
        } else {
            this.f2089a = i2;
        }
    }

    public void d(View view, int i2) {
        if (i2 == 1) {
            this.f2090b = 0;
        } else {
            this.f2089a = 0;
        }
    }
}

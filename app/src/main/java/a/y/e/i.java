package a.y.e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3946e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3950i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3942a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3947f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3948g = 0;

    public boolean a(RecyclerView.b0 b0Var) {
        int i2 = this.f3944c;
        return i2 >= 0 && i2 < b0Var.c();
    }

    public View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f3944c);
        this.f3944c += this.f3945d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3943b + ", mCurrentPosition=" + this.f3944c + ", mItemDirection=" + this.f3945d + ", mLayoutDirection=" + this.f3946e + ", mStartLine=" + this.f3947f + ", mEndLine=" + this.f3948g + '}';
    }
}

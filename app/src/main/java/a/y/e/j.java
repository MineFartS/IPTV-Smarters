package a.y.e;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public class j extends RecyclerView.a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f3953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3954l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3956n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f3951i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f3952j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3955m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3957o = 0;
    public int p = 0;

    public j(Context context) {
        this.f3954l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f3955m) {
            this.f3956n = v(this.f3954l);
            this.f3955m = true;
        }
        return this.f3956n;
    }

    public int B() {
        PointF pointF = this.f3953k;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void C(RecyclerView.a0.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f3953k = pointFA;
        this.f3957o = (int) (pointFA.x * 10000.0f);
        this.p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f3957o * 1.2f), (int) (this.p * 1.2f), (int) (x(Constants.MAXIMUM_UPLOAD_PARTS) * 1.2f), this.f3951i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void l(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f3957o = y(this.f3957o, i2);
        int iY = y(this.p, i3);
        this.p = iY;
        if (this.f3957o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void n() {
        this.p = 0;
        this.f3957o = 0;
        this.f3953k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f3952j);
        }
    }

    public int s(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    public int t(View view, int i2) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.l()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.S(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.V(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.g0(), pVarE.q0() - pVarE.h0(), i2);
    }

    public int u(View view, int i2) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.m()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.W(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.Q(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.i0(), pVarE.Y() - pVarE.f0(), i2);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i2) {
        double dX = x(i2);
        Double.isNaN(dX);
        return (int) Math.ceil(dX / 0.3356d);
    }

    public int x(int i2) {
        return (int) Math.ceil(Math.abs(i2) * A());
    }

    public final int y(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    public int z() {
        PointF pointF = this.f3953k;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}

package a.y.e;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class m extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f3962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f3963e;

    public class a extends j {
        public a(Context context) {
            super(context);
        }

        @Override // a.y.e.j, androidx.recyclerview.widget.RecyclerView.a0
        public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            m mVar = m.this;
            int[] iArrC = mVar.c(mVar.f3969a.getLayoutManager(), view);
            int i2 = iArrC[0];
            int i3 = iArrC[1];
            int iW = w(Math.max(Math.abs(i2), Math.abs(i3)));
            if (iW > 0) {
                aVar.d(i2, i3, iW, this.f3952j);
            }
        }

        @Override // a.y.e.j
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // a.y.e.j
        public int x(int i2) {
            return Math.min(100, super.x(i2));
        }
    }

    @Override // a.y.e.q
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.l()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.m()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // a.y.e.q
    public RecyclerView.a0 d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.f3969a.getContext());
        }
        return null;
    }

    @Override // a.y.e.q
    public View f(RecyclerView.p pVar) {
        l lVarM;
        if (pVar.m()) {
            lVarM = o(pVar);
        } else {
            if (!pVar.l()) {
                return null;
            }
            lVarM = m(pVar);
        }
        return l(pVar, lVarM);
    }

    @Override // a.y.e.q
    public int g(RecyclerView.p pVar, int i2, int i3) {
        l lVarN;
        int iA0 = pVar.a0();
        if (iA0 == 0 || (lVarN = n(pVar)) == null) {
            return -1;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int iL = pVar.L();
        View view = null;
        View view2 = null;
        for (int i6 = 0; i6 < iL; i6++) {
            View viewK = pVar.K(i6);
            if (viewK != null) {
                int iK = k(viewK, lVarN);
                if (iK <= 0 && iK > i4) {
                    view2 = viewK;
                    i4 = iK;
                }
                if (iK >= 0 && iK < i5) {
                    view = viewK;
                    i5 = iK;
                }
            }
        }
        boolean zP = p(pVar, i2, i3);
        if (zP && view != null) {
            return pVar.j0(view);
        }
        if (!zP && view2 != null) {
            return pVar.j0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iJ0 = pVar.j0(view) + (q(pVar) == zP ? -1 : 1);
        if (iJ0 < 0 || iJ0 >= iA0) {
            return -1;
        }
        return iJ0;
    }

    public final int k(View view, l lVar) {
        return (lVar.g(view) + (lVar.e(view) / 2)) - (lVar.m() + (lVar.n() / 2));
    }

    public final View l(RecyclerView.p pVar, l lVar) {
        int iL = pVar.L();
        View view = null;
        if (iL == 0) {
            return null;
        }
        int iM = lVar.m() + (lVar.n() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iL; i3++) {
            View viewK = pVar.K(i3);
            int iAbs = Math.abs((lVar.g(viewK) + (lVar.e(viewK) / 2)) - iM);
            if (iAbs < i2) {
                view = viewK;
                i2 = iAbs;
            }
        }
        return view;
    }

    public final l m(RecyclerView.p pVar) {
        l lVar = this.f3963e;
        if (lVar == null || lVar.f3959a != pVar) {
            this.f3963e = l.a(pVar);
        }
        return this.f3963e;
    }

    public final l n(RecyclerView.p pVar) {
        if (pVar.m()) {
            return o(pVar);
        }
        if (pVar.l()) {
            return m(pVar);
        }
        return null;
    }

    public final l o(RecyclerView.p pVar) {
        l lVar = this.f3962d;
        if (lVar == null || lVar.f3959a != pVar) {
            this.f3962d = l.c(pVar);
        }
        return this.f3962d;
    }

    public final boolean p(RecyclerView.p pVar, int i2, int i3) {
        return pVar.l() ? i2 > 0 : i3 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(RecyclerView.p pVar) {
        PointF pointFA;
        int iA0 = pVar.a0();
        if (!(pVar instanceof RecyclerView.a0.b) || (pointFA = ((RecyclerView.a0.b) pVar).a(iA0 - 1)) == null) {
            return false;
        }
        return pointFA.x < 0.0f || pointFA.y < 0.0f;
    }
}

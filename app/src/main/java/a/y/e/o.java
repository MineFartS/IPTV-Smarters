package a.y.e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class o {
    public static int a(RecyclerView.b0 b0Var, l lVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.L() == 0 || b0Var.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.j0(view) - pVar.j0(view2)) + 1;
        }
        return Math.min(lVar.n(), lVar.d(view2) - lVar.g(view));
    }

    public static int b(RecyclerView.b0 b0Var, l lVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        if (pVar.L() == 0 || b0Var.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (b0Var.c() - Math.max(pVar.j0(view), pVar.j0(view2))) - 1) : Math.max(0, Math.min(pVar.j0(view), pVar.j0(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(lVar.d(view2) - lVar.g(view)) / (Math.abs(pVar.j0(view) - pVar.j0(view2)) + 1))) + (lVar.m() - lVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.b0 b0Var, l lVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.L() == 0 || b0Var.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b0Var.c();
        }
        return (int) (((lVar.d(view2) - lVar.g(view)) / (Math.abs(pVar.j0(view) - pVar.j0(view2)) + 1)) * b0Var.c());
    }
}

package c.f.a.d.x;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class q extends LinearLayoutManager {

    public class a extends a.y.e.j {
        public a(Context context) {
            super(context);
        }

        @Override // a.y.e.j
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public q(Context context, int i2, boolean z) {
        super(context, i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i2);
        N1(aVar);
    }
}

package com.nst.iptvsmarterstvbox.miscelleneious;

import a.y.e.j;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class SpeedyGridLayoutManager extends GridLayoutManager {

    public class a extends j {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i2) {
            return super.a(i2);
        }

        @Override // a.y.e.j
        public float v(DisplayMetrics displayMetrics) {
            return 150.0f / displayMetrics.densityDpi;
        }
    }

    public SpeedyGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i2);
        N1(aVar);
    }
}

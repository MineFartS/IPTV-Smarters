package c.f.a.d.p0;

import a.g.c.d;
import a.i.r.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.a.d.f;
import c.f.a.d.h;
import c.f.a.d.j0.g;
import c.f.a.d.j0.i;
import c.f.a.d.l;

/* JADX INFO: loaded from: classes2.dex */
public class b extends ConstraintLayout {
    public g A;
    public final Runnable y;
    public int z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.x();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(h.f14834h, this);
        x.s0(this, t());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.T3, i2, 0);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.U3, 0);
        this.y = new a();
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean w(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(x.k());
        }
        y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        y();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.A.X(ColorStateList.valueOf(i2));
    }

    public final Drawable t() {
        g gVar = new g();
        this.A = gVar;
        gVar.V(new i(0.5f));
        this.A.X(ColorStateList.valueOf(-1));
        return this.A;
    }

    public int u() {
        return this.z;
    }

    public void v(int i2) {
        this.z = i2;
        x();
    }

    public void x() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (w(getChildAt(i3))) {
                i2++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            int i5 = f.f14783b;
            if (id != i5 && !w(childAt)) {
                dVar.i(childAt.getId(), i5, this.z, f2);
                f2 += 360.0f / (childCount - i2);
            }
        }
        dVar.c(this);
    }

    public final void y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.y);
            handler.post(this.y);
        }
    }
}

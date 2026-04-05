package a.b.q;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class o extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f721b;

    static {
        f720a = Build.VERSION.SDK_INT < 21;
    }

    public o(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    public final void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        u0 u0VarV = u0.v(context, attributeSet, a.b.j.j2, i2, i3);
        int i4 = a.b.j.l2;
        if (u0VarV.s(i4)) {
            b(u0VarV.a(i4, false));
        }
        setBackgroundDrawable(u0VarV.g(a.b.j.k2));
        u0VarV.w();
    }

    public final void b(boolean z) {
        if (f720a) {
            this.f721b = z;
        } else {
            a.i.s.h.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f720a && this.f721b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f720a && this.f721b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f720a && this.f721b) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}

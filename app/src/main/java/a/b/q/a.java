package a.b.q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0008a f540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.i.r.b0 f545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f547i;

    /* JADX INFO: renamed from: a.b.q.a$a, reason: collision with other inner class name */
    public class C0008a implements a.i.r.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f548a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f549b;

        public C0008a() {
        }

        @Override // a.i.r.c0
        public void a(View view) {
            this.f548a = true;
        }

        @Override // a.i.r.c0
        public void b(View view) {
            if (this.f548a) {
                return;
            }
            a aVar = a.this;
            aVar.f545g = null;
            a.super.setVisibility(this.f549b);
        }

        @Override // a.i.r.c0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f548a = false;
        }

        public C0008a d(a.i.r.b0 b0Var, int i2) {
            a.this.f545g = b0Var;
            this.f549b = i2;
            return this;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f540b = new C0008a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.b.a.f17a, typedValue, true) || typedValue.resourceId == 0) {
            this.f541c = context;
        } else {
            this.f541c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public a.i.r.b0 f(int i2, long j2) {
        a.i.r.b0 b0VarA;
        a.i.r.b0 b0Var = this.f545g;
        if (b0Var != null) {
            b0Var.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b0VarA = a.i.r.x.d(this).a(1.0f);
        } else {
            b0VarA = a.i.r.x.d(this).a(0.0f);
        }
        b0VarA.f(j2);
        b0VarA.h(this.f540b.d(b0VarA, i2));
        return b0VarA;
    }

    public int getAnimatedVisibility() {
        return this.f545g != null ? this.f540b.f549b : getVisibility();
    }

    public int getContentHeight() {
        return this.f544f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.b.j.f120a, a.b.a.f19c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(a.b.j.f129j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f543e;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f547i = false;
        }
        if (!this.f547i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f547i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f547i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f546h = false;
        }
        if (!this.f546h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f546h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f546h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            a.i.r.b0 b0Var = this.f545g;
            if (b0Var != null) {
                b0Var.b();
            }
            super.setVisibility(i2);
        }
    }
}

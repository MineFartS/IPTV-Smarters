package com.google.android.material.internal;

import a.b.p.j.i;
import a.b.p.j.n;
import a.b.q.f0;
import a.b.q.w0;
import a.i.r.g0.c;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c.f.a.d.d0.d;
import c.f.a.d.e;
import c.f.a.d.f;
import c.f.a.d.h;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements n.a {
    public static final int[] w = {R.attr.state_checked};
    public final CheckedTextView A;
    public FrameLayout B;
    public i C;
    public ColorStateList D;
    public boolean E;
    public Drawable F;
    public final a.i.r.a G;
    public int x;
    public boolean y;
    public boolean z;

    public class a extends a.i.r.a {
        public a() {
        }

        @Override // a.i.r.a
        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.V(NavigationMenuItemView.this.z);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a aVar = new a();
        this.G = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.f14829c, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.f.a.d.d.f14706e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.f14786e);
        this.A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        x.p0(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.B == null) {
                this.B = (FrameLayout) ((ViewStub) findViewById(f.f14785d)).inflate();
            }
            this.B.removeAllViews();
            this.B.addView(view);
        }
    }

    public final void B() {
        f0.a aVar;
        int i2;
        if (D()) {
            this.A.setVisibility(8);
            FrameLayout frameLayout = this.B;
            if (frameLayout == null) {
                return;
            }
            aVar = (f0.a) frameLayout.getLayoutParams();
            i2 = -1;
        } else {
            this.A.setVisibility(0);
            FrameLayout frameLayout2 = this.B;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (f0.a) frameLayout2.getLayoutParams();
            i2 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i2;
        this.B.setLayoutParams(aVar);
    }

    public final StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.b.a.v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(w, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public final boolean D() {
        return this.C.getTitle() == null && this.C.getIcon() == null && this.C.getActionView() != null;
    }

    @Override // a.b.p.j.n.a
    public boolean d() {
        return false;
    }

    @Override // a.b.p.j.n.a
    public void e(i iVar, int i2) {
        this.C = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            x.s0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        w0.a(this, iVar.getTooltipText());
        B();
    }

    @Override // a.b.p.j.n.a
    public i getItemData() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.C;
        if (iVar != null && iVar.isCheckable() && this.C.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, w);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.z != z) {
            this.z = z;
            this.G.l(this.A, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.A.setChecked(z);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = a.i.j.l.a.r(drawable).mutate();
                a.i.j.l.a.o(drawable, this.D);
            }
            int i2 = this.x;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.y) {
            if (this.F == null) {
                Drawable drawableA = a.i.i.e.f.a(getResources(), e.f14781g, getContext().getTheme());
                this.F = drawableA;
                if (drawableA != null) {
                    int i3 = this.x;
                    drawableA.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.F;
        }
        a.i.s.i.l(this.A, drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.A.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.x = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        this.E = colorStateList != null;
        i iVar = this.C;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.A.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.y = z;
    }

    public void setTextAppearance(int i2) {
        a.i.s.i.q(this.A, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
    }
}

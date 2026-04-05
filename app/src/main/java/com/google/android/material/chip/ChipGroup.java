package com.google.android.material.chip;

import a.i.r.g0.c;
import a.i.r.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import c.f.a.d.d0.j;
import c.f.a.d.k;
import c.f.a.d.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ChipGroup extends c.f.a.d.d0.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24445f = k.f15007o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f24450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f24451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f24452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24454o;

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.f24454o) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f24449j) {
                ChipGroup.this.r(compoundButton.getId(), true);
                ChipGroup.this.q(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (ChipGroup.this.f24453n == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            } else {
                if (ChipGroup.this.f24453n != -1 && ChipGroup.this.f24453n != id && ChipGroup.this.f24448i) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.r(chipGroup.f24453n, false);
                }
                ChipGroup.this.setCheckedId(id);
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i2);
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f24456b;

        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(x.k());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f24451l);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24456b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24456b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.f14629f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24445f;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24451l = new b();
        this.f24452m = new e();
        this.f24453n = -1;
        this.f24454o = false;
        TypedArray typedArrayH = j.h(getContext(), attributeSet, l.S0, i2, i3, new int[0]);
        int dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(l.U0, 0);
        setChipSpacingHorizontal(typedArrayH.getDimensionPixelOffset(l.V0, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayH.getDimensionPixelOffset(l.W0, dimensionPixelOffset));
        setSingleLine(typedArrayH.getBoolean(l.Y0, false));
        setSingleSelection(typedArrayH.getBoolean(l.Z0, false));
        setSelectionRequired(typedArrayH.getBoolean(l.X0, false));
        int resourceId = typedArrayH.getResourceId(l.T0, -1);
        if (resourceId != -1) {
            this.f24453n = resourceId;
        }
        typedArrayH.recycle();
        super.setOnHierarchyChangeListener(this.f24452m);
        x.y0(this, 1);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i2) {
        q(i2, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.f24453n;
                if (i3 != -1 && this.f24448i) {
                    r(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // c.f.a.d.d0.c
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f24448i) {
            return this.f24453n;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f24448i) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f24446g;
    }

    public int getChipSpacingVertical() {
        return this.f24447h;
    }

    public void m(int i2) {
        int i3 = this.f24453n;
        if (i2 == i3) {
            return;
        }
        if (i3 != -1 && this.f24448i) {
            r(i3, false);
        }
        if (i2 != -1) {
            r(i2, true);
        }
        setCheckedId(i2);
    }

    public void n() {
        this.f24454o = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f24454o = false;
        setCheckedId(-1);
    }

    public int o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                if (((Chip) getChildAt(i3)) == view) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f24453n;
        if (i2 != -1) {
            r(i2, true);
            setCheckedId(this.f24453n);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a.i.r.g0.c.x0(accessibilityNodeInfo).Z(c.b.a(getRowCount(), c() ? getChipCount() : -1, false, p() ? 1 : 2));
    }

    public boolean p() {
        return this.f24448i;
    }

    public final void q(int i2, boolean z) {
        this.f24453n = i2;
        d dVar = this.f24450k;
        if (dVar != null && this.f24448i && z) {
            dVar.a(this, i2);
        }
    }

    public final void r(int i2, boolean z) {
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById instanceof Chip) {
            this.f24454o = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.f24454o = false;
        }
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f24446g != i2) {
            this.f24446g = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f24447h != i2) {
            this.f24447h = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f24450k = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24452m.f24456b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f24449j = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    @Override // c.f.a.d.d0.c
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.f24448i != z) {
            this.f24448i = z;
            n();
        }
    }
}

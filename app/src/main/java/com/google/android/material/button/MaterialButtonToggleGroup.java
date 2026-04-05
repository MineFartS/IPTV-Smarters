package com.google.android.material.button;

import a.i.r.g0.c;
import a.i.r.i;
import a.i.r.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.f.a.d.d0.j;
import c.f.a.d.j0.k;
import c.f.a.d.k;
import c.f.a.d.l;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24411b = MaterialButtonToggleGroup.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24412c = k.t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d> f24413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f24414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f24415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet<e> f24416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator<MaterialButton> f24417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer[] f24418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24422m;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends a.i.r.a {
        public b() {
        }

        @Override // a.i.r.a
        public void g(View view, a.i.r.g0.c cVar) {
            super.g(view, cVar);
            cVar.a0(c.C0042c.a(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public class c implements MaterialButton.a {
        public c() {
        }

        public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.f24419j) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f24420k) {
                MaterialButtonToggleGroup.this.f24422m = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c.f.a.d.j0.c f24426a = new c.f.a.d.j0.a(0.0f);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.f.a.d.j0.c f24427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.a.d.j0.c f24428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.f.a.d.j0.c f24429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.d.j0.c f24430e;

        public d(c.f.a.d.j0.c cVar, c.f.a.d.j0.c cVar2, c.f.a.d.j0.c cVar3, c.f.a.d.j0.c cVar4) {
            this.f24427b = cVar;
            this.f24428c = cVar3;
            this.f24429d = cVar4;
            this.f24430e = cVar2;
        }

        public static d a(d dVar) {
            c.f.a.d.j0.c cVar = f24426a;
            return new d(cVar, dVar.f24430e, cVar, dVar.f24429d);
        }

        public static d b(d dVar, View view) {
            return c.f.a.d.d0.k.d(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            c.f.a.d.j0.c cVar = dVar.f24427b;
            c.f.a.d.j0.c cVar2 = dVar.f24430e;
            c.f.a.d.j0.c cVar3 = f24426a;
            return new d(cVar, cVar2, cVar3, cVar3);
        }

        public static d d(d dVar) {
            c.f.a.d.j0.c cVar = f24426a;
            return new d(cVar, cVar, dVar.f24428c, dVar.f24429d);
        }

        public static d e(d dVar, View view) {
            return c.f.a.d.d0.k.d(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            c.f.a.d.j0.c cVar = dVar.f24427b;
            c.f.a.d.j0.c cVar2 = f24426a;
            return new d(cVar, cVar2, dVar.f24428c, cVar2);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z);
    }

    public class f implements MaterialButton.b {
        public f() {
        }

        public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24412c;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24413d = new ArrayList();
        a aVar = null;
        this.f24414e = new c(this, aVar);
        this.f24415f = new f(this, aVar);
        this.f24416g = new LinkedHashSet<>();
        this.f24417h = new a();
        this.f24419j = false;
        TypedArray typedArrayH = j.h(getContext(), attributeSet, l.L2, i2, i3, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(l.O2, false));
        this.f24422m = typedArrayH.getResourceId(l.M2, -1);
        this.f24421l = typedArrayH.getBoolean(l.N2, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayH.recycle();
        x.y0(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (p(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && p(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setCheckedId(int i2) {
        this.f24422m = i2;
        l(i2, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(x.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.f24414e);
        materialButton.setOnPressedChangeListenerInternal(this.f24415f);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void t(k.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(dVar.f24427b).t(dVar.f24430e).F(dVar.f24428c).x(dVar.f24429d);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f24411b, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        c.f.a.d.j0.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f24413d.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        x.p0(materialButton, new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.f24416g.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f24420k) {
            return this.f24422m;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonM = m(i2);
            if (materialButtonM.isChecked()) {
                arrayList.add(Integer.valueOf(materialButtonM.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f24418i;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w(f24411b, "Child order wasn't updated");
        return i3;
    }

    public final void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonM = m(i2);
            int iMin = Math.min(materialButtonM.getStrokeWidth(), m(i2 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsI = i(materialButtonM);
            if (getOrientation() == 0) {
                i.c(layoutParamsI, 0);
                i.d(layoutParamsI, -iMin);
                layoutParamsI.topMargin = 0;
            } else {
                layoutParamsI.bottomMargin = 0;
                layoutParamsI.topMargin = -iMin;
                i.d(layoutParamsI, 0);
            }
            materialButtonM.setLayoutParams(layoutParamsI);
        }
        r(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public final void j(int i2) {
        s(i2, true);
        u(i2, true);
        setCheckedId(i2);
    }

    public void k() {
        this.f24419j = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonM = m(i2);
            materialButtonM.setChecked(false);
            l(materialButtonM.getId(), false);
        }
        this.f24419j = false;
        setCheckedId(-1);
    }

    public final void l(int i2, boolean z) {
        Iterator<e> it = this.f24416g.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2, z);
        }
    }

    public final MaterialButton m(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    public final int n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == view) {
                return i2;
            }
            if ((getChildAt(i3) instanceof MaterialButton) && p(i3)) {
                i2++;
            }
        }
        return -1;
    }

    public final d o(int i2, int i3, int i4) {
        d dVar = this.f24413d.get(i2);
        if (i3 == i4) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i2 == i3) {
            return z ? d.e(dVar, this) : d.f(dVar);
        }
        if (i2 == i4) {
            return z ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f24422m;
        if (i2 != -1) {
            j(i2);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a.i.r.g0.c.x0(accessibilityNodeInfo).Z(c.b.a(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        w();
        h();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.h(this.f24414e);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f24413d.remove(iIndexOfChild);
        }
        w();
        h();
    }

    public final boolean p(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    public boolean q() {
        return this.f24420k;
    }

    public final void r(int i2) {
        if (getChildCount() == 0 || i2 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i2).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            i.c(layoutParams, 0);
            i.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void s(int i2, boolean z) {
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById instanceof MaterialButton) {
            this.f24419j = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.f24419j = false;
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f24421l = z;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.f24420k != z) {
            this.f24420k = z;
            k();
        }
    }

    public final boolean u(int i2, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f24421l && checkedButtonIds.isEmpty()) {
            s(i2, true);
            this.f24422m = i2;
            return false;
        }
        if (z && this.f24420k) {
            checkedButtonIds.remove(Integer.valueOf(i2));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                s(iIntValue, false);
                l(iIntValue, false);
            }
        }
        return true;
    }

    public final void v() {
        TreeMap treeMap = new TreeMap(this.f24417h);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(m(i2), Integer.valueOf(i2));
        }
        this.f24418i = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButtonM = m(i2);
            if (materialButtonM.getVisibility() != 8) {
                k.b bVarV = materialButtonM.getShapeAppearanceModel().v();
                t(bVarV, o(i2, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonM.setShapeAppearanceModel(bVarV.m());
            }
        }
    }
}

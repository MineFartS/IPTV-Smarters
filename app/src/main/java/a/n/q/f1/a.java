package a.n.q.f1;

import a.n.f;
import a.n.h;
import a.n.q.b0;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f2781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f2782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<VerticalGridView> f2783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<a.n.q.f1.b> f2784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Interpolator f2790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Interpolator f2791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c> f2792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f2794o;
    public int p;
    public List<CharSequence> q;
    public int r;
    public int s;
    public final b0 t;

    /* JADX INFO: renamed from: a.n.q.f1.a$a, reason: collision with other inner class name */
    public class C0060a extends b0 {
        public C0060a() {
        }

        @Override // a.n.q.b0
        public void a(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, int i3) {
            int iIndexOf = a.this.f2783d.indexOf(recyclerView);
            a.this.h(iIndexOf, true);
            if (e0Var != null) {
                a.this.c(iIndexOf, a.this.f2784e.get(iIndexOf).e() + i2);
            }
        }
    }

    public class b extends RecyclerView.h<d> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f2798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a.n.q.f1.b f2799h;

        public b(Context context, int i2, int i3, int i4) {
            this.f2796e = i2;
            this.f2797f = i4;
            this.f2798g = i3;
            this.f2799h = a.this.f2784e.get(i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public void F(d dVar, int i2) {
            a.n.q.f1.b bVar;
            TextView textView = dVar.u;
            if (textView != null && (bVar = this.f2799h) != null) {
                textView.setText(bVar.c(bVar.e() + i2));
            }
            a aVar = a.this;
            aVar.g(dVar.f4855b, aVar.f2783d.get(this.f2797f).getSelectedPosition() == i2, this.f2797f, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public d H(ViewGroup viewGroup, int i2) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f2796e, viewGroup, false);
            int i3 = this.f2798g;
            return new d(viewInflate, i3 != 0 ? (TextView) viewInflate.findViewById(i3) : (TextView) viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public void N(d dVar) {
            dVar.f4855b.setFocusable(a.this.isActivated());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int o() {
            a.n.q.f1.b bVar = this.f2799h;
            if (bVar == null) {
                return 0;
            }
            return bVar.a();
        }
    }

    public interface c {
        void a(a aVar, int i2);
    }

    public static class d extends RecyclerView.e0 {
        public final TextView u;

        public d(View view, TextView textView) {
            super(view);
            this.u = textView;
        }
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2783d = new ArrayList();
        this.f2793n = 3.0f;
        this.f2794o = 1.0f;
        this.p = 0;
        this.q = new ArrayList();
        this.r = h.f2633d;
        this.s = 0;
        this.t = new C0060a();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f2786g = 1.0f;
        this.f2785f = 1.0f;
        this.f2787h = 0.5f;
        this.f2788i = 0.0f;
        this.f2789j = 200;
        this.f2790k = new DecelerateInterpolator(2.5f);
        this.f2791l = new AccelerateInterpolator(2.5f);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(h.f2631b, (ViewGroup) this, true);
        this.f2781b = viewGroup;
        this.f2782c = (ViewGroup) viewGroup.findViewById(f.y);
    }

    public a.n.q.f1.b a(int i2) {
        ArrayList<a.n.q.f1.b> arrayList = this.f2784e;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i2);
    }

    public final void b(int i2) {
        ArrayList<c> arrayList = this.f2792m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f2792m.get(size).a(this, i2);
            }
        }
    }

    public void c(int i2, int i3) {
        a.n.q.f1.b bVar = this.f2784e.get(i2);
        if (bVar.b() != i3) {
            bVar.f(i3);
            b(i2);
        }
    }

    public void d(int i2, a.n.q.f1.b bVar) {
        this.f2784e.set(i2, bVar);
        VerticalGridView verticalGridView = this.f2783d.get(i2);
        b bVar2 = (b) verticalGridView.getAdapter();
        if (bVar2 != null) {
            bVar2.w();
        }
        verticalGridView.setSelectedPosition(bVar.b() - bVar.e());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public void e(int i2, int i3, boolean z) {
        a.n.q.f1.b bVar = this.f2784e.get(i2);
        if (bVar.b() != i3) {
            bVar.f(i3);
            b(i2);
            VerticalGridView verticalGridView = this.f2783d.get(i2);
            if (verticalGridView != null) {
                int iE = i3 - this.f2784e.get(i2).e();
                if (z) {
                    verticalGridView.setSelectedPositionSmooth(iE);
                } else {
                    verticalGridView.setSelectedPosition(iE);
                }
            }
        }
    }

    public final void f(View view, boolean z, float f2, float f3, Interpolator interpolator) {
        view.animate().cancel();
        if (!z) {
            view.setAlpha(f2);
            return;
        }
        if (f3 >= 0.0f) {
            view.setAlpha(f3);
        }
        view.animate().alpha(f2).setDuration(this.f2789j).setInterpolator(interpolator).start();
    }

    public void g(View view, boolean z, int i2, boolean z2) {
        boolean z3 = i2 == this.p || !hasFocus();
        f(view, z2, z ? z3 ? this.f2786g : this.f2785f : z3 ? this.f2787h : this.f2788i, -1.0f, this.f2790k);
    }

    public float getActivatedVisibleItemCount() {
        return this.f2793n;
    }

    public int getColumnsCount() {
        ArrayList<a.n.q.f1.b> arrayList = this.f2784e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(a.n.c.y);
    }

    public final int getPickerItemLayoutId() {
        return this.r;
    }

    public final int getPickerItemTextViewId() {
        return this.s;
    }

    public int getSelectedColumn() {
        return this.p;
    }

    public final CharSequence getSeparator() {
        return this.q.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.q;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    public void h(int i2, boolean z) {
        VerticalGridView verticalGridView = this.f2783d.get(i2);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i3 = 0;
        while (i3 < verticalGridView.getAdapter().o()) {
            View viewE = verticalGridView.getLayoutManager().E(i3);
            if (viewE != null) {
                g(viewE, selectedPosition == i3, i2, z);
            }
            i3++;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            j(this.f2783d.get(i2));
        }
    }

    public final void j(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ((getPickerItemHeightPixels() * activatedVisibleItemCount) + (verticalGridView.getVerticalSpacing() * (activatedVisibleItemCount - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }

    public final void k() {
        boolean zIsActivated = isActivated();
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            VerticalGridView verticalGridView = this.f2783d.get(i2);
            for (int i3 = 0; i3 < verticalGridView.getChildCount(); i3++) {
                verticalGridView.getChildAt(i3).setFocusable(zIsActivated);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < this.f2783d.size()) {
            return this.f2783d.get(selectedColumn).requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i2 = 0; i2 < this.f2783d.size(); i2++) {
            if (this.f2783d.get(i2).hasFocus()) {
                setSelectedColumn(i2);
            }
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        boolean zIsActivated = isActivated();
        super.setActivated(z);
        if (z == zIsActivated) {
            return;
        }
        boolean zHasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z && zHasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            this.f2783d.get(i2).setFocusable(z);
        }
        i();
        k();
        if (z && zHasFocus && selectedColumn >= 0) {
            this.f2783d.get(selectedColumn).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f2793n != f2) {
            this.f2793n = f2;
            if (isActivated()) {
                i();
            }
        }
    }

    public void setColumns(List<a.n.q.f1.b> list) {
        if (this.q.size() == 0) {
            throw new IllegalStateException("Separators size is: " + this.q.size() + ". At least one separator must be provided");
        }
        if (this.q.size() == 1) {
            CharSequence charSequence = this.q.get(0);
            this.q.clear();
            this.q.add(BuildConfig.FLAVOR);
            for (int i2 = 0; i2 < list.size() - 1; i2++) {
                this.q.add(charSequence);
            }
            this.q.add(BuildConfig.FLAVOR);
        } else if (this.q.size() != list.size() + 1) {
            throw new IllegalStateException("Separators size: " + this.q.size() + " mustequal the size of columns: " + list.size() + " + 1");
        }
        this.f2783d.clear();
        this.f2782c.removeAllViews();
        ArrayList<a.n.q.f1.b> arrayList = new ArrayList<>(list);
        this.f2784e = arrayList;
        if (this.p > arrayList.size() - 1) {
            this.p = this.f2784e.size() - 1;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty(this.q.get(0))) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(h.f2634e, this.f2782c, false);
            textView.setText(this.q.get(0));
            this.f2782c.addView(textView);
        }
        int i3 = 0;
        while (i3 < columnsCount) {
            VerticalGridView verticalGridView = (VerticalGridView) layoutInflaterFrom.inflate(h.f2632c, this.f2782c, false);
            j(verticalGridView);
            verticalGridView.setWindowAlignment(0);
            verticalGridView.setHasFixedSize(false);
            verticalGridView.setFocusable(isActivated());
            verticalGridView.setItemViewCacheSize(0);
            this.f2783d.add(verticalGridView);
            this.f2782c.addView(verticalGridView);
            int i4 = i3 + 1;
            if (!TextUtils.isEmpty(this.q.get(i4))) {
                TextView textView2 = (TextView) layoutInflaterFrom.inflate(h.f2634e, this.f2782c, false);
                textView2.setText(this.q.get(i4));
                this.f2782c.addView(textView2);
            }
            verticalGridView.setAdapter(new b(getContext(), getPickerItemLayoutId(), getPickerItemTextViewId(), i3));
            verticalGridView.setOnChildViewHolderSelectedListener(this.t);
            i3 = i4;
        }
    }

    public final void setPickerItemTextViewId(int i2) {
        this.s = i2;
    }

    public void setSelectedColumn(int i2) {
        if (this.p != i2) {
            this.p = i2;
            for (int i3 = 0; i3 < this.f2783d.size(); i3++) {
                h(i3, true);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        this.q.clear();
        this.q.addAll(list);
    }

    public void setVisibleItemCount(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f2794o != f2) {
            this.f2794o = f2;
            if (isActivated()) {
                return;
            }
            i();
        }
    }
}

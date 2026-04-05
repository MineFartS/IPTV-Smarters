package com.google.android.material.datepicker;

import a.i.q.e;
import a.i.r.g0.c;
import a.i.r.x;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import c.f.a.d.d0.k;
import c.f.a.d.f;
import c.f.a.d.x.d;
import c.f.a.d.x.i;
import c.f.a.d.x.m;
import c.f.a.d.x.s;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f24458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24459c;

    public class a extends a.i.r.a {
        public a() {
        }

        @Override // a.i.r.a
        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.Z(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24458b = s.k();
        if (i.l0(getContext())) {
            setNextFocusLeftId(f.f14782a);
            setNextFocusRightId(f.f14784c);
        }
        this.f24459c = i.m0(getContext());
        x.p0(this, new a());
    }

    public static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean d(Long l2, Long l3, Long l4, Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    public final void a(int i2, Rect rect) {
        int iB;
        if (i2 == 33) {
            iB = getAdapter().i();
        } else {
            if (i2 != 130) {
                super.onFocusChanged(true, i2, rect);
                return;
            }
            iB = getAdapter().b();
        }
        setSelection(iB);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m getAdapter() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int iC;
        int iA2;
        int iC2;
        int width;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m adapter = getAdapter();
        d<?> dVar = adapter.f15330d;
        c.f.a.d.x.c cVar = adapter.f15332f;
        Long item = adapter.getItem(adapter.b());
        Long item2 = adapter.getItem(adapter.i());
        for (e<Long, Long> eVar : dVar.i()) {
            Long l2 = eVar.f1955a;
            if (l2 != null) {
                if (eVar.f1956b != null) {
                    long jLongValue = l2.longValue();
                    long jLongValue2 = eVar.f1956b.longValue();
                    if (!d(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                        boolean zD = k.d(this);
                        if (jLongValue < item.longValue()) {
                            iA = adapter.b();
                            if (adapter.f(iA)) {
                                iC = 0;
                            } else {
                                View childAt = materialCalendarGridView.getChildAt(iA - 1);
                                iC = !zD ? childAt.getRight() : childAt.getLeft();
                            }
                        } else {
                            materialCalendarGridView.f24458b.setTimeInMillis(jLongValue);
                            iA = adapter.a(materialCalendarGridView.f24458b.get(5));
                            iC = c(materialCalendarGridView.getChildAt(iA));
                        }
                        if (jLongValue2 > item2.longValue()) {
                            iA2 = Math.min(adapter.i(), getChildCount() - 1);
                            if (adapter.g(iA2)) {
                                iC2 = getWidth();
                            } else {
                                View childAt2 = materialCalendarGridView.getChildAt(iA2);
                                iC2 = !zD ? childAt2.getRight() : childAt2.getLeft();
                            }
                        } else {
                            materialCalendarGridView.f24458b.setTimeInMillis(jLongValue2);
                            iA2 = adapter.a(materialCalendarGridView.f24458b.get(5));
                            iC2 = c(materialCalendarGridView.getChildAt(iA2));
                        }
                        int itemId = (int) adapter.getItemId(iA);
                        int itemId2 = (int) adapter.getItemId(iA2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + cVar.f15271a.c();
                            int bottom = childAt3.getBottom() - cVar.f15271a.b();
                            if (zD) {
                                int i3 = iA2 > numColumns2 ? 0 : iC2;
                                width = numColumns > iA ? getWidth() : iC;
                                i2 = i3;
                            } else {
                                i2 = numColumns > iA ? 0 : iC;
                                width = iA2 > numColumns2 ? getWidth() : iC2;
                            }
                            canvas.drawRect(i2, top, width, bottom, cVar.f15278h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            a(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.f24459c) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter().b()) {
            i2 = getAdapter().b();
        }
        super.setSelection(i2);
    }
}

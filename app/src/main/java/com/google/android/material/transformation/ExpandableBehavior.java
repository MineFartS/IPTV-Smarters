package com.google.android.material.transformation;

import a.i.r.x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24614a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f24615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f24616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.f.a.d.b0.a f24617d;

        public a(View view, int i2, c.f.a.d.b0.a aVar) {
            this.f24615b = view;
            this.f24616c = i2;
            this.f24617d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f24615b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f24614a == this.f24616c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                c.f.a.d.b0.a aVar = this.f24617d;
                expandableBehavior.H((View) aVar, this.f24615b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f24614a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24614a = 0;
    }

    public final boolean F(boolean z) {
        if (!z) {
            return this.f24614a == 1;
        }
        int i2 = this.f24614a;
        return i2 == 0 || i2 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c.f.a.d.b0.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listS = coordinatorLayout.s(view);
        int size = listS.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = listS.get(i2);
            if (e(coordinatorLayout, view, view2)) {
                return (c.f.a.d.b0.a) view2;
            }
        }
        return null;
    }

    public abstract boolean H(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c.f.a.d.b0.a aVar = (c.f.a.d.b0.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f24614a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        c.f.a.d.b0.a aVarG;
        if (x.U(view) || (aVarG = G(coordinatorLayout, view)) == null || !F(aVarG.a())) {
            return false;
        }
        int i3 = aVarG.a() ? 1 : 2;
        this.f24614a = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, aVarG));
        return false;
    }
}

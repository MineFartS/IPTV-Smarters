package a.n.q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends RecyclerView {
    public final k R0;
    public boolean S0;
    public boolean T0;
    public RecyclerView.m U0;
    public d V0;
    public c W0;
    public InterfaceC0059b X0;
    public RecyclerView.x Y0;
    public e Z0;
    public int a1;

    public class a implements RecyclerView.x {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public void a(RecyclerView.e0 e0Var) {
            b.this.R0.l3(e0Var);
            RecyclerView.x xVar = b.this.Y0;
            if (xVar != null) {
                xVar.a(e0Var);
            }
        }
    }

    /* JADX INFO: renamed from: a.n.q.b$b, reason: collision with other inner class name */
    public interface InterfaceC0059b {
        boolean a(KeyEvent keyEvent);
    }

    public interface c {
        boolean a(MotionEvent motionEvent);
    }

    public interface d {
        boolean a(MotionEvent motionEvent);
    }

    public interface e {
        boolean a(KeyEvent keyEvent);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.S0 = true;
        this.T0 = true;
        this.a1 = 4;
        k kVar = new k(this);
        this.R0 = kVar;
        setLayoutManager(kVar);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((a.y.e.p) getItemAnimator()).R(false);
        super.setRecyclerListener(new a());
    }

    public void D1(View view, int[] iArr) {
        this.R0.P2(view, iArr);
    }

    public void E1(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.l.A);
        this.R0.G3(typedArrayObtainStyledAttributes.getBoolean(a.n.l.F, false), typedArrayObtainStyledAttributes.getBoolean(a.n.l.E, false));
        this.R0.H3(typedArrayObtainStyledAttributes.getBoolean(a.n.l.H, true), typedArrayObtainStyledAttributes.getBoolean(a.n.l.G, true));
        this.R0.e4(typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.l.D, typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.l.J, 0)));
        this.R0.L3(typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.l.C, typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.l.I, 0)));
        int i2 = a.n.l.B;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            setGravity(typedArrayObtainStyledAttributes.getInt(i2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean F1() {
        return isChildrenDrawingOrderEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        c cVar = this.W0;
        if (cVar == null || !cVar.a(motionEvent)) {
            return super.dispatchGenericFocusedEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0059b interfaceC0059b = this.X0;
        if ((interfaceC0059b != null && interfaceC0059b.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        e eVar = this.Z0;
        return eVar != null && eVar.a(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.V0;
        if (dVar == null || !dVar.a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public View focusSearch(int i2) {
        if (isFocused()) {
            k kVar = this.R0;
            View viewE = kVar.E(kVar.A2());
            if (viewE != null) {
                return focusSearch(viewE, i2);
            }
        }
        return super.focusSearch(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        return this.R0.h2(this, i2, i3);
    }

    public int getExtraLayoutSpace() {
        return this.R0.k2();
    }

    public int getFocusScrollStrategy() {
        return this.R0.m2();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.R0.n2();
    }

    public int getHorizontalSpacing() {
        return this.R0.n2();
    }

    public int getInitialPrefetchItemCount() {
        return this.a1;
    }

    public int getItemAlignmentOffset() {
        return this.R0.o2();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.R0.p2();
    }

    public int getItemAlignmentViewId() {
        return this.R0.q2();
    }

    public e getOnUnhandledKeyListener() {
        return this.Z0;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.R0.i0.c();
    }

    public final int getSaveChildrenPolicy() {
        return this.R0.i0.d();
    }

    public int getSelectedPosition() {
        return this.R0.A2();
    }

    public int getSelectedSubPosition() {
        return this.R0.E2();
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.R0.G2();
    }

    public int getVerticalSpacing() {
        return this.R0.G2();
    }

    public int getWindowAlignment() {
        return this.R0.Q2();
    }

    public int getWindowAlignmentOffset() {
        return this.R0.R2();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.R0.S2();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.T0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void n1(int i2) {
        if (this.R0.d3()) {
            this.R0.d4(i2, 0, 0);
        } else {
            super.n1(i2);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.R0.m3(z, i2, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        return this.R0.T2(this, i2, rect);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        this.R0.n3(i2);
    }

    public void setAnimateChildLayout(boolean z) {
        RecyclerView.m mVar;
        if (this.S0 != z) {
            this.S0 = z;
            if (z) {
                mVar = this.U0;
            } else {
                this.U0 = getItemAnimator();
                mVar = null;
            }
            super.setItemAnimator(mVar);
        }
    }

    public void setChildrenVisibility(int i2) {
        this.R0.E3(i2);
    }

    public void setExtraLayoutSpace(int i2) {
        this.R0.F3(i2);
    }

    public void setFocusDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setFocusScrollStrategy(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.R0.I3(i2);
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z) {
        setDescendantFocusability(z ? 393216 : 262144);
        this.R0.J3(z);
    }

    public void setGravity(int i2) {
        this.R0.K3(i2);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z) {
        this.T0 = z;
    }

    @Deprecated
    public void setHorizontalMargin(int i2) {
        setHorizontalSpacing(i2);
    }

    public void setHorizontalSpacing(int i2) {
        this.R0.L3(i2);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i2) {
        this.a1 = i2;
    }

    public void setItemAlignmentOffset(int i2) {
        this.R0.M3(i2);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f2) {
        this.R0.N3(f2);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z) {
        this.R0.O3(z);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i2) {
        this.R0.P3(i2);
    }

    @Deprecated
    public void setItemMargin(int i2) {
        setItemSpacing(i2);
    }

    public void setItemSpacing(int i2) {
        this.R0.Q3(i2);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z) {
        this.R0.R3(z);
    }

    public void setOnChildLaidOutListener(z zVar) {
        this.R0.T3(zVar);
    }

    public void setOnChildSelectedListener(a0 a0Var) {
        this.R0.U3(a0Var);
    }

    public void setOnChildViewHolderSelectedListener(b0 b0Var) {
        this.R0.V3(b0Var);
    }

    public void setOnKeyInterceptListener(InterfaceC0059b interfaceC0059b) {
        this.X0 = interfaceC0059b;
    }

    public void setOnMotionInterceptListener(c cVar) {
        this.W0 = cVar;
    }

    public void setOnTouchInterceptListener(d dVar) {
        this.V0 = dVar;
    }

    public void setOnUnhandledKeyListener(e eVar) {
        this.Z0 = eVar;
    }

    public void setPruneChild(boolean z) {
        this.R0.X3(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.x xVar) {
        this.Y0 = xVar;
    }

    public final void setSaveChildrenLimitNumber(int i2) {
        this.R0.i0.m(i2);
    }

    public final void setSaveChildrenPolicy(int i2) {
        this.R0.i0.n(i2);
    }

    public void setScrollEnabled(boolean z) {
        this.R0.Z3(z);
    }

    public void setSelectedPosition(int i2) {
        this.R0.a4(i2, 0);
    }

    public void setSelectedPositionSmooth(int i2) {
        this.R0.c4(i2);
    }

    @Deprecated
    public void setVerticalMargin(int i2) {
        setVerticalSpacing(i2);
    }

    public void setVerticalSpacing(int i2) {
        this.R0.e4(i2);
        requestLayout();
    }

    public void setWindowAlignment(int i2) {
        this.R0.f4(i2);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i2) {
        this.R0.g4(i2);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f2) {
        this.R0.h4(f2);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z) {
        this.R0.d0.a().u(z);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z) {
        this.R0.d0.a().v(z);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void v1(int i2) {
        if (this.R0.d3()) {
            this.R0.d4(i2, 0, 0);
        } else {
            super.v1(i2);
        }
    }
}

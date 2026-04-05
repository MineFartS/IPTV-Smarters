package a.b.q;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements a.b.p.j.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f626d;
    public final g A;
    public final f B;
    public final e C;
    public final c D;
    public Runnable E;
    public final Handler F;
    public final Rect G;
    public Rect H;
    public boolean I;
    public PopupWindow J;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListAdapter f628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f637o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public View t;
    public int u;
    public DataSetObserver v;
    public View w;
    public Drawable x;
    public AdapterView.OnItemClickListener y;
    public AdapterView.OnItemSelectedListener z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = g0.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            g0.this.show();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            c0 c0Var;
            if (i2 == -1 || (c0Var = g0.this.f629g) == null) {
                return;
            }
            c0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.q();
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (g0.this.a()) {
                g0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            g0.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || g0.this.z() || g0.this.J.getContentView() == null) {
                return;
            }
            g0 g0Var = g0.this;
            g0Var.F.removeCallbacks(g0Var.A);
            g0.this.A.run();
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = g0.this.J) != null && popupWindow.isShowing() && x >= 0 && x < g0.this.J.getWidth() && y >= 0 && y < g0.this.J.getHeight()) {
                g0 g0Var = g0.this;
                g0Var.F.postDelayed(g0Var.A, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            g0 g0Var2 = g0.this;
            g0Var2.F.removeCallbacks(g0Var2.A);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0 c0Var = g0.this.f629g;
            if (c0Var == null || !a.i.r.x.T(c0Var) || g0.this.f629g.getCount() <= g0.this.f629g.getChildCount()) {
                return;
            }
            int childCount = g0.this.f629g.getChildCount();
            g0 g0Var = g0.this;
            if (childCount <= g0Var.s) {
                g0Var.J.setInputMethodMode(2);
                g0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f624b = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f626d = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f625c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public g0(Context context) {
        this(context, null, a.b.a.H);
    }

    public g0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public g0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f630h = -2;
        this.f631i = -2;
        this.f634l = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.p = 0;
        this.q = false;
        this.r = false;
        this.s = Integer.MAX_VALUE;
        this.u = 0;
        this.A = new g();
        this.B = new f();
        this.C = new e();
        this.D = new c();
        this.G = new Rect();
        this.f627e = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.j.w1, i2, i3);
        this.f632j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.b.j.x1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.b.j.y1, 0);
        this.f633k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f635m = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        o oVar = new o(context, attributeSet, i2, i3);
        this.J = oVar;
        oVar.setInputMethodMode(1);
    }

    public boolean A() {
        return this.I;
    }

    public final void B() {
        View view = this.t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.t);
            }
        }
    }

    public void C(View view) {
        this.w = view;
    }

    public void D(int i2) {
        this.J.setAnimationStyle(i2);
    }

    public void E(int i2) {
        Drawable background = this.J.getBackground();
        if (background == null) {
            P(i2);
            return;
        }
        background.getPadding(this.G);
        Rect rect = this.G;
        this.f631i = rect.left + rect.right + i2;
    }

    public void F(int i2) {
        this.p = i2;
    }

    public void G(Rect rect) {
        this.H = rect != null ? new Rect(rect) : null;
    }

    public void H(int i2) {
        this.J.setInputMethodMode(i2);
    }

    public void I(boolean z) {
        this.I = z;
        this.J.setFocusable(z);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.J.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.y = onItemClickListener;
    }

    public void L(boolean z) {
        this.f637o = true;
        this.f636n = z;
    }

    public final void M(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.J.setIsClippedToScreen(z);
            return;
        }
        Method method = f624b;
        if (method != null) {
            try {
                method.invoke(this.J, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void N(int i2) {
        this.u = i2;
    }

    public void O(int i2) {
        c0 c0Var = this.f629g;
        if (!a() || c0Var == null) {
            return;
        }
        c0Var.setListSelectionHidden(false);
        c0Var.setSelection(i2);
        if (c0Var.getChoiceMode() != 0) {
            c0Var.setItemChecked(i2, true);
        }
    }

    public void P(int i2) {
        this.f631i = i2;
    }

    @Override // a.b.p.j.p
    public boolean a() {
        return this.J.isShowing();
    }

    public void b(Drawable drawable) {
        this.J.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f632j;
    }

    @Override // a.b.p.j.p
    public void dismiss() {
        this.J.dismiss();
        B();
        this.J.setContentView(null);
        this.f629g = null;
        this.F.removeCallbacks(this.A);
    }

    public void e(int i2) {
        this.f632j = i2;
    }

    public Drawable h() {
        return this.J.getBackground();
    }

    @Override // a.b.p.j.p
    public ListView i() {
        return this.f629g;
    }

    public void k(int i2) {
        this.f633k = i2;
        this.f635m = true;
    }

    public int n() {
        if (this.f635m) {
            return this.f633k;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.v;
        if (dataSetObserver == null) {
            this.v = new d();
        } else {
            ListAdapter listAdapter2 = this.f628f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f628f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        c0 c0Var = this.f629g;
        if (c0Var != null) {
            c0Var.setAdapter(this.f628f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[PHI: r1
  0x012b: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x0120, B:47:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.q.g0.p():int");
    }

    public void q() {
        c0 c0Var = this.f629g;
        if (c0Var != null) {
            c0Var.setListSelectionHidden(true);
            c0Var.requestLayout();
        }
    }

    public c0 r(Context context, boolean z) {
        return new c0(context, z);
    }

    public View s() {
        return this.w;
    }

    @Override // a.b.p.j.p
    public void show() {
        int iP = p();
        boolean z = z();
        a.i.s.h.b(this.J, this.f634l);
        if (this.J.isShowing()) {
            if (a.i.r.x.T(s())) {
                int width = this.f631i;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i2 = this.f630h;
                if (i2 == -1) {
                    if (!z) {
                        iP = -1;
                    }
                    if (z) {
                        this.J.setWidth(this.f631i == -1 ? -1 : 0);
                        this.J.setHeight(0);
                    } else {
                        this.J.setWidth(this.f631i == -1 ? -1 : 0);
                        this.J.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iP = i2;
                }
                this.J.setOutsideTouchable((this.r || this.q) ? false : true);
                this.J.update(s(), this.f632j, this.f633k, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f631i;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i3 = this.f630h;
        if (i3 == -1) {
            iP = -1;
        } else if (i3 != -2) {
            iP = i3;
        }
        this.J.setWidth(width2);
        this.J.setHeight(iP);
        M(true);
        this.J.setOutsideTouchable((this.r || this.q) ? false : true);
        this.J.setTouchInterceptor(this.B);
        if (this.f637o) {
            a.i.s.h.a(this.J, this.f636n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f626d;
            if (method != null) {
                try {
                    method.invoke(this.J, this.H);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.J.setEpicenterBounds(this.H);
        }
        a.i.s.h.c(this.J, s(), this.f632j, this.f633k, this.p);
        this.f629g.setSelection(-1);
        if (!this.I || this.f629g.isInTouchMode()) {
            q();
        }
        if (this.I) {
            return;
        }
        this.F.post(this.D);
    }

    public final int t(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.J.getMaxAvailableHeight(view, i2, z);
        }
        Method method = f625c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.J, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.J.getMaxAvailableHeight(view, i2);
    }

    public Object u() {
        if (a()) {
            return this.f629g.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f629g.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f629g.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f629g.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f631i;
    }

    public boolean z() {
        return this.J.getInputMethodMode() == 2;
    }
}

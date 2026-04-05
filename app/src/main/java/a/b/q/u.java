package a.b.q;

import a.b.k.b;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class u extends Spinner implements a.i.r.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f761b = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.b.q.e f762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e0 f764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SpinnerAdapter f765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f769j;

    public class a extends e0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ e f770k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, e eVar) {
            super(view);
            this.f770k = eVar;
        }

        @Override // a.b.q.e0
        public a.b.p.j.p b() {
            return this.f770k;
        }

        @Override // a.b.q.e0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (u.this.getInternalPopup().a()) {
                return true;
            }
            u.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!u.this.getInternalPopup().a()) {
                u.this.b();
            }
            ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    public class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.b.k.b f773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ListAdapter f774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f775d;

        public c() {
        }

        @Override // a.b.q.u.g
        public boolean a() {
            a.b.k.b bVar = this.f773b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // a.b.q.u.g
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // a.b.q.u.g
        public int c() {
            return 0;
        }

        @Override // a.b.q.u.g
        public void dismiss() {
            a.b.k.b bVar = this.f773b;
            if (bVar != null) {
                bVar.dismiss();
                this.f773b = null;
            }
        }

        @Override // a.b.q.u.g
        public void e(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.q.u.g
        public CharSequence f() {
            return this.f775d;
        }

        @Override // a.b.q.u.g
        public Drawable h() {
            return null;
        }

        @Override // a.b.q.u.g
        public void j(CharSequence charSequence) {
            this.f775d = charSequence;
        }

        @Override // a.b.q.u.g
        public void k(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.q.u.g
        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.q.u.g
        public void m(int i2, int i3) {
            if (this.f774c == null) {
                return;
            }
            b.a aVar = new b.a(u.this.getPopupContext());
            CharSequence charSequence = this.f775d;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            a.b.k.b bVarCreate = aVar.k(this.f774c, u.this.getSelectedItemPosition(), this).create();
            this.f773b = bVarCreate;
            ListView listViewF = bVarCreate.f();
            if (Build.VERSION.SDK_INT >= 17) {
                listViewF.setTextDirection(i2);
                listViewF.setTextAlignment(i3);
            }
            this.f773b.show();
        }

        @Override // a.b.q.u.g
        public int n() {
            return 0;
        }

        @Override // a.b.q.u.g
        public void o(ListAdapter listAdapter) {
            this.f774c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            u.this.setSelection(i2);
            if (u.this.getOnItemClickListener() != null) {
                u.this.performItemClick(null, i2, this.f774c.getItemId(i2));
            }
            dismiss();
        }
    }

    public static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SpinnerAdapter f777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ListAdapter f778c;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f777b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f778c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof q0) {
                    q0 q0Var = (q0) spinnerAdapter;
                    if (q0Var.getDropDownViewTheme() == null) {
                        q0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f778c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f777b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f777b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f777b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f777b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f777b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f778c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f777b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f777b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class e extends g0 implements g {
        public CharSequence K;
        public ListAdapter L;
        public final Rect M;
        public int N;

        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f779b;

            public a(u uVar) {
                this.f779b = uVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                u.this.setSelection(i2);
                if (u.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    u.this.performItemClick(view, i2, eVar.L.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.T(u.this)) {
                    e.this.dismiss();
                } else {
                    e.this.R();
                    e.super.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f782b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f782b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f782b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.M = new Rect();
            C(u.this);
            I(true);
            N(0);
            K(new a(u.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void R() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.h()
                r1 = 0
                if (r0 == 0) goto L26
                a.b.q.u r1 = a.b.q.u.this
                android.graphics.Rect r1 = r1.f769j
                r0.getPadding(r1)
                a.b.q.u r0 = a.b.q.u.this
                boolean r0 = a.b.q.a1.b(r0)
                if (r0 == 0) goto L1d
                a.b.q.u r0 = a.b.q.u.this
                android.graphics.Rect r0 = r0.f769j
                int r0 = r0.right
                goto L24
            L1d:
                a.b.q.u r0 = a.b.q.u.this
                android.graphics.Rect r0 = r0.f769j
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                a.b.q.u r0 = a.b.q.u.this
                android.graphics.Rect r0 = r0.f769j
                r0.right = r1
                r0.left = r1
            L2e:
                a.b.q.u r0 = a.b.q.u.this
                int r0 = r0.getPaddingLeft()
                a.b.q.u r2 = a.b.q.u.this
                int r2 = r2.getPaddingRight()
                a.b.q.u r3 = a.b.q.u.this
                int r3 = r3.getWidth()
                a.b.q.u r4 = a.b.q.u.this
                int r5 = r4.f768i
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.L
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.h()
                int r4 = r4.a(r5, r6)
                a.b.q.u r5 = a.b.q.u.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                a.b.q.u r6 = a.b.q.u.this
                android.graphics.Rect r6 = r6.f769j
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.E(r4)
                goto L85
            L82:
                r8.E(r5)
            L85:
                a.b.q.u r4 = a.b.q.u.this
                boolean r4 = a.b.q.a1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.y()
                int r3 = r3 - r0
                int r0 = r8.S()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.S()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.e(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.q.u.e.R():void");
        }

        public int S() {
            return this.N;
        }

        public boolean T(View view) {
            return a.i.r.x.T(view) && view.getGlobalVisibleRect(this.M);
        }

        @Override // a.b.q.u.g
        public CharSequence f() {
            return this.K;
        }

        @Override // a.b.q.u.g
        public void j(CharSequence charSequence) {
            this.K = charSequence;
        }

        @Override // a.b.q.u.g
        public void l(int i2) {
            this.N = i2;
        }

        @Override // a.b.q.u.g
        public void m(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            R();
            H(2);
            super.show();
            ListView listViewI = i();
            listViewI.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listViewI.setTextDirection(i2);
                listViewI.setTextAlignment(i3);
            }
            O(u.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = u.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // a.b.q.g0, a.b.q.u.g
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.L = listAdapter;
        }
    }

    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f784b;

        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        public f(Parcel parcel) {
            super(parcel);
            this.f784b = parcel.readByte() != 0;
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f784b ? (byte) 1 : (byte) 0);
        }
    }

    public interface g {
        boolean a();

        void b(Drawable drawable);

        int c();

        void dismiss();

        void e(int i2);

        CharSequence f();

        Drawable h();

        void j(CharSequence charSequence);

        void k(int i2);

        void l(int i2);

        void m(int i2, int i3);

        int n();

        void o(ListAdapter listAdapter);
    }

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.P);
    }

    public u(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public u(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.b.q.u, android.view.View, android.widget.Spinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.q.u.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f769j);
        Rect rect = this.f769j;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f767h.m(getTextDirection(), getTextAlignment());
        } else {
            this.f767h.m(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a.b.q.e eVar = this.f762c;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f767h;
        if (gVar != null) {
            return gVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f767h;
        if (gVar != null) {
            return gVar.n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f767h != null) {
            return this.f768i;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final g getInternalPopup() {
        return this.f767h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f767h;
        if (gVar != null) {
            return gVar.h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f763d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f767h;
        return gVar != null ? gVar.f() : super.getPrompt();
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        a.b.q.e eVar = this.f762c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a.b.q.e eVar = this.f762c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f767h;
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f767h.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f767h == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f784b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f767h;
        fVar.f784b = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f764e;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f767h;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f766g) {
            this.f765f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f767h != null) {
            Context context = this.f763d;
            if (context == null) {
                context = getContext();
            }
            this.f767h.o(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a.b.q.e eVar = this.f762c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a.b.q.e eVar = this.f762c;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f767h;
        if (gVar != null) {
            gVar.l(i2);
            this.f767h.e(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f767h;
        if (gVar != null) {
            gVar.k(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f767h != null) {
            this.f768i = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f767h;
        if (gVar != null) {
            gVar.b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(a.b.l.a.a.d(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f767h;
        if (gVar != null) {
            gVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a.b.q.e eVar = this.f762c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a.b.q.e eVar = this.f762c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}

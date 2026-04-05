package a.b.q;

import a.b.k.a;
import a.b.q.f0;
import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Interpolator f700b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0 f703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Spinner f704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f709k;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f710b;

        public a(View view) {
            this.f710b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.smoothScrollTo(this.f710b.getLeft() - ((n0.this.getWidth() - this.f710b.getWidth()) / 2), 0);
            n0.this.f701c = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return n0.this.f703e.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) n0.this.f703e.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return n0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = n0.this.f703e.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = n0.this.f703e.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a.c f715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f718f;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, a.c cVar, boolean z) {
            int i2 = a.b.a.f20d;
            super(context, null, i2);
            int[] iArr = {R.attr.background};
            this.f714b = iArr;
            this.f715c = cVar;
            u0 u0VarV = u0.v(context, null, iArr, i2, 0);
            if (u0VarV.s(0)) {
                setBackgroundDrawable(u0VarV.g(0));
            }
            u0VarV.w();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f715c = cVar;
            c();
        }

        public a.c b() {
            return this.f715c;
        }

        public void c() {
            a.c cVar = this.f715c;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f718f = viewB;
                TextView textView = this.f716d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f717e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f717e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f718f;
            if (view != null) {
                removeView(view);
                this.f718f = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f717e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f717e = appCompatImageView;
                }
                this.f717e.setImageDrawable(drawableC);
                this.f717e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f717e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f717e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceD);
            if (z) {
                if (this.f716d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, a.b.a.f21e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f716d = appCompatTextView;
                }
                this.f716d.setText(charSequenceD);
                this.f716d.setVisibility(0);
            } else {
                TextView textView2 = this.f716d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f716d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f717e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            w0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (n0.this.f706h > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = n0.this.f706h;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public void a(int i2) {
        View childAt = this.f703e.getChildAt(i2);
        Runnable runnable = this.f701c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f701c = aVar;
        post(aVar);
    }

    public final Spinner b() {
        u uVar = new u(getContext(), null, a.b.a.f24h);
        uVar.setLayoutParams(new f0.a(-2, -1));
        uVar.setOnItemSelectedListener(this);
        return uVar;
    }

    public d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f708j));
        } else {
            dVar.setFocusable(true);
            if (this.f702d == null) {
                this.f702d = new c();
            }
            dVar.setOnClickListener(this.f702d);
        }
        return dVar;
    }

    public final boolean d() {
        Spinner spinner = this.f704f;
        return spinner != null && spinner.getParent() == this;
    }

    public final void e() {
        if (d()) {
            return;
        }
        if (this.f704f == null) {
            this.f704f = b();
        }
        removeView(this.f703e);
        addView(this.f704f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f704f.getAdapter() == null) {
            this.f704f.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f701c;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f701c = null;
        }
        this.f704f.setSelection(this.f709k);
    }

    public final boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f704f);
        addView(this.f703e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f704f.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f701c;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.b.p.a aVarB = a.b.p.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f707i = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f701c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r6.setFillViewport(r3)
            a.b.q.f0 r4 = r6.f703e
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3f
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3f
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2f
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.f706h = r8
            goto L36
        L2f:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.f706h = r4
        L36:
            int r8 = r6.f706h
            int r4 = r6.f707i
            int r8 = java.lang.Math.min(r8, r4)
            goto L40
        L3f:
            r8 = -1
        L40:
            r6.f706h = r8
            int r8 = r6.f708j
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4f
            boolean r2 = r6.f705g
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 == 0) goto L67
            a.b.q.f0 r0 = r6.f703e
            r0.measure(r1, r8)
            a.b.q.f0 r0 = r6.f703e
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L67
            r6.e()
            goto L6a
        L67:
            r6.f()
        L6a:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7e
            if (r0 == r7) goto L7e
            int r7 = r6.f709k
            r6.setTabSelected(r7)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.q.n0.onMeasure(int, int):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f705g = z;
    }

    public void setContentHeight(int i2) {
        this.f708j = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f709k = i2;
        int childCount = this.f703e.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f703e.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f704f;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}

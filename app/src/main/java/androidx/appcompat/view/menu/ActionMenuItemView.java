package androidx.appcompat.view.menu;

import a.b.j;
import a.b.p.j.g;
import a.b.p.j.i;
import a.b.p.j.n;
import a.b.p.j.p;
import a.b.q.e0;
import a.b.q.w0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f4098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f4099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f4100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g.b f4101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f4102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f4103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4106o;
    public int p;
    public int q;

    public class a extends e0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // a.b.q.e0
        public p b() {
            b bVar = ActionMenuItemView.this.f4103l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // a.b.q.e0
        public boolean c() {
            p pVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f4101j;
            return bVar != null && bVar.a(actionMenuItemView.f4098g) && (pVarB = b()) != null && pVarB.a();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f4104m = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.v, i2, 0);
        this.f4106o = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f4098g.getIcon() == null;
    }

    @Override // a.b.p.j.n.a
    public boolean d() {
        return true;
    }

    @Override // a.b.p.j.n.a
    public void e(i iVar, int i2) {
        this.f4098g = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f4102k == null) {
            this.f4102k = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // a.b.p.j.n.a
    public i getItemData() {
        return this.f4098g;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f4099h);
        if (this.f4100i != null && (!this.f4098g.B() || (!this.f4104m && !this.f4105n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f4099h : null);
        CharSequence contentDescription = this.f4098g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f4098g.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f4098g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            w0.a(this, z3 ? null : this.f4098g.getTitle());
        } else {
            w0.a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f4101j;
        if (bVar != null) {
            bVar.a(this.f4098g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4104m = g();
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean zF = f();
        if (zF && (i4 = this.p) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f4106o) : this.f4106o;
        if (mode != 1073741824 && this.f4106o > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zF || this.f4100i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4100i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        if (this.f4098g.hasSubMenu() && (e0Var = this.f4102k) != null && e0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4105n != z) {
            this.f4105n = z;
            i iVar = this.f4098g;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4100i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.q;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(g.b bVar) {
        this.f4101j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.p = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f4103l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4099h = charSequence;
        h();
    }
}

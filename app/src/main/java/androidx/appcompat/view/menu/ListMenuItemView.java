package androidx.appcompat.view.menu;

import a.b.a;
import a.b.f;
import a.b.g;
import a.b.j;
import a.b.p.j.i;
import a.b.p.j.n;
import a.b.q.u0;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f4111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f4112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f4113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f4114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f4115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f4116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f4117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f4118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f4119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f4120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f4122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f4124o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.G);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        u0 u0VarV = u0.v(getContext(), attributeSet, j.e2, i2, 0);
        this.f4120k = u0VarV.g(j.g2);
        this.f4121l = u0VarV.n(j.f2, -1);
        this.f4123n = u0VarV.a(j.h2, false);
        this.f4122m = context;
        this.f4124o = u0VarV.g(j.i2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.C, 0);
        this.p = typedArrayObtainStyledAttributes.hasValue(0);
        u0VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f4117h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4118i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4118i.getLayoutParams();
        rect.top += this.f4118i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i2) {
        LinearLayout linearLayout = this.f4119j;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    public final void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.f93h, (ViewGroup) this, false);
        this.f4115f = checkBox;
        a(checkBox);
    }

    @Override // a.b.p.j.n.a
    public boolean d() {
        return false;
    }

    @Override // a.b.p.j.n.a
    public void e(i iVar, int i2) {
        this.f4111b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.f94i, (ViewGroup) this, false);
        this.f4112c = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.f96k, (ViewGroup) this, false);
        this.f4113d = radioButton;
        a(radioButton);
    }

    @Override // a.b.p.j.n.a
    public i getItemData() {
        return this.f4111b;
    }

    public void h(boolean z, char c2) {
        int i2 = (z && this.f4111b.A()) ? 0 : 8;
        if (i2 == 0) {
            this.f4116g.setText(this.f4111b.h());
        }
        if (this.f4116g.getVisibility() != i2) {
            this.f4116g.setVisibility(i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        x.s0(this, this.f4120k);
        TextView textView = (TextView) findViewById(f.M);
        this.f4114e = textView;
        int i2 = this.f4121l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f4122m, i2);
        }
        this.f4116g = (TextView) findViewById(f.F);
        ImageView imageView = (ImageView) findViewById(f.I);
        this.f4117h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4124o);
        }
        this.f4118i = (ImageView) findViewById(f.r);
        this.f4119j = (LinearLayout) findViewById(f.f82l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f4112c != null && this.f4123n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4112c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f4113d == null && this.f4115f == null) {
            return;
        }
        if (this.f4111b.m()) {
            if (this.f4113d == null) {
                g();
            }
            compoundButton = this.f4113d;
            compoundButton2 = this.f4115f;
        } else {
            if (this.f4115f == null) {
                c();
            }
            compoundButton = this.f4115f;
            compoundButton2 = this.f4113d;
        }
        if (z) {
            compoundButton.setChecked(this.f4111b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f4115f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f4113d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f4111b.m()) {
            if (this.f4113d == null) {
                g();
            }
            compoundButton = this.f4113d;
        } else {
            if (this.f4115f == null) {
                c();
            }
            compoundButton = this.f4115f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.f4123n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f4118i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f4111b.z() || this.r;
        if (z || this.f4123n) {
            ImageView imageView = this.f4112c;
            if (imageView == null && drawable == null && !this.f4123n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f4123n) {
                this.f4112c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f4112c;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f4112c.getVisibility() != 0) {
                this.f4112c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i2;
        TextView textView;
        if (charSequence != null) {
            this.f4114e.setText(charSequence);
            if (this.f4114e.getVisibility() == 0) {
                return;
            }
            textView = this.f4114e;
            i2 = 0;
        } else {
            i2 = 8;
            if (this.f4114e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f4114e;
            }
        }
        textView.setVisibility(i2);
    }
}

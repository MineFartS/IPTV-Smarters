package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c.f.a.c.d.u.i;
import c.f.a.c.d.u.j;
import c.f.a.c.d.u.k;
import c.f.a.c.d.u.l;
import c.f.a.c.d.u.m;
import c.f.a.c.d.u.n;
import c.f.a.c.d.u.o;
import c.f.a.c.d.u.p;
import c.f.a.c.d.u.u.m.h;
import c.f.a.c.d.v.b;
import c.f.a.c.j.c.g7;
import c.f.a.c.j.c.nc;

/* JADX INFO: loaded from: classes2.dex */
public class MiniControllerFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f24212b = new b("MiniControllerFragment");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f24216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f24221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView[] f24222l = new ImageView[3];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24225o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public c.f.a.c.d.u.u.l.b z;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(RelativeLayout relativeLayout, int i2, int i3) {
        ImageView imageView = (ImageView) relativeLayout.findViewById(i2);
        int i4 = this.f24221k[i3];
        if (i4 == l.s) {
            imageView.setVisibility(4);
            return;
        }
        if (i4 != l.r) {
            if (i4 == l.v) {
                int i5 = this.f24224n;
                int i6 = this.f24225o;
                int i7 = this.p;
                if (this.f24223m == 1) {
                    i5 = this.q;
                    i6 = this.r;
                    i7 = this.s;
                }
                Drawable drawableB = h.b(getContext(), this.f24220j, i5);
                Drawable drawableB2 = h.b(getContext(), this.f24220j, i6);
                Drawable drawableB3 = h.b(getContext(), this.f24220j, i7);
                imageView.setImageDrawable(drawableB2);
                ProgressBar progressBar = new ProgressBar(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(8, i2);
                layoutParams.addRule(6, i2);
                layoutParams.addRule(5, i2);
                layoutParams.addRule(7, i2);
                layoutParams.addRule(15);
                progressBar.setLayoutParams(layoutParams);
                progressBar.setVisibility(8);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                int i8 = this.f24219i;
                if (i8 != 0 && indeterminateDrawable != null) {
                    indeterminateDrawable.setColorFilter(i8, PorterDuff.Mode.SRC_IN);
                }
                relativeLayout.addView(progressBar);
                this.z.s(imageView, drawableB, drawableB2, drawableB3, progressBar, true);
                return;
            }
            if (i4 == l.y) {
                imageView.setImageDrawable(h.b(getContext(), this.f24220j, this.t));
                imageView.setContentDescription(getResources().getString(n.s));
                this.z.F(imageView, 0);
                return;
            }
            if (i4 == l.x) {
                imageView.setImageDrawable(h.b(getContext(), this.f24220j, this.u));
                imageView.setContentDescription(getResources().getString(n.r));
                this.z.E(imageView, 0);
                return;
            }
            if (i4 == l.w) {
                imageView.setImageDrawable(h.b(getContext(), this.f24220j, this.v));
                imageView.setContentDescription(getResources().getString(n.q));
                this.z.D(imageView, 30000L);
            } else if (i4 == l.t) {
                imageView.setImageDrawable(h.b(getContext(), this.f24220j, this.w));
                imageView.setContentDescription(getResources().getString(n.f11893j));
                this.z.A(imageView, 30000L);
            } else if (i4 == l.u) {
                imageView.setImageDrawable(h.b(getContext(), this.f24220j, this.x));
                this.z.r(imageView);
            } else if (i4 == l.q) {
                imageView.setImageDrawable(h.b(getContext(), this.f24220j, this.y));
                this.z.z(imageView);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.z = new c.f.a.c.d.u.u.l.b(getActivity());
        View viewInflate = layoutInflater.inflate(m.f11881b, viewGroup);
        viewInflate.setVisibility(8);
        this.z.H(viewInflate, 8);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(l.C);
        int i2 = this.f24217g;
        if (i2 != 0) {
            relativeLayout.setBackgroundResource(i2);
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(l.F);
        TextView textView = (TextView) viewInflate.findViewById(l.T);
        if (this.f24214d != 0) {
            textView.setTextAppearance(getActivity(), this.f24214d);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(l.P);
        this.f24216f = textView2;
        if (this.f24215e != 0) {
            textView2.setTextAppearance(getActivity(), this.f24215e);
        }
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(l.K);
        if (this.f24218h != 0) {
            ((LayerDrawable) progressBar.getProgressDrawable()).setColorFilter(this.f24218h, PorterDuff.Mode.SRC_IN);
        }
        this.z.w(textView, "com.google.android.gms.cast.metadata.TITLE");
        this.z.y(this.f24216f);
        this.z.t(progressBar);
        this.z.B(relativeLayout);
        if (this.f24213c) {
            this.z.p(imageView, new c.f.a.c.d.u.u.b(2, getResources().getDimensionPixelSize(j.f11843b), getResources().getDimensionPixelSize(j.f11842a)), k.f11850a);
        } else {
            imageView.setVisibility(8);
        }
        ImageView[] imageViewArr = this.f24222l;
        int i3 = l.f11876l;
        imageViewArr[0] = (ImageView) relativeLayout.findViewById(i3);
        ImageView[] imageViewArr2 = this.f24222l;
        int i4 = l.f11877m;
        imageViewArr2[1] = (ImageView) relativeLayout.findViewById(i4);
        ImageView[] imageViewArr3 = this.f24222l;
        int i5 = l.f11878n;
        imageViewArr3[2] = (ImageView) relativeLayout.findViewById(i5);
        l(relativeLayout, i3, 0);
        l(relativeLayout, i4, 1);
        l(relativeLayout, i5, 2);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        c.f.a.c.d.u.u.l.b bVar = this.z;
        if (bVar != null) {
            bVar.I();
            this.z = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        if (this.f24221k == null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.B, i.f11839b, o.f11900b);
            this.f24213c = typedArrayObtainStyledAttributes.getBoolean(p.N, true);
            this.f24214d = typedArrayObtainStyledAttributes.getResourceId(p.S, 0);
            this.f24215e = typedArrayObtainStyledAttributes.getResourceId(p.R, 0);
            this.f24217g = typedArrayObtainStyledAttributes.getResourceId(p.C, 0);
            int color = typedArrayObtainStyledAttributes.getColor(p.L, 0);
            this.f24218h = color;
            this.f24219i = typedArrayObtainStyledAttributes.getColor(p.H, color);
            this.f24220j = typedArrayObtainStyledAttributes.getResourceId(p.D, 0);
            int i2 = p.K;
            this.f24224n = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            int i3 = p.J;
            this.f24225o = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            int i4 = p.Q;
            this.p = typedArrayObtainStyledAttributes.getResourceId(i4, 0);
            this.q = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            this.r = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            this.s = typedArrayObtainStyledAttributes.getResourceId(i4, 0);
            this.t = typedArrayObtainStyledAttributes.getResourceId(p.P, 0);
            this.u = typedArrayObtainStyledAttributes.getResourceId(p.O, 0);
            this.v = typedArrayObtainStyledAttributes.getResourceId(p.M, 0);
            this.w = typedArrayObtainStyledAttributes.getResourceId(p.G, 0);
            this.x = typedArrayObtainStyledAttributes.getResourceId(p.I, 0);
            this.y = typedArrayObtainStyledAttributes.getResourceId(p.E, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(p.F, 0);
            if (resourceId != 0) {
                TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                c.f.a.c.f.q.o.a(typedArrayObtainTypedArray.length() == 3);
                this.f24221k = new int[typedArrayObtainTypedArray.length()];
                for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
                    this.f24221k[i5] = typedArrayObtainTypedArray.getResourceId(i5, 0);
                }
                typedArrayObtainTypedArray.recycle();
                if (this.f24213c) {
                    this.f24221k[0] = l.s;
                }
                this.f24223m = 0;
                for (int i6 : this.f24221k) {
                    if (i6 != l.s) {
                        this.f24223m++;
                    }
                }
            } else {
                f24212b.g("Unable to read attribute castControlButtons.", new Object[0]);
                int i7 = l.s;
                this.f24221k = new int[]{i7, i7, i7};
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        nc.c(g7.CAF_MINI_CONTROLLER);
    }
}

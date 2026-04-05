package mbanje.kurt.fabbutton;

import a.i.r.c0;
import a.i.r.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import j.a.a.c;
import j.a.a.d;
import j.a.a.e;
import j.a.a.f;
import j.a.a.g;
import java.util.List;
import mbanje.kurt.fabbutton.CircleImageView;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
@CoordinatorLayout.d(Behavior.class)
public class FabButton extends FrameLayout implements CircleImageView.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CircleImageView f31177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressRingView f31178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31184i;

    public static class Behavior extends CoordinatorLayout.c<FabButton> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f31185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f31187c;

        public class a implements c0 {
            public a() {
            }

            @Override // a.i.r.c0
            public void a(View view) {
                Behavior.this.f31186b = false;
            }

            @Override // a.i.r.c0
            public void b(View view) {
                Behavior.this.f31186b = false;
                view.setVisibility(8);
            }

            @Override // a.i.r.c0
            public void c(View view) {
                Behavior.this.f31186b = true;
            }
        }

        public final void F(FabButton fabButton) {
            fabButton.setVisibility(0);
            x.d(fabButton).d(1.0f).e(1.0f).a(1.0f).g(j.a.a.a.f30419b).n().h(null).l();
        }

        public final void G(FabButton fabButton) {
            x.d(fabButton).d(0.0f).e(0.0f).a(0.0f).g(j.a.a.a.f30419b).n().h(new a()).l();
        }

        public final float H(CoordinatorLayout coordinatorLayout, FabButton fabButton) {
            List<View> listS = coordinatorLayout.s(fabButton);
            int size = listS.size();
            float fMin = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                View view = listS.get(i2);
                if ((view instanceof Snackbar$SnackbarLayout) && coordinatorLayout.g(fabButton, view)) {
                    fMin = Math.min(fMin, x.M(view) - view.getHeight());
                }
            }
            return fMin;
        }

        public final int I(AppBarLayout appBarLayout) {
            int iD = x.D(appBarLayout);
            if (iD != 0) {
                return (iD * 2) + 0;
            }
            int childCount = appBarLayout.getChildCount();
            if (childCount >= 1) {
                return 0 + (x.D(appBarLayout.getChildAt(childCount - 1)) * 2);
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean e(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            return view instanceof Snackbar$SnackbarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            if (view instanceof Snackbar$SnackbarLayout) {
                L(coordinatorLayout, fabButton, view);
                return false;
            }
            if (!(view instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f31185a == null) {
                this.f31185a = new Rect();
            }
            Rect rect = this.f31185a;
            g.a(coordinatorLayout, view, rect);
            if (rect.bottom > I(appBarLayout)) {
                if (fabButton.getVisibility() == 0) {
                    return false;
                }
                F(fabButton);
                return false;
            }
            if (this.f31186b || fabButton.getVisibility() != 0) {
                return false;
            }
            G(fabButton);
            return false;
        }

        public final void L(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            float fH = H(coordinatorLayout, fabButton);
            if (fH != this.f31187c) {
                x.d(fabButton).b();
                if (Math.abs(fH - this.f31187c) == view.getHeight()) {
                    x.d(fabButton).m(fH).g(j.a.a.a.f30419b).h(null);
                } else {
                    x.H0(fabButton, fH);
                }
                this.f31187c = fH;
            }
        }
    }

    public FabButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31179d = 0.14f;
        c(context, attributeSet, 0);
    }

    @Override // mbanje.kurt.fabbutton.CircleImageView.b
    public void a() {
        this.f31177b.h(this.f31183h, this.f31184i);
        if (this.f31184i) {
            this.f31178c.setVisibility(8);
        }
    }

    @Override // mbanje.kurt.fabbutton.CircleImageView.b
    public void b(boolean z) {
        if (z) {
            this.f31178c.setVisibility(0);
            this.f31178c.e();
        } else {
            this.f31178c.f(true);
            this.f31178c.setVisibility(8);
        }
    }

    public void c(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        float f2;
        int resourceId;
        View viewInflate = View.inflate(context, e.f30435a, this);
        setClipChildren(false);
        this.f31177b = (CircleImageView) viewInflate.findViewById(d.f30433a);
        this.f31178c = (ProgressRingView) viewInflate.findViewById(d.f30434b);
        this.f31177b.setFabViewListener(this);
        this.f31178c.setFabViewListener(this);
        float f3 = 0.0f;
        int i4 = DefaultRenderer.BACKGROUND_COLOR;
        int integer = 4000;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.z);
            int color = typedArrayObtainStyledAttributes.getColor(f.I, DefaultRenderer.BACKGROUND_COLOR);
            int color2 = typedArrayObtainStyledAttributes.getColor(f.M, DefaultRenderer.BACKGROUND_COLOR);
            f3 = typedArrayObtainStyledAttributes.getFloat(f.C, 0.0f);
            f2 = typedArrayObtainStyledAttributes.getFloat(f.B, 100.0f);
            this.f31180e = typedArrayObtainStyledAttributes.getBoolean(f.D, false);
            this.f31181f = typedArrayObtainStyledAttributes.getBoolean(f.J, true);
            integer = typedArrayObtainStyledAttributes.getInteger(f.E, 4000);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(f.A, -1);
            this.f31179d = typedArrayObtainStyledAttributes.getFloat(f.N, this.f31179d);
            this.f31182g = typedArrayObtainStyledAttributes.getResourceId(f.K, c.f30432a);
            this.f31183h = typedArrayObtainStyledAttributes.getBoolean(f.O, false);
            this.f31184i = typedArrayObtainStyledAttributes.getBoolean(f.L, false);
            this.f31177b.setShowShadow(typedArrayObtainStyledAttributes.getBoolean(f.P, true));
            typedArrayObtainStyledAttributes.recycle();
            i3 = color2;
            i4 = color;
        } else {
            i3 = DefaultRenderer.BACKGROUND_COLOR;
            f2 = 0.0f;
            resourceId = -1;
        }
        this.f31177b.setColor(i4);
        this.f31177b.setShowEndBitmap(this.f31183h);
        this.f31177b.setRingWidthRatio(this.f31179d);
        this.f31178c.setProgressColor(i3);
        this.f31178c.setProgress(f3);
        this.f31178c.setMaxProgress(f2);
        this.f31178c.setAutostartanim(this.f31181f);
        this.f31178c.setAnimDuration(integer);
        this.f31178c.setRingWidthRatio(this.f31179d);
        this.f31178c.setIndeterminate(this.f31180e);
        if (resourceId != -1) {
            this.f31177b.f(resourceId, this.f31182g);
        }
    }

    public void d(boolean z) {
        this.f31177b.i(z);
    }

    public void e(boolean z) {
        this.f31177b.setShowShadow(z);
        invalidate();
    }

    public void setColor(int i2) {
        this.f31177b.setColor(i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f31177b.setEnabled(z);
        this.f31178c.setEnabled(z);
    }

    public void setIndeterminate(boolean z) {
        this.f31180e = z;
        this.f31178c.setIndeterminate(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f31178c.setOnClickListener(onClickListener);
        this.f31177b.setOnClickListener(onClickListener);
    }

    public void setProgress(float f2) {
        this.f31178c.setProgress(f2);
    }

    public void setProgressColor(int i2) {
        this.f31178c.setProgressColor(i2);
    }

    public void setShadow(boolean z) {
        this.f31177b.setShowShadow(z);
    }
}

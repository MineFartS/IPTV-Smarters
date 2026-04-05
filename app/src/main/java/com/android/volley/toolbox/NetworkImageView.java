package com.android.volley.toolbox;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import c.c.b.u;
import c.c.b.w.i;
import c.c.b.w.l;

/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f18895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.g f18896f;

    public class a implements i.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f18897a;

        /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$a$a, reason: collision with other inner class name */
        public class RunnableC0269a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i.g f18899b;

            public RunnableC0269a(i.g gVar) {
                this.f18899b = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.f18899b, false);
            }
        }

        public a(boolean z) {
            this.f18897a = z;
        }

        @Override // c.c.b.w.i.h
        public void a(i.g gVar, boolean z) {
            if (z && this.f18897a) {
                NetworkImageView.this.post(new RunnableC0269a(gVar));
                return;
            }
            if (gVar.d() != null) {
                NetworkImageView.this.setImageBitmap(gVar.d());
            } else if (NetworkImageView.this.f18893c != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f18893c);
            }
        }

        @Override // c.c.b.p.a
        public void b(u uVar) {
            if (NetworkImageView.this.f18894d != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f18894d);
            }
        }
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            android.widget.ImageView$ScaleType r7 = r8.getScaleType()
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2a
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            int r2 = r2.width
            r5 = -2
            if (r2 != r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            int r6 = r6.height
            if (r6 != r5) goto L2b
            r5 = 1
            goto L2c
        L2a:
            r2 = 0
        L2b:
            r5 = 0
        L2c:
            if (r2 == 0) goto L31
            if (r5 == 0) goto L31
            goto L32
        L31:
            r3 = 0
        L32:
            if (r0 != 0) goto L39
            if (r1 != 0) goto L39
            if (r3 != 0) goto L39
            return
        L39:
            java.lang.String r3 = r8.f18892b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L4f
            c.c.b.w.i$g r9 = r8.f18896f
            if (r9 == 0) goto L4b
            r9.c()
            r9 = 0
            r8.f18896f = r9
        L4b:
            r8.d()
            return
        L4f:
            c.c.b.w.i$g r3 = r8.f18896f
            if (r3 == 0) goto L70
            java.lang.String r3 = r3.e()
            if (r3 == 0) goto L70
            c.c.b.w.i$g r3 = r8.f18896f
            java.lang.String r3 = r3.e()
            java.lang.String r6 = r8.f18892b
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L68
            return
        L68:
            c.c.b.w.i$g r3 = r8.f18896f
            r3.c()
            r8.d()
        L70:
            if (r2 == 0) goto L73
            r0 = 0
        L73:
            if (r5 == 0) goto L77
            r6 = 0
            goto L78
        L77:
            r6 = r1
        L78:
            c.c.b.w.i r2 = r8.f18895e
            java.lang.String r3 = r8.f18892b
            com.android.volley.toolbox.NetworkImageView$a r4 = new com.android.volley.toolbox.NetworkImageView$a
            r4.<init>(r9)
            r5 = r0
            c.c.b.w.i$g r9 = r2.g(r3, r4, r5, r6, r7)
            r8.f18896f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.NetworkImageView.c(boolean):void");
    }

    public final void d() {
        int i2 = this.f18893c;
        if (i2 != 0) {
            setImageResource(i2);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public void e(String str, i iVar) {
        l.a();
        this.f18892b = str;
        this.f18895e = iVar;
        c(false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        i.g gVar = this.f18896f;
        if (gVar != null) {
            gVar.c();
            setImageBitmap(null);
            this.f18896f = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c(true);
    }

    public void setDefaultImageResId(int i2) {
        this.f18893c = i2;
    }

    public void setErrorImageResId(int i2) {
        this.f18894d = i2;
    }
}

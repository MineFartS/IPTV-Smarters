package c.f.a.c.d.u.u.m;

import android.annotation.TargetApi;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c.f.a.c.d.u.k;
import c.f.a.c.d.u.l;
import c.f.a.c.d.u.m;
import c.f.a.c.d.u.n;
import c.f.a.c.d.u.o;
import c.f.a.c.d.u.q;
import c.f.a.c.d.u.r;
import c.f.a.c.d.u.s;
import c.f.a.c.d.u.u.i;
import c.f.a.c.d.u.u.k.p;
import c.f.a.c.j.c.g7;
import c.f.a.c.j.c.nc;
import c.f.a.c.j.c.r0;
import c.f.a.c.j.c.s0;
import c.f.a.c.j.c.t0;
import c.f.a.c.j.c.u0;
import com.amazonaws.event.ProgressEvent;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.Timer;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a extends a.b.k.c {
    public ImageView A;
    public ImageView B;
    public int[] C;
    public ImageView[] D = new ImageView[4];
    public View E;
    public View F;
    public ImageView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public c.f.a.c.d.u.u.k.b L;
    public c.f.a.c.d.u.u.l.b M;
    public r N;
    public boolean O;
    public boolean P;
    public Timer Q;
    public String R;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s<c.f.a.c.d.u.d> f12088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i.b f12089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12099o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public TextView x;
    public SeekBar y;
    public CastSeekBar z;

    /* JADX INFO: renamed from: c.f.a.c.d.u.u.m.a$a, reason: collision with other inner class name */
    public class C0155a implements i.b {
        public C0155a() {
        }

        public /* synthetic */ C0155a(a aVar, d dVar) {
            this();
        }

        @Override // c.f.a.c.d.u.u.i.b
        public final void a() {
            a.this.H0();
        }

        @Override // c.f.a.c.d.u.u.i.b
        public final void b() {
        }

        @Override // c.f.a.c.d.u.u.i.b
        public final void c() {
        }

        @Override // c.f.a.c.d.u.u.i.b
        public final void d() {
            i iVarY0 = a.this.y0();
            if (iVarY0 == null || !iVarY0.p()) {
                if (a.this.O) {
                    return;
                }
                a.this.finish();
            } else {
                a.C0(a.this, false);
                a.this.I0();
                a.this.J0();
            }
        }

        @Override // c.f.a.c.d.u.u.i.b
        public final void e() {
            a.this.J0();
        }

        @Override // c.f.a.c.d.u.u.i.b
        public final void f() {
            a.this.x.setText(a.this.getResources().getString(n.f11889f));
        }
    }

    public class b implements s<c.f.a.c.d.u.d> {
        public b() {
        }

        public /* synthetic */ b(a aVar, d dVar) {
            this();
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void g(q qVar, int i2) {
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void h(q qVar, String str) {
        }

        @Override // c.f.a.c.d.u.s
        public final /* synthetic */ void i(q qVar, int i2) {
            a.this.finish();
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void j(q qVar, String str) {
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void k(q qVar, int i2) {
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void l(q qVar, boolean z) {
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void m(q qVar, int i2) {
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void n(q qVar) {
        }

        @Override // c.f.a.c.d.u.s
        public final /* bridge */ /* synthetic */ void o(q qVar) {
        }
    }

    public a() {
        d dVar = null;
        this.f12088d = new b(this, dVar);
        this.f12089e = new C0155a(this, dVar);
    }

    public static /* synthetic */ boolean C0(a aVar, boolean z) {
        aVar.O = false;
        return false;
    }

    public final void A0(View view, int i2, int i3, c.f.a.c.d.u.u.l.b bVar) {
        ImageView imageView = (ImageView) view.findViewById(i2);
        if (i3 == l.s) {
            imageView.setVisibility(4);
            return;
        }
        if (i3 != l.r) {
            if (i3 == l.v) {
                imageView.setBackgroundResource(this.f12090f);
                Drawable drawableD = h.d(this, this.t, this.f12092h);
                Drawable drawableD2 = h.d(this, this.t, this.f12091g);
                Drawable drawableD3 = h.d(this, this.t, this.f12093i);
                imageView.setImageDrawable(drawableD2);
                bVar.s(imageView, drawableD2, drawableD, drawableD3, null, false);
                return;
            }
            if (i3 == l.y) {
                imageView.setBackgroundResource(this.f12090f);
                imageView.setImageDrawable(h.d(this, this.t, this.f12094j));
                imageView.setContentDescription(getResources().getString(n.s));
                bVar.F(imageView, 0);
                return;
            }
            if (i3 == l.x) {
                imageView.setBackgroundResource(this.f12090f);
                imageView.setImageDrawable(h.d(this, this.t, this.f12095k));
                imageView.setContentDescription(getResources().getString(n.r));
                bVar.E(imageView, 0);
                return;
            }
            if (i3 == l.w) {
                imageView.setBackgroundResource(this.f12090f);
                imageView.setImageDrawable(h.d(this, this.t, this.f12096l));
                imageView.setContentDescription(getResources().getString(n.q));
                bVar.D(imageView, 30000L);
                return;
            }
            if (i3 == l.t) {
                imageView.setBackgroundResource(this.f12090f);
                imageView.setImageDrawable(h.d(this, this.t, this.f12097m));
                imageView.setContentDescription(getResources().getString(n.f11893j));
                bVar.A(imageView, 30000L);
                return;
            }
            if (i3 == l.u) {
                imageView.setBackgroundResource(this.f12090f);
                imageView.setImageDrawable(h.d(this, this.t, this.f12098n));
                bVar.r(imageView);
            } else if (i3 == l.q) {
                imageView.setBackgroundResource(this.f12090f);
                imageView.setImageDrawable(h.d(this, this.t, this.f12099o));
                bVar.z(imageView);
            }
        }
    }

    public final void H0() {
        MediaInfo mediaInfoJ;
        c.f.a.c.d.l lVarP;
        a.b.k.a aVarN0;
        i iVarY0 = y0();
        if (iVarY0 == null || !iVarY0.p() || (mediaInfoJ = iVarY0.j()) == null || (lVarP = mediaInfoJ.P()) == null || (aVarN0 = n0()) == null) {
            return;
        }
        aVarN0.w(lVarP.K("com.google.android.gms.cast.metadata.TITLE"));
        aVarN0.v(p.a(lVarP));
    }

    public final void I0() {
        CastDevice castDeviceO;
        c.f.a.c.d.u.d dVarC = this.N.c();
        if (dVarC != null && (castDeviceO = dVarC.o()) != null) {
            String strJ = castDeviceO.J();
            if (!TextUtils.isEmpty(strJ)) {
                this.x.setText(getResources().getString(n.f11885b, strJ));
                return;
            }
        }
        this.x.setText(BuildConfig.FLAVOR);
    }

    @TargetApi(23)
    public final void J0() {
        String string;
        Drawable drawable;
        Bitmap bitmap;
        Bitmap bitmapA;
        i iVarY0 = y0();
        if (iVarY0 == null || iVarY0.l() == null) {
            return;
        }
        String strO = null;
        if (!iVarY0.l().i0()) {
            this.K.setVisibility(8);
            this.J.setVisibility(8);
            this.E.setVisibility(8);
            if (c.f.a.c.f.t.l.c()) {
                this.B.setVisibility(8);
                this.B.setImageBitmap(null);
                return;
            }
            return;
        }
        if (c.f.a.c.f.t.l.c() && this.B.getVisibility() == 8 && (drawable = this.A.getDrawable()) != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && (bitmapA = h.a(this, bitmap, 0.25f, 7.5f)) != null) {
            this.B.setImageBitmap(bitmapA);
            this.B.setVisibility(0);
        }
        c.f.a.c.d.a aVarK = iVarY0.l().K();
        if (aVarK != null) {
            String strQ = aVarK.Q();
            strO = aVarK.O();
            string = strQ;
        } else {
            string = null;
        }
        if (!TextUtils.isEmpty(strO)) {
            P0(strO);
        } else if (TextUtils.isEmpty(this.R)) {
            this.H.setVisibility(0);
            this.F.setVisibility(0);
            this.G.setVisibility(8);
        } else {
            strO = this.R;
            P0(strO);
        }
        TextView textView = this.I;
        if (TextUtils.isEmpty(string)) {
            string = getResources().getString(n.f11884a);
        }
        textView.setText(string);
        if (c.f.a.c.f.t.l.h()) {
            this.I.setTextAppearance(this.u);
        } else {
            this.I.setTextAppearance(this, this.u);
        }
        this.E.setVisibility(0);
        L0(iVarY0);
    }

    public final void L0(i iVar) {
        if (this.O || iVar.q()) {
            return;
        }
        this.J.setVisibility(8);
        this.K.setVisibility(8);
        c.f.a.c.d.a aVarK = iVar.l().K();
        if (aVarK == null || aVarK.S() == -1) {
            return;
        }
        if (!this.P) {
            e eVar = new e(this, iVar);
            Timer timer = new Timer();
            this.Q = timer;
            timer.scheduleAtFixedRate(eVar, 0L, 500L);
            this.P = true;
        }
        if (aVarK.S() - iVar.d() > 0.0f) {
            this.K.setVisibility(0);
            this.K.setText(getResources().getString(n.f11890g, Integer.valueOf((int) Math.ceil(r10 / 1000.0f))));
            this.J.setClickable(false);
        } else {
            if (this.P) {
                this.Q.cancel();
                this.P = false;
            }
            this.J.setVisibility(0);
            this.J.setClickable(true);
        }
    }

    public final void P0(String str) {
        this.L.e(Uri.parse(str));
        this.F.setVisibility(8);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r rVarC = c.f.a.c.d.u.b.e(this).c();
        this.N = rVarC;
        if (rVarC.c() == null) {
            finish();
        }
        c.f.a.c.d.u.u.l.b bVar = new c.f.a.c.d.u.u.l.b(this);
        this.M = bVar;
        bVar.c0(this.f12089e);
        setContentView(m.f11880a);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(new int[]{a.b.a.O});
        this.f12090f = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = obtainStyledAttributes(null, c.f.a.c.d.u.p.f11901a, c.f.a.c.d.u.i.f11838a, o.f11899a);
        this.t = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11909i, 0);
        this.f12091g = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.r, 0);
        this.f12092h = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.q, 0);
        this.f12093i = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.z, 0);
        this.f12094j = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.y, 0);
        this.f12095k = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.x, 0);
        this.f12096l = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.s, 0);
        this.f12097m = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11914n, 0);
        this.f12098n = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.p, 0);
        this.f12099o = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11910j, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11911k, 0);
        if (resourceId != 0) {
            TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(resourceId);
            c.f.a.c.f.q.o.a(typedArrayObtainTypedArray.length() == 4);
            this.C = new int[typedArrayObtainTypedArray.length()];
            for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                this.C[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
            }
            typedArrayObtainTypedArray.recycle();
        } else {
            int i3 = l.s;
            this.C = new int[]{i3, i3, i3, i3};
        }
        this.s = typedArrayObtainStyledAttributes2.getColor(c.f.a.c.d.u.p.f11913m, 0);
        this.p = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11906f, 0));
        this.q = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11905e, 0));
        this.r = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11908h, 0));
        this.u = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11907g, 0);
        this.v = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11903c, 0);
        this.w = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11904d, 0);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(c.f.a.c.d.u.p.f11912l, 0);
        if (resourceId2 != 0) {
            this.R = getApplicationContext().getResources().getString(resourceId2);
        }
        typedArrayObtainStyledAttributes2.recycle();
        View viewFindViewById = findViewById(l.E);
        c.f.a.c.d.u.u.l.b bVar2 = this.M;
        this.A = (ImageView) viewFindViewById.findViewById(l.f11873i);
        this.B = (ImageView) viewFindViewById.findViewById(l.f11875k);
        View viewFindViewById2 = viewFindViewById.findViewById(l.f11874j);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        bVar2.q(this.A, new c.f.a.c.d.u.u.b(4, displayMetrics.widthPixels, displayMetrics.heightPixels), viewFindViewById2);
        this.x = (TextView) viewFindViewById.findViewById(l.O);
        ProgressBar progressBar = (ProgressBar) viewFindViewById.findViewById(l.J);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i4 = this.s;
        if (i4 != 0) {
            indeterminateDrawable.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
        }
        bVar2.C(progressBar);
        TextView textView = (TextView) viewFindViewById.findViewById(l.N);
        TextView textView2 = (TextView) viewFindViewById.findViewById(l.D);
        this.y = (SeekBar) viewFindViewById.findViewById(l.M);
        CastSeekBar castSeekBar = (CastSeekBar) viewFindViewById.findViewById(l.B);
        this.z = castSeekBar;
        bVar2.v(castSeekBar, 1000L);
        bVar2.G(textView, new s0(textView, bVar2.l0()));
        bVar2.G(textView2, new r0(textView2, bVar2.l0()));
        View viewFindViewById3 = viewFindViewById.findViewById(l.I);
        c.f.a.c.d.u.u.l.b bVar3 = this.M;
        bVar3.G(viewFindViewById3, new t0(viewFindViewById3, bVar3.l0()));
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById.findViewById(l.W);
        u0 u0Var = new u0(relativeLayout, this.z, this.M.l0());
        this.M.G(relativeLayout, u0Var);
        this.M.i0(u0Var);
        ImageView[] imageViewArr = this.D;
        int i5 = l.f11876l;
        imageViewArr[0] = (ImageView) viewFindViewById.findViewById(i5);
        ImageView[] imageViewArr2 = this.D;
        int i6 = l.f11877m;
        imageViewArr2[1] = (ImageView) viewFindViewById.findViewById(i6);
        ImageView[] imageViewArr3 = this.D;
        int i7 = l.f11878n;
        imageViewArr3[2] = (ImageView) viewFindViewById.findViewById(i7);
        ImageView[] imageViewArr4 = this.D;
        int i8 = l.f11879o;
        imageViewArr4[3] = (ImageView) viewFindViewById.findViewById(i8);
        A0(viewFindViewById, i5, this.C[0], bVar2);
        A0(viewFindViewById, i6, this.C[1], bVar2);
        A0(viewFindViewById, l.p, l.v, bVar2);
        A0(viewFindViewById, i7, this.C[2], bVar2);
        A0(viewFindViewById, i8, this.C[3], bVar2);
        View viewFindViewById4 = findViewById(l.f11866b);
        this.E = viewFindViewById4;
        this.G = (ImageView) viewFindViewById4.findViewById(l.f11867c);
        this.F = this.E.findViewById(l.f11865a);
        TextView textView3 = (TextView) this.E.findViewById(l.f11869e);
        this.I = textView3;
        textView3.setTextColor(this.r);
        this.I.setBackgroundColor(this.p);
        this.H = (TextView) this.E.findViewById(l.f11868d);
        this.K = (TextView) findViewById(l.f11871g);
        TextView textView4 = (TextView) findViewById(l.f11870f);
        this.J = textView4;
        textView4.setOnClickListener(new f(this));
        v0((Toolbar) findViewById(l.U));
        if (n0() != null) {
            n0().s(true);
            n0().t(k.f11864o);
        }
        I0();
        H0();
        if (this.H != null && this.w != 0) {
            if (c.f.a.c.f.t.l.h()) {
                this.H.setTextAppearance(this.v);
            } else {
                this.H.setTextAppearance(getApplicationContext(), this.v);
            }
            this.H.setTextColor(this.q);
            this.H.setText(this.w);
        }
        c.f.a.c.d.u.u.k.b bVar4 = new c.f.a.c.d.u.u.k.b(getApplicationContext(), new c.f.a.c.d.u.u.b(-1, this.G.getWidth(), this.G.getHeight()));
        this.L = bVar4;
        bVar4.d(new d(this));
        nc.c(g7.CAF_EXPANDED_CONTROLLER);
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        this.L.b();
        c.f.a.c.d.u.u.l.b bVar = this.M;
        if (bVar != null) {
            bVar.c0(null);
            this.M.I();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        c.f.a.c.d.u.b.e(this).c().e(this.f12088d, c.f.a.c.d.u.d.class);
        super.onPause();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        c.f.a.c.d.u.b.e(this).c().a(this.f12088d, c.f.a.c.d.u.d.class);
        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this).c().c();
        if (dVarC == null || (!dVarC.c() && !dVarC.d())) {
            finish();
        }
        i iVarY0 = y0();
        this.O = iVarY0 == null || !iVarY0.p();
        I0();
        J0();
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() ^ 2;
            if (c.f.a.c.f.t.l.b()) {
                systemUiVisibility ^= 4;
            }
            if (c.f.a.c.f.t.l.e()) {
                systemUiVisibility ^= ProgressEvent.PART_FAILED_EVENT_CODE;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
            if (c.f.a.c.f.t.l.d()) {
                setImmersive(true);
            }
        }
    }

    public final i y0() {
        c.f.a.c.d.u.d dVarC = this.N.c();
        if (dVarC == null || !dVarC.c()) {
            return null;
        }
        return dVarC.p();
    }
}

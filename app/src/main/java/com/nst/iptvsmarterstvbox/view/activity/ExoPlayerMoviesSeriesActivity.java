package minefarts.iptvsmarters.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import c.f.a.b.a2;
import c.f.a.b.a3.s;
import c.f.a.b.a3.t;
import c.f.a.b.a3.v;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.g3.f;
import c.f.a.b.g3.j;
import c.f.a.b.g3.l;
import c.f.a.b.h3.a1;
import c.f.a.b.i3.p;
import c.f.a.b.j3.q;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.a0;
import c.f.a.b.k3.e0;
import c.f.a.b.n2;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import c.h.a.k.c.i;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import minefarts.iptvsmarters.R;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ExoPlayerMoviesSeriesActivity extends a.b.k.c implements View.OnClickListener, a1.m {
    public String B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StyledPlayerView f25583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f25584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n2 f25585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f25587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p.a f25588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<p1> f25589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f25590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f.d f25591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.a.b.e3.a1 f25592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25594o;
    public long p;
    public SharedPreferences q;
    public SharedPreferences r;
    public Context s;
    public String t;
    public String y;
    public String u = BuildConfig.FLAVOR;
    public int v = -1;
    public int w = -1;
    public int x = 0;
    public String z = BuildConfig.FLAVOR;
    public String A = BuildConfig.FLAVOR;

    public class b implements q<x1> {
        public b() {
        }

        @Override // c.f.a.b.j3.q
        @SuppressLint({"StringFormatInvalid"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> a(x1 x1Var) {
            String string = ExoPlayerMoviesSeriesActivity.this.getString(R.string.error_generic);
            Throwable cause = x1Var.getCause();
            if (cause instanceof t.a) {
                t.a aVar = (t.a) cause;
                s sVar = aVar.f6494d;
                string = sVar == null ? aVar.getCause() instanceof v.c ? ExoPlayerMoviesSeriesActivity.this.getString(R.string.error_querying_decoders) : aVar.f6493c ? ExoPlayerMoviesSeriesActivity.this.getString(R.string.error_no_secure_decoder, new Object[]{aVar.f6492b}) : ExoPlayerMoviesSeriesActivity.this.getString(R.string.error_no_decoder, new Object[]{aVar.f6492b}) : ExoPlayerMoviesSeriesActivity.this.getString(R.string.error_instantiating_decoder, new Object[]{sVar.f6479a});
            }
            return Pair.create(0, string);
        }
    }

    public class c implements a2.e {
        public c() {
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void C(boolean z) {
            c2.u(this, z);
        }

        @Override // c.f.a.b.b3.f
        public /* synthetic */ void D(c.f.a.b.b3.a aVar) {
            c2.k(this, aVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void E(a2 a2Var, a2.d dVar) {
            c2.f(this, a2Var, dVar);
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void G(int i2, boolean z) {
            c2.e(this, i2, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void H(boolean z, int i2) {
            b2.k(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void J(c.f.a.b.t2.p pVar) {
            c2.a(this, pVar);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
            a0.a(this, i2, i3, i4, f2);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void N() {
            c2.s(this);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void O(p1 p1Var, int i2) {
            c2.i(this, p1Var, i2);
        }

        @Override // c.f.a.b.f3.l
        public /* synthetic */ void Q(List list) {
            c2.c(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void Z(boolean z, int i2) {
            c2.l(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void a(boolean z) {
            c2.v(this, z);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void b(e0 e0Var) {
            c2.z(this, e0Var);
        }

        @Override // c.f.a.b.a2.c
        public void b0(c.f.a.b.e3.a1 a1Var, l lVar) {
            ExoPlayerMoviesSeriesActivity.this.N0();
            if (a1Var != ExoPlayerMoviesSeriesActivity.this.f25592m) {
                j.a aVarG = ExoPlayerMoviesSeriesActivity.this.f25590k.g();
                if (aVarG != null) {
                    if (aVarG.i(2) == 1) {
                        ExoPlayerMoviesSeriesActivity.this.L0(R.string.error_unsupported_video);
                    }
                    if (aVarG.i(1) == 1) {
                        ExoPlayerMoviesSeriesActivity.this.L0(R.string.error_unsupported_audio);
                    }
                }
                ExoPlayerMoviesSeriesActivity.this.f25592m = a1Var;
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void d(z1 z1Var) {
            c2.m(this, z1Var);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void d0(int i2, int i3) {
            c2.w(this, i2, i3);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void f(a2.f fVar, a2.f fVar2, int i2) {
            c2.r(this, fVar, fVar2, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void g(int i2) {
            c2.o(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h(boolean z) {
            b2.d(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h0(x1 x1Var) {
            c2.q(this, x1Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void i(int i2) {
            b2.l(this, i2);
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
            c2.d(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void l(List list) {
            b2.q(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void m0(boolean z) {
            c2.h(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void onRepeatModeChanged(int i2) {
            c2.t(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void p(boolean z) {
            c2.g(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void r() {
            b2.o(this);
        }

        @Override // c.f.a.b.a2.c
        public void s(x1 x1Var) {
            if (x1Var.f10319c == 1002) {
                ExoPlayerMoviesSeriesActivity.this.f25585f.c0();
                ExoPlayerMoviesSeriesActivity.this.f25585f.prepare();
            } else {
                ExoPlayerMoviesSeriesActivity.this.N0();
                ExoPlayerMoviesSeriesActivity.this.K0();
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void t(a2.b bVar) {
            c2.b(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void v(p2 p2Var, int i2) {
            c2.x(this, p2Var, i2);
        }

        @Override // c.f.a.b.a2.c
        public void x(int i2) {
            if (i2 == 4) {
                ExoPlayerMoviesSeriesActivity.this.K0();
            }
            ExoPlayerMoviesSeriesActivity.this.N0();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void H0(DialogInterface dialogInterface) {
        this.f25586g = false;
    }

    public void E0() {
        this.f25593n = true;
        this.f25594o = -1;
        this.p = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7 A[PHI: r16
  0x01c7: PHI (r16v5 android.content.Intent) = 
  (r16v6 android.content.Intent)
  (r16v6 android.content.Intent)
  (r16v6 android.content.Intent)
  (r16v6 android.content.Intent)
  (r16v6 android.content.Intent)
  (r16v7 android.content.Intent)
 binds: [B:69:0x01a8, B:71:0x01ae, B:73:0x01b6, B:75:0x01c0, B:66:0x01a3, B:56:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean F0() {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ExoPlayerMoviesSeriesActivity.F0():boolean");
    }

    public void I0() {
        if (this.f25585f != null) {
            P0();
            O0();
            this.f25585f.g1();
            this.f25585f = null;
            this.f25589j = Collections.emptyList();
            this.f25590k = null;
        }
    }

    public void J0() {
        setContentView(R.layout.player_activity);
    }

    public final void K0() {
        this.f25584e.setVisibility(0);
    }

    public final void L0(int i2) {
        M0(getString(i2));
    }

    public final void M0(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    public final void N0() {
        this.f25587h.setEnabled(this.f25585f != null && c.h.a.k.c.l.i0(this.f25590k));
    }

    public final void O0() {
        n2 n2Var = this.f25585f;
        if (n2Var != null) {
            this.f25593n = n2Var.i();
            this.f25594o = this.f25585f.s();
            this.p = Math.max(0L, this.f25585f.x());
        }
    }

    public final void P0() {
        f fVar = this.f25590k;
        if (fVar != null) {
            this.f25591l = fVar.s();
        }
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f25583d.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.f.a.b.h3.a1.m
    public void e(int i2) {
        this.f25584e.setVisibility(i2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f25587h && !this.f25586g && c.h.a.k.c.l.i0(this.f25590k)) {
            this.f25586g = true;
            c.h.a.k.c.l.R(this.f25590k, new DialogInterface.OnDismissListener() { // from class: c.h.a.k.a.j
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f17365b.H0(dialogInterface);
                }
            }).J(getSupportFragmentManager(), null);
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.s = this;
        super.onCreate(bundle);
        this.f25588i = i.d(this);
        J0();
        this.f25584e = (LinearLayout) findViewById(R.id.controls_root);
        Button button = (Button) findViewById(R.id.select_tracks_button);
        this.f25587h = button;
        button.setOnClickListener(this);
        StyledPlayerView styledPlayerView = (StyledPlayerView) findViewById(R.id.player_view);
        this.f25583d = styledPlayerView;
        styledPlayerView.setControllerVisibilityListener(this);
        this.f25583d.setErrorMessageProvider(new b());
        this.f25583d.requestFocus();
        if (bundle == null) {
            this.f25591l = new f.e(this).w();
            E0();
        } else {
            this.f25591l = (f.d) bundle.getParcelable("track_selector_parameters");
            this.f25593n = bundle.getBoolean("auto_play");
            this.f25594o = bundle.getInt("window");
            this.p = bundle.getLong("position");
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        I0();
        E0();
        setIntent(intent);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (x0.f9296a <= 23) {
            StyledPlayerView styledPlayerView = this.f25583d;
            if (styledPlayerView != null) {
                styledPlayerView.z();
            }
            I0();
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            F0();
        } else {
            L0(R.string.storage_permission_denied);
            finish();
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (x0.f9296a <= 23 || this.f25585f == null) {
            F0();
            StyledPlayerView styledPlayerView = this.f25583d;
            if (styledPlayerView != null) {
                styledPlayerView.A();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        P0();
        O0();
        bundle.putParcelable("track_selector_parameters", this.f25591l);
        bundle.putBoolean("auto_play", this.f25593n);
        bundle.putInt("window", this.f25594o);
        bundle.putLong("position", this.p);
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStart() {
        super.onStart();
        if (x0.f9296a > 23) {
            F0();
            StyledPlayerView styledPlayerView = this.f25583d;
            if (styledPlayerView != null) {
                styledPlayerView.A();
            }
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        if (x0.f9296a > 23) {
            StyledPlayerView styledPlayerView = this.f25583d;
            if (styledPlayerView != null) {
                styledPlayerView.z();
            }
            I0();
        }
    }
}

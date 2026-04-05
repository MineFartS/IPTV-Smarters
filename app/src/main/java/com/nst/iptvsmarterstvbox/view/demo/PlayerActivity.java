package com.nst.iptvsmarterstvbox.view.demo;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import c.f.a.b.a2;
import c.f.a.b.a3.s;
import c.f.a.b.a3.t;
import c.f.a.b.a3.v;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.e3.c1.j;
import c.f.a.b.e3.w;
import c.f.a.b.g3.f;
import c.f.a.b.g3.j;
import c.f.a.b.g3.l;
import c.f.a.b.h3.a1;
import c.f.a.b.i3.p;
import c.f.a.b.j3.g;
import c.f.a.b.j3.o;
import c.f.a.b.j3.q;
import c.f.a.b.j3.r;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.a0;
import c.f.a.b.k3.e0;
import c.f.a.b.l2;
import c.f.a.b.n2;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.x1;
import c.f.a.b.x2.k0;
import c.f.a.b.y2.e.c;
import c.f.a.b.z1;
import c.h.a.k.c.i;
import c.h.a.k.c.k;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerActivity extends a.b.k.c implements View.OnClickListener, a1.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StyledPlayerView f28842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f28843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n2 f28845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f28847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p.a f28848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<p1> f28849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f28850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f.d f28851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f28852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.f.a.b.e3.a1 f28853o;
    public boolean p;
    public int q;
    public long r;
    public j s;

    public class b implements q<x1> {
        public b() {
        }

        @Override // c.f.a.b.j3.q
        @SuppressLint({"StringFormatInvalid"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> a(x1 x1Var) {
            String string = PlayerActivity.this.getString(R.string.error_generic);
            Throwable cause = x1Var.getCause();
            if (cause instanceof t.a) {
                t.a aVar = (t.a) cause;
                s sVar = aVar.f6494d;
                string = sVar == null ? aVar.getCause() instanceof v.c ? PlayerActivity.this.getString(R.string.error_querying_decoders) : aVar.f6493c ? PlayerActivity.this.getString(R.string.error_no_secure_decoder, new Object[]{aVar.f6492b}) : PlayerActivity.this.getString(R.string.error_no_decoder, new Object[]{aVar.f6492b}) : PlayerActivity.this.getString(R.string.error_instantiating_decoder, new Object[]{sVar.f6479a});
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
            PlayerActivity.this.T0();
            if (a1Var != PlayerActivity.this.f28853o) {
                j.a aVarG = PlayerActivity.this.f28850l.g();
                if (aVarG != null) {
                    if (aVarG.i(2) == 1) {
                        PlayerActivity.this.R0(R.string.error_unsupported_video);
                    }
                    if (aVarG.i(1) == 1) {
                        PlayerActivity.this.R0(R.string.error_unsupported_audio);
                    }
                }
                PlayerActivity.this.f28853o = a1Var;
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
                PlayerActivity.this.f28845g.c0();
                PlayerActivity.this.f28845g.prepare();
            } else {
                PlayerActivity.this.T0();
                PlayerActivity.this.Q0();
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
                PlayerActivity.this.Q0();
            }
            PlayerActivity.this.T0();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    public static List<p1> G0(Intent intent, c.h.a.k.c.j jVar) {
        ArrayList arrayList = new ArrayList();
        for (p1 p1VarA : k.f(intent)) {
            c.f.a.b.c3.a0 a0VarG = jVar.g(((p1.g) g.e(p1VarA.f9643d)).f9685a);
            if (a0VarG != null) {
                p1.c cVarA = p1VarA.a();
                cVarA.v(a0VarG.f6663b).B(a0VarG.f6664c).g(a0VarG.f6668g).x(a0VarG.f6665d).y(a0VarG.f6666e).i(a0VarG.f6667f).j(I0(p1VarA));
                p1VarA = cVarA.a();
            }
            arrayList.add(p1VarA);
        }
        return arrayList;
    }

    public static Map<String, String> I0(p1 p1Var) {
        p1.e eVar = p1Var.f9643d.f9687c;
        if (eVar != null) {
            return eVar.f9672c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void M0(DialogInterface dialogInterface) {
        this.f28846h = false;
    }

    public void E0() {
        this.p = true;
        this.q = -1;
        this.r = -9223372036854775807L;
    }

    @SuppressLint({"StringFormatInvalid"})
    public final List<p1> F0(Intent intent) {
        int i2;
        String action = intent.getAction();
        if ("com.google.android.exoplayer.demo.action.VIEW_LIST".equals(action) || "com.google.android.exoplayer.demo.action.VIEW".equals(action)) {
            List<p1> listG0 = G0(intent, i.j(this));
            boolean z = false;
            for (int i3 = 0; i3 < listG0.size(); i3++) {
                p1 p1Var = listG0.get(i3);
                if (!x0.m(p1Var)) {
                    i2 = R.string.error_cleartext_not_permitted;
                } else {
                    if (x0.A0(this, p1Var)) {
                        return Collections.emptyList();
                    }
                    p1.e eVar = ((p1.g) g.e(p1Var.f9643d)).f9687c;
                    if (eVar != null) {
                        if (x0.f9296a < 18) {
                            i2 = R.string.error_drm_unsupported_before_api_18;
                        } else if (!k0.u(eVar.f9670a)) {
                            i2 = R.string.error_drm_unsupported_scheme;
                        }
                    }
                    z |= p1Var.f9643d.f9688d != null;
                }
                R0(i2);
            }
            if (!z) {
                N0();
            }
            return listG0;
        }
        S0(getString(R.string.unexpected_intent_action, new Object[]{action}));
        finish();
        return Collections.emptyList();
    }

    public final c.f.a.b.e3.c1.j H0(p1.b bVar) {
        if (this.s == null) {
            this.s = new c.b(this).a();
        }
        this.s.e(this.f28845g);
        return this.s;
    }

    public boolean J0() {
        if (this.f28845g == null) {
            Intent intent = getIntent();
            List<p1> listF0 = F0(intent);
            this.f28849k = listF0;
            if (listF0.isEmpty()) {
                return false;
            }
            l2 l2VarB = i.b(this, intent.getBooleanExtra("prefer_extension_decoders", false));
            w wVarG = new w(this.f28848j).h(new w.a() { // from class: c.h.a.k.c.d
                @Override // c.f.a.b.e3.w.a
                public final c.f.a.b.e3.c1.j a(p1.b bVar) {
                    return this.f17764a.H0(bVar);
                }
            }).g(this.f28842d);
            f fVar = new f(this);
            this.f28850l = fVar;
            fVar.J(this.f28851m);
            this.f28853o = null;
            n2 n2VarZ = new n2.b(this, l2VarB).A(wVarG).B(this.f28850l).z();
            this.f28845g = n2VarZ;
            n2VarZ.y(new c());
            this.f28845g.M0(new r(this.f28850l));
            this.f28845g.q1(c.f.a.b.t2.p.f10154a, true);
            this.f28845g.v(this.p);
            this.f28842d.setPlayer(this.f28845g);
            o oVar = new o(this.f28845g, this.f28844f);
            this.f28852n = oVar;
            oVar.q();
        }
        int i2 = this.q;
        boolean z = i2 != -1;
        if (z) {
            this.f28845g.g(i2, this.r);
        }
        this.f28845g.r1(this.f28849k, !z);
        this.f28845g.prepare();
        T0();
        return true;
    }

    public final void N0() {
        c.f.a.b.e3.c1.j jVar = this.s;
        if (jVar != null) {
            jVar.release();
            this.s = null;
            this.f28842d.getOverlayFrameLayout().removeAllViews();
        }
    }

    public void O0() {
        if (this.f28845g != null) {
            V0();
            U0();
            this.f28852n.u();
            this.f28852n = null;
            this.f28845g.g1();
            this.f28845g = null;
            this.f28849k = Collections.emptyList();
            this.f28850l = null;
        }
        c.f.a.b.e3.c1.j jVar = this.s;
        if (jVar != null) {
            jVar.e(null);
        }
    }

    public void P0() {
        setContentView(R.layout.player_activity);
    }

    public final void Q0() {
        this.f28843e.setVisibility(0);
    }

    public final void R0(int i2) {
        S0(getString(i2));
    }

    public final void S0(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    public final void T0() {
        this.f28847i.setEnabled(this.f28845g != null && c.h.a.k.c.l.i0(this.f28850l));
    }

    public final void U0() {
        n2 n2Var = this.f28845g;
        if (n2Var != null) {
            this.p = n2Var.i();
            this.q = this.f28845g.s();
            this.r = Math.max(0L, this.f28845g.x());
        }
    }

    public final void V0() {
        f fVar = this.f28850l;
        if (fVar != null) {
            this.f28851m = fVar.s();
        }
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f28842d.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.f.a.b.h3.a1.m
    public void e(int i2) {
        this.f28843e.setVisibility(i2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f28847i && !this.f28846h && c.h.a.k.c.l.i0(this.f28850l)) {
            this.f28846h = true;
            c.h.a.k.c.l.R(this.f28850l, new DialogInterface.OnDismissListener() { // from class: c.h.a.k.c.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f17763b.M0(dialogInterface);
                }
            }).J(getSupportFragmentManager(), null);
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28848j = i.d(this);
        P0();
        this.f28843e = (LinearLayout) findViewById(R.id.controls_root);
        this.f28844f = (TextView) findViewById(R.id.debug_text_view);
        Button button = (Button) findViewById(R.id.select_tracks_button);
        this.f28847i = button;
        button.setOnClickListener(this);
        StyledPlayerView styledPlayerView = (StyledPlayerView) findViewById(R.id.player_view);
        this.f28842d = styledPlayerView;
        styledPlayerView.setControllerVisibilityListener(this);
        this.f28842d.setErrorMessageProvider(new b());
        this.f28842d.requestFocus();
        if (bundle == null) {
            this.f28851m = new f.e(this).w();
            E0();
        } else {
            this.f28851m = (f.d) bundle.getParcelable("track_selector_parameters");
            this.p = bundle.getBoolean("auto_play");
            this.q = bundle.getInt("window");
            this.r = bundle.getLong("position");
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        N0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        O0();
        N0();
        E0();
        setIntent(intent);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (x0.f9296a <= 23) {
            StyledPlayerView styledPlayerView = this.f28842d;
            if (styledPlayerView != null) {
                styledPlayerView.z();
            }
            O0();
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            J0();
        } else {
            R0(R.string.storage_permission_denied);
            finish();
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (x0.f9296a <= 23 || this.f28845g == null) {
            J0();
            StyledPlayerView styledPlayerView = this.f28842d;
            if (styledPlayerView != null) {
                styledPlayerView.A();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        V0();
        U0();
        bundle.putParcelable("track_selector_parameters", this.f28851m);
        bundle.putBoolean("auto_play", this.p);
        bundle.putInt("window", this.q);
        bundle.putLong("position", this.r);
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStart() {
        super.onStart();
        if (x0.f9296a > 23) {
            J0();
            StyledPlayerView styledPlayerView = this.f28842d;
            if (styledPlayerView != null) {
                styledPlayerView.A();
            }
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        if (x0.f9296a > 23) {
            StyledPlayerView styledPlayerView = this.f28842d;
            if (styledPlayerView != null) {
                styledPlayerView.z();
            }
            O0();
        }
    }
}

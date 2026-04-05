package c.f.a.c.d.u.u.l;

import a.l.d.y;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c.f.a.c.d.p;
import c.f.a.c.d.u.q;
import c.f.a.c.d.u.r;
import c.f.a.c.d.u.s;
import c.f.a.c.d.u.u.i;
import c.f.a.c.f.q.o;
import c.f.a.c.j.c.a0;
import c.f.a.c.j.c.b0;
import c.f.a.c.j.c.c0;
import c.f.a.c.j.c.d0;
import c.f.a.c.j.c.f0;
import c.f.a.c.j.c.g0;
import c.f.a.c.j.c.g7;
import c.f.a.c.j.c.h0;
import c.f.a.c.j.c.i0;
import c.f.a.c.j.c.k0;
import c.f.a.c.j.c.l0;
import c.f.a.c.j.c.m0;
import c.f.a.c.j.c.n0;
import c.f.a.c.j.c.nc;
import c.f.a.c.j.c.o0;
import c.f.a.c.j.c.p0;
import c.f.a.c.j.c.q0;
import c.f.a.c.j.c.z;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class b implements s<c.f.a.c.d.u.d>, i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12063a = new c.f.a.c.d.v.b("UIMediaController");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f12064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f12065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<View, List<a>> f12066d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<p0> f12067e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f12068f = c.e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i.b f12069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.f.a.c.d.u.u.i f12070h;

    public b(Activity activity) {
        this.f12064b = activity;
        c.f.a.c.d.u.b bVarH = c.f.a.c.d.u.b.h(activity);
        nc.c(g7.UI_MEDIA_CONTROLLER);
        r rVarC = bVarH != null ? bVarH.c() : null;
        this.f12065c = rVarC;
        if (rVarC != null) {
            r rVarC2 = c.f.a.c.d.u.b.e(activity).c();
            rVarC2.a(this, c.f.a.c.d.u.d.class);
            f0(rVarC2.c());
        }
    }

    public void A(View view, long j2) {
        o.d("Must be called from the main thread.");
        view.setOnClickListener(new k(this, j2));
        e0(view, new b0(view, this.f12068f));
    }

    public void B(View view) {
        o.d("Must be called from the main thread.");
        view.setOnClickListener(new n(this));
        e0(view, new d0(view));
    }

    public void C(View view) {
        o.d("Must be called from the main thread.");
        e0(view, new f0(view));
    }

    public void D(View view, long j2) {
        o.d("Must be called from the main thread.");
        view.setOnClickListener(new j(this, j2));
        e0(view, new k0(view, this.f12068f));
    }

    public void E(View view, int i2) {
        o.d("Must be called from the main thread.");
        view.setOnClickListener(new i(this));
        e0(view, new n0(view, i2));
    }

    public void F(View view, int i2) {
        o.d("Must be called from the main thread.");
        view.setOnClickListener(new h(this));
        e0(view, new m0(view, i2));
    }

    public void G(View view, a aVar) {
        o.d("Must be called from the main thread.");
        e0(view, aVar);
    }

    public void H(View view, int i2) {
        o.d("Must be called from the main thread.");
        e0(view, new q0(view, i2));
    }

    public void I() {
        o.d("Must be called from the main thread.");
        m0();
        this.f12066d.clear();
        r rVar = this.f12065c;
        if (rVar != null) {
            rVar.e(this, c.f.a.c.d.u.d.class);
        }
        this.f12069g = null;
    }

    public c.f.a.c.d.u.u.i J() {
        o.d("Must be called from the main thread.");
        return this.f12070h;
    }

    public boolean K() {
        o.d("Must be called from the main thread.");
        return this.f12070h != null;
    }

    public void L(View view) {
        c.f.a.c.d.u.u.i iVarJ = J();
        if (iVarJ != null && iVarJ.p() && (this.f12064b instanceof a.l.d.e)) {
            c.f.a.c.d.u.u.j jVarK = c.f.a.c.d.u.u.j.K();
            a.l.d.e eVar = (a.l.d.e) this.f12064b;
            y yVarM = eVar.getSupportFragmentManager().m();
            Fragment fragmentI0 = eVar.getSupportFragmentManager().i0("TRACKS_CHOOSER_DIALOG_TAG");
            if (fragmentI0 != null) {
                yVarM.q(fragmentI0);
            }
            jVarK.H(yVarM, "TRACKS_CHOOSER_DIALOG_TAG");
        }
    }

    public void M(View view, long j2) {
        c.f.a.c.d.u.u.i iVarJ = J();
        if (iVarJ == null || !iVarJ.p()) {
            return;
        }
        if (J() == null || !J().p() || !J().w()) {
            iVarJ.R(iVarJ.g() + j2);
            return;
        }
        long jG = iVarJ.g() + j2;
        c cVar = this.f12068f;
        iVarJ.R(Math.min(jG, ((long) cVar.j()) + cVar.k()));
    }

    public void N(View view) {
        c.f.a.c.d.u.u.a aVarI = c.f.a.c.d.u.b.e(this.f12064b).a().I();
        if (aVarI == null || TextUtils.isEmpty(aVarI.I())) {
            return;
        }
        ComponentName componentName = new ComponentName(this.f12064b.getApplicationContext(), aVarI.I());
        Intent intent = new Intent();
        intent.setComponent(componentName);
        this.f12064b.startActivity(intent);
    }

    public void O(ImageView imageView) {
        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.f12064b.getApplicationContext()).c().c();
        if (dVarC == null || !dVarC.c()) {
            return;
        }
        try {
            dVarC.t(!dVarC.r());
        } catch (IOException | IllegalArgumentException e2) {
            f12063a.c("Unable to call CastSession.setMute(boolean).", e2);
        }
    }

    public void P(ImageView imageView) {
        c.f.a.c.d.u.u.i iVarJ = J();
        if (iVarJ == null || !iVarJ.p()) {
            return;
        }
        iVarJ.W();
    }

    public void Q(View view, long j2) {
        c.f.a.c.d.u.u.i iVarJ = J();
        if (iVarJ == null || !iVarJ.p()) {
            return;
        }
        if (J() == null || !J().p() || !J().w()) {
            iVarJ.R(iVarJ.g() - j2);
            return;
        }
        long jG = iVarJ.g() - j2;
        c cVar = this.f12068f;
        iVarJ.R(Math.max(jG, ((long) cVar.i()) + cVar.k()));
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void i(c.f.a.c.d.u.d dVar, int i2) {
        m0();
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void o(c.f.a.c.d.u.d dVar) {
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m(c.f.a.c.d.u.d dVar, int i2) {
        m0();
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void l(c.f.a.c.d.u.d dVar, boolean z) {
        f0(dVar);
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void h(c.f.a.c.d.u.d dVar, String str) {
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void k(c.f.a.c.d.u.d dVar, int i2) {
        m0();
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void j(c.f.a.c.d.u.d dVar, String str) {
        f0(dVar);
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void n(c.f.a.c.d.u.d dVar) {
    }

    @Override // c.f.a.c.d.u.s
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void g(c.f.a.c.d.u.d dVar, int i2) {
    }

    @Override // c.f.a.c.d.u.u.i.b
    public void a() {
        n0();
        i.b bVar = this.f12069g;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a0(View view) {
        c.f.a.c.d.u.u.i iVarJ = J();
        if (iVarJ == null || !iVarJ.p()) {
            return;
        }
        iVarJ.J(null);
    }

    @Override // c.f.a.c.d.u.u.i.b
    public void b() {
        n0();
        i.b bVar = this.f12069g;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void b0(View view) {
        c.f.a.c.d.u.u.i iVarJ = J();
        if (iVarJ == null || !iVarJ.p()) {
            return;
        }
        iVarJ.K(null);
    }

    @Override // c.f.a.c.d.u.u.i.b
    public void c() {
        n0();
        i.b bVar = this.f12069g;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void c0(i.b bVar) {
        o.d("Must be called from the main thread.");
        this.f12069g = bVar;
    }

    @Override // c.f.a.c.d.u.u.i.b
    public void d() {
        n0();
        i.b bVar = this.f12069g;
        if (bVar != null) {
            bVar.d();
        }
    }

    public final void d0(int i2, boolean z) {
        if (z) {
            Iterator<p0> it = this.f12067e.iterator();
            while (it.hasNext()) {
                it.next().h(((long) i2) + this.f12068f.k());
            }
        }
    }

    @Override // c.f.a.c.d.u.u.i.b
    public void e() {
        n0();
        i.b bVar = this.f12069g;
        if (bVar != null) {
            bVar.e();
        }
    }

    public final void e0(View view, a aVar) {
        if (this.f12065c == null) {
            return;
        }
        List<a> arrayList = this.f12066d.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f12066d.put(view, arrayList);
        }
        arrayList.add(aVar);
        if (K()) {
            aVar.e(this.f12065c.c());
            n0();
        }
    }

    @Override // c.f.a.c.d.u.u.i.b
    public void f() {
        Iterator<List<a>> it = this.f12066d.values().iterator();
        while (it.hasNext()) {
            Iterator<a> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().d();
            }
        }
        i.b bVar = this.f12069g;
        if (bVar != null) {
            bVar.f();
        }
    }

    public final void f0(q qVar) {
        if (!K() && (qVar instanceof c.f.a.c.d.u.d) && qVar.c()) {
            c.f.a.c.d.u.d dVar = (c.f.a.c.d.u.d) qVar;
            c.f.a.c.d.u.u.i iVarP = dVar.p();
            this.f12070h = iVarP;
            if (iVarP != null) {
                iVarP.b(this);
                this.f12068f.f12072b = dVar.p();
                Iterator<List<a>> it = this.f12066d.values().iterator();
                while (it.hasNext()) {
                    Iterator<a> it2 = it.next().iterator();
                    while (it2.hasNext()) {
                        it2.next().e(dVar);
                    }
                }
                n0();
            }
        }
    }

    public final void g0(CastSeekBar castSeekBar) {
        o0(castSeekBar.getProgress());
    }

    public final void h0(CastSeekBar castSeekBar, int i2, boolean z) {
        d0(i2, z);
    }

    public final void i0(p0 p0Var) {
        this.f12067e.add(p0Var);
    }

    public final void j0(CastSeekBar castSeekBar) {
        k0();
    }

    public final void k0() {
        Iterator<p0> it = this.f12067e.iterator();
        while (it.hasNext()) {
            it.next().i(false);
        }
    }

    public final c l0() {
        return this.f12068f;
    }

    public final void m0() {
        if (K()) {
            this.f12068f.f12072b = null;
            Iterator<List<a>> it = this.f12066d.values().iterator();
            while (it.hasNext()) {
                Iterator<a> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    it2.next().f();
                }
            }
            this.f12070h.O(this);
            this.f12070h = null;
        }
    }

    public final void n0() {
        Iterator<List<a>> it = this.f12066d.values().iterator();
        while (it.hasNext()) {
            Iterator<a> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        }
    }

    public final void o0(int i2) {
        Iterator<p0> it = this.f12067e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                it.next().i(true);
            }
        }
        c.f.a.c.d.u.u.i iVarJ = J();
        if (iVarJ == null || !iVarJ.p()) {
            return;
        }
        long jK = ((long) i2) + this.f12068f.k();
        iVarJ.T(new p.a().d(jK).c(iVarJ.r() && this.f12068f.c(jK)).a());
    }

    public void p(ImageView imageView, c.f.a.c.d.u.u.b bVar, int i2) {
        o.d("Must be called from the main thread.");
        e0(imageView, new c0(imageView, this.f12064b, bVar, i2, null));
    }

    public void q(ImageView imageView, c.f.a.c.d.u.u.b bVar, View view) {
        o.d("Must be called from the main thread.");
        e0(imageView, new c0(imageView, this.f12064b, bVar, 0, view));
    }

    public void r(ImageView imageView) {
        o.d("Must be called from the main thread.");
        imageView.setOnClickListener(new f(this));
        e0(imageView, new g0(imageView, this.f12064b));
    }

    public void s(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        o.d("Must be called from the main thread.");
        nc.c(g7.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new g(this));
        e0(imageView, new i0(imageView, this.f12064b, drawable, drawable2, drawable3, view, z));
    }

    public void t(ProgressBar progressBar) {
        u(progressBar, 1000L);
    }

    public void u(ProgressBar progressBar, long j2) {
        o.d("Must be called from the main thread.");
        e0(progressBar, new l0(progressBar, j2));
    }

    public void v(CastSeekBar castSeekBar, long j2) {
        o.d("Must be called from the main thread.");
        nc.c(g7.SEEK_CONTROLLER);
        castSeekBar.f24194f = new l(this);
        e0(castSeekBar, new a0(castSeekBar, j2, this.f12068f));
    }

    public void w(TextView textView, String str) {
        o.d("Must be called from the main thread.");
        x(textView, Collections.singletonList(str));
    }

    public void x(TextView textView, List<String> list) {
        o.d("Must be called from the main thread.");
        e0(textView, new h0(textView, list));
    }

    public void y(TextView textView) {
        o.d("Must be called from the main thread.");
        e0(textView, new o0(textView));
    }

    public void z(View view) {
        o.d("Must be called from the main thread.");
        view.setOnClickListener(new m(this));
        e0(view, new z(view, this.f12064b));
    }
}

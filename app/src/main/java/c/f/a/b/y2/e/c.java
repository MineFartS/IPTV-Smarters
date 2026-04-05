package c.f.a.b.y2.e;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.c1.j;
import c.f.a.b.e3.c1.k;
import c.f.a.b.g3.l;
import c.f.a.b.h3.f0;
import c.f.a.b.i1;
import c.f.a.b.i3.s;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.a0;
import c.f.a.b.k3.e0;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.t2.p;
import c.f.a.b.w0;
import c.f.a.b.x1;
import c.f.a.b.y2.e.d;
import c.f.a.b.z1;
import c.f.b.b.t;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements a2.e, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f10551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d.b f10553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<Object, c.f.a.b.y2.e.b> f10554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<k, c.f.a.b.y2.e.b> f10555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2.b f10556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2.c f10557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2 f10559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<String> f10560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a2 f10561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.a.b.y2.e.b f10562m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImaSdkSettings f10564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AdErrorEvent.AdErrorListener f10565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AdEvent.AdEventListener f10566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public VideoAdPlayer.VideoAdPlayerCallback f10567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<String> f10568f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Set<UiElement> f10569g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Collection<CompanionAdSlot> f10570h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f10571i;
        public boolean p;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f10572j = 10000;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10573k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f10574l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f10575m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10576n = true;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f10577o = true;
        public d.b q = new C0144c();

        public b(Context context) {
            this.f10563a = ((Context) g.e(context)).getApplicationContext();
        }

        public c a() {
            return new c(this.f10563a, new d.a(this.f10572j, this.f10573k, this.f10574l, this.f10576n, this.f10577o, this.f10575m, this.f10571i, this.f10568f, this.f10569g, this.f10570h, this.f10565c, this.f10566d, this.f10567e, this.f10564b, this.p), this.q);
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.y2.e.c$c, reason: collision with other inner class name */
    public static final class C0144c implements d.b {
        public C0144c() {
        }

        @Override // c.f.a.b.y2.e.d.b
        public FriendlyObstruction a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
            return ImaSdkFactory.getInstance().createFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }

        @Override // c.f.a.b.y2.e.d.b
        public AdsRenderingSettings b() {
            return ImaSdkFactory.getInstance().createAdsRenderingSettings();
        }

        @Override // c.f.a.b.y2.e.d.b
        public AdsLoader c(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
            return ImaSdkFactory.getInstance().createAdsLoader(context, imaSdkSettings, adDisplayContainer);
        }

        @Override // c.f.a.b.y2.e.d.b
        public AdDisplayContainer d(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAdDisplayContainer(viewGroup, videoAdPlayer);
        }

        @Override // c.f.a.b.y2.e.d.b
        public ImaSdkSettings e() {
            ImaSdkSettings imaSdkSettingsCreateImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            imaSdkSettingsCreateImaSdkSettings.setLanguage(x0.g0()[0]);
            return imaSdkSettingsCreateImaSdkSettings;
        }

        @Override // c.f.a.b.y2.e.d.b
        public AdsRequest f() {
            return ImaSdkFactory.getInstance().createAdsRequest();
        }

        @Override // c.f.a.b.y2.e.d.b
        public AdDisplayContainer g(Context context, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAudioAdDisplayContainer(context, videoAdPlayer);
        }
    }

    static {
        i1.a("goog.exo.ima");
    }

    public c(Context context, d.a aVar, d.b bVar) {
        this.f10552c = context.getApplicationContext();
        this.f10551b = aVar;
        this.f10553d = bVar;
        this.f10560k = t.J();
        this.f10554e = new HashMap<>();
        this.f10555f = new HashMap<>();
        this.f10556g = new p2.b();
        this.f10557h = new p2.c();
    }

    @Override // c.f.a.b.a2.c
    public void C(boolean z) {
        q();
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
    public /* synthetic */ void J(p pVar) {
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
    public /* synthetic */ void b0(a1 a1Var, l lVar) {
        c2.y(this, a1Var, lVar);
    }

    @Override // c.f.a.b.e3.c1.j
    public void c(k kVar, int i2, int i3) {
        if (this.f10561l == null) {
            return;
        }
        ((c.f.a.b.y2.e.b) g.e(this.f10555f.get(kVar))).w0(i2, i3);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void d(z1 z1Var) {
        c2.m(this, z1Var);
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void d0(int i2, int i3) {
        c2.w(this, i2, i3);
    }

    @Override // c.f.a.b.e3.c1.j
    public void e(a2 a2Var) {
        g.g(Looper.myLooper() == d.d());
        g.g(a2Var == null || a2Var.H() == d.d());
        this.f10559j = a2Var;
        this.f10558i = true;
    }

    @Override // c.f.a.b.a2.c
    public void f(a2.f fVar, a2.f fVar2, int i2) {
        u();
        q();
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

    @Override // c.f.a.b.e3.c1.j
    public void j(k kVar, s sVar, Object obj, f0 f0Var, j.a aVar) {
        g.h(this.f10558i, "Set player using adsLoader.setPlayer before preparing the player.");
        if (this.f10555f.isEmpty()) {
            a2 a2Var = this.f10559j;
            this.f10561l = a2Var;
            if (a2Var == null) {
                return;
            } else {
                a2Var.y(this);
            }
        }
        c.f.a.b.y2.e.b bVar = this.f10554e.get(obj);
        if (bVar == null) {
            w(sVar, obj, f0Var.getAdViewGroup());
            bVar = this.f10554e.get(obj);
        }
        this.f10555f.put(kVar, (c.f.a.b.y2.e.b) g.e(bVar));
        bVar.c0(aVar, f0Var);
        u();
    }

    @Override // c.f.a.b.e3.c1.j
    public void k(k kVar, int i2, int i3, IOException iOException) {
        if (this.f10561l == null) {
            return;
        }
        ((c.f.a.b.y2.e.b) g.e(this.f10555f.get(kVar))).x0(i2, i3, iOException);
    }

    @Override // c.f.a.b.w2.c
    public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
        c2.d(this, bVar);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void l(List list) {
        b2.q(this, list);
    }

    @Override // c.f.a.b.e3.c1.j
    public void m(k kVar, j.a aVar) {
        c.f.a.b.y2.e.b bVarRemove = this.f10555f.remove(kVar);
        u();
        if (bVarRemove != null) {
            bVarRemove.M0(aVar);
        }
        if (this.f10561l == null || !this.f10555f.isEmpty()) {
            return;
        }
        this.f10561l.p(this);
        this.f10561l = null;
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void m0(boolean z) {
        c2.h(this, z);
    }

    @Override // c.f.a.b.e3.c1.j
    public void n(int... iArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 == 0) {
                str = "application/dash+xml";
            } else if (i2 == 2) {
                str = "application/x-mpegURL";
            } else {
                if (i2 == 4) {
                    arrayList.addAll(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "audio/mp4", "audio/mpeg"));
                }
            }
            arrayList.add(str);
        }
        this.f10560k = Collections.unmodifiableList(arrayList);
    }

    public final c.f.a.b.y2.e.b o() {
        Object objH;
        c.f.a.b.y2.e.b bVar;
        a2 a2Var = this.f10561l;
        if (a2Var == null) {
            return null;
        }
        p2 p2VarG = a2Var.G();
        if (p2VarG.q() || (objH = p2VarG.f(a2Var.l(), this.f10556g).h()) == null || (bVar = this.f10554e.get(objH)) == null || !this.f10555f.containsValue(bVar)) {
            return null;
        }
        return bVar;
    }

    @Override // c.f.a.b.a2.c
    public void onRepeatModeChanged(int i2) {
        q();
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void p(boolean z) {
        c2.g(this, z);
    }

    public final void q() {
        int iD;
        c.f.a.b.y2.e.b bVar;
        a2 a2Var = this.f10561l;
        if (a2Var == null) {
            return;
        }
        p2 p2VarG = a2Var.G();
        if (p2VarG.q() || (iD = p2VarG.d(a2Var.l(), this.f10556g, this.f10557h, a2Var.getRepeatMode(), a2Var.I())) == -1) {
            return;
        }
        p2VarG.f(iD, this.f10556g);
        Object objH = this.f10556g.h();
        if (objH == null || (bVar = this.f10554e.get(objH)) == null || bVar == this.f10562m) {
            return;
        }
        p2.c cVar = this.f10557h;
        p2.b bVar2 = this.f10556g;
        bVar.H0(w0.e(((Long) p2VarG.j(cVar, bVar2, bVar2.f9704d, -9223372036854775807L).second).longValue()), w0.e(this.f10556g.f9705e));
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void r() {
        b2.o(this);
    }

    @Override // c.f.a.b.e3.c1.j
    public void release() {
        a2 a2Var = this.f10561l;
        if (a2Var != null) {
            a2Var.p(this);
            this.f10561l = null;
            u();
        }
        this.f10559j = null;
        Iterator<c.f.a.b.y2.e.b> it = this.f10555f.values().iterator();
        while (it.hasNext()) {
            it.next().L0();
        }
        this.f10555f.clear();
        Iterator<c.f.a.b.y2.e.b> it2 = this.f10554e.values().iterator();
        while (it2.hasNext()) {
            it2.next().L0();
        }
        this.f10554e.clear();
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void s(x1 x1Var) {
        c2.p(this, x1Var);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void t(a2.b bVar) {
        c2.b(this, bVar);
    }

    public final void u() {
        c.f.a.b.y2.e.b bVar = this.f10562m;
        c.f.a.b.y2.e.b bVarO = o();
        if (x0.b(bVar, bVarO)) {
            return;
        }
        if (bVar != null) {
            bVar.e0();
        }
        this.f10562m = bVarO;
        if (bVarO != null) {
            bVarO.a0((a2) g.e(this.f10561l));
        }
    }

    @Override // c.f.a.b.a2.c
    public void v(p2 p2Var, int i2) {
        if (p2Var.q()) {
            return;
        }
        u();
        q();
    }

    public void w(s sVar, Object obj, ViewGroup viewGroup) {
        if (this.f10554e.containsKey(obj)) {
            return;
        }
        this.f10554e.put(obj, new c.f.a.b.y2.e.b(this.f10552c, this.f10551b, this.f10553d, this.f10560k, sVar, obj, viewGroup));
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void x(int i2) {
        c2.n(this, i2);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void z(q1 q1Var) {
        c2.j(this, q1Var);
    }
}

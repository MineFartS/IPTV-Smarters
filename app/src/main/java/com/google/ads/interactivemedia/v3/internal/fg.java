package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fg implements nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi f21781a;

    public fg(fi fiVar) {
        this.f21781a = fiVar;
    }

    private final void al(AdMediaInfo adMediaInfo) {
        if (adMediaInfo == null || this.f21781a.f21789g.contains(adMediaInfo)) {
            return;
        }
        Iterator it = this.f21781a.f21788f.iterator();
        while (it.hasNext()) {
            ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onEnded(adMediaInfo);
        }
        this.f21781a.f21789g.add(adMediaInfo);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void A() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void B() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void C() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void D() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void E() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void F() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void G() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void H() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void I() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void J() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void K() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void L() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void M() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void N() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final void O(int i2) {
        AdMediaInfo adMediaInfoK = this.f21781a.k();
        if (adMediaInfoK == null) {
            return;
        }
        if (i2 == 2) {
            Iterator it = this.f21781a.f21788f.iterator();
            while (it.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onBuffering(adMediaInfoK);
            }
        } else if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            al(adMediaInfoK);
        } else {
            Iterator it2 = this.f21781a.f21788f.iterator();
            while (it2.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it2.next()).onLoaded(adMediaInfoK);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void P() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final void Q(int i2) {
        if (i2 != 0) {
            return;
        }
        if (this.f21781a.f21795m == null) {
            Log.d("IMASDK", "Position discontinuity occurred when there is no active media source.");
            return;
        }
        int iF = this.f21781a.f21783a.f();
        for (int i3 = 0; i3 < iF; i3++) {
            al(this.f21781a.j(i3));
        }
        AdMediaInfo adMediaInfoJ = this.f21781a.j(iF);
        if (adMediaInfoJ != null) {
            for (VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback : this.f21781a.f21788f) {
                videoAdPlayerCallback.onLoaded(adMediaInfoJ);
                videoAdPlayerCallback.onPlay(adMediaInfoJ);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void R() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void S() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void T() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void U() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void V() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void W() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void X() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void Y() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void Z() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final void a(nm nmVar, lc lcVar) {
        AdMediaInfo adMediaInfoJ = this.f21781a.j(nmVar.f22534c);
        this.f21781a.f21789g.add(adMediaInfoJ);
        Iterator it = this.f21781a.f21788f.iterator();
        while (it.hasNext()) {
            ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onError(adMediaInfoJ);
        }
        String strValueOf = String.valueOf(lcVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Player Error:");
        sb.append(strValueOf);
        Log.e("IMASDK", sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void aa() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ab() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ac() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ad() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ae() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void af() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ag() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ah() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ai() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void aj() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void ak() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void b() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void d() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void e() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void f() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void g() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void h() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void i() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void j() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void k() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void l() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void m() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void n() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void o() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void p() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void q() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void r() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void s() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void t() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void u() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void v() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void w() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void x() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void y() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nn
    public final /* synthetic */ void z() {
    }
}

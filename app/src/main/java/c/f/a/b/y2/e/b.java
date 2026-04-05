package c.f.a.b.y2.e;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.c1.h;
import c.f.a.b.e3.c1.j;
import c.f.a.b.e3.c1.k;
import c.f.a.b.g3.l;
import c.f.a.b.g3.n;
import c.f.a.b.h3.f0;
import c.f.a.b.i3.s;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k3.a0;
import c.f.a.b.k3.e0;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.w0;
import c.f.a.b.x1;
import c.f.a.b.y2.e.d;
import c.f.a.b.z1;
import c.f.b.b.h;
import c.f.b.b.p;
import com.amazonaws.services.s3.internal.Constants;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a2.e {
    public boolean A;
    public boolean B;
    public int C;
    public AdMediaInfo D;
    public C0143b E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public C0143b J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public long O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f10533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.b f10534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f10535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f10536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2.b f10538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f10539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f10540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<j.a> f10541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<VideoAdPlayer.VideoAdPlayerCallback> f10542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f10543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h<AdMediaInfo, C0143b> f10544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdDisplayContainer f10545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AdsLoader f10546o;
    public Object p;
    public a2 q;
    public VideoProgressUpdate r;
    public VideoProgressUpdate s;
    public int t;
    public AdsManager u;
    public boolean v;
    public k.a w;
    public p2 x;
    public long y;
    public c.f.a.b.e3.c1.h z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10547a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            f10547a = iArr;
            try {
                iArr[AdEvent.AdEventType.AD_BREAK_FETCH_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10547a[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10547a[AdEvent.AdEventType.TAPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10547a[AdEvent.AdEventType.CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10547a[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10547a[AdEvent.AdEventType.LOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.y2.e.b$b, reason: collision with other inner class name */
    public static final class C0143b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10549b;

        public C0143b(int i2, int i3) {
            this.f10548a = i2;
            this.f10549b = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0143b.class != obj.getClass()) {
                return false;
            }
            C0143b c0143b = (C0143b) obj;
            return this.f10548a == c0143b.f10548a && this.f10549b == c0143b.f10549b;
        }

        public int hashCode() {
            return (this.f10548a * 31) + this.f10549b;
        }

        public String toString() {
            return "(" + this.f10548a + ", " + this.f10549b + ')';
        }
    }

    public final class c implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {
        public c() {
        }

        public /* synthetic */ c(b bVar, a aVar) {
            this();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            b.this.f10542k.add(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
        public VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
        public VideoProgressUpdate getContentProgress() {
            VideoProgressUpdate videoProgressUpdateP0 = b.this.p0();
            if (b.this.f10533b.f10592o) {
                z.b("AdTagLoader", "Content progress: " + d.e(videoProgressUpdateP0));
            }
            if (b.this.O != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() - b.this.O >= 4000) {
                    b.this.O = -9223372036854775807L;
                    b.this.t0(new IOException("Ad preloading timed out"));
                    b.this.G0();
                }
            } else if (b.this.M != -9223372036854775807L && b.this.q != null && b.this.q.getPlaybackState() == 2 && b.this.A0()) {
                b.this.O = SystemClock.elapsedRealtime();
            }
            return videoProgressUpdateP0;
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
        public int getVolume() {
            return b.this.r0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            try {
                b.this.C0(adMediaInfo, adPodInfo);
            } catch (RuntimeException e2) {
                b.this.F0("loadAd", e2);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            if (b.this.f10533b.f10592o) {
                z.c("AdTagLoader", "onAdError", error);
            }
            if (b.this.u == null) {
                b.this.p = null;
                b.this.z = new c.f.a.b.e3.c1.h(b.this.f10537f, new long[0]);
                b.this.T0();
            } else if (d.f(error)) {
                try {
                    b.this.t0(error);
                } catch (RuntimeException e2) {
                    b.this.F0("onAdError", e2);
                }
            }
            if (b.this.w == null) {
                b.this.w = k.a.c(error);
            }
            b.this.G0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventType type = adEvent.getType();
            if (b.this.f10533b.f10592o && type != AdEvent.AdEventType.AD_PROGRESS) {
                z.b("AdTagLoader", "onAdEvent: " + type);
            }
            try {
                b.this.s0(adEvent);
            } catch (RuntimeException e2) {
                b.this.F0("onAdEvent", e2);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            if (!x0.b(b.this.p, adsManagerLoadedEvent.getUserRequestContext())) {
                adsManager.destroy();
                return;
            }
            b.this.p = null;
            b.this.u = adsManager;
            adsManager.addAdErrorListener(this);
            if (b.this.f10533b.f10588k != null) {
                adsManager.addAdErrorListener(b.this.f10533b.f10588k);
            }
            adsManager.addAdEventListener(this);
            if (b.this.f10533b.f10589l != null) {
                adsManager.addAdEventListener(b.this.f10533b.f10589l);
            }
            try {
                b.this.z = new c.f.a.b.e3.c1.h(b.this.f10537f, d.a(adsManager.getAdCuePoints()));
                b.this.T0();
            } catch (RuntimeException e2) {
                b.this.F0("onAdsManagerLoaded", e2);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void pauseAd(AdMediaInfo adMediaInfo) {
            try {
                b.this.I0(adMediaInfo);
            } catch (RuntimeException e2) {
                b.this.F0("pauseAd", e2);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void playAd(AdMediaInfo adMediaInfo) {
            try {
                b.this.K0(adMediaInfo);
            } catch (RuntimeException e2) {
                b.this.F0("playAd", e2);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void release() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            b.this.f10542k.remove(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void stopAd(AdMediaInfo adMediaInfo) {
            try {
                b.this.R0(adMediaInfo);
            } catch (RuntimeException e2) {
                b.this.F0("stopAd", e2);
            }
        }
    }

    public b(Context context, d.a aVar, d.b bVar, List<String> list, s sVar, Object obj, ViewGroup viewGroup) {
        this.f10533b = aVar;
        this.f10534c = bVar;
        ImaSdkSettings imaSdkSettingsE = aVar.f10591n;
        if (imaSdkSettingsE == null) {
            imaSdkSettingsE = bVar.e();
            if (aVar.f10592o) {
                imaSdkSettingsE.setDebugMode(true);
            }
        }
        imaSdkSettingsE.setPlayerType("google/exo.ext.ima");
        imaSdkSettingsE.setPlayerVersion("2.15.0");
        this.f10535d = list;
        this.f10536e = sVar;
        this.f10537f = obj;
        this.f10538g = new p2.b();
        this.f10539h = x0.w(d.d(), null);
        c cVar = new c(this, null);
        this.f10540i = cVar;
        this.f10541j = new ArrayList();
        ArrayList arrayList = new ArrayList(1);
        this.f10542k = arrayList;
        VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback = aVar.f10590m;
        if (videoAdPlayerCallback != null) {
            arrayList.add(videoAdPlayerCallback);
        }
        this.f10543l = new Runnable() { // from class: c.f.a.b.y2.e.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f10532b.U0();
            }
        };
        this.f10544m = p.g();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.r = videoProgressUpdate;
        this.s = videoProgressUpdate;
        this.K = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.x = p2.f9699a;
        this.z = c.f.a.b.e3.c1.h.f6948a;
        this.f10545n = viewGroup != null ? bVar.d(viewGroup, cVar) : bVar.g(context, cVar);
        Collection<CompanionAdSlot> collection = aVar.f10587j;
        if (collection != null) {
            this.f10545n.setCompanionSlots(collection);
        }
        this.f10546o = N0(context, imaSdkSettingsE, this.f10545n);
    }

    public static long o0(a2 a2Var, p2 p2Var, p2.b bVar) {
        long jX = a2Var.x();
        return p2Var.q() ? jX : jX - p2Var.f(a2Var.l(), bVar).n();
    }

    public static boolean z0(c.f.a.b.e3.c1.h hVar) {
        int i2 = hVar.f6952e;
        if (i2 != 1) {
            return (i2 == 2 && hVar.b(0).f6958b == 0 && hVar.b(1).f6958b == Long.MIN_VALUE) ? false : true;
        }
        long j2 = hVar.b(0).f6958b;
        return (j2 == 0 || j2 == Long.MIN_VALUE) ? false : true;
    }

    public final boolean A0() {
        int iQ0;
        a2 a2Var = this.q;
        if (a2Var == null || (iQ0 = q0()) == -1) {
            return false;
        }
        h.a aVarB = this.z.b(iQ0);
        int i2 = aVarB.f6959c;
        return (i2 == -1 || i2 == 0 || aVarB.f6961e[0] == 0) && w0.e(aVarB.f6958b) - o0(a2Var, this.x, this.f10538g) < this.f10533b.f10578a;
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void C(boolean z) {
        c2.u(this, z);
    }

    public final void C0(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.u == null) {
            if (this.f10533b.f10592o) {
                z.b("AdTagLoader", "loadAd after release " + l0(adMediaInfo) + ", ad pod " + adPodInfo);
                return;
            }
            return;
        }
        int iI0 = i0(adPodInfo);
        int adPosition = adPodInfo.getAdPosition() - 1;
        C0143b c0143b = new C0143b(iI0, adPosition);
        this.f10544m.a(adMediaInfo, c0143b);
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "loadAd " + l0(adMediaInfo));
        }
        if (this.z.e(iI0, adPosition)) {
            return;
        }
        c.f.a.b.e3.c1.h hVarG = this.z.g(c0143b.f10548a, Math.max(adPodInfo.getTotalAds(), this.z.b(c0143b.f10548a).f6961e.length));
        this.z = hVarG;
        h.a aVarB = hVarG.b(c0143b.f10548a);
        for (int i2 = 0; i2 < adPosition; i2++) {
            if (aVarB.f6961e[i2] == 0) {
                this.z = this.z.i(iI0, i2);
            }
        }
        this.z = this.z.k(c0143b.f10548a, c0143b.f10549b, Uri.parse(adMediaInfo.getUrl()));
        T0();
    }

    @Override // c.f.a.b.b3.f
    public /* synthetic */ void D(c.f.a.b.b3.a aVar) {
        c2.k(this, aVar);
    }

    public final void D0(int i2) {
        h.a aVarB = this.z.b(i2);
        if (aVarB.f6959c == -1) {
            c.f.a.b.e3.c1.h hVarG = this.z.g(i2, Math.max(1, aVarB.f6961e.length));
            this.z = hVarG;
            aVarB = hVarG.b(i2);
        }
        for (int i3 = 0; i3 < aVarB.f6959c; i3++) {
            if (aVarB.f6961e[i3] == 0) {
                if (this.f10533b.f10592o) {
                    z.b("AdTagLoader", "Removing ad " + i3 + " in ad group " + i2);
                }
                this.z = this.z.i(i2, i3);
            }
        }
        T0();
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void E(a2 a2Var, a2.d dVar) {
        c2.f(this, a2Var, dVar);
    }

    public final void E0(long j2, long j3) {
        AdsManager adsManager = this.u;
        if (this.v || adsManager == null) {
            return;
        }
        this.v = true;
        AdsRenderingSettings adsRenderingSettingsQ0 = Q0(j2, j3);
        if (adsRenderingSettingsQ0 == null) {
            f0();
        } else {
            adsManager.init(adsRenderingSettingsQ0);
            adsManager.start();
            if (this.f10533b.f10592o) {
                z.b("AdTagLoader", "Initialized with ads rendering settings: " + adsRenderingSettingsQ0);
            }
        }
        T0();
    }

    public final void F0(String str, Exception exc) {
        String str2 = "Internal error in " + str;
        z.e("AdTagLoader", str2, exc);
        int i2 = 0;
        while (true) {
            c.f.a.b.e3.c1.h hVar = this.z;
            if (i2 >= hVar.f6952e) {
                break;
            }
            this.z = hVar.o(i2);
            i2++;
        }
        T0();
        for (int i3 = 0; i3 < this.f10541j.size(); i3++) {
            this.f10541j.get(i3).c(k.a.d(new RuntimeException(str2, exc)), this.f10536e);
        }
    }

    @Override // c.f.a.b.w2.c
    public /* synthetic */ void G(int i2, boolean z) {
        c2.e(this, i2, z);
    }

    public final void G0() {
        if (this.w != null) {
            for (int i2 = 0; i2 < this.f10541j.size(); i2++) {
                this.f10541j.get(i2).c(this.w, this.f10536e);
            }
            this.w = null;
        }
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void H(boolean z, int i2) {
        b2.k(this, z, i2);
    }

    public void H0(long j2, long j3) {
        E0(j2, j3);
    }

    public final void I0(AdMediaInfo adMediaInfo) {
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "pauseAd " + l0(adMediaInfo));
        }
        if (this.u == null || this.C == 0) {
            return;
        }
        if (this.f10533b.f10592o && !adMediaInfo.equals(this.D)) {
            z.i("AdTagLoader", "Unexpected pauseAd for " + l0(adMediaInfo) + ", expected " + l0(this.D));
        }
        this.C = 2;
        for (int i2 = 0; i2 < this.f10542k.size(); i2++) {
            this.f10542k.get(i2).onPause(adMediaInfo);
        }
    }

    @Override // c.f.a.b.t2.r
    public /* synthetic */ void J(c.f.a.b.t2.p pVar) {
        c2.a(this, pVar);
    }

    public final void J0() {
        this.C = 0;
        if (this.N) {
            this.M = -9223372036854775807L;
            this.N = false;
        }
    }

    public final void K0(AdMediaInfo adMediaInfo) {
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "playAd " + l0(adMediaInfo));
        }
        if (this.u == null) {
            return;
        }
        if (this.C == 1) {
            z.i("AdTagLoader", "Unexpected playAd without stopAd");
        }
        int i2 = 0;
        if (this.C == 0) {
            this.K = -9223372036854775807L;
            this.L = -9223372036854775807L;
            this.C = 1;
            this.D = adMediaInfo;
            this.E = (C0143b) g.e(this.f10544m.get(adMediaInfo));
            for (int i3 = 0; i3 < this.f10542k.size(); i3++) {
                this.f10542k.get(i3).onPlay(adMediaInfo);
            }
            C0143b c0143b = this.J;
            if (c0143b != null && c0143b.equals(this.E)) {
                this.J = null;
                while (i2 < this.f10542k.size()) {
                    this.f10542k.get(i2).onError(adMediaInfo);
                    i2++;
                }
            }
            U0();
        } else {
            this.C = 1;
            g.g(adMediaInfo.equals(this.D));
            while (i2 < this.f10542k.size()) {
                this.f10542k.get(i2).onResume(adMediaInfo);
                i2++;
            }
        }
        a2 a2Var = this.q;
        if (a2Var == null || !a2Var.i()) {
            ((AdsManager) g.e(this.u)).pause();
        }
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
        a0.a(this, i2, i3, i4, f2);
    }

    public void L0() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.p = null;
        f0();
        this.f10546o.removeAdsLoadedListener(this.f10540i);
        this.f10546o.removeAdErrorListener(this.f10540i);
        AdErrorEvent.AdErrorListener adErrorListener = this.f10533b.f10588k;
        if (adErrorListener != null) {
            this.f10546o.removeAdErrorListener(adErrorListener);
        }
        this.f10546o.release();
        int i2 = 0;
        this.B = false;
        this.C = 0;
        this.D = null;
        S0();
        this.E = null;
        this.w = null;
        while (true) {
            c.f.a.b.e3.c1.h hVar = this.z;
            if (i2 >= hVar.f6952e) {
                T0();
                return;
            } else {
                this.z = hVar.o(i2);
                i2++;
            }
        }
    }

    public void M0(j.a aVar) {
        this.f10541j.remove(aVar);
        if (this.f10541j.isEmpty()) {
            this.f10545n.unregisterAllFriendlyObstructions();
        }
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void N() {
        c2.s(this);
    }

    public final AdsLoader N0(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        AdsLoader adsLoaderC = this.f10534c.c(context, imaSdkSettings, adDisplayContainer);
        adsLoaderC.addAdErrorListener(this.f10540i);
        AdErrorEvent.AdErrorListener adErrorListener = this.f10533b.f10588k;
        if (adErrorListener != null) {
            adsLoaderC.addAdErrorListener(adErrorListener);
        }
        adsLoaderC.addAdsLoadedListener(this.f10540i);
        try {
            AdsRequest adsRequestB = d.b(this.f10534c, this.f10536e);
            Object obj = new Object();
            this.p = obj;
            adsRequestB.setUserRequestContext(obj);
            Boolean bool = this.f10533b.f10584g;
            if (bool != null) {
                adsRequestB.setContinuousPlayback(bool.booleanValue());
            }
            int i2 = this.f10533b.f10579b;
            if (i2 != -1) {
                adsRequestB.setVastLoadTimeout(i2);
            }
            adsRequestB.setContentProgressProvider(this.f10540i);
            adsLoaderC.requestAds(adsRequestB);
            return adsLoaderC;
        } catch (IOException e2) {
            this.z = new c.f.a.b.e3.c1.h(this.f10537f, new long[0]);
            T0();
            this.w = k.a.c(e2);
            G0();
            return adsLoaderC;
        }
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void O(p1 p1Var, int i2) {
        c2.i(this, p1Var, i2);
    }

    public final void O0() {
        C0143b c0143b = this.E;
        if (c0143b != null) {
            this.z = this.z.o(c0143b.f10548a);
            T0();
        }
    }

    public final void P0() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f10542k.size(); i3++) {
            this.f10542k.get(i3).onContentComplete();
        }
        this.F = true;
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "adsLoader.contentComplete");
        }
        while (true) {
            c.f.a.b.e3.c1.h hVar = this.z;
            if (i2 >= hVar.f6952e) {
                T0();
                return;
            } else {
                if (hVar.b(i2).f6958b != Long.MIN_VALUE) {
                    this.z = this.z.o(i2);
                }
                i2++;
            }
        }
    }

    @Override // c.f.a.b.f3.l
    public /* synthetic */ void Q(List list) {
        c2.c(this, list);
    }

    public final AdsRenderingSettings Q0(long j2, long j3) {
        c.f.a.b.e3.c1.h hVar;
        double d2;
        AdsRenderingSettings adsRenderingSettingsB = this.f10534c.b();
        adsRenderingSettingsB.setEnablePreloading(true);
        List<String> list = this.f10533b.f10585h;
        if (list == null) {
            list = this.f10535d;
        }
        adsRenderingSettingsB.setMimeTypes(list);
        int i2 = this.f10533b.f10580c;
        if (i2 != -1) {
            adsRenderingSettingsB.setLoadVideoTimeout(i2);
        }
        int i3 = this.f10533b.f10583f;
        if (i3 != -1) {
            adsRenderingSettingsB.setBitrateKbps(i3 / 1000);
        }
        adsRenderingSettingsB.setFocusSkipButtonWhenAvailable(this.f10533b.f10581d);
        Set<UiElement> set = this.f10533b.f10586i;
        if (set != null) {
            adsRenderingSettingsB.setUiElements(set);
        }
        int iD = this.z.d(w0.d(j2), w0.d(j3));
        if (iD != -1) {
            int i4 = 0;
            if (!(this.z.b(iD).f6958b == w0.d(j2) || this.f10533b.f10582e)) {
                iD++;
            } else if (z0(this.z)) {
                this.M = j2;
            }
            if (iD > 0) {
                while (true) {
                    hVar = this.z;
                    if (i4 >= iD) {
                        break;
                    }
                    this.z = hVar.o(i4);
                    i4++;
                }
                if (iD == hVar.f6952e) {
                    return null;
                }
                long j4 = hVar.b(iD).f6958b;
                long j5 = this.z.b(iD - 1).f6958b;
                if (j4 == Long.MIN_VALUE) {
                    double d3 = j5;
                    Double.isNaN(d3);
                    d2 = (d3 / 1000000.0d) + 1.0d;
                } else {
                    double d4 = j4 + j5;
                    Double.isNaN(d4);
                    d2 = (d4 / 2.0d) / 1000000.0d;
                }
                adsRenderingSettingsB.setPlayAdsAfterTime(d2);
            }
        }
        return adsRenderingSettingsB;
    }

    public final void R0(AdMediaInfo adMediaInfo) {
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "stopAd " + l0(adMediaInfo));
        }
        if (this.u == null) {
            return;
        }
        if (this.C == 0) {
            C0143b c0143b = this.f10544m.get(adMediaInfo);
            if (c0143b != null) {
                this.z = this.z.n(c0143b.f10548a, c0143b.f10549b);
                T0();
                return;
            }
            return;
        }
        this.C = 0;
        S0();
        g.e(this.E);
        C0143b c0143b2 = this.E;
        int i2 = c0143b2.f10548a;
        int i3 = c0143b2.f10549b;
        if (this.z.e(i2, i3)) {
            return;
        }
        this.z = this.z.m(i2, i3).j(0L);
        T0();
        if (this.G) {
            return;
        }
        this.D = null;
        this.E = null;
    }

    public final void S0() {
        this.f10539h.removeCallbacks(this.f10543l);
    }

    public final void T0() {
        for (int i2 = 0; i2 < this.f10541j.size(); i2++) {
            this.f10541j.get(i2).a(this.z);
        }
    }

    public final void U0() {
        VideoProgressUpdate videoProgressUpdateN0 = n0();
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "Ad progress: " + d.e(videoProgressUpdateN0));
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) g.e(this.D);
        for (int i2 = 0; i2 < this.f10542k.size(); i2++) {
            this.f10542k.get(i2).onAdProgress(adMediaInfo, videoProgressUpdateN0);
        }
        this.f10539h.removeCallbacks(this.f10543l);
        this.f10539h.postDelayed(this.f10543l, 100L);
    }

    @Override // c.f.a.b.a2.c
    public void Z(boolean z, int i2) {
        a2 a2Var;
        AdsManager adsManager = this.u;
        if (adsManager == null || (a2Var = this.q) == null) {
            return;
        }
        int i3 = this.C;
        if (i3 == 1 && !z) {
            adsManager.pause();
        } else if (i3 == 2 && z) {
            adsManager.resume();
        } else {
            v0(z, a2Var.getPlaybackState());
        }
    }

    @Override // c.f.a.b.t2.r
    public /* synthetic */ void a(boolean z) {
        c2.v(this, z);
    }

    public void a0(a2 a2Var) {
        C0143b c0143b;
        this.q = a2Var;
        a2Var.y(this);
        boolean zI = a2Var.i();
        v(a2Var.G(), 1);
        AdsManager adsManager = this.u;
        if (c.f.a.b.e3.c1.h.f6948a.equals(this.z) || adsManager == null || !this.B) {
            return;
        }
        int iD = this.z.d(w0.d(o0(a2Var, this.x, this.f10538g)), w0.d(this.y));
        if (iD != -1 && (c0143b = this.E) != null && c0143b.f10548a != iD) {
            if (this.f10533b.f10592o) {
                z.b("AdTagLoader", "Discarding preloaded ad " + this.E);
            }
            adsManager.discardAdBreak();
        }
        if (zI) {
            adsManager.resume();
        }
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void b(e0 e0Var) {
        c2.z(this, e0Var);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void b0(a1 a1Var, l lVar) {
        c2.y(this, a1Var, lVar);
    }

    public void c0(j.a aVar, f0 f0Var) {
        boolean z = !this.f10541j.isEmpty();
        this.f10541j.add(aVar);
        if (z) {
            if (c.f.a.b.e3.c1.h.f6948a.equals(this.z)) {
                return;
            }
            aVar.a(this.z);
            return;
        }
        this.t = 0;
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.s = videoProgressUpdate;
        this.r = videoProgressUpdate;
        G0();
        if (!c.f.a.b.e3.c1.h.f6948a.equals(this.z)) {
            aVar.a(this.z);
        } else if (this.u != null) {
            this.z = new c.f.a.b.e3.c1.h(this.f10537f, d.a(this.u.getAdCuePoints()));
            T0();
        }
        for (c.f.a.b.h3.e0 e0Var : f0Var.getAdOverlayInfos()) {
            this.f10545n.registerFriendlyObstruction(this.f10534c.a(e0Var.f8656a, d.c(e0Var.f8657b), e0Var.f8658c));
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

    public void e0() {
        a2 a2Var = (a2) g.e(this.q);
        if (!c.f.a.b.e3.c1.h.f6948a.equals(this.z) && this.B) {
            AdsManager adsManager = this.u;
            if (adsManager != null) {
                adsManager.pause();
            }
            this.z = this.z.j(this.G ? w0.d(a2Var.getCurrentPosition()) : 0L);
        }
        this.t = r0();
        this.s = n0();
        this.r = p0();
        a2Var.p(this);
        this.q = null;
    }

    @Override // c.f.a.b.a2.c
    public void f(a2.f fVar, a2.f fVar2, int i2) {
        y0();
    }

    public final void f0() {
        AdsManager adsManager = this.u;
        if (adsManager != null) {
            adsManager.removeAdErrorListener(this.f10540i);
            AdErrorEvent.AdErrorListener adErrorListener = this.f10533b.f10588k;
            if (adErrorListener != null) {
                this.u.removeAdErrorListener(adErrorListener);
            }
            this.u.removeAdEventListener(this.f10540i);
            AdEvent.AdEventListener adEventListener = this.f10533b.f10589l;
            if (adEventListener != null) {
                this.u.removeAdEventListener(adEventListener);
            }
            this.u.destroy();
            this.u = null;
        }
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void g(int i2) {
        c2.o(this, i2);
    }

    public final void g0() {
        if (this.F || this.y == -9223372036854775807L || this.M != -9223372036854775807L || o0((a2) g.e(this.q), this.x, this.f10538g) + 5000 < this.y) {
            return;
        }
        P0();
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

    public final int i0(AdPodInfo adPodInfo) {
        return adPodInfo.getPodIndex() == -1 ? this.z.f6952e - 1 : j0(adPodInfo.getTimeOffset());
    }

    public final int j0(double d2) {
        double d3 = (float) d2;
        Double.isNaN(d3);
        long jRound = Math.round(d3 * 1000000.0d);
        int i2 = 0;
        while (true) {
            c.f.a.b.e3.c1.h hVar = this.z;
            if (i2 >= hVar.f6952e) {
                throw new IllegalStateException("Failed to find cue point");
            }
            long j2 = hVar.b(i2).f6958b;
            if (j2 != Long.MIN_VALUE && Math.abs(j2 - jRound) < 1000) {
                return i2;
            }
            i2++;
        }
    }

    @Override // c.f.a.b.w2.c
    public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
        c2.d(this, bVar);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void l(List list) {
        b2.q(this, list);
    }

    public final String l0(AdMediaInfo adMediaInfo) {
        C0143b c0143b = this.f10544m.get(adMediaInfo);
        StringBuilder sb = new StringBuilder();
        sb.append("AdMediaInfo[");
        sb.append(adMediaInfo == null ? Constants.NULL_VERSION_ID : adMediaInfo.getUrl());
        sb.append(", ");
        sb.append(c0143b);
        sb.append("]");
        return sb.toString();
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void m0(boolean z) {
        c2.h(this, z);
    }

    public final VideoProgressUpdate n0() {
        a2 a2Var = this.q;
        if (a2Var == null) {
            return this.s;
        }
        if (this.C == 0 || !this.G) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long duration = a2Var.getDuration();
        return duration == -9223372036854775807L ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : new VideoProgressUpdate(this.q.getCurrentPosition(), duration);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void onRepeatModeChanged(int i2) {
        c2.t(this, i2);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void p(boolean z) {
        c2.g(this, z);
    }

    public final VideoProgressUpdate p0() {
        boolean z = this.y != -9223372036854775807L;
        long jO0 = this.M;
        if (jO0 != -9223372036854775807L) {
            this.N = true;
        } else {
            a2 a2Var = this.q;
            if (a2Var == null) {
                return this.r;
            }
            if (this.K != -9223372036854775807L) {
                jO0 = this.L + (SystemClock.elapsedRealtime() - this.K);
            } else {
                if (this.C != 0 || this.G || !z) {
                    return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
                }
                jO0 = o0(a2Var, this.x, this.f10538g);
            }
        }
        return new VideoProgressUpdate(jO0, z ? this.y : -1L);
    }

    public final int q0() {
        a2 a2Var = this.q;
        if (a2Var == null) {
            return -1;
        }
        long jD = w0.d(o0(a2Var, this.x, this.f10538g));
        int iD = this.z.d(jD, w0.d(this.y));
        return iD == -1 ? this.z.c(jD, w0.d(this.y)) : iD;
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void r() {
        b2.o(this);
    }

    public final int r0() {
        a2 a2Var = this.q;
        return a2Var == null ? this.t : a2Var.C(21) ? (int) (a2Var.getVolume() * 100.0f) : n.b(a2Var.N(), 1) ? 100 : 0;
    }

    @Override // c.f.a.b.a2.c
    public void s(x1 x1Var) {
        if (this.C != 0) {
            AdMediaInfo adMediaInfo = (AdMediaInfo) g.e(this.D);
            for (int i2 = 0; i2 < this.f10542k.size(); i2++) {
                this.f10542k.get(i2).onError(adMediaInfo);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void s0(AdEvent adEvent) {
        if (this.u == null) {
        }
        int i2 = 0;
        switch (a.f10547a[adEvent.getType().ordinal()]) {
            case 1:
                String str = (String) g.e(adEvent.getAdData().get("adBreakTime"));
                if (this.f10533b.f10592o) {
                    z.b("AdTagLoader", "Fetch error for ad at " + str + " seconds");
                }
                double d2 = Double.parseDouble(str);
                D0(d2 == -1.0d ? this.z.f6952e - 1 : j0(d2));
                break;
            case 2:
                this.B = true;
                J0();
                break;
            case 3:
                while (i2 < this.f10541j.size()) {
                    this.f10541j.get(i2).d();
                    i2++;
                }
                break;
            case 4:
                while (i2 < this.f10541j.size()) {
                    this.f10541j.get(i2).b();
                    i2++;
                }
                break;
            case 5:
                this.B = false;
                O0();
                break;
            case 6:
                z.g("AdTagLoader", "AdEvent: " + adEvent.getAdData());
                break;
        }
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void t(a2.b bVar) {
        c2.b(this, bVar);
    }

    public final void t0(Exception exc) {
        int iQ0 = q0();
        if (iQ0 == -1) {
            z.j("AdTagLoader", "Unable to determine ad group index for ad group load error", exc);
            return;
        }
        D0(iQ0);
        if (this.w == null) {
            this.w = k.a.b(exc, iQ0);
        }
    }

    public final void u0(int i2, int i3, Exception exc) {
        if (this.f10533b.f10592o) {
            z.c("AdTagLoader", "Prepare error for ad " + i3 + " in group " + i2, exc);
        }
        if (this.u == null) {
            z.i("AdTagLoader", "Ignoring ad prepare error after release");
            return;
        }
        if (this.C == 0) {
            this.K = SystemClock.elapsedRealtime();
            long jE = w0.e(this.z.b(i2).f6958b);
            this.L = jE;
            if (jE == Long.MIN_VALUE) {
                this.L = this.y;
            }
            this.J = new C0143b(i2, i3);
        } else {
            AdMediaInfo adMediaInfo = (AdMediaInfo) g.e(this.D);
            if (i3 > this.I) {
                for (int i4 = 0; i4 < this.f10542k.size(); i4++) {
                    this.f10542k.get(i4).onEnded(adMediaInfo);
                }
            }
            this.I = this.z.b(i2).c();
            for (int i5 = 0; i5 < this.f10542k.size(); i5++) {
                this.f10542k.get(i5).onError((AdMediaInfo) g.e(adMediaInfo));
            }
        }
        this.z = this.z.i(i2, i3);
        T0();
    }

    @Override // c.f.a.b.a2.c
    public void v(p2 p2Var, int i2) {
        if (p2Var.q()) {
            return;
        }
        this.x = p2Var;
        a2 a2Var = (a2) g.e(this.q);
        long j2 = p2Var.f(a2Var.l(), this.f10538g).f9705e;
        this.y = w0.e(j2);
        c.f.a.b.e3.c1.h hVar = this.z;
        if (j2 != hVar.f6954g) {
            this.z = hVar.l(j2);
            T0();
        }
        E0(o0(a2Var, p2Var, this.f10538g), this.y);
        y0();
    }

    public final void v0(boolean z, int i2) {
        if (this.G && this.C == 1) {
            boolean z2 = this.H;
            if (!z2 && i2 == 2) {
                this.H = true;
                AdMediaInfo adMediaInfo = (AdMediaInfo) g.e(this.D);
                for (int i3 = 0; i3 < this.f10542k.size(); i3++) {
                    this.f10542k.get(i3).onBuffering(adMediaInfo);
                }
                S0();
            } else if (z2 && i2 == 3) {
                this.H = false;
                U0();
            }
        }
        int i4 = this.C;
        if (i4 == 0 && i2 == 2 && z) {
            g0();
            return;
        }
        if (i4 == 0 || i2 != 4) {
            return;
        }
        AdMediaInfo adMediaInfo2 = this.D;
        if (adMediaInfo2 == null) {
            z.i("AdTagLoader", "onEnded without ad media info");
        } else {
            for (int i5 = 0; i5 < this.f10542k.size(); i5++) {
                this.f10542k.get(i5).onEnded(adMediaInfo2);
            }
        }
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onPlaybackStateChanged");
        }
    }

    public void w0(int i2, int i3) {
        C0143b c0143b = new C0143b(i2, i3);
        if (this.f10533b.f10592o) {
            z.b("AdTagLoader", "Prepared ad " + c0143b);
        }
        AdMediaInfo adMediaInfo = this.f10544m.B().get(c0143b);
        if (adMediaInfo != null) {
            for (int i4 = 0; i4 < this.f10542k.size(); i4++) {
                this.f10542k.get(i4).onLoaded(adMediaInfo);
            }
            return;
        }
        z.i("AdTagLoader", "Unexpected prepared ad " + c0143b);
    }

    @Override // c.f.a.b.a2.c
    public void x(int i2) {
        long jElapsedRealtime;
        a2 a2Var = this.q;
        if (this.u == null || a2Var == null) {
            return;
        }
        if (i2 != 2 || a2Var.e() || !A0()) {
            if (i2 == 3) {
                jElapsedRealtime = -9223372036854775807L;
            }
            v0(a2Var.i(), i2);
        }
        jElapsedRealtime = SystemClock.elapsedRealtime();
        this.O = jElapsedRealtime;
        v0(a2Var.i(), i2);
    }

    public void x0(int i2, int i3, IOException iOException) {
        if (this.q == null) {
            return;
        }
        try {
            u0(i2, i3, iOException);
        } catch (RuntimeException e2) {
            F0("handlePrepareError", e2);
        }
    }

    public final void y0() {
        a2 a2Var = this.q;
        if (this.u == null || a2Var == null) {
            return;
        }
        if (!this.G && !a2Var.e()) {
            g0();
            if (!this.F && !this.x.q()) {
                long jO0 = o0(a2Var, this.x, this.f10538g);
                this.x.f(a2Var.l(), this.f10538g);
                if (this.f10538g.e(w0.d(jO0)) != -1) {
                    this.N = false;
                    this.M = jO0;
                }
            }
        }
        boolean z = this.G;
        int i2 = this.I;
        boolean zE = a2Var.e();
        this.G = zE;
        int iQ = zE ? a2Var.q() : -1;
        this.I = iQ;
        if (z && iQ != i2) {
            AdMediaInfo adMediaInfo = this.D;
            if (adMediaInfo == null) {
                z.i("AdTagLoader", "onEnded without ad media info");
            } else {
                C0143b c0143b = this.f10544m.get(adMediaInfo);
                int i3 = this.I;
                if (i3 == -1 || (c0143b != null && c0143b.f10549b < i3)) {
                    for (int i4 = 0; i4 < this.f10542k.size(); i4++) {
                        this.f10542k.get(i4).onEnded(adMediaInfo);
                    }
                    if (this.f10533b.f10592o) {
                        z.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onTimelineChanged/onPositionDiscontinuity");
                    }
                }
            }
        }
        if (this.F || z || !this.G || this.C != 0) {
            return;
        }
        h.a aVarB = this.z.b(a2Var.B());
        if (aVarB.f6958b == Long.MIN_VALUE) {
            P0();
            return;
        }
        this.K = SystemClock.elapsedRealtime();
        long jE = w0.e(aVarB.f6958b);
        this.L = jE;
        if (jE == Long.MIN_VALUE) {
            this.L = this.y;
        }
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void z(q1 q1Var) {
        c2.j(this, q1Var);
    }
}

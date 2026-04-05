package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public final class fi implements VideoAdPlayer, ResizablePlayer, fj, fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lx f21783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceView f21784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ais f21785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f21786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f21787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<VideoAdPlayer.VideoAdPlayerCallback> f21788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashSet<AdMediaInfo> f21789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ff f21790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fg f21791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fh f21792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<AdMediaInfo> f21793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ajq f21794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private aar f21795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdPodInfo f21796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21797o;

    public fi(Context context, ViewGroup viewGroup) {
        lx lxVarD = new lu(context, new fk(context)).d();
        this.f21793k = new ArrayList<>();
        this.f21787e = viewGroup;
        this.f21783a = lxVarD;
        this.f21794l = new ajq(context, amn.an(context));
        this.f21788f = new ArrayList(1);
        fg fgVar = new fg(this);
        this.f21791i = fgVar;
        this.f21789g = avq.c(4);
        fh fhVar = new fh(this);
        this.f21792j = fhVar;
        this.f21790h = new ff(this);
        lxVarD.H(fgVar);
        lxVarD.I(fhVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21786d = frameLayout;
        frameLayout.setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        ais aisVar = new ais(context);
        this.f21785c = aisVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        aisVar.setLayoutParams(layoutParams);
        this.f21797o = 1;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f21784b = surfaceView;
        surfaceView.setZOrderMediaOverlay(true);
        lxVarD.P(surfaceView);
        aisVar.addView(surfaceView);
        frameLayout.addView(aisVar);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    private final int i(AdMediaInfo adMediaInfo) {
        return this.f21793k.indexOf(adMediaInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdMediaInfo j(int i2) {
        if (i2 < 0 || i2 >= this.f21793k.size()) {
            return null;
        }
        return this.f21793k.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdMediaInfo k() {
        int iF = this.f21783a.f();
        if (this.f21795m == null) {
            return null;
        }
        return j(iF);
    }

    private final void l(AdMediaInfo adMediaInfo) {
        abi abiVarA;
        Uri uri = Uri.parse(adMediaInfo.getUrl());
        int i2 = amn.i(uri);
        if (i2 == 0) {
            ajq ajqVar = this.f21794l;
            abiVarA = new adz(new aeh(adc.f19243b, ajqVar), ajqVar).a(uri);
        } else if (i2 == 2) {
            abiVarA = new agb(new afo(this.f21794l)).a(uri);
        } else {
            if (i2 != 4) {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Unsupported type: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            abiVarA = new acc(this.f21794l, new rn(1)).a(uri);
        }
        this.f21795m.F(abiVarA);
        this.f21793k.add(adMediaInfo);
    }

    private final void m() {
        this.f21786d.setVisibility(8);
        this.f21784b.setVisibility(4);
        this.f21795m = null;
        this.f21790h.b();
        this.f21797o = 1;
        this.f21783a.b();
        this.f21783a.V();
        this.f21789g.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fe
    public final void a() {
        AdMediaInfo adMediaInfoK = k();
        VideoProgressUpdate adProgress = getAdProgress();
        Iterator<VideoAdPlayer.VideoAdPlayerCallback> it = this.f21788f.iterator();
        while (it.hasNext()) {
            it.next().onAdProgress(adMediaInfoK, adProgress);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f21788f.add(videoAdPlayerCallback);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return ((this.f21783a.j() == 2 || this.f21783a.j() == 3) && this.f21783a.l() > 0) ? new VideoProgressUpdate(this.f21783a.i(), this.f21783a.l()) : VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
    public final int getVolume() {
        return 100;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f21795m != null) {
            AdPodInfo adPodInfo2 = this.f21796n;
            if (adPodInfo2 == null || adPodInfo == null || adPodInfo2.getPodIndex() != adPodInfo.getPodIndex()) {
                throw new IllegalStateException("Called loadAd on an ad from a different ad break.");
            }
            l(adMediaInfo);
            return;
        }
        this.f21783a.b();
        lx lxVar = this.f21783a;
        lxVar.C(lxVar.f());
        this.f21793k.clear();
        this.f21795m = new aar(new acn(), new abi[0]);
        this.f21796n = adPodInfo;
        l(adMediaInfo);
        this.f21783a.N(false);
        this.f21783a.J(this.f21795m);
        this.f21797o = 2;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void pauseAd(AdMediaInfo adMediaInfo) {
        this.f21790h.b();
        this.f21797o = 4;
        this.f21783a.N(false);
        Iterator<VideoAdPlayer.VideoAdPlayerCallback> it = this.f21788f.iterator();
        while (it.hasNext()) {
            it.next().onPause(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void playAd(AdMediaInfo adMediaInfo) {
        if (this.f21795m == null || !this.f21793k.contains(adMediaInfo)) {
            throw new IllegalStateException("Call to playAd without appropriate call to loadAd first.");
        }
        this.f21786d.setVisibility(0);
        this.f21784b.setVisibility(0);
        int i2 = this.f21797o;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            throw new IllegalStateException("Call to playAd when player state is not LOADED.");
        }
        if (i3 == 1) {
            Iterator<VideoAdPlayer.VideoAdPlayerCallback> it = this.f21788f.iterator();
            while (it.hasNext()) {
                it.next().onPlay(adMediaInfo);
            }
            this.f21783a.O(this.f21784b.getHolder());
        } else {
            if (i3 == 2) {
                return;
            }
            if (i3 == 3) {
                Iterator<VideoAdPlayer.VideoAdPlayerCallback> it2 = this.f21788f.iterator();
                while (it2.hasNext()) {
                    it2.next().onResume(adMediaInfo);
                }
            }
        }
        this.f21790h.a();
        this.f21797o = 3;
        this.f21783a.N(true);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void release() {
        m();
        this.f21783a.L(this.f21791i);
        this.f21783a.M(this.f21792j);
        this.f21783a.K();
        this.f21790h.b();
        this.f21787e.removeView(this.f21786d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f21788f.remove(videoAdPlayerCallback);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.ResizablePlayer
    public final void resize(int i2, int i3, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((this.f21787e.getWidth() - i2) - i4, (this.f21787e.getHeight() - i3) - i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        this.f21785c.setLayoutParams(layoutParams);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void stopAd(AdMediaInfo adMediaInfo) {
        if (this.f21795m == null) {
            Log.e("IMASDK", "Attempting to stop when no current ad source");
            return;
        }
        this.f21789g.add(adMediaInfo);
        int i2 = i(adMediaInfo);
        int iF = this.f21783a.f();
        if (i2 == iF) {
            if (i(adMediaInfo) == this.f21793k.size() - 1) {
                m();
                return;
            } else {
                this.f21783a.C(this.f21783a.f() + 1);
                return;
            }
        }
        if (i2 > iF) {
            this.f21795m.J(i(adMediaInfo));
            this.f21793k.remove(adMediaInfo);
        }
    }
}

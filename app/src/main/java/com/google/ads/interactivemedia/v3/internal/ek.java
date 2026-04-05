package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;

/* JADX INFO: loaded from: classes.dex */
public final class ek implements fb, cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdDisplayContainer f21713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoAdPlayer f21714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dn f21715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ed f21716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cm f21718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final atq<du, AdMediaInfo> f21719g = atq.p();

    public ek(String str, ed edVar, dn dnVar, AdDisplayContainer adDisplayContainer) {
        this.f21713a = adDisplayContainer;
        VideoAdPlayer player = adDisplayContainer.getPlayer();
        this.f21714b = player;
        this.f21715c = dnVar;
        this.f21716d = edVar;
        this.f21717e = str;
        cm cmVar = new cm(this);
        this.f21718f = cmVar;
        player.addCallback(cmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cl
    public final void a(du duVar, dv dvVar) {
        this.f21716d.o(new dw(duVar, dvVar, "*"));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cl
    public final void b(dv dvVar, AdMediaInfo adMediaInfo, Object obj) {
        du duVar = this.f21719g.g().get(adMediaInfo);
        if (duVar != null) {
            this.f21716d.o(new dw(duVar, dvVar, this.f21717e, obj));
            return;
        }
        String strValueOf = String.valueOf(dvVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 113);
        sb.append("The adMediaInfo for the ");
        sb.append(strValueOf);
        sb.append(" event is not active. This may occur if callbacks are triggered after the ad is unloaded.");
        pn.g(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void c() {
        pn.f("Destroying NativeVideoDisplay");
        this.f21714b.removeCallback(this.f21718f);
        this.f21714b.release();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void d() {
    }

    public final void e() {
        this.f21718f.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void f(du duVar, dv dvVar, com.google.ads.interactivemedia.v3.impl.data.ba baVar) {
        AdMediaInfo adMediaInfo = this.f21719g.get(duVar);
        dv dvVar2 = dv.activate;
        int iOrdinal = dvVar.ordinal();
        if (iOrdinal != 33) {
            if (iOrdinal == 42) {
                if (baVar == null || baVar.videoUrl == null) {
                    this.f21715c.c(new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
                    return;
                }
                this.f21718f.a();
                AdMediaInfo adMediaInfo2 = new AdMediaInfo(baVar.videoUrl);
                com.google.ads.interactivemedia.v3.impl.data.d dVar = baVar.adPodInfo;
                if (dVar == null) {
                    dVar = null;
                }
                this.f21719g.put(duVar, adMediaInfo2);
                this.f21714b.loadAd(adMediaInfo2, dVar);
                return;
            }
            if (iOrdinal != 71) {
                if (iOrdinal == 51) {
                    this.f21714b.pauseAd(adMediaInfo);
                    return;
                } else {
                    if (iOrdinal != 52) {
                        return;
                    }
                    this.f21714b.playAd(adMediaInfo);
                    this.f21718f.a();
                    return;
                }
            }
        }
        this.f21714b.stopAd(adMediaInfo);
        this.f21719g.remove(duVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void g(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f21714b instanceof ResizablePlayer)) {
            pn.d("Video player does not support resizing.");
            return;
        }
        if (!pn.c(this.f21713a, resizeAndPositionVideoMsgData)) {
            pn.d("Creative resize parameters were not within the containers bounds.");
            return;
        }
        int width = this.f21713a.getAdContainer().getWidth();
        int height = this.f21713a.getAdContainer().getHeight();
        int iIntValue = resizeAndPositionVideoMsgData.x().intValue();
        int iIntValue2 = resizeAndPositionVideoMsgData.width().intValue();
        int iIntValue3 = resizeAndPositionVideoMsgData.y().intValue();
        ((ResizablePlayer) this.f21714b).resize(resizeAndPositionVideoMsgData.x().intValue(), resizeAndPositionVideoMsgData.y().intValue(), (width - iIntValue) - iIntValue2, (height - iIntValue3) - resizeAndPositionVideoMsgData.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.f21714b.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void h() {
        VideoAdPlayer videoAdPlayer = this.f21714b;
        if (videoAdPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoAdPlayer).resize(0, 0, 0, 0);
        }
    }

    public final boolean i() {
        return this.f21714b instanceof fj;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class cv extends dg implements AdsManager, AdErrorEvent.AdErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Float> f21590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fc f21591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl f21592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ev f21593d;

    public cv(String str, ed edVar, AdDisplayContainer adDisplayContainer, ev evVar, List list, SortedSet sortedSet, es esVar, dn dnVar, Context context, boolean z) {
        ek ekVar = new ek(str, edVar, dnVar, adDisplayContainer);
        ch chVar = new ch(str, edVar, adDisplayContainer.getAdContainer());
        fc fcVar = new fc(edVar.a(), adDisplayContainer.getAdContainer());
        super(str, edVar, ekVar, adDisplayContainer, chVar, esVar, dnVar, context, z, new fq());
        this.f21590a = list;
        this.f21593d = evVar;
        this.f21591b = fcVar;
        if (evVar != null) {
            dl dlVar = new dl(edVar, sortedSet, str);
            this.f21592c = dlVar;
            evVar.b(dlVar);
            evVar.d();
        }
        addAdErrorListener(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dg
    public final Map<String, Object> a(AdsRenderingSettings adsRenderingSettings) {
        Map<String, Object> mapA = super.a(adsRenderingSettings);
        ev evVar = this.f21593d;
        if (evVar != null) {
            if (!evVar.f().equals(VideoProgressUpdate.VIDEO_TIME_NOT_READY)) {
                double currentTimeMs = r0.getCurrentTimeMs() / 1000.0f;
                StringBuilder sb = new StringBuilder(68);
                sb.append("AdsManager.init -> Setting contentStartTime ");
                sb.append(currentTimeMs);
                pn.f(sb.toString());
                mapA.put("contentStartTime", Double.valueOf(currentTimeMs));
            }
        }
        return mapA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dg, com.google.ads.interactivemedia.v3.internal.eb
    public final void b(ea eaVar) {
        ek ekVar = (ek) c();
        AdEvent.AdEventType adEventType = eaVar.f21684a;
        AdEvent.AdEventType adEventType2 = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int iOrdinal = adEventType.ordinal();
        if (iOrdinal == 0) {
            super.destroy();
            ev evVar = this.f21593d;
            if (evVar != null) {
                evVar.e();
                this.f21593d = null;
            }
            this.f21591b.a();
            m(dv.destroy);
            super.b(eaVar);
            k();
            return;
        }
        if (iOrdinal == 5) {
            ev evVar2 = this.f21593d;
            if (evVar2 != null) {
                evVar2.e();
            }
        } else if (iOrdinal == 6) {
            this.f21591b.a();
            ekVar.e();
            ev evVar3 = this.f21593d;
            if (evVar3 != null) {
                evVar3.d();
            }
        } else if (iOrdinal == 14) {
            this.f21591b.a();
        } else if (iOrdinal == 15) {
            this.f21591b.b();
        }
        super.b(eaVar);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void clicked() {
        m(dv.click);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dg, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        ev evVar = this.f21593d;
        if (evVar != null) {
            evVar.e();
            this.f21593d = null;
        }
        this.f21591b.a();
        m(dv.destroy);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void discardAdBreak() {
        m(dv.discardAdBreak);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final List<Float> getAdCuePoints() {
        return this.f21590a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return ((ek) c()).i();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        this.f21591b.a();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void pause() {
        m(dv.pause);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void requestNextAdBreak() {
        ev evVar = this.f21593d;
        if (evVar != null) {
            l(du.contentTimeUpdate, dv.contentTimeUpdate, com.google.ads.interactivemedia.v3.impl.data.bj.create(evVar.f()));
            m(dv.requestNextAdBreak);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void resume() {
        m(dv.resume);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void skip() {
        m(dv.skip);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void start() {
        m(dv.start);
    }
}

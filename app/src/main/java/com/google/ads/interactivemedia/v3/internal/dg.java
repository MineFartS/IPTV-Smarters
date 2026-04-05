package com.google.ads.interactivemedia.v3.internal;

import android.app.Application;
import android.content.Context;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.BaseManager;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class dg implements BaseManager, eb, fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f21630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21631b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dn f21633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f21634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ch f21635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final es f21636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fb f21637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.ads.interactivemedia.v3.impl.data.c f21638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AdProgressInfo f21639j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final fq f21642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private fm f21643n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<AdEvent.AdEventListener> f21632c = new ArrayList(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21641l = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AdsRenderingSettings f21640k = new com.google.ads.interactivemedia.v3.impl.data.g();

    public dg(String str, ed edVar, fb fbVar, BaseDisplayContainer baseDisplayContainer, ch chVar, es esVar, dn dnVar, Context context, boolean z, fq fqVar) {
        this.f21631b = str;
        this.f21630a = edVar;
        this.f21637h = fbVar;
        this.f21634e = context;
        this.f21633d = dnVar;
        this.f21635f = chVar;
        chVar.k(z);
        if (esVar == null) {
            esVar = null;
        } else {
            esVar.f(str);
            esVar.d(baseDisplayContainer.getAdContainer());
            addAdEventListener(esVar);
            addAdErrorListener(esVar);
            df dfVar = (df) baseDisplayContainer;
            Iterator<FriendlyObstruction> it = dfVar.b().iterator();
            while (it.hasNext()) {
                esVar.c(it.next());
            }
            dfVar.c(esVar);
        }
        this.f21636g = esVar;
        this.f21642m = fqVar;
        edVar.f(this, str);
        edVar.h(this.f21637h, str);
        chVar.g();
        Application applicationB = ly.b(context);
        if (applicationB != null) {
            fm fmVar = new fm(applicationB);
            this.f21643n = fmVar;
            fmVar.a(this);
        }
    }

    private final void n(AdErrorEvent adErrorEvent) {
        this.f21639j = null;
        this.f21633d.c(adErrorEvent);
    }

    private final void o(String str) {
        if (ly.c(this.f21634e, this.f21630a.b())) {
            this.f21630a.a().requestFocus();
            this.f21630a.o(new dw(du.userInteraction, dv.focusUiElement, str));
        }
    }

    private final boolean p() {
        return this.f21640k.getFocusSkipButtonWhenAvailable();
    }

    public Map<String, Object> a(AdsRenderingSettings adsRenderingSettings) {
        HashMap map = new HashMap();
        map.put("adsRenderingSettings", com.google.ads.interactivemedia.v3.impl.data.f.builder(adsRenderingSettings).build());
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f21633d.a(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f21632c.add(adEventListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.google.ads.interactivemedia.v3.internal.ea r6) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r0 = r6.f21684a
            com.google.ads.interactivemedia.v3.impl.data.c r1 = r6.f21685b
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r2 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.ALL_ADS_COMPLETED
            int r2 = r0.ordinal()
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L4f
            r3 = 24
            if (r2 == r3) goto L4f
            r3 = 5
            if (r2 == r3) goto L49
            r3 = 6
            if (r2 == r3) goto L43
            r3 = 20
            if (r2 == r3) goto L40
            r3 = 21
            if (r2 == r3) goto L3b
            switch(r2) {
                case 13: goto L2f;
                case 14: goto L4f;
                case 15: goto L24;
                default: goto L23;
            }
        L23:
            goto L51
        L24:
            if (r1 == 0) goto L28
            r5.f21638i = r1
        L28:
            boolean r1 = r5.p()
            if (r1 == 0) goto L51
            goto L35
        L2f:
            boolean r1 = r5.p()
            if (r1 == 0) goto L51
        L35:
            java.lang.String r1 = r5.f21631b
            r5.o(r1)
            goto L51
        L3b:
            com.google.ads.interactivemedia.v3.api.AdProgressInfo r1 = r6.f21688e
            r5.f21639j = r1
            goto L51
        L40:
            r5.f21638i = r1
            goto L51
        L43:
            com.google.ads.interactivemedia.v3.internal.ch r1 = r5.f21635f
            r1.l()
            goto L51
        L49:
            com.google.ads.interactivemedia.v3.internal.ch r1 = r5.f21635f
            r1.j()
            goto L51
        L4f:
            r5.f21639j = r4
        L51:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f21686c
            com.google.ads.interactivemedia.v3.internal.ck r1 = new com.google.ads.interactivemedia.v3.internal.ck
            com.google.ads.interactivemedia.v3.impl.data.c r2 = r5.f21638i
            r1.<init>(r0, r2, r6)
            java.util.List<com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener> r6 = r5.f21632c
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r6.next()
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener r2 = (com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener) r2
            r2.onAdEvent(r1)
            goto L60
        L70:
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.COMPLETED
            if (r0 == r6) goto L7a
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.SKIPPED
            if (r0 != r6) goto L79
            goto L7a
        L79:
            return
        L7a:
            r5.f21638i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.dg.b(com.google.ads.interactivemedia.v3.internal.ea):void");
    }

    public final fb c() {
        return this.f21637h;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fl
    public final void d() {
        this.f21630a.o(new dw(du.adsManager, dv.appBackgrounding, this.f21631b));
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public void destroy() {
        this.f21641l = true;
        this.f21636g.h();
        this.f21635f.h();
        this.f21635f.l();
        fm fmVar = this.f21643n;
        if (fmVar != null) {
            fmVar.b();
        }
        this.f21637h.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fl
    public final void e() {
        this.f21630a.o(new dw(du.adsManager, dv.appForegrounding, this.f21631b));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eb
    public final void f(AdError.AdErrorType adErrorType, int i2, String str) {
        n(new cj(new AdError(adErrorType, i2, str)));
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void focus() {
        o(this.f21631b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eb
    public final void g(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str) {
        n(new cj(new AdError(adErrorType, adErrorCode, str)));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.f21641l ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : this.f21637h.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final AdProgressInfo getAdProgressInfo() {
        return this.f21639j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final Ad getCurrentAd() {
        return this.f21638i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eb
    public final void h(String str) {
        this.f21642m.a(str, this.f21634e, this.f21640k.getEnableCustomTabs());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eb
    public final void i(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        this.f21637h.g(resizeAndPositionVideoMsgData);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init() {
        init(null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init(AdsRenderingSettings adsRenderingSettings) {
        if (adsRenderingSettings != null) {
            this.f21640k = adsRenderingSettings;
        }
        this.f21630a.o(new dw(du.adsManager, dv.init, this.f21631b, a(this.f21640k)));
        this.f21637h.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eb
    public final void j() {
        this.f21637h.h();
    }

    public final void k() {
        this.f21630a.n(this.f21631b);
        this.f21632c.clear();
        this.f21633d.b();
    }

    public final void l(du duVar, dv dvVar, Object obj) {
        this.f21630a.o(new dw(duVar, dvVar, this.f21631b, obj));
    }

    public final void m(dv dvVar) {
        this.f21630a.o(new dw(du.adsManager, dvVar, this.f21631b));
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f21633d.d(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f21632c.remove(adEventListener);
    }
}

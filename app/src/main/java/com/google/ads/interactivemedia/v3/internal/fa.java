package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.HashMap;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fa implements VideoStreamPlayer.VideoStreamPlayerCallback, fb, eu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoStreamPlayer f21765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ed f21766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dn f21767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fc f21769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final StreamDisplayContainer f21772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ev f21773i;

    public fa(String str, ed edVar, dn dnVar, StreamDisplayContainer streamDisplayContainer, String str2) {
        ev evVar = new ev(streamDisplayContainer.getVideoStreamPlayer());
        fc fcVar = new fc(edVar.a(), streamDisplayContainer.getAdContainer());
        this.f21768d = false;
        this.f21765a = streamDisplayContainer.getVideoStreamPlayer();
        this.f21767c = dnVar;
        this.f21770f = str;
        this.f21766b = edVar;
        this.f21771g = str2;
        this.f21768d = false;
        this.f21772h = streamDisplayContainer;
        this.f21773i = evVar;
        this.f21769e = fcVar;
    }

    private final void o(dv dvVar, Object obj) {
        this.f21766b.o(new dw(du.videoDisplay1, dvVar, this.f21770f, obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eu
    public final void a(VideoProgressUpdate videoProgressUpdate) {
        if (!this.f21768d) {
            o(dv.start, com.google.ads.interactivemedia.v3.impl.data.bo.builder().volumePercentage(this.f21765a.getVolume()).build());
            this.f21768d = true;
        }
        o(dv.timeupdate, com.google.ads.interactivemedia.v3.impl.data.bj.create(videoProgressUpdate));
    }

    public final void b() {
        this.f21765a.onAdBreakEnded();
        n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void c() {
        pn.f("Destroying StreamVideoDisplay");
        this.f21765a.removeCallback(this);
        this.f21765a = null;
        this.f21766b = null;
        ev evVar = this.f21773i;
        if (evVar != null) {
            evVar.e();
            this.f21773i.c(this);
        }
        this.f21773i = null;
        this.f21769e.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void d() {
        this.f21773i.b(this);
        this.f21773i.d();
    }

    public final void e() {
        this.f21765a.onAdBreakStarted();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void f(du duVar, dv dvVar, com.google.ads.interactivemedia.v3.impl.data.ba baVar) {
        String string;
        dv dvVar2 = dv.activate;
        int iOrdinal = dvVar.ordinal();
        if (iOrdinal != 44) {
            if (iOrdinal == 51) {
                this.f21765a.pause();
                return;
            } else {
                if (iOrdinal != 52) {
                    return;
                }
                this.f21765a.resume();
                return;
            }
        }
        if (baVar == null || (string = baVar.streamUrl) == null) {
            this.f21767c.c(new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
            return;
        }
        int i2 = 0;
        this.f21768d = false;
        String str = this.f21771g;
        if (str != null && str.length() != 0) {
            String strTrim = this.f21771g.trim();
            String string2 = BuildConfig.FLAVOR;
            String strReplaceAll = strTrim.replaceAll("\\s+", BuildConfig.FLAVOR);
            if (strReplaceAll.charAt(0) == '?') {
                strReplaceAll = strReplaceAll.substring(1);
            }
            if (strReplaceAll.length() != 0) {
                Map<String, String> mapB = fq.b(Uri.parse(string));
                HashMap map = new HashMap();
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                builderBuildUpon.clearQuery();
                Map<String, String> mapB2 = fq.b(Uri.parse(strReplaceAll.length() != 0 ? "http://www.dom.com/path?".concat(strReplaceAll) : new String("http://www.dom.com/path?")));
                map.putAll(mapB2);
                if (!mapB.isEmpty()) {
                    for (String str2 : mapB.keySet()) {
                        if (!mapB2.containsKey(str2)) {
                            map.put(str2, mapB.get(str2));
                        }
                    }
                }
                if (map.size() != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        sb.append(str3);
                        sb.append("=");
                        sb.append(str4);
                        if (i2 < map.size() - 1) {
                            sb.append("&");
                        }
                        i2++;
                    }
                    string2 = sb.toString();
                }
                builderBuildUpon.encodedQuery(string2);
                string = builderBuildUpon.build().toString();
            }
        }
        this.f21765a.loadUrl(string, baVar.subtitles);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void g(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f21765a instanceof ResizablePlayer)) {
            pn.d("Stream player does not support resizing.");
            return;
        }
        if (!pn.c(this.f21772h, resizeAndPositionVideoMsgData)) {
            pn.d("Video resize parameters were not within the container bounds.");
            return;
        }
        int width = this.f21772h.getAdContainer().getWidth();
        int height = this.f21772h.getAdContainer().getHeight();
        int iIntValue = resizeAndPositionVideoMsgData.x().intValue();
        int iIntValue2 = resizeAndPositionVideoMsgData.width().intValue();
        int iIntValue3 = resizeAndPositionVideoMsgData.y().intValue();
        ((ResizablePlayer) this.f21765a).resize(resizeAndPositionVideoMsgData.x().intValue(), resizeAndPositionVideoMsgData.y().intValue(), (width - iIntValue) - iIntValue2, (height - iIntValue3) - resizeAndPositionVideoMsgData.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.f21765a.getContentProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fb
    public final void h() {
        VideoStreamPlayer videoStreamPlayer = this.f21765a;
        if (videoStreamPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoStreamPlayer).resize(0, 0, 0, 0);
        }
    }

    public final void i() {
        this.f21765a.onAdPeriodEnded();
    }

    public final void j() {
        this.f21765a.onAdPeriodStarted();
    }

    public final void k() {
        this.f21765a.addCallback(this);
    }

    public final void l(long j2) {
        this.f21765a.seek(j2);
    }

    public final void m(com.google.ads.interactivemedia.v3.impl.data.c cVar) {
        if (cVar.isLinear()) {
            this.f21769e.b();
        }
    }

    public final void n() {
        this.f21769e.a();
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onContentComplete() {
        this.f21766b.o(new dw(du.adsLoader, dv.contentComplete, "*"));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onPause() {
        o(dv.pause, null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onResume() {
        o(dv.play, null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onUserTextReceived(String str) {
        o(dv.timedMetadata, ez.create(str));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onVolumeChanged(int i2) {
        o(dv.volumeChange, com.google.ads.interactivemedia.v3.impl.data.bo.builder().volumePercentage(i2).build());
    }
}

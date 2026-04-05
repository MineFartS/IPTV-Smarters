package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class co implements dz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cu f21563a;

    public co(cu cuVar) {
        this.f21563a = cuVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dz
    public final void a(String str, AdError.AdErrorType adErrorType, int i2, String str2) {
        this.f21563a.f21580e.c(new cj(new AdError(adErrorType, i2, str2), this.f21563a.f21582g.get(str) != null ? ((AdsRequest) this.f21563a.f21582g.get(str)).getUserRequestContext() : this.f21563a.f21583h.get(str) != null ? ((StreamRequest) this.f21563a.f21583h.get(str)).getUserRequestContext() : new Object()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dz
    public final void b(String str, List<Float> list, SortedSet<Float> sortedSet, boolean z) {
        AdsRequest adsRequest = (AdsRequest) this.f21563a.f21582g.get(str);
        if (adsRequest == null) {
            dn dnVar = this.f21563a.f21580e;
            AdError.AdErrorType adErrorType = AdError.AdErrorType.LOAD;
            AdError.AdErrorCode adErrorCode = AdError.AdErrorCode.INTERNAL_ERROR;
            String strValueOf = String.valueOf(str);
            dnVar.c(new cj(new AdError(adErrorType, adErrorCode, strValueOf.length() != 0 ? "Request not found for session id: ".concat(strValueOf) : new String("Request not found for session id: ")), new Object()));
            return;
        }
        ContentProgressProvider contentProgressProvider = adsRequest.getContentProgressProvider();
        AdError adError = null;
        ev evVar = contentProgressProvider != null ? new ev(contentProgressProvider) : null;
        this.f21563a.f21584i.e(((da) adsRequest).h());
        if (sortedSet != null && !sortedSet.isEmpty() && evVar == null) {
            adError = new AdError(AdError.AdErrorType.PLAY, AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING, "Unable to handle cue points, no content progress provider configured.");
        }
        if (adError != null) {
            this.f21563a.f21580e.c(new cj(adError, adsRequest.getUserRequestContext()));
        } else {
            cu cuVar = this.f21563a;
            cu.o(cuVar, new cw(new cv(str, cuVar.f21578c, this.f21563a.f21588m, evVar, list, sortedSet, this.f21563a.f21584i, new dn(), this.f21563a.f21577b, z), adsRequest.getUserRequestContext()));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dz
    public final void c(String str, String str2, boolean z) {
        StreamRequest streamRequest = (StreamRequest) this.f21563a.f21583h.get(str);
        cu cuVar = this.f21563a;
        if (streamRequest == null) {
            dn dnVar = cuVar.f21580e;
            AdError.AdErrorType adErrorType = AdError.AdErrorType.LOAD;
            AdError.AdErrorCode adErrorCode = AdError.AdErrorCode.INTERNAL_ERROR;
            String strValueOf = String.valueOf(str);
            dnVar.c(new cj(new AdError(adErrorType, adErrorCode, strValueOf.length() != 0 ? "Request not found for session id: ".concat(strValueOf) : new String("Request not found for session id: ")), new Object()));
            return;
        }
        cuVar.f21584i.e(streamRequest.getContentUrl());
        this.f21563a.f21584i.i();
        cu cuVar2 = this.f21563a;
        ed edVar = cuVar2.f21578c;
        String manifestSuffix = streamRequest.getManifestSuffix();
        es esVar = this.f21563a.f21584i;
        dn dnVar2 = new dn();
        Context context = this.f21563a.f21577b;
        StreamDisplayContainer streamDisplayContainer = this.f21563a.f21587l;
        cu.o(cuVar2, new cw(new ex(str, edVar, streamDisplayContainer, new fa(str, edVar, dnVar2, streamDisplayContainer, manifestSuffix), new ch(str, edVar, streamDisplayContainer.getAdContainer()), esVar, dnVar2, context, str2, z), streamRequest.getUserRequestContext()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dz
    public final void d(String str, AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode) {
        this.f21563a.f21580e.c(new cj(new AdError(adErrorType, adErrorCode, "adsLoaded message did not contain cue points."), this.f21563a.f21582g.get(str) != null ? ((AdsRequest) this.f21563a.f21582g.get(str)).getUserRequestContext() : this.f21563a.f21583h.get(str) != null ? ((StreamRequest) this.f21563a.f21583h.get(str)).getUserRequestContext() : new Object()));
    }
}

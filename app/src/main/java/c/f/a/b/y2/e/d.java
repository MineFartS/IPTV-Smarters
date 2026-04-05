package c.f.a.b.y2.e;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import c.f.a.b.i3.m;
import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f10581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f10582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f10584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<String> f10585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Set<UiElement> f10586i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Collection<CompanionAdSlot> f10587j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AdErrorEvent.AdErrorListener f10588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AdEvent.AdEventListener f10589l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final VideoAdPlayer.VideoAdPlayerCallback f10590m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ImaSdkSettings f10591n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f10592o;

        public a(long j2, int i2, int i3, boolean z, boolean z2, int i4, Boolean bool, List<String> list, Set<UiElement> set, Collection<CompanionAdSlot> collection, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings, boolean z3) {
            this.f10578a = j2;
            this.f10579b = i2;
            this.f10580c = i3;
            this.f10581d = z;
            this.f10582e = z2;
            this.f10583f = i4;
            this.f10584g = bool;
            this.f10585h = list;
            this.f10586i = set;
            this.f10587j = collection;
            this.f10588k = adErrorListener;
            this.f10589l = adEventListener;
            this.f10590m = videoAdPlayerCallback;
            this.f10591n = imaSdkSettings;
            this.f10592o = z3;
        }
    }

    public interface b {
        FriendlyObstruction a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

        AdsRenderingSettings b();

        AdsLoader c(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer);

        AdDisplayContainer d(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer);

        ImaSdkSettings e();

        AdsRequest f();

        AdDisplayContainer g(Context context, VideoAdPlayer videoAdPlayer);
    }

    public static long[] a(List<Float> list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            double dFloatValue = list.get(i3).floatValue();
            if (dFloatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                Double.isNaN(dFloatValue);
                jArr[i2] = Math.round(dFloatValue * 1000000.0d);
                i2++;
            }
        }
        Arrays.sort(jArr, 0, i2);
        return jArr;
    }

    public static AdsRequest b(b bVar, s sVar) {
        AdsRequest adsRequestF = bVar.f();
        if ("data".equals(sVar.f9061a.getScheme())) {
            m mVar = new m();
            try {
                mVar.g(sVar);
                adsRequestF.setAdsResponse(x0.E(x0.M0(mVar)));
            } finally {
                mVar.close();
            }
        } else {
            adsRequestF.setAdTagUrl(sVar.f9061a.toString());
        }
        return adsRequestF;
    }

    public static FriendlyObstructionPurpose c(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 3 ? FriendlyObstructionPurpose.OTHER : FriendlyObstructionPurpose.NOT_VISIBLE : FriendlyObstructionPurpose.CLOSE_AD : FriendlyObstructionPurpose.VIDEO_CONTROLS;
    }

    public static Looper d() {
        return Looper.getMainLooper();
    }

    public static String e(VideoProgressUpdate videoProgressUpdate) {
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY.equals(videoProgressUpdate) ? "not ready" : x0.D("%d ms of %d ms", Long.valueOf(videoProgressUpdate.getCurrentTimeMs()), Long.valueOf(videoProgressUpdate.getDurationMs()));
    }

    public static boolean f(AdError adError) {
        return adError.getErrorCode() == AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH || adError.getErrorCode() == AdError.AdErrorCode.UNKNOWN_ERROR;
    }
}

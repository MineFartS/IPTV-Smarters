package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class es implements AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, de, ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f21729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er f21730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f21731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f21732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<FriendlyObstruction> f21734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private al f21738j;

    public es(ed edVar, Context context) {
        er erVar = new er();
        this.f21735g = false;
        this.f21736h = false;
        this.f21737i = null;
        this.f21729a = edVar;
        this.f21731c = context;
        this.f21730b = erVar;
        this.f21734f = new HashSet();
    }

    private final void j(List<FriendlyObstruction> list) {
        com.google.ads.interactivemedia.v3.impl.data.bh bhVarBuild;
        if (list == null) {
            bhVarBuild = null;
        } else if (list.isEmpty()) {
            return;
        } else {
            bhVarBuild = com.google.ads.interactivemedia.v3.impl.data.bh.builder().friendlyObstructions(list).build();
        }
        this.f21729a.o(new dw(du.omid, dv.registerFriendlyObstructions, this.f21733e, bhVarBuild));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ec
    public final void a() {
        this.f21735g = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ec
    public final void b() {
        aj.b(this.f21731c);
        this.f21735g = true;
    }

    public final void c(FriendlyObstruction friendlyObstruction) {
        if (this.f21734f.contains(friendlyObstruction)) {
            return;
        }
        this.f21734f.add(friendlyObstruction);
        al alVar = this.f21738j;
        if (alVar == null) {
            return;
        }
        alVar.b(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
        j(Arrays.asList(friendlyObstruction));
    }

    public final void d(View view) {
        this.f21732d = view;
    }

    public final void e(String str) {
        this.f21737i = str;
    }

    public final void f(String str) {
        this.f21733e = str;
    }

    public final void g() {
        this.f21734f.clear();
        al alVar = this.f21738j;
        if (alVar == null) {
            return;
        }
        alVar.e();
        j(null);
    }

    public final void h() {
        al alVar;
        if (!this.f21735g || (alVar = this.f21738j) == null) {
            return;
        }
        alVar.c();
        this.f21738j = null;
    }

    public final void i() {
        this.f21736h = true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        al alVar;
        if (!this.f21735g || (alVar = this.f21738j) == null) {
            return;
        }
        alVar.c();
        this.f21738j = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public final void onAdEvent(AdEvent adEvent) {
        if (this.f21735g) {
            AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
            int iOrdinal = adEvent.getType().ordinal();
            if (iOrdinal == 3 || iOrdinal == 14) {
                h();
                return;
            }
            if (iOrdinal == 15 && this.f21735g && this.f21738j == null && this.f21732d != null) {
                aq aqVar = aq.DEFINED_BY_JAVASCRIPT;
                as asVar = as.DEFINED_BY_JAVASCRIPT;
                at atVar = at.JAVASCRIPT;
                am amVarB = am.b(aqVar, asVar, atVar, atVar);
                au auVarC = au.c();
                WebView webViewA = this.f21729a.a();
                String str = this.f21737i;
                String str2 = true != this.f21736h ? "false" : "true";
                StringBuilder sb = new StringBuilder(str2.length() + 7);
                sb.append("{ssai:");
                sb.append(str2);
                sb.append("}");
                al alVarA = al.a(amVarB, an.b(auVarC, webViewA, str, sb.toString()));
                this.f21738j = alVarA;
                alVarA.d(this.f21732d);
                for (FriendlyObstruction friendlyObstruction : this.f21734f) {
                    this.f21738j.b(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
                }
                j(new ArrayList(this.f21734f));
                this.f21738j.f();
            }
        }
    }
}

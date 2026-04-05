package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ed implements eh, ei {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f21696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ej f21698i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final TestingConfiguration f21700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aqy<fo> f21701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final aqy<com.google.ads.interactivemedia.v3.impl.data.ba> f21702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private eq f21703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ec f21704o;
    private long p;
    private boolean q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, dy> f21690a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<String> f21691b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, BaseDisplayContainer> f21692c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, dz> f21693d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, eb> f21694e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, fb> f21695f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Queue<dw> f21699j = new ConcurrentLinkedQueue();

    public ed(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration) {
        aqy<fo> aqyVar = new aqy<>();
        this.f21701l = aqyVar;
        aqy<com.google.ads.interactivemedia.v3.impl.data.ba> aqyVar2 = new aqy<>();
        this.f21702m = aqyVar2;
        this.q = false;
        this.f21696g = context;
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.24.0").appendQueryParameter("hl", imaSdkSettings.getLanguage()).appendQueryParameter("omv", aj.a()).appendQueryParameter("app", context.getApplicationContext().getPackageName());
        if (testingConfiguration != null) {
            bfh bfhVar = new bfh();
            bfhVar.c(new arl());
            bfhVar.d(new auv());
            builderAppendQueryParameter.appendQueryParameter(TestingConfiguration.PARAMETER_KEY, bfhVar.a().f(testingConfiguration));
        }
        this.f21697h = builderAppendQueryParameter.build().toString();
        this.f21698i = new ej(new Handler(Looper.getMainLooper()), new WebView(context), this);
        this.f21700k = testingConfiguration;
        arj.c(Arrays.asList(aqyVar2.a(), aqyVar.a())).h(new dx(this));
    }

    private static String q(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + str2.length());
        sb.append(str);
        sb.append(" Caused by: ");
        sb.append(str2);
        return sb.toString();
    }

    private final void r(du duVar, dv dvVar, String str, com.google.ads.interactivemedia.v3.impl.data.ba baVar) {
        fb fbVar = this.f21695f.get(str);
        if (fbVar != null) {
            fbVar.f(duVar, dvVar, baVar);
            return;
        }
        String strValueOf = String.valueOf(duVar);
        String strValueOf2 = String.valueOf(dvVar);
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 44 + strValueOf2.length() + String.valueOf(str).length());
        sb.append("Received ");
        sb.append(strValueOf);
        sb.append(" message: ");
        sb.append(strValueOf2);
        sb.append(" for invalid session id: ");
        sb.append(str);
        pn.g(sb.toString());
    }

    private static final void s(String str, dv dvVar) {
        String strValueOf = String.valueOf(dvVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 43 + String.valueOf(str).length());
        sb.append("Illegal message type ");
        sb.append(strValueOf);
        sb.append(" received for ");
        sb.append(str);
        sb.append(" channel");
        pn.f(sb.toString());
    }

    public final WebView a() {
        return this.f21698i.a();
    }

    public final TestingConfiguration b() {
        return this.f21700k;
    }

    public final void c(dy dyVar, String str) {
        this.f21690a.put(str, dyVar);
    }

    public final void d(BaseDisplayContainer baseDisplayContainer, String str) {
        this.f21692c.put(str, baseDisplayContainer);
    }

    public final void e(dz dzVar, String str) {
        this.f21693d.put(str, dzVar);
    }

    public final void f(eb ebVar, String str) {
        this.f21694e.put(str, ebVar);
    }

    public final void g(ec ecVar) {
        this.f21704o = ecVar;
    }

    public final void h(fb fbVar, String str) {
        this.f21695f.put(str, fbVar);
    }

    public final void i(fo foVar) {
        this.f21701l.c(foVar);
    }

    public final void j() {
        this.p = SystemClock.elapsedRealtime();
        this.f21698i.e(this.f21697h);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0273  */
    @Override // com.google.ads.interactivemedia.v3.internal.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.ads.interactivemedia.v3.internal.dw r21) {
        /*
            Method dump skipped, instruction units count: 1722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ed.k(com.google.ads.interactivemedia.v3.internal.dw):void");
    }

    public final void l() {
        this.f21698i.b();
    }

    public final void m(String str) {
        this.f21690a.remove(str);
        this.f21691b.add(str);
    }

    public final void n(String str) {
        this.f21693d.remove(str);
        this.f21694e.remove(str);
        this.f21692c.remove(str);
        this.f21695f.remove(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ei
    public final void o(dw dwVar) {
        String strName = dwVar.a().name();
        String strName2 = dwVar.b().name();
        StringBuilder sb = new StringBuilder(String.valueOf(strName).length() + 23 + String.valueOf(strName2).length());
        sb.append("Sending js message: ");
        sb.append(strName);
        sb.append(" [");
        sb.append(strName2);
        sb.append("]");
        pn.f(sb.toString());
        this.f21699j.add(dwVar);
        if (!this.q) {
            return;
        }
        while (true) {
            dw dwVarPoll = this.f21699j.poll();
            if (dwVarPoll == null) {
                return;
            } else {
                this.f21698i.g(dwVarPoll);
            }
        }
    }

    public final /* synthetic */ void p() {
        com.google.ads.interactivemedia.v3.impl.data.ba baVarC = this.f21702m.a().c();
        fo foVarC = this.f21701l.a().c();
        Context context = this.f21696g;
        this.f21703n = new eq(this, Executors.newCachedThreadPool(), baVarC.enableGks ? new ep(context, foVarC) : new en(null));
    }
}

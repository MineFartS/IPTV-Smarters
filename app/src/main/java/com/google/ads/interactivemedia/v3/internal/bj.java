package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cd f21189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21191c;

    public bj() {
        b();
        this.f21189a = new cd((WebView) null);
    }

    public final WebView a() {
        return this.f21189a.get();
    }

    public final void b() {
        this.f21190b = System.nanoTime();
        this.f21191c = 1;
    }

    public void c() {
        this.f21189a.clear();
    }

    public final void d(String str, long j2) {
        if (j2 < this.f21190b || this.f21191c == 3) {
            return;
        }
        this.f21191c = 3;
        bc.a().f(a(), str);
    }

    public final void e(String str, long j2) {
        if (j2 >= this.f21190b) {
            this.f21191c = 2;
            bc.a().f(a(), str);
        }
    }

    public void f(ap apVar, an anVar) {
        g(apVar, anVar, null);
    }

    public final void g(ap apVar, an anVar, JSONObject jSONObject) {
        String strI = apVar.i();
        JSONObject jSONObject2 = new JSONObject();
        bo.h(jSONObject2, "environment", "app");
        bo.h(jSONObject2, "adSessionType", anVar.c());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        bo.h(jSONObject3, "deviceType", sb.toString());
        bo.h(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        bo.h(jSONObject3, "os", "Android");
        bo.h(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        bo.h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        bo.h(jSONObject4, "partnerName", anVar.d().a());
        bo.h(jSONObject4, "partnerVersion", anVar.d().b());
        bo.h(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        bo.h(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        bo.h(jSONObject5, "appId", ba.b().a().getApplicationContext().getPackageName());
        bo.h(jSONObject2, "app", jSONObject5);
        if (anVar.e() != null) {
            bo.h(jSONObject2, "contentUrl", anVar.e());
        }
        if (anVar.f() != null) {
            bo.h(jSONObject2, "customReferenceData", anVar.f());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator<ly> it = anVar.g().iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        bc.a().g(a(), strI, jSONObject2, jSONObject6, jSONObject);
    }

    public final void h(float f2) {
        bc.a().e(a(), f2);
    }

    public final void i(WebView webView) {
        this.f21189a = new cd(webView);
    }

    public void j() {
    }

    public final boolean k() {
        return this.f21189a.get() != null;
    }
}

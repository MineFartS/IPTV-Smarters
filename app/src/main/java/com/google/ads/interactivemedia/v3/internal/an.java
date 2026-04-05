package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final au f20192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f20193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ly> f20194c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, ly> f20195d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f20197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ao f20198g;

    private an(au auVar, WebView webView, String str, String str2, ao aoVar) {
        this.f20192a = auVar;
        this.f20193b = webView;
        this.f20198g = aoVar;
        this.f20197f = str;
        this.f20196e = str2;
    }

    public static an b(au auVar, WebView webView, String str, String str2) {
        if (str2 == null || str2.length() <= 256) {
            return new an(auVar, webView, str, str2, ao.JAVASCRIPT);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public final WebView a() {
        return this.f20193b;
    }

    public final ao c() {
        return this.f20198g;
    }

    public final au d() {
        return this.f20192a;
    }

    public final String e() {
        return this.f20197f;
    }

    public final String f() {
        return this.f20196e;
    }

    public final List<ly> g() {
        return Collections.unmodifiableList(this.f20194c);
    }

    public final Map<String, ly> h() {
        return Collections.unmodifiableMap(this.f20195d);
    }
}

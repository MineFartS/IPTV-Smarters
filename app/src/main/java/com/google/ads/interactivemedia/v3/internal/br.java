package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class br {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bz f21512b;

    public br(bz bzVar) {
        this.f21512b = bzVar;
    }

    public final JSONObject a() {
        return this.f21511a;
    }

    public final void b() {
        this.f21512b.a(new ca(this));
    }

    public final void c(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f21512b.a(new cb(this, hashSet, jSONObject, j2));
    }

    public final void d(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f21512b.a(new cc(this, hashSet, jSONObject, j2));
    }

    public final void e(JSONObject jSONObject) {
        this.f21511a = jSONObject;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bx extends by {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<String> f21526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f21527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21528c;

    public bx(br brVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(brVar);
        this.f21526a = new HashSet<>(hashSet);
        this.f21527b = jSONObject;
        this.f21528c = j2;
    }
}

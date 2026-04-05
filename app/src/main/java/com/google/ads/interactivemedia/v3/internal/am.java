package com.google.ads.interactivemedia.v3.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final at f20096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final at f20097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aq f20098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final as f20099d;

    private am(aq aqVar, as asVar, at atVar, at atVar2) {
        this.f20098c = aqVar;
        this.f20099d = asVar;
        this.f20096a = atVar;
        if (atVar2 == null) {
            this.f20097b = at.NONE;
        } else {
            this.f20097b = atVar2;
        }
    }

    public static am b(aq aqVar, as asVar, at atVar, at atVar2) {
        hd.e(aqVar, "CreativeType is null");
        hd.e(asVar, "ImpressionType is null");
        hd.e(atVar, "Impression owner is null");
        if (atVar == at.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (aqVar == aq.DEFINED_BY_JAVASCRIPT && atVar == at.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (asVar == as.DEFINED_BY_JAVASCRIPT && atVar == at.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new am(aqVar, asVar, atVar, atVar2);
    }

    public final JSONObject a() {
        Object obj;
        String str;
        JSONObject jSONObject = new JSONObject();
        bo.h(jSONObject, "impressionOwner", this.f20096a);
        if (this.f20098c == null || this.f20099d == null) {
            obj = this.f20097b;
            str = "videoEventsOwner";
        } else {
            bo.h(jSONObject, "mediaEventsOwner", this.f20097b);
            bo.h(jSONObject, "creativeType", this.f20098c);
            obj = this.f20099d;
            str = "impressionType";
        }
        bo.h(jSONObject, str, obj);
        bo.h(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}

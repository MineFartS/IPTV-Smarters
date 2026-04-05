package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ajq implements ajg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajg f19938b;

    public ajq(Context context, String str) {
        ajs ajsVar = new ajs();
        ajsVar.c(str);
        this.f19937a = context.getApplicationContext();
        this.f19938b = ajsVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ajp a() {
        return new ajp(this.f19937a, ((ajs) this.f19938b).a());
    }
}

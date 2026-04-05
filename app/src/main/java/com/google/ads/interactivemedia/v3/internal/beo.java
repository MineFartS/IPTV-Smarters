package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class beo extends ThreadLocal<Mac> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bep f21010a;

    public beo(bep bepVar) {
        this.f21010a = bepVar;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac macA = bei.f20996b.a(this.f21010a.f21013c);
            macA.init(this.f21010a.f21014d);
            return macA;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class axk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<axj> f20688a = new CopyOnWriteArrayList<>();

    public static axj a(String str) throws GeneralSecurityException {
        for (axj axjVar : f20688a) {
            if (axjVar.a()) {
                return axjVar;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}

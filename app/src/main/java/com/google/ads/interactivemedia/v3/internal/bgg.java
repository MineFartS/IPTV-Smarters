package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class bgg implements bgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Constructor f21069a;

    public bgg(Constructor constructor) {
        this.f21069a = constructor;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bgw
    public final Object a() {
        try {
            return this.f21069a.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InstantiationException e3) {
            String strValueOf = String.valueOf(this.f21069a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
            sb.append("Failed to invoke ");
            sb.append(strValueOf);
            sb.append(" with no args");
            throw new RuntimeException(sb.toString(), e3);
        } catch (InvocationTargetException e4) {
            String strValueOf2 = String.valueOf(this.f21069a);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 30);
            sb2.append("Failed to invoke ");
            sb2.append(strValueOf2);
            sb2.append(" with no args");
            throw new RuntimeException(sb2.toString(), e4.getTargetException());
        }
    }
}

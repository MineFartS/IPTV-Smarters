package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class afp implements afy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f19509b = {8, 13, 11, 2, 0, 1, 7};

    private static void b(int i2, List<Integer> list) {
        int[] iArr = f19509b;
        int length = iArr.length;
        for (int i3 = 0; i3 < 7; i3++) {
            if (iArr[i3] == i2) {
                Integer numValueOf = Integer.valueOf(i2);
                if (list.contains(numValueOf)) {
                    return;
                }
                list.add(numValueOf);
                return;
            }
        }
    }

    private static boolean c(rj rjVar, rk rkVar) {
        try {
            boolean zF = rjVar.f(rkVar);
            rkVar.i();
            return zF;
        } catch (EOFException unused) {
            rkVar.i();
            return false;
        } catch (Throwable th) {
            rkVar.i();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.afn a(android.net.Uri r18, com.google.ads.interactivemedia.v3.internal.ke r19, java.util.List<com.google.ads.interactivemedia.v3.internal.ke> r20, com.google.ads.interactivemedia.v3.internal.aml r21, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r22, com.google.ads.interactivemedia.v3.internal.rk r23) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.afp.a(android.net.Uri, com.google.ads.interactivemedia.v3.internal.ke, java.util.List, com.google.ads.interactivemedia.v3.internal.aml, java.util.Map, com.google.ads.interactivemedia.v3.internal.rk):com.google.ads.interactivemedia.v3.internal.afn");
    }
}

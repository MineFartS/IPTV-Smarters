package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class axp<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<axo, List<axn<P>>> f20694a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private axn<P> f20695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<P> f20696c;

    private axp(Class<P> cls) {
        this.f20696c = cls;
    }

    public static <P> axp<P> c(Class<P> cls) {
        return new axp<>(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.axn<P> a(P r5, com.google.ads.interactivemedia.v3.internal.bcz r6) throws java.security.GeneralSecurityException {
        /*
            r4 = this;
            com.google.ads.interactivemedia.v3.internal.bcu r0 = r6.d()
            com.google.ads.interactivemedia.v3.internal.bcu r1 = com.google.ads.interactivemedia.v3.internal.bcu.ENABLED
            if (r0 != r1) goto L8d
            com.google.ads.interactivemedia.v3.internal.axn r0 = new com.google.ads.interactivemedia.v3.internal.axn
            com.google.ads.interactivemedia.v3.internal.bdl r1 = com.google.ads.interactivemedia.v3.internal.bdl.UNKNOWN_PREFIX
            com.google.ads.interactivemedia.v3.internal.bdl r1 = r6.f()
            int r1 = r1.ordinal()
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L37
            r3 = 2
            if (r1 == r3) goto L2d
            r3 = 3
            if (r1 == r3) goto L2a
            r3 = 4
            if (r1 != r3) goto L22
            goto L2d
        L22:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "unknown output prefix type"
            r5.<init>(r6)
            throw r5
        L2a:
            byte[] r1 = com.google.ads.interactivemedia.v3.internal.aww.f20674a
            goto L4b
        L2d:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r2 = 0
            java.nio.ByteBuffer r1 = r1.put(r2)
            goto L3f
        L37:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteBuffer r1 = r1.put(r3)
        L3f:
            int r2 = r6.a()
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
        L4b:
            com.google.ads.interactivemedia.v3.internal.bcu r2 = r6.d()
            com.google.ads.interactivemedia.v3.internal.bdl r3 = r6.f()
            r6.a()
            r0.<init>(r5, r1, r2, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r0)
            com.google.ads.interactivemedia.v3.internal.axo r6 = new com.google.ads.interactivemedia.v3.internal.axo
            byte[] r1 = r0.d()
            r6.<init>(r1)
            java.util.concurrent.ConcurrentMap<com.google.ads.interactivemedia.v3.internal.axo, java.util.List<com.google.ads.interactivemedia.v3.internal.axn<P>>> r1 = r4.f20694a
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            java.lang.Object r5 = r1.put(r6, r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L8c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r5)
            r1.add(r0)
            java.util.concurrent.ConcurrentMap<com.google.ads.interactivemedia.v3.internal.axo, java.util.List<com.google.ads.interactivemedia.v3.internal.axn<P>>> r5 = r4.f20694a
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r5.put(r6, r1)
        L8c:
            return r0
        L8d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "only ENABLED key is allowed"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.axp.a(java.lang.Object, com.google.ads.interactivemedia.v3.internal.bcz):com.google.ads.interactivemedia.v3.internal.axn");
    }

    public final axn<P> b() {
        return this.f20695b;
    }

    public final Class<P> d() {
        return this.f20696c;
    }

    public final void e(axn<P> axnVar) {
        if (axnVar.a() != bcu.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<axn<P>> listEmptyList = this.f20694a.get(new axo(axnVar.d()));
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.f20695b = axnVar;
    }
}

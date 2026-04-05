package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class blm extends bln {
    private blm() {
    }

    public /* synthetic */ blm(byte[] bArr) {
    }

    public static <E> blc<E> a(Object obj, long j2) {
        return (blc) bnh.f(obj, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bln
    public final <L> List<L> b(Object obj, long j2) {
        blc blcVarA = a(obj, j2);
        if (blcVarA.c()) {
            return blcVarA;
        }
        int size = blcVarA.size();
        blc blcVarD = blcVarA.d(size == 0 ? 10 : size + size);
        bnh.t(obj, j2, blcVarD);
        return blcVarD;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bln
    public final void c(Object obj, long j2) {
        a(obj, j2).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.ads.interactivemedia.v3.internal.blc, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.ads.interactivemedia.v3.internal.bln
    public final <E> void d(Object obj, Object obj2, long j2) {
        blc blcVarA = a(obj, j2);
        ?? A = a(obj2, j2);
        int size = blcVarA.size();
        int size2 = A.size();
        ?? r0 = blcVarA;
        r0 = blcVarA;
        if (size > 0 && size2 > 0) {
            boolean zC = blcVarA.c();
            ?? D = blcVarA;
            if (!zC) {
                D = blcVarA.d(size2 + size);
            }
            D.addAll(A);
            r0 = D;
        }
        if (size > 0) {
            A = r0;
        }
        bnh.t(obj, j2, A);
    }
}

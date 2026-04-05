package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class bip extends bfv<BitSet> {
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.util.BitSet read(com.google.ads.interactivemedia.v3.internal.bjj r8) throws java.io.IOException {
        /*
            r7 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r8.g()
            int r1 = r8.p()
            r2 = 0
            r3 = 0
        Le:
            r4 = 2
            if (r1 == r4) goto L82
            int r4 = r1 + (-1)
            r5 = 5
            r6 = 1
            if (r4 == r5) goto L50
            r5 = 6
            if (r4 == r5) goto L47
            r5 = 7
            if (r4 != r5) goto L22
            boolean r6 = r8.o()
            goto L5a
        L22:
            java.lang.String r8 = com.google.ads.interactivemedia.v3.internal.bjk.a(r1)
            com.google.ads.interactivemedia.v3.internal.bfs r0 = new com.google.ads.interactivemedia.v3.internal.bfs
            java.lang.String r1 = java.lang.String.valueOf(r8)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r2.<init>(r1)
            java.lang.String r1 = "Invalid bitset value type: "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        L47:
            int r1 = r8.b()
            if (r1 == 0) goto L4e
            goto L5a
        L4e:
            r6 = 0
            goto L5a
        L50:
            java.lang.String r1 = r8.f()
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L66
            if (r1 == 0) goto L4e
        L5a:
            if (r6 == 0) goto L5f
            r0.set(r3)
        L5f:
            int r3 = r3 + 1
            int r1 = r8.p()
            goto Le
        L66:
            com.google.ads.interactivemedia.v3.internal.bfs r8 = new com.google.ads.interactivemedia.v3.internal.bfs
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
            int r2 = r0.length()
            if (r2 == 0) goto L79
            java.lang.String r0 = r1.concat(r0)
            goto L7e
        L79:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L7e:
            r8.<init>(r0)
            throw r8
        L82:
            r8.i()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bip.read(com.google.ads.interactivemedia.v3.internal.bjj):java.lang.Object");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, BitSet bitSet) throws IOException {
        BitSet bitSet2 = bitSet;
        bjlVar.b();
        int length = bitSet2.length();
        for (int i2 = 0; i2 < length; i2++) {
            bjlVar.h(bitSet2.get(i2) ? 1L : 0L);
        }
        bjlVar.d();
    }
}

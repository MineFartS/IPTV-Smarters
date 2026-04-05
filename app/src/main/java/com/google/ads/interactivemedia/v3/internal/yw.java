package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yw extends yt {
    public static final yv c(alx alxVar) {
        String strW = alxVar.w();
        ajr.b(strW);
        String strW2 = alxVar.w();
        ajr.b(strW2);
        return new yv(strW, strW2, alxVar.s(), alxVar.s(), Arrays.copyOfRange(alxVar.K(), alxVar.c(), alxVar.d()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yt
    public final ys b(ByteBuffer byteBuffer) {
        return new ys(c(new alx(byteBuffer.array(), byteBuffer.limit())));
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class yt {
    public final ys a(pz pzVar) {
        ByteBuffer byteBuffer = pzVar.f22801b;
        ajr.b(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        ajr.d(z);
        if (pzVar.f()) {
            return null;
        }
        return b(byteBuffer);
    }

    public abstract ys b(ByteBuffer byteBuffer);
}

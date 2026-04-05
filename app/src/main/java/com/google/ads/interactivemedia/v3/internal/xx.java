package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class xx extends px {
    /* JADX WARN: Illegal instructions before constructor call */
    public xx(Throwable th, xy xyVar) {
        String strValueOf = String.valueOf(xyVar == null ? null : xyVar.f23759a);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), th);
        if (amn.f20135a < 21 || !(th instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) th).getDiagnosticInfo();
    }
}

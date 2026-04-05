package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class xz extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xy f23768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23769d;

    public xz(ke keVar, Throwable th, boolean z, int i2) {
        String strValueOf = String.valueOf(keVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i2);
        sb.append("], ");
        sb.append(strValueOf);
        String string = sb.toString();
        String str = keVar.f22156l;
        int iAbs = Math.abs(i2);
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
        sb2.append("neg_");
        sb2.append(iAbs);
        this(string, th, str, z, null, sb2.toString());
    }

    public xz(ke keVar, Throwable th, boolean z, xy xyVar) {
        String str = xyVar.f23759a;
        String strValueOf = String.valueOf(keVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        this(sb.toString(), th, keVar.f22156l, z, xyVar, (amn.f20135a < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo());
    }

    private xz(String str, Throwable th, String str2, boolean z, xy xyVar, String str3) {
        super(str, th);
        this.f23766a = str2;
        this.f23767b = z;
        this.f23768c = xyVar;
        this.f23769d = str3;
    }

    public static /* synthetic */ xz a(xz xzVar, xz xzVar2) {
        return new xz(xzVar.getMessage(), xzVar.getCause(), xzVar.f23766a, xzVar.f23767b, xzVar.f23768c, xzVar.f23769d);
    }
}

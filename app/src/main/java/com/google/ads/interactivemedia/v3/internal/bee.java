package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes.dex */
public final class bee implements awz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20984a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final beg f20985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f20987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bec f20988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20989f;

    public bee(ECPublicKey eCPublicKey, byte[] bArr, String str, int i2, bec becVar) throws GeneralSecurityException {
        bet.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f20985b = new beg(eCPublicKey);
        this.f20987d = bArr;
        this.f20986c = str;
        this.f20989f = i2;
        this.f20988e = becVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        bef befVarA = this.f20985b.a(this.f20986c, this.f20987d, bArr2, this.f20988e.a(), this.f20989f);
        byte[] bArrA = this.f20988e.b(befVarA.b()).a(bArr, f20984a);
        byte[] bArrA2 = befVarA.a();
        return ByteBuffer.allocate(bArrA2.length + bArrA.length).put(bArrA2).put(bArrA).array();
    }
}

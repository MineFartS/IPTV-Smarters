package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class afm implements ajh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajh f19500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f19502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f19503d;

    public afm(ajh ajhVar, byte[] bArr, byte[] bArr2) {
        this.f19500a = ajhVar;
        this.f19501b = bArr;
        this.f19502c = bArr2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f19501b, "AES"), new IvParameterSpec(this.f19502c));
                ajj ajjVar = new ajj(this.f19500a, ajlVar);
                this.f19503d = new CipherInputStream(ajjVar, cipher);
                ajjVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws IOException {
        ajr.b(this.f19503d);
        int i4 = this.f19503d.read(bArr, i2, i3);
        if (i4 < 0) {
            return -1;
        }
        return i4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f19500a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Map<String, List<String>> d() {
        return this.f19500a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void e(akq akqVar) {
        ajr.b(akqVar);
        this.f19500a.e(akqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        if (this.f19503d != null) {
            this.f19503d = null;
            this.f19500a.f();
        }
    }
}

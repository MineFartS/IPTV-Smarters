package com.google.ads.interactivemedia.v3.internal;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class bej implements bek<KeyAgreement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21004a;

    public bej() {
    }

    public bej(int i2) {
        this.f21004a = i2;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [javax.crypto.KeyAgreement, javax.crypto.Mac] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.security.MessageDigest, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.security.MessageDigest, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.security.Signature, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.security.Signature, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v3, types: [javax.crypto.Cipher, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v4, types: [javax.crypto.Cipher, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.security.KeyFactory, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.security.KeyFactory, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.security.KeyPairGenerator, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.security.KeyPairGenerator, javax.crypto.KeyAgreement] */
    /* JADX WARN: Type inference failed for: r3v9, types: [javax.crypto.KeyAgreement, javax.crypto.Mac] */
    @Override // com.google.ads.interactivemedia.v3.internal.bek
    public final /* bridge */ /* synthetic */ KeyAgreement a(String str, Provider provider) {
        int i2 = this.f21004a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider) : provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider) : provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider) : provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider) : provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider) : provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider) : provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}

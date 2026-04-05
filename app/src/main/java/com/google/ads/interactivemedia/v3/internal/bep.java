package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class bep implements bak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21011a = azg.f20737b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadLocal<Mac> f21012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Key f21014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21015e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bep(java.lang.String r6, java.security.Key r7) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        /*
            r5 = this;
            r5.<init>()
            com.google.ads.interactivemedia.v3.internal.beo r0 = new com.google.ads.interactivemedia.v3.internal.beo
            r0.<init>(r5)
            r5.f21012b = r0
            int r1 = com.google.ads.interactivemedia.v3.internal.bep.f21011a
            com.google.ads.interactivemedia.v3.internal.azg.a(r1)
            r5.f21013c = r6
            r5.f21014d = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r1 = 16
            if (r7 < r1) goto L91
            int r7 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r7) {
                case -1823053428: goto L50;
                case 392315023: goto L46;
                case 392315118: goto L3c;
                case 392316170: goto L32;
                case 392317873: goto L28;
                default: goto L27;
            }
        L27:
            goto L5a
        L28:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5a
            r7 = 4
            goto L5b
        L32:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5a
            r7 = 3
            goto L5b
        L3c:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5a
            r7 = 2
            goto L5b
        L46:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5a
            r7 = 1
            goto L5b
        L50:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5a
            r7 = 0
            goto L5b
        L5a:
            r7 = -1
        L5b:
            if (r7 == 0) goto L89
            if (r7 == r4) goto L86
            if (r7 == r3) goto L83
            if (r7 == r2) goto L80
            if (r7 == r1) goto L7d
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r6.length()
            if (r1 == 0) goto L74
            java.lang.String r6 = r0.concat(r6)
            goto L79
        L74:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L79:
            r7.<init>(r6)
            throw r7
        L7d:
            r6 = 64
            goto L8b
        L80:
            r6 = 48
            goto L8b
        L83:
            r6 = 32
            goto L8b
        L86:
            r6 = 28
            goto L8b
        L89:
            r6 = 20
        L8b:
            r5.f21015e = r6
            r0.get()
            return
        L91:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bep.<init>(java.lang.String, java.security.Key):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bak
    public final byte[] a(byte[] bArr, int i2) throws InvalidAlgorithmParameterException {
        if (i2 > this.f21015e) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f21012b.get().update(bArr);
        return Arrays.copyOf(this.f21012b.get().doFinal(), i2);
    }
}

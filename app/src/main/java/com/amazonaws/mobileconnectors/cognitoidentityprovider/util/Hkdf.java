package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;

import com.amazonaws.util.StringUtils;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class Hkdf {
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private static final int MAX_KEY_SIZE = 255;
    private final String algorithm;
    private SecretKey prk = null;

    private Hkdf(String str) {
        if (str.startsWith("Hmac")) {
            this.algorithm = str;
            return;
        }
        throw new IllegalArgumentException("Invalid algorithm " + str + ". Hkdf may only be used with Hmac algorithms.");
    }

    private void assertInitialized() {
        if (this.prk == null) {
            throw new IllegalStateException("Hkdf has not been initialized");
        }
    }

    private Mac createMac() {
        try {
            Mac mac = Mac.getInstance(this.algorithm);
            mac.init(this.prk);
            return mac;
        } catch (InvalidKeyException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static Hkdf getInstance(String str) throws NoSuchAlgorithmException {
        Mac.getInstance(str);
        return new Hkdf(str);
    }

    public void deriveKey(byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        assertInitialized();
        if (i2 < 0) {
            throw new IllegalArgumentException("Length must be a non-negative value.");
        }
        if (bArr2.length < i3 + i2) {
            throw new ShortBufferException();
        }
        Mac macCreateMac = createMac();
        if (i2 > macCreateMac.getMacLength() * MAX_KEY_SIZE) {
            throw new IllegalArgumentException("Requested keys may not be longer than 255 times the underlying HMAC length.");
        }
        byte[] bArrDoFinal = EMPTY_ARRAY;
        byte b2 = 1;
        int i4 = 0;
        while (i4 < i2) {
            try {
                macCreateMac.update(bArrDoFinal);
                macCreateMac.update(bArr);
                macCreateMac.update(b2);
                bArrDoFinal = macCreateMac.doFinal();
                int i5 = 0;
                while (i5 < bArrDoFinal.length && i4 < i2) {
                    bArr2[i4] = bArrDoFinal[i5];
                    i5++;
                    i4++;
                }
                b2 = (byte) (b2 + 1);
            } finally {
                Arrays.fill(bArrDoFinal, (byte) 0);
            }
        }
    }

    public byte[] deriveKey(String str, int i2) {
        return deriveKey(str != null ? str.getBytes(StringUtils.UTF8) : null, i2);
    }

    public byte[] deriveKey(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        try {
            deriveKey(bArr, i2, bArr2, 0);
            return bArr2;
        } catch (ShortBufferException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void init(byte[] bArr) {
        init(bArr, null);
    }

    public void init(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2 == null ? EMPTY_ARRAY : (byte[]) bArr2.clone();
        byte[] bArrDoFinal = EMPTY_ARRAY;
        try {
            try {
                Mac mac = Mac.getInstance(this.algorithm);
                if (bArr3.length == 0) {
                    bArr3 = new byte[mac.getMacLength()];
                    Arrays.fill(bArr3, (byte) 0);
                }
                mac.init(new SecretKeySpec(bArr3, this.algorithm));
                bArrDoFinal = mac.doFinal(bArr);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, this.algorithm);
                Arrays.fill(bArrDoFinal, (byte) 0);
                unsafeInitWithoutKeyExtraction(secretKeySpec);
            } catch (GeneralSecurityException e2) {
                throw new RuntimeException("Unexpected exception", e2);
            }
        } finally {
            Arrays.fill(bArrDoFinal, (byte) 0);
        }
    }

    public void unsafeInitWithoutKeyExtraction(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey.getAlgorithm().equals(this.algorithm)) {
            this.prk = secretKey;
            return;
        }
        throw new InvalidKeyException("Algorithm for the provided key must match the algorithm for this Hkdf. Expected " + this.algorithm + " but found " + secretKey.getAlgorithm());
    }
}

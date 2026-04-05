package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Cipher f21872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f21873b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f21874c = new Object();

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f21874c) {
            if (f21872a == null) {
                f21872a = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            }
            cipher = f21872a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws gs {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f21873b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return hd.b(bArr3, false);
        } catch (InvalidKeyException e2) {
            throw new gs(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new gs(e3);
        } catch (BadPaddingException e4) {
            throw new gs(e4);
        } catch (IllegalBlockSizeException e5) {
            throw new gs(e5);
        } catch (NoSuchPaddingException e6) {
            throw new gs(e6);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws gs {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrC = hd.c(str, false);
            int length2 = bArrC.length;
            if (length2 <= 16) {
                throw new gs();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrC);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f21873b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e2) {
            throw new gs(e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new gs(e3);
        } catch (InvalidKeyException e4) {
            throw new gs(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new gs(e5);
        } catch (BadPaddingException e6) {
            throw new gs(e6);
        } catch (IllegalBlockSizeException e7) {
            throw new gs(e7);
        } catch (NoSuchPaddingException e8) {
            throw new gs(e8);
        }
    }
}

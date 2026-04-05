package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class Md5Utils {
    private static final int FOURTEEN = 14;
    private static final int SIXTEEN_K = 16384;

    public static byte[] computeMD5Hash(File file) {
        return computeMD5Hash(new FileInputStream(file));
    }

    public static byte[] computeMD5Hash(InputStream inputStream) {
        MessageDigest messageDigest;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                bArr = new byte[SIXTEEN_K];
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (Exception e2) {
                    LogFactory.getLog((Class<?>) Md5Utils.class).debug("Unable to close input stream of hash candidate: " + e2);
                }
            }
            while (true) {
                int i2 = bufferedInputStream.read(bArr, 0, SIXTEEN_K);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
                bufferedInputStream.close();
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static byte[] computeMD5Hash(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static String md5AsBase64(File file) {
        return Base64.encodeAsString(computeMD5Hash(file));
    }

    public static String md5AsBase64(InputStream inputStream) {
        return Base64.encodeAsString(computeMD5Hash(inputStream));
    }

    public static String md5AsBase64(byte[] bArr) {
        return Base64.encodeAsString(computeMD5Hash(bArr));
    }
}

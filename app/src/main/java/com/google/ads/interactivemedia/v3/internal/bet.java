package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bet {
    public static int a() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        long jK = k(bArr, 0, 0);
        long jK2 = k(bArr, 3, 2) & 67108611;
        long jK3 = k(bArr, 6, 4) & 67092735;
        long jK4 = k(bArr, 9, 6) & 66076671;
        long jK5 = k(bArr, 12, 8) & 1048575;
        long j2 = jK2 * 5;
        long j3 = jK3 * 5;
        long j4 = jK4 * 5;
        long j5 = jK5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j11 = j6 + (j7 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j8 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j10 + ((j15 >> 26) * 5);
                long j18 = j17 & 67108863;
                long j19 = (j7 & 67108863) + (j17 >> 26);
                long j20 = j18 + 5;
                long j21 = (j20 >> 26) + j19;
                long j22 = j12 + (j21 >> 26);
                long j23 = j14 + (j22 >> 26);
                long j24 = (j16 + (j23 >> 26)) - 67108864;
                long j25 = j24 >> 63;
                long j26 = j25 ^ (-1);
                long j27 = (j19 & j25) | (j21 & 67108863 & j26);
                long j28 = (j12 & j25) | (j22 & 67108863 & j26);
                long j29 = (j14 & j25) | (j23 & 67108863 & j26);
                long jL = (((j18 & j25) | (j20 & 67108863 & j26) | (j27 << 26)) & 4294967295L) + l(bArr, 16);
                long jL2 = (((j27 >> 6) | (j28 << 20)) & 4294967295L) + l(bArr, 20) + (jL >> 32);
                long jL3 = (((j28 >> 12) | (j29 << 14)) & 4294967295L) + l(bArr, 24) + (jL2 >> 32);
                long jL4 = l(bArr, 28);
                byte[] bArr4 = new byte[16];
                m(bArr4, jL & 4294967295L, 0);
                m(bArr4, jL2 & 4294967295L, 4);
                m(bArr4, jL3 & 4294967295L, 8);
                m(bArr4, ((((j29 >> 18) | (((j16 & j25) | (j24 & j26)) << 8)) & 4294967295L) + jL4 + (jL3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i2, (byte) 0);
            }
            long jK6 = j10 + k(bArr3, 0, 0);
            long jK7 = j7 + k(bArr3, 3, 2);
            long jK8 = j6 + k(bArr3, 6, 4);
            long jK9 = j8 + k(bArr3, 9, 6);
            long jK10 = j9 + (k(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j30 = (jK6 * jK) + (jK7 * j5) + (jK8 * j4) + (jK9 * j3) + (jK10 * j2);
            long j31 = (jK6 * jK2) + (jK7 * jK) + (jK8 * j5) + (jK9 * j4) + (jK10 * j3) + (j30 >> 26);
            long j32 = (jK6 * jK3) + (jK7 * jK2) + (jK8 * jK) + (jK9 * j5) + (jK10 * j4) + (j31 >> 26);
            long j33 = (jK6 * jK4) + (jK7 * jK3) + (jK8 * jK2) + (jK9 * jK) + (jK10 * j5) + (j32 >> 26);
            long j34 = (jK6 * jK5) + (jK7 * jK4) + (jK8 * jK3) + (jK9 * jK2) + (jK10 * jK) + (j33 >> 26);
            j9 = j34 & 67108863;
            long j35 = (j30 & 67108863) + ((j34 >> 26) * 5);
            j10 = j35 & 67108863;
            j7 = (j31 & 67108863) + (j35 >> 26);
            i3 += 16;
            j8 = j33 & 67108863;
            j6 = j32 & 67108863;
            i2 = 17;
        }
    }

    public static BigInteger d(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static KeyPair e(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = bei.f20998d.a("EC");
        keyPairGeneratorA.initialize(eCParameterSpec);
        return keyPairGeneratorA.generateKeyPair();
    }

    public static void f(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerD = d(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerD).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerD))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static ECPublicKey g(int i2, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecH = h(i2);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        f(eCPoint, eCParameterSpecH.getCurve());
        return (ECPublicKey) bei.f20999e.a("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecH));
    }

    public static ECParameterSpec h(int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3 = i2 - 1;
        if (i3 == 0) {
            str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
            str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
        } else if (i3 != 1) {
            str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
            str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
        } else {
            str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
            str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
        }
        return n(str, str2, str3, str4, str5);
    }

    public static byte[] i(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[length] = -128;
        return bArrCopyOf;
    }

    public static byte[] j(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            byte b3 = (byte) ((b2 + b2) & 254);
            bArr2[i2] = b3;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((bArr[i2 + 1] >> 7) & 1) | b3);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    private static long k(byte[] bArr, int i2, int i3) {
        return (l(bArr, i2) >> i3) & 67108863;
    }

    private static long l(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void m(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }

    private static ECParameterSpec n(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}

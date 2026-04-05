package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class beg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECPublicKey f20992a;

    public beg(ECPublicKey eCPublicKey) {
        this.f20992a = eCPublicKey;
    }

    public final bef a(String str, byte[] bArr, byte[] bArr2, int i2, int i3) throws GeneralSecurityException {
        char c2;
        int i4;
        byte[] bArr3;
        int i5;
        byte[] bArr4;
        KeyPair keyPairE = bet.e(this.f20992a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairE.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairE.getPrivate();
        ECPublicKey eCPublicKey2 = this.f20992a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey2.getW();
            bet.f(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = bei.f20999e.a("EC").generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreementA = bei.f20997c.a("ECDH");
            keyAgreementA.init(eCPrivateKey);
            int i6 = 1;
            try {
                keyAgreementA.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreementA.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(bet.d(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger bigIntegerD = bet.d(curve);
                BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(bigIntegerD);
                if (bigIntegerD.signum() != 1) {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
                BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerD);
                BigInteger bigIntegerAdd = BigInteger.ZERO;
                if (!bigIntegerMod2.equals(bigIntegerAdd)) {
                    if (bigIntegerD.testBit(0) && bigIntegerD.testBit(1)) {
                        bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerD.add(BigInteger.ONE).shiftRight(2), bigIntegerD);
                    } else if (bigIntegerD.testBit(0) && !bigIntegerD.testBit(1)) {
                        bigIntegerAdd = BigInteger.ONE;
                        BigInteger bigIntegerShiftRight = bigIntegerD.subtract(bigIntegerAdd).shiftRight(1);
                        int i7 = 0;
                        while (true) {
                            BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerD);
                            if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerD);
                            BigInteger bigIntegerMod4 = BigInteger.ONE;
                            if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerD)) {
                                BigInteger bigIntegerShiftRight2 = bigIntegerD.add(bigIntegerMod4).shiftRight(i6);
                                BigInteger bigInteger2 = bigIntegerAdd;
                                for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                    BigInteger bigIntegerMultiply = bigInteger2.multiply(bigIntegerMod4);
                                    BigInteger bigIntegerMod5 = bigInteger2.multiply(bigInteger2).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerD).multiply(bigIntegerMod3)).mod(bigIntegerD);
                                    BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerD);
                                    if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                        BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerD);
                                        bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerD);
                                        bigInteger2 = bigIntegerMod7;
                                    } else {
                                        bigInteger2 = bigIntegerMod5;
                                        bigIntegerMod4 = bigIntegerMod6;
                                    }
                                }
                                bigIntegerAdd = bigInteger2;
                            } else {
                                if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                                bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                                i7++;
                                if (i7 == 128 && !bigIntegerD.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                                i6 = 1;
                            }
                        }
                    } else {
                        bigIntegerAdd = null;
                    }
                    if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerD).compareTo(bigIntegerMod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigIntegerAdd.testBit(0)) {
                    bigIntegerD.subtract(bigIntegerAdd).mod(bigIntegerD);
                }
                EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                ECPoint w2 = eCPublicKey.getW();
                bet.f(w2, curve2);
                int iBitLength2 = (bet.d(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i8 = i3 - 1;
                if (i8 != 0) {
                    if (i8 != 2) {
                        int i9 = iBitLength2 + 1;
                        bArr4 = new byte[i9];
                        byte[] byteArray = w2.getAffineX().toByteArray();
                        int length = byteArray.length;
                        c2 = 0;
                        System.arraycopy(byteArray, 0, bArr4, i9 - length, length);
                        bArr4[0] = true != w2.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                    } else {
                        int i10 = iBitLength2 + iBitLength2;
                        bArr4 = new byte[i10];
                        byte[] byteArray2 = w2.getAffineX().toByteArray();
                        int length2 = byteArray2.length;
                        if (length2 > iBitLength2) {
                            byteArray2 = Arrays.copyOfRange(byteArray2, length2 - iBitLength2, length2);
                        }
                        byte[] byteArray3 = w2.getAffineY().toByteArray();
                        int length3 = byteArray3.length;
                        if (length3 > iBitLength2) {
                            byteArray3 = Arrays.copyOfRange(byteArray3, length3 - iBitLength2, length3);
                        }
                        int length4 = byteArray3.length;
                        c2 = 0;
                        System.arraycopy(byteArray3, 0, bArr4, i10 - length4, length4);
                        int length5 = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr4, iBitLength2 - length5, length5);
                    }
                    bArr3 = bArr4;
                    i5 = 2;
                    i4 = 1;
                } else {
                    c2 = 0;
                    i4 = 1;
                    int i11 = iBitLength2 + iBitLength2 + 1;
                    bArr3 = new byte[i11];
                    byte[] byteArray4 = w2.getAffineX().toByteArray();
                    byte[] byteArray5 = w2.getAffineY().toByteArray();
                    int length6 = byteArray5.length;
                    System.arraycopy(byteArray5, 0, bArr3, i11 - length6, length6);
                    int length7 = byteArray4.length;
                    System.arraycopy(byteArray4, 0, bArr3, (iBitLength2 + 1) - length7, length7);
                    bArr3[0] = 4;
                    i5 = 2;
                }
                byte[][] bArr5 = new byte[i5][];
                bArr5[c2] = bArr3;
                bArr5[i4] = bArrGenerateSecret;
                byte[] bArrC = awp.c(bArr5);
                Mac macA = bei.f20996b.a(str);
                if (i2 > macA.getMacLength() * 255) {
                    throw new GeneralSecurityException("size too large");
                }
                if (bArr == null || bArr.length == 0) {
                    macA.init(new SecretKeySpec(new byte[macA.getMacLength()], str));
                } else {
                    macA.init(new SecretKeySpec(bArr, str));
                }
                byte[] bArrDoFinal = macA.doFinal(bArrC);
                byte[] bArr6 = new byte[i2];
                macA.init(new SecretKeySpec(bArrDoFinal, str));
                byte[] bArr7 = new byte[0];
                int i12 = 0;
                while (true) {
                    macA.update(bArr7);
                    macA.update(bArr2);
                    macA.update((byte) i4);
                    byte[] bArrDoFinal2 = macA.doFinal();
                    int length8 = bArrDoFinal2.length;
                    int i13 = i12 + length8;
                    if (i13 >= i2) {
                        System.arraycopy(bArrDoFinal2, 0, bArr6, i12, i2 - i12);
                        return new bef(bArr3, bArr6);
                    }
                    System.arraycopy(bArrDoFinal2, 0, bArr6, i12, length8);
                    i4++;
                    bArr7 = bArrDoFinal2;
                    i12 = i13;
                }
            } catch (IllegalStateException e2) {
                throw new GeneralSecurityException(e2.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e3) {
            throw new GeneralSecurityException(e3.toString());
        }
    }
}

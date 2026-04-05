package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public class Base32Codec extends AbstractBase32Codec {
    private static final int OFFSET = 26;
    private static final int OFFSET_OF_2 = 24;

    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i2 = 0; i2 <= 122; i2++) {
                if (i2 >= 65 && i2 <= 90) {
                    bArr[i2] = (byte) (i2 - 65);
                } else if (i2 >= 50 && i2 <= 55) {
                    bArr[i2] = (byte) (i2 - 24);
                } else if (i2 < 97 || i2 > 122) {
                    bArr[i2] = -1;
                } else {
                    bArr[i2] = (byte) (i2 - 97);
                }
            }
            return bArr;
        }
    }

    public Base32Codec() {
        super(alphabets());
    }

    private static byte[] alphabets() {
        return CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
    }

    @Override // com.amazonaws.util.AbstractBase32Codec
    public int pos(byte b2) {
        byte b3 = LazyHolder.DECODED[b2];
        if (b3 > -1) {
            return b3;
        }
        throw new IllegalArgumentException("Invalid base 32 character: '" + ((char) b2) + "'");
    }
}

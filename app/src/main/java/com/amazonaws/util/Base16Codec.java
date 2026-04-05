package com.amazonaws.util;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public class Base16Codec implements Codec {
    private static final int BITS_4 = 4;
    private static final int MASK_4BITS = 15;
    private static final int OFFSET_OF_A = 55;
    private static final int OFFSET_OF_a = 87;
    private static final int OFFSET_VALUE = 10;
    private final byte[] alpahbets = CodecUtils.toBytesDirect("0123456789ABCDEF");

    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[103];
            for (int i2 = 0; i2 <= 102; i2++) {
                if (i2 >= 48 && i2 <= 57) {
                    bArr[i2] = (byte) (i2 - 48);
                } else if (i2 >= 65 && i2 <= 70) {
                    bArr[i2] = (byte) (i2 - 55);
                } else if (i2 < 97 || i2 > 102) {
                    bArr[i2] = -1;
                } else {
                    bArr[i2] = (byte) (i2 - 87);
                }
            }
            return bArr;
        }
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i2) {
        if (i2 % 2 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 2 bytes but found: " + i2);
        }
        int i3 = i2 / 2;
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i5 + 1;
            bArr2[i4] = (byte) ((pos(bArr[i5]) << 4) | pos(bArr[i6]));
            i4++;
            i5 = i6 + 1;
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            byte[] bArr3 = this.alpahbets;
            bArr2[i2] = bArr3[(b2 >>> 4) & 15];
            i2 = i3 + 1;
            bArr2[i3] = bArr3[b2 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY];
        }
        return bArr2;
    }

    public int pos(byte b2) {
        byte b3 = LazyHolder.DECODED[b2];
        if (b3 > -1) {
            return b3;
        }
        throw new IllegalArgumentException("Invalid base 16 character: '" + ((char) b2) + "'");
    }
}

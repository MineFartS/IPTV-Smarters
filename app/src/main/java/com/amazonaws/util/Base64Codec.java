package com.amazonaws.util;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public class Base64Codec implements Codec {
    private static final int BITS_3 = 3;
    private static final int BITS_4 = 4;
    private static final int BITS_6 = 6;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private static final int OFFSET_0_VALUE = 52;
    private static final int OFFSET_OF_0 = -4;
    private static final int OFFSET_OF_PLUS = -19;
    private static final int OFFSET_OF_SLASH = -16;
    private static final int OFFSET_OF_a = 71;
    private static final int OFFSET_PLUS_VALUE = 62;
    private static final int OFFSET_SLASH_VALUE = 63;
    private static final int OFFSET_a_VALUE = 26;
    private static final byte PAD = 61;
    private final byte[] alpahbets;

    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i2 = 0; i2 <= 122; i2++) {
                if (i2 >= 65 && i2 <= 90) {
                    bArr[i2] = (byte) (i2 - 65);
                } else if (i2 >= 48 && i2 <= 57) {
                    bArr[i2] = (byte) (i2 + 4);
                } else if (i2 == 43) {
                    bArr[i2] = (byte) (i2 + 19);
                } else if (i2 == 47) {
                    bArr[i2] = (byte) (i2 + 16);
                } else if (i2 < 97 || i2 > 122) {
                    bArr[i2] = -1;
                } else {
                    bArr[i2] = (byte) (i2 - 71);
                }
            }
            return bArr;
        }
    }

    public Base64Codec() {
        this.alpahbets = CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    }

    public Base64Codec(byte[] bArr) {
        this.alpahbets = bArr;
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i2) {
        int i3;
        if (i2 % 4 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 4 bytes but found: " + i2);
        }
        int i4 = i2 - 1;
        int i5 = 0;
        while (true) {
            i3 = 2;
            if (i5 >= 2 || i4 <= -1 || bArr[i4] != 61) {
                break;
            }
            i4--;
            i5++;
        }
        if (i5 == 0) {
            i3 = 3;
        } else if (i5 != 1) {
            if (i5 != 2) {
                throw new Error("Impossible");
            }
            i3 = 1;
        }
        int i6 = ((i2 / 4) * 3) - (3 - i3);
        byte[] bArr2 = new byte[i6];
        int i7 = 0;
        int i8 = 0;
        while (i8 < i6 - (i3 % 3)) {
            decode4bytes(bArr, i7, bArr2, i8);
            i7 += 4;
            i8 += 3;
        }
        if (i3 < 3) {
            decode1to3bytes(i3, bArr, i7, bArr2, i8);
        }
        return bArr2;
    }

    public void decode1to3bytes(int i2, byte[] bArr, int i3, byte[] bArr2, int i4) {
        int i5 = i4 + 1;
        int i6 = i3 + 1;
        int iPos = pos(bArr[i3]) << 2;
        int i7 = i6 + 1;
        int iPos2 = pos(bArr[i6]);
        bArr2[i4] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        if (i2 == 1) {
            CodecUtils.sanityCheckLastPos(iPos2, 15);
            return;
        }
        int i8 = i5 + 1;
        int i9 = i7 + 1;
        int iPos3 = pos(bArr[i7]);
        bArr2[i5] = (byte) ((15 & (iPos3 >>> 2)) | ((iPos2 & 15) << 4));
        if (i2 == 2) {
            CodecUtils.sanityCheckLastPos(iPos3, 3);
        } else {
            bArr2[i8] = (byte) (((iPos3 & 3) << 6) | pos(bArr[i9]));
        }
    }

    public void decode4bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        int i5 = i2 + 1;
        int iPos = pos(bArr[i2]) << 2;
        int i6 = i5 + 1;
        int iPos2 = pos(bArr[i5]);
        bArr2[i3] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        int i7 = (iPos2 & 15) << 4;
        int i8 = i6 + 1;
        int iPos3 = pos(bArr[i6]);
        bArr2[i4] = (byte) (i7 | ((iPos3 >>> 2) & 15));
        bArr2[i4 + 1] = (byte) (pos(bArr[i8]) | ((iPos3 & 3) << 6));
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i2 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i3 = 0;
            while (i2 < bArr.length) {
                encode3bytes(bArr, i2, bArr2, i3);
                i2 += 3;
                i3 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i4 = 0;
        while (i2 < bArr.length - length2) {
            encode3bytes(bArr, i2, bArr3, i4);
            i2 += 3;
            i4 += 4;
        }
        if (length2 == 1) {
            encode1byte(bArr, i2, bArr3, i4);
        } else if (length2 == 2) {
            encode2bytes(bArr, i2, bArr3, i4);
        }
        return bArr3;
    }

    public void encode1byte(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 2) & 63];
        int i5 = i4 + 1;
        bArr2[i4] = bArr3[(b2 & 3) << 4];
        bArr2[i5] = PAD;
        bArr2[i5 + 1] = PAD;
    }

    public void encode2bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 2) & 63];
        int i6 = i4 + 1;
        byte b3 = bArr[i5];
        bArr2[i4] = bArr3[((b2 & 3) << 4) | ((b3 >>> 4) & 15)];
        bArr2[i6] = bArr3[(b3 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 2];
        bArr2[i6 + 1] = PAD;
    }

    public void encode3bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 2) & 63];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        bArr2[i4] = bArr3[((b2 & 3) << 4) | ((b3 >>> 4) & 15)];
        int i8 = (b3 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 2;
        byte b4 = bArr[i7];
        bArr2[i6] = bArr3[i8 | ((b4 >>> 6) & 3)];
        bArr2[i6 + 1] = bArr3[b4 & 63];
    }

    public int pos(byte b2) {
        byte b3 = LazyHolder.DECODED[b2];
        if (b3 > -1) {
            return b3;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b2) + "'");
    }
}

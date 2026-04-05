package com.amazonaws.util;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBase32Codec implements Codec {
    private static final int BITS_3 = 3;
    private static final int BITS_4 = 4;
    private static final int BITS_5 = 5;
    private static final int BIT_MULTIPLIER = 8;
    private static final int MASK_2BITS = 3;
    private static final int MASK_3BITS = 7;
    private static final int MASK_4BITS = 15;
    private static final int MASK_5BITS = 31;
    private static final byte PAD = 61;
    private final byte[] alpahbets;

    public AbstractBase32Codec(byte[] bArr) {
        this.alpahbets = bArr;
    }

    private final void decode1to4bytes(int i2, byte[] bArr, int i3, byte[] bArr2, int i4) {
        int i5 = i4 + 1;
        int i6 = i3 + 1;
        int iPos = pos(bArr[i3]) << 3;
        int i7 = i6 + 1;
        int iPos2 = pos(bArr[i6]);
        bArr2[i4] = (byte) (iPos | ((iPos2 >>> 2) & 7));
        if (i2 == 1) {
            CodecUtils.sanityCheckLastPos(iPos2, 3);
            return;
        }
        int i8 = i5 + 1;
        int i9 = i7 + 1;
        int iPos3 = ((iPos2 & 3) << 6) | (pos(bArr[i7]) << 1);
        int i10 = i9 + 1;
        int iPos4 = pos(bArr[i9]);
        bArr2[i5] = (byte) (iPos3 | ((iPos4 >>> 4) & 1));
        if (i2 == 2) {
            CodecUtils.sanityCheckLastPos(iPos4, 15);
            return;
        }
        int i11 = i8 + 1;
        int i12 = i10 + 1;
        int iPos5 = pos(bArr[i10]);
        bArr2[i8] = (byte) ((15 & (iPos5 >>> 1)) | ((iPos4 & 15) << 4));
        if (i2 == 3) {
            CodecUtils.sanityCheckLastPos(iPos5, 1);
            return;
        }
        int iPos6 = ((iPos5 & 1) << 7) | (pos(bArr[i12]) << 2);
        int iPos7 = pos(bArr[i12 + 1]);
        bArr2[i11] = (byte) (iPos6 | ((iPos7 >>> 3) & 3));
        CodecUtils.sanityCheckLastPos(iPos7, 7);
    }

    private final void decode5bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        int i5 = i2 + 1;
        int iPos = pos(bArr[i2]) << 3;
        int i6 = i5 + 1;
        int iPos2 = pos(bArr[i5]);
        bArr2[i3] = (byte) (iPos | ((iPos2 >>> 2) & 7));
        int i7 = i4 + 1;
        int i8 = (iPos2 & 3) << 6;
        int i9 = i6 + 1;
        int iPos3 = i8 | (pos(bArr[i6]) << 1);
        int i10 = i9 + 1;
        int iPos4 = pos(bArr[i9]);
        bArr2[i4] = (byte) (iPos3 | ((iPos4 >>> 4) & 1));
        int i11 = i7 + 1;
        int i12 = (iPos4 & 15) << 4;
        int i13 = i10 + 1;
        int iPos5 = pos(bArr[i10]);
        bArr2[i7] = (byte) (i12 | ((iPos5 >>> 1) & 15));
        int i14 = (iPos5 & 1) << 7;
        int i15 = i13 + 1;
        int iPos6 = i14 | (pos(bArr[i13]) << 2);
        int i16 = i15 + 1;
        int iPos7 = pos(bArr[i15]);
        bArr2[i11] = (byte) (iPos6 | ((iPos7 >>> 3) & 3));
        bArr2[i11 + 1] = (byte) (pos(bArr[i16]) | ((iPos7 & 7) << 5));
    }

    private final void encode1byte(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 3) & 31];
        int i5 = i4 + 1;
        bArr2[i4] = bArr3[(b2 & 7) << 2];
        int i6 = 0;
        while (i6 < 6) {
            bArr2[i5] = PAD;
            i6++;
            i5++;
        }
    }

    private final void encode2bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 3) & 31];
        int i6 = i4 + 1;
        byte b3 = bArr[i5];
        bArr2[i4] = bArr3[((b2 & 7) << 2) | ((b3 >>> 6) & 3)];
        int i7 = i6 + 1;
        bArr2[i6] = bArr3[(b3 >>> 1) & 31];
        int i8 = i7 + 1;
        bArr2[i7] = bArr3[(b3 & 1) << 4];
        int i9 = 0;
        while (i9 < 4) {
            bArr2[i8] = PAD;
            i9++;
            i8++;
        }
    }

    private final void encode3bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 3) & 31];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        bArr2[i4] = bArr3[((b2 & 7) << 2) | ((b3 >>> 6) & 3)];
        int i8 = i6 + 1;
        bArr2[i6] = bArr3[(b3 >>> 1) & 31];
        int i9 = i8 + 1;
        byte b4 = bArr[i7];
        bArr2[i8] = bArr3[((b3 & 1) << 4) | ((b4 >>> 4) & 15)];
        int i10 = i9 + 1;
        bArr2[i9] = bArr3[(b4 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 1];
        int i11 = 0;
        while (i11 < 3) {
            bArr2[i10] = PAD;
            i11++;
            i10++;
        }
    }

    private final void encode4bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 3) & 31];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        bArr2[i4] = bArr3[((b2 & 7) << 2) | ((b3 >>> 6) & 3)];
        int i8 = i6 + 1;
        bArr2[i6] = bArr3[(b3 >>> 1) & 31];
        int i9 = i8 + 1;
        int i10 = (b3 & 1) << 4;
        int i11 = i7 + 1;
        byte b4 = bArr[i7];
        bArr2[i8] = bArr3[i10 | ((b4 >>> 4) & 15)];
        int i12 = i9 + 1;
        int i13 = (b4 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 1;
        byte b5 = bArr[i11];
        bArr2[i9] = bArr3[i13 | ((b5 >>> 7) & 1)];
        int i14 = i12 + 1;
        bArr2[i12] = bArr3[(b5 >>> 2) & 31];
        bArr2[i14] = bArr3[(b5 & 3) << 3];
        bArr2[i14 + 1] = PAD;
    }

    private final void encode5bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr3 = this.alpahbets;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        bArr2[i3] = bArr3[(b2 >>> 3) & 31];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        bArr2[i4] = bArr3[((b2 & 7) << 2) | ((b3 >>> 6) & 3)];
        int i8 = i6 + 1;
        bArr2[i6] = bArr3[(b3 >>> 1) & 31];
        int i9 = i8 + 1;
        int i10 = (b3 & 1) << 4;
        int i11 = i7 + 1;
        byte b4 = bArr[i7];
        bArr2[i8] = bArr3[i10 | ((b4 >>> 4) & 15)];
        int i12 = i9 + 1;
        int i13 = (b4 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 1;
        int i14 = i11 + 1;
        byte b5 = bArr[i11];
        bArr2[i9] = bArr3[i13 | ((b5 >>> 7) & 1)];
        int i15 = i12 + 1;
        bArr2[i12] = bArr3[(b5 >>> 2) & 31];
        byte b6 = bArr[i14];
        bArr2[i15] = bArr3[((b5 & 3) << 3) | ((b6 >>> 5) & 7)];
        bArr2[i15 + 1] = bArr3[b6 & 31];
    }

    @Override // com.amazonaws.util.Codec
    public final byte[] decode(byte[] bArr, int i2) {
        int i3;
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 8 bytes but found: " + i2);
        }
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 < 6 && i4 > -1 && bArr[i4] == 61) {
            i4--;
            i5++;
        }
        if (i5 == 0) {
            i3 = 5;
        } else if (i5 == 1) {
            i3 = 4;
        } else if (i5 == 3) {
            i3 = 3;
        } else if (i5 == 4) {
            i3 = 2;
        } else {
            if (i5 != 6) {
                throw new IllegalArgumentException("Invalid number of paddings " + i5);
            }
            i3 = 1;
        }
        int i6 = ((i2 / 8) * 5) - (5 - i3);
        byte[] bArr2 = new byte[i6];
        int i7 = 0;
        int i8 = 0;
        while (i8 < i6 - (i3 % 5)) {
            decode5bytes(bArr, i7, bArr2, i8);
            i7 += 8;
            i8 += 5;
        }
        if (i3 < 5) {
            decode1to4bytes(i3, bArr, i7, bArr2, i8);
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public final byte[] encode(byte[] bArr) {
        int length = bArr.length / 5;
        int length2 = bArr.length % 5;
        int i2 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 8];
            int i3 = 0;
            while (i2 < bArr.length) {
                encode5bytes(bArr, i2, bArr2, i3);
                i2 += 5;
                i3 += 8;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 8];
        int i4 = 0;
        while (i2 < bArr.length - length2) {
            encode5bytes(bArr, i2, bArr3, i4);
            i2 += 5;
            i4 += 8;
        }
        if (length2 == 1) {
            encode1byte(bArr, i2, bArr3, i4);
        } else if (length2 == 2) {
            encode2bytes(bArr, i2, bArr3, i4);
        } else if (length2 == 3) {
            encode3bytes(bArr, i2, bArr3, i4);
        } else if (length2 == 4) {
            encode4bytes(bArr, i2, bArr3, i4);
        }
        return bArr3;
    }

    public abstract int pos(byte b2);
}

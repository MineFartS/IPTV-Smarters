package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class Base64Encoder implements Encoder {
    public final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public final byte[] decodingTable = new byte[128];
    public byte padding = 61;

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c2, char c3, char c4, char c5) throws IOException {
        char c6 = this.padding;
        if (c4 == c6) {
            byte[] bArr = this.decodingTable;
            outputStream.write((bArr[c2] << 2) | (bArr[c3] >> 4));
            return 1;
        }
        if (c5 == c6) {
            byte[] bArr2 = this.decodingTable;
            byte b2 = bArr2[c2];
            byte b3 = bArr2[c3];
            byte b4 = bArr2[c4];
            outputStream.write((b2 << 2) | (b3 >> 4));
            outputStream.write((b3 << 4) | (b4 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b5 = bArr3[c2];
        byte b6 = bArr3[c3];
        byte b7 = bArr3[c4];
        byte b8 = bArr3[c5];
        outputStream.write((b5 << 2) | (b6 >> 4));
        outputStream.write((b6 << 4) | (b7 >> 2));
        outputStream.write((b7 << 6) | b8);
        return 3;
    }

    private boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    private int nextI(String str, int i2, int i3) {
        while (i2 < i3 && ignore(str.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    private int nextI(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && ignore((char) bArr[i2])) {
            i2++;
        }
        return i2;
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i2 = length - 4;
        int i3 = 0;
        int iNextI = nextI(str, 0, i2);
        while (iNextI < i2) {
            int i4 = iNextI + 1;
            byte b2 = this.decodingTable[str.charAt(iNextI)];
            int iNextI2 = nextI(str, i4, i2);
            int i5 = iNextI2 + 1;
            byte b3 = this.decodingTable[str.charAt(iNextI2)];
            int iNextI3 = nextI(str, i5, i2);
            int i6 = iNextI3 + 1;
            byte b4 = this.decodingTable[str.charAt(iNextI3)];
            int iNextI4 = nextI(str, i6, i2);
            int i7 = iNextI4 + 1;
            byte b5 = this.decodingTable[str.charAt(iNextI4)];
            outputStream.write((b2 << 2) | (b3 >> 4));
            outputStream.write((b3 << 4) | (b4 >> 2));
            outputStream.write((b4 << 6) | b5);
            i3 += 3;
            iNextI = nextI(str, i7, i2);
        }
        return i3 + decodeLastBlock(outputStream, str.charAt(i2), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i2, int i3, OutputStream outputStream) throws IOException {
        int i4 = i3 + i2;
        while (i4 > i2 && ignore((char) bArr[i4 - 1])) {
            i4--;
        }
        int i5 = i4 - 4;
        int iNextI = nextI(bArr, i2, i5);
        int i6 = 0;
        while (iNextI < i5) {
            int i7 = iNextI + 1;
            byte b2 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, i7, i5);
            int i8 = iNextI2 + 1;
            byte b3 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, i8, i5);
            int i9 = iNextI3 + 1;
            byte b4 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, i9, i5);
            int i10 = iNextI4 + 1;
            byte b5 = this.decodingTable[bArr[iNextI4]];
            outputStream.write((b2 << 2) | (b3 >> 4));
            outputStream.write((b3 << 4) | (b4 >> 2));
            outputStream.write((b4 << 6) | b5);
            i6 += 3;
            iNextI = nextI(bArr, i10, i5);
        }
        return i6 + decodeLastBlock(outputStream, (char) bArr[i5], (char) bArr[i4 - 3], (char) bArr[i4 - 2], (char) bArr[i4 - 1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    @Override // org.spongycastle.util.encoders.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int encode(byte[] r10, int r11, int r12, java.io.OutputStream r13) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r12 % 3
            int r12 = r12 - r0
            r1 = r11
        L4:
            int r2 = r11 + r12
            r3 = 4
            r4 = 2
            if (r1 >= r2) goto L4c
            r2 = r10[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r1 + 2
            r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r7 = r9.encodingTable
            int r8 = r2 >>> 2
            r8 = r8 & 63
            r7 = r7[r8]
            r13.write(r7)
            byte[] r7 = r9.encodingTable
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            r2 = r7[r2]
            r13.write(r2)
            byte[] r2 = r9.encodingTable
            int r3 = r5 << 2
            int r4 = r6 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            r2 = r2[r3]
            r13.write(r2)
            byte[] r2 = r9.encodingTable
            r3 = r6 & 63
            r2 = r2[r3]
            r13.write(r2)
            int r1 = r1 + 3
            goto L4
        L4c:
            r11 = 1
            if (r0 == r11) goto L7b
            if (r0 == r4) goto L52
            goto L9e
        L52:
            r1 = r10[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r11
            r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r1 >>> 2
            r11 = r11 & 63
            int r1 = r1 << r3
            int r2 = r10 >>> 4
            r1 = r1 | r2
            r1 = r1 & 63
            int r10 = r10 << r4
            r10 = r10 & 63
            byte[] r2 = r9.encodingTable
            r11 = r2[r11]
            r13.write(r11)
            byte[] r11 = r9.encodingTable
            r11 = r11[r1]
            r13.write(r11)
            byte[] r11 = r9.encodingTable
            r10 = r11[r10]
            goto L96
        L7b:
            r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r10 >>> 2
            r11 = r11 & 63
            int r10 = r10 << r3
            r10 = r10 & 63
            byte[] r1 = r9.encodingTable
            r11 = r1[r11]
            r13.write(r11)
            byte[] r11 = r9.encodingTable
            r10 = r11[r10]
            r13.write(r10)
            byte r10 = r9.padding
        L96:
            r13.write(r10)
            byte r10 = r9.padding
            r13.write(r10)
        L9e:
            int r12 = r12 / 3
            int r12 = r12 * 4
            if (r0 != 0) goto La5
            r3 = 0
        La5:
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.encoders.Base64Encoder.encode(byte[], int, int, java.io.OutputStream):int");
    }

    public void initialiseDecodingTable() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.encodingTable;
            if (i2 >= bArr.length) {
                return;
            }
            this.decodingTable[bArr[i2]] = (byte) i2;
            i2++;
        }
    }
}

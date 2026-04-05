package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J3 {
    public static byte[] A05;
    public static String[] A06;
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[1].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "kNkKJeUYPfq8eMd2tA59MaBH22H8N5Ts";
            strArr2[3] = "kNkKJeUYPfq8eMd2tA59MaBH22H8N5Ts";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{DateTimeFieldType.HALFDAY_OF_DAY, 58, 58, 55, 58, -24, 56, 41, 58, 59, 49, 54, 47, -24, 9, 30, 11, -24, 43, 55, 54, 46, 49, 47};
    }

    public static void A03() {
        A06 = new String[]{"6HhNm3cPNapwaqbb", "rETS2R3vEEslStUJRpCBgfLkJK0S9xqh", "MEYGBk1oMmhBWHD5huW8XB9PkOXmJxmW", "Ebyfs41o5airltqaiKadsdL394JDYdET", "45eNA9gLGf59sMGZ1iMI", BuildConfig.FLAVOR, "A0Zue4QITY9ZnpF1VrB6IK97BmW1DYMt", "lY4WeGl5g11cW0QvoH9uVkbc4B0XWsja"};
    }

    public J3(List<byte[]> initializationData, int i2, int i3, int i4, float f2) {
        this.A04 = initializationData;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = f2;
    }

    public static J3 A00(C0768Il c0768Il) throws AI {
        try {
            c0768Il.A0a(4);
            int iA0F = (c0768Il.A0F() & 3) + 1;
            if (iA0F != 3) {
                ArrayList arrayList = new ArrayList();
                int numSequenceParameterSets = c0768Il.A0F() & 31;
                for (int j2 = 0; j2 < numSequenceParameterSets; j2++) {
                    arrayList.add(A04(c0768Il));
                }
                int iA0F2 = c0768Il.A0F();
                for (int numPictureParameterSets = 0; numPictureParameterSets < iA0F2; numPictureParameterSets++) {
                    arrayList.add(A04(c0768Il));
                }
                int i2 = -1;
                int i3 = -1;
                float f2 = 1.0f;
                int width = A06[4].length();
                if (width == 27) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[2] = "yEkjaL4nSOxIxbdygxb0eg7rmaPMv2Rh";
                strArr[1] = "JEi8k2PtpDNktftvz60xHr0NAbywlG3U";
                if (numSequenceParameterSets > 0) {
                    byte[] bArr = (byte[]) arrayList.get(0);
                    byte[] bArr2 = (byte[]) arrayList.get(0);
                    int height = bArr.length;
                    C0763Ig c0763IgA06 = C0764Ih.A06(bArr2, iA0F, height);
                    i2 = c0763IgA06.A06;
                    i3 = c0763IgA06.A02;
                    f2 = c0763IgA06.A00;
                }
                return new J3(arrayList, iA0F, i2, i3, f2);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new AI(A01(0, 24, 119), e2);
        }
    }

    public static byte[] A04(C0768Il c0768Il) {
        int offset = c0768Il.A0J();
        int iA07 = c0768Il.A07();
        c0768Il.A0a(offset);
        return IQ.A09(c0768Il.A00, iA07, offset);
    }
}

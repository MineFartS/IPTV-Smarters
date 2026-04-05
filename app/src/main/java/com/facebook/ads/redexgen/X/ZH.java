package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZH implements DY {
    public static byte[] A02;
    public static String[] A03;
    public final int A00;
    public final List<Format> A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -118, -116, -120, 84, 93, 87, 95, -114, -99, -99, -103, -106, -112, -114, -95, -106, -100, -101, 92, -112, -110, -114, 90, 100, 93, 101};
    }

    public static void A03() {
        A03 = new String[]{"ggGLmhyInJSffjkfPU8VRn", "WisLA7DCjwWBxH7MqLlw8w9Z4gicIVYK", "baeaQjGS5RYnakDSUMD4HiL2ABi7hiKM", "QvfNkpkg0VH", "dkSLNeeU5ck3Twa6KyaCdOuwvlu7l8iW", "e6Ade", "C9ShSy7zMtGRXyHgR8PAzFWulvZi4KLP", "w2lskP6GH6NJyN70rzATNYjf2L9mjjHA"};
    }

    public ZH() {
        this(0);
    }

    public ZH(int i2) {
        this(i2, Collections.emptyList());
    }

    public ZH(int i2, List<Format> list) {
        this.A00 = i2;
        if (!A04(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 33), 0, null));
        }
        this.A01 = list;
    }

    private DU A00(DX dx) {
        String strA01;
        int i2;
        if (A04(32)) {
            return new DU(this.A01);
        }
        C0768Il c0768Il = new C0768Il(dx.A03);
        List<Format> arrayList = this.A01;
        while (true) {
            int iA05 = c0768Il.A05();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "9wGqNU4xey1NmHgGithGb88lbeAMl0Qa";
            strArr2[5] = "Me3yU";
            if (iA05 > 0) {
                int descriptorLength = c0768Il.A0F();
                int descriptorTag = c0768Il.A0F();
                int iA07 = c0768Il.A07() + descriptorTag;
                if (descriptorLength == 134) {
                    arrayList = new ArrayList<>();
                    int nextDescriptorPosition = c0768Il.A0F();
                    int i3 = nextDescriptorPosition & 31;
                    for (int accessibilityChannel = 0; accessibilityChannel < i3; accessibilityChannel++) {
                        String strA0T = c0768Il.A0T(3);
                        int iA0F = c0768Il.A0F();
                        int captionTypeByte = iA0F & 128;
                        int captionTypeByte2 = captionTypeByte != 0 ? 1 : 0;
                        if (captionTypeByte2 != 0) {
                            strA01 = A01(19, 19, 39);
                            i2 = iA0F & 63;
                        } else {
                            strA01 = A01(0, 19, 33);
                            i2 = 1;
                        }
                        arrayList.add(Format.A08(null, strA01, null, -1, 0, strA0T, i2, null));
                        c0768Il.A0a(2);
                    }
                }
                c0768Il.A0Z(iA07);
            } else {
                return new DU(arrayList);
            }
        }
    }

    private boolean A04(int i2) {
        return (this.A00 & i2) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final SparseArray<InterfaceC0635Da> A4K() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final InterfaceC0635Da A4P(int i2, DX dx) {
        if (i2 == 2) {
            return new ZQ(new ZK());
        }
        if (i2 == 3 || i2 == 4) {
            return new ZQ(new ZP(dx.A01));
        }
        if (i2 == 15) {
            if (A04(2)) {
                return null;
            }
            return new ZQ(new ZG(false, dx.A01));
        }
        if (i2 == 17) {
            if (A04(2)) {
                return null;
            }
            return new ZQ(new ZO(dx.A01));
        }
        if (i2 == 21) {
            return new ZQ(new ZN());
        }
        if (i2 == 27) {
            if (A04(4)) {
                return null;
            }
            return new ZQ(new ZL(A00(dx), A04(1), A04(8)));
        }
        if (i2 == 36) {
            return new ZQ(new ZM(A00(dx)));
        }
        if (i2 != 89) {
            if (i2 != 138) {
                if (i2 != 129) {
                    if (i2 != 130) {
                        if (A03[7].charAt(7) != 'G') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                        strArr[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                        if (i2 == 134) {
                            if (A04(16)) {
                                return null;
                            }
                            return new ZT(new ZU());
                        }
                        if (i2 != 135) {
                            return null;
                        }
                    }
                }
                return new ZQ(new ZD(dx.A01));
            }
            return new ZQ(new ZI(dx.A01));
        }
        return new ZQ(new ZJ(dx.A02));
    }
}

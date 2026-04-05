package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04645n {
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06;
    public static final String A07;
    public final C04655o A00;
    public final C04665p A01;
    public final X3 A02;
    public final QW A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, DateTimeFieldType.MINUTE_OF_HOUR, 41, 52, 56, 62, 45, 63};
    }

    public static void A02() {
        A06 = new String[]{"7hSVajAeCgz1xOL6e7JdxY1GumU2HXyD", "q6jA2qqZvmjCv4jL", "b0gzafrWTNHW6r6e", "PN9bkBdMXcS5Hl7VRoKypgPNSRbvyRkS", "mDbLhIhGJzTqHzUKZaFBYP58ldHlhgz6", "CwTwRCoCXMdU73ru4qjqHk1Xro", "O7TDRFBIxwUJB9gpJdCBp7jSvPF55uWn", "3uuXVolqtUJ2Uhm"};
    }

    static {
        A02();
        A01();
        A07 = C04645n.class.getSimpleName();
    }

    public C04645n(X3 x3, InterfaceC0967Qi interfaceC0967Qi, C04655o c04655o, C04665p c04665p) {
        this.A02 = x3;
        this.A03 = interfaceC0967Qi.A4O(QX.A06);
        this.A00 = c04655o;
        this.A01 = c04665p;
        this.A03.A3I(new C1044Tj(this));
        A03();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A03() {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A03.A7m()) {
                String strOptString = this.A03.A5z().optString(A00(0, 9, 62));
                if (!TextUtils.isEmpty(strOptString)) {
                    this.A00.A04(this.A02, strOptString);
                    if (!A04 || JT.A0d(this.A02)) {
                        A04 = true;
                        this.A01.A05();
                    }
                }
                String[] strArr = A06;
                if (strArr[2].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "iD3AeIZbhIr2rtu3";
                strArr2[1] = "thjsr5RS2cZaAQiz";
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}

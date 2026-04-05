package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4X {
    public static byte[] A0I;
    public static String[] A0J;
    public static final List<Object> A0K;
    public C0660Eb A08;
    public WeakReference<C0660Eb> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public C4X A06 = null;
    public C4X A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public C4N A0F = null;
    public boolean A0G = false;
    public int A0E = 0;

    @VisibleForTesting
    public int A02 = -1;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0I = new byte[]{120, 49, 60, 101, 89, DateTimeFieldType.CLOCKHOUR_OF_DAY, 30, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, 11, 28, 29, 107, 34, 37, 61, 42, 39, 34, 47, 9, 71, 70, 9, 89, 72, 91, 76, 71, 93, DateTimeFieldType.SECOND_OF_DAY, 90, 91, 64, DateTimeFieldType.SECOND_OF_DAY, 70, 81, 87, 77, 87, 88, 85, 86, 88, 81, 28, 123, 43, 52, 40, 50, 47, 50, 52, 53, 102, 114, 32, 55, 63, 61, 36, 55, 54, DateTimeFieldType.MINUTE_OF_DAY, 65, 81, 64, 83, 66, DateTimeFieldType.MINUTE_OF_DAY, 25, 77, 84, 73, 125, 92, 77, 88, 90, 81, 92, 93, 58, 111, 116, 120, 117, 111, 116, 126, 100, 49, 42, 32, 33, 34, 45, 42, 33, 32, 100, 37, 32, 37, 52, 48, 33, 54, 100, 52, 43, 55, 45, 48, 45, 43, 42, 41, 124, 121, 109, 104, 125, 108, 81, DateTimeFieldType.MILLIS_OF_DAY, 26, 85, 86, 94, 106, 85, 73, 7, 76, 64, DateTimeFieldType.CLOCKHOUR_OF_DAY, 44, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 90, 96, 95, 83, 65, 69, 122, 118, 100, 91, 124, 127, 119, 118, 97, 104, 118, 76, 89, 89, 76, 78, 69, 72, 73, 126, 78, 95, 76, 93, 112, 95, 103, 108, 101, 106, 99, 97, 87, 103, 118, 101, 116, 89, 48, 42, 11, 60, 58, 32, 58, 53, 56, 59, 53, 60, 121, 61, 60, 58, 43, 60, 52, 60, 55, 45, 60, 61, 121, 59, 60, 53, 54, 46, 121, 105, 99, 121, 44, 55, 52, 56, 45, 58, 49, 60, 61, 121, 41, 56, 48, 43, 121, 54, 63, 121, 42, 60, 45, DateTimeFieldType.CLOCKHOUR_OF_DAY, 42, 11, 60, 58, 32, 56, 59, 53, 60, 113, 112, 121, 58, 56, 53, 53, 42, 121, 63, 54, 43, 121, 31, 2, DateTimeFieldType.MINUTE_OF_HOUR, 27, 32, 31, DateTimeFieldType.MINUTE_OF_HOUR, 1, 86, 27, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 86, 24, 25, 2, 86, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 86, 24, 3, 26, 26, DateTimeFieldType.MINUTE_OF_HOUR};
        String[] strArr = A0J;
        if (strArr[5].charAt(21) != strArr[1].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[5] = "ATZarWDBMn8zDwozKxOA19Yjdj8cqMYP";
        strArr2[1] = "9Y2h7opSRjFz5DGljetO79QOLWaAi3pM";
    }

    public static void A05() {
        A0J = new String[]{"RjjM", "koSvj4DxhDjUOCe4EMKks9dnOG3CuiGu", "aGHSBrQSfGZtxcbyILmCKrnGyIhpjEzu", "3xCBACovNHKuv2JvT7we0utPzpikn", "cVLYlYPRz01pIgpGABaAmbt5GOW22sRw", "rNQ6SroUNOr34Wm88sisB9VlrwVLSnji", "gjKr", "5vAD1AgEgb1ZXBUPAvYh"};
    }

    static {
        A05();
        A04();
        A0K = Collections.EMPTY_LIST;
    }

    public C4X(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A02(264, 24, 92));
    }

    private void A03() {
        if (this.A0A == null) {
            this.A0A = new ArrayList();
            this.A0B = Collections.unmodifiableList(this.A0A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(C0660Eb c0660Eb) {
        this.A0E = C2u.A00(this.A0H);
        c0660Eb.A22(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(C0660Eb c0660Eb) {
        c0660Eb.A22(this, this.A0E);
        this.A0E = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0A() {
        return (this.A0C & 16) == 0 && C2u.A0F(this.A0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B() {
        return (this.A0C & 16) != 0;
    }

    private final boolean A0C() {
        return (this.A0C & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 || A0c();
    }

    public final int A0H() {
        C0660Eb c0660Eb = this.A08;
        if (c0660Eb == null) {
            return -1;
        }
        return c0660Eb.A1E(this);
    }

    public final int A0I() {
        return this.A00;
    }

    public final int A0J() {
        int i2 = this.A04;
        return i2 == -1 ? this.A03 : i2;
    }

    public final int A0K() {
        return this.A01;
    }

    public final long A0L() {
        return this.A05;
    }

    public final List<Object> A0M() {
        if ((this.A0C & 1024) == 0) {
            List<Object> list = this.A0A;
            if (list != null) {
                int size = list.size();
                if (A0J[2].charAt(8) == 'd') {
                    throw new RuntimeException();
                }
                String[] strArr = A0J;
                strArr[5] = "2DcmVbWbN7IXAuYZB7QLz9ixHDr4nD2H";
                strArr[1] = "B34awafHihlIJm5KsMjOG9HfWfhHTq0p";
                if (size != 0) {
                    return this.A0B;
                }
            }
            return A0K;
        }
        return A0K;
    }

    public final void A0N() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0O() {
        List<Object> list = this.A0A;
        if (list != null) {
            list.clear();
        }
        this.A0C &= -1025;
    }

    public final void A0P() {
        this.A0C &= -33;
    }

    public final void A0Q() {
        this.A0C &= -257;
    }

    public final void A0R() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0O();
        this.A0E = 0;
        this.A02 = -1;
        C0660Eb.A0u(this);
    }

    public final void A0S() {
        if (this.A01 == -1) {
            this.A01 = this.A03;
        }
    }

    public final void A0T() {
        this.A0F.A0d(this);
    }

    public final void A0U(int i2) {
        this.A0C |= i2;
    }

    public final void A0V(int i2, int i3) {
        this.A0C = (this.A0C & (i3 ^ (-1))) | (i2 & i3);
    }

    public final void A0W(int i2, int i3, boolean z) {
        A0U(8);
        A0X(i3, z);
        this.A03 = i2;
    }

    public final void A0X(int i2, boolean z) {
        if (this.A01 == -1) {
            this.A01 = this.A03;
        }
        if (this.A04 == -1) {
            this.A04 = this.A03;
        }
        if (z) {
            this.A04 += i2;
        }
        this.A03 += i2;
        if (this.A0H.getLayoutParams() != null) {
            ((C4G) this.A0H.getLayoutParams()).A01 = true;
        }
    }

    public final void A0Y(C4N c4n, boolean z) {
        this.A0F = c4n;
        this.A0G = z;
    }

    public final void A0Z(Object obj) {
        if (obj != null) {
            if ((1024 & this.A0C) != 0) {
                return;
            }
            A03();
            this.A0A.add(obj);
            return;
        }
        A0U(1024);
    }

    public final void A0a(boolean z) {
        int i2 = this.A0D;
        this.A0D = z ? i2 - 1 : i2 + 1;
        if (A0J[4].charAt(7) != 'R') {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[7] = "l8mjsSEKM";
        strArr[7] = "l8mjsSEKM";
        int i3 = this.A0D;
        if (i3 < 0) {
            this.A0D = 0;
            Log.e(A02(143, 4, 28), A02(186, 78, 115) + this);
            return;
        }
        if (!z && i3 == 1) {
            int i4 = this.A0C | 16;
            String[] strArr2 = A0J;
            if (strArr2[5].charAt(21) != strArr2[1].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0J;
            strArr3[2] = "drml3nLoX5pQWQBc32bzozsnTExNEnJK";
            strArr3[2] = "drml3nLoX5pQWQBc32bzozsnTExNEnJK";
            this.A0C = i4;
            return;
        }
        if (!z || this.A0D != 0) {
            return;
        }
        this.A0C &= -17;
    }

    public final boolean A0b() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0c() {
        return (this.A0C & 4) != 0;
    }

    public final boolean A0d() {
        return (this.A0C & 8) != 0;
    }

    public final boolean A0e() {
        return this.A0F != null;
    }

    public final boolean A0f() {
        return (this.A0C & 256) != 0;
    }

    public final boolean A0g() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0h() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0i() {
        return (this.A0C & 128) != 0;
    }

    public final boolean A0j() {
        return (this.A0C & 32) != 0;
    }

    public final boolean A0k() {
        return (this.A0C & 16) == 0 && !C2u.A0F(this.A0H);
    }

    public final boolean A0l(int i2) {
        return (this.A0C & i2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4X.toString():java.lang.String");
    }
}

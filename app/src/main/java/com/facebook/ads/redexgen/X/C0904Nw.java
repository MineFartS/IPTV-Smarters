package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0904Nw {
    public static byte[] A09;

    @Nullable
    public InterfaceC0903Nv A00;
    public boolean A01 = true;
    public boolean A02;
    public final X2 A03;
    public final JZ A04;
    public final C0849Ls A05;
    public final MR A06;
    public final Q2 A07;
    public final String A08;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, 63, 55, DateTimeFieldType.CLOCKHOUR_OF_DAY, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, DateTimeFieldType.MILLIS_OF_SECOND, 82, 79, 82, 84, 66, 67, 94, 89, 80, DateTimeFieldType.MILLIS_OF_SECOND, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    public C0904Nw(X2 x2, String str, Q2 q2, C0849Ls c0849Ls, JZ jz, MR mr) {
        this.A03 = x2;
        this.A08 = str;
        this.A07 = q2;
        this.A05 = c0849Ls;
        this.A04 = jz;
        this.A06 = mr;
    }

    public static void A03(X2 x2, @Nullable Q2 q2, C0849Ls c0849Ls, JZ jz, C1I c1i, String str) {
        AbstractC03300f abstractC03300fA01 = C03310g.A01(x2, jz, str, Uri.parse(c1i.A04()), new C0897Np().A04(q2).A03(c0849Ls).A06(), false, false);
        if (abstractC03300fA01 != null) {
            abstractC03300fA01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> map) {
        this.A04.A8Q(str, map);
        LU.A00(new DialogInterfaceOnClickListenerC0901Nt(this, map, str, str2), new DialogInterfaceOnClickListenerC0902Nu(this, str, map), LD.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 52);
        try {
            AbstractC03300f abstractC03300fA01 = C03310g.A01(this.A03, this.A04, str, Uri.parse(str2), new C0897Np(map).A04(this.A07).A03(this.A05).A06(), this.A01, this.A02);
            if (abstractC03300fA01 != null) {
                abstractC03300fA01.A0D();
            }
            if (this.A00 != null) {
                this.A00.A9L();
            }
            this.A06.A3s(this.A08);
        } catch (ActivityNotFoundException e2) {
            Log.e(strA01, A01(44, 20, 100) + str2, e2);
        } catch (Exception e3) {
            Log.e(strA01, A01(22, 22, 95), e3);
        }
    }

    public final void A07(InterfaceC0903Nv interfaceC0903Nv) {
        this.A00 = interfaceC0903Nv;
    }

    public final void A08(String str, String str2, Map<String, String> map) {
        new C0789Jg(str, this.A04).A03(EnumC0788Jf.A0J, null);
        if (this.A05.A0A(this.A03)) {
            this.A04.A83(str, map);
        } else if (JT.A0x(this.A03)) {
            A05(str, str2, map);
        } else {
            A06(str, str2, map);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}

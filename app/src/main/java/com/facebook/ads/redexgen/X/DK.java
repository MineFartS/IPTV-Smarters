package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DK extends XB<String> {
    public static byte[] A08;
    public static String[] A09;
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C8J A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    public static void A03() {
        A09 = new String[]{"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    }

    public DK(C8J c8j, String str, String str2, int i2, double d2, double d3, String str3, Map map) {
        this.A03 = c8j;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i2;
        this.A01 = d2;
        this.A00 = d3;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8M
    @Nullable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A04() {
        String strA01 = A01(0, 8, 12);
        this.A03.A01.A04().A7S(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        C8J.A08.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabaseA0F = null;
        try {
            try {
                sQLiteDatabaseA0F = this.A03.A0F();
                sQLiteDatabaseA0F.beginTransaction();
                String strA0F = this.A03.A02.A0F(this.A03.A03.A0D(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabaseA0F.setTransactionSuccessful();
                if (sQLiteDatabaseA0F.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0F.inTransaction()) {
                            sQLiteDatabaseA0F.endTransaction();
                        }
                    } catch (Exception e2) {
                        this.A03.A01.A04().A86(strA01, C05228d.A0n, new C05238e(e2));
                    }
                }
                Lock lock = C8J.A08;
                String[] strArr3 = A09;
                String str = strArr3[0];
                String eventId = strArr3[3];
                if (str.length() == eventId.length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A09;
                strArr4[6] = "euwrYX6ZBvkkPfbLG6LTpx3NDj";
                strArr4[2] = "qLYaMtYi2WKu9oTuT6ElhKmpF4";
                lock.unlock();
                return strA0F;
            } catch (Exception e3) {
                A01(C8L.A06);
                this.A03.A01.A04().A86(strA01, C05228d.A0m, new C05238e(e3));
                if (sQLiteDatabaseA0F != null && sQLiteDatabaseA0F.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0F.inTransaction()) {
                            sQLiteDatabaseA0F.endTransaction();
                        }
                    } catch (Exception e4) {
                        this.A03.A01.A04().A86(strA01, C05228d.A0n, new C05238e(e4));
                    }
                }
                C8J.A08.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseA0F != null && sQLiteDatabaseA0F.isOpen()) {
                try {
                    if (sQLiteDatabaseA0F.inTransaction()) {
                        sQLiteDatabaseA0F.endTransaction();
                    }
                } catch (Exception e5) {
                    this.A03.A01.A04().A86(strA01, C05228d.A0n, new C05238e(e5));
                }
            }
            C8J.A08.unlock();
            throw th;
        }
    }
}

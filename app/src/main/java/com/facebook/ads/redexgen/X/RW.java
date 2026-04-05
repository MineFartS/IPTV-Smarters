package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RW extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ String A00;

    static {
        A03();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, DateTimeFieldType.MILLIS_OF_DAY, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A02;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "QkfkB";
        strArr2[5] = "QkfkB";
        A01 = bArr;
    }

    public static void A03() {
        A02 = new String[]{"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    }

    public RW(String str) {
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        String strA00 = A00(0, 17, 116);
        try {
            C03450u.A04.await();
            if (C03450u.A0J(this.A00)) {
                ((C1K) C03450u.A00.A04().get(this.A00)).A04((int) (System.currentTimeMillis() / 1000));
                C03450u.A00.A07(this.A00);
                C03450u.A00.A05();
                C03450u.A0A();
            }
        } catch (InterruptedException e2) {
            C03450u.A01.A04().A86(strA00, C05228d.A0w, new C05238e(e2));
        } catch (JSONException e3) {
            C03450u.A08();
            C03450u.A01.A04().A86(strA00, C05228d.A0v, new C05238e(e3));
        }
    }
}

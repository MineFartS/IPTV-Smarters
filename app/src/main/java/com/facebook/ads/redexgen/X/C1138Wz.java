package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1138Wz implements C0M {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ X3 A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            strArr[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            bArrCopyOfRange[i5] = (byte) ((b2 ^ i4) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, DateTimeFieldType.HALFDAY_OF_DAY, 11, 9};
    }

    public static void A02() {
        A02 = new String[]{"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    }

    public C1138Wz(X3 x3) {
        this.A00 = x3;
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void A80(Throwable th) {
        this.A00.A04().A86(A00(0, 5, 0), C05228d.A1J, new C05238e(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void A89(Throwable th) {
        this.A00.A04().A86(A00(0, 5, 0), C05228d.A1L, new C05238e(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void AC9(String str, int i2, @Nullable String str2, @Nullable Integer num, @Nullable Long l2, AnonymousClass06 anonymousClass06) {
        C7F.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i2, str2, num, l2, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void ACA(String str, boolean z, AnonymousClass06 anonymousClass06) {
        C7F.A04(this.A00, new C7E(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z);
    }
}

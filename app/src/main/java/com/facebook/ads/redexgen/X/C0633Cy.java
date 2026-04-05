package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0633Cy {
    public static byte[] A00;
    public static String[] A01;

    static {
        A05();
        A04();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{76, 111, 111, 116, 93, 104, 115, 113, 73, 104, 117, 112, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, 24, 72, 75, 75, 80, 24, 78, 93, 74, 75, 81, 87, 86, 2, 24};
    }

    public static void A05() {
        A01 = new String[]{"kk3S4O13iVXJvtm5AjTeD8rK", "Zu4hi0TCs3bKXIhBk2aWCiDe3xK", "JowY5N4XtyrwAA9epoNCHGChZ5QJHmq", "OOxBqRpXIUSrAU80JlBeMYgVyXHV", "tCZgrksHUVK4eCN8oQ7yIu", "GrKlMP1w4PgYrm5YCKNZqmcWRop33Hln", "0sCqI3ucQZfe3Uil9qNltLDWT8T5PAU", "ug"};
    }

    public static int A00(byte[] bArr) {
        C0632Cx parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A00;
        }
        return -1;
    }

    @Nullable
    public static C0632Cx A01(byte[] bArr) {
        C0768Il c0768Il = new C0768Il(bArr);
        if (c0768Il.A08() < 32) {
            return null;
        }
        c0768Il.A0Z(0);
        if (c0768Il.A09() != c0768Il.A05() + 4) {
            return null;
        }
        int iA09 = c0768Il.A09();
        int i2 = AbstractC0616Cg.A0r;
        String[] strArr = A01;
        String str = strArr[0];
        String str2 = strArr[7];
        int length = str.length();
        int atomType = str2.length();
        if (length == atomType) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "KiHnRKSUZsnBoZKY996tMhDtZ8Gdi7J";
        strArr2[6] = "KiHnRKSUZsnBoZKY996tMhDtZ8Gdi7J";
        if (iA09 != i2) {
            return null;
        }
        int atomType2 = c0768Il.A09();
        int iA01 = AbstractC0616Cg.A01(atomType2);
        if (iA01 > 1) {
            Log.w(A02(0, 12, 31), A02(12, 26, 59) + iA01);
            return null;
        }
        UUID uuid = new UUID(c0768Il.A0M(), c0768Il.A0M());
        if (iA01 == 1) {
            c0768Il.A0a(c0768Il.A0I() * 16);
        }
        int iA0I = c0768Il.A0I();
        if (iA0I != c0768Il.A05()) {
            return null;
        }
        byte[] data = new byte[iA0I];
        c0768Il.A0d(data, 0, iA0I);
        return new C0632Cx(uuid, iA01, data);
    }

    @Nullable
    public static UUID A03(byte[] bArr) {
        C0632Cx c0632CxA01 = A01(bArr);
        if (c0632CxA01 != null) {
            return c0632CxA01.A01;
        }
        if (A01[6].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "A19aWphbBlm9ojDJQ1W47aeMdyevB22";
        strArr[1] = "rfVibYQBAeR1UXfUamieG6t7la8";
        return null;
    }

    public static byte[] A06(UUID uuid, @Nullable byte[] bArr) {
        return A07(uuid, null, bArr);
    }

    public static byte[] A07(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        boolean z = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int length2 = length + 32;
        if (z) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(AbstractC0616Cg.A0r);
        byteBufferAllocate.putInt(z ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (z) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }
}

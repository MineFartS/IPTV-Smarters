package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XA extends C8N {
    public static byte[] A00;
    public static final C8H A01;
    public static final C8H A02;
    public static final C8H[] A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 91, 63, 44, 45, 36, 45, 60, 45, 72, 46, 58, 39, 37, 72, 28, 7, 3, DateTimeFieldType.HALFDAY_OF_DAY, 6, 27, 72, 63, 32, 45, 58, 45, 72, 38, 39, 60, 72, 45, 48, 33, 59, 60, 59, 72, 64, 59, 45, 36, 45, 43, 60, 72, 89, 72, 46, 58, 39, 37, 72, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.HALFDAY_OF_DAY, 6, 28, 27, 72, 63, 32, 45, 58, 45, 72, 28, 7, 3, DateTimeFieldType.HALFDAY_OF_DAY, 6, 27, 70, 8, 53, 46, 40, 61, 57, 36, 34, 35, 109, 58, 37, 40, 35, 109, 57, 63, 52, 36, 35, 42, 109, 57, 34, 109, 41, 40, 33, 40, 57, 40, 109, 46, 37, 36, 33, 41, 33, 40, 62, 62, 109, 57, 34, 38, 40, 35, 62, 99, DateTimeFieldType.MILLIS_OF_DAY, 49, 41, 62, 51, 54, 59, 127, 43, 48, 52, 58, 49, 113, 92, 77, 80, 92, 74, 91, 70, 74, 62, 78, 76, 87, 83, 95, 76, 71, 62, 85, 91, 71, 36, 55, 36, 47, 53, 50, 2, 25, 29, DateTimeFieldType.MINUTE_OF_HOUR, 24, 25, 2, 6, 8, 3, 50, 4, 9, 80, 75, 79, 65, 74, 87};
    }

    static {
        A04();
        A02 = new C8H(0, A00(170, 8, 73), A00(143, 16, 58));
        A01 = new C8H(1, A00(165, 5, 82), A00(139, 4, 44));
        A03 = new C8H[]{A02, A01};
        A07 = XA.class.getSimpleName();
        C8H[] c8hArr = A03;
        String strA00 = A00(178, 6, 0);
        A05 = C8N.A02(strA00, c8hArr);
        A06 = C8N.A03(strA00, A03, A01);
        A04 = A00(5, 71, 76) + A02.A01 + A00(0, 3, 23) + A00(159, 6, 101) + A00(4, 1, 53) + X8.A09.A01 + A00(3, 1, 86);
    }

    public XA(C8J c8j) {
        super(c8j);
    }

    @Override // com.facebook.ads.redexgen.X.C8N
    public final String A07() {
        return A00(178, 6, 0);
    }

    @Override // com.facebook.ads.redexgen.X.C8N
    public final C8H[] A0B() {
        return A03;
    }

    public final Cursor A0C() {
        return A06().rawQuery(A05, null);
    }

    public final String A0D(String str) throws SQLiteException, IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = A06().rawQuery(A06, new String[]{str});
                String string = cursorRawQuery.moveToNext() ? cursorRawQuery.getString(A02.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    cursorRawQuery.close();
                    return string;
                }
                String string2 = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                String existingTokenId = A02.A01;
                contentValues.put(existingTokenId, string2);
                String existingTokenId2 = A01.A01;
                contentValues.put(existingTokenId2, str);
                SQLiteDatabase sQLiteDatabaseA06 = A06();
                String existingTokenId3 = A00(178, 6, 0);
                sQLiteDatabaseA06.insertOrThrow(existingTokenId3, null, contentValues);
                cursorRawQuery.close();
                return string2;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException(A00(125, 14, 123));
    }

    public final void A0E() {
        try {
            A06().execSQL(A04);
        } catch (SQLException e2) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A07, A00(76, 49, 105), e2);
            }
        }
    }
}

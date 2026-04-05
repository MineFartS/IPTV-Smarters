package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.AdSharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XF implements C8P {
    public static byte[] A03;
    public static String[] A04;
    public Context A00;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    @Nullable
    public C8O A01 = A00();

    static {
        A04();
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{107, 110, 123, 110, 112, 127, 125, 96, 108, 106, 124, 124, 102, 97, 104, 112, 96, 127, 123, 102, 96, 97, 124, 112, 108, 96, 122, 97, 123, 125, 118, 112, 100, 106, 118, 1, 4, DateTimeFieldType.HOUR_OF_DAY, 4, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_SECOND, 10, 6, 0, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 12, 11, 2, 26, 10, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 12, 10, 11, DateTimeFieldType.MILLIS_OF_DAY, 26, DateTimeFieldType.HOUR_OF_HALFDAY, 0, 28, 106, 111, 122, 111, 113, 126, 124, 97, 109, 107, 125, 125, 103, 96, 105, 113, 97, 126, 122, 103, 97, 96, 125, 113, 125, 122, 111, 122, 107, 113, 101, 107, 119, DateTimeFieldType.HOUR_OF_HALFDAY, 26, 5, DateTimeFieldType.SECOND_OF_MINUTE, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, 30, 3, 4, DateTimeFieldType.HALFDAY_OF_DAY, 25, DateTimeFieldType.SECOND_OF_MINUTE, 1, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR};
    }

    public static void A04() {
        A04 = new String[]{"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    }

    public XF(Context context) {
        this.A00 = context;
    }

    @Nullable
    private C8O A00() {
        return C8O.A00(AdSharedPreferences.getSharedPreferences(this.A00).getString(A01(95, 16, 52), null));
    }

    private void A02() {
        String[] stringArray;
        Integer integer;
        Integer country;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A01(35, 27, 59));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A01(0, 35, 81));
            country = AdInternalSettings.sSettingsBundle.getInteger(A01(62, 33, 80));
        }
        A05(stringArray, integer, country);
    }

    public final void A05(@Nullable String[] strArr, @Nullable Integer num, @Nullable Integer num2) {
        C8O c8o = new C8O(strArr, num, num2);
        if (c8o.equals(this.A01)) {
            return;
        }
        this.A01 = c8o;
        this.A02.set(true);
        SharedPreferences sharedPreferences = AdSharedPreferences.getSharedPreferences(this.A00);
        if (A04[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        sharedPreferences.edit().putString(A01(95, 16, 52), this.A01.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.C8P
    @Nullable
    public final C8O A60() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8P
    public final boolean A7n() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0U = JT.A0U(this.A00);
        String strA07 = this.A01.A07();
        Iterator<String> it = setA0U.iterator();
        while (it.hasNext()) {
            if (strA07.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C8P
    public final boolean ADC() {
        A02();
        return this.A02.getAndSet(false);
    }
}

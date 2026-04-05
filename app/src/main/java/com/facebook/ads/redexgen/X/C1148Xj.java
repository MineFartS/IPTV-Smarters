package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.common.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1148Xj implements C9J {
    public static byte[] A03;
    public static final String A04;
    public final X3 A00;
    public final C9U<JW> A01;
    public final C9U<JW> A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, 24, 61, 28, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, 11, 60, 58, 54, 43, 61, 29, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, DateTimeFieldType.HALFDAY_OF_DAY, 72, 91, 72, 67, 89, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, DateTimeFieldType.HALFDAY_OF_DAY, 89, 66, DateTimeFieldType.HALFDAY_OF_DAY, 64, 66, 91, 72, DateTimeFieldType.HALFDAY_OF_DAY, 72, 91, 72, 67, 89, 94, DateTimeFieldType.HALFDAY_OF_DAY, 75, 95, 66, 64, DateTimeFieldType.HALFDAY_OF_DAY, 68, 67, 0, 75, 65, 68, 74, 69, 89, DateTimeFieldType.HALFDAY_OF_DAY, 94, 89, 66, 95, 76, 74, 72, DateTimeFieldType.HALFDAY_OF_DAY, 79, 76, 78, 70, DateTimeFieldType.HALFDAY_OF_DAY, 89, 66, DateTimeFieldType.HALFDAY_OF_DAY, 72, 91, 72, 67, 89, 94, DateTimeFieldType.HALFDAY_OF_DAY, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, DateTimeFieldType.CLOCKHOUR_OF_DAY, 68, 95, DateTimeFieldType.CLOCKHOUR_OF_DAY, 64, 81, 66, 67, 85, DateTimeFieldType.CLOCKHOUR_OF_DAY, 81, 94, DateTimeFieldType.CLOCKHOUR_OF_DAY, 85, 70, 85, 94, 68, DateTimeFieldType.CLOCKHOUR_OF_DAY, 86, 66, 95, 93, DateTimeFieldType.CLOCKHOUR_OF_DAY, 89, 94, 29, 86, 92, 89, 87, 88, 68, DateTimeFieldType.CLOCKHOUR_OF_DAY, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, 29, 73, 82, 29, 79, 88, 92, 89, 29, 73, 85, 88, 29, 83, 72, 80, 95, 88, 79, 29, 82, 91, 29, 88, 75, 88, 83, 73, 78, 29, 91, 79, 82, 80, 29, 89, 92, 73, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, DateTimeFieldType.HALFDAY_OF_DAY, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 5, 24, DateTimeFieldType.HOUR_OF_HALFDAY, 74, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 30, 11, 8, 11, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 74, 12, 11, 3, 6, 31, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 74, 5, 9, 9, 31, 24, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 74, 29, 2, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 74, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 4, DateTimeFieldType.HALFDAY_OF_DAY, 74, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 28, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 30, 25, 68, 61, 40, 40, 57, 49, 44, 40, 28, 25, 12, 25, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, 12, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_SECOND};
    }

    static {
        A03();
        A04 = C1148Xj.class.getSimpleName();
    }

    public C1148Xj(X3 x3) throws IOException {
        this.A00 = x3;
        this.A01 = new C1156Xr(C9R.A00(A00(11, 28, 31), x3), new C1146Xh(this));
        this.A02 = new C1156Xr(C9R.A00(A00(322, 37, 102), x3), new C1147Xi(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i2, i3));
            } catch (JSONException e2) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(A04, A00(85, 45, 97), e2);
                }
                A05(C05228d.A20, e2);
            }
            i2 += i3;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i2, int i3) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i2, i2 + i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i2, String str) {
        C05238e c05238e = new C05238e(str);
        c05238e.A03(1);
        this.A00.A04().A87(A00(425, 15, 107), i2, c05238e);
    }

    private void A05(int i2, Throwable th) {
        this.A00.A04().A86(A00(425, 15, 107), i2, new C05238e(th));
    }

    public static byte[] A07(String str, JW jw) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), jw.A09());
            jSONObject.put(A00(471, 4, 106), jw.A07().toString());
            jSONObject.put(A00(462, 4, 86), C0848Lr.A02(jw.A05()));
            jSONObject.put(A00(450, 12, 27), C0848Lr.A02(jw.A04()));
            jSONObject.put(A00(440, 10, 116), jw.A08());
            jSONObject.put(A00(419, 4, 62), new JSONObject(jw.A0A()));
            jSONObject.put(A00(Constants.FAILED_PRECONDITION_STATUS_CODE, 7, 26), 0);
        } catch (JSONException e2) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(294, 28, 12), e2);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A6s();
        } catch (C05479d e2) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(245, 49, 123), e2);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[Catch: 9d -> 0x0126, TryCatch #6 {9d -> 0x0126, blocks: (B:33:0x00da, B:35:0x00e0, B:36:0x00ef, B:22:0x0088, B:24:0x008e, B:26:0x0094, B:27:0x00d0, B:39:0x00f8, B:40:0x00fc, B:42:0x0102, B:43:0x0112, B:44:0x0116, B:46:0x011c), top: B:63:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1148Xj.A0B(int, java.util.Set, java.util.Set):int");
    }

    public final List<JSONObject> A0C(int i2) {
        boolean z = false;
        if (i2 == -1) {
            z = true;
            i2 = 30;
        }
        int[] iArr = new int[i2];
        byte[] bArr = new byte[i2 * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            C9T lastFetch = this.A01.A54(bArr, iArr);
            linkedList2.add(lastFetch);
            int iA55 = lastFetch.A55();
            linkedList = A01(linkedList, bArr, iArr);
            while (lastFetch.A8X() && (iA55 < i2 || z)) {
                if (!z) {
                    iArr = new int[i2 - iA55];
                } else {
                    Arrays.fill(iArr, 0);
                }
                lastFetch = this.A01.A54(bArr, iArr);
                linkedList2.add(lastFetch);
                linkedList = A01(linkedList, bArr, iArr);
            }
            Iterator<JSONObject> it = linkedList.iterator();
            while (it.hasNext()) {
                this.A02.ADT(A09(it.next()));
            }
            Iterator it2 = linkedList2.iterator();
            while (it2.hasNext()) {
                ((C9T) it2.next()).A4g();
            }
        } catch (C05479d e2) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(359, 53, 44), e2);
            }
            A05(C05228d.A1x, e2);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.X.C9J
    public final void A40() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C05479d e2) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(55, 30, 66), e2);
            }
            A05(C05228d.A1u, e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9G != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.C9J
    public final void ADy(final JW jw, final C9G<String> c9g) {
        Executor executor = M4.A07;
        final C9U<JW> c9u = this.A01;
        final X3 x3 = this.A00;
        M1.A00(executor, new AsyncTask<Void, Void, String>(jw, c9g, c9u, x3) { // from class: com.facebook.ads.redexgen.X.9K
            public static byte[] A05;
            public static String[] A06;

            @Nullable
            public C05479d A00;
            public final C8C A01;
            public final C9G<String> A02;
            public final C9U<JW> A03;
            public final JW A04;

            static {
                A03();
                A02();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 55);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 3, 3, 2, 25, 77, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 77, 3, 24, 1, 1, DateTimeFieldType.HALFDAY_OF_DAY, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, 30, 24, DateTimeFieldType.SECOND_OF_DAY, 9, 31, 36, 31, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 26, 25, 26, 8, 30};
            }

            public static void A03() {
                A06 = new String[]{"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9G != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9U != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = jw;
                this.A03 = c9u;
                this.A02 = c9g;
                this.A01 = x3;
            }

            @Nullable
            private final String A01(Void... voidArr) throws Throwable {
                if (C0822Kp.A02(this)) {
                    return null;
                }
                String string = null;
                try {
                    try {
                        string = UUID.randomUUID().toString();
                        InterfaceC05218c interfaceC05218cA04 = this.A01.A04();
                        String eventId = this.A04.A07().toString();
                        interfaceC05218cA04.A7S(eventId);
                        String eventId2 = this.A04.A09();
                        if (TextUtils.isEmpty(eventId2)) {
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        String eventId3 = A00(29, 15, 118);
                        sb.append(eventId3);
                        String eventId4 = this.A04.A07().toString();
                        sb.append(eventId4);
                        String eventId5 = A00(0, 1, 13);
                        sb.append(eventId5);
                        String eventId6 = this.A04.A0A().toString();
                        sb.append(eventId6);
                        sb.toString();
                        this.A03.ADT(C1148Xj.A07(string, this.A04));
                    } catch (C05479d e2) {
                        this.A00 = e2;
                        this.A01.A04().A86(A00(44, 15, 76), C05228d.A1y, new C05238e(e2));
                    }
                    return string;
                } catch (Throwable th) {
                    C0822Kp.A00(th, this);
                    return null;
                }
            }

            private final void A04(String str) throws Throwable {
                if (C0822Kp.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A02.A03(str);
                    } else {
                        this.A02.A02(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    C0822Kp.A00(th, this);
                }
            }

            @Override // android.os.AsyncTask
            @Nullable
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) throws Throwable {
                if (C0822Kp.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    C0822Kp.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A06;
                    strArr[1] = "V";
                    strArr[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) throws Throwable {
                if (C0822Kp.A02(this)) {
                    return;
                }
                try {
                    A04(str);
                } catch (Throwable th) {
                    C0822Kp.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}

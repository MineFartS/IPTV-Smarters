package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.99, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass99 {
    public static byte[] A00;
    public static String[] A01;
    public static final SparseIntArray A02;
    public static final Map<String, Integer> A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{3, -1, -2, 50, 33, 38, 34, 43, 32, 34, 11, 34, 49, 52, 44, 47, 40, -63, -67, -78, -76, -74, -66, -74, -65, -59, -60, -48, -68, -74, -54, -27, -3, -5, 2, 2, -5, 0, -7, -78, -5, 0, -5, 6, -78, -10, 7, -9, -78, 6, 1, -78, -2, -13, -11, -3, -78, 1, -8, -78, -11, 1, 0, 0, -9, -11, 6, -5, 8, -5, 6, 11, -64, 27, 34, 29, 29, 30, 43, 24, 45, 40, 36, 30, 39, 3, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 5, DateTimeFieldType.HALFDAY_OF_DAY, 6, DateTimeFieldType.SECOND_OF_DAY, -8, 4, 3, 3, -6, -8, 9, -2, 11, -2, 9, DateTimeFieldType.HOUR_OF_HALFDAY, 38, 50, 49, 55, 40, 59, 55, -50, -51, -55, -36, -35, -38, -51, -57, -53, -41, -42, -50, -47, -49, 6, 9, 12, 12, -39, -54, -30, -43, -40, -54, -51, -46, -50, -61, -59, -57, -49, -57, -48, -42, -63, -56, -47, -44, -49, -61, -42, -43, 27, DateTimeFieldType.MILLIS_OF_SECOND, 12, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 31, 10, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, DateTimeFieldType.CLOCKHOUR_OF_DAY, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 3, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY};
    }

    public static void A03() {
        A01 = new String[]{"PAVmNMJ6hNXqyRqmf1Doke6LQ8aMFdOg", "iuSnr5mIAvkputnHCV42XmFxKij5KqRv", "5f2Rj8D53s9YgCs1y8vFwUZB8s77zEMu", "g9qsOieArYo5RvIYh6PAxBWVjxzJiH5j", "XDam3FbFKbKfc7xmRHTLGW4HsEtQzQza", "fVcqTxqBSVLVjRnvznAg", "FuHpjfTv97DE7Ep9HAA56glTVlKxMjBD", "hFlNuwKsY8ujBQkLvvvenNI3HVRbI8no"};
    }

    static {
        A03();
        A02();
        A03 = new HashMap();
        A02 = new SparseIntArray();
        A02.put(19, 1);
        A02.put(18, 2);
        A02.put(20, 4);
        A02.put(36, 6);
        A02.put(40, 3);
        A02.put(61, 5);
    }

    public static synchronized Integer A00(String str) {
        Integer num = A03.get(str);
        if (num != null) {
            return Integer.valueOf(A02.get(num.intValue()));
        }
        return 0;
    }

    public static void A04(X3 x3, MultithreadedBundleWrapper multithreadedBundleWrapper) throws JSONException {
        ArrayList<String> stringArrayList;
        NetworkInfo activeNetworkInfo;
        String bidderToken = DynamicLoaderFactory.makeLoader(x3).createBidderTokenProviderApi().getBidderToken(x3);
        ConnectivityManager connectivityManager = (ConnectivityManager) x3.getSystemService(A01(92, 12, 72));
        if (connectivityManager != null && ((activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting())) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A01(0, 17, 112), A01(31, 42, 69));
                return;
            }
            return;
        }
        Q7 q7A02 = QP.A02(false, x3);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(73, 12, 108), bidderToken);
        if (multithreadedBundleWrapper != null && (stringArrayList = multithreadedBundleWrapper.getStringArrayList(A01(17, 14, 36))) != null) {
            JSONArray jSONArray = new JSONArray();
            for (String placement : stringArrayList) {
                jSONArray.put(placement);
            }
            jSONObject2.put(A01(153, 13, 94), jSONArray);
        }
        A05(x3, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(A01(136, 17, 21), A01(125, 4, 83));
        jSONObject3.put(A01(111, 14, 27), A01(125, 4, 83));
        jSONObject.put(A01(104, 7, 118), jSONObject2);
        jSONObject.put(A01(166, 7, 81), jSONObject3);
        QL ql = new QL();
        ql.put(A01(129, 7, 28), jSONObject.toString());
        Q6 q6ABg = q7A02.ABg(C0812Ke.A05(x3), ql.A09());
        if (q6ABg != null && q6ABg.A79() == 200) {
            String strA5V = q6ABg.A5V();
            if (!TextUtils.isEmpty(strA5V)) {
                JSONObject payload = new JSONObject(strA5V).optJSONObject(A01(85, 7, 84));
                JSONObject jSONObjectOptJSONObject = payload.optJSONObject(A01(136, 17, 21));
                String strOptString = payload.optString(A01(111, 14, 27));
                if (!TextUtils.isEmpty(strOptString)) {
                    JT.A0L(x3).A1l(strOptString);
                }
                HashMap map = new HashMap();
                Iterator<String> keyIterator = jSONObjectOptJSONObject.keys();
                while (keyIterator.hasNext()) {
                    String next = keyIterator.next();
                    map.put(next, Integer.valueOf(Integer.parseInt(jSONObjectOptJSONObject.getString(next))));
                }
                String[] strArr = A01;
                if (strArr[1].charAt(1) != strArr[6].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[5] = "staqUk3OlqofBPoOW92gC9gLz0Qw";
                strArr2[5] = "staqUk3OlqofBPoOW92gC9gLz0Qw";
                synchronized (A03) {
                    A03.putAll(map);
                }
            }
        }
    }

    public static void A05(X3 x3, JSONObject jSONObject) throws JSONException {
        for (Map.Entry<String, String> entry : AnonymousClass97.A00().A02(x3, true).A6B().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }
}

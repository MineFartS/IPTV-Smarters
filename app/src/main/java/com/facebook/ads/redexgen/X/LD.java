package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LD implements Application.ActivityLifecycleCallbacks {
    public static Context A00;
    public static X3 A01;
    public static byte[] A02;
    public static String[] A03;
    public static final List<LC> A04;
    public static final Map<Activity, Integer> A05;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 12);
            i5++;
        }
    }

    public static void A02() {
        A02 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_DAY, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, DateTimeFieldType.MINUTE_OF_DAY, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, 28, 55, 6, 6, 53, 25, 24, 2, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, 2, 86, 31, 5, 86, 24, 25, 2, 86, 55, 6, 6, 26, 31, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_SECOND, 2, 31, 25, 24, 88, 40, 4, 5, 8, 30, 25, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 5, 31, 75, 6, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2, DateTimeFieldType.HALFDAY_OF_DAY, 2, 8, 10, 31, 2, 4, 5, 75, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 8, DateTimeFieldType.HOUR_OF_HALFDAY, 27, 31, 2, 4, 5, 75, 31, 3, 25, 4, 28, 5, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, 25, 2, 5, 12, 75, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 2, 24, 31, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 42, 8, 31, 2, 29, 2, 31, DateTimeFieldType.MINUTE_OF_DAY, 40, 10, 7, 7, 9, 10, 8, 0, 24, 39, 2, 24, 31, DateTimeFieldType.HOUR_OF_HALFDAY, 5, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, 127, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, DateTimeFieldType.HALFDAY_OF_DAY, 74, 125, 107, 34, 56, 31, 29, 10, 33, 11, 10, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 4, DateTimeFieldType.SECOND_OF_MINUTE, 12};
    }

    public static void A03() {
        A03 = new String[]{"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    }

    static {
        A03();
        A02();
        A05 = Collections.synchronizedMap(new WeakHashMap());
        A04 = Collections.synchronizedList(new ArrayList());
    }

    @Nullable
    public static synchronized Activity A00() {
        Activity lastResumedActivity = null;
        Iterator<Map.Entry<Activity, Integer>> it = A05.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Activity, Integer> next = it.next();
            if (next.getValue().intValue() == 3) {
                Activity lastResumedActivity2 = next.getKey();
                lastResumedActivity = lastResumedActivity2;
                break;
            }
        }
        Activity activityA00 = null;
        boolean z = lastResumedActivity == null || Build.VERSION.SDK_INT < 28;
        if (z) {
            activityA00 = LA.A00();
        }
        if (A01 != null && z && lastResumedActivity != activityA00) {
            C05238e c05238e = new C05238e(A01(19, 23, 62), A01(203, 5, 20) + lastResumedActivity + A01(12, 7, 124) + activityA00);
            c05238e.A03(1);
            A01.A04().A86(A01(208, 8, 114), C05228d.A01, c05238e);
        }
        return lastResumedActivity != null ? lastResumedActivity : activityA00;
    }

    public static synchronized void A04(X3 x3) {
        A01 = x3;
        A00 = x3.getApplicationContext();
        if (A00 instanceof Application) {
            ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
            if (aNActivityLifecycleCallbacksListener != null) {
                Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                synchronized (activityStateMap) {
                    try {
                        Map<Activity, Integer> activityStateMap2 = A05;
                        activityStateMap2.putAll(activityStateMap);
                    } catch (ConcurrentModificationException unused) {
                        x3.A04().A86(A01(208, 8, 114), C05228d.A00, new C05238e(A01(72, 80, 103)));
                    }
                }
                ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(x3);
            }
            ((Application) A00).registerActivityLifecycleCallbacks(new LD());
        } else {
            x3.A04().A86(A01(216, 3, 105), C05228d.A0S, new C05238e(A01(42, 30, 122)));
        }
    }

    public static void A05(LC lc) {
        A04.add(lc);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A05.put(activity, 1);
        Iterator<LC> it = A04.iterator();
        while (it.hasNext()) {
            it.next().onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A05.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Integer num = A05.get(activity);
        if (num == null || num.intValue() != 3) {
            C05238e c05238e = new C05238e(A01(172, 31, 47), A01(152, 20, 73) + num + A01(0, 12, 22) + activity);
            c05238e.A03(0);
            A01.A04().A86(A01(208, 8, 114), C05228d.A01, c05238e);
        }
        A05.put(activity, 4);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A05.put(activity, 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A05.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A05.put(activity, 5);
    }
}

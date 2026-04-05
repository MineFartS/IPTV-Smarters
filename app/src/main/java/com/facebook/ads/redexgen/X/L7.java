package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class L7 {
    public static byte[] A00;
    public static String[] A01;

    static {
        A05();
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] ^ i4;
            if (A01[4].charAt(13) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "lr9od7US3THgayVRC3YximplGEeGYREs";
            strArr[2] = "lr9od7US3THgayVRC3YximplGEeGYREs";
            bArrCopyOfRange[i5] = (byte) (i6 ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{60, 62, 41, 52, 43, 52, 41, 36, 54, 57, 51, 37, 56, 62, 51, 121, 54, 39, 39, 121, DateTimeFieldType.MILLIS_OF_DAY, 52, 35, 62, 33, 62, 35, 46, 3, 63, 37, 50, 54, 51, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 61, 63, 42, 59, 57, 49, 44, 39, 112, DateTimeFieldType.MINUTE_OF_DAY, 31, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, 29, DateTimeFieldType.MILLIS_OF_DAY, 27, 12, 53, 35, 36, 36, 51, 56, 34, DateTimeFieldType.MILLIS_OF_SECOND, 53, 34, 63, 32, 63, 34, 47, 2, 62, 36, 51, 55, 50, 34, DateTimeFieldType.HOUR_OF_HALFDAY, 44, 59, 38, 57, 38, 59, 38, 42, 60};
    }

    public static void A05() {
        A01 = new String[]{"4Hyw1ld0", "fEzx6YE0SeCvem7jc58qc1uowK5CeHyF", "mKjUZIiYyhCBAWVMkGfhIPNFhY8yjY7b", "XoO13E9Z", "T5DEyuoaMCuUHewoghibS1K19XR2WHTa", "iIUB3596vuf", "PRfLmBQ8OOom6oFwc8jxiiNxNKuVVsiK", "TWoMGSFYHQz"};
    }

    public static L6 A00() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(A03(8, 26, 93));
        Object objInvoke = cls.getMethod(A03(66, 21, 92), new Class[0]).invoke(null, new Object[0]);
        Field activitiesField = cls.getDeclaredField(A03(87, 11, 69));
        activitiesField.setAccessible(true);
        Map map = (Map) activitiesField.get(objInvoke);
        if (map == null) {
            return L6.A0B;
        }
        for (Object obj : map.values()) {
            Field activitiesField2 = obj.getClass().getDeclaredField(A03(0, 8, 87));
            activitiesField2.setAccessible(true);
            Activity activity = (Activity) activitiesField2.get(obj);
            if (activity.isTaskRoot() && activity.getIntent().getCategories().contains(A03(34, 32, 84))) {
                return L6.A06;
            }
        }
        return L6.A09;
    }

    public static L6 A01(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return A02(context);
            }
            return A00();
        } catch (Exception unused) {
            return L6.A04;
        }
    }

    @RequiresApi(api = 21)
    public static L6 A02(Context context) {
        if (context == null) {
            return L6.A0C;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(A03(0, 8, 87));
        if (activityManager == null) {
            return L6.A07;
        }
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        if (appTasks.isEmpty()) {
            return L6.A0A;
        }
        Iterator<ActivityManager.AppTask> it = appTasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null) {
                Set<String> categories = taskInfo.baseIntent.getCategories();
                if (A01[4].charAt(13) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[7] = "rbRaEFWiZz7";
                strArr[5] = "WgbgXmtUXm5";
                if (categories != null && taskInfo.baseIntent.getCategories().contains(A03(34, 32, 84))) {
                    return L6.A05;
                }
            }
        }
        return L6.A08;
    }
}

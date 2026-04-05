package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03370m {
    public static byte[] A06;
    public static String[] A07;

    @Nullable
    public Application A01;

    @Nullable
    public C03360l A03;
    public final JZ A05;
    public long A00 = 0;

    @Nullable
    public String A04 = null;

    @Nullable
    public EnumC03290e A02 = null;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{44, 47, 45, 37, DateTimeFieldType.HOUR_OF_DAY, 58, 39, 35, 43, 8, 1, 5, DateTimeFieldType.MINUTE_OF_DAY, 1, 59, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 9, 1, 10, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 6, 10, 8, 0};
    }

    public static void A04() {
        A07 = new String[]{"jY95Z4e8SjES", "FWAQk0vwFzOT3H3ejUps9E7fwyQUHgqv", "R9UUrzGy7cjs1hDg6byYlCYbXfp8nW0w", "dKAdSxu4tDkfYe86wdSSQ2n2Du5", "FgFVZj7d091u9rUO", "kSt0PMlvWs2DEAK3GKEU98UDJan6EgWc", "nGXCIrfUxBd8PJB10o2gs7oQf", "n"};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.redexgen.X.0l] */
    public C03370m(JZ jz, final Activity activity, int i2) {
        this.A05 = jz;
        this.A01 = activity.getApplication();
        this.A03 = new Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.redexgen.X.0l

            @Nullable
            public C03370m A00;
            public final WeakReference<Activity> A01;

            {
                this.A01 = new WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                Activity activity3 = this.A01.get();
                if (activity3 == null || activity2.equals(activity3)) {
                    this.A00.A06();
                    this.A00 = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }
        };
    }

    public static C03370m A00(JZ jz, Activity activity) {
        return A01(jz, activity, Build.VERSION.SDK_INT);
    }

    @Nullable
    @VisibleForTesting
    public static C03370m A01(JZ jz, Activity activity, int i2) {
        if (activity != null && i2 >= 14) {
            return new C03370m(jz, activity, i2);
        }
        return null;
    }

    private void A05(String str, long j2, long j3, @Nullable EnumC03290e enumC03290e) {
        HashMap map = new HashMap();
        map.put(A02(9, 10, 8), Long.toString(j2));
        map.put(A02(0, 9, 34), Long.toString(j3));
        if (enumC03290e != null) {
            map.put(A02(19, 7, 9), enumC03290e.name());
        }
        this.A05.A8R(str, map);
    }

    @TargetApi(14)
    public final void A06() {
        C03360l c03360l;
        A05(this.A04, this.A00, System.currentTimeMillis(), this.A02);
        Application application = this.A01;
        if (application != null && (c03360l = this.A03) != null) {
            application.unregisterActivityLifecycleCallbacks(c03360l);
            this.A03 = null;
            this.A01 = null;
        }
    }

    public final void A07(@Nullable EnumC03290e enumC03290e) {
        this.A02 = enumC03290e;
    }

    @TargetApi(14)
    public final void A08(String str) {
        this.A04 = str;
        if (this.A03 != null && this.A01 != null) {
            this.A00 = System.currentTimeMillis();
            this.A01.registerActivityLifecycleCallbacks(this.A03);
            return;
        }
        EnumC03290e enumC03290e = EnumC03290e.A03;
        if (A07[2].charAt(6) == '9') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "8mgXQ8lZ1oxTn8xtWXCDJO1aYxf7Xnbe";
        strArr[1] = "RSHxB9AoZRnm9g8NXStW2wWwzMRvBUbh";
        A05(str, -1L, -1L, enumC03290e);
    }
}

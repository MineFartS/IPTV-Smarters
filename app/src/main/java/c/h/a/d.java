package c.h.a;

import android.content.Context;
import android.content.Intent;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static boolean a(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static String b(String str) {
        return str.substring(str.lastIndexOf("/") + 1);
    }

    public static String c(String str) {
        return str.substring(0, str.lastIndexOf("/"));
    }

    public static String d(long j2) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        long j3 = (j2 % TimeChart.DAY) / 3600000;
        long j4 = (j2 % 3600000) / 60000;
        long j5 = (j2 % 60000) / 1000;
        if (j3 < 10) {
            sb = new StringBuilder();
            sb.append("0");
            sb.append(j3);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(BuildConfig.FLAVOR);
        }
        String string = sb.toString();
        if (j4 < 10) {
            sb2 = new StringBuilder();
            sb2.append("0");
            sb2.append(j4);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j4);
            sb2.append(BuildConfig.FLAVOR);
        }
        String string2 = sb2.toString();
        if (j5 < 10) {
            sb3 = new StringBuilder();
            sb3.append("0");
            sb3.append(j5);
        } else {
            sb3 = new StringBuilder();
            sb3.append(j5);
            sb3.append(BuildConfig.FLAVOR);
        }
        String string3 = sb3.toString();
        if (j3 != 0) {
            sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append(":");
        } else {
            sb4 = new StringBuilder();
        }
        sb4.append(string2);
        sb4.append(":");
        sb4.append(string3);
        return sb4.toString();
    }
}

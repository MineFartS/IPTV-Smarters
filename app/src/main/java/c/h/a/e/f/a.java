package c.h.a.e.f;

import a.i.h.j;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Patterns;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import minefarts.iptvsmarters.R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16731a;

    public a(Context context) {
        this.f16731a = context;
    }

    public static boolean b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z = true;
        if (Build.VERSION.SDK_INT <= 20) {
            return !activityManager.getRunningTasks(1).get(0).topActivity.getPackageName().equals(context.getPackageName());
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance == 100) {
                for (String str : runningAppProcessInfo.pkgList) {
                    if (str.equals(context.getPackageName())) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public Bitmap a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void c() {
        try {
            RingtoneManager.getRingtone(this.f16731a, Uri.parse("android.resource://" + this.f16731a.getPackageName() + "/raw/notification")).play();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d(Bitmap bitmap, j.e eVar, int i2, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        Notification notificationC;
        new j.b();
        NotificationManager notificationManager = (NotificationManager) this.f16731a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        j.e eVar2 = new j.e(this.f16731a);
        if (Build.VERSION.SDK_INT >= 26) {
            new j.f().m(str2);
            NotificationChannel notificationChannel = new NotificationChannel("ksjadf87", this.f16731a.getResources().getString(R.string.recording_dots), 2);
            notificationC = new Notification.Builder(this.f16731a).setContentTitle(str).setContentText(str2).setAutoCancel(true).setSound(uri).setContentIntent(pendingIntent).setSmallIcon(R.mipmap.ic_launcher).setChannelId("ksjadf87").build();
            notificationManager.createNotificationChannel(notificationChannel);
        } else {
            j.f fVar = new j.f();
            fVar.m(str2);
            eVar2.o(str).n(str2).j(true).B(uri).C(fVar).m(pendingIntent).A(R.mipmap.ic_launcher);
            notificationC = eVar2.c();
        }
        notificationManager.notify(234231, notificationC);
    }

    public void e(String str, String str2, String str3, Intent intent) {
        f(str, str2, str3, intent, null);
    }

    public void f(String str, String str2, String str3, Intent intent, String str4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        intent.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this.f16731a, 0, intent, 134217728);
        j.e eVar = new j.e(this.f16731a);
        Uri uri = Uri.parse("android.resource://" + this.f16731a.getPackageName() + "/raw/notification");
        if (TextUtils.isEmpty(str4)) {
            g(eVar, R.mipmap.ic_launcher, str, str2, str3, activity, uri);
            c();
        } else {
            if (str4 == null || str4.length() <= 4 || !Patterns.WEB_URL.matcher(str4).matches()) {
                return;
            }
            Bitmap bitmapA = a(str4);
            if (bitmapA != null) {
                d(bitmapA, eVar, R.mipmap.ic_launcher, str, str2, str3, activity, uri);
            } else {
                g(eVar, R.mipmap.ic_launcher, str, str2, str3, activity, uri);
            }
        }
    }

    public final void g(j.e eVar, int i2, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        Notification notificationC;
        NotificationManager notificationManager = (NotificationManager) this.f16731a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        j.e eVar2 = new j.e(this.f16731a);
        if (Build.VERSION.SDK_INT >= 26) {
            new j.f().m(str2);
            NotificationChannel notificationChannel = new NotificationChannel("ksjadf87", this.f16731a.getResources().getString(R.string.recording_dots), 2);
            notificationC = new Notification.Builder(this.f16731a).setContentTitle(str).setContentText(str2).setAutoCancel(true).setSound(uri).setContentIntent(pendingIntent).setSmallIcon(R.mipmap.ic_launcher).setChannelId("ksjadf87").build();
            notificationManager.createNotificationChannel(notificationChannel);
        } else {
            j.f fVar = new j.f();
            fVar.m(str2);
            eVar2.o(str).n(str2).j(true).B(uri).C(fVar).m(pendingIntent).A(R.mipmap.ic_launcher);
            notificationC = eVar2.c();
        }
        notificationManager.notify(234231, notificationC);
    }
}

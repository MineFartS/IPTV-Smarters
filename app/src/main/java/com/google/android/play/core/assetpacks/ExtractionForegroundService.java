package com.google.android.play.core.assetpacks;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import c.f.a.e.a.b.h2;
import c.f.a.e.a.b.j1;
import c.f.a.e.a.e.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;

/* JADX INFO: loaded from: classes2.dex */
public class ExtractionForegroundService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24647b = new a("ExtractionForegroundService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f24648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h2 f24649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NotificationManager f24650e;

    public final synchronized void a(Intent intent) {
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 1L);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i2 >= 26 ? new Notification.Builder(this.f24648c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra) : new Notification.Builder(this.f24648c).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false).setContentTitle(stringExtra).setSubText(stringExtra2);
        if (i2 >= 21) {
            timeoutAfter.setColor(intent.getIntExtra("notification_color", 0)).setVisibility(-1);
        }
        Notification notificationBuild = timeoutAfter.build();
        this.f24647b.d("Starting foreground installation service.", new Object[0]);
        this.f24649d.a(true);
        if (i2 >= 26) {
            c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, notificationBuild);
    }

    public final synchronized void b() {
        this.f24647b.d("Stopping service.", new Object[0]);
        this.f24649d.a(false);
        stopForeground(true);
        stopSelf();
    }

    @TargetApi(26)
    public final synchronized void c(String str) {
        this.f24650e.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        j1.h(getApplicationContext()).a(this);
        this.f24650e = (NotificationManager) this.f24648c.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 1) {
            a(intent);
        } else if (intExtra == 2) {
            b();
        } else {
            this.f24647b.b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}

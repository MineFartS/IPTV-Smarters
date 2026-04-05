package c.f.a.b.j3;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class g0 {
    public static void a(Context context, String str, int i2, int i3, int i4) {
        if (x0.f9296a >= 26) {
            NotificationManager notificationManager = (NotificationManager) g.e((NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i2), i4);
            if (i3 != 0) {
                notificationChannel.setDescription(context.getString(i3));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void b(Context context, int i2, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) g.e((NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
        if (notification != null) {
            notificationManager.notify(i2, notification);
        } else {
            notificationManager.cancel(i2);
        }
    }
}

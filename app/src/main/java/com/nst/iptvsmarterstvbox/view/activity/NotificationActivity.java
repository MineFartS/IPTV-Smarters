package minefarts.iptvsmarters.view.activity;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f26008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26009c = "CANCELLED";

    public static PendingIntent a(int i2, Context context) {
        Intent intent = new Intent(context, (Class<?>) NotificationActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("NOTIFICATION_ID", i2);
        return PendingIntent.getActivity(context, 0, intent, 268435456);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f26008b = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putBoolean("CANCELLED", true);
        editorEdit.apply();
        notificationManager.cancel(getIntent().getIntExtra("NOTIFICATION_ID", -1));
        finish();
    }
}

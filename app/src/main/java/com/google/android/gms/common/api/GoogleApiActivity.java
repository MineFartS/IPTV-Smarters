package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.b;
import c.f.a.c.f.e;
import c.f.a.c.f.o.n.g;
import c.f.a.c.f.q.o;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24227b = 0;

    @RecentlyNonNull
    public static Intent a(@RecentlyNonNull Context context, @RecentlyNonNull PendingIntent pendingIntent, int i2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    public final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            e.n().o(this, ((Integer) o.i(num)).intValue(), 2, this);
            this.f24227b = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f24227b = 1;
        } catch (ActivityNotFoundException e2) {
            if (extras.getBoolean("notify_manager", true)) {
                g.m(this).A(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strValueOf = String.valueOf(pendingIntent);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(strValueOf);
                sb.append(InstructionFileId.DOT);
                String string = sb.toString();
                if (Build.FINGERPRINT.contains("generic")) {
                    string = String.valueOf(string).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", string, e2);
            }
            this.f24227b = 1;
            finish();
        } catch (IntentSender.SendIntentException e3) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, @RecentlyNonNull Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f24227b = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                g gVarM = g.m(this);
                if (i3 == -1) {
                    gVarM.s();
                } else if (i3 == 0) {
                    gVarM.A(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f24227b = 0;
            setResult(i3, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        this.f24227b = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f24227b = bundle.getInt("resolution");
        }
        if (this.f24227b != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putInt("resolution", this.f24227b);
        super.onSaveInstanceState(bundle);
    }
}

package pub.devrel.easypermissions;

import a.b.k.c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import n.a.a.b;

/* JADX INFO: loaded from: classes2.dex */
public class AppSettingsDialogHolderActivity extends c implements DialogInterface.OnClickListener {
    public static Intent y0(Context context, b bVar) {
        return new Intent(context, (Class<?>) AppSettingsDialogHolderActivity.class).putExtra("extra_app_settings", bVar);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        setResult(i3, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        setResult(0);
        finish();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b bVar = (b) getIntent().getParcelableExtra("extra_app_settings");
        bVar.c(this);
        bVar.b(this);
        bVar.d(this);
        bVar.f();
    }
}

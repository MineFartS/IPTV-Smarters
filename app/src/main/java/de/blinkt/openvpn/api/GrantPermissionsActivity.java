package de.blinkt.openvpn.api;

import android.app.Activity;
import android.content.Intent;
import android.net.VpnService;

/* JADX INFO: loaded from: classes2.dex */
public class GrantPermissionsActivity extends Activity {
    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        setResult(i3);
        finish();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Intent intentPrepare = VpnService.prepare(this);
        if (intentPrepare == null) {
            onActivityResult(0, -1, null);
        } else {
            startActivityForResult(intentPrepare, 0);
        }
    }
}

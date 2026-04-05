package c.f.a.e.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c.f.a.e.a.f.c<InstallState> {
    public a(Context context) {
        super(new c.f.a.e.a.e.a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // c.f.a.e.a.f.c
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f15744a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f15744a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f15744a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        c.f.a.e.a.e.a aVar = this.f15744a;
        aVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        aVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        aVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        InstallState installStateA = InstallState.a(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.f15744a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", installStateA);
        d(installStateA);
    }
}

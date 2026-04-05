package c.f.a.e.a.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends c.f.a.e.a.e.m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.e.a f15368b = new c.f.a.e.a.e.a("AssetPackExtractionService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f15370d;

    public b0(Context context, v vVar) {
        this.f15369c = context;
        this.f15370d = vVar;
    }

    public final synchronized void K1(Bundle bundle) {
        ComponentName componentNameStartForegroundService;
        Intent intent = new Intent(this.f15369c, (Class<?>) ExtractionForegroundService.class);
        int i2 = bundle.getInt("action_type");
        intent.putExtra("action_type", i2);
        if (i2 == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentNameStartForegroundService = Build.VERSION.SDK_INT >= 26 ? this.f15369c.startForegroundService(intent) : this.f15369c.startService(intent);
        } catch (IllegalStateException | SecurityException e2) {
            this.f15368b.c(e2, "Failed starting installation service.", new Object[0]);
            componentNameStartForegroundService = null;
        }
        if (componentNameStartForegroundService == null) {
            this.f15368b.b("Failed starting installation service.", new Object[0]);
        }
    }

    @Override // c.f.a.e.a.e.n0
    public final void L0(Bundle bundle, c.f.a.e.a.e.p0 p0Var) {
        this.f15368b.a("updateServiceState AIDL call", new Object[0]);
        if (!c.f.a.e.a.e.o.a(this.f15369c) || !c.f.a.e.a.e.o.b(this.f15369c)) {
            p0Var.K1(new Bundle());
        } else {
            K1(bundle);
            p0Var.l1(new Bundle(), new Bundle());
        }
    }

    @Override // c.f.a.e.a.e.n0
    public final void v(c.f.a.e.a.e.p0 p0Var) {
        this.f15368b.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!c.f.a.e.a.e.o.a(this.f15369c) || !c.f.a.e.a.e.o.b(this.f15369c)) {
            p0Var.K1(new Bundle());
        } else {
            this.f15370d.K();
            p0Var.n1(new Bundle());
        }
    }
}

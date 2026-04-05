package c.f.a.e.a.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends c.f.a.e.a.f.c<AssetPackState> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a1 f15594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f15595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s2> f15596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f15597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f15598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c.f.a.e.a.e.z<Executor> f15599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c.f.a.e.a.e.z<Executor> f15600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f15601n;

    public s(Context context, a1 a1Var, l0 l0Var, c.f.a.e.a.e.z<s2> zVar, o0 o0Var, e0 e0Var, c.f.a.e.a.e.z<Executor> zVar2, c.f.a.e.a.e.z<Executor> zVar3) {
        super(new c.f.a.e.a.e.a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f15601n = new Handler(Looper.getMainLooper());
        this.f15594g = a1Var;
        this.f15595h = l0Var;
        this.f15596i = zVar;
        this.f15598k = o0Var;
        this.f15597j = e0Var;
        this.f15599l = zVar2;
        this.f15600m = zVar3;
    }

    @Override // c.f.a.e.a.f.c
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f15744a.b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f15744a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateD = AssetPackState.d(bundleExtra, stringArrayList.get(0), this.f15598k, u.f15625b);
        this.f15744a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateD);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f15597j.a(pendingIntent);
        }
        this.f15600m.a().execute(new Runnable(this, bundleExtra, assetPackStateD) { // from class: c.f.a.e.a.b.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final s f15577b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Bundle f15578c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final AssetPackState f15579d;

            {
                this.f15577b = this;
                this.f15578c = bundleExtra;
                this.f15579d = assetPackStateD;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f15577b.h(this.f15578c, this.f15579d);
            }
        });
        this.f15599l.a().execute(new Runnable(this, bundleExtra) { // from class: c.f.a.e.a.b.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final s f15586b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Bundle f15587c;

            {
                this.f15586b = this;
                this.f15587c = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f15586b.g(this.f15587c);
            }
        });
    }

    public final void f(final AssetPackState assetPackState) {
        this.f15601n.post(new Runnable(this, assetPackState) { // from class: c.f.a.e.a.b.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final s f15571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AssetPackState f15572c;

            {
                this.f15571b = this;
                this.f15572c = assetPackState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f15571b.d(this.f15572c);
            }
        });
    }

    public final /* synthetic */ void g(Bundle bundle) {
        if (this.f15594g.d(bundle)) {
            this.f15595h.a();
        }
    }

    public final /* synthetic */ void h(Bundle bundle, AssetPackState assetPackState) {
        if (this.f15594g.e(bundle)) {
            f(assetPackState);
            this.f15596i.a().j();
        }
    }
}

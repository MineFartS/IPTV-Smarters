package c.c.a.a;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f5091b;

    public b0(Context context, i iVar) {
        this.f5090a = context;
        this.f5091b = new a0(this, iVar, null);
    }

    public final i b() {
        return this.f5091b.f5087a;
    }

    public final void c() {
        this.f5091b.c(this.f5090a);
    }

    public final void d() {
        this.f5091b.b(this.f5090a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}

package c.f.a.c.j.h;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f13602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f13603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f13604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d0 d0Var, Bundle bundle, Activity activity) {
        super(d0Var.f13254b, true);
        this.f13604h = d0Var;
        this.f13602f = bundle;
        this.f13603g = activity;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        Bundle bundle;
        if (this.f13602f != null) {
            bundle = new Bundle();
            if (this.f13602f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f13602f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        this.f13604h.f13254b.f13299k.onActivityCreated(c.f.a.c.g.b.K2(this.f13603g), bundle, this.f13573c);
    }
}

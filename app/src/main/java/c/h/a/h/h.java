package c.h.a.h;

import android.app.Activity;
import android.os.Handler;
import mbanje.kurt.fabbutton.FabButton;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FabButton f16903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f16904d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16901a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f16902b = new Handler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16905e = false;

    public h(FabButton fabButton, Activity activity) {
        this.f16903c = fabButton;
        this.f16904d = activity;
    }

    public boolean a() {
        return this.f16905e;
    }

    public void b() {
        this.f16903c.d(true);
        this.f16905e = true;
    }

    public void c() {
        this.f16903c.d(false);
        this.f16905e = false;
    }
}

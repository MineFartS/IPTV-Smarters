package c.f.a.c.f.q;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f12553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f12554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12555d;

    public c0(Intent intent, Activity activity, int i2) {
        this.f12553b = intent;
        this.f12554c = activity;
        this.f12555d = i2;
    }

    @Override // c.f.a.c.f.q.e0
    public final void a() {
        Intent intent = this.f12553b;
        if (intent != null) {
            this.f12554c.startActivityForResult(intent, this.f12555d);
        }
    }
}

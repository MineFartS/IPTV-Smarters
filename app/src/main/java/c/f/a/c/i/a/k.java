package c.f.a.c.i.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Callable<SharedPreferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12749a;

    public k(Context context) {
        this.f12749a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() {
        return this.f12749a.getSharedPreferences("google_sdk_flags", 0);
    }
}

package c.f.a.c.i.a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Callable<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f12736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f12738c;

    public c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f12736a = sharedPreferences;
        this.f12737b = str;
        this.f12738c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.f12736a.getBoolean(this.f12737b, this.f12738c.booleanValue()));
    }
}

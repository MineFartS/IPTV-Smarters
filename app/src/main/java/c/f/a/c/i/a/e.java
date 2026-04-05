package c.f.a.c.i.a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Callable<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f12739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f12741c;

    public e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f12739a = sharedPreferences;
        this.f12740b = str;
        this.f12741c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() {
        return Integer.valueOf(this.f12739a.getInt(this.f12740b, this.f12741c.intValue()));
    }
}

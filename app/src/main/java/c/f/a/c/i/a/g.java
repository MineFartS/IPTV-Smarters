package c.f.a.c.i.a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Callable<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f12742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f12744c;

    public g(SharedPreferences sharedPreferences, String str, Long l2) {
        this.f12742a = sharedPreferences;
        this.f12743b = str;
        this.f12744c = l2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        return Long.valueOf(this.f12742a.getLong(this.f12743b, this.f12744c.longValue()));
    }
}

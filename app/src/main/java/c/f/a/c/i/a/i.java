package c.f.a.c.i.a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f12745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12747c;

    public i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f12745a = sharedPreferences;
        this.f12746b = str;
        this.f12747c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f12745a.getString(this.f12746b, this.f12747c);
    }
}

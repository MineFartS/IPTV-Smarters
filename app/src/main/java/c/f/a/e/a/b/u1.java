package c.f.a.e.a.b;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15629a = new c.f.a.e.a.e.a("PackageStateCache");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15631c = -1;

    public u1(Context context) {
        this.f15630b = context;
    }

    public final synchronized int a() {
        if (this.f15631c == -1) {
            try {
                this.f15631c = this.f15630b.getPackageManager().getPackageInfo(this.f15630b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f15629a.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f15631c;
    }
}

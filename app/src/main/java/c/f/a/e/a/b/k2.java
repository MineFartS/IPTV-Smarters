package c.f.a.e.a.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15507a;

    public k2(Context context) {
        this.f15507a = context;
    }

    public static String b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Context a() {
        return this.f15507a;
    }
}

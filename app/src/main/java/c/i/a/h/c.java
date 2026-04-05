package c.i.a.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    @SuppressLint({"DefaultLocale"})
    public static String a(float f2) {
        return String.format("%d:%02d", Integer.valueOf((int) (f2 / 60.0f)), Integer.valueOf((int) (f2 % 60.0f)));
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}

package a.i.n;

import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static d a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? d.d(configuration.getLocales()) : d.a(configuration.locale);
    }
}

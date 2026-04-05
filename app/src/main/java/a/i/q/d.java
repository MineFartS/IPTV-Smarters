package a.i.q;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static boolean a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? c.a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        int i2 = Build.VERSION.SDK_INT;
        return Arrays.hashCode(objArr);
    }

    public static String c(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}

package c.f.a.c.k.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class m7 {
    @Deprecated
    public static String a(Context context, String str) {
        try {
            return new c.f.a.c.f.q.r(context).a("google_app_id");
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String b(Context context, String str, String str2) {
        c.f.a.c.f.q.o.i(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = v4.a(context);
        }
        return v4.b("google_app_id", resources, str2);
    }

    public static String c(String str, String[] strArr, String[] strArr2) {
        c.f.a.c.f.q.o.i(strArr);
        c.f.a.c.f.q.o.i(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i2];
            }
        }
        return null;
    }
}

package c.f.a.e.a.e;

import java.io.File;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String name = file.getName();
        String str = BuildConfig.FLAVOR;
        String strReplaceFirst = name.replaceFirst("(_\\d+)?\\.apk", BuildConfig.FLAVOR);
        if (strReplaceFirst.equals("base-master")) {
            return BuildConfig.FLAVOR;
        }
        String str2 = "base-";
        if (strReplaceFirst.startsWith("base-")) {
            str = "config.";
        } else {
            strReplaceFirst = strReplaceFirst.replace("-", ".config.");
            str2 = ".config.master";
        }
        return strReplaceFirst.replace(str2, str);
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> void c(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }
}

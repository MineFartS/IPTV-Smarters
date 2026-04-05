package org.joda.time;

import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes2.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(long j2, String str) {
        super(createMessage(j2, str));
    }

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j2, String str) {
        String str2;
        String strPrint = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j2));
        if (str != null) {
            str2 = " (" + str + ")";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + strPrint + str2;
    }

    public static boolean isIllegalInstant(Throwable th) {
        if (th instanceof IllegalInstantException) {
            return true;
        }
        if (th.getCause() == null || th.getCause() == th) {
            return false;
        }
        return isIllegalInstant(th.getCause());
    }
}

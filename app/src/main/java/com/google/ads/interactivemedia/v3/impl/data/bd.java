package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ark;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@ark(a = aa.class)
public abstract class bd {
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    private static bd create(String str, String str2, String str3, int i2) {
        return new aa(str, str2, str3, i2);
    }

    public static bd forError(String str, int i2) {
        return create(str, BuildConfig.FLAVOR, "unknown", i2);
    }

    public static bd forResponse(String str, String str2) {
        return forResponse(str, str2, "unknown");
    }

    public static bd forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();
}

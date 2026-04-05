package c.f.a.c.j.h;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Map<String, String>> f13411a;

    public l3(Map<String, Map<String, String>> map) {
        this.f13411a = map;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map<String, String> map = this.f13411a.get(uri.toString());
        if (map == null) {
            return null;
        }
        String strValueOf = String.valueOf(str3);
        return map.get(strValueOf.length() != 0 ? BuildConfig.FLAVOR.concat(strValueOf) : new String(BuildConfig.FLAVOR));
    }
}

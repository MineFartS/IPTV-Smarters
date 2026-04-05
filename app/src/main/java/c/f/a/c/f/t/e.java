package c.f.a.c.f.t;

import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    @RecentlyNonNull
    @Deprecated
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> List<T> b(@RecentlyNonNull T t) {
        return Collections.singletonList(t);
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> List<T> c(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : b(tArr[0]) : a();
    }
}

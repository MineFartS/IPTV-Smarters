package c.f.b.a;

import java.util.logging.Logger;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f15791a = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f15792b = a();

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b implements i {
        public b() {
        }
    }

    public static i a() {
        return new b();
    }

    public static String b(@NullableDecl String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }
}

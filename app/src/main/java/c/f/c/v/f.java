package c.f.c.v;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class f {
    public static f a(String str, String str2) {
        return new a(str, str2);
    }

    @Nonnull
    public abstract String b();

    @Nonnull
    public abstract String c();
}

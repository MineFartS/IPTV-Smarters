package c.f.a.a.i.f;

import c.f.a.a.i.f.e;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class k {

    @AutoValue.Builder
    public static abstract class a {
        public abstract k a();

        public abstract a b(c.f.a.a.i.f.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i2) {
            this.value = i2;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract c.f.a.a.i.f.a b();

    public abstract b c();
}

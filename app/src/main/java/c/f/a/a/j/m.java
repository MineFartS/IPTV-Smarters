package c.f.a.a.j;

import android.util.Base64;
import c.f.a.a.j.c;
import com.google.auto.value.AutoValue;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class m {

    @AutoValue.Builder
    public static abstract class a {
        public abstract m a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(c.f.a.a.d dVar);
    }

    public static a a() {
        return new c.b().d(c.f.a.a.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract c.f.a.a.d d();

    public m e(c.f.a.a.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}

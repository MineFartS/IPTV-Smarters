package c.f.a.a.j.y.k;

import c.f.a.a.j.y.k.a;
import com.amazonaws.services.s3.internal.Constants;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6341a = a().f(10485760).d(200).b(Constants.MAXIMUM_UPLOAD_PARTS).c(604800000).e(81920).a();

    @AutoValue.Builder
    public static abstract class a {
        public abstract d a();

        public abstract a b(int i2);

        public abstract a c(long j2);

        public abstract a d(int i2);

        public abstract a e(int i2);

        public abstract a f(long j2);
    }

    public static a a() {
        return new a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}

package c.f.a.b;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class w1 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10310c;

    public w1(String str, Throwable th, boolean z, int i2) {
        super(str, th);
        this.f10309b = z;
        this.f10310c = i2;
    }

    public static w1 a(String str, Throwable th) {
        return new w1(str, th, true, 1);
    }

    public static w1 b(String str, Throwable th) {
        return new w1(str, th, true, 0);
    }

    public static w1 c(String str, Throwable th) {
        return new w1(str, th, true, 4);
    }

    public static w1 d(String str, Throwable th) {
        return new w1(str, th, false, 4);
    }

    public static w1 e(String str) {
        return new w1(str, null, false, 1);
    }
}

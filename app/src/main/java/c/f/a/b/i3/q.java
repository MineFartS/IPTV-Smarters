package c.f.a.b.i3;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class q extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9054b;

    public q(int i2) {
        this.f9054b = i2;
    }

    public q(String str, int i2) {
        super(str);
        this.f9054b = i2;
    }

    public q(String str, Throwable th, int i2) {
        super(str, th);
        this.f9054b = i2;
    }

    public q(Throwable th, int i2) {
        super(th);
        this.f9054b = i2;
    }
}

package pl.droidsonroids.gif;

import java.io.IOException;
import m.a.a.c;

/* JADX INFO: loaded from: classes2.dex */
public class GifIOException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f31375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31376c;

    public GifIOException(int i2, String str) {
        this.f31375b = c.fromCode(i2);
        this.f31376c = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f31376c == null) {
            return this.f31375b.getFormattedDescription();
        }
        return this.f31375b.getFormattedDescription() + ": " + this.f31376c;
    }
}

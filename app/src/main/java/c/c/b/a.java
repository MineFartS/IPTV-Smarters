package c.c.b;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class a extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f5182d;

    public a(k kVar) {
        super(kVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f5182d != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}

package c.c.a.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5180a;

    public /* synthetic */ x(w wVar) {
    }

    public final x a(String str) {
        this.f5180a = str;
        return this;
    }

    public final y b() {
        if (TextUtils.isEmpty(this.f5180a)) {
            throw new IllegalArgumentException("SKU must be set.");
        }
        return new y(this.f5180a, null, null);
    }
}

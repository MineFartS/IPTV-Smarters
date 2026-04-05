package a.s;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f3097a;

    public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strA = d.a(remoteUserInfo);
        if (strA == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f3097a = new d(remoteUserInfo);
    }

    public b(String str, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f3097a = Build.VERSION.SDK_INT >= 28 ? new d(str, i2, i3) : new e(str, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f3097a.equals(((b) obj).f3097a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3097a.hashCode();
    }
}

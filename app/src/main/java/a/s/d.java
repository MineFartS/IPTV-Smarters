package a.s;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaSessionManager.RemoteUserInfo f3098d;

    public d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f3098d = remoteUserInfo;
    }

    public d(String str, int i2, int i3) {
        super(str, i2, i3);
        this.f3098d = new MediaSessionManager.RemoteUserInfo(str, i2, i3);
    }

    public static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}

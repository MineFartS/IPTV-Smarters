package c.h.a.k.d.c.a;

import android.content.Context;
import android.content.pm.PackageManager;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.MediaPlayerProxy;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static long a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static void b(IMediaPlayer iMediaPlayer, int i2) {
        IjkMediaPlayer ijkMediaPlayerC = c(iMediaPlayer);
        if (ijkMediaPlayerC == null) {
            return;
        }
        ijkMediaPlayerC.deselectTrack(i2);
    }

    public static IjkMediaPlayer c(IMediaPlayer iMediaPlayer) {
        if (iMediaPlayer == null) {
            return null;
        }
        if (!(iMediaPlayer instanceof IjkMediaPlayer)) {
            if (!(iMediaPlayer instanceof MediaPlayerProxy)) {
                return null;
            }
            MediaPlayerProxy mediaPlayerProxy = (MediaPlayerProxy) iMediaPlayer;
            if (!(mediaPlayerProxy.getInternalMediaPlayer() instanceof IjkMediaPlayer)) {
                return null;
            }
            iMediaPlayer = mediaPlayerProxy.getInternalMediaPlayer();
        }
        return (IjkMediaPlayer) iMediaPlayer;
    }

    public static int d(IMediaPlayer iMediaPlayer, int i2) {
        IjkMediaPlayer ijkMediaPlayerC = c(iMediaPlayer);
        if (ijkMediaPlayerC == null) {
            return -1;
        }
        return ijkMediaPlayerC.getSelectedTrack(i2);
    }

    public static void e(IMediaPlayer iMediaPlayer, int i2) {
        IjkMediaPlayer ijkMediaPlayerC = c(iMediaPlayer);
        if (ijkMediaPlayerC == null) {
            return;
        }
        ijkMediaPlayerC.selectTrack(i2);
    }
}

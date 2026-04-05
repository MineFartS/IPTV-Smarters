package c.h.a.k.d.b;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static IMediaPlayer f17828b;

    public static IMediaPlayer a() {
        return f17828b;
    }

    public static void b(Context context) {
        context.startService(c(context));
    }

    public static Intent c(Context context) {
        return new Intent(context, (Class<?>) a.class);
    }

    public static void d(IMediaPlayer iMediaPlayer) {
        IMediaPlayer iMediaPlayer2 = f17828b;
        if (iMediaPlayer2 != null && iMediaPlayer2 != iMediaPlayer) {
            if (iMediaPlayer2.isPlaying()) {
                f17828b.stop();
            }
            f17828b.release();
            f17828b = null;
        }
        f17828b = iMediaPlayer;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }
}

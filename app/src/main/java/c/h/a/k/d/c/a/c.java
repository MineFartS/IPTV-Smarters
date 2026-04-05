package c.h.a.k.d.c.a;

import android.view.SurfaceHolder;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public interface a {
        void a(b bVar, int i2, int i3, int i4);

        void b(b bVar, int i2, int i3);

        void c(b bVar);
    }

    public interface b {
        c a();

        void b(IMediaPlayer iMediaPlayer);

        SurfaceHolder c();
    }

    void a(int i2, int i3);

    void b(int i2, int i3);

    boolean c();

    void d(a aVar);

    void e(a aVar);

    View getView();

    void setAspectRatio(int i2);

    void setVideoRotation(int i2);
}

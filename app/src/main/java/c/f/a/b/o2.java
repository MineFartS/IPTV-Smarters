package c.f.a.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f9630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f9631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f9632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f9633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9636h;

    public interface b {
        void J(int i2, boolean z);

        void n(int i2);
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = o2.this.f9630b;
            final o2 o2Var = o2.this;
            handler.post(new Runnable() { // from class: c.f.a.b.l0
                @Override // java.lang.Runnable
                public final void run() {
                    o2Var.i();
                }
            });
        }
    }

    public o2(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f9629a = applicationContext;
        this.f9630b = handler;
        this.f9631c = bVar;
        AudioManager audioManager = (AudioManager) c.f.a.b.j3.g.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f9632d = audioManager;
        this.f9634f = 3;
        this.f9635g = f(audioManager, 3);
        this.f9636h = e(audioManager, this.f9634f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f9633e = cVar;
        } catch (RuntimeException e2) {
            c.f.a.b.j3.z.j("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    public static boolean e(AudioManager audioManager, int i2) {
        return c.f.a.b.j3.x0.f9296a >= 23 ? audioManager.isStreamMute(i2) : f(audioManager, i2) == 0;
    }

    public static int f(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            c.f.a.b.j3.z.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i2, e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public int c() {
        return this.f9632d.getStreamMaxVolume(this.f9634f);
    }

    public int d() {
        if (c.f.a.b.j3.x0.f9296a >= 28) {
            return this.f9632d.getStreamMinVolume(this.f9634f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f9633e;
        if (cVar != null) {
            try {
                this.f9629a.unregisterReceiver(cVar);
            } catch (RuntimeException e2) {
                c.f.a.b.j3.z.j("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.f9633e = null;
        }
    }

    public void h(int i2) {
        if (this.f9634f == i2) {
            return;
        }
        this.f9634f = i2;
        i();
        this.f9631c.n(i2);
    }

    public final void i() {
        int iF = f(this.f9632d, this.f9634f);
        boolean zE = e(this.f9632d, this.f9634f);
        if (this.f9635g == iF && this.f9636h == zE) {
            return;
        }
        this.f9635g = iF;
        this.f9636h = zE;
        this.f9631c.J(iF, zE);
    }
}

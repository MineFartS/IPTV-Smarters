package c.f.a.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9766c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f9767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f9768c;

        public a(Handler handler, b bVar) {
            this.f9768c = handler;
            this.f9767b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f9768c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (r0.this.f9766c) {
                this.f9767b.o();
            }
        }
    }

    public interface b {
        void o();
    }

    public r0(Context context, Handler handler, b bVar) {
        this.f9764a = context.getApplicationContext();
        this.f9765b = new a(handler, bVar);
    }

    public void b(boolean z) {
        boolean z2;
        if (z && !this.f9766c) {
            this.f9764a.registerReceiver(this.f9765b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z2 = true;
        } else {
            if (z || !this.f9766c) {
                return;
            }
            this.f9764a.unregisterReceiver(this.f9765b);
            z2 = false;
        }
        this.f9766c = z2;
    }
}

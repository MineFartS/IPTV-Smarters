package c.f.a.c.d.u.u.m;

import android.os.Looper;
import c.f.a.c.d.u.u.i;
import c.f.a.c.j.c.w0;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f12104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f12105c;

    public e(a aVar, i iVar) {
        this.f12105c = aVar;
        this.f12104b = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        new w0(Looper.getMainLooper()).post(new g(this));
    }
}

package c.i.a.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f18131a;

    /* JADX INFO: loaded from: classes.dex */
    public interface a {
        void c();

        void g();
    }

    public b(a aVar) {
        this.f18131a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (c.b(context)) {
            this.f18131a.c();
        } else {
            this.f18131a.g();
        }
    }
}

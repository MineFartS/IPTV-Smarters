package c.f.a.c.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"HandlerLeak"})
public final class v extends c.f.a.c.j.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f12726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f12726b = eVar;
        this.f12725a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i2);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int iG = this.f12726b.g(this.f12725a);
        if (this.f12726b.j(iG)) {
            this.f12726b.p(this.f12725a, iG);
        }
    }
}

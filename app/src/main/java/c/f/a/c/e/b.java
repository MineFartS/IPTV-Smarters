package c.f.a.c.e;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f12239a = c.f.a.c.j.d.a.a().b(new c.f.a.c.f.t.q.a("firebase-iid-executor"), c.f.a.c.j.d.f.f13167a);

    public Executor a() {
        return this.f12239a;
    }

    public abstract int b(Context context, a aVar);

    public abstract void c(Context context, Bundle bundle);

    public abstract void d(Context context, Bundle bundle);

    public final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            d(context, extras);
            return -1;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public final /* synthetic */ void f(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int iE = intent2 != null ? e(context, intent2) : g(context, intent);
            if (z) {
                pendingResult.setResultCode(iE);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final int g(Context context, Intent intent) {
        c.f.a.c.o.i<Void> iVarD;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            iVarD = c.f.a.c.o.l.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            iVarD = i.c(context).d(2, bundle);
        }
        int iB = b(context, new a(intent));
        try {
            c.f.a.c.o.l.b(iVarD, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(strValueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return iB;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync) { // from class: c.f.a.c.e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f12258b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Intent f12259c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Context f12260d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f12261e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final BroadcastReceiver.PendingResult f12262f;

            {
                this.f12258b = this;
                this.f12259c = intent;
                this.f12260d = context;
                this.f12261e = zIsOrderedBroadcast;
                this.f12262f = pendingResultGoAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12258b.f(this.f12259c, this.f12260d, this.f12261e, this.f12262f);
            }
        });
    }
}

package c.f.a.a.j.y.j;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.y.k.c f6256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlarmManager f6257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f6258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6259e;

    public a(Context context, c.f.a.a.j.y.k.c cVar, AlarmManager alarmManager, c.f.a.a.j.a0.a aVar, g gVar) {
        this.f6255a = context;
        this.f6256b = cVar;
        this.f6257c = alarmManager;
        this.f6259e = aVar;
        this.f6258d = gVar;
    }

    public a(Context context, c.f.a.a.j.y.k.c cVar, c.f.a.a.j.a0.a aVar, g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    @Override // c.f.a.a.j.y.j.s
    public void a(c.f.a.a.j.m mVar, int i2) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", mVar.b());
        builder.appendQueryParameter("priority", String.valueOf(c.f.a.a.j.b0.a.a(mVar.d())));
        if (mVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(mVar.c(), 0));
        }
        Intent intent = new Intent(this.f6255a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (b(intent)) {
            c.f.a.a.j.w.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long jM0 = this.f6256b.m0(mVar);
        long jG = this.f6258d.g(mVar.d(), jM0, i2);
        c.f.a.a.j.w.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", mVar, Long.valueOf(jG), Long.valueOf(jM0), Integer.valueOf(i2));
        this.f6257c.set(3, this.f6259e.a() + jG, PendingIntent.getBroadcast(this.f6255a, 0, intent, 0));
    }

    public boolean b(Intent intent) {
        return PendingIntent.getBroadcast(this.f6255a, 0, intent, 536870912) != null;
    }
}

package c.f.a.c.k.b;

import android.content.Context;
import android.os.Bundle;
import c.f.a.c.j.h.yd;

/* JADX INFO: loaded from: classes2.dex */
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f13871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yd f13873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f13875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13876j;

    public f6(Context context, yd ydVar, Long l2) {
        this.f13874h = true;
        c.f.a.c.f.q.o.i(context);
        Context applicationContext = context.getApplicationContext();
        c.f.a.c.f.q.o.i(applicationContext);
        this.f13867a = applicationContext;
        this.f13875i = l2;
        if (ydVar != null) {
            this.f13873g = ydVar;
            this.f13868b = ydVar.f13678g;
            this.f13869c = ydVar.f13677f;
            this.f13870d = ydVar.f13676e;
            this.f13874h = ydVar.f13675d;
            this.f13872f = ydVar.f13674c;
            this.f13876j = ydVar.f13680i;
            Bundle bundle = ydVar.f13679h;
            if (bundle != null) {
                this.f13871e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final ay f20711a = new ay();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f20713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bd f20716f;

    private ay() {
    }

    public static ay a() {
        return f20711a;
    }

    public static /* synthetic */ void b(ay ayVar, boolean z) {
        if (ayVar.f20715e != z) {
            ayVar.f20715e = z;
            if (ayVar.f20714d) {
                ayVar.h();
                if (ayVar.f20716f != null) {
                    if (ayVar.f()) {
                        bw.d().i();
                    } else {
                        bw.d().h();
                    }
                }
            }
        }
    }

    private final void h() {
        boolean z = this.f20715e;
        Iterator<ap> it = aw.a().c().iterator();
        while (it.hasNext()) {
            bj bjVarH = it.next().h();
            if (bjVarH.k()) {
                bc.a().b(bjVarH.a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void c(Context context) {
        this.f20712b = context.getApplicationContext();
    }

    public final void d() {
        this.f20713c = new ax(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f20712b.registerReceiver(this.f20713c, intentFilter);
        this.f20714d = true;
        h();
    }

    public final void e() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f20712b;
        if (context != null && (broadcastReceiver = this.f20713c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f20713c = null;
        }
        this.f20714d = false;
        this.f20715e = false;
        this.f20716f = null;
    }

    public final boolean f() {
        return !this.f20715e;
    }

    public final void g(bd bdVar) {
        this.f20716f = bdVar;
    }
}

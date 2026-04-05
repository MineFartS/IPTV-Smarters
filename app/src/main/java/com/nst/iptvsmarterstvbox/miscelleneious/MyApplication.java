package com.nst.iptvsmarterstvbox.miscelleneious;

import a.u.a;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class MyApplication extends Application {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f24929b;

    public static Context a() {
        return f24929b;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a.l(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f24929b = getApplicationContext();
    }
}

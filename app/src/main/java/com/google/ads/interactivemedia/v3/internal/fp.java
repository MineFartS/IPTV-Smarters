package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public final class fp extends AsyncTask<Void, Void, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f21804b;

    public fp(String str, Context context) {
        this.f21803a = str;
        this.f21804b = context;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f21803a));
        if (!(this.f21804b instanceof Activity)) {
            intent.setFlags(268435456);
        }
        this.f21804b.startActivity(intent);
        return null;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class by extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bz f21529a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final br f21530d;

    public by(br brVar) {
        this.f21530d = brVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        bz bzVar = this.f21529a;
        if (bzVar != null) {
            bzVar.b();
        }
    }

    public final void b(bz bzVar) {
        this.f21529a = bzVar;
    }
}

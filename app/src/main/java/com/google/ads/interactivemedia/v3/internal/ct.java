package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ct extends AsyncTask<Void, Void, cr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cu f21573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StreamRequest f21574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21575c;

    public ct(cu cuVar, StreamRequest streamRequest, String str) {
        this.f21573a = cuVar;
        this.f21574b = streamRequest;
        this.f21575c = str;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ cr doInBackground(Void[] voidArr) {
        cu cuVar;
        ant antVar;
        this.f21573a.q();
        try {
            cuVar = this.f21573a;
            antVar = cuVar.f21576a;
        } catch (RemoteException unused) {
        }
        String strB = antVar != null ? antVar.b(cuVar.f21577b) : BuildConfig.FLAVOR;
        return new cr(new fo(this.f21573a.f21577b), strB, cu.i(this.f21573a));
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(cr crVar) {
        cr crVar2 = crVar;
        dw dwVar = new dw(du.adsLoader, dv.requestStream, this.f21575c, com.google.ads.interactivemedia.v3.impl.data.ay.createFromStreamRequest(this.f21574b, String.format("android%s:%s:%s", Build.VERSION.RELEASE, "3.24.0", this.f21573a.f21577b.getPackageName()), crVar2.f21570a, cu.l(this.f21573a), this.f21573a.f21585j, cu.e(this.f21573a), ly.c(this.f21573a.f21577b, this.f21573a.f21586k), crVar2.f21572c, crVar2.f21571b, this.f21573a.f21587l));
        this.f21573a.f21578c.i(crVar2.f21571b);
        this.f21573a.f21578c.o(dwVar);
    }
}

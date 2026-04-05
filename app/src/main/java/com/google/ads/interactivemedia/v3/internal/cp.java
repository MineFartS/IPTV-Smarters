package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.api.AdsRequest;

/* JADX INFO: loaded from: classes.dex */
public final class cp extends AsyncTask<String, Void, cq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cu f21564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdsRequest f21565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21566c;

    public cp(cu cuVar, AdsRequest adsRequest, String str) {
        this.f21564a = cuVar;
        this.f21565b = adsRequest;
        this.f21566c = str;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ cq doInBackground(String[] strArr) {
        String string = strArr[0];
        this.f21564a.q();
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                ant antVar = this.f21564a.f21576a;
                if (antVar != null && antVar.c(uri)) {
                    cu cuVar = this.f21564a;
                    string = cuVar.f21576a.a(uri, cuVar.f21577b).toString();
                }
            } catch (RemoteException | anz | IllegalStateException unused) {
            }
        }
        return new cq(new fo(this.f21564a.f21577b), string, cu.i(this.f21564a));
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(cq cqVar) {
        cq cqVar2 = cqVar;
        this.f21565b.setAdTagUrl(cqVar2.f21567a);
        dw dwVar = new dw(du.adsLoader, dv.requestAds, this.f21566c, com.google.ads.interactivemedia.v3.impl.data.ay.create(this.f21565b, String.format("android%s:%s:%s", Build.VERSION.RELEASE, "3.24.0", this.f21564a.f21577b.getPackageName()), cqVar2.f21568b, cu.l(this.f21564a), this.f21564a.f21585j, cu.e(this.f21564a), ly.c(this.f21564a.f21577b, this.f21564a.f21586k), cqVar2.f21569c, this.f21564a.f21588m));
        this.f21564a.f21578c.i(cqVar2.f21569c);
        this.f21564a.f21578c.o(dwVar);
    }
}

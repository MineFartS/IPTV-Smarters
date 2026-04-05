package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class dq extends AsyncTask<Void, Void, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f21665a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ds f21666b;

    public dq(ds dsVar) {
        this.f21666b = dsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
        try {
            ds dsVar = this.f21666b;
            return dsVar.a(dsVar.f21669a.src());
        } catch (IOException e2) {
            this.f21665a = e2;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            ds.c(this.f21666b);
            this.f21666b.setImageBitmap(bitmap2);
            return;
        }
        String strSrc = this.f21666b.f21669a.src();
        String strValueOf = String.valueOf(this.f21665a);
        StringBuilder sb = new StringBuilder(String.valueOf(strSrc).length() + 33 + strValueOf.length());
        sb.append("Loading image companion ");
        sb.append(strSrc);
        sb.append(" failed: ");
        sb.append(strValueOf);
        Log.e("IMASDK", sb.toString());
    }
}

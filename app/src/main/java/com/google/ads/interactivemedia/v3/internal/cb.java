package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cb extends bx {
    public cb(br brVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(brVar, hashSet, jSONObject, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.by
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        aw awVarA = aw.a();
        if (awVarA != null) {
            for (ap apVar : awVarA.c()) {
                if (((bx) this).f21526a.contains(apVar.i())) {
                    apVar.h().d(str, this.f21528c);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        return this.f21527b.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.by, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}

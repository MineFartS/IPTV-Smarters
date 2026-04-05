package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cc extends bx {
    public cc(br brVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(brVar, hashSet, jSONObject, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.by
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        aw awVarA;
        if (!TextUtils.isEmpty(str) && (awVarA = aw.a()) != null) {
            for (ap apVar : awVarA.c()) {
                if (((bx) this).f21526a.contains(apVar.i())) {
                    apVar.h().e(str, this.f21528c);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        if (bo.j(this.f21527b, this.f21530d.a())) {
            return null;
        }
        this.f21530d.e(this.f21527b);
        return this.f21527b.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.by, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}

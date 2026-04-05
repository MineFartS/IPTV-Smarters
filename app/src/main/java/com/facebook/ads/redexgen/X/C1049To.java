package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1049To implements LC {
    @Override // com.facebook.ads.redexgen.X.LC
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow() != null ? activity.getWindow().getCallback() : null;
        if (callback != null) {
            L9 l9 = new L9(callback, activity);
            L9.A00(new C1048Tn(this));
            activity.getWindow().setCallback(l9);
        }
    }
}

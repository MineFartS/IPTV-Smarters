package com.google.ads.interactivemedia.v3.impl.data;

import android.os.Build;
import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes.dex */
public abstract class bf {
    public abstract bf attached(boolean z);

    public abstract bf bounds(ar arVar);

    public abstract bg build();

    public abstract bf detailedReason(String str);

    public abstract bf hidden(boolean z);

    public abstract bf purpose(FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract bf type(String str);

    public bf view(View view) {
        return attached(Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : true).bounds(ar.builder().locationOnScreenOfView(view).build()).hidden(!view.isShown()).type(view.getClass().getCanonicalName());
    }
}

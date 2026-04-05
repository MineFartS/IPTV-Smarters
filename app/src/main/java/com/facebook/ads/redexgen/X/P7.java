package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface P7 {
    boolean A7g();

    boolean A7i();

    int getCurrentPositionInMillis();

    boolean getGlobalVisibleRect(Rect rect);

    long getInitialBufferTime();

    int getMeasuredHeight();

    int getMeasuredWidth();

    PD getVideoStartReason();

    @Nullable
    View getView();

    float getVolume();
}

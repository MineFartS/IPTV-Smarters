package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC0956Px {
    void A7J();

    boolean A7Q();

    boolean A7R();

    void ABa(boolean z, int i2);

    void ADH(int i2);

    void ADL(PD pd, int i2);

    void ADR(int i2);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    PD getStartReason();

    EnumC0958Pz getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i2);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f2);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(Q0 q0);

    void setup(Uri uri);
}

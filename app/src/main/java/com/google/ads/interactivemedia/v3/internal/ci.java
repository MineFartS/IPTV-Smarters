package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class ci extends df implements AdDisplayContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoAdPlayer f21548a;

    public ci(Context context, VideoAdPlayer videoAdPlayer) {
        this(new db(context), videoAdPlayer);
    }

    public ci(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        super(viewGroup);
        this.f21548a = videoAdPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdDisplayContainer
    public final VideoAdPlayer getPlayer() {
        return this.f21548a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdDisplayContainer
    public final void setPlayer(VideoAdPlayer videoAdPlayer) {
        ars.g(videoAdPlayer);
        this.f21548a = videoAdPlayer;
    }
}

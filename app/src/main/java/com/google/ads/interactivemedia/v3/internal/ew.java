package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class ew extends df implements StreamDisplayContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoStreamPlayer f21743a;

    public ew(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        super(viewGroup);
        this.f21743a = videoStreamPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamDisplayContainer
    public final VideoStreamPlayer getVideoStreamPlayer() {
        return this.f21743a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamDisplayContainer
    public final void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer) {
        ars.g(videoStreamPlayer);
        this.f21743a = videoStreamPlayer;
    }
}

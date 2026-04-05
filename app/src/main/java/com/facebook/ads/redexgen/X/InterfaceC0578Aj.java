package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC0578Aj {
    void onAudioSessionId(C0577Ai c0577Ai, int i2);

    void onAudioUnderrun(C0577Ai c0577Ai, int i2, long j2, long j3);

    void onDecoderDisabled(C0577Ai c0577Ai, int i2, BZ bz);

    void onDecoderEnabled(C0577Ai c0577Ai, int i2, BZ bz);

    void onDecoderInitialized(C0577Ai c0577Ai, int i2, String str, long j2);

    void onDecoderInputFormatChanged(C0577Ai c0577Ai, int i2, Format format);

    void onDownstreamFormatChanged(C0577Ai c0577Ai, FQ fq);

    void onDrmKeysLoaded(C0577Ai c0577Ai);

    void onDrmKeysRemoved(C0577Ai c0577Ai);

    void onDrmKeysRestored(C0577Ai c0577Ai);

    void onDrmSessionManagerError(C0577Ai c0577Ai, Exception exc);

    void onDroppedVideoFrames(C0577Ai c0577Ai, int i2, long j2);

    void onLoadError(C0577Ai c0577Ai, FP fp, FQ fq, IOException iOException, boolean z);

    void onLoadingChanged(C0577Ai c0577Ai, boolean z);

    void onMediaPeriodCreated(C0577Ai c0577Ai);

    void onMediaPeriodReleased(C0577Ai c0577Ai);

    void onMetadata(C0577Ai c0577Ai, Metadata metadata);

    void onPlaybackParametersChanged(C0577Ai c0577Ai, AK ak);

    void onPlayerError(C0577Ai c0577Ai, C05699z c05699z);

    void onPlayerStateChanged(C0577Ai c0577Ai, boolean z, int i2);

    void onPositionDiscontinuity(C0577Ai c0577Ai, int i2);

    void onReadingStarted(C0577Ai c0577Ai);

    void onRenderedFirstFrame(C0577Ai c0577Ai, Surface surface);

    void onSeekProcessed(C0577Ai c0577Ai);

    void onSeekStarted(C0577Ai c0577Ai);

    void onTimelineChanged(C0577Ai c0577Ai, int i2);

    void onTracksChanged(C0577Ai c0577Ai, TrackGroupArray trackGroupArray, HU hu);

    void onVideoSizeChanged(C0577Ai c0577Ai, int i2, int i3, int i4, float f2);
}

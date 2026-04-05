package com.facebook.ads.redexgen.X;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UC implements InterfaceC04806d {
    public final /* synthetic */ US A00;

    public UC(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() throws Exception {
        String strA07 = this.A00.A03.A07(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
        if (strA07 != null) {
            return this.A00.A09(strA07);
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}

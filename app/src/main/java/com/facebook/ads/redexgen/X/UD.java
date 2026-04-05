package com.facebook.ads.redexgen.X;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UD implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"hvm87xlnXDULJgpudJIAxjipYcLfVpPe", "aPn41y0iNcbQ3vA5A69njqeDstAsTpsV", "WXmwgMFdLW61FUxTxJC7XlBGpuRVL7Wu", "ePkGYIfh56SCQIxOGTOw2FZrMqM6oOvD", "H4G3VitdwZHOwCvFNAwNX1rKXwUNte3T", "QqBVensdyxYwCHnIBjshd9TsYmlVQcVc", "Npnx1Hqps9YG5SIKMksWN5UpsP86zlug", "K4PmfDIjqE3AfePNsovy4"};
    }

    public UD(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() throws Exception {
        String strA07 = this.A00.A03.A07(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
        if (strA07 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us = this.A00;
        if (A01[7].length() != 21) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "XG8OcIRWX82QEKbSmFw2M";
        strArr[7] = "XG8OcIRWX82QEKbSmFw2M";
        return us.A09(strA07);
    }
}

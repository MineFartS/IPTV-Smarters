package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Log;
import com.amazonaws.event.ProgressEvent;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class IjkMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final String TAG = "IjkMediaCodecInfo";
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank = 0;

    private static synchronized Map<String, Integer> getKnownCodecList() {
        Map<String, Integer> map = sKnownCodecList;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        sKnownCodecList = treeMap;
        treeMap.put("OMX.Nvidia.h264.decode", 800);
        sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", Integer.valueOf(RANK_SECURE));
        sKnownCodecList.put("OMX.Intel.hw_vd.h264", Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE));
        sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", 800);
        sKnownCodecList.put("OMX.qcom.video.decoder.avc", 800);
        sKnownCodecList.put("OMX.ittiam.video.decoder.avc", 0);
        sKnownCodecList.put("OMX.SEC.avc.dec", 800);
        sKnownCodecList.put("OMX.SEC.AVC.Decoder", 799);
        sKnownCodecList.put("OMX.SEC.avcdec", 798);
        sKnownCodecList.put("OMX.SEC.avc.sw.dec", 200);
        sKnownCodecList.put("OMX.Exynos.avc.dec", 800);
        sKnownCodecList.put("OMX.Exynos.AVC.Decoder", 799);
        sKnownCodecList.put("OMX.k3.video.decoder.avc", 800);
        sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", 800);
        sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", 800);
        sKnownCodecList.put("OMX.rk.video_decoder.avc", 800);
        sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", 800);
        sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 800);
        sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", 200);
        sKnownCodecList.remove("OMX.Action.Video.Decoder");
        sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
        sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
        sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
        sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
        sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
        sKnownCodecList.remove("OMX.duos.h264.decoder");
        sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
        sKnownCodecList.remove("OMX.hantro.G1.video.decoder");
        sKnownCodecList.remove("OMX.hisi.video.decoder");
        sKnownCodecList.remove("OMX.LG.decoder.video.avc");
        sKnownCodecList.remove("OMX.MS.AVC.Decoder");
        sKnownCodecList.remove("OMX.RENESAS.VIDEO.DECODER.H264");
        sKnownCodecList.remove("OMX.RTK.video.decoder");
        sKnownCodecList.remove("OMX.sprd.h264.decoder");
        sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
        sKnownCodecList.remove("OMX.vpu.video_decoder.avc");
        sKnownCodecList.remove("OMX.WMT.decoder.avc");
        sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
        sKnownCodecList.put("OMX.google.h264.decoder", 200);
        sKnownCodecList.put("OMX.google.h264.lc.decoder", 200);
        sKnownCodecList.put("OMX.k3.ffmpeg.decoder", 200);
        sKnownCodecList.put("OMX.ffmpeg.video.decoder", 200);
        sKnownCodecList.put("OMX.sprd.soft.h264.decoder", 200);
        return sKnownCodecList;
    }

    public static String getLevelName(int i2) {
        if (i2 == 1) {
            return "1";
        }
        if (i2 == 2) {
            return "1b";
        }
        switch (i2) {
            case 4:
                return "11";
            case 8:
                return "12";
            case 16:
                return "13";
            case 32:
                return "2";
            case 64:
                return "21";
            case 128:
                return "22";
            case 256:
                return "3";
            case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                return "31";
            case 1024:
                return "32";
            case 2048:
                return "4";
            case ProgressEvent.PART_FAILED_EVENT_CODE /* 4096 */:
                return "41";
            case 8192:
                return "42";
            case 16384:
                return "5";
            case 32768:
                return "51";
            case 65536:
                return "52";
            default:
                return "0";
        }
    }

    public static String getProfileLevelName(int i2, int i3) {
        return String.format(Locale.US, " %s Profile Level %s (%d,%d)", getProfileName(i2), getLevelName(i3), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String getProfileName(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? i2 != 16 ? i2 != 32 ? i2 != 64 ? "Unknown" : "High444" : "High422" : "High10" : "High" : "Extends" : "Main" : "Baseline";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tv.danmaku.ijk.media.player.IjkMediaCodecInfo setupCandidate(android.media.MediaCodecInfo r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L9c
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 >= r2) goto Lb
            goto L9c
        Lb:
            java.lang.String r2 = r6.getName()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L16
            return r0
        L16:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.toLowerCase(r0)
            java.lang.String r2 = "omx."
            boolean r2 = r0.startsWith(r2)
            r3 = 600(0x258, float:8.41E-43)
            r4 = 0
            r5 = 200(0xc8, float:2.8E-43)
            if (r2 != 0) goto L2d
            r3 = 100
            goto L91
        L2d:
            java.lang.String r2 = "omx.pv"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L38
        L35:
            r3 = 200(0xc8, float:2.8E-43)
            goto L91
        L38:
            java.lang.String r2 = "omx.google."
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L41
            goto L35
        L41:
            java.lang.String r2 = "omx.ffmpeg."
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L4a
            goto L35
        L4a:
            java.lang.String r2 = "omx.k3.ffmpeg."
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L53
            goto L35
        L53:
            java.lang.String r2 = "omx.avcodec."
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L5c
            goto L35
        L5c:
            java.lang.String r2 = "omx.ittiam."
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L66
        L64:
            r3 = 0
            goto L91
        L66:
            java.lang.String r2 = "omx.mtk."
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L76
            r0 = 18
            if (r1 >= r0) goto L73
            goto L64
        L73:
            r3 = 800(0x320, float:1.121E-42)
            goto L91
        L76:
            java.util.Map r1 = getKnownCodecList()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L87
            int r3 = r0.intValue()
            goto L91
        L87:
            android.media.MediaCodecInfo$CodecCapabilities r0 = r6.getCapabilitiesForType(r7)     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L91
            r0 = 700(0x2bc, float:9.81E-43)
            r3 = 700(0x2bc, float:9.81E-43)
        L91:
            tv.danmaku.ijk.media.player.IjkMediaCodecInfo r0 = new tv.danmaku.ijk.media.player.IjkMediaCodecInfo
            r0.<init>()
            r0.mCodecInfo = r6
            r0.mRank = r3
            r0.mMimeType = r7
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaCodecInfo.setupCandidate(android.media.MediaCodecInfo, java.lang.String):tv.danmaku.ijk.media.player.IjkMediaCodecInfo");
    }

    @TargetApi(16)
    public void dumpProfileLevels(String str) {
        int iMax;
        int iMax2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = this.mCodecInfo.getCapabilitiesForType(str);
            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                iMax = 0;
                iMax2 = 0;
            } else {
                iMax = 0;
                iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel != null) {
                        iMax = Math.max(iMax, codecProfileLevel.profile);
                        iMax2 = Math.max(iMax2, codecProfileLevel.level);
                    }
                }
            }
            Log.i(TAG, String.format(Locale.US, "%s", getProfileLevelName(iMax, iMax2)));
        } catch (Throwable unused) {
            Log.i(TAG, "profile-level: exception");
        }
    }
}

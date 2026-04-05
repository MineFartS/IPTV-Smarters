package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.amazonaws.event.ProgressEvent;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class xy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f23762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f23765g;

    public xy(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        ajr.b(str);
        this.f23759a = str;
        this.f23760b = str2;
        this.f23761c = str3;
        this.f23762d = codecCapabilities;
        this.f23763e = z;
        this.f23764f = z2;
        this.f23765g = alo.p(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.ads.interactivemedia.v3.internal.xy g(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.media.MediaCodecInfo.CodecCapabilities r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            com.google.ads.interactivemedia.v3.internal.xy r11 = new com.google.ads.interactivemedia.v3.internal.xy
            r12 = 1
            r13 = 0
            if (r10 == 0) goto L3d
            int r0 = com.google.ads.interactivemedia.v3.internal.amn.f20135a
            r1 = 19
            if (r0 < r1) goto L3d
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L3d
            r1 = 22
            if (r0 > r1) goto L3b
            java.lang.String r0 = com.google.ads.interactivemedia.v3.internal.amn.f20138d
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
        L2a:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L3b
            goto L3d
        L3b:
            r5 = 1
            goto L3e
        L3d:
            r5 = 0
        L3e:
            r0 = 21
            if (r10 == 0) goto L4b
            int r1 = com.google.ads.interactivemedia.v3.internal.amn.f20135a
            if (r1 < r0) goto L4b
            java.lang.String r1 = "tunneled-playback"
            r10.isFeatureSupported(r1)
        L4b:
            if (r14 != 0) goto L5e
            if (r10 == 0) goto L5c
            int r14 = com.google.ads.interactivemedia.v3.internal.amn.f20135a
            if (r14 < r0) goto L5c
            java.lang.String r14 = "secure-playback"
            boolean r14 = r10.isFeatureSupported(r14)
            if (r14 == 0) goto L5c
            goto L5e
        L5c:
            r6 = 0
            goto L5f
        L5e:
            r6 = 1
        L5f:
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.xy.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.google.ads.interactivemedia.v3.internal.xy");
    }

    private static Point h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(amn.b(i2, widthAlignment) * widthAlignment, amn.b(i3, heightAlignment) * heightAlignment);
    }

    private final void i(String str) {
        String str2 = this.f23759a;
        String str3 = this.f23760b;
        String str4 = amn.f20139e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + str3.length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    private static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point pointH = h(videoCapabilities, i2, i3);
        int i4 = pointH.x;
        int i5 = pointH.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
    }

    public final Point a(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23762d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return h(videoCapabilities, i2, i3);
    }

    public final qa b(ke keVar, ke keVar2) {
        int i2 = true != amn.O(keVar.f22156l, keVar2.f22156l) ? 8 : 0;
        if (this.f23765g) {
            if (keVar.t != keVar2.t) {
                i2 |= 1024;
            }
            if (!this.f23763e && (keVar.q != keVar2.q || keVar.r != keVar2.r)) {
                i2 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
            if (!amn.O(keVar.x, keVar2.x)) {
                i2 |= 2048;
            }
            String str = this.f23759a;
            if (amn.f20138d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !keVar.e(keVar2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new qa(this.f23759a, keVar, keVar2, true != keVar.e(keVar2) ? 2 : 3, 0);
            }
        } else {
            if (keVar.y != keVar2.y) {
                i2 |= ProgressEvent.PART_FAILED_EVENT_CODE;
            }
            if (keVar.z != keVar2.z) {
                i2 |= 8192;
            }
            if (keVar.A != keVar2.A) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.f23760b)) {
                Pair<Integer, Integer> pairB = ym.b(keVar);
                Pair<Integer, Integer> pairB2 = ym.b(keVar2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new qa(this.f23759a, keVar, keVar2, 3, 0);
                    }
                }
            }
            if (!keVar.e(keVar2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.f23760b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new qa(this.f23759a, keVar, keVar2, 1, 0);
            }
        }
        return new qa(this.f23759a, keVar, keVar2, 0, i2);
    }

    public final boolean c(ke keVar) {
        String string;
        String string2;
        int i2;
        String strF;
        String str;
        StringBuilder sb;
        String str2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str3 = keVar.f22153i;
        int i3 = 16;
        if (str3 != null && (strF = alo.f(str3)) != null) {
            if (this.f23760b.equals(strF)) {
                Pair<Integer, Integer> pairB = ym.b(keVar);
                if (pairB != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB.second).intValue();
                    if (!this.f23765g) {
                        if (iIntValue == 42) {
                            iIntValue = 42;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrF = f();
                    if (amn.f20135a <= 23 && "video/x-vnd.on2.vp9".equals(this.f23760b) && codecProfileLevelArrF.length == 0) {
                        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23762d;
                        int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                        int i4 = iIntValue3 >= 180000000 ? 1024 : iIntValue3 >= 120000000 ? IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : iIntValue3 >= 60000000 ? 256 : iIntValue3 >= 30000000 ? 128 : iIntValue3 >= 18000000 ? 64 : iIntValue3 >= 12000000 ? 32 : iIntValue3 >= 7200000 ? 16 : iIntValue3 >= 3600000 ? 8 : iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i4;
                        codecProfileLevelArrF = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrF) {
                        if (codecProfileLevel2.profile != iIntValue || codecProfileLevel2.level < iIntValue2) {
                        }
                    }
                    str = keVar.f22153i;
                    sb = new StringBuilder(String.valueOf(str).length() + 22 + strF.length());
                    str2 = "codec.profileLevel, ";
                }
            } else {
                str = keVar.f22153i;
                sb = new StringBuilder(String.valueOf(str).length() + 13 + strF.length());
                str2 = "codec.mime ";
            }
            sb.append(str2);
            sb.append(str);
            sb.append(", ");
            sb.append(strF);
            i(sb.toString());
            return false;
        }
        if (this.f23765g) {
            int i5 = keVar.q;
            if (i5 <= 0 || (i2 = keVar.r) <= 0) {
                return true;
            }
            if (amn.f20135a >= 21) {
                return e(i5, i2, keVar.s);
            }
            boolean z = i5 * i2 <= ym.a();
            if (!z) {
                int i6 = keVar.q;
                int i7 = keVar.r;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("legacyFrameSize, ");
                sb2.append(i6);
                sb2.append("x");
                sb2.append(i7);
                i(sb2.toString());
            }
            return z;
        }
        int i8 = amn.f20135a;
        if (i8 >= 21) {
            int i9 = keVar.z;
            if (i9 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f23762d;
                if (codecCapabilities2 == null) {
                    string2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        string2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i9)) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("sampleRate.support, ");
                        sb3.append(i9);
                        string2 = sb3.toString();
                    }
                }
                i(string2);
                return false;
            }
            int i10 = keVar.y;
            if (i10 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f23762d;
                if (codecCapabilities3 == null) {
                    string = "channelCount.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        string = "channelCount.aCaps";
                    } else {
                        String str4 = this.f23759a;
                        String str5 = this.f23760b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i8 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                            if ("audio/ac3".equals(str5)) {
                                i3 = 6;
                            } else if (!"audio/eac3".equals(str5)) {
                                i3 = 30;
                            }
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 59);
                            sb4.append("AssumedMaxChannelAdjustment: ");
                            sb4.append(str4);
                            sb4.append(", [");
                            sb4.append(maxInputChannelCount);
                            sb4.append(" to ");
                            sb4.append(i3);
                            sb4.append("]");
                            Log.w("MediaCodecInfo", sb4.toString());
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i10) {
                            StringBuilder sb5 = new StringBuilder(33);
                            sb5.append("channelCount.support, ");
                            sb5.append(i10);
                            string = sb5.toString();
                        }
                    }
                }
                i(string);
                return false;
            }
        }
        return true;
    }

    public final boolean d(ke keVar) {
        if (this.f23765g) {
            return this.f23763e;
        }
        Pair<Integer, Integer> pairB = ym.b(keVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final boolean e(int i2, int i3, double d2) {
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23762d;
        if (codecCapabilities == null) {
            string = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                string = "sizeAndRate.vCaps";
            } else {
                if (j(videoCapabilities, i2, i3, d2)) {
                    return true;
                }
                if (i2 < i3 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f23759a) || !"mcv5a".equals(amn.f20136b)) && j(videoCapabilities, i3, i2, d2))) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(i3);
                    sb.append("x");
                    sb.append(d2);
                    String string2 = sb.toString();
                    String str = this.f23759a;
                    String str2 = this.f23760b;
                    String str3 = amn.f20139e;
                    int length = String.valueOf(string2).length();
                    int length2 = String.valueOf(str).length();
                    StringBuilder sb2 = new StringBuilder(length + 25 + length2 + str2.length() + String.valueOf(str3).length());
                    sb2.append("AssumedSupport [");
                    sb2.append(string2);
                    sb2.append("] [");
                    sb2.append(str);
                    sb2.append(", ");
                    sb2.append(str2);
                    sb2.append("] [");
                    sb2.append(str3);
                    sb2.append("]");
                    Log.d("MediaCodecInfo", sb2.toString());
                    return true;
                }
                StringBuilder sb3 = new StringBuilder(69);
                sb3.append("sizeAndRate.support, ");
                sb3.append(i2);
                sb3.append("x");
                sb3.append(i3);
                sb3.append("x");
                sb3.append(d2);
                string = sb3.toString();
            }
        }
        i(string);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23762d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final String toString() {
        return this.f23759a;
    }
}

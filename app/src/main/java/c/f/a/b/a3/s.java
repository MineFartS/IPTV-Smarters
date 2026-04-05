package c.f.a.b.a3;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import com.amazonaws.event.ProgressEvent;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f6482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6489k;

    public s(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f6479a = (String) c.f.a.b.j3.g.e(str);
        this.f6480b = str2;
        this.f6481c = str3;
        this.f6482d = codecCapabilities;
        this.f6486h = z;
        this.f6487i = z2;
        this.f6488j = z3;
        this.f6483e = z4;
        this.f6484f = z5;
        this.f6485g = z6;
        this.f6489k = d0.s(str2);
    }

    public static s A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new s(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !h(codecCapabilities) || y(str)) ? false : true, codecCapabilities != null && r(codecCapabilities), z5 || (codecCapabilities != null && p(codecCapabilities)));
    }

    public static int a(String str, String str2, int i2) {
        if (i2 > 1 || ((x0.f9296a >= 26 && i2 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i2;
        }
        int i3 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        z.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i2 + " to " + i3 + "]");
        return i3;
    }

    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(x0.k(i2, widthAlignment) * widthAlignment, x0.k(i3, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point pointC = c(videoCapabilities, i2, i3);
        int i4 = pointC.x;
        int i5 = pointC.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i2 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return x0.f9296a >= 19 && i(codecCapabilities);
    }

    public static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return x0.f9296a >= 21 && q(codecCapabilities);
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return x0.f9296a >= 21 && s(codecCapabilities);
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean w(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean x(String str) {
        return x0.f9299d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean y(String str) {
        if (x0.f9296a <= 22) {
            String str2 = x0.f9299d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(x0.f9297b)) ? false : true;
    }

    public Point b(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6482d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i2, i3);
    }

    public c.f.a.b.v2.g e(k1 k1Var, k1 k1Var2) {
        int i2 = !x0.b(k1Var.f9338m, k1Var2.f9338m) ? 8 : 0;
        if (this.f6489k) {
            if (k1Var.u != k1Var2.u) {
                i2 |= 1024;
            }
            if (!this.f6483e && (k1Var.r != k1Var2.r || k1Var.s != k1Var2.s)) {
                i2 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
            if (!x0.b(k1Var.y, k1Var2.y)) {
                i2 |= 2048;
            }
            if (x(this.f6479a) && !k1Var.e(k1Var2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new c.f.a.b.v2.g(this.f6479a, k1Var, k1Var2, k1Var.e(k1Var2) ? 3 : 2, 0);
            }
        } else {
            if (k1Var.z != k1Var2.z) {
                i2 |= ProgressEvent.PART_FAILED_EVENT_CODE;
            }
            if (k1Var.A != k1Var2.A) {
                i2 |= 8192;
            }
            if (k1Var.B != k1Var2.B) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.f6480b)) {
                Pair<Integer, Integer> pairL = v.l(k1Var);
                Pair<Integer, Integer> pairL2 = v.l(k1Var2);
                if (pairL != null && pairL2 != null) {
                    int iIntValue = ((Integer) pairL.first).intValue();
                    int iIntValue2 = ((Integer) pairL2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new c.f.a.b.v2.g(this.f6479a, k1Var, k1Var2, 3, 0);
                    }
                }
            }
            if (!k1Var.e(k1Var2)) {
                i2 |= 32;
            }
            if (w(this.f6480b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new c.f.a.b.v2.g(this.f6479a, k1Var, k1Var2, 1, 0);
            }
        }
        return new c.f.a.b.v2.g(this.f6479a, k1Var, k1Var2, 0, i2);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6482d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6482d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (a(this.f6479a, this.f6480b, audioCapabilities.getMaxInputChannelCount()) >= i2) {
                    return true;
                }
                str = "channelCount.support, " + i2;
            }
        }
        v(str);
        return false;
    }

    public boolean k(int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6482d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i2)) {
                    return true;
                }
                str = "sampleRate.support, " + i2;
            }
        }
        v(str);
        return false;
    }

    public boolean l(k1 k1Var) {
        String strG;
        StringBuilder sb;
        String str;
        String str2 = k1Var.f9335j;
        if (str2 == null || this.f6480b == null || (strG = d0.g(str2)) == null) {
            return true;
        }
        if (this.f6480b.equals(strG)) {
            Pair<Integer, Integer> pairL = v.l(k1Var);
            if (pairL == null) {
                return true;
            }
            int iIntValue = ((Integer) pairL.first).intValue();
            int iIntValue2 = ((Integer) pairL.second).intValue();
            if (!this.f6489k && iIntValue != 42) {
                return true;
            }
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = g();
            if (x0.f9296a <= 23 && "video/x-vnd.on2.vp9".equals(this.f6480b) && codecProfileLevelArrG.length == 0) {
                codecProfileLevelArrG = f(this.f6482d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrG) {
                if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str = "codec.profileLevel, ";
        } else {
            sb = new StringBuilder();
            str = "codec.mime ";
        }
        sb.append(str);
        sb.append(k1Var.f9335j);
        sb.append(", ");
        sb.append(strG);
        v(sb.toString());
        return false;
    }

    public boolean m(k1 k1Var) {
        int i2;
        if (!l(k1Var)) {
            return false;
        }
        if (!this.f6489k) {
            if (x0.f9296a >= 21) {
                int i3 = k1Var.A;
                if (i3 != -1 && !k(i3)) {
                    return false;
                }
                int i4 = k1Var.z;
                if (i4 != -1 && !j(i4)) {
                    return false;
                }
            }
            return true;
        }
        int i5 = k1Var.r;
        if (i5 <= 0 || (i2 = k1Var.s) <= 0) {
            return true;
        }
        if (x0.f9296a >= 21) {
            return t(i5, i2, k1Var.t);
        }
        boolean z = i5 * i2 <= v.I();
        if (!z) {
            v("legacyFrameSize, " + k1Var.r + "x" + k1Var.s);
        }
        return z;
    }

    public boolean n() {
        if (x0.f9296a >= 29 && "video/x-vnd.on2.vp9".equals(this.f6480b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o(k1 k1Var) {
        if (this.f6489k) {
            return this.f6483e;
        }
        Pair<Integer, Integer> pairL = v.l(k1Var);
        return pairL != null && ((Integer) pairL.first).intValue() == 42;
    }

    public boolean t(int i2, int i3, double d2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6482d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (d(videoCapabilities, i2, i3, d2)) {
                    return true;
                }
                if (i2 < i3 && z(this.f6479a) && d(videoCapabilities, i3, i2, d2)) {
                    u("sizeAndRate.rotated, " + i2 + "x" + i3 + "x" + d2);
                    return true;
                }
                str = "sizeAndRate.support, " + i2 + "x" + i3 + "x" + d2;
            }
        }
        v(str);
        return false;
    }

    public String toString() {
        return this.f6479a;
    }

    public final void u(String str) {
        z.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f6479a + ", " + this.f6480b + "] [" + x0.f9300e + "]");
    }

    public final void v(String str) {
        z.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f6479a + ", " + this.f6480b + "] [" + x0.f9300e + "]");
    }
}

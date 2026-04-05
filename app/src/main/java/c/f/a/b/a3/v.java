package c.f.a.b.a3;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f6498a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<b, List<s>> f6499b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6500c = -1;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6503c;

        public b(String str, boolean z, boolean z2) {
            this.f6501a = str;
            this.f6502b = z;
            this.f6503c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f6501a, bVar.f6501a) && this.f6502b == bVar.f6502b && this.f6503c == bVar.f6503c;
        }

        public int hashCode() {
            return ((((this.f6501a.hashCode() + 31) * 31) + (this.f6502b ? 1231 : 1237)) * 31) + (this.f6503c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface d {
        MediaCodecInfo a(int i2);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class e implements d {
        public e() {
        }

        @Override // c.f.a.b.a3.v.d
        public MediaCodecInfo a(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // c.f.a.b.a3.v.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // c.f.a.b.a3.v.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // c.f.a.b.a3.v.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // c.f.a.b.a3.v.d
        public boolean e() {
            return false;
        }
    }

    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f6505b;

        public f(boolean z, boolean z2) {
            this.f6504a = (z || z2) ? 1 : 0;
        }

        @Override // c.f.a.b.a3.v.d
        public MediaCodecInfo a(int i2) {
            f();
            return this.f6505b[i2];
        }

        @Override // c.f.a.b.a3.v.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // c.f.a.b.a3.v.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // c.f.a.b.a3.v.d
        public int d() {
            f();
            return this.f6505b.length;
        }

        @Override // c.f.a.b.a3.v.d
        public boolean e() {
            return true;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        public final void f() {
            if (this.f6505b == null) {
                this.f6505b = new MediaCodecList(this.f6504a).getCodecInfos();
            }
        }
    }

    public interface g<T> {
        int a(T t);
    }

    public static boolean A(MediaCodecInfo mediaCodecInfo) {
        if (x0.f9296a >= 29) {
            return B(mediaCodecInfo);
        }
        String strE = c.f.b.a.b.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        if (x0.f9296a >= 29) {
            return D(mediaCodecInfo);
        }
        String strE = c.f.b.a.b.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int E(s sVar) {
        String str = sVar.f6479a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (x0.f9296a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int F(s sVar) {
        return sVar.f6479a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int G(k1 k1Var, s sVar) {
        try {
            return sVar.m(k1Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    public static /* synthetic */ int H(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int I() {
        if (f6500c == -1) {
            int iMax = 0;
            s sVarM = m("video/avc", false, false);
            if (sVarM != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = sVarM.g();
                int length = codecProfileLevelArrG.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(d(codecProfileLevelArrG[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, x0.f9296a >= 21 ? 345600 : 172800);
            }
            f6500c = iMax;
        }
        return f6500c;
    }

    public static int J(int i2) {
        int i3 = 17;
        if (i2 != 17) {
            i3 = 20;
            if (i2 != 20) {
                i3 = 23;
                if (i2 != 23) {
                    i3 = 29;
                    if (i2 != 29) {
                        i3 = 39;
                        if (i2 != 39) {
                            i3 = 42;
                            if (i2 != 42) {
                                switch (i2) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i3;
    }

    public static <T> void K(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: c.f.a.b.a3.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return v.H(gVar, obj, obj2);
            }
        });
    }

    public static int L(int i2) {
        if (i2 == 10) {
            return 1;
        }
        if (i2 == 11) {
            return 2;
        }
        if (i2 == 20) {
            return 4;
        }
        if (i2 == 21) {
            return 8;
        }
        if (i2 == 30) {
            return 16;
        }
        if (i2 == 31) {
            return 32;
        }
        if (i2 == 40) {
            return 64;
        }
        if (i2 == 41) {
            return 128;
        }
        if (i2 == 50) {
            return 256;
        }
        if (i2 == 51) {
            return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        }
        switch (i2) {
            case 60:
                return 2048;
            case 61:
                return ProgressEvent.PART_FAILED_EVENT_CODE;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static int M(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void a(String str, List<s> list) {
        if ("audio/raw".equals(str)) {
            if (x0.f9296a < 26 && x0.f9297b.equals("R9") && list.size() == 1 && list.get(0).f6479a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(s.A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            K(list, new g() { // from class: c.f.a.b.a3.e
                @Override // c.f.a.b.a3.v.g
                public final int a(Object obj) {
                    return v.E((s) obj);
                }
            });
        }
        int i2 = x0.f9296a;
        if (i2 < 21 && list.size() > 1) {
            String str2 = list.get(0).f6479a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                K(list, new g() { // from class: c.f.a.b.a3.f
                    @Override // c.f.a.b.a3.v.g
                    public final int a(Object obj) {
                        return v.F((s) obj);
                    }
                });
            }
        }
        if (i2 >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f6479a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static int b(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return ProgressEvent.PART_FAILED_EVENT_CODE;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return Constants.MB;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int c(int i2) {
        switch (i2) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i2) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i2) {
                            case 30:
                                return 256;
                            case 31:
                                return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                            case 32:
                                return 1024;
                            default:
                                switch (i2) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return ProgressEvent.PART_FAILED_EVENT_CODE;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i2) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int d(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 25344;
        }
        switch (i2) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case ProgressEvent.PART_FAILED_EVENT_CODE /* 4096 */:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int e(int i2) {
        if (i2 == 66) {
            return 1;
        }
        if (i2 == 77) {
            return 2;
        }
        if (i2 == 88) {
            return 4;
        }
        if (i2 == 100) {
            return 8;
        }
        if (i2 == 110) {
            return 16;
        }
        if (i2 != 122) {
            return i2 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static Integer f(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                i2 = 16;
                break;
            case "06":
                i2 = 32;
                break;
            case "07":
                i2 = 64;
                break;
            case "08":
                i2 = 128;
                break;
            case "09":
                i2 = 256;
                break;
            case "10":
                i2 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                break;
            case "11":
                i2 = 1024;
                break;
            case "12":
                i2 = 2048;
                break;
            case "13":
                i2 = ProgressEvent.PART_FAILED_EVENT_CODE;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public static Integer g(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                i2 = 16;
                break;
            case "05":
                i2 = 32;
                break;
            case "06":
                i2 = 64;
                break;
            case "07":
                i2 = 128;
                break;
            case "08":
                i2 = 256;
                break;
            case "09":
                i2 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public static Pair<Integer, Integer> h(String str, String[] strArr) {
        int iJ;
        if (strArr.length != 3) {
            z.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(d0.h(Integer.parseInt(strArr[1], 16))) && (iJ = J(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iJ), 0);
            }
        } catch (NumberFormatException unused) {
            z.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static Pair<Integer, Integer> i(String str, String[] strArr, c.f.a.b.k3.n nVar) {
        StringBuilder sb;
        int i2;
        int i3;
        int i4;
        StringBuilder sb2;
        int i5;
        String string;
        if (strArr.length >= 4) {
            try {
                i2 = Integer.parseInt(strArr[1]);
                i3 = Integer.parseInt(strArr[2].substring(0, 2));
                i4 = Integer.parseInt(strArr[3]);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                sb.append("Ignoring malformed AV1 codec string: ");
                sb.append(str);
            }
            if (i2 != 0) {
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 profile: ");
                sb2.append(i2);
            } else {
                if (i4 != 8 && i4 != 10) {
                    sb = new StringBuilder();
                    sb.append("Unknown AV1 bit depth: ");
                    sb.append(i4);
                    string = sb.toString();
                    z.i("MediaCodecUtil", string);
                    return null;
                }
                int i6 = i4 != 8 ? (nVar == null || !(nVar.f9490e != null || (i5 = nVar.f9489d) == 7 || i5 == 6)) ? 2 : ProgressEvent.PART_FAILED_EVENT_CODE : 1;
                int iB = b(i3);
                if (iB != -1) {
                    return new Pair<>(Integer.valueOf(i6), Integer.valueOf(iB));
                }
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 level: ");
                sb2.append(i3);
            }
            string = sb2.toString();
            z.i("MediaCodecUtil", string);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AV1 codec string: ");
        sb.append(str);
        string = sb.toString();
        z.i("MediaCodecUtil", string);
        return null;
    }

    public static Pair<Integer, Integer> j(String str, String[] strArr) {
        StringBuilder sb;
        int i2;
        int i3;
        int iE;
        String string;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    i3 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    i2 = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        z.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    int i4 = Integer.parseInt(strArr[1]);
                    i2 = Integer.parseInt(strArr[2]);
                    i3 = i4;
                }
                iE = e(i3);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                sb.append("Ignoring malformed AVC codec string: ");
                sb.append(str);
            }
            if (iE == -1) {
                string = "Unknown AVC profile: " + i3;
                z.i("MediaCodecUtil", string);
                return null;
            }
            int iC = c(i2);
            if (iC != -1) {
                return new Pair<>(Integer.valueOf(iE), Integer.valueOf(iC));
            }
            sb = new StringBuilder();
            sb.append("Unknown AVC level: ");
            sb.append(i2);
            string = sb.toString();
            z.i("MediaCodecUtil", string);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        string = sb.toString();
        z.i("MediaCodecUtil", string);
        return null;
    }

    public static String k(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> l(c.f.a.b.k1 r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.a3.v.l(c.f.a.b.k1):android.util.Pair");
    }

    public static s m(String str, boolean z, boolean z2) {
        List<s> listN = n(str, z, z2);
        if (listN.isEmpty()) {
            return null;
        }
        return listN.get(0);
    }

    public static synchronized List<s> n(String str, boolean z, boolean z2) {
        b bVar = new b(str, z, z2);
        HashMap<b, List<s>> map = f6499b;
        List<s> list = map.get(bVar);
        if (list != null) {
            return list;
        }
        int i2 = x0.f9296a;
        ArrayList<s> arrayListO = o(bVar, i2 >= 21 ? new f(z, z2) : new e());
        if (z && arrayListO.isEmpty() && 21 <= i2 && i2 <= 23) {
            arrayListO = o(bVar, new e());
            if (!arrayListO.isEmpty()) {
                z.i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListO.get(0).f6479a);
            }
        }
        a(str, arrayListO);
        List<s> listUnmodifiableList = Collections.unmodifiableList(arrayListO);
        map.put(bVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:60:0x0120, B:8:0x002d, B:11:0x0038, B:54:0x00f9, B:57:0x0101, B:59:0x0107, B:61:0x012a, B:62:0x014d), top: B:70:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<c.f.a.b.a3.s> o(c.f.a.b.a3.v.b r24, c.f.a.b.a3.v.d r25) throws c.f.a.b.a3.v.c {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.a3.v.o(c.f.a.b.a3.v$b, c.f.a.b.a3.v$d):java.util.ArrayList");
    }

    public static List<s> p(List<s> list, final k1 k1Var) {
        ArrayList arrayList = new ArrayList(list);
        K(arrayList, new g() { // from class: c.f.a.b.a3.g
            @Override // c.f.a.b.a3.v.g
            public final int a(Object obj) {
                return v.G(k1Var, (s) obj);
            }
        });
        return arrayList;
    }

    public static s q() {
        return m("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> r(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 3) {
            sb = new StringBuilder();
        } else {
            Matcher matcher = f6498a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                Integer numG = g(str);
                if (numG == null) {
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer numF = f(str);
                    if (numF != null) {
                        return new Pair<>(numG, numF);
                    }
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb.append(str2);
                sb.append(str);
                z.i("MediaCodecUtil", sb.toString());
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed Dolby Vision codec string: ");
        sb.append(str);
        z.i("MediaCodecUtil", sb.toString());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> s(java.lang.String r6, java.lang.String[] r7) {
        /*
            int r0 = r7.length
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 4
            if (r0 >= r4) goto L1c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        Le:
            r7.append(r1)
        L11:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c.f.a.b.j3.z.i(r3, r6)
            return r2
        L1c:
            java.util.regex.Pattern r0 = c.f.a.b.a3.v.f6498a
            r4 = 1
            r5 = r7[r4]
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r5 = r0.matches()
            if (r5 != 0) goto L31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto Le
        L31:
            java.lang.String r6 = r0.group(r4)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L3e
            goto L47
        L3e:
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L65
            r4 = 2
        L47:
            r6 = 3
            r6 = r7[r6]
            java.lang.Integer r7 = u(r6)
            if (r7 != 0) goto L5b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown HEVC level string: "
        L57:
            r7.append(r0)
            goto L11
        L5b:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r6.<init>(r0, r7)
            return r6
        L65:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown HEVC profile string: "
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.a3.v.s(java.lang.String, java.lang.String[]):android.util.Pair");
    }

    public static Pair<Integer, Integer> t(String str, String[] strArr) {
        StringBuilder sb;
        int i2;
        int i3;
        int iM;
        String string;
        if (strArr.length >= 3) {
            try {
                i2 = Integer.parseInt(strArr[1]);
                i3 = Integer.parseInt(strArr[2]);
                iM = M(i2);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                sb.append("Ignoring malformed VP9 codec string: ");
                sb.append(str);
            }
            if (iM == -1) {
                string = "Unknown VP9 profile: " + i2;
                z.i("MediaCodecUtil", string);
                return null;
            }
            int iL = L(i3);
            if (iL != -1) {
                return new Pair<>(Integer.valueOf(iM), Integer.valueOf(iL));
            }
            sb = new StringBuilder();
            sb.append("Unknown VP9 level: ");
            sb.append(i3);
            string = sb.toString();
            z.i("MediaCodecUtil", string);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed VP9 codec string: ");
        sb.append(str);
        string = sb.toString();
        z.i("MediaCodecUtil", string);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer u(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b2 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b2 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b2 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b2 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b2 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b2 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b2 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b2 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b2 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b2 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b2 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b2 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b2 = 12;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b2 = DateTimeFieldType.HALFDAY_OF_DAY;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b2 = DateTimeFieldType.HOUR_OF_HALFDAY;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_HALFDAY;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_DAY;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b2 = DateTimeFieldType.HOUR_OF_DAY;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b2 = DateTimeFieldType.MINUTE_OF_DAY;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b2 = DateTimeFieldType.MINUTE_OF_HOUR;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b2 = DateTimeFieldType.SECOND_OF_DAY;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b2 = DateTimeFieldType.SECOND_OF_MINUTE;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b2 = DateTimeFieldType.MILLIS_OF_DAY;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b2 = DateTimeFieldType.MILLIS_OF_SECOND;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b2 = 24;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b2 = 25;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                i2 = 32;
                break;
            case 3:
                i2 = 128;
                break;
            case 4:
                i2 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                break;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                i2 = 64;
                break;
            case 9:
                i2 = 256;
                break;
            case 10:
                i2 = 2048;
                break;
            case 11:
                i2 = 8192;
                break;
            case 12:
                i2 = 32768;
                break;
            case 13:
                i2 = 131072;
                break;
            case 14:
                i2 = 524288;
                break;
            case 15:
                i2 = 2097152;
                break;
            case 16:
                i2 = 8388608;
                break;
            case 17:
                i2 = 33554432;
                break;
            case 18:
                i2 = 1024;
                break;
            case 19:
                i2 = ProgressEvent.PART_FAILED_EVENT_CODE;
                break;
            case 20:
                i2 = 16384;
                break;
            case 21:
                i2 = 65536;
                break;
            case 22:
                i2 = 262144;
                break;
            case 23:
                i2 = Constants.MB;
                break;
            case 24:
                i2 = 4194304;
                break;
            case 25:
                i2 = 16777216;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public static boolean v(MediaCodecInfo mediaCodecInfo) {
        return x0.f9296a >= 29 && w(mediaCodecInfo);
    }

    public static boolean w(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean x(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = x0.f9296a;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = x0.f9297b;
            if ("a70".equals(str3) || ("Xiaomi".equals(x0.f9298c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = x0.f9297b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = x0.f9297b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(x0.f9298c))) {
            String str6 = x0.f9297b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(x0.f9298c)) {
            String str7 = x0.f9297b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i2 <= 19 && x0.f9297b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean y(MediaCodecInfo mediaCodecInfo) {
        return x0.f9296a >= 29 ? z(mediaCodecInfo) : !A(mediaCodecInfo);
    }

    public static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }
}

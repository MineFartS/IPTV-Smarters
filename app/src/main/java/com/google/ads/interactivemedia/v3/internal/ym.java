package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.amazonaws.event.ProgressEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23797a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f23798b = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<yg, List<xy>> f23799c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23800d = -1;

    public static int a() {
        int i2;
        if (f23800d == -1) {
            xy xyVarF = f("video/avc");
            int iMax = 0;
            if (xyVarF != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrF = xyVarF.f();
                int length = codecProfileLevelArrF.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i3 = codecProfileLevelArrF[iMax].level;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case ProgressEvent.PART_FAILED_EVENT_CODE /* 4096 */:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    iMax2 = Math.max(i2, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, amn.f20135a >= 21 ? 345600 : 172800);
            }
            f23800d = iMax;
        }
        return f23800d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[PHI: r0 r1
  0x003f: PHI (r0v86 java.lang.String) = (r0v79 java.lang.String), (r0v81 java.lang.String), (r0v83 java.lang.String), (r0v88 java.lang.String) binds: [B:123:0x01ff, B:71:0x012a, B:17:0x0067, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r1v170 java.lang.String) = (r1v166 java.lang.String), (r1v168 java.lang.String), (r1v169 java.lang.String), (r1v171 java.lang.String) binds: [B:123:0x01ff, B:71:0x012a, B:17:0x0067, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027e A[PHI: r0 r1
  0x027e: PHI (r0v70 java.lang.String) = (r0v67 java.lang.String), (r0v72 java.lang.String) binds: [B:197:0x0304, B:160:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x027e: PHI (r1v121 java.lang.String) = (r1v107 java.lang.String), (r1v122 java.lang.String) binds: [B:197:0x0304, B:160:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e9 A[Catch: NumberFormatException -> 0x02f9, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x02f9, blocks: (B:165:0x028e, B:167:0x02a0, B:178:0x02bc, B:194:0x02e9), top: B:547:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0323 A[PHI: r0 r1
  0x0323: PHI (r0v62 java.lang.String) = (r0v48 java.lang.String), (r0v64 java.lang.String) binds: [B:257:0x03fe, B:204:0x0321] A[DONT_GENERATE, DONT_INLINE]
  0x0323: PHI (r1v105 java.lang.String) = (r1v70 java.lang.String), (r1v106 java.lang.String) binds: [B:257:0x03fe, B:204:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x041b A[PHI: r0 r1
  0x041b: PHI (r0v43 java.lang.String) = (r0v32 java.lang.String), (r0v37 java.lang.String), (r0v40 java.lang.String), (r0v45 java.lang.String) binds: [B:402:0x063e, B:397:0x061e, B:271:0x0443, B:264:0x0419] A[DONT_GENERATE, DONT_INLINE]
  0x041b: PHI (r1v68 java.lang.String) = (r1v63 java.lang.String), (r1v66 java.lang.String), (r1v67 java.lang.String), (r1v69 java.lang.String) binds: [B:402:0x063e, B:397:0x061e, B:271:0x0443, B:264:0x0419] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0662 A[PHI: r0 r1
  0x0662: PHI (r0v26 java.lang.String) = (r0v18 java.lang.String), (r0v28 java.lang.String) binds: [B:464:0x072c, B:409:0x0660] A[DONT_GENERATE, DONT_INLINE]
  0x0662: PHI (r1v61 java.lang.String) = (r1v49 java.lang.String), (r1v62 java.lang.String) binds: [B:464:0x072c, B:409:0x0660] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x074f A[PHI: r0 r1
  0x074f: PHI (r0v12 java.lang.String) = (r0v2 java.lang.String), (r0v14 java.lang.String) binds: [B:539:0x0866, B:471:0x074d] A[DONT_GENERATE, DONT_INLINE]
  0x074f: PHI (r1v47 java.lang.String) = (r1v2 java.lang.String), (r1v48 java.lang.String) binds: [B:539:0x0866, B:471:0x074d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> b(com.google.ads.interactivemedia.v3.internal.ke r17) {
        /*
            Method dump skipped, instruction units count: 2584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ym.b(com.google.ads.interactivemedia.v3.internal.ke):android.util.Pair");
    }

    public static xy c() {
        return f("audio/raw");
    }

    public static synchronized List<xy> d(String str, boolean z, boolean z2) {
        yg ygVar = new yg(str, z, z2);
        HashMap<yg, List<xy>> map = f23799c;
        List<xy> list = map.get(ygVar);
        if (list != null) {
            return list;
        }
        int i2 = amn.f20135a;
        ArrayList<xy> arrayListG = g(ygVar, i2 >= 21 ? new yk(z, z2) : new yj(null));
        if (z && arrayListG.isEmpty() && i2 >= 21 && i2 <= 23) {
            arrayListG = g(ygVar, new yj(null));
            if (!arrayListG.isEmpty()) {
                String str2 = arrayListG.get(0).f23759a;
                StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        if ("audio/raw".equals(str)) {
            if (i2 < 26 && amn.f20136b.equals("R9") && arrayListG.size() == 1 && arrayListG.get(0).f23759a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListG.add(xy.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            h(arrayListG, ye.f23789b);
        }
        if (i2 < 21 && arrayListG.size() > 1) {
            String str3 = arrayListG.get(0).f23759a;
            if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                h(arrayListG, ye.f23788a);
            }
        }
        if (i2 < 30 && arrayListG.size() > 1 && "OMX.qti.audio.decoder.flac".equals(arrayListG.get(0).f23759a)) {
            arrayListG.add(arrayListG.remove(0));
        }
        List<xy> listUnmodifiableList = Collections.unmodifiableList(arrayListG);
        map.put(ygVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static List<xy> e(List<xy> list, final ke keVar) {
        ArrayList arrayList = new ArrayList(list);
        h(arrayList, new yl() { // from class: com.google.ads.interactivemedia.v3.internal.yd
            @Override // com.google.ads.interactivemedia.v3.internal.yl
            public final int a(Object obj) {
                ke keVar2 = keVar;
                xy xyVar = (xy) obj;
                int i2 = ym.f23797a;
                try {
                    return !xyVar.c(keVar2) ? 0 : 1;
                } catch (yh unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    public static xy f(String str) {
        List<xy> listD = d(str, false, false);
        if (listD.isEmpty()) {
            return null;
        }
        return listD.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x028f A[Catch: Exception -> 0x0313, TryCatch #2 {Exception -> 0x0313, blocks: (B:157:0x025e, B:163:0x0275, B:169:0x0289, B:171:0x028f, B:176:0x029d, B:178:0x02a5, B:188:0x02cf, B:191:0x02d5, B:179:0x02aa, B:181:0x02ba, B:183:0x02c2, B:172:0x0294), top: B:222:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0294 A[Catch: Exception -> 0x0313, TryCatch #2 {Exception -> 0x0313, blocks: (B:157:0x025e, B:163:0x0275, B:169:0x0289, B:171:0x028f, B:176:0x029d, B:178:0x02a5, B:188:0x02cf, B:191:0x02d5, B:179:0x02aa, B:181:0x02ba, B:183:0x02c2, B:172:0x0294), top: B:222:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a5 A[Catch: Exception -> 0x0313, TryCatch #2 {Exception -> 0x0313, blocks: (B:157:0x025e, B:163:0x0275, B:169:0x0289, B:171:0x028f, B:176:0x029d, B:178:0x02a5, B:188:0x02cf, B:191:0x02d5, B:179:0x02aa, B:181:0x02ba, B:183:0x02c2, B:172:0x0294), top: B:222:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02aa A[Catch: Exception -> 0x0313, TryCatch #2 {Exception -> 0x0313, blocks: (B:157:0x025e, B:163:0x0275, B:169:0x0289, B:171:0x028f, B:176:0x029d, B:178:0x02a5, B:188:0x02cf, B:191:0x02d5, B:179:0x02aa, B:181:0x02ba, B:183:0x02c2, B:172:0x0294), top: B:222:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0383 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.xy> g(com.google.ads.interactivemedia.v3.internal.yg r22, com.google.ads.interactivemedia.v3.internal.yi r23) throws com.google.ads.interactivemedia.v3.internal.yh {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ym.g(com.google.ads.interactivemedia.v3.internal.yg, com.google.ads.interactivemedia.v3.internal.yi):java.util.ArrayList");
    }

    private static <T> void h(List<T> list, final yl<T> ylVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.ads.interactivemedia.v3.internal.yf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                yl ylVar2 = ylVar;
                int i2 = ym.f23797a;
                return ylVar2.a(obj2) - ylVar2.a(obj);
            }
        });
    }

    private static boolean i(MediaCodecInfo mediaCodecInfo) {
        if (amn.f20135a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String strB = arq.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        return strB.startsWith("omx.google.") || strB.startsWith("omx.ffmpeg.") || (strB.startsWith("omx.sec.") && strB.contains(".sw.")) || strB.equals("omx.qcom.video.decoder.hevcswvdec") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.") || !(strB.startsWith("omx.") || strB.startsWith("c2."));
    }
}

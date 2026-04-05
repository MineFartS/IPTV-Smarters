package com.google.android.exoplayer2.ext.ffmpeg;

import c.f.a.b.i1;
import c.f.a.b.j3.x;
import c.f.a.b.j3.z;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public final class FfmpegLibrary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f23903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f23904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23905c;

    static {
        i1.a("goog.exo.ffmpeg");
        f23903a = new x("ffmpegJNI");
        f23905c = -1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String a(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b2 = 0;
                }
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    b2 = 1;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    b2 = 2;
                }
                break;
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    b2 = 3;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    b2 = 4;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    b2 = 5;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b2 = 6;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b2 = 7;
                }
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    b2 = 8;
                }
                break;
            case 1504470054:
                if (str.equals("audio/alac")) {
                    b2 = 9;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b2 = 10;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    b2 = 11;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b2 = 12;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b2 = DateTimeFieldType.HALFDAY_OF_DAY;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b2 = DateTimeFieldType.HOUR_OF_HALFDAY;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_HALFDAY;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_DAY;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    b2 = DateTimeFieldType.HOUR_OF_DAY;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 10:
                return "eac3";
            case 1:
                return "amrwb";
            case 2:
            case 14:
                return "dca";
            case 3:
                return "vorbis";
            case 4:
            case 5:
            case 12:
                return "mp3";
            case 6:
                return "aac";
            case 7:
                return "ac3";
            case 8:
                return "amrnb";
            case 9:
                return "alac";
            case 11:
                return "flac";
            case 13:
                return "opus";
            case 15:
                return "truehd";
            case 16:
                return "pcm_alaw";
            case 17:
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static int b() {
        if (!d()) {
            return -1;
        }
        if (f23905c == -1) {
            f23905c = ffmpegGetInputBufferPaddingSize();
        }
        return f23905c;
    }

    public static String c() {
        if (!d()) {
            return null;
        }
        if (f23904b == null) {
            f23904b = ffmpegGetVersion();
        }
        return f23904b;
    }

    public static boolean d() {
        return f23903a.a();
    }

    public static boolean e(String str) {
        String strA;
        if (!d() || (strA = a(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(strA)) {
            return true;
        }
        z.i("FfmpegLibrary", "No " + strA + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    public static native int ffmpegGetInputBufferPaddingSize();

    public static native String ffmpegGetVersion();

    public static native boolean ffmpegHasDecoder(String str);
}

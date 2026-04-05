package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0628Ct {
    public static byte[] A00;
    public static String[] A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final String[] A0V;

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{-34, -34, -34, -34, -21, -30, -63, 4, 2, DateTimeFieldType.HOUR_OF_DAY, 6, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 2, 44, 61, 63, -55, -21, -15, -20, 6, 40, 46, 41, -27, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 38, 63, 63, DateTimeFieldType.HOUR_OF_HALFDAY, 48, 54, 49, -19, 29, 66, 59, 56, 37, 71, 83, 89, 87, 88, 77, 71, DateTimeFieldType.MINUTE_OF_HOUR, 62, 70, 55, 68, 64, 36, 65, 53, 61, -55, -12, -4, -19, -6, -10, -23, -4, -15, -2, -19, 2, 46, 35, 42, 38, 47, 53, 25, 70, 65, 69, 61, -9, 44, DateTimeFieldType.MILLIS_OF_SECOND, 36, 42, 29, DateTimeFieldType.MILLIS_OF_SECOND, 40, 26, 27, -54, -23, -12, -12, -23, -20, -12, DateTimeFieldType.MINUTE_OF_HOUR, 37, 37, 33, 68, 64, 83, -9, 26, DateTimeFieldType.MILLIS_OF_SECOND, 36, DateTimeFieldType.MILLIS_OF_SECOND, -4, 35, 33, -38, -4, 27, 40, 30, -15, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 26, -49, -4, DateTimeFieldType.SECOND_OF_DAY, 35, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, -19, DateTimeFieldType.MILLIS_OF_SECOND, 32, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 29, 12, 30, 30, 56, 98, 107, 91, 105, 39, 84, 84, 89, 94, 5, 39, 70, 88, 88, -60, -12, -21, -10, -46, -15, -14, -25, 5, 6, 5, DateTimeFieldType.MILLIS_OF_DAY, 9, 24, -33, 1, 8, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, -1, 44, 81, 74, 86, 75, 78, 91, 9, 54, 94, 92, 82, 76, -35, 2, -5, 8, DateTimeFieldType.HALFDAY_OF_DAY, 9, 8, DateTimeFieldType.SECOND_OF_MINUTE, 58, 65, 68, 71, 69, 56, 93, 103, 94, 104, 105, 94, 86, 99, DateTimeFieldType.SECOND_OF_MINUTE, 60, 86, 99, 92, 104, 105, 86, DateTimeFieldType.SECOND_OF_MINUTE, 71, 86, 101, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 52, 62, 53, 63, 64, 53, 45, 58, -20, 30, 45, 60, -51, -14, -4, -13, -3, -2, -13, -21, -8, -86, -36, -7, -19, -11, 25, 66, 55, 73, 73, 63, 57, -10, 40, 69, 57, 65, DateTimeFieldType.MILLIS_OF_SECOND, 64, 53, 71, 71, 61, 55, 53, 64, 52, 93, 102, 83, 43, 84, 93, 74, DateTimeFieldType.SECOND_OF_MINUTE, 48, 87, 93, 91, 77, -60, -16, -18, -26, -27, -6, -52, -8, -9, -3, -18, -10, -7, -8, -5, -22, -5, 2, -87, -52, -15, -5, -14, -4, -3, -14, -22, -9, 38, 82, 88, 81, 87, 85, 92, 42, 89, 86, 90, 90, 86, 93, 76, 89, 53, 103, 94, 102, 9, 38, 51, 40, 42, 11, 40, 53, 42, 44, -25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 40, 51, 51, -52, -23, -6, -13, -1, -23, -2, -19, -29, 4, 0, DateTimeFieldType.MINUTE_OF_HOUR, 7, -65, -20, 4, DateTimeFieldType.MINUTE_OF_HOUR, 0, 11, -20, DateTimeFieldType.HOUR_OF_DAY, 27, 11, DateTimeFieldType.MILLIS_OF_SECOND, 1, 47, 34, 30, 42, 0, 46, 49, 41, -36, -30, -36, -2, 29, 47, 47, -41, 5, 8, 0, -77, -26, 2, -1, 2, 34, 83, 67, 82, -9, DateTimeFieldType.MINUTE_OF_HOUR, 37, 43, -46, -2, 27, 37, 38, DateTimeFieldType.MILLIS_OF_SECOND, 32, 27, 32, 25, -38, 1, -6, -8, 9, 7, 4, 3, -2, -8, -40, 7, -5, 1, -4, -10, 0, 48, 45, 42, -24, 3, 42, 48, 46, 32, 26, 74, 71, 68, 2, 41, 58, 56, 61, 67, 68, 5, 53, 50, 47, 36, 33, 46, 35, 37, -45, -18, -10, -7, -14, -15, -83, 1, -4, -83, -3, -18, -1, 0, -14, -83, -16, -4, -6, -6, -14, -5, 1, -83, -18, 1, 1, -1, -10, -17, 2, 1, -14, -57, -83, 41, 68, 76, 79, 72, 71, 3, 87, 82, 3, 83, 68, 85, 86, 72, 3, 70, 82, 89, 72, 85, 3, 68, 85, 87, 3, 68, 87, 87, 85, 76, 69, 88, 87, 72, -16, 11, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, -54, 30, 25, -54, 26, 11, 28, 29, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -54, DateTimeFieldType.MINUTE_OF_HOUR, 24, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, -39, DateTimeFieldType.HALFDAY_OF_DAY, 25, 31, 24, 30, -54, 11, 30, 30, 28, DateTimeFieldType.MINUTE_OF_HOUR, 12, 31, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -28, -54, 32, 59, 67, 70, 63, 62, -6, 78, 73, -6, 74, 59, 76, 77, 63, -6, 77, 78, 59, 72, 62, 59, 76, 62, -6, 65, 63, 72, 76, 63, -6, 61, 73, 62, 63, 50, 77, 85, 88, 81, 80, 12, 96, 91, 12, 92, 77, 94, 95, 81, 12, 96, 81, 100, 96, 12, 77, 96, 96, 94, 85, 78, 97, 96, 81, 38, 12, 6, 33, 41, 44, 37, 36, -32, 52, 47, -32, 48, 33, 50, 51, 37, -32, 53, 41, 46, 52, -8, -32, 33, 52, 52, 50, 41, 34, 53, 52, 37, -32, 54, 33, 44, 53, 37, DateTimeFieldType.MINUTE_OF_HOUR, 46, 54, 57, 50, 49, -19, 65, 60, -19, 61, 46, 63, 64, 50, -19, 66, 54, 59, 65, 5, -19, 46, 65, 65, 63, 54, 47, 66, 65, 50, 7, -19, -64, -37, -19, -18, -102, -64, -17, -19, -29, -23, -24, -38, 3, 0, -1, 24, 65, 62, 61, -1, 36, 65, 53, 61, -33, 8, 5, 4, 5, 8, 11, -2, -28, DateTimeFieldType.CLOCKHOUR_OF_DAY, 3, 3, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 10, 3, 41, 88, 81, 78, 27, 74, 72, 62, 68, 67, 49, 75, 87, 79, DateTimeFieldType.MILLIS_OF_DAY, 48, 61, 54, 66, 67, 48, -6, 34, DateTimeFieldType.SECOND_OF_DAY, -27, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 10, -35, 5, 10, -2, -1, -7, 28, 68, 73, 61, 62, 56, -11, 39, 68, 56, 64, -63, -20, -17, -24, -31, -33, 63, 88, 105, 91, DateTimeFieldType.MILLIS_OF_SECOND, 73, 102, 90, 98, 27, 52, 69, 55, 54, 66, 69, 56, 41, 70, 66, 87, 90, 1, 46, 70, 85, 66, 77, 63, 96, 103, 36, 63, 102, 103, -49, -10, -4, -6, -20, -19, 26, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 26, DateTimeFieldType.MILLIS_OF_SECOND, 25, 36, 37, 30, DateTimeFieldType.SECOND_OF_MINUTE, 35, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 38, 25, 35, 31, 34, 41, 30, 41, 42, 35, 26, 40, 28, DateTimeFieldType.MILLIS_OF_DAY, 37, 33, 26, 40, 40, -6, 31, DateTimeFieldType.SECOND_OF_MINUTE, 26, DateTimeFieldType.MILLIS_OF_DAY, 31, 68, 58, 75, 73, 74, 72, 63, 55, 66, 26, 63, 68, 69, 67, 70, 62, 54, 63, 69, 50, 61, -55, -18, -13, -12, -14, -11, -19, -27, -18, -12, -31, -20, -96, -48, -17, -16, 35, 72, 77, 78, 76, 79, 71, 63, 72, 78, 59, 70, -6, 44, 73, 61, 69, 28, 51, 76, 76, 63, 86, 111, 111, 32, 59, 106, 99, 96, 59, 97, 96, 97, -16, 27, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 11, 37, 58, 77, 66, 71, -9, 26, -40, -15, DateTimeFieldType.SECOND_OF_DAY, -23, 1, 0, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, -3, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, DateTimeFieldType.MINUTE_OF_DAY, 1, -14, 10, DateTimeFieldType.MILLIS_OF_SECOND, 10, DateTimeFieldType.MINUTE_OF_HOUR, 12, 26, 10, -55, -31, -16, -35, -32, -35, -16, -35, -47, -16, -27, -24, 63, 87, 102, 83, 94, -32, 8, 
        6, -4, -10, -12, -1, 8, 27, 46, 35, 41, 40, 27, 38, -38, 0, 41, 38, 37, 41, 60, 79, 68, 81, 64, -5, 28, 72, 64, 77, 68, 62, 60, 73, -6, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 30, 28, 33, 26, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_DAY, 39, 57, -30, 3, 41, 39, 3, 26, 44, -43, 12, DateTimeFieldType.MILLIS_OF_DAY, 43, 26, 64, 97, 91, 101, 87, -37, -8, -16, -11, -15, -1, 49, 82, 71, 84, 67, DateTimeFieldType.HALFDAY_OF_DAY, 50, 38, 35, 48, DateTimeFieldType.SECOND_OF_DAY, 51, 48, 47, 37, 29, 60, 57, 64, 56, -19, 29, 66, 59, 56, -45, -14, -13, -25, 6, 7, -60, -35, 6, 3, 2, 29, 60, 61, -4, DateTimeFieldType.MINUTE_OF_HOUR, 66, 59, 56, DateTimeFieldType.MINUTE_OF_DAY, 49, 52, 48, -30, 9, 52, 49, 49, 56, 39, -22, 9, DateTimeFieldType.HOUR_OF_DAY, -1, 12, -70, -36, -5, 6, 6, -5, -2, DateTimeFieldType.SECOND_OF_DAY, 54, 37, 50, 47, 55, 47, 81, 72, 76, 84, 82, -46, -12, -15, -23, -12, -25, -11, -11, -21, -8, -25, -94, -44, -15, -27, -19, 36, 71, 77, 55, 60, 53, 56, 57, 64, 61, 55, -54, -19, -13, -35, -30, -33, -34, -33, -26, -29, -35, -102, -52, -23, -35, -27, -27, 10, 3, 0, -15, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 12, -63, -13, DateTimeFieldType.CLOCKHOUR_OF_DAY, 4, 12, -10, -54, -26, 55, 70, 85, 39, 54, 75, 58, -17, 2, 4, 4, -2, 2, 6, 25, 40, 38, 35, 66, 85, 102, 89, 102, 81, 92, 27, 49, 66, 61, 49, 54, 50, 44, -23, 28, 56, 62, 53, 32, 61, 49, 57, 54, 83, 71, 79, 4, 10, 4, 54, 83, 80, 80, 62, 76, 87, 94, 76, -23, -9, 3, -8, -9, 66, 80, 99, 88, 97, 84, -35, -14, -7, 1, -2, -1, -8, -17, -3, 26, 50, 40, -49, -25, -27, -20, -20, -31, -32, -100, -15, -22, -25, -22, -21, -13, -22, -100, -23, -31, -16, -35, -32, -35, -16, -35, -100, -31, -22, -16, -18, -11, -74, -100, 4, 29, 32, 40, -47, -5, DateTimeFieldType.MINUTE_OF_DAY, 30, 34, 59, 62, 70, -17, 33, 62, 50, 58, 61, 89, 88, 75, 94, 75, 27, 55, 61, 52, 26, 54, 60, 53, 43, -25, 10, 51, 48, 55, 10, 38, 44, 37, 27, 43, 41, 24, 26, 34, -25, 3, 9, 8, -4, -7, 6, 2, -76, -26, 3, -9, -1, -33, -4, -19, -17, -15, 36, 65, 54, 54, 52, 57, -29, 7, -7, -2, -9, 60, 98, 86, 89, 81, 88, 87, 82, 76, 9, 59, 88, 76, 84, DateTimeFieldType.MINUTE_OF_DAY, 56, 44, 47, 39, 46, 45, 56, -41, -3, -14, -8, -20, -12, -13, -12, 0, -19, -8, -18, -36, -54, -40, -43, 33, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26, 29, 54, 37, 49, 47, 70, 53, 65, 64, 39, DateTimeFieldType.MILLIS_OF_SECOND, 37, DateTimeFieldType.MILLIS_OF_DAY, 6, -5, 6, -29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, -18, -14, -18, -29, -49, 5, 1, -10, -29, 69, 65, 64, 68, -44, -46, -61, -53, -45, -46, -50, -79, -37, -38, -42, -56, 51, 50, 46, 34, 70, 69, 65, 66, -34, -35, -39, -34, -4, -5, -5, -19, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 6, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 27, 29, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_DAY, 30, 26, DateTimeFieldType.MILLIS_OF_DAY, 25, 27, -40, -27, -14, -21, -13, 36, 53, 51, 56, 62, 63, DateTimeFieldType.HOUR_OF_DAY, 34, 32, 37, 43, 44, -22, 6, 43, 33, 50, 48, 49, 47, 38, 30, 41, -2, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 28, 28, 25, 28, 62, 82, 92, 75, 93, 82, 10, 55, 79, 94, 75, 86, 67, 94, 95, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 35, 31, -17, DateTimeFieldType.HALFDAY_OF_DAY, -4, 4, 7, 0, DateTimeFieldType.HALFDAY_OF_DAY, 36, 66, 49, 62, 51, 53, 27, 57, 48, 41, 40, 51, 39, 69, 60, 67, 0, 27, 66, 67, -23, -25, -32, -24, 75, 100, 104, 91, 89, 101, 93, 100, 95, 112, 91, 90, DateTimeFieldType.MILLIS_OF_DAY, 89, 101, 108, 91, 104, DateTimeFieldType.MILLIS_OF_DAY, 87, 104, 106, DateTimeFieldType.MILLIS_OF_DAY, 92, 98, 87, 93, 105, 48, DateTimeFieldType.MILLIS_OF_DAY, 76, 101, 89, 87, 98, -14, -46, -29, -27, 68, 79, 69, 29, 39, 46, 0, 12, 10, 55, 67, 74, 70, -36, -23, -30, -27, 58, 55, 79, -32, -27, -17, -25, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, 72, 79, 83, 70, -11, 0, -2, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_SECOND, 11, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -39, DateTimeFieldType.SECOND_OF_DAY, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_DAY, 62, 66, 54, 60, 58, 4, 69, 67, 60, 76, 89, 82, 7, -6, 6, 31, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 31, 32, 34, 28, DateTimeFieldType.SECOND_OF_MINUTE, 46, 42, 28, 28, 67, 63, 49, 60, -4, -8, -22, -5, 83, 79, 67, 79, 86, 82, 81, 80, 12, 8, 12, 7, 60, 53, 56, 55, 85, 80, 80, 32, 30, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, 11, 4, 7, 74, 76, 73, 62, -15, -22, -32, 57, 52, 54};
    }

    public static void A0B() {
        A01 = new String[]{"JLqiHSvdfqtEv8b1RfsccUDTgBsY5P7e", "pNltYe0DhFIpitgSIEi0zi0z7LgjRjg3", "QIjIEwCvhgb560p1OMiECGtkVXCQy3er", "KHs9hye8jiwr48prwbb7IMXWCnSDCWiY", "yyBpVHi0j1NoAOinFQPWg7opFcoOFj1Z", "zrgyUuiGmn5ero9isYCfajoNViVl9QPH", "whRWIRw337nw8NXc5gXNsvGgchD", "lhywLkOHL1xCVlOZTw9pXaD5EeZGan4i"};
    }

    static {
        A0B();
        A0A();
        A0A = J1.A08(A09(1691, 3, 32));
        A0B = J1.A08(A09(1733, 3, 51));
        A04 = J1.A08(A09(1638, 3, 65));
        A0C = J1.A08(A09(1652, 3, 93));
        A03 = J1.A08(A09(14, 3, 114));
        A07 = J1.A08(A09(1730, 3, 104));
        A02 = J1.A08(A09(1635, 3, 106));
        A05 = J1.A08(A09(1641, 3, 36));
        A06 = J1.A08(A09(1747, 3, 73));
        A09 = J1.A08(A09(1688, 3, 103));
        A08 = J1.A08(A09(1659, 3, 49));
        A0F = J1.A08(A09(1644, 4, 91));
        A0I = J1.A08(A09(1662, 4, 104));
        A0J = J1.A08(A09(1666, 3, 21));
        A0G = J1.A08(A09(1655, 4, 3));
        A0S = J1.A08(A09(1736, 4, 32));
        A0R = J1.A08(A09(1726, 4, 79));
        A0E = J1.A08(A09(1648, 4, 0));
        A0D = J1.A08(A09(1631, 4, 24));
        A0Q = J1.A08(A09(1718, 4, 106));
        A0M = J1.A08(A09(1706, 4, 87));
        A0O = J1.A08(A09(1710, 4, 16));
        A0N = J1.A08(A09(1702, 4, 66));
        A0P = J1.A08(A09(1714, 4, 103));
        A0L = J1.A08(A09(1698, 4, 53));
        A0H = J1.A08(A09(1694, 4, 54));
        A0U = J1.A08(A09(1722, 4, 32));
        A0T = J1.A08(A09(1740, 4, 93));
        A0K = J1.A08(A09(0, 4, 56));
        A0V = new String[]{A09(137, 5, 125), A09(246, 12, 93), A09(309, 7, 106), A09(329, 5, 76), A09(363, 5, 47), A09(744, 4, 106), A09(791, 6, 1), A09(825, 7, 126), A09(930, 4, 89), A09(993, 5, 121), A09(1042, 7, 73), A09(1062, 6, 19), A09(1073, 5, 69), A09(1093, 3, 10), A09(1203, 3, 43), A09(1206, 3, 108), A09(1213, 6, 36), A09(1244, 4, 85), A09(1518, 6, 87), A09(875, 10, 93), A09(57, 11, 15), A09(1284, 3, 78), A09(352, 11, 38), A09(1135, 6, 75), A09(1356, 10, 62), A09(437, 11, 92), A09(68, 7, 72), A09(1584, 8, 90), A09(1626, 5, 125), A09(934, 9, 124), A09(748, 6, 92), A09(1572, 6, 87), A09(258, 9, 91), A09(885, 12, 88), A09(17, 4, 15), A09(832, 5, 14), A09(754, 4, 113), A09(1346, 10, 78), A09(768, 6, 37), A09(1057, 5, 121), A09(47, 10, 89), A09(96, 4, 57), A09(1342, 4, 79), A09(1190, 4, 28), A09(1379, 5, 19), A09(963, 10, 35), A09(897, 16, 7), A09(913, 17, 97), A09(421, 6, 26), A09(774, 6, 29), A09(344, 8, 15), A09(1524, 17, 68), A09(411, 10, 28), A09(1096, 8, 30), A09(448, 9, 71), A09(368, 5, 68), A09(1366, 13, 27), A09(281, 6, 8), A09(325, 4, 121), A09(758, 7, 86), A09(1559, 6, 118), A09(219, 13, 83), A09(1104, 8, 84), A09(947, 6, 45), A09(1018, 15, 98), A09(159, 7, 43), A09(1049, 8, 60), A09(1163, 11, 91), A09(1209, 4, 92), A09(1275, 9, 17), A09(1565, 7, 34), A09(958, 5, 50), A09(1578, 6, 78), A09(30, 9, 84), A09(21, 9, 76), A09(1078, 5, 75), A09(1219, 5, 59), A09(998, 7, 26), A09(1248, 11, 107), A09(797, 9, 126), A09(714, 4, 27), A09(718, 9, 89), A09(1005, 13, 65), A09(1390, 5, 23), A09(IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH, 11, 1), A09(104, 5, 60), A09(953, 5, 96), A09(1224, 7, 119), A09(166, 6, 35), A09(128, 9, 50), A09(80, 10, 61), A09(780, 11, 92), A09(1147, 16, 9), A09(1174, 16, 1), A09(1395, 14, 112), A09(1327, 9, 86), A09(109, 8, 65), A09(192, 6, 89), A09(397, 14, 57), A09(39, 8, 107), A09(837, 6, 44), A09(1384, 6, 88), A09(185, 7, 33), A09(1068, 5, 105), A09(172, 13, 112), A09(1336, 6, 113), A09(1409, 8, 70), A09(142, 10, 108), A09(1141, 6, 102), A09(1112, 11, 73), A09(1269, 6, 118), A09(1319, 8, 56), A09(267, 4, 120), A09(1513, 5, 11), A09(1264, 5, 29), A09(727, 8, 32), A09(90, 6, 15), A09(1123, 12, 33), A09(1231, 13, 80), A09(735, 9, 37), A09(393, 4, 101), A09(1194, 9, 40), A09(384, 9, 26), A09(5, 9, 40), A09(427, 10, 66), A09(334, 10, 78), A09(765, 3, 58), A09(373, 11, 67), A09(271, 10, 111), A09(806, 8, 90), A09(1541, 6, 49), A09(870, 5, 56), A09(152, 7, 9), A09(1033, 9, 51), A09(1083, 10, 84), A09(100, 4, 102), A09(198, 21, 124), A09(814, 11, 104), A09(117, 11, 54), A09(316, 9, 110), A09(287, 22, 16), A09(232, 14, 17), A09(973, 8, 44), A09(1259, 5, 114), A09(1547, 12, 113), A09(75, 5, 95), A09(943, 4, 120), A09(1417, 8, 11)};
    }

    public static int A00(C0768Il c0768Il) {
        c0768Il.A0a(4);
        if (c0768Il.A09() == AbstractC0616Cg.A0F) {
            c0768Il.A0a(8);
            return c0768Il.A0F();
        }
        String strA09 = A09(981, 12, 3);
        if (A01[6].length() == 26) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "zJt8I7rR02Kn6vpROaQj5meT4erjWbfO";
        strArr[0] = "zJt8I7rR02Kn6vpROaQj5meT4erjWbfO";
        Log.w(strA09, A09(633, 37, 71));
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x017e A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:7:0x001c, B:9:0x0020, B:10:0x0026, B:12:0x002a, B:13:0x0039, B:15:0x003d, B:16:0x004b, B:23:0x0072, B:24:0x0081, B:26:0x0085, B:27:0x0094, B:29:0x0098, B:30:0x009e, B:32:0x00a2, B:33:0x00b1, B:35:0x00b5, B:36:0x00c4, B:38:0x00c8, B:39:0x00d6, B:41:0x00da, B:42:0x00e9, B:44:0x00ed, B:45:0x00fc, B:47:0x0100, B:48:0x010f, B:50:0x0113, B:51:0x0123, B:53:0x0127, B:54:0x0137, B:56:0x013b, B:57:0x014b, B:59:0x014f, B:60:0x015e, B:62:0x0162, B:99:0x0224, B:63:0x0168, B:65:0x0170, B:66:0x0176, B:68:0x017a, B:71:0x018d, B:73:0x0191, B:76:0x01a3, B:78:0x01a7, B:79:0x01b5, B:81:0x01b9, B:82:0x01c7, B:84:0x01cb, B:85:0x01d9, B:87:0x01dd, B:88:0x01eb, B:90:0x01ef, B:91:0x01fd, B:93:0x0201, B:94:0x020f, B:96:0x0213, B:75:0x0195, B:70:0x017e), top: B:105:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:7:0x001c, B:9:0x0020, B:10:0x0026, B:12:0x002a, B:13:0x0039, B:15:0x003d, B:16:0x004b, B:23:0x0072, B:24:0x0081, B:26:0x0085, B:27:0x0094, B:29:0x0098, B:30:0x009e, B:32:0x00a2, B:33:0x00b1, B:35:0x00b5, B:36:0x00c4, B:38:0x00c8, B:39:0x00d6, B:41:0x00da, B:42:0x00e9, B:44:0x00ed, B:45:0x00fc, B:47:0x0100, B:48:0x010f, B:50:0x0113, B:51:0x0123, B:53:0x0127, B:54:0x0137, B:56:0x013b, B:57:0x014b, B:59:0x014f, B:60:0x015e, B:62:0x0162, B:99:0x0224, B:63:0x0168, B:65:0x0170, B:66:0x0176, B:68:0x017a, B:71:0x018d, B:73:0x0191, B:76:0x01a3, B:78:0x01a7, B:79:0x01b5, B:81:0x01b9, B:82:0x01c7, B:84:0x01cb, B:85:0x01d9, B:87:0x01dd, B:88:0x01eb, B:90:0x01ef, B:91:0x01fd, B:93:0x0201, B:94:0x020f, B:96:0x0213, B:75:0x0195, B:70:0x017e), top: B:105:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.Metadata.Entry A01(com.facebook.ads.redexgen.X.C0768Il r8) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0628Ct.A01(com.facebook.ads.redexgen.X.Il):com.facebook.ads.internal.exoplayer2.metadata.Metadata$Entry");
    }

    public static ApicFrame A02(C0768Il c0768Il) {
        String strA09;
        int atomType = c0768Il.A09();
        int iA09 = c0768Il.A09();
        int i2 = AbstractC0616Cg.A0F;
        String strA092 = A09(981, 12, 3);
        if (iA09 != i2) {
            String[] strArr = A01;
            if (strArr[1].charAt(22) == strArr[7].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "7eph1fLTh2YVQj3q7V4mBddTy7HaxieF";
            strArr2[0] = "7eph1fLTh2YVQj3q7V4mBddTy7HaxieF";
            Log.w(strA092, A09(492, 35, 106));
            return null;
        }
        int fullVersionInt = AbstractC0616Cg.A00(c0768Il.A09());
        if (fullVersionInt == 13) {
            strA09 = A09(1669, 10, 49);
        } else {
            strA09 = fullVersionInt == 14 ? A09(1679, 9, 92) : null;
        }
        if (strA09 == null) {
            StringBuilder sb = new StringBuilder();
            String mimeType = A09(1596, 30, 125);
            sb.append(mimeType);
            sb.append(fullVersionInt);
            String mimeType2 = sb.toString();
            Log.w(strA092, mimeType2);
            return null;
        }
        c0768Il.A0a(4);
        byte[] bArr = new byte[atomType - 16];
        c0768Il.A0d(bArr, 0, bArr.length);
        return new ApicFrame(strA09, null, 3, bArr);
    }

    public static CommentFrame A03(int atomSize, C0768Il c0768Il) {
        int iA09 = c0768Il.A09();
        if (c0768Il.A09() == AbstractC0616Cg.A0F) {
            c0768Il.A0a(8);
            String strA0S = c0768Il.A0S(iA09 - 16);
            return new CommentFrame(A09(1744, 3, 3), strA0S, strA0S);
        }
        Log.w(A09(981, 12, 3), A09(457, 35, 20) + AbstractC0616Cg.A02(atomSize));
        return null;
    }

    public static Id3Frame A04(int value, String str, C0768Il c0768Il, boolean z, boolean z2) {
        int iA00 = A00(c0768Il);
        if (z2) {
            String[] strArr = A01;
            if (strArr[1].charAt(22) == strArr[7].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "GljOgddo2S5PTONVqYc6TLRbjc7vNKoR";
            strArr2[4] = "GljOgddo2S5PTONVqYc6TLRbjc7vNKoR";
            iA00 = Math.min(1, iA00);
        }
        if (iA00 >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, Integer.toString(iA00));
            }
            return new CommentFrame(A09(1744, 3, 3), str, Integer.toString(iA00));
        }
        Log.w(A09(981, 12, 3), A09(670, 33, 84) + AbstractC0616Cg.A02(value));
        return null;
    }

    public static Id3Frame A05(C0768Il c0768Il, int i2) {
        String strA0S = null;
        String strA0S2 = null;
        int atomPosition = -1;
        int atomSize = -1;
        while (c0768Il.A07() < i2) {
            int iA07 = c0768Il.A07();
            int iA09 = c0768Il.A09();
            int iA092 = c0768Il.A09();
            c0768Il.A0a(4);
            int atomType = AbstractC0616Cg.A0e;
            if (iA092 == atomType) {
                int atomType2 = iA09 - 12;
                strA0S = c0768Il.A0S(atomType2);
            } else {
                int atomType3 = AbstractC0616Cg.A0o;
                if (iA092 == atomType3) {
                    int atomType4 = iA09 - 12;
                    strA0S2 = c0768Il.A0S(atomType4);
                } else {
                    int atomType5 = AbstractC0616Cg.A0F;
                    if (iA092 == atomType5) {
                        atomPosition = iA07;
                        atomSize = iA09;
                    }
                    int atomType6 = iA09 - 12;
                    c0768Il.A0a(atomType6);
                }
            }
        }
        if (strA0S != null && strA0S2 != null && atomPosition != -1) {
            c0768Il.A0Z(atomPosition);
            c0768Il.A0a(16);
            int atomType7 = atomSize - 16;
            return new InternalFrame(strA0S, strA0S2, c0768Il.A0S(atomType7));
        }
        if (A01[0].charAt(23) != 'T') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "CXapLAnRFGrcKvV6tyGgZCOTEzfo7Q4K";
        strArr[0] = "CXapLAnRFGrcKvV6tyGgZCOTEzfo7Q4K";
        return null;
    }

    public static TextInformationFrame A06(int atomSize, String str, C0768Il c0768Il) {
        int iA09 = c0768Il.A09();
        if (c0768Il.A09() == AbstractC0616Cg.A0F && iA09 >= 22) {
            c0768Il.A0a(10);
            int iA0J = c0768Il.A0J();
            if (iA0J > 0) {
                String value = A09(0, 0, 20) + iA0J;
                int iA0J2 = c0768Il.A0J();
                if (iA0J2 > 0) {
                    value = value + A09(4, 1, 67) + iA0J2;
                }
                return new TextInformationFrame(str, null, value);
            }
        }
        Log.w(A09(981, 12, 3), A09(527, 39, 49) + AbstractC0616Cg.A02(atomSize));
        return null;
    }

    public static TextInformationFrame A07(int atomSize, String str, C0768Il c0768Il) {
        int iA09 = c0768Il.A09();
        if (c0768Il.A09() == AbstractC0616Cg.A0F) {
            c0768Il.A0a(8);
            return new TextInformationFrame(str, null, c0768Il.A0S(iA09 - 16));
        }
        Log.w(A09(981, 12, 3), A09(601, 32, 115) + AbstractC0616Cg.A02(atomSize));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame A08(com.facebook.ads.redexgen.X.C0768Il r5) {
        /*
            int r2 = A00(r5)
            r5 = 0
            if (r2 <= 0) goto L21
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0628Ct.A0V
            int r0 = r1.length
            if (r2 > r0) goto L21
            int r0 = r2 + (-1)
            r4 = r1[r0]
        L10:
            if (r4 == 0) goto L23
            com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame r3 = new com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame
            r2 = 1441(0x5a1, float:2.019E-42)
            r1 = 4
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = A09(r2, r1, r0)
            r3.<init>(r0, r5, r4)
            return r3
        L21:
            r4 = r5
            goto L10
        L23:
            r2 = 981(0x3d5, float:1.375E-42)
            r1 = 12
            r0 = 3
            java.lang.String r3 = A09(r2, r1, r0)
            r2 = 566(0x236, float:7.93E-43)
            r1 = 35
            r0 = 97
            java.lang.String r0 = A09(r2, r1, r0)
            android.util.Log.w(r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0628Ct.A08(com.facebook.ads.redexgen.X.Il):com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame");
    }
}

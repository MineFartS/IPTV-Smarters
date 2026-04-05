package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JT {
    public static JT A01;
    public static byte[] A02;
    public static String[] A03;
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0M(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 46);
            i5++;
        }
    }

    public static void A0X() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, 127, 101, 120, 127, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, 127, 106, 92, 70, DateTimeFieldType.MINUTE_OF_HOUR, 68, 90, 95, 95, DateTimeFieldType.MINUTE_OF_HOUR, 81, 86, DateTimeFieldType.MINUTE_OF_HOUR, 71, 82, 88, 86, 93, DateTimeFieldType.MINUTE_OF_HOUR, 71, 92, DateTimeFieldType.MINUTE_OF_HOUR, 82, 93, 92, 71, 91, 86, 65, DateTimeFieldType.MINUTE_OF_HOUR, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, 29, 6, DateTimeFieldType.HOUR_OF_DAY, 25, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, 12, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, 127, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, 28, 32, 47, 42, 32, 40, 48, 28, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, 28, 48, 55, 38, 51, 28, 32, 34, 45, 32, 38, 47, 28, 33, 54, 55, 55, 44, 45, 28, 55, 38, 59, 55, 25, 27, 27, DateTimeFieldType.HOUR_OF_DAY, 28, 29, DateTimeFieldType.MILLIS_OF_DAY, 12, 25, DateTimeFieldType.SECOND_OF_DAY, 39, 27, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 27, DateTimeFieldType.MINUTE_OF_HOUR, 11, 39, 27, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, 30, DateTimeFieldType.HOUR_OF_DAY, 31, 86, 12, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_SECOND, 39, 11, 12, 29, 8, 39, 27, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, 30, DateTimeFieldType.HOUR_OF_DAY, 10, DateTimeFieldType.SECOND_OF_MINUTE, 39, 26, DateTimeFieldType.HALFDAY_OF_DAY, 12, 12, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, 39, 12, 29, 0, 12, 3, 1, 1, 11, 6, 7, 12, DateTimeFieldType.MILLIS_OF_DAY, 3, DateTimeFieldType.HOUR_OF_HALFDAY, 61, 1, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 1, 9, DateTimeFieldType.HOUR_OF_DAY, 61, 1, DateTimeFieldType.HALFDAY_OF_DAY, 12, 4, 11, 5, 76, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HALFDAY_OF_DAY, 61, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 7, DateTimeFieldType.MINUTE_OF_DAY, 61, 1, DateTimeFieldType.HALFDAY_OF_DAY, 12, 4, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.HALFDAY_OF_DAY, 12, 68, 70, 70, 76, 65, 64, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, 11, 81, 82, 74, 122, 86, 81, 64, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, 30, 28, 28, DateTimeFieldType.MILLIS_OF_DAY, 27, 26, DateTimeFieldType.HOUR_OF_DAY, 11, 30, DateTimeFieldType.MINUTE_OF_HOUR, 32, 28, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_DAY, 28, DateTimeFieldType.SECOND_OF_DAY, 12, 32, 28, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 25, DateTimeFieldType.MILLIS_OF_DAY, 24, 81, 11, 8, DateTimeFieldType.CLOCKHOUR_OF_DAY, 32, 12, 11, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 32, 28, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 25, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 30, 11, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 32, 11, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.MINUTE_OF_HOUR, 26, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, 127, 96, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 24, 1, 41, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 6, 2, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_DAY, 26, DateTimeFieldType.MINUTE_OF_HOUR, 41, 5, 2, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, 29, 2, 4, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 41, 26, DateTimeFieldType.MINUTE_OF_HOUR, 24, DateTimeFieldType.HOUR_OF_DAY, 2, 30, 63, 58, 48, 41, 1, 63, 48, 58, 44, 49, 55, 58, 1, 63, 50, 50, 49, 41, 1, 50, 49, 63, 58, 1, 58, 43, 44, 55, 48, 57, 1, 45, 54, 49, 41, 55, 48, 57, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 122, 116, 121, 123, 115, 116, 113, 107, 108, 125, 124, 71, 113, 118, 108, 125, 118, 108, 71, 109, 106, 116, 71, 104, 106, 125, 126, 113, 96, 125, 107, 31, 26, DateTimeFieldType.CLOCKHOUR_OF_DAY, 9, 33, 31, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26, 12, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 26, 33, 29, 31, 29, DateTimeFieldType.MILLIS_OF_DAY, 27, 33, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 26, 11, DateTimeFieldType.MINUTE_OF_DAY, 27, 33, DateTimeFieldType.MINUTE_OF_HOUR, 31, 6, 33, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 4, 27, 46, 43, 33, 56, DateTimeFieldType.CLOCKHOUR_OF_DAY, 46, 33, 43, 61, 32, 38, 43, DateTimeFieldType.CLOCKHOUR_OF_DAY, 44, 46, 44, 39, 42, DateTimeFieldType.CLOCKHOUR_OF_DAY, 34, 32, 43, 58, 35, 42, DateTimeFieldType.CLOCKHOUR_OF_DAY, 61, 42, 59, 61, 54, DateTimeFieldType.CLOCKHOUR_OF_DAY, 35, 38, 34, 38, 59, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 60, 48, 50, 47, 45, 58, 44, 44, 0, 54, 50, 62, 56, 58, 44, 0, 59, 42, 45, 54, 49, 56, 0, 59, 48, 40, 49, 51, 48, 62, 59, 112, 117, 127, 102, 78, 112, 127, 117, 99, 126, 120, 117, 78, 117, 116, 119, 112, 100, 125, 101, 78, 112, 98, 98, 116, 101, 78, 97, 99, 116, 125, 126, 112, 117, 78, 98, 120, 107, 116, 78, 115, 104, 101, 116, 98, 33, 36, 46, 55, 31, 33, 46, 36, 50, 47, 41, 36, 31, 36, 41, 51, 33, 34, 44, 37, 31, 48, 44, 33, 57, 33, 34, 44, 37, 31, 48, 50, 37, 35, 33, 35, 40, 37, 5, 0, 10, DateTimeFieldType.MINUTE_OF_HOUR, 59, 5, 10, 0, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.HALFDAY_OF_DAY, 0, 59, 1, 10, 5, 6, 8, 1, 59, 10, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 1, 59, 2, DateTimeFieldType.HOUR_OF_DAY, 10, 10, 1, 8, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 116, 115, 123, 126, 77, 125, 124, 77, 101, 119, 112, 100, 123, 119, 101, 77, 119, 96, 96, 125, 96, 97, 28, 25, DateTimeFieldType.MINUTE_OF_HOUR, 10, 34, 28, DateTimeFieldType.MINUTE_OF_HOUR, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 25, 34, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 28, 26, 24, 34, 30, 28, 30, DateTimeFieldType.SECOND_OF_MINUTE, 24, 34, DateTimeFieldType.HOUR_OF_HALFDAY, 9, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, 34, 31, 4, 9, 24, 34, 30, DateTimeFieldType.MINUTE_OF_DAY, 8, DateTimeFieldType.MINUTE_OF_HOUR, 9, 69, 64, 74, 83, 123, 69, 74, 64, 86, 75, 77, 64, 123, 73, 65, 73, 75, 86, 93, 123, 75, 84, 80, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 109, 114, 99, 95, 105, 109, 112, 114, 101, 115, 115, 105, 111, 110, 95, 102, 111, 114, 95, 110, 97, 116, 105, 118, 101, 95, 118, 105, 100, 101, 111, 95, 97, 100, 115, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 75, 84, 69, 121, 79, 75, 86, 84, 67, 85, 85, 79, 73, 72, 121, 64, 73, 84, 121, 72, 71, 82, 79, 80, 67, 121, 80, 79, 66, 67, 73, 121, 71, 66, 85, 121, 80, DateTimeFieldType.SECOND_OF_DAY, 126, 123, 113, 104, 64, 126, 113, 123, 109, 112, 118, 123, 64, 113, 122, 107, 104, 112, 109, 116, 64, 123, 122, 121, 126, 106, 115, 107, 64, 124, 112, 113, 113, 122, 124, 107, 118, 112, 113, 
        64, 107, 118, 114, 122, 112, 106, 107, 64, 114, 108, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 114, 121, 104, 107, 115, 110, 119, 67, 120, 121, 122, 125, 105, 112, 104, 67, 110, 121, 125, 120, 67, 104, 117, 113, 121, 115, 105, 104, 67, 113, 111, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 56, 51, 34, 33, 57, 36, 61, 9, 50, 51, 48, 55, 35, 58, 34, 9, 36, 51, 34, 36, 63, 51, 37, 9, 56, 35, 59, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 95, 84, 69, 70, 94, 67, 90, 110, 85, 84, 87, 80, 68, 93, 69, 110, 69, 89, 67, 94, 69, 69, 93, 84, 110, 69, 88, 92, 84, 94, 68, 69, 110, 92, 66, 12, 9, 3, 26, 50, 12, 3, 9, 31, 2, 4, 9, 50, 3, 8, 25, 26, 2, 31, 6, 50, 9, 8, 11, 12, 24, 1, 25, 50, 25, 4, 0, 8, 2, 24, 25, 50, 0, 30, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, 107, 124, 105, 118, 107, 109, 70, 105, 107, 124, 106, 124, 119, 109, 120, 109, 112, 118, 119, 70, 124, 107, 107, 118, 107, 70, 110, 113, 124, 119, 70, 119, 118, 70, 112, 116, 105, 107, 124, 106, 106, 112, 118, 119, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 121, 110, 123, 100, 121, 127, 84, 123, 121, 110, 120, 110, 101, 127, 106, 127, 98, 100, 101, 84, 110, 121, 121, 100, 121, 120, 84, 98, 101, 120, 127, 110, 106, 111, 84, 100, 109, 84, 98, 101, 127, 110, 121, 101, 106, 103, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 5, 28, 52, 10, 5, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, 4, 2, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 52, 30, 9, 29, 25, 8, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26, 3, 43, DateTimeFieldType.SECOND_OF_MINUTE, 26, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, 27, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 43, 1, 7, DateTimeFieldType.HOUR_OF_DAY, 43, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_SECOND, 28, DateTimeFieldType.HOUR_OF_DAY, 43, 25, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, 1, 24, DateTimeFieldType.HOUR_OF_DAY, 43, DateTimeFieldType.MINUTE_OF_DAY, 27, 6, 43, 29, 25, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 7, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 126, 120, 110, 84, 120, 127, 110, 106, 102, 98, 101, 108, 84, 98, 102, 106, 108, 110, 84, 111, 110, 104, 100, 111, 98, 101, 108, 43, 46, 36, 61, DateTimeFieldType.SECOND_OF_MINUTE, 43, 36, 46, 56, 37, 35, 46, DateTimeFieldType.SECOND_OF_MINUTE, 61, 34, 35, 62, 47, 38, 35, 57, 62, 47, 46, DateTimeFieldType.SECOND_OF_MINUTE, 35, 36, 62, 47, 36, 62, DateTimeFieldType.SECOND_OF_MINUTE, 63, 56, 38, DateTimeFieldType.SECOND_OF_MINUTE, 58, 56, 47, 44, 35, 50, 47, 57, 71, 66, 72, 81, 121, 68, 71, 72, 72, 67, 84, 121, 72, 73, 82, 79, 64, 95, 121, 71, 66, 121, 74, 73, 71, 66, 67, 66, 121, 73, 72, 121, 71, 85, 85, 67, 82, 85, 121, 74, 73, 71, 66, 67, 66, 121, 124, 118, 111, 71, 122, 125, 118, 123, 112, 117, 121, 106, 115, 71, 106, 125, 104, 119, 106, 108, 71, 113, 118, 108, 125, 106, 110, 121, 116, 71, 117, 107, 103, 98, 104, 113, 89, 100, 106, 105, 101, 109, 89, 106, 105, 101, 109, 117, 101, 116, 99, 99, 104, 124, 121, 115, 106, 66, 126, 111, 124, 110, 117, 66, 110, 117, 116, 120, 113, 121, 66, 120, 115, 124, 127, 113, 120, 121, 56, 61, 55, 46, 6, 58, 45, 56, 6, 56, 55, 48, 52, 56, 45, 48, 54, 55, 6, 61, 60, 53, 56, 32, 6, 52, 42, 86, 83, 89, 64, 104, 84, 67, 86, 104, 90, 94, 89, 104, 68, 84, 86, 91, 82, 104, 86, 89, 94, 90, 86, 67, 94, 88, 89, 104, 71, 82, 69, 84, 82, 89, 67, 86, 80, 82, 91, 94, 84, 77, 101, 94, 85, 101, 84, 85, 78, 101, 72, 95, 86, 85, 91, 94, 101, 83, 84, 78, 95, 72, 73, 78, 83, 78, 83, 91, 86, 101, 91, 94, 91, 74, 78, 95, 72, 52, 49, 59, 34, 10, 48, 59, 52, 55, 57, 48, 10, 52, 32, 33, 58, 10, 49, 48, 38, 33, 39, 58, 44, 10, 57, 48, 52, 62, 38, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 1, 24, 48, 10, 1, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 3, 10, 48, DateTimeFieldType.HALFDAY_OF_DAY, 6, 11, 11, 10, 29, 48, 27, 0, 4, 10, 1, 48, 6, 1, 9, 0, 109, 104, 98, 123, 83, 105, 98, 109, 110, 96, 105, 83, 104, 105, 110, 121, 107, 83, 99, 122, 105, 126, 96, 109, 117, 58, 63, 53, 44, 4, 62, 53, 58, 57, 55, 62, 4, 62, 35, 52, 43, 55, 58, 34, 62, 41, 4, 56, 58, 56, 51, 62, 35, 38, 44, 53, 29, 39, 44, 35, 32, 46, 39, 29, 39, 58, 45, 50, 46, 35, 59, 39, 48, 29, 52, 112, 91, 94, 84, 77, 101, 95, 84, 91, 88, 86, 95, 101, 92, 79, 84, 84, 95, 86, 45, 40, 34, 59, DateTimeFieldType.MINUTE_OF_HOUR, 41, 34, 45, 46, 32, 41, DateTimeFieldType.MINUTE_OF_HOUR, 37, 45, 46, 7, 2, 8, DateTimeFieldType.HOUR_OF_DAY, 57, 3, 8, 7, 4, 10, 3, 57, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 3, 57, 30, 57, 9, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 57, 8, 9, 8, 57, 0, DateTimeFieldType.MINUTE_OF_HOUR, 10, 10, DateTimeFieldType.SECOND_OF_MINUTE, 5, DateTimeFieldType.SECOND_OF_DAY, 3, 3, 8, 57, 9, 8, 57, DateTimeFieldType.SECOND_OF_MINUTE, 2, DateTimeFieldType.HALFDAY_OF_DAY, 41, 44, 38, 63, DateTimeFieldType.MILLIS_OF_SECOND, 45, 38, 41, 42, 36, 45, DateTimeFieldType.MILLIS_OF_SECOND, 38, 45, 60, 63, 39, 58, 35, 114, 119, 125, 100, 76, 118, 125, 114, 113, 127, 118, 76, 124, 127, 119, 76, 96, 106, 125, 112, 76, 112, 114, 127, 127, 122, 127, 117, 108, 68, 126, 117, 122, 121, 119, 126, 68, 107, 105, 126, 119, 116, 122, 127, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26, 3, 43, DateTimeFieldType.HOUR_OF_DAY, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_DAY, 24, DateTimeFieldType.HOUR_OF_DAY, 43, 6, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 43, 7, 28, DateTimeFieldType.SECOND_OF_MINUTE, 31, DateTimeFieldType.HOUR_OF_DAY, 91, 94, 84, 77, 101, 95, 84, 91, 88, 86, 95, 101, 73, 67, 84, 89, 51, 54, 60, 37, DateTimeFieldType.HALFDAY_OF_DAY, 52, 59, 62, 38, 55, 32, DateTimeFieldType.HALFDAY_OF_DAY, 48, 59, 54, 54, 
        59, 60, 53, DateTimeFieldType.HALFDAY_OF_DAY, 38, 61, 57, 55, 60, 35, 38, 44, 53, 29, 43, 44, 54, 39, 48, 49, 54, 43, 54, 43, 35, 46, 29, 44, 39, 53, 29, 43, 47, 35, 37, 39, 29, 38, 39, 49, 43, 37, 44, 26, 31, DateTimeFieldType.SECOND_OF_MINUTE, 12, 36, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, 9, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 26, DateTimeFieldType.MILLIS_OF_SECOND, 36, 8, 10, DateTimeFieldType.HOUR_OF_HALFDAY, 26, 9, 30, 36, 12, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, DateTimeFieldType.MINUTE_OF_HOUR, 36, 26, DateTimeFieldType.SECOND_OF_MINUTE, 31, 36, 25, 9, DateTimeFieldType.SECOND_OF_DAY, 12, 8, 30, 36, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 26, 66, 71, 77, 84, 124, 79, 76, 68, 68, 74, 77, 68, 124, 70, 77, 71, 83, 76, 74, 77, 87, 124, 83, 81, 70, 69, 74, 91, 52, 49, 59, 34, 10, 59, 52, 33, 60, 35, 48, 10, 54, 52, 39, 58, 32, 38, 48, 57, 10, 54, 58, 56, 37, 52, 54, 33, 10, 33, 61, 39, 48, 38, 61, 58, 57, 49, 37, 32, 42, 51, 27, 42, 37, 48, 45, 50, 33, 27, 50, 45, 33, 51, 27, 55, 42, 37, 52, 55, 44, 43, 48, 27, 40, 43, 35, 35, 45, 42, 35, 27, 33, 42, 37, 38, 40, 33, 32, 89, 92, 86, 79, 103, 86, 93, 79, 103, 84, 89, 86, 92, 75, 91, 89, 72, 93, 103, 93, 86, 92, 91, 89, 74, 92, 87, 82, 88, 65, 105, 89, 88, 82, 83, 64, 95, 85, 83, 105, 94, 95, 69, 66, 89, 68, 79, 105, 82, 87, 66, 87, 105, 83, 88, 87, 84, 90, 83, 82, 58, 63, 53, 44, 4, 43, 55, 58, 34, 58, 57, 55, 62, 4, 56, 55, 50, 56, 48, 4, 54, 58, 35, 4, 63, 62, 55, 58, 34, 4, 54, 40, 47, 42, 32, 57, DateTimeFieldType.HOUR_OF_DAY, 62, 34, 47, 55, 47, 44, 34, 43, 61, DateTimeFieldType.HOUR_OF_DAY, 34, 33, 41, 41, 39, 32, 41, DateTimeFieldType.HOUR_OF_DAY, 43, 32, 47, 44, 34, 43, 42, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 5, 28, 52, 27, 7, 10, DateTimeFieldType.MINUTE_OF_DAY, 10, 9, 7, DateTimeFieldType.HOUR_OF_HALFDAY, 24, 52, 5, DateTimeFieldType.HOUR_OF_HALFDAY, 28, 52, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 24, 2, 12, 5, 65, 68, 78, 87, 127, 80, 76, 65, 89, 65, 66, 76, 69, 83, 127, 83, 72, 79, 87, 127, 69, 78, 68, 67, 65, 82, 68, 94, 91, 81, 72, 96, 79, 77, 90, 73, 90, 81, 75, 96, 79, 83, 94, 70, 94, 93, 83, 90, 96, 94, 74, 75, 80, 96, 92, 83, 86, 92, 84, 24, 29, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_HALFDAY, 38, 9, 12, 11, 30, 28, 38, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 38, 77, 72, 74, 38, 11, 28, 10, 9, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 10, 28, DateTimeFieldType.HALFDAY_OF_DAY, 8, 2, 27, 51, 30, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, 1, 28, 25, 24, 9, 51, DateTimeFieldType.HOUR_OF_HALFDAY, 24, 51, DateTimeFieldType.HALFDAY_OF_DAY, 10, 24, 9, 30, 51, 9, DateTimeFieldType.SECOND_OF_DAY, 24, 30, DateTimeFieldType.HALFDAY_OF_DAY, 31, 51, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, DateTimeFieldType.HALFDAY_OF_DAY, 2, 11, 9, 77, 72, 66, 91, 115, 94, 73, 65, 67, 90, 73, 115, 68, 73, 77, 72, 64, 69, 66, 73, 115, 74, 67, 94, 115, 77, 72, 115, 72, 73, 88, 77, 69, 64, 95, 27, 30, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 37, 8, 12, 37, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 28, 28, 31, 8, 37, 25, DateTimeFieldType.MINUTE_OF_DAY, 31, 25, DateTimeFieldType.HOUR_OF_DAY, 37, 31, DateTimeFieldType.SECOND_OF_DAY, 27, 24, DateTimeFieldType.MILLIS_OF_DAY, 31, 30, 100, 97, 107, 114, 90, 119, 115, 90, 117, 105, 100, 124, 103, 100, 102, 110, 90, 102, 119, 100, 118, 109, 90, 99, 100, 105, 105, 103, 100, 102, 110, 79, 74, 64, 89, 113, 93, 70, 65, 91, 66, 74, 113, 79, 74, 74, 113, 75, 86, 90, 75, 64, 93, 71, 65, 64, 113, 90, 65, 113, 94, 66, 79, 87, 79, 76, 66, 75, 93, 96, 101, 111, 118, 94, 114, 105, 110, 116, 109, 101, 94, 98, 109, 100, 96, 115, 94, 103, 100, 96, 117, 116, 115, 100, 94, 98, 110, 111, 103, 104, 102, 94, 110, 111, 94, 98, 115, 96, 114, 105, 100, 114, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 10, 0, 25, 49, 29, 6, 1, 27, 2, 10, 49, 7, 9, 0, 1, 28, 11, 49, 10, 11, 29, 26, 28, 1, DateTimeFieldType.MILLIS_OF_SECOND, 49, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2, 2, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 27, 2, 42, 6, 29, 26, 0, 25, DateTimeFieldType.HOUR_OF_DAY, 42, 28, 27, DateTimeFieldType.MILLIS_OF_DAY, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, 1, 42, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 1, 7, 12, 42, DateTimeFieldType.MILLIS_OF_DAY, 26, 0, 27, 1, DateTimeFieldType.CLOCKHOUR_OF_DAY, 7, 42, 26, 27, 42, DateTimeFieldType.CLOCKHOUR_OF_DAY, 24, 5, 1, 12, 42, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, 5, 26, 27, 6, DateTimeFieldType.CLOCKHOUR_OF_DAY, 117, 112, 122, 99, 75, 103, 124, 123, 97, 120, 112, 75, 125, 122, 125, 96, 75, 114, 102, 123, 121, 75, 119, 123, 122, 96, 113, 122, 96, 75, 100, 102, 123, 98, 125, 112, 113, 102, 121, 124, 118, 111, 71, 107, 112, 119, 109, 116, 124, 71, 113, 118, 113, 108, 71, 119, 118, 71, 123, 116, 121, 107, 107, 71, 116, 119, 121, 124, 113, 118, 127, 123, 126, 116, 109, 69, 105, 114, 117, 111, 118, 126, 69, 118, 117, 125, 69, 123, 105, 105, 127, 110, 69, 111, 104, 118, 43, 46, 36, 61, DateTimeFieldType.SECOND_OF_MINUTE, 57, 34, 37, 63, 38, 46, DateTimeFieldType.SECOND_OF_MINUTE, 58, 56, 47, 41, 37, 39, 58, 63, 62, 47, DateTimeFieldType.SECOND_OF_MINUTE, 40, 35, 46, 46, 47, 56, DateTimeFieldType.SECOND_OF_MINUTE, 62, 37, 33, 47, 36, 56, 61, 55, 46, 6, 42, 49, 54, 46, 6, 56, 41, 41, 6, 48, 55, 42, 45, 56, 53, 53, 6, 56, 61, 6, 61, 60, 45, 56, 48, 53, 42, 109, 104, 98, 123, 83, 127, 120, 109, 111, 103, 120, 126, 109, 111, 105, 83, 107, 126, 99, 121, 124, 101, 98, 107, 83, 105, 98, 109, 110, 96, 105, 104, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 5, 28, 52, 24, 28, 10, 27, 52, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 27, 4, 25, 31, 52, 10, 5, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 52, 8, 7, 4, 24, DateTimeFieldType.HOUR_OF_HALFDAY, 100, 97, 107, 114, 90, 118, 124, 107, 102, 90, 100, 99, 113, 96, 119, 90, 100, 97, 90, 105, 106, 100, 97, 0, 5, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_DAY, 62, DateTimeFieldType.MINUTE_OF_DAY, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2, 62, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 5, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 62, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 4, 7, 8, 25, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 24, 1, 41, 2, 31, 27, 
        DateTimeFieldType.MINUTE_OF_HOUR, 41, 2, 25, 41, 1, DateTimeFieldType.MILLIS_OF_SECOND, 31, 2, 41, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 4, 41, 0, 31, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 25, 41, 6, 26, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 41, 27, 5, 52, 49, 59, 34, 10, 33, 60, 56, 48, 10, 33, 58, 10, 34, 52, 60, 33, 10, 51, 58, 39, 10, 35, 60, 49, 48, 58, 10, 37, 39, 48, 37, 52, 39, 48, 49, 10, 56, 38, 81, 84, 94, 71, 111, 68, 89, 93, 85, 95, 69, 68, 111, 66, 85, 71, 81, 66, 84, 85, 84, 111, 70, 89, 84, 85, 95, 115, 118, 124, 101, 77, 102, 96, 123, 117, 117, 119, 96, 77, 124, 115, 102, 123, 100, 119, 77, 96, 119, 117, 123, 97, 102, 119, 96, 77, 100, 123, 119, 101, 77, 119, 96, 96, 125, 96, 77, 113, 115, 126, 126, 112, 115, 113, 121, 61, 56, 50, 43, 3, 41, 50, 53, 45, 41, 57, 3, 56, 62, 3, 50, 61, 49, 57, 3, 44, 57, 46, 3, 44, 46, 51, 63, 57, 47, 47, 71, 66, 72, 81, 121, 83, 85, 67, 121, 71, 86, 86, 121, 79, 72, 85, 82, 71, 74, 74, 121, 82, 73, 73, 74, 68, 71, 84, 99, 102, 108, 117, 93, 119, 113, 103, 93, 97, 99, 97, 106, 103, 102, 93, 103, 122, 103, 97, 119, 118, 109, 112, 93, 100, 109, 112, 93, 108, 103, 118, 117, 109, 112, 105, 58, 63, 53, 44, 4, 46, 40, 62, 4, 56, 58, 56, 51, 62, 63, 4, 62, 35, 62, 56, 46, 47, 52, 41, 4, 50, 53, 4, 56, 58, 56, 51, 62, 4, 54, 58, 53, 58, 60, 62, 41, 121, 124, 118, 111, 71, 109, 107, 125, 71, 106, 113, 104, 104, 116, 125, 71, 121, 118, 113, 117, 121, 108, 113, 119, 118, 34, 39, 45, 52, 28, 53, 42, 38, 52, 34, 33, 42, 47, 42, 55, 58, 28, 32, 43, 38, 32, 40, 28, 34, 49, 38, 34, 28, 33, 34, 48, 38, 39, 25, DateTimeFieldType.HALFDAY_OF_DAY, 12, DateTimeFieldType.MILLIS_OF_SECOND, 10, DateTimeFieldType.MILLIS_OF_SECOND, 12, 25, 12, 29, 39, 28, DateTimeFieldType.HOUR_OF_DAY, 11, 25, 26, DateTimeFieldType.SECOND_OF_DAY, 29, 28, 94, 74, 75, 80, 77, 80, 75, 94, 75, 90, 96, 90, 81, 94, 93, 83, 90, 91, 46, 33, 36, 46, 38, 42, 56, 44, 63, 41, DateTimeFieldType.MINUTE_OF_DAY, 57, 36, 32, 40, DateTimeFieldType.MINUTE_OF_DAY, 32, 62, 34, 46, 44, 111, 39, 32, 34, 36, 35, 46, 46, 42, 111, 32, 37, 50, 111, 7, 4, 0, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 4, 30, 2, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 7, 8, 6, 113, 117, 114, 117, 113, 105, 113, 67, 121, 112, 125, 108, 111, 121, 120, 67, 104, 117, 113, 121, 67, 125, 122, 104, 121, 110, 67, 117, 113, 108, 110, 121, 111, 111, 117, 115, 114, 75, 80, 73, 73, 49, 38, 48, 55, 49, 42, 32, 55, 38, 39, 28, 39, 34, 55, 34, 28, 51, 49, 44, 32, 38, 48, 48, 42, 45, 36, 28, 32, 44, 46, 33, 42, 45, 34, 55, 42, 44, 45, 48, 24, 31, 10, 8, 0, 52, 31, 25, 10, 8, DateTimeFieldType.HOUR_OF_HALFDAY, 52, 24, 10, 6, 27, 7, DateTimeFieldType.HOUR_OF_HALFDAY, 52, 25, 10, 31, DateTimeFieldType.HOUR_OF_HALFDAY, 57, 38, 43, 42, 32, DateTimeFieldType.CLOCKHOUR_OF_DAY, 46, 33, 43, DateTimeFieldType.CLOCKHOUR_OF_DAY, 42, 33, 43, 44, 46, 61, 43, DateTimeFieldType.CLOCKHOUR_OF_DAY, 46, 58, 59, 32, 61, 32, 59, 46, 59, 42, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_SECOND};
    }

    public static void A0Y() {
        A03 = new String[]{"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    }

    static {
        A0Y();
        A0X();
        A04 = new String[0];
        A05 = new String[]{A0M(86, 5, 14), A0M(65, 9, 115), A0M(74, 12, 88)};
    }

    public JT(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0M(3390, 31, 111), context), 0);
    }

    public static float A00(Context context) {
        return A0L(context).A1h(A0M(1591, 39, 25), 0.98f);
    }

    public static int A01(Context context) {
        return A0L(context).A1i(A0M(417, 33, 88), 100);
    }

    public static int A02(Context context) {
        return A0L(context).A1i(A0M(1485, 33, 54), 0);
    }

    public static int A03(Context context) {
        return A0L(context).A1i(A0M(1564, 27, 119), -1);
    }

    public static int A04(Context context) {
        return A0L(context).A1i(A0M(566, 37, 97), 3);
    }

    public static int A05(Context context) {
        return A0L(context).A1i(A0M(3372, 18, 99), 0);
    }

    public static int A06(Context context) {
        return A0L(context).A1i(A0M(961, 50, 49), 30000);
    }

    public static int A07(Context context) {
        return A0L(context).A1i(A0M(1055, 40, 120), 3);
    }

    public static int A08(Context context) {
        return A0L(context).A1i(A0M(1011, 44, 50), 8000);
    }

    public static int A09(Context context) {
        return A0L(context).A1i(A0M(1095, 48, 31), 100);
    }

    public static int A0A(Context context) {
        return A0L(context).A1i(A0M(1143, 39, 67), DateTimeConstants.MILLIS_PER_MINUTE);
    }

    public static int A0B(Context context) {
        return A0L(context).A1i(A0M(2116, 38, 123), 225);
    }

    public static int A0C(Context context) {
        return A0L(context).A1i(A0M(798, 41, 83), 3145728);
    }

    public static int A0D(Context context) {
        return A0L(context).A1i(A0M(3421, 37, 50), -1);
    }

    public static int A0E(Context context) {
        return A0L(context).A1i(A0M(2255, 32, 117), AdError.SERVER_ERROR_CODE);
    }

    public static int A0F(Context context) {
        return A0L(context).A1i(A0M(371, 46, 43), -1);
    }

    public static int A0G(Context context) {
        return A0L(context).A1i(A0M(3501, 23, 69), 0);
    }

    public static int A0H(Context context) {
        return A0L(context).A1i(A0M(2992, 35, 88), 1000);
    }

    public static int A0I(Context context) {
        return A0L(context).A1i(A0M(3027, 39, 123), 3000);
    }

    public static long A0J(Context context) {
        return A0L(context).A1j(A0M(532, 34, 80), 67108864L);
    }

    public static long A0K(Context context) {
        return A0L(context).A1j(A0M(647, 45, 63), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public static synchronized JT A0L(Context context) {
        if (A01 == null) {
            A01 = new JT(context);
        }
        return A01;
    }

    public static String A0N(Context context) {
        return A0L(context).A1k(A0M(2088, 28, 13), A0M(3552, 3, 78));
    }

    public static String A0O(Context context) {
        return A0L(context).A1k(A0M(2967, 25, 79), A0M(3552, 3, 78));
    }

    public static String A0P(Context context) {
        return A0L(context).A1k(A0M(117, 52, 109), A0M(1, 6, 36));
    }

    public static String A0Q(Context context) {
        return A0L(context).A1k(A0M(268, 51, 11), A0M(24, 41, 29));
    }

    public static String A0R(Context context) {
        return A0L(context).A1k(A0M(169, 53, 86), A0M(7, 8, 63));
    }

    public static String A0S(Context context) {
        return A0L(context).A1k(A0M(319, 52, 81), A0M(15, 9, 110));
    }

    public static Set<String> A0T(Context context) {
        return A0L(context).A0W(A0M(488, 44, 54), A04);
    }

    public static Set<String> A0U(Context context) {
        return A0L(context).A0W(A0M(3462, 39, 109), A05);
    }

    public static Set<String> A0V(Context context) {
        return A0L(context).A0W(A0M(1396, 44, 100), A04);
    }

    private Set<String> A0W(String str, String[] strArr) {
        JSONArray jSONArray;
        String strA1k = A1k(str, null);
        try {
            if (strA1k != null) {
                jSONArray = new JSONArray(strA1k);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i2 = 0; i2 < length; i2++) {
                linkedHashSet.add(jSONArray.getString(i2));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    public static void A0Z(Context context) {
        A0L(context).A00.edit().clear().commit();
    }

    private void A0a(@Nullable String str, @Nullable String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0M(91, 2, 121))) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.A00.edit();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String key = A0M(93, 24, 54);
            if (next.equals(key)) {
                String key2 = jSONObject.getString(next);
                A0a(key2, next);
            } else {
                String string = next;
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    String key3 = A0M(0, 1, 108);
                    sb.append(key3);
                    sb.append(string);
                    string = sb.toString();
                }
                String key4 = jSONObject.getString(next);
                editorEdit.putString(string, key4);
            }
        }
        editorEdit.apply();
    }

    public static boolean A0b(Context context) {
        return A0L(context).A1k(A0M(3524, 28, 97), A0M(3335, 19, 86)).equals(A0M(3354, 18, 17));
    }

    public static boolean A0c(Context context) {
        return A0L(context).A1m(A0M(450, 38, 112), false);
    }

    public static boolean A0d(Context context) {
        return A0L(context).A1m(A0M(2427, 37, 66), false);
    }

    public static boolean A0e(Context context) {
        return A0L(context).A1m(A0M(1699, 29, 65), true);
    }

    public static boolean A0f(Context context) {
        return A0L(context).A1m(A0M(2342, 27, 14), false);
    }

    public static boolean A0g(Context context) {
        return A0L(context).A1m(A0M(603, 44, 113), true);
    }

    public static boolean A0h(Context context) {
        return A0L(context).A1m(A0M(1539, 25, 51), true);
    }

    public static boolean A0i(Context context) {
        return A0L(context).A1m(A0M(1630, 39, 20), true);
    }

    public static boolean A0j(Context context) {
        return A0L(context).A1m(A0M(1669, 30, 123), false);
    }

    public static boolean A0k(Context context) {
        return A0L(context).A1m(A0M(730, 33, 74), true);
    }

    public static boolean A0l(Context context) {
        return A0L(context).A1m(A0M(763, 35, 60), false);
    }

    public static boolean A0m(Context context) {
        return A0L(context).A1m(A0M(1804, 18, 20), false);
    }

    public static boolean A0n(Context context) {
        return A0L(context).A1m(A0M(1984, 25, 124), false);
    }

    public static boolean A0o(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        JT jtA0L = A0L(context);
        String strA0M = A0M(1728, 25, 34);
        if (A03[5].charAt(10) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
        strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
        return jtA0L.A1m(strA0M, false);
    }

    public static boolean A0p(Context context) {
        return A0L(context).A1m(A0M(2221, 34, 24), false);
    }

    public static boolean A0q(Context context) {
        return Build.VERSION.SDK_INT >= 19 && A0L(context).A1m(A0M(1822, 15, 98), false);
    }

    public static boolean A0r(Context context) {
        return A0L(context).A1m(A0M(839, 23, 10), false);
    }

    public static boolean A0s(Context context) {
        return A0L(context).A1m(A0M(2154, 41, 106), false);
    }

    public static boolean A0t(Context context) {
        return A0L(context).A1m(A0M(1946, 22, 90), false);
    }

    public static boolean A0u(Context context) {
        return A0L(context).A1m(A0M(2499, 28, 84), true);
    }

    public static boolean A0v(Context context) {
        return A0L(context).A1m(A0M(2527, 31, 43), true);
    }

    public static boolean A0w(Context context) {
        return A0L(context).A1m(A0M(2886, 32, 34), false);
    }

    public static boolean A0x(Context context) {
        return A0L(context).A1m(A0M(222, 46, 76), false);
    }

    public static boolean A0y(Context context) {
        return A0L(context).A1m(A0M(1883, 19, 102), true);
    }

    public static boolean A0z(Context context) {
        return A0L(context).A1m(A0M(DateTimeConstants.MINUTES_PER_DAY, 45, 8), false);
    }

    public static boolean A10(Context context) {
        return A0L(context).A1m(A0M(1902, 25, 61), false);
    }

    public static boolean A11(Context context) {
        return A0L(context).A1m(A0M(1927, 19, 53), true);
    }

    public static boolean A12(Context context) {
        return A0L(context).A1m(A0M(2369, 32, 17), true);
    }

    public static boolean A13(Context context) {
        return A0L(context).A1m(A0M(1182, 57, 55), false);
    }

    public static boolean A14(Context context) {
        return A0L(context).A1m(A0M(1239, 59, 37), true);
    }

    public static boolean A15(Context context) {
        return A0L(context).A1m(A0M(2558, 38, 0), true);
    }

    public static boolean A16(Context context) {
        return A0L(context).A1m(A0M(1518, 21, 40), false);
    }

    public static boolean A17(Context context) {
        return A0L(context).A1m(A0M(2596, 43, 47), true);
    }

    public static boolean A18(Context context) {
        return A0L(context).A1m(A0M(692, 38, 110), false);
    }

    public static boolean A19(Context context) {
        return A0L(context).A1m(A0M(2287, 30, 96), true);
    }

    public static boolean A1A(Context context) {
        return A0L(context).A1m(A0M(862, 48, 46), false);
    }

    public static boolean A1B(Context context) {
        return A0L(context).A1m(A0M(910, 51, 8), false);
    }

    public static boolean A1C(Context context) {
        return A0L(context).A1m(A0M(2639, 31, 64), false);
    }

    public static boolean A1D(Context context) {
        return A0L(context).A1m(A0M(2670, 53, 91), false);
    }

    public static boolean A1E(Context context) {
        return A0L(context).A1m(A0M(2723, 38, 58), true);
    }

    public static boolean A1F(Context context) {
        return A0L(context).A1m(A0M(2761, 33, 54), false);
    }

    public static boolean A1G(Context context) {
        return A0L(context).A1m(A0M(2794, 25, 52), false);
    }

    public static boolean A1H(Context context) {
        return A0L(context).A1m(A0M(2819, 35, 100), false);
    }

    public static boolean A1I(Context context) {
        return A0L(context).A1m(A0M(2401, 26, 87), false);
    }

    public static boolean A1J(Context context) {
        return A0L(context).A1m(A0M(2464, 35, 2), false);
    }

    public static boolean A1K(Context context) {
        return A0L(context).A1m(A0M(2854, 32, 119), false);
    }

    public static boolean A1L(Context context) {
        return A0L(context).A1m(A0M(2918, 26, 69), false);
    }

    public static boolean A1M(Context context) {
        return A0L(context).A1m(A0M(2944, 23, 43), true);
    }

    public static boolean A1N(Context context) {
        return A0L(context).A1m(A0M(3066, 27, 30), false);
    }

    public static boolean A1O(Context context) {
        return A0L(context).A1m(A0M(3172, 28, 8), false);
    }

    public static boolean A1P(Context context) {
        return A0L(context).A1m(A0M(3302, 33, 109), false);
    }

    public static boolean A1Q(Context context) {
        return A0L(context).A1m(A0M(1837, 46, 72), true);
    }

    public static boolean A1R(Context context) {
        return A0L(context).A1m(A0M(AdError.INTERSTITIAL_AD_TIMEOUT, 34, 108), false);
    }

    public static boolean A1S(Context context) {
        return A0L(context).A1m(A0M(3277, 25, 54), false);
    }

    public static boolean A1T(Context context) {
        return A0L(context).A1m(A0M(2043, 45, 85), false);
    }

    public static boolean A1U(Context context) {
        return A0L(context).A1m(A0M(3141, 31, 114), false);
    }

    public static boolean A1V(Context context) {
        return A0L(context).A1m(A0M(1968, 16, 20), true);
    }

    public static boolean A1W(Context context) {
        return A0L(context).A1m(A0M(3093, 48, 60), false);
    }

    public static boolean A1X(Context context) {
        return A0L(context).A1m(A0M(1298, 18, 69), false);
    }

    public static boolean A1Y(Context context) {
        return A0L(context).A1m(A0M(1316, 40, 90), false);
    }

    public static boolean A1Z(Context context) {
        return A0L(context).A1m(A0M(3200, 36, 44), false);
    }

    public static boolean A1a(Context context) {
        return A0L(context).A1m(A0M(3236, 41, 117), true);
    }

    public static boolean A1b(Context context) {
        return A1c(context) && A0L(context).A1m(A0M(1753, 27, 117), false);
    }

    public static boolean A1c(Context context) {
        return Build.VERSION.SDK_INT >= 19 && A0L(context).A1m(A0M(1780, 24, 108), false);
    }

    public static boolean A1d(Context context) {
        return A0L(context).A1m(A0M(2195, 26, 22), false);
    }

    public static boolean A1e(Context context) {
        return A0L(context).A1m(A0M(2317, 25, 69), false);
    }

    public static boolean A1f(Context context) {
        return A0L(context).A1m(A0M(1356, 40, 37), true);
    }

    public final double A1g(String str, double d2) {
        String string = this.A00.getString(str, String.valueOf(d2));
        if (string != null) {
            try {
                if (string.equals(A0M(3458, 4, 11))) {
                    return d2;
                }
                d2 = Double.valueOf(string).doubleValue();
                return d2;
            } catch (NumberFormatException unused) {
                return d2;
            }
        }
        return d2;
    }

    public final float A1h(String str, float f2) {
        String string = this.A00.getString(str, String.valueOf(f2));
        if (string != null) {
            try {
                if (string.equals(A0M(3458, 4, 11))) {
                    return f2;
                }
                f2 = Float.valueOf(string).floatValue();
                return f2;
            } catch (NumberFormatException unused) {
                return f2;
            }
        }
        return f2;
    }

    public final int A1i(String str, int i2) {
        String string = this.A00.getString(str, String.valueOf(i2));
        if (string != null) {
            try {
                if (string.equals(A0M(3458, 4, 11))) {
                    return i2;
                }
                i2 = Integer.valueOf(string).intValue();
                return i2;
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        return i2;
    }

    public final long A1j(String str, long j2) {
        String string = this.A00.getString(str, String.valueOf(j2));
        if (string != null) {
            try {
                if (string.equals(A0M(3458, 4, 11))) {
                    return j2;
                }
                j2 = Long.valueOf(string).longValue();
                return j2;
            } catch (NumberFormatException unused) {
                return j2;
            }
        }
        return j2;
    }

    public final String A1k(String str, String str2) {
        String string = this.A00.getString(str, str2);
        return (string == null || string.equals(A0M(3458, 4, 11))) ? str2 : string;
    }

    public final void A1l(@Nullable String str) throws JSONException {
        A0a(str, null);
    }

    public final boolean A1m(String str, boolean z) {
        String string = this.A00.getString(str, String.valueOf(z));
        if (string != null) {
            boolean zEquals = string.equals(A0M(3458, 4, 11));
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            strArr[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            if (zEquals) {
                return z;
            }
            Boolean boolValueOf = Boolean.valueOf(string);
            String[] strArr2 = A03;
            if (strArr2[3].length() != strArr2[0].length()) {
                String[] strArr3 = A03;
                strArr3[3] = "hV4gkZa6iTnBQtPHVFcfTHmR1bNEdnz";
                strArr3[0] = "i5HGVVHoY9v13oxeOLvfdWmm2ZFB1W9";
                return boolValueOf.booleanValue();
            }
            String[] strArr4 = A03;
            strArr4[3] = "399Nx2YcC1GvFjLdWekHdHFO2r6iBpJ";
            strArr4[0] = "0IRISDuTH5uUbCTD7GqL21M5oCfRTNA";
            return boolValueOf.booleanValue();
        }
        return z;
    }
}

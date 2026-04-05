package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05248f {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02;
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, 28, 3, 48, 28, 6, 29, 7, DateTimeFieldType.MILLIS_OF_DAY, 1, 73, 83, 63, 29, DateTimeFieldType.MINUTE_OF_DAY, 91, 8, 92, 24, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 8, 25, 92, 24, 25, 30, 9, 27, 92, 25, 10, 25, DateTimeFieldType.MINUTE_OF_DAY, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 92, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 82, DateTimeFieldType.HOUR_OF_HALFDAY, 44, 35, 106, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, 108, 119, 118, 113, 102, 116, 108, 99, 97, 118, 117, 42, 25, 10, 1, 27, 44, 0, 26, 1, 27, 41, 45, 46, 26, 11, 6, 10, 1, 12, 10, 33, 10, 27, 24, 0, 29, 4, 31, 58, 61, 40, 42, 111, 43, 42, 45, 58, 40, 111, 42, 57, 42, 33, 59, 60, 111, 41, 38, 35, 42, 97, 69, 9, 38, 35, 42, 111, 60, 38, 53, 42, 117, 111, 111, 87, 85, 76, 76, 89, 88, 28, 89, 74, 89, 82, 72, 79, DateTimeFieldType.MINUTE_OF_DAY, 40, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 11, 11, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 28, 91, 24, DateTimeFieldType.SECOND_OF_DAY, 9, 9, DateTimeFieldType.HOUR_OF_HALFDAY, 11, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, 31, 91, 31, 30, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 28, 91, 30, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 91, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 30, 85, 98, 68, 79, 95, 88, 81, DateTimeFieldType.MILLIS_OF_DAY, 66, 89, DateTimeFieldType.MILLIS_OF_DAY, 67, 70, 82, 87, 66, 83, DateTimeFieldType.MILLIS_OF_DAY, 67, 88, 68, 83, 85, 89, 68, 82, 83, 82, DateTimeFieldType.MILLIS_OF_DAY, 82, 83, 84, 67, 81, 122, 89, 81, 115, 64, 83, 88, 66, 24, DateTimeFieldType.MILLIS_OF_DAY, 87, 82, 82, 95, 88, 81, DateTimeFieldType.MILLIS_OF_DAY, 66, 89, DateTimeFieldType.MILLIS_OF_DAY, 121, 88, 81, 89, 95, 88, 81, 115, 64, 83, 88, 66, 24, 58, DateTimeFieldType.HOUR_OF_DAY, 0, 8, DateTimeFieldType.SECOND_OF_MINUTE, 6, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_HOUR, 2, 10, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_HOUR, 88, 93, 72, 93, 127, 126, 68, 119, 116, 124, 124, 114, 117, 124, 43, 42, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, 29, 88, 75, 88, 83, 73, 29, 78, 85, 82, 72, 81, 89, 29, 83, 82, 73, 29, 95, 88, 29, 72, 77, 89, 92, 73, 88, 89, 29, 73, 82, 29, 114, 83, 90, 82, 84, 83, 90, 120, 75, 88, 83, 73, DateTimeFieldType.MINUTE_OF_HOUR, 107, 102, 126, 104, 126, 126, 100, 98, 99, 82, 100, 105, 72, 94, 72, 72, 82, 84, 85, 100, 79, 82, 86, 94, 105, 113, 115, 106, 106, 127, 126, 95, 108, 127, 116, 110, 105, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, 72, 93, 103, 91, 87, 92, 93, 119, 106, 110, 102, 85, 88, 81, 68};
    }

    public static void A07() {
        A02 = new String[]{"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    }

    static {
        A07();
        A06();
        A04 = C05248f.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static C05268h A01(String str, C8C c8c, Map<String, String> staticEnvironmentData) {
        C05268h c05268h = null;
        try {
            c05268h = new C05268h(c8c.A05().A01(), c8c.A05().A02(), new C8R(str, staticEnvironmentData, true).A02());
            A0C(c05268h, c8c);
            return c05268h;
        } catch (Exception unused) {
            return c05268h;
        }
    }

    public static JSONArray A03(C8C c8c) {
        return A04(c8c, -1);
    }

    public static JSONArray A04(C8C c8c, int i2) {
        InterfaceC05218c interfaceC05218cA04;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (new File(c8c.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8c)).exists()) {
                        fileInputStreamOpenFileInput = c8c.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8c));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null || i2 == 0) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(line);
                            if (!jSONObject.has(A02(260, 7, 27))) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                            }
                            String line2 = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(line2)) {
                                int i3 = jSONObject.getInt(A02(260, 7, 27));
                                if (A05.containsKey(line2)) {
                                    jSONObject.put(A02(260, 7, 27), String.valueOf(A05.get(line2)));
                                } else {
                                    A0F(line2, i3);
                                }
                                jSONArray.put(jSONObject);
                                if (i2 > 0) {
                                    i2--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e = e2;
                            interfaceC05218cA04 = c8c.A04();
                            interfaceC05218cA04.A3S(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (IOException | JSONException e3) {
                    c8c.A04().A3S(e3);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e = e4;
                            interfaceC05218cA04 = c8c.A04();
                            interfaceC05218cA04.A3S(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (IOException e5) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject A05(C05268h c05268h) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 93), c05268h.A03());
        jSONObject.put(A02(402, 4, 127), C0848Lr.A02(c05268h.A01()));
        jSONObject.put(A02(355, 12, 71), C0848Lr.A02(c05268h.A00()));
        jSONObject.put(A02(345, 10, 113), c05268h.A02());
        jSONObject.put(A02(267, 4, 64), c05268h.A04() != null ? new JSONObject(c05268h.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A08(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (file.exists()) {
                file.delete();
            }
            A0A(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A09(Context context) {
        A0A(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A0A(Context context, int i2) {
        int i3 = 0;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).edit();
        if (i2 >= 0) {
            i3 = i2;
        }
        editorEdit.putInt(A02(75, 10, 19), i3).apply();
    }

    public static void A0B(C8C c8c, String str) {
        File file = new File(c8c.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c8c.A04().A3S(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0C(C05268h c05268h, C8C c8c) {
        if (c05268h != null && c8c != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8c);
                    File file = new File(c8c.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int iA07 = JU.A07(c8c);
                        long fileSize = file.length();
                        if (iA07 > 0 && fileSize > iA07) {
                            boolean zDelete = file.delete();
                            A0A(c8c, 0);
                            A06.clear();
                            A05.clear();
                            if (zDelete) {
                                Map<String, String> mapA4T = c8c.A02().A4T();
                                mapA4T.put(A02(383, 7, 62), A02(271, 10, 103));
                                mapA4T.put(A02(390, 12, 68), String.valueOf(2401));
                                A01(A02(102, 36, 51) + fileSize + A02(1, 15, 15) + A00.getAndIncrement(), c8c, mapA4T);
                                return;
                            }
                            Log.e(A02(85, 17, 19), A02(16, 31, 0));
                        }
                    }
                    JSONObject jSONObjectA05 = A05(c05268h);
                    FileOutputStream fileOutputStreamOpenFileOutput = c8c.openFileOutput(processSpecificName, 32768);
                    String line = jSONObjectA05.toString() + A02(0, 1, 113);
                    fileOutputStreamOpenFileOutput.write(line.getBytes());
                    fileOutputStreamOpenFileOutput.close();
                    A09(c8c);
                } catch (Exception e2) {
                    c8c.A04().A3S(e2);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str) {
        Integer num = A05.get(str);
        if (num == null) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A02(189, 66, 74));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        A05.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void A0F(String str, int i2) {
        if (!A06.contains(str)) {
            boolean zContainsKey = A05.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            strArr[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (zContainsKey) {
                A05.remove(str);
            }
            A05.put(str, Integer.valueOf(i2));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0G(C8C c8c) {
        if (JU.A0P(c8c)) {
            return A0I(c8c);
        }
        boolean zA0H = A0H(c8c);
        String[] strArr = A02;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
        strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
        return zA0H;
    }

    public static boolean A0H(C8C c8c) {
        JSONArray debugLogEvents = new JSONArray();
        synchronized (A03) {
            int i2 = 0;
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    File debugFile = new File(c8c.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8c));
                    if (debugFile.exists()) {
                        fileInputStreamOpenFileInput = c8c.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8c));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (A02[4].charAt(1) != 'a') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A02;
                            strArr[2] = "N2MSSJLvxCxpns9Z";
                            strArr[2] = "N2MSSJLvxCxpns9Z";
                            if (line != null) {
                                JSONObject jSONObject = new JSONObject(line);
                                String string = jSONObject.getString(A02(343, 2, 126));
                                if (!A06.contains(string)) {
                                    if (A05.containsKey(string)) {
                                        Integer num = A05.get(string);
                                        int retryLimit = num != null ? num.intValue() : 0;
                                        Integer numValueOf = Integer.valueOf(retryLimit);
                                        int iA02 = JU.A02(c8c);
                                        if (iA02 > -1) {
                                            int retryLimit2 = iA02 - 1;
                                            if (numValueOf.intValue() > retryLimit2) {
                                                A0D(string);
                                                i2++;
                                            }
                                        }
                                        jSONObject.put(A02(260, 7, 27), String.valueOf(numValueOf));
                                        debugLogEvents.put(jSONObject);
                                    } else {
                                        debugLogEvents.put(jSONObject);
                                    }
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                int i3 = debugLogEvents.length();
                                for (int i4 = 0; i4 < i3; i4++) {
                                    sb.append(debugLogEvents.getJSONObject(i4).toString());
                                    sb.append('\n');
                                }
                                fileOutputStreamOpenFileOutput = c8c.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c8c), 0);
                                fileOutputStreamOpenFileOutput.write(sb.toString().getBytes());
                            }
                        }
                    }
                    int retryLimit3 = A00(c8c);
                    A0A(c8c, retryLimit3);
                    if (i2 > 0) {
                        c8c.A04().A86(A02(271, 10, 103), C05228d.A27, new C05238e(A02(138, 15, 64), A02(367, 16, 102) + i2));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            c8c.A04().A3S(e2);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A06.clear();
                    A05.clear();
                    return true;
                } catch (IOException | JSONException e3) {
                    c8c.A04().A3S(e3);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            c8c.A04().A3S(e4);
                            A06.clear();
                            A05.clear();
                            return false;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A06.clear();
                    A05.clear();
                    return false;
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (IOException e5) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016c, code lost:
    
        r7 = r18.openFileInput(r3);
        r6 = r18.openFileOutput(r5, 0);
        r2 = new byte[1024];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0179, code lost:
    
        r1 = r7.read(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
    
        if (r1 <= 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017f, code lost:
    
        r6.write(r2, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0184, code lost:
    
        r7.close();
        r10.close();
        A0B(r18, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022b A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0230 A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0235 A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023a A[Catch: IOException -> 0x0243, all -> 0x028d, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023f A[Catch: IOException -> 0x0243, all -> 0x028d, TRY_LEAVE, TryCatch #4 {IOException -> 0x0243, blocks: (B:103:0x0226, B:105:0x022b, B:107:0x0230, B:109:0x0235, B:111:0x023a, B:113:0x023f), top: B:146:0x0226, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0262 A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0267 A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026c A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0271 A[Catch: IOException -> 0x027a, all -> 0x028d, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0276 A[Catch: IOException -> 0x027a, all -> 0x028d, TRY_LEAVE, TryCatch #0 {IOException -> 0x027a, blocks: (B:124:0x025d, B:126:0x0262, B:128:0x0267, B:130:0x026c, B:132:0x0271, B:134:0x0276), top: B:142:0x025d, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0I(com.facebook.ads.redexgen.X.C8C r18) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05248f.A0I(com.facebook.ads.redexgen.X.8C):boolean");
    }

    public static boolean A0J(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}

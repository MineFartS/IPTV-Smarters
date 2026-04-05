package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ahs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19739a = Pattern.compile("^NOTE([ \t].*)?$");

    public static long a(String str) {
        String[] strArrAe = amn.ae(str, "\\.");
        long j2 = 0;
        for (String str2 : amn.ad(strArrAe[0], ":")) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (strArrAe.length == 2) {
            j3 += Long.parseLong(strArrAe[1]);
        }
        return j3 * 1000;
    }

    public static Matcher b(alx alxVar) {
        String strV;
        while (true) {
            String strV2 = alxVar.v();
            if (strV2 == null) {
                return null;
            }
            if (f19739a.matcher(strV2).matches()) {
                do {
                    strV = alxVar.v();
                    if (strV != null) {
                    }
                } while (!strV.isEmpty());
            } else {
                Matcher matcher = ahr.f19738a.matcher(strV2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static void c(alx alxVar) throws lb {
        int iC = alxVar.c();
        if (d(alxVar)) {
            return;
        }
        alxVar.I(iC);
        String strValueOf = String.valueOf(alxVar.v());
        throw new lb(strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "));
    }

    public static boolean d(alx alxVar) {
        String strV = alxVar.v();
        return strV != null && strV.startsWith("WEBVTT");
    }
}

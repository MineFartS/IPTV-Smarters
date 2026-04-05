package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class jb extends lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ke f22040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final abf f22042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22043g;

    private jb(int i2, Throwable th, int i3) {
        this(i2, th, i3, null, -1, null, 4, false);
    }

    private jb(int i2, Throwable th, int i3, String str, int i4, ke keVar, int i5, boolean z) {
        String string;
        if (i2 == 0) {
            string = "Source error";
        } else if (i2 != 1) {
            string = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(keVar);
            String strD = iw.d(i5);
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 53 + strValueOf.length() + strD.length());
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i4);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(strD);
            string = sb.toString();
        }
        if (!TextUtils.isEmpty(null)) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 2 + Constants.NULL_VERSION_ID.length());
            sb2.append(strValueOf2);
            sb2.append(": ");
            sb2.append((String) null);
            string = sb2.toString();
        }
        this(string, th, i3, i2, str, i4, keVar, i5, null, SystemClock.elapsedRealtime(), z);
    }

    private jb(String str, Throwable th, int i2, int i3, String str2, int i4, ke keVar, int i5, abf abfVar, long j2, boolean z) {
        boolean z2;
        super(str, th, i2, j2);
        int i6 = i3;
        if (!z) {
            z2 = true;
        } else if (i6 == 1) {
            i6 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        ajr.d(z2);
        ajr.d(th != null);
        this.f22037a = i6;
        this.f22038b = str2;
        this.f22039c = i4;
        this.f22040d = keVar;
        this.f22041e = i5;
        this.f22042f = abfVar;
        this.f22043g = z;
    }

    public static jb b(Exception exc) {
        return new jb(1, exc, 1000, null, -1, null, 4, false);
    }

    public static jb c(Throwable th, String str, int i2, ke keVar, int i3, boolean z) {
        return new jb(1, th, 1000, str, i2, keVar, keVar == null ? 4 : i3, z);
    }

    public static jb d(IOException iOException, int i2) {
        return new jb(0, iOException, i2);
    }

    public static jb e(RuntimeException runtimeException) {
        return new jb(2, runtimeException, 1000);
    }

    public final jb a(abf abfVar) {
        String message = getMessage();
        int i2 = amn.f20135a;
        return new jb(message, getCause(), this.f22289h, this.f22037a, this.f22038b, this.f22039c, this.f22040d, this.f22041e, abfVar, this.f22290i, this.f22043g);
    }
}

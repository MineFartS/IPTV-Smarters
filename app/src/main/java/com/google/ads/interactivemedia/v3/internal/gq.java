package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21867a = "googleads.g.doubleclick.net";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21868b = "/pagead/ads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21869c = "ad.doubleclick.net";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f21870d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gl f21871e;

    public gq(gl glVar) {
        this.f21871e = glVar;
    }

    private final Uri h(Uri uri, String str) throws gr {
        String str2;
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.f21869c)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new gr("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i2 = iIndexOf + 1;
                        str2 = string.substring(0, i2) + "dc_ms=" + str + ";" + string.substring(i2);
                    } else {
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        str2 = string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new gr("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i3 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i3) + "ms=" + str + "&" + string2.substring(i3));
        } catch (UnsupportedOperationException unused2) {
            throw new gr("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context) {
        return h(uri, this.f21871e.a(context));
    }

    public final void b(MotionEvent motionEvent) {
        this.f21871e.b(motionEvent);
    }

    public final void c(String str, String str2) {
        this.f21867a = str;
        this.f21868b = str2;
    }

    public final void d(String str) {
        this.f21870d = str.split(",");
    }

    public final boolean e(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.f21870d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            if (uri.getHost().equals(this.f21867a)) {
                if (uri.getPath().equals(this.f21868b)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final Uri g(Uri uri, Context context) throws gr {
        try {
            return h(uri, this.f21871e.c(context, uri.getQueryParameter("ai")));
        } catch (UnsupportedOperationException unused) {
            throw new gr("Provided Uri is not in a valid state");
        }
    }
}

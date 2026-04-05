package c.f.a.c.j.h;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.f.a<String, Uri> f13453a = new a.f.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        a.f.a<String, Uri> aVar = f13453a;
        uri = aVar.get("com.google.android.gms.measurement");
        if (uri == null) {
            String strValueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
            uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            aVar.put("com.google.android.gms.measurement", uri);
        }
        return uri;
    }
}

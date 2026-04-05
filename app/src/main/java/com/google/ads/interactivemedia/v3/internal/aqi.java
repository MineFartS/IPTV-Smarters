package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aqi extends IllegalStateException {
    private aqi(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(aqv<?> aqvVar) {
        String string;
        if (!aqvVar.e()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excB = aqvVar.b();
        if (excB != null) {
            string = "failure";
        } else if (aqvVar.f()) {
            String strValueOf = String.valueOf(aqvVar.c());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
            sb.append("result ");
            sb.append(strValueOf);
            string = sb.toString();
        } else {
            string = aqvVar.d() ? "cancellation" : "unknown issue";
        }
        String strValueOf2 = String.valueOf(string);
        return new aqi(strValueOf2.length() != 0 ? "Complete with: ".concat(strValueOf2) : new String("Complete with: "), excB);
    }
}

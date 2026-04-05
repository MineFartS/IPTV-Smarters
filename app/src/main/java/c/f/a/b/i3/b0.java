package c.f.a.b.i3;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 {
    public static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String strE = c.f.b.a.b.e(str);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        return ((strE.contains("text") && !strE.contains("text/vtt")) || strE.contains("html") || strE.contains("xml")) ? false : true;
    }
}

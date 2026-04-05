package c.f.a.b.i3.p0;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n {
    public static long a(o oVar) {
        return oVar.b("exo_len", -1L);
    }

    public static Uri b(o oVar) {
        String strA = oVar.a("exo_redir", null);
        if (strA == null) {
            return null;
        }
        return Uri.parse(strA);
    }
}

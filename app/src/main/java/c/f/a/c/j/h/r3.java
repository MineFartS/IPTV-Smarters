package c.f.a.c.j.h;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class r3 extends x3<Long> {
    public r3(v3 v3Var, String str, Long l2, boolean z) {
        super(v3Var, str, l2, true, null);
    }

    @Override // c.f.a.c.j.h.x3
    public final /* bridge */ /* synthetic */ Long a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String strD = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(strD);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}

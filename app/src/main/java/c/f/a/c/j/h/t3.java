package c.f.a.c.j.h;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class t3 extends x3<Double> {
    public t3(v3 v3Var, String str, Double d2, boolean z) {
        super(v3Var, "measurement.test.double_flag", d2, true, null);
    }

    @Override // c.f.a.c.j.h.x3
    public final /* bridge */ /* synthetic */ Double a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String strD = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(strD);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}

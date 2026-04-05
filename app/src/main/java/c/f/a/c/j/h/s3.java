package c.f.a.c.j.h;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class s3 extends x3<Boolean> {
    public s3(v3 v3Var, String str, Boolean bool, boolean z) {
        super(v3Var, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.f.a.c.j.h.x3
    public final /* bridge */ /* synthetic */ Boolean a(Object obj) {
        if (y2.f13642c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (y2.f13643d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String strD = super.d();
        String str = (String) obj;
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 28 + str.length());
        sb.append("Invalid boolean value for ");
        sb.append(strD);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

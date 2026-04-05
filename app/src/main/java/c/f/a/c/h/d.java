package c.f.a.c.h;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        int iA = mVar.a(context, str, true);
        nVar.f12734b = iA;
        if (iA != 0) {
            nVar.f12735c = 1;
        } else {
            int iB = mVar.b(context, str);
            nVar.f12733a = iB;
            if (iB != 0) {
                nVar.f12735c = -1;
            }
        }
        return nVar;
    }
}

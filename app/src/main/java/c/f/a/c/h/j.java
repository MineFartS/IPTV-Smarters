package c.f.a.c.h;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        int iB = mVar.b(context, str);
        nVar.f12733a = iB;
        int i2 = 0;
        int iA = iB != 0 ? mVar.a(context, str, false) : mVar.a(context, str, true);
        nVar.f12734b = iA;
        int i3 = nVar.f12733a;
        if (i3 == 0) {
            if (iA == 0) {
                nVar.f12735c = 0;
            }
            return nVar;
        }
        i2 = i3;
        if (iA >= i2) {
            nVar.f12735c = 1;
        } else {
            nVar.f12735c = -1;
        }
        return nVar;
    }
}

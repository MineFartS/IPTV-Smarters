package c.f.a.c.h;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        int iA = mVar.a(context, str, false);
        nVar.f12734b = iA;
        if (iA == 0) {
            nVar.f12735c = 0;
        } else {
            nVar.f12735c = 1;
        }
        return nVar;
    }
}

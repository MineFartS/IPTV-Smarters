package c.d.a.o;

import android.content.Context;
import c.d.a.o.c;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public c a(Context context, c.a aVar) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new e(context, aVar) : new i();
    }
}

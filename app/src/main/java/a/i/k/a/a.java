package a.i.k.a;

import android.content.Context;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap<Context, a> f1843a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1844b;

    public a(Context context) {
        this.f1844b = context;
    }

    public static a a(Context context) {
        a aVar;
        WeakHashMap<Context, a> weakHashMap = f1843a;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }
}

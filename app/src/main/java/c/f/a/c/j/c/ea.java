package c.f.a.c.j.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ea f12802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ea f12803b = new ea(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Object, Object> f12804c;

    public ea() {
        this.f12804c = new HashMap();
    }

    public ea(boolean z) {
        this.f12804c = Collections.emptyMap();
    }

    public static ea a() {
        ea eaVar = f12802a;
        if (eaVar == null) {
            synchronized (ea.class) {
                eaVar = f12802a;
                if (eaVar == null) {
                    eaVar = f12803b;
                    f12802a = eaVar;
                }
            }
        }
        return eaVar;
    }
}

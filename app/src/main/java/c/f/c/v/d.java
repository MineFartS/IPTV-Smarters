package c.f.c.v;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d f16435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<f> f16436b = new HashSet();

    public static d a() {
        d dVar = f16435a;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f16435a;
                if (dVar == null) {
                    dVar = new d();
                    f16435a = dVar;
                }
            }
        }
        return dVar;
    }

    public Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f16436b) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f16436b);
        }
        return setUnmodifiableSet;
    }
}

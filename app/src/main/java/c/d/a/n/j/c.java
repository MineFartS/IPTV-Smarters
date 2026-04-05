package c.d.a.n.j;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5662a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class, Map<Class, m>> f5663b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class, Map<Class, l>> f5664c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5665d;

    public static class a implements l {
        @Override // c.d.a.n.j.l
        public c.d.a.n.h.c a(Object obj, int i2, int i3) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public c(Context context) {
        this.f5665d = context.getApplicationContext();
    }

    public synchronized <T, Y> l<T, Y> a(Class<T> cls, Class<Y> cls2) {
        l<T, Y> lVarD = d(cls, cls2);
        if (lVarD != null) {
            if (f5662a.equals(lVarD)) {
                return null;
            }
            return lVarD;
        }
        m<T, Y> mVarE = e(cls, cls2);
        if (mVarE != null) {
            lVarD = mVarE.b(this.f5665d, this);
            b(cls, cls2, lVarD);
        } else {
            c(cls, cls2);
        }
        return lVarD;
    }

    public final <T, Y> void b(Class<T> cls, Class<Y> cls2, l<T, Y> lVar) {
        Map<Class, l> map = this.f5664c.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.f5664c.put(cls, map);
        }
        map.put(cls2, lVar);
    }

    public final <T, Y> void c(Class<T> cls, Class<Y> cls2) {
        b(cls, cls2, f5662a);
    }

    public final <T, Y> l<T, Y> d(Class<T> cls, Class<Y> cls2) {
        Map<Class, l> map = this.f5664c.get(cls);
        if (map != null) {
            return map.get(cls2);
        }
        return null;
    }

    public final <T, Y> m<T, Y> e(Class<T> cls, Class<Y> cls2) {
        Map<Class, m> map;
        Map<Class, m> map2 = this.f5663b.get(cls);
        m mVar = map2 != null ? map2.get(cls2) : null;
        if (mVar == null) {
            for (Class cls3 : this.f5663b.keySet()) {
                if (cls3.isAssignableFrom(cls) && (map = this.f5663b.get(cls3)) != null && (mVar = map.get(cls2)) != null) {
                    break;
                }
            }
        }
        return mVar;
    }

    public synchronized <T, Y> m<T, Y> f(Class<T> cls, Class<Y> cls2, m<T, Y> mVar) {
        m<T, Y> mVarPut;
        this.f5664c.clear();
        Map<Class, m> map = this.f5663b.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.f5663b.put(cls, map);
        }
        mVarPut = map.put(cls2, mVar);
        if (mVarPut != null) {
            Iterator<Map<Class, m>> it = this.f5663b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().containsValue(mVarPut)) {
                    mVarPut = null;
                    break;
                }
            }
        }
        return mVarPut;
    }
}

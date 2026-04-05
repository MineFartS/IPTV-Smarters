package a.p;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f3026a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f3027b = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void a() {
        this.f3027b = true;
        Map<String, Object> map = this.f3026a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f3026a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        d();
    }

    public <T> T c(String str) {
        T t;
        Map<String, Object> map = this.f3026a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f3026a.get(str);
        }
        return t;
    }

    public void d() {
    }

    public <T> T e(String str, T t) {
        Object obj;
        synchronized (this.f3026a) {
            obj = this.f3026a.get(str);
            if (obj == null) {
                this.f3026a.put(str, t);
            }
        }
        if (obj != null) {
            t = (T) obj;
        }
        if (this.f3027b) {
            b(t);
        }
        return t;
    }
}

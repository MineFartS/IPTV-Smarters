package c.f.c.n.j;

import android.util.Base64;
import android.util.JsonWriter;
import c.f.c.n.f;
import c.f.c.n.g;
import c.f.c.n.h;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f16144a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16145b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f16146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, c.f.c.n.e<?>> f16147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, g<?>> f16148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.c.n.e<Object> f16149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16150g;

    public e(Writer writer, Map<Class<?>, c.f.c.n.e<?>> map, Map<Class<?>, g<?>> map2, c.f.c.n.e<Object> eVar, boolean z) {
        this.f16146c = new JsonWriter(writer);
        this.f16147d = map;
        this.f16148e = map2;
        this.f16149f = eVar;
        this.f16150g = z;
    }

    @Override // c.f.c.n.f
    public f a(c.f.c.n.d dVar, long j2) {
        return l(dVar.a(), j2);
    }

    @Override // c.f.c.n.f
    public f f(c.f.c.n.d dVar, Object obj) {
        return e(dVar.a(), obj);
    }

    public e g(int i2) throws IOException {
        u();
        this.f16146c.value(i2);
        return this;
    }

    public e h(long j2) throws IOException {
        u();
        this.f16146c.value(j2);
        return this;
    }

    public e i(Object obj, boolean z) {
        int i2 = 0;
        if (z && p(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new c.f.c.n.c(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f16146c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f16146c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f16146c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(it.next(), false);
                }
                this.f16146c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f16146c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        e((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new c.f.c.n.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f16146c.endObject();
                return this;
            }
            c.f.c.n.e<?> eVar = this.f16147d.get(obj.getClass());
            if (eVar != null) {
                return r(eVar, obj, z);
            }
            g<?> gVar = this.f16148e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return r(this.f16149f, obj, z);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return o((byte[]) obj);
        }
        this.f16146c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                this.f16146c.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                h(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                this.f16146c.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                this.f16146c.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                i(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                i(obj2, false);
            }
        }
        this.f16146c.endArray();
        return this;
    }

    @Override // c.f.c.n.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e c(String str) throws IOException {
        u();
        this.f16146c.value(str);
        return this;
    }

    @Override // c.f.c.n.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e b(String str, int i2) throws IOException {
        u();
        this.f16146c.name(str);
        return g(i2);
    }

    public e l(String str, long j2) throws IOException {
        u();
        this.f16146c.name(str);
        return h(j2);
    }

    @Override // c.f.c.n.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e e(String str, Object obj) {
        return this.f16150g ? t(str, obj) : s(str, obj);
    }

    @Override // c.f.c.n.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e d(boolean z) throws IOException {
        u();
        this.f16146c.value(z);
        return this;
    }

    public e o(byte[] bArr) throws IOException {
        u();
        if (bArr == null) {
            this.f16146c.nullValue();
        } else {
            this.f16146c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean p(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void q() {
        u();
        this.f16146c.flush();
    }

    public e r(c.f.c.n.e<Object> eVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f16146c.beginObject();
        }
        eVar.a(obj, this);
        if (!z) {
            this.f16146c.endObject();
        }
        return this;
    }

    public final e s(String str, Object obj) throws IOException {
        u();
        this.f16146c.name(str);
        if (obj != null) {
            return i(obj, false);
        }
        this.f16146c.nullValue();
        return this;
    }

    public final e t(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        u();
        this.f16146c.name(str);
        return i(obj, false);
    }

    public final void u() throws IOException {
        if (!this.f16145b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f16144a;
        if (eVar != null) {
            eVar.u();
            this.f16144a.f16145b = false;
            this.f16144a = null;
            this.f16146c.endObject();
        }
    }
}

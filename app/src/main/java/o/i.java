package o;

import com.amazonaws.services.s3.Headers;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import k.b0;
import k.s;
import k.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class i<T> {

    public class a extends i<Iterable<T>> {
        public a() {
        }

        @Override // o.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(o.k kVar, @Nullable Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                i.this.a(kVar, it.next());
            }
        }
    }

    public class b extends i<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.i
        public void a(o.k kVar, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                i.this.a(kVar, Array.get(obj, i2));
            }
        }
    }

    public static final class c<T> extends i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o.e<T, b0> f31271a;

        public c(o.e<T, b0> eVar) {
            this.f31271a = eVar;
        }

        @Override // o.i
        public void a(o.k kVar, @Nullable T t) {
            if (t == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                kVar.j(this.f31271a.a(t));
            } catch (IOException e2) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e2);
            }
        }
    }

    public static final class d<T> extends i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.e<T, String> f31273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f31274c;

        public d(String str, o.e<T, String> eVar, boolean z) {
            this.f31272a = (String) o.o.b(str, "name == null");
            this.f31273b = eVar;
            this.f31274c = z;
        }

        @Override // o.i
        public void a(o.k kVar, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.f31273b.a(t)) == null) {
                return;
            }
            kVar.a(this.f31272a, strA, this.f31274c);
        }
    }

    public static final class e<T> extends i<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o.e<T, String> f31275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31276b;

        public e(o.e<T, String> eVar, boolean z) {
            this.f31275a = eVar;
            this.f31276b = z;
        }

        @Override // o.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(o.k kVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Field map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Field map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                }
                String strA = this.f31275a.a(value);
                if (strA == null) {
                    throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f31275a.getClass().getName() + " for key '" + key + "'.");
                }
                kVar.a(key, strA, this.f31276b);
            }
        }
    }

    public static final class f<T> extends i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.e<T, String> f31278b;

        public f(String str, o.e<T, String> eVar) {
            this.f31277a = (String) o.o.b(str, "name == null");
            this.f31278b = eVar;
        }

        @Override // o.i
        public void a(o.k kVar, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.f31278b.a(t)) == null) {
                return;
            }
            kVar.b(this.f31277a, strA);
        }
    }

    public static final class g<T> extends i<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o.e<T, String> f31279a;

        public g(o.e<T, String> eVar) {
            this.f31279a = eVar;
        }

        @Override // o.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(o.k kVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Header map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Header map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                }
                kVar.b(key, this.f31279a.a(value));
            }
        }
    }

    public static final class h<T> extends i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f31280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.e<T, b0> f31281b;

        public h(s sVar, o.e<T, b0> eVar) {
            this.f31280a = sVar;
            this.f31281b = eVar;
        }

        @Override // o.i
        public void a(o.k kVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                kVar.c(this.f31280a, this.f31281b.a(t));
            } catch (IOException e2) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e2);
            }
        }
    }

    /* JADX INFO: renamed from: o.i$i, reason: collision with other inner class name */
    public static final class C0323i<T> extends i<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o.e<T, b0> f31282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f31283b;

        public C0323i(o.e<T, b0> eVar, String str) {
            this.f31282a = eVar;
            this.f31283b = str;
        }

        @Override // o.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(o.k kVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Part map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                }
                kVar.c(s.e(Headers.CONTENT_DISPOSITION, "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f31283b), this.f31282a.a(value));
            }
        }
    }

    public static final class j<T> extends i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.e<T, String> f31285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f31286c;

        public j(String str, o.e<T, String> eVar, boolean z) {
            this.f31284a = (String) o.o.b(str, "name == null");
            this.f31285b = eVar;
            this.f31286c = z;
        }

        @Override // o.i
        public void a(o.k kVar, @Nullable T t) {
            if (t != null) {
                kVar.e(this.f31284a, this.f31285b.a(t), this.f31286c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f31284a + "\" value must not be null.");
        }
    }

    public static final class k<T> extends i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.e<T, String> f31288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f31289c;

        public k(String str, o.e<T, String> eVar, boolean z) {
            this.f31287a = (String) o.o.b(str, "name == null");
            this.f31288b = eVar;
            this.f31289c = z;
        }

        @Override // o.i
        public void a(o.k kVar, @Nullable T t) {
            String strA;
            if (t == null || (strA = this.f31288b.a(t)) == null) {
                return;
            }
            kVar.f(this.f31287a, strA, this.f31289c);
        }
    }

    public static final class l<T> extends i<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o.e<T, String> f31290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31291b;

        public l(o.e<T, String> eVar, boolean z) {
            this.f31290a = eVar;
            this.f31291b = z;
        }

        @Override // o.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(o.k kVar, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Query map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Query map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                }
                String strA = this.f31290a.a(value);
                if (strA == null) {
                    throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f31290a.getClass().getName() + " for key '" + key + "'.");
                }
                kVar.f(key, strA, this.f31291b);
            }
        }
    }

    public static final class m<T> extends i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o.e<T, String> f31292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31293b;

        public m(o.e<T, String> eVar, boolean z) {
            this.f31292a = eVar;
            this.f31293b = z;
        }

        @Override // o.i
        public void a(o.k kVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            kVar.f(this.f31292a.a(t), null, this.f31293b);
        }
    }

    public static final class n extends i<w.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f31294a = new n();

        @Override // o.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(o.k kVar, @Nullable w.b bVar) {
            if (bVar != null) {
                kVar.d(bVar);
            }
        }
    }

    public static final class o extends i<Object> {
        @Override // o.i
        public void a(o.k kVar, @Nullable Object obj) {
            o.o.b(obj, "@Url parameter is null.");
            kVar.k(obj);
        }
    }

    public abstract void a(o.k kVar, @Nullable T t);

    public final i<Object> b() {
        return new b();
    }

    public final i<Iterable<T>> c() {
        return new a();
    }
}

package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import k.b0;
import k.d0;
import k.e;
import k.t;
import k.x;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.a;
import o.c;
import o.e;
import o.n;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Method, n<?, ?>> f31313a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.a f31314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e.a> f31316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c.a> f31317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Executor f31318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31319g;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f31320a = j.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f31321b;

        public a(Class cls) {
            this.f31321b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f31320a.f(method)) {
                return this.f31320a.e(method, this.f31321b, obj, objArr);
            }
            n<?, ?> nVarF = m.this.f(method);
            return nVarF.f31333d.b(new h(nVarF, objArr));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f31323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public e.a f31324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t f31325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<e.a> f31326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<c.a> f31327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Executor f31328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f31329g;

        public b() {
            this(j.d());
        }

        public b(j jVar) {
            ArrayList arrayList = new ArrayList();
            this.f31326d = arrayList;
            this.f31327e = new ArrayList();
            this.f31323a = jVar;
            arrayList.add(new o.a());
        }

        public b a(e.a aVar) {
            this.f31326d.add((e.a) o.b(aVar, "factory == null"));
            return this;
        }

        public b b(String str) {
            o.b(str, "baseUrl == null");
            t tVarQ = t.q(str);
            if (tVarQ != null) {
                return c(tVarQ);
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        public b c(t tVar) {
            o.b(tVar, "baseUrl == null");
            if (BuildConfig.FLAVOR.equals(tVar.r().get(r0.size() - 1))) {
                this.f31325c = tVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
        }

        public m d() {
            if (this.f31325c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            e.a xVar = this.f31324b;
            if (xVar == null) {
                xVar = new x();
            }
            e.a aVar = xVar;
            Executor executorB = this.f31328f;
            if (executorB == null) {
                executorB = this.f31323a.b();
            }
            Executor executor = executorB;
            ArrayList arrayList = new ArrayList(this.f31327e);
            arrayList.add(this.f31323a.a(executor));
            return new m(aVar, this.f31325c, new ArrayList(this.f31326d), arrayList, executor, this.f31329g);
        }

        public b e(e.a aVar) {
            this.f31324b = (e.a) o.b(aVar, "factory == null");
            return this;
        }

        public b f(x xVar) {
            return e((e.a) o.b(xVar, "client == null"));
        }
    }

    public m(e.a aVar, t tVar, List<e.a> list, List<c.a> list2, @Nullable Executor executor, boolean z) {
        this.f31314b = aVar;
        this.f31315c = tVar;
        this.f31316d = Collections.unmodifiableList(list);
        this.f31317e = Collections.unmodifiableList(list2);
        this.f31318f = executor;
        this.f31319g = z;
    }

    public t a() {
        return this.f31315c;
    }

    public c<?, ?> b(Type type, Annotation[] annotationArr) {
        return g(null, type, annotationArr);
    }

    public e.a c() {
        return this.f31314b;
    }

    public <T> T d(Class<T> cls) {
        o.s(cls);
        if (this.f31319g) {
            e(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final void e(Class<?> cls) {
        j jVarD = j.d();
        for (Method method : cls.getDeclaredMethods()) {
            if (!jVarD.f(method)) {
                f(method);
            }
        }
    }

    public n<?, ?> f(Method method) {
        n nVarA;
        n<?, ?> nVar = this.f31313a.get(method);
        if (nVar != null) {
            return nVar;
        }
        synchronized (this.f31313a) {
            nVarA = this.f31313a.get(method);
            if (nVarA == null) {
                nVarA = new n.a(this, method).a();
                this.f31313a.put(method, nVarA);
            }
        }
        return nVarA;
    }

    public c<?, ?> g(@Nullable c.a aVar, Type type, Annotation[] annotationArr) {
        o.b(type, "returnType == null");
        o.b(annotationArr, "annotations == null");
        int iIndexOf = this.f31317e.indexOf(aVar) + 1;
        int size = this.f31317e.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            c<?, ?> cVarA = this.f31317e.get(i2).a(type, annotationArr, this);
            if (cVarA != null) {
                return cVarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f31317e.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f31317e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f31317e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> e<T, b0> h(@Nullable e.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        o.b(type, "type == null");
        o.b(annotationArr, "parameterAnnotations == null");
        o.b(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f31316d.indexOf(aVar) + 1;
        int size = this.f31316d.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            e<T, b0> eVar = (e<T, b0>) this.f31316d.get(i2).a(type, annotationArr, annotationArr2, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f31316d.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f31316d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f31316d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> e<d0, T> i(@Nullable e.a aVar, Type type, Annotation[] annotationArr) {
        o.b(type, "type == null");
        o.b(annotationArr, "annotations == null");
        int iIndexOf = this.f31316d.indexOf(aVar) + 1;
        int size = this.f31316d.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            e<d0, T> eVar = (e<d0, T>) this.f31316d.get(i2).b(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f31316d.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f31316d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f31316d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> e<T, b0> j(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return h(null, type, annotationArr, annotationArr2);
    }

    public <T> e<d0, T> k(Type type, Annotation[] annotationArr) {
        return i(null, type, annotationArr);
    }

    public <T> e<T, String> l(Type type, Annotation[] annotationArr) {
        o.b(type, "type == null");
        o.b(annotationArr, "annotations == null");
        int size = this.f31316d.size();
        for (int i2 = 0; i2 < size; i2++) {
            e<T, String> eVar = (e<T, String>) this.f31316d.get(i2).c(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        return a.d.f31240a;
    }
}

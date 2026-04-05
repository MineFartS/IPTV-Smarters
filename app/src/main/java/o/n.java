package o;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import k.a0;
import k.b0;
import k.c0;
import k.d0;
import k.e;
import k.s;
import k.t;
import k.v;
import k.w;
import o.i;
import o.q.p;
import o.q.q;
import o.q.r;
import o.q.u;
import o.q.x;

/* JADX INFO: loaded from: classes.dex */
public final class n<R, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f31330a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f31331b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.a f31332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c<R, T> f31333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e<d0, R> f31335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f31336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f31337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f31338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f31339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f31340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f31341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f31342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i<?>[] f31343n;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f31344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f31345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Annotation[] f31346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[][] f31347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Type[] f31348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Type f31349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f31350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f31351h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f31352i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f31353j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f31354k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f31355l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f31356m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f31357n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f31358o;
        public boolean p;
        public String q;
        public s r;
        public v s;
        public Set<String> t;
        public i<?>[] u;
        public e<d0, T> v;
        public c<T, R> w;

        public a(m mVar, Method method) {
            this.f31344a = mVar;
            this.f31345b = method;
            this.f31346c = method.getAnnotations();
            this.f31348e = method.getGenericParameterTypes();
            this.f31347d = method.getParameterAnnotations();
        }

        public n a() {
            c<T, R> cVarB = b();
            this.w = cVarB;
            Type typeA = cVarB.a();
            this.f31349f = typeA;
            if (typeA == l.class || typeA == c0.class) {
                throw d("'" + o.j(this.f31349f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
            }
            this.v = c();
            for (Annotation annotation : this.f31346c) {
                j(annotation);
            }
            if (this.f31356m == null) {
                throw d("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f31357n) {
                if (this.p) {
                    throw d("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f31358o) {
                    throw d("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f31347d.length;
            this.u = new i[length];
            for (int i2 = 0; i2 < length; i2++) {
                Type type = this.f31348e[i2];
                if (o.l(type)) {
                    throw f(i2, "Parameter type must not include a type variable or wildcard: %s", type);
                }
                Annotation[] annotationArr = this.f31347d[i2];
                if (annotationArr == null) {
                    throw f(i2, "No Retrofit annotation found.", new Object[0]);
                }
                this.u[i2] = k(i2, type, annotationArr);
            }
            if (this.q == null && !this.f31355l) {
                throw d("Missing either @%s URL or @Url parameter.", this.f31356m);
            }
            boolean z = this.f31358o;
            if (!z && !this.p && !this.f31357n && this.f31352i) {
                throw d("Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f31350g) {
                throw d("Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.p || this.f31351h) {
                return new n(this);
            }
            throw d("Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final c<T, R> b() {
            Type genericReturnType = this.f31345b.getGenericReturnType();
            if (o.l(genericReturnType)) {
                throw d("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            }
            if (genericReturnType == Void.TYPE) {
                throw d("Service methods cannot return void.", new Object[0]);
            }
            try {
                return (c<T, R>) this.f31344a.b(genericReturnType, this.f31345b.getAnnotations());
            } catch (RuntimeException e2) {
                throw e(e2, "Unable to create call adapter for %s", genericReturnType);
            }
        }

        public final e<d0, T> c() {
            try {
                return this.f31344a.k(this.f31349f, this.f31345b.getAnnotations());
            } catch (RuntimeException e2) {
                throw e(e2, "Unable to create converter for %s", this.f31349f);
            }
        }

        public final RuntimeException d(String str, Object... objArr) {
            return e(null, str, objArr);
        }

        public final RuntimeException e(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + this.f31345b.getDeclaringClass().getSimpleName() + InstructionFileId.DOT + this.f31345b.getName(), th);
        }

        public final RuntimeException f(int i2, String str, Object... objArr) {
            return d(str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        public final RuntimeException g(Throwable th, int i2, String str, Object... objArr) {
            return e(th, str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        public final s h(String[] strArr) {
            s.a aVar = new s.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw d("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    v vVarC = v.c(strTrim);
                    if (vVarC == null) {
                        throw d("Malformed content type: %s", strTrim);
                    }
                    this.s = vVarC;
                } else {
                    aVar.a(strSubstring, strTrim);
                }
            }
            return aVar.d();
        }

        public final void i(String str, String str2, boolean z) {
            String str3 = this.f31356m;
            if (str3 != null) {
                throw d("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f31356m = str;
            this.f31357n = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (n.f31330a.matcher(strSubstring).find()) {
                    throw d("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.q = str2;
            this.t = n.b(str2);
        }

        public final void j(Annotation annotation) {
            String strValue;
            String str;
            String strValue2;
            String str2;
            if (annotation instanceof o.q.b) {
                strValue = ((o.q.b) annotation).value();
                str = "DELETE";
            } else {
                if (!(annotation instanceof o.q.f)) {
                    if (annotation instanceof o.q.g) {
                        i("HEAD", ((o.q.g) annotation).value(), false);
                        if (!Void.class.equals(this.f31349f)) {
                            throw d("HEAD method must use Void as response type.", new Object[0]);
                        }
                        return;
                    }
                    if (annotation instanceof o.q.n) {
                        strValue2 = ((o.q.n) annotation).value();
                        str2 = "PATCH";
                    } else if (annotation instanceof o.q.o) {
                        strValue2 = ((o.q.o) annotation).value();
                        str2 = ClientConstants.HTTP_REQUEST_TYPE_POST;
                    } else if (annotation instanceof p) {
                        strValue2 = ((p) annotation).value();
                        str2 = "PUT";
                    } else {
                        if (!(annotation instanceof o.q.m)) {
                            if (annotation instanceof o.q.h) {
                                o.q.h hVar = (o.q.h) annotation;
                                i(hVar.method(), hVar.path(), hVar.hasBody());
                                return;
                            }
                            if (annotation instanceof o.q.k) {
                                String[] strArrValue = ((o.q.k) annotation).value();
                                if (strArrValue.length == 0) {
                                    throw d("@Headers annotation is empty.", new Object[0]);
                                }
                                this.r = h(strArrValue);
                                return;
                            }
                            if (annotation instanceof o.q.l) {
                                if (this.f31358o) {
                                    throw d("Only one encoding annotation is allowed.", new Object[0]);
                                }
                                this.p = true;
                                return;
                            } else {
                                if (annotation instanceof o.q.e) {
                                    if (this.p) {
                                        throw d("Only one encoding annotation is allowed.", new Object[0]);
                                    }
                                    this.f31358o = true;
                                    return;
                                }
                                return;
                            }
                        }
                        strValue = ((o.q.m) annotation).value();
                        str = "OPTIONS";
                    }
                    i(str2, strValue2, true);
                    return;
                }
                strValue = ((o.q.f) annotation).value();
                str = "GET";
            }
            i(str, strValue, false);
        }

        public final i<?> k(int i2, Type type, Annotation[] annotationArr) {
            i<?> iVar = null;
            for (Annotation annotation : annotationArr) {
                i<?> iVarL = l(i2, type, annotationArr, annotation);
                if (iVarL != null) {
                    if (iVar != null) {
                        throw f(i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    iVar = iVarL;
                }
            }
            if (iVar != null) {
                return iVar;
            }
            throw f(i2, "No Retrofit annotation found.", new Object[0]);
        }

        public final i<?> l(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof x) {
                if (this.f31355l) {
                    throw f(i2, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f31353j) {
                    throw f(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f31354k) {
                    throw f(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                }
                if (this.q != null) {
                    throw f(i2, "@Url cannot be used with @%s URL", this.f31356m);
                }
                this.f31355l = true;
                if (type == t.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new i.o();
                }
                throw f(i2, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof o.q.s) {
                if (this.f31354k) {
                    throw f(i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f31355l) {
                    throw f(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.q == null) {
                    throw f(i2, "@Path can only be used with relative url on @%s", this.f31356m);
                }
                this.f31353j = true;
                o.q.s sVar = (o.q.s) annotation;
                String strValue = sVar.value();
                m(i2, strValue);
                return new i.j(strValue, this.f31344a.l(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof o.q.t) {
                o.q.t tVar = (o.q.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsJ = o.j(type);
                this.f31354k = true;
                if (!Iterable.class.isAssignableFrom(clsJ)) {
                    return clsJ.isArray() ? new i.k(strValue2, this.f31344a.l(n.a(clsJ.getComponentType()), annotationArr), zEncoded).b() : new i.k(strValue2, this.f31344a.l(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new i.k(strValue2, this.f31344a.l(o.i(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw f(i2, clsJ.getSimpleName() + " must include generic type (e.g., " + clsJ.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.q.v) {
                boolean zEncoded2 = ((o.q.v) annotation).encoded();
                Class<?> clsJ2 = o.j(type);
                this.f31354k = true;
                if (!Iterable.class.isAssignableFrom(clsJ2)) {
                    return clsJ2.isArray() ? new i.m(this.f31344a.l(n.a(clsJ2.getComponentType()), annotationArr), zEncoded2).b() : new i.m(this.f31344a.l(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new i.m(this.f31344a.l(o.i(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw f(i2, clsJ2.getSimpleName() + " must include generic type (e.g., " + clsJ2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof u) {
                Class<?> clsJ3 = o.j(type);
                if (!Map.class.isAssignableFrom(clsJ3)) {
                    throw f(i2, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeK = o.k(type, clsJ3, Map.class);
                if (!(typeK instanceof ParameterizedType)) {
                    throw f(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeK;
                Type typeI = o.i(0, parameterizedType);
                if (String.class == typeI) {
                    return new i.l(this.f31344a.l(o.i(1, parameterizedType), annotationArr), ((u) annotation).encoded());
                }
                throw f(i2, "@QueryMap keys must be of type String: " + typeI, new Object[0]);
            }
            if (annotation instanceof o.q.i) {
                String strValue3 = ((o.q.i) annotation).value();
                Class<?> clsJ4 = o.j(type);
                if (!Iterable.class.isAssignableFrom(clsJ4)) {
                    return clsJ4.isArray() ? new i.f(strValue3, this.f31344a.l(n.a(clsJ4.getComponentType()), annotationArr)).b() : new i.f(strValue3, this.f31344a.l(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new i.f(strValue3, this.f31344a.l(o.i(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw f(i2, clsJ4.getSimpleName() + " must include generic type (e.g., " + clsJ4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.q.j) {
                Class<?> clsJ5 = o.j(type);
                if (!Map.class.isAssignableFrom(clsJ5)) {
                    throw f(i2, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeK2 = o.k(type, clsJ5, Map.class);
                if (!(typeK2 instanceof ParameterizedType)) {
                    throw f(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeK2;
                Type typeI2 = o.i(0, parameterizedType2);
                if (String.class == typeI2) {
                    return new i.g(this.f31344a.l(o.i(1, parameterizedType2), annotationArr));
                }
                throw f(i2, "@HeaderMap keys must be of type String: " + typeI2, new Object[0]);
            }
            if (annotation instanceof o.q.c) {
                if (!this.f31358o) {
                    throw f(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                o.q.c cVar = (o.q.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f31350g = true;
                Class<?> clsJ6 = o.j(type);
                if (!Iterable.class.isAssignableFrom(clsJ6)) {
                    return clsJ6.isArray() ? new i.d(strValue4, this.f31344a.l(n.a(clsJ6.getComponentType()), annotationArr), zEncoded3).b() : new i.d(strValue4, this.f31344a.l(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new i.d(strValue4, this.f31344a.l(o.i(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw f(i2, clsJ6.getSimpleName() + " must include generic type (e.g., " + clsJ6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.q.d) {
                if (!this.f31358o) {
                    throw f(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsJ7 = o.j(type);
                if (!Map.class.isAssignableFrom(clsJ7)) {
                    throw f(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeK3 = o.k(type, clsJ7, Map.class);
                if (!(typeK3 instanceof ParameterizedType)) {
                    throw f(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeK3;
                Type typeI3 = o.i(0, parameterizedType3);
                if (String.class == typeI3) {
                    e<T, String> eVarL = this.f31344a.l(o.i(1, parameterizedType3), annotationArr);
                    this.f31350g = true;
                    return new i.e(eVarL, ((o.q.d) annotation).encoded());
                }
                throw f(i2, "@FieldMap keys must be of type String: " + typeI3, new Object[0]);
            }
            if (!(annotation instanceof q)) {
                if (!(annotation instanceof r)) {
                    if (!(annotation instanceof o.q.a)) {
                        return null;
                    }
                    if (this.f31358o || this.p) {
                        throw f(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f31352i) {
                        throw f(i2, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        e<T, b0> eVarJ = this.f31344a.j(type, annotationArr, this.f31346c);
                        this.f31352i = true;
                        return new i.c(eVarJ);
                    } catch (RuntimeException e2) {
                        throw g(e2, i2, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!this.p) {
                    throw f(i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f31351h = true;
                Class<?> clsJ8 = o.j(type);
                if (!Map.class.isAssignableFrom(clsJ8)) {
                    throw f(i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeK4 = o.k(type, clsJ8, Map.class);
                if (!(typeK4 instanceof ParameterizedType)) {
                    throw f(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeK4;
                Type typeI4 = o.i(0, parameterizedType4);
                if (String.class == typeI4) {
                    Type typeI5 = o.i(1, parameterizedType4);
                    if (w.b.class.isAssignableFrom(o.j(typeI5))) {
                        throw f(i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new i.C0323i(this.f31344a.j(typeI5, annotationArr, this.f31346c), ((r) annotation).encoding());
                }
                throw f(i2, "@PartMap keys must be of type String: " + typeI4, new Object[0]);
            }
            if (!this.p) {
                throw f(i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            q qVar = (q) annotation;
            this.f31351h = true;
            String strValue5 = qVar.value();
            Class<?> clsJ9 = o.j(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsJ9)) {
                    if (clsJ9.isArray()) {
                        if (w.b.class.isAssignableFrom(clsJ9.getComponentType())) {
                            return i.n.f31294a.b();
                        }
                        throw f(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (w.b.class.isAssignableFrom(clsJ9)) {
                        return i.n.f31294a;
                    }
                    throw f(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (w.b.class.isAssignableFrom(o.j(o.i(0, (ParameterizedType) type)))) {
                        return i.n.f31294a.c();
                    }
                    throw f(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw f(i2, clsJ9.getSimpleName() + " must include generic type (e.g., " + clsJ9.getSimpleName() + "<String>)", new Object[0]);
            }
            s sVarE = s.e(Headers.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsJ9)) {
                if (!clsJ9.isArray()) {
                    if (w.b.class.isAssignableFrom(clsJ9)) {
                        throw f(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new i.h(sVarE, this.f31344a.j(type, annotationArr, this.f31346c));
                }
                Class<?> clsA = n.a(clsJ9.getComponentType());
                if (w.b.class.isAssignableFrom(clsA)) {
                    throw f(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new i.h(sVarE, this.f31344a.j(clsA, annotationArr, this.f31346c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeI6 = o.i(0, (ParameterizedType) type);
                if (w.b.class.isAssignableFrom(o.j(typeI6))) {
                    throw f(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new i.h(sVarE, this.f31344a.j(typeI6, annotationArr, this.f31346c)).c();
            }
            throw f(i2, clsJ9.getSimpleName() + " must include generic type (e.g., " + clsJ9.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void m(int i2, String str) {
            if (!n.f31331b.matcher(str).matches()) {
                throw f(i2, "@Path parameter name must match %s. Found: %s", n.f31330a.pattern(), str);
            }
            if (!this.t.contains(str)) {
                throw f(i2, "URL \"%s\" does not contain \"{%s}\".", this.q, str);
            }
        }
    }

    public n(a<R, T> aVar) {
        this.f31332c = aVar.f31344a.c();
        this.f31333d = aVar.w;
        this.f31334e = aVar.f31344a.a();
        this.f31335f = aVar.v;
        this.f31336g = aVar.f31356m;
        this.f31337h = aVar.q;
        this.f31338i = aVar.r;
        this.f31339j = aVar.s;
        this.f31340k = aVar.f31357n;
        this.f31341l = aVar.f31358o;
        this.f31342m = aVar.p;
        this.f31343n = aVar.u;
    }

    public static Class<?> a(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public static Set<String> b(String str) {
        Matcher matcher = f31330a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    public a0 c(@Nullable Object... objArr) {
        k kVar = new k(this.f31336g, this.f31334e, this.f31337h, this.f31338i, this.f31339j, this.f31340k, this.f31341l, this.f31342m);
        i<?>[] iVarArr = this.f31343n;
        int length = objArr != null ? objArr.length : 0;
        if (length == iVarArr.length) {
            for (int i2 = 0; i2 < length; i2++) {
                iVarArr[i2].a(kVar, objArr[i2]);
            }
            return kVar.g();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + iVarArr.length + ")");
    }

    public R d(d0 d0Var) {
        return this.f31335f.a(d0Var);
    }
}

package c.f.c.n.j;

import c.f.c.n.f;
import c.f.c.n.g;
import c.f.c.n.h;
import com.amazonaws.util.DateUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements c.f.c.n.i.b<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.c.n.e<Object> f16134a = c.f.c.n.j.a.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g<String> f16135b = c.f.c.n.j.b.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g<Boolean> f16136c = c.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16137d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, c.f.c.n.e<?>> f16138e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, g<?>> f16139f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.c.n.e<Object> f16140g = f16134a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16141h = false;

    public class a implements c.f.c.n.a {
        public a() {
        }

        @Override // c.f.c.n.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f16138e, d.this.f16139f, d.this.f16140g, d.this.f16141h);
            eVar.i(obj, false);
            eVar.q();
        }

        @Override // c.f.c.n.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class b implements g<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f16143a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
            f16143a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // c.f.c.n.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, h hVar) {
            hVar.c(f16143a.format(date));
        }
    }

    public d() {
        m(String.class, f16135b);
        m(Boolean.class, f16136c);
        m(Date.class, f16137d);
    }

    public static /* synthetic */ void i(Object obj, f fVar) {
        throw new c.f.c.n.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public c.f.c.n.a f() {
        return new a();
    }

    public d g(c.f.c.n.i.a aVar) {
        aVar.a(this);
        return this;
    }

    public d h(boolean z) {
        this.f16141h = z;
        return this;
    }

    @Override // c.f.c.n.i.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, c.f.c.n.e<? super T> eVar) {
        this.f16138e.put(cls, eVar);
        this.f16139f.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, g<? super T> gVar) {
        this.f16139f.put(cls, gVar);
        this.f16138e.remove(cls);
        return this;
    }
}

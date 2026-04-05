package c.f.d.w.n;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static final c.f.d.t<String> A;
    public static final c.f.d.t<BigDecimal> B;
    public static final c.f.d.t<BigInteger> C;
    public static final c.f.d.u D;
    public static final c.f.d.t<StringBuilder> E;
    public static final c.f.d.u F;
    public static final c.f.d.t<StringBuffer> G;
    public static final c.f.d.u H;
    public static final c.f.d.t<URL> I;
    public static final c.f.d.u J;
    public static final c.f.d.t<URI> K;
    public static final c.f.d.u L;
    public static final c.f.d.t<InetAddress> M;
    public static final c.f.d.u N;
    public static final c.f.d.t<UUID> O;
    public static final c.f.d.u P;
    public static final c.f.d.t<Currency> Q;
    public static final c.f.d.u R;
    public static final c.f.d.u S;
    public static final c.f.d.t<Calendar> T;
    public static final c.f.d.u U;
    public static final c.f.d.t<Locale> V;
    public static final c.f.d.u W;
    public static final c.f.d.t<c.f.d.j> X;
    public static final c.f.d.u Y;
    public static final c.f.d.u Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.d.t<Class> f16598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.d.u f16599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.f.d.t<BitSet> f16600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c.f.d.u f16601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c.f.d.t<Boolean> f16602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c.f.d.t<Boolean> f16603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c.f.d.u f16604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c.f.d.t<Number> f16605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c.f.d.u f16606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c.f.d.t<Number> f16607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c.f.d.u f16608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c.f.d.t<Number> f16609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c.f.d.u f16610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c.f.d.t<AtomicInteger> f16611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c.f.d.u f16612o;
    public static final c.f.d.t<AtomicBoolean> p;
    public static final c.f.d.u q;
    public static final c.f.d.t<AtomicIntegerArray> r;
    public static final c.f.d.u s;
    public static final c.f.d.t<Number> t;
    public static final c.f.d.t<Number> u;
    public static final c.f.d.t<Number> v;
    public static final c.f.d.t<Number> w;
    public static final c.f.d.u x;
    public static final c.f.d.t<Character> y;
    public static final c.f.d.u z;

    public class a extends c.f.d.t<AtomicIntegerArray> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(c.f.d.y.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.d();
            while (aVar.s()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.y()));
                } catch (NumberFormatException e2) {
                    throw new c.f.d.r(e2);
                }
            }
            aVar.o();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.l();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.B0(atomicIntegerArray.get(i2));
            }
            cVar.o();
        }
    }

    public class a0 implements c.f.d.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f16613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.f.d.t f16614c;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        public class a<T1> extends c.f.d.t<T1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f16615a;

            public a(Class cls) {
                this.f16615a = cls;
            }

            @Override // c.f.d.t
            public T1 b(c.f.d.y.a aVar) {
                T1 t1 = (T1) a0.this.f16614c.b(aVar);
                if (t1 == null || this.f16615a.isInstance(t1)) {
                    return t1;
                }
                throw new c.f.d.r("Expected a " + this.f16615a.getName() + " but was " + t1.getClass().getName());
            }

            @Override // c.f.d.t
            public void d(c.f.d.y.c cVar, T1 t1) {
                a0.this.f16614c.d(cVar, t1);
            }
        }

        public a0(Class cls, c.f.d.t tVar) {
            this.f16613b = cls;
            this.f16614c = tVar;
        }

        @Override // c.f.d.u
        public <T2> c.f.d.t<T2> a(c.f.d.e eVar, c.f.d.x.a<T2> aVar) {
            Class<? super T2> clsC = aVar.c();
            if (this.f16613b.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f16613b.getName() + ",adapter=" + this.f16614c + "]";
        }
    }

    public class b extends c.f.d.t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Long.valueOf(aVar.Q());
            } catch (NumberFormatException e2) {
                throw new c.f.d.r(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            cVar.D0(number);
        }
    }

    public static /* synthetic */ class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16617a;

        static {
            int[] iArr = new int[c.f.d.y.b.values().length];
            f16617a = iArr;
            try {
                iArr[c.f.d.y.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16617a[c.f.d.y.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16617a[c.f.d.y.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16617a[c.f.d.y.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16617a[c.f.d.y.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16617a[c.f.d.y.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16617a[c.f.d.y.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16617a[c.f.d.y.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16617a[c.f.d.y.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16617a[c.f.d.y.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public class c extends c.f.d.t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return Float.valueOf((float) aVar.x());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            cVar.D0(number);
        }
    }

    public class c0 extends c.f.d.t<Boolean> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(c.f.d.y.a aVar) throws IOException {
            c.f.d.y.b bVarB0 = aVar.B0();
            if (bVarB0 != c.f.d.y.b.NULL) {
                return bVarB0 == c.f.d.y.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.w0())) : Boolean.valueOf(aVar.w());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Boolean bool) throws IOException {
            cVar.C0(bool);
        }
    }

    public class d extends c.f.d.t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return Double.valueOf(aVar.x());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            cVar.D0(number);
        }
    }

    public class d0 extends c.f.d.t<Boolean> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return Boolean.valueOf(aVar.w0());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Boolean bool) throws IOException {
            cVar.E0(bool == null ? Constants.NULL_VERSION_ID : bool.toString());
        }
    }

    public class e extends c.f.d.t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            c.f.d.y.b bVarB0 = aVar.B0();
            int i2 = b0.f16617a[bVarB0.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new c.f.d.w.g(aVar.w0());
            }
            if (i2 == 4) {
                aVar.c0();
                return null;
            }
            throw new c.f.d.r("Expecting number, got: " + bVarB0);
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            cVar.D0(number);
        }
    }

    public class e0 extends c.f.d.t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.y());
            } catch (NumberFormatException e2) {
                throw new c.f.d.r(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            cVar.D0(number);
        }
    }

    public class f extends c.f.d.t<Character> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            String strW0 = aVar.w0();
            if (strW0.length() == 1) {
                return Character.valueOf(strW0.charAt(0));
            }
            throw new c.f.d.r("Expecting character, got: " + strW0);
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Character ch) throws IOException {
            cVar.E0(ch == null ? null : String.valueOf(ch));
        }
    }

    public class f0 extends c.f.d.t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.y());
            } catch (NumberFormatException e2) {
                throw new c.f.d.r(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            cVar.D0(number);
        }
    }

    public class g extends c.f.d.t<String> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(c.f.d.y.a aVar) throws IOException {
            c.f.d.y.b bVarB0 = aVar.B0();
            if (bVarB0 != c.f.d.y.b.NULL) {
                return bVarB0 == c.f.d.y.b.BOOLEAN ? Boolean.toString(aVar.w()) : aVar.w0();
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, String str) throws IOException {
            cVar.E0(str);
        }
    }

    public class g0 extends c.f.d.t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.y());
            } catch (NumberFormatException e2) {
                throw new c.f.d.r(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            cVar.D0(number);
        }
    }

    public class h extends c.f.d.t<BigDecimal> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return new BigDecimal(aVar.w0());
            } catch (NumberFormatException e2) {
                throw new c.f.d.r(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.D0(bigDecimal);
        }
    }

    public class h0 extends c.f.d.t<AtomicInteger> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(c.f.d.y.a aVar) {
            try {
                return new AtomicInteger(aVar.y());
            } catch (NumberFormatException e2) {
                throw new c.f.d.r(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.B0(atomicInteger.get());
        }
    }

    public class i extends c.f.d.t<BigInteger> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return new BigInteger(aVar.w0());
            } catch (NumberFormatException e2) {
                throw new c.f.d.r(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, BigInteger bigInteger) throws IOException {
            cVar.D0(bigInteger);
        }
    }

    public class i0 extends c.f.d.t<AtomicBoolean> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(c.f.d.y.a aVar) {
            return new AtomicBoolean(aVar.w());
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.F0(atomicBoolean.get());
        }
    }

    public class j extends c.f.d.t<StringBuilder> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return new StringBuilder(aVar.w0());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, StringBuilder sb) throws IOException {
            cVar.E0(sb == null ? null : sb.toString());
        }
    }

    public static final class j0<T extends Enum<T>> extends c.f.d.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, T> f16618a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<T, String> f16619b = new HashMap();

        public j0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    c.f.d.v.c cVar = (c.f.d.v.c) cls.getField(strName).getAnnotation(c.f.d.v.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f16618a.put(str, t);
                        }
                    }
                    this.f16618a.put(strName, t);
                    this.f16619b.put(t, strName);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return this.f16618a.get(aVar.w0());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, T t) throws IOException {
            cVar.E0(t == null ? null : this.f16619b.get(t));
        }
    }

    public class k extends c.f.d.t<Class> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(c.f.d.y.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public class l extends c.f.d.t<StringBuffer> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return new StringBuffer(aVar.w0());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.E0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class m extends c.f.d.t<URL> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            String strW0 = aVar.w0();
            if (Constants.NULL_VERSION_ID.equals(strW0)) {
                return null;
            }
            return new URL(strW0);
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, URL url) throws IOException {
            cVar.E0(url == null ? null : url.toExternalForm());
        }
    }

    /* JADX INFO: renamed from: c.f.d.w.n.n$n, reason: collision with other inner class name */
    public class C0205n extends c.f.d.t<URI> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                String strW0 = aVar.w0();
                if (Constants.NULL_VERSION_ID.equals(strW0)) {
                    return null;
                }
                return new URI(strW0);
            } catch (URISyntaxException e2) {
                throw new c.f.d.k(e2);
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, URI uri) throws IOException {
            cVar.E0(uri == null ? null : uri.toASCIIString());
        }
    }

    public class o extends c.f.d.t<InetAddress> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return InetAddress.getByName(aVar.w0());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, InetAddress inetAddress) throws IOException {
            cVar.E0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class p extends c.f.d.t<UUID> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return UUID.fromString(aVar.w0());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, UUID uuid) throws IOException {
            cVar.E0(uuid == null ? null : uuid.toString());
        }
    }

    public class q extends c.f.d.t<Currency> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(c.f.d.y.a aVar) {
            return Currency.getInstance(aVar.w0());
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Currency currency) throws IOException {
            cVar.E0(currency.getCurrencyCode());
        }
    }

    public class r implements c.f.d.u {

        public class a extends c.f.d.t<Timestamp> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.f.d.t f16620a;

            public a(c.f.d.t tVar) {
                this.f16620a = tVar;
            }

            @Override // c.f.d.t
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Timestamp b(c.f.d.y.a aVar) {
                Date date = (Date) this.f16620a.b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // c.f.d.t
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(c.f.d.y.c cVar, Timestamp timestamp) {
                this.f16620a.d(cVar, timestamp);
            }
        }

        @Override // c.f.d.u
        public <T> c.f.d.t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(eVar.m(Date.class));
        }
    }

    public class s extends c.f.d.t<Calendar> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            aVar.i();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.B0() != c.f.d.y.b.END_OBJECT) {
                String strU = aVar.U();
                int iY = aVar.y();
                if ("year".equals(strU)) {
                    i2 = iY;
                } else if ("month".equals(strU)) {
                    i3 = iY;
                } else if ("dayOfMonth".equals(strU)) {
                    i4 = iY;
                } else if ("hourOfDay".equals(strU)) {
                    i5 = iY;
                } else if ("minute".equals(strU)) {
                    i6 = iY;
                } else if ("second".equals(strU)) {
                    i7 = iY;
                }
            }
            aVar.p();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.v();
                return;
            }
            cVar.m();
            cVar.t("year");
            cVar.B0(calendar.get(1));
            cVar.t("month");
            cVar.B0(calendar.get(2));
            cVar.t("dayOfMonth");
            cVar.B0(calendar.get(5));
            cVar.t("hourOfDay");
            cVar.B0(calendar.get(11));
            cVar.t("minute");
            cVar.B0(calendar.get(12));
            cVar.t("second");
            cVar.B0(calendar.get(13));
            cVar.p();
        }
    }

    public class t extends c.f.d.t<Locale> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.w0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Locale locale) throws IOException {
            cVar.E0(locale == null ? null : locale.toString());
        }
    }

    public class u extends c.f.d.t<c.f.d.j> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c.f.d.j b(c.f.d.y.a aVar) throws IOException {
            switch (b0.f16617a[aVar.B0().ordinal()]) {
                case 1:
                    return new c.f.d.o(new c.f.d.w.g(aVar.w0()));
                case 2:
                    return new c.f.d.o(Boolean.valueOf(aVar.w()));
                case 3:
                    return new c.f.d.o(aVar.w0());
                case 4:
                    aVar.c0();
                    return c.f.d.l.f16461a;
                case 5:
                    c.f.d.g gVar = new c.f.d.g();
                    aVar.d();
                    while (aVar.s()) {
                        gVar.B(b(aVar));
                    }
                    aVar.o();
                    return gVar;
                case 6:
                    c.f.d.m mVar = new c.f.d.m();
                    aVar.i();
                    while (aVar.s()) {
                        mVar.B(aVar.U(), b(aVar));
                    }
                    aVar.p();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, c.f.d.j jVar) throws IOException {
            if (jVar == null || jVar.t()) {
                cVar.v();
                return;
            }
            if (jVar.x()) {
                c.f.d.o oVarG = jVar.g();
                if (oVarG.L()) {
                    cVar.D0(oVarG.I());
                    return;
                } else if (oVarG.J()) {
                    cVar.F0(oVarG.B());
                    return;
                } else {
                    cVar.E0(oVarG.i());
                    return;
                }
            }
            if (jVar.s()) {
                cVar.l();
                Iterator<c.f.d.j> it = jVar.d().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.o();
                return;
            }
            if (!jVar.v()) {
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            }
            cVar.m();
            for (Map.Entry<String, c.f.d.j> entry : jVar.f().D()) {
                cVar.t(entry.getKey());
                d(cVar, entry.getValue());
            }
            cVar.p();
        }
    }

    public class v extends c.f.d.t<BitSet> {
        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet b(c.f.d.y.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.d()
                c.f.d.y.b r1 = r8.B0()
                r2 = 0
                r3 = 0
            Le:
                c.f.d.y.b r4 = c.f.d.y.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = c.f.d.w.n.n.b0.f16617a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.w0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                c.f.d.r r8 = new c.f.d.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                c.f.d.r r8 = new c.f.d.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.w()
                goto L69
            L63:
                int r1 = r8.y()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                c.f.d.y.b r1 = r8.B0()
                goto Le
            L75:
                r8.o()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.d.w.n.n.v.b(c.f.d.y.a):java.util.BitSet");
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, BitSet bitSet) throws IOException {
            cVar.l();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.B0(bitSet.get(i2) ? 1L : 0L);
            }
            cVar.o();
        }
    }

    public class w implements c.f.d.u {
        @Override // c.f.d.u
        public <T> c.f.d.t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new j0(clsC);
        }
    }

    public class x implements c.f.d.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f16622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.f.d.t f16623c;

        public x(Class cls, c.f.d.t tVar) {
            this.f16622b = cls;
            this.f16623c = tVar;
        }

        @Override // c.f.d.u
        public <T> c.f.d.t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            if (aVar.c() == this.f16622b) {
                return this.f16623c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16622b.getName() + ",adapter=" + this.f16623c + "]";
        }
    }

    public class y implements c.f.d.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f16624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f16625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.f.d.t f16626d;

        public y(Class cls, Class cls2, c.f.d.t tVar) {
            this.f16624b = cls;
            this.f16625c = cls2;
            this.f16626d = tVar;
        }

        @Override // c.f.d.u
        public <T> c.f.d.t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (clsC == this.f16624b || clsC == this.f16625c) {
                return this.f16626d;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16625c.getName() + "+" + this.f16624b.getName() + ",adapter=" + this.f16626d + "]";
        }
    }

    public class z implements c.f.d.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f16627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f16628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.f.d.t f16629d;

        public z(Class cls, Class cls2, c.f.d.t tVar) {
            this.f16627b = cls;
            this.f16628c = cls2;
            this.f16629d = tVar;
        }

        @Override // c.f.d.u
        public <T> c.f.d.t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (clsC == this.f16627b || clsC == this.f16628c) {
                return this.f16629d;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16627b.getName() + "+" + this.f16628c.getName() + ",adapter=" + this.f16629d + "]";
        }
    }

    static {
        c.f.d.t<Class> tVarA = new k().a();
        f16598a = tVarA;
        f16599b = a(Class.class, tVarA);
        c.f.d.t<BitSet> tVarA2 = new v().a();
        f16600c = tVarA2;
        f16601d = a(BitSet.class, tVarA2);
        c0 c0Var = new c0();
        f16602e = c0Var;
        f16603f = new d0();
        f16604g = b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f16605h = e0Var;
        f16606i = b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f16607j = f0Var;
        f16608k = b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f16609l = g0Var;
        f16610m = b(Integer.TYPE, Integer.class, g0Var);
        c.f.d.t<AtomicInteger> tVarA3 = new h0().a();
        f16611n = tVarA3;
        f16612o = a(AtomicInteger.class, tVarA3);
        c.f.d.t<AtomicBoolean> tVarA4 = new i0().a();
        p = tVarA4;
        q = a(AtomicBoolean.class, tVarA4);
        c.f.d.t<AtomicIntegerArray> tVarA5 = new a().a();
        r = tVarA5;
        s = a(AtomicIntegerArray.class, tVarA5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = a(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = a(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        C0205n c0205n = new C0205n();
        K = c0205n;
        L = a(URI.class, c0205n);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        c.f.d.t<Currency> tVarA6 = new q().a();
        Q = tVarA6;
        R = a(Currency.class, tVarA6);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = a(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = d(c.f.d.j.class, uVar);
        Z = new w();
    }

    public static <TT> c.f.d.u a(Class<TT> cls, c.f.d.t<TT> tVar) {
        return new x(cls, tVar);
    }

    public static <TT> c.f.d.u b(Class<TT> cls, Class<TT> cls2, c.f.d.t<? super TT> tVar) {
        return new y(cls, cls2, tVar);
    }

    public static <TT> c.f.d.u c(Class<TT> cls, Class<? extends TT> cls2, c.f.d.t<? super TT> tVar) {
        return new z(cls, cls2, tVar);
    }

    public static <T1> c.f.d.u d(Class<T1> cls, c.f.d.t<T1> tVar) {
        return new a0(cls, tVar);
    }
}

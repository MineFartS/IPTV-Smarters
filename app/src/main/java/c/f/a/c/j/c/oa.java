package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import c.f.a.c.j.c.oa.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oa<MessageType extends oa<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends d9<MessageType, BuilderType> {
    private static Map<Object, oa<?, ?>> zzbqz = new ConcurrentHashMap();
    public kd zzbqx = kd.h();
    private int zzbqy = -1;

    public static class a<T extends oa<T, ?>> extends h9<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f12992b;

        public a(T t) {
            this.f12992b = t;
        }
    }

    public static abstract class b<MessageType extends oa<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends f9<MessageType, BuilderType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MessageType f12993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MessageType f12994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12995d = false;

        public b(MessageType messagetype) {
            this.f12993b = messagetype;
            this.f12994c = (MessageType) messagetype.k(e.f12999d, null, null);
        }

        public static void h(MessageType messagetype, MessageType messagetype2) {
            oc.b().c(messagetype).a(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f12993b.k(e.f13000e, null, null);
            bVar.g((oa) s());
            return bVar;
        }

        @Override // c.f.a.c.j.c.dc
        public final /* synthetic */ bc e() {
            return this.f12993b;
        }

        @Override // c.f.a.c.j.c.f9
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final BuilderType g(MessageType messagetype) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            h(this.f12994c, messagetype);
            return this;
        }

        public void k() {
            MessageType messagetype = (MessageType) this.f12994c.k(e.f12999d, null, null);
            h(messagetype, this.f12994c);
            this.f12994c = messagetype;
        }

        @Override // c.f.a.c.j.c.ac
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public MessageType s() {
            if (this.f12995d) {
                return this.f12994c;
            }
            MessageType messagetype = this.f12994c;
            oc.b().c(messagetype).e(messagetype);
            this.f12995d = true;
            return this.f12994c;
        }

        @Override // c.f.a.c.j.c.ac
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final MessageType v() {
            MessageType messagetype = (MessageType) s();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new id(messagetype);
        }
    }

    public static final class c implements ka<c> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // c.f.a.c.j.c.ka
        public final wd e() {
            throw new NoSuchMethodError();
        }

        @Override // c.f.a.c.j.c.ka
        public final hc f(hc hcVar, hc hcVar2) {
            throw new NoSuchMethodError();
        }

        @Override // c.f.a.c.j.c.ka
        public final de h() {
            throw new NoSuchMethodError();
        }

        @Override // c.f.a.c.j.c.ka
        public final boolean j() {
            throw new NoSuchMethodError();
        }

        @Override // c.f.a.c.j.c.ka
        public final boolean m() {
            throw new NoSuchMethodError();
        }

        @Override // c.f.a.c.j.c.ka
        public final ac n(ac acVar, bc bcVar) {
            throw new NoSuchMethodError();
        }

        @Override // c.f.a.c.j.c.ka
        public final int zzgj() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends oa<MessageType, BuilderType> implements dc {
        public ia<c> zzbre = ia.q();
    }

    public enum e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f12996a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12997b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12998c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f12999d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f13000e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f13001f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f13002g = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f13004i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f13005j = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f13007l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f13008m = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f13003h = {1, 2, 3, 4, 5, 6, 7};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f13006k = {1, 2};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int[] f13009n = {1, 2};

        public static int[] a() {
            return (int[]) f13003h.clone();
        }
    }

    public static <T extends oa<?, ?>> T j(Class<T> cls) {
        oa<?, ?> oaVar = zzbqz.get(cls);
        if (oaVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                oaVar = zzbqz.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (oaVar == null) {
            oaVar = (T) ((oa) nd.r(cls)).k(e.f13001f, null, null);
            if (oaVar == null) {
                throw new IllegalStateException();
            }
            zzbqz.put(cls, oaVar);
        }
        return (T) oaVar;
    }

    public static Object l(bc bcVar, String str, Object[] objArr) {
        return new qc(bcVar, str, objArr);
    }

    public static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends oa<?, ?>> void n(Class<T> cls, T t) {
        zzbqz.put(cls, t);
    }

    public static final <T extends oa<T, ?>> boolean o(T t, boolean z) {
        byte bByteValue = ((Byte) t.k(e.f12996a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = oc.b().c(t).b(t);
        if (z) {
            t.k(e.f12997b, zB ? t : null, null);
        }
        return zB;
    }

    public static wa q() {
        return qa.i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c.f.a.c.j.c.pb, c.f.a.c.j.c.ya] */
    public static ya r() {
        return pb.i();
    }

    public static <E> xa<E> u() {
        return mc.i();
    }

    @Override // c.f.a.c.j.c.bc
    public final /* synthetic */ ac a() {
        b bVar = (b) k(e.f13000e, null, null);
        bVar.g(this);
        return bVar;
    }

    @Override // c.f.a.c.j.c.bc
    public final void b(z9 z9Var) {
        oc.b().c(this).c(this, ca.P(z9Var));
    }

    @Override // c.f.a.c.j.c.bc
    public final int c() {
        if (this.zzbqy == -1) {
            this.zzbqy = oc.b().c(this).f(this);
        }
        return this.zzbqy;
    }

    @Override // c.f.a.c.j.c.dc
    public final /* synthetic */ bc e() {
        return (oa) k(e.f13001f, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return oc.b().c(this).d(this, (oa) obj);
        }
        return false;
    }

    @Override // c.f.a.c.j.c.d9
    public final void g(int i2) {
        this.zzbqy = i2;
    }

    @Override // c.f.a.c.j.c.d9
    public final int h() {
        return this.zzbqy;
    }

    public int hashCode() {
        int i2 = this.zzbmy;
        if (i2 != 0) {
            return i2;
        }
        int iG = oc.b().c(this).g(this);
        this.zzbmy = iG;
        return iG;
    }

    public final <MessageType extends oa<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType i(MessageType messagetype) {
        return (BuilderType) p().g(messagetype);
    }

    @Override // c.f.a.c.j.c.dc
    public final boolean isInitialized() {
        return o(this, true);
    }

    public abstract Object k(int i2, Object obj, Object obj2);

    public final <MessageType extends oa<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType p() {
        return (BuilderType) k(e.f13000e, null, null);
    }

    public String toString() {
        return cc.a(this, super.toString());
    }
}

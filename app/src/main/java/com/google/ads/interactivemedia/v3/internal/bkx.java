package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bkv;
import com.google.ads.interactivemedia.v3.internal.bkx;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class bkx<MessageType extends bkx<MessageType, BuilderType>, BuilderType extends bkv<MessageType, BuilderType>> extends bjp<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Object, bkx<?, ?>> f21333a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bmz f21334c = bmz.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21335d = -1;

    public static <T extends bkx> T al(Class<T> cls) {
        Map<Object, bkx<?, ?>> map = f21333a;
        bkx<?, ?> bkxVar = map.get(cls);
        if (bkxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                bkxVar = map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (bkxVar == null) {
            bkxVar = (bkx) ((bkx) bnh.e(cls)).av(6);
            if (bkxVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, bkxVar);
        }
        return bkxVar;
    }

    public static <T extends bkx<T, ?>> T am(T t, bkd bkdVar, bkm bkmVar) throws blf {
        try {
            bke bkeVarF = bkdVar.f();
            T t2 = (T) t.av(4);
            try {
                try {
                    try {
                        bmk bmkVarC = bmg.a().c(t2);
                        bmkVarC.h(t2, bkg.q(bkeVarF), bkmVar);
                        bmkVarC.f(t2);
                        try {
                            bkeVarF.C(0);
                            d(t2);
                            return t2;
                        } catch (blf e2) {
                            throw e2;
                        }
                    } catch (blf e3) {
                        throw e3;
                    }
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof blf) {
                        throw ((blf) e4.getCause());
                    }
                    throw e4;
                }
            } catch (IOException e5) {
                if (e5.getCause() instanceof blf) {
                    throw ((blf) e5.getCause());
                }
                throw new blf(e5);
            }
        } catch (blf e6) {
            throw e6;
        }
    }

    public static <T extends bkx<T, ?>> T an(T t, byte[] bArr, bkm bkmVar) throws blf {
        T t2 = (T) aw(t, bArr, bArr.length, bkmVar);
        d(t2);
        return t2;
    }

    public static blb ao() {
        return bky.f();
    }

    public static <E> blc<E> ap() {
        return bmh.e();
    }

    public static <E> blc<E> aq(blc<E> blcVar) {
        int size = blcVar.size();
        return blcVar.d(size == 0 ? 10 : size + size);
    }

    public static Object ar(Method method, Object obj, Object... objArr) {
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

    public static Object as(blz blzVar, String str, Object[] objArr) {
        return new bmi(blzVar, str, objArr);
    }

    public static <T extends bkx> void at(Class<T> cls, T t) {
        f21333a.put(cls, t);
    }

    public static <T extends bkx<T, ?>> T aw(T t, byte[] bArr, int i2, bkm bkmVar) throws blf {
        T t2 = (T) t.av(4);
        try {
            bmk bmkVarC = bmg.a().c(t2);
            bmkVarC.i(t2, bArr, 0, i2, new bjt(bkmVar));
            bmkVarC.f(t2);
            if (t2.f21245b == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (blf e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof blf) {
                throw ((blf) e3.getCause());
            }
            throw new blf(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw blf.h();
        }
    }

    private static <T extends bkx<T, ?>> void d(T t) throws blf {
        if (t != null && !t.au()) {
            throw new blf(new bmy().getMessage());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blz
    public final /* bridge */ /* synthetic */ bly aS() {
        return (bkv) av(5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blz
    public final /* bridge */ /* synthetic */ bly aT() {
        bkv bkvVar = (bkv) av(5);
        bkvVar.ah(this);
        return bkvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bma
    public final /* bridge */ /* synthetic */ blz aU() {
        return (bkx) av(6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blz
    public final void aV(bki bkiVar) {
        bmg.a().c(this).j(this, bkj.a(bkiVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjp
    public final int af() {
        return this.f21335d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjp
    public final void ah(int i2) {
        this.f21335d = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blz
    public final int aj() {
        int i2 = this.f21335d;
        if (i2 != -1) {
            return i2;
        }
        int iA = bmg.a().c(this).a(this);
        this.f21335d = iA;
        return iA;
    }

    public final <MessageType extends bkx<MessageType, BuilderType>, BuilderType extends bkv<MessageType, BuilderType>> BuilderType ak() {
        return (BuilderType) av(5);
    }

    public final boolean au() {
        byte bByteValue = ((Byte) av(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zL = bmg.a().c(this).l(this);
        b(2);
        return zL;
    }

    public final Object av(int i2) {
        return b(i2);
    }

    public abstract Object b(int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return bmg.a().c(this).k(this, (bkx) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f21245b;
        if (i2 != 0) {
            return i2;
        }
        int iB = bmg.a().c(this).b(this);
        this.f21245b = iB;
        return iB;
    }

    public final String toString() {
        return bmb.a(this, super.toString());
    }
}

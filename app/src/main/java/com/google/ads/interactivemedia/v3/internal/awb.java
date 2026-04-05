package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class awb<V> extends aws implements awl<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f20634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f20635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f20636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f20637d;
    private volatile d listeners;
    private volatile Object value;
    private volatile k waiters;

    public abstract class a {
        public abstract void a(k kVar, k kVar2);

        public abstract void b(k kVar, Thread thread);

        public abstract boolean c(awb<?> awbVar, d dVar, d dVar2);

        public abstract boolean d(awb<?> awbVar, Object obj, Object obj2);

        public abstract boolean e(awb<?> awbVar, k kVar, k kVar2);
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Throwable f20641d;

        static {
            if (awb.f20634a) {
                f20639b = null;
                f20638a = null;
            } else {
                f20639b = new b(false, null);
                f20638a = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.f20640c = z;
            this.f20641d = th;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f20642a = new c(new Throwable() { // from class: com.google.ads.interactivemedia.v3.internal.awb.c.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f20643b;

        public c(Throwable th) {
            ars.g(th);
            this.f20643b = th;
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f20644a = new d(null, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f20645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f20646c;
        public d next;

        public d(Runnable runnable, Executor executor) {
            this.f20645b = runnable;
            this.f20646c = executor;
        }
    }

    public final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, Thread> f20647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, k> f20648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<awb, k> f20649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<awb, d> f20650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<awb, Object> f20651e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<awb, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<awb, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<awb, Object> atomicReferenceFieldUpdater5) {
            this.f20647a = atomicReferenceFieldUpdater;
            this.f20648b = atomicReferenceFieldUpdater2;
            this.f20649c = atomicReferenceFieldUpdater3;
            this.f20650d = atomicReferenceFieldUpdater4;
            this.f20651e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final void a(k kVar, k kVar2) {
            this.f20648b.lazySet(kVar, kVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final void b(k kVar, Thread thread) {
            this.f20647a.lazySet(kVar, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean c(awb<?> awbVar, d dVar, d dVar2) {
            return this.f20650d.compareAndSet(awbVar, dVar, dVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean d(awb<?> awbVar, Object obj, Object obj2) {
            return this.f20651e.compareAndSet(awbVar, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean e(awb<?> awbVar, k kVar, k kVar2) {
            return this.f20649c.compareAndSet(awbVar, kVar, kVar2);
        }
    }

    public final class f<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final awb<V> f20652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final awl<? extends V> f20653b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public final class g extends a {
        private g() {
        }

        public /* synthetic */ g(byte[] bArr) {
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final void a(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final void b(k kVar, Thread thread) {
            kVar.thread = thread;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean c(awb<?> awbVar, d dVar, d dVar2) {
            synchronized (awbVar) {
                if (((awb) awbVar).listeners != dVar) {
                    return false;
                }
                ((awb) awbVar).listeners = dVar2;
                return true;
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean d(awb<?> awbVar, Object obj, Object obj2) {
            synchronized (awbVar) {
                if (((awb) awbVar).value != obj) {
                    return false;
                }
                ((awb) awbVar).value = obj2;
                return true;
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean e(awb<?> awbVar, k kVar, k kVar2) {
            synchronized (awbVar) {
                if (((awb) awbVar).waiters != kVar) {
                    return false;
                }
                ((awb) awbVar).waiters = kVar2;
                return true;
            }
        }
    }

    public interface h<V> extends awl<V> {
    }

    public abstract class i<V> extends awb<V> implements h<V> {
    }

    public final class j extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f20654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f20655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f20656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f20657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f20658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f20659f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.ads.interactivemedia.v3.internal.awb.j.1
                        public static final Unsafe a() throws IllegalAccessException {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() {
                            return a();
                        }
                    });
                }
                try {
                    f20656c = unsafe.objectFieldOffset(awb.class.getDeclaredField("waiters"));
                    f20655b = unsafe.objectFieldOffset(awb.class.getDeclaredField("listeners"));
                    f20657d = unsafe.objectFieldOffset(awb.class.getDeclaredField("value"));
                    f20658e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                    f20659f = unsafe.objectFieldOffset(k.class.getDeclaredField("next"));
                    f20654a = unsafe;
                } catch (Exception e2) {
                    arv.a(e2);
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private j() {
        }

        public /* synthetic */ j(byte[] bArr) {
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final void a(k kVar, k kVar2) {
            f20654a.putObject(kVar, f20659f, kVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final void b(k kVar, Thread thread) {
            f20654a.putObject(kVar, f20658e, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean c(awb<?> awbVar, d dVar, d dVar2) {
            return f20654a.compareAndSwapObject(awbVar, f20655b, dVar, dVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean d(awb<?> awbVar, Object obj, Object obj2) {
            return f20654a.compareAndSwapObject(awbVar, f20657d, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.awb.a
        public final boolean e(awb<?> awbVar, k kVar, k kVar2) {
            return f20654a.compareAndSwapObject(awbVar, f20656c, kVar, kVar2);
        }
    }

    public final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f20660a = new k(null);
        public volatile k next;
        public volatile Thread thread;

        public k() {
            awb.f20636c.b(this, Thread.currentThread());
        }

        public k(byte[] bArr) {
        }

        public final void a(k kVar) {
            awb.f20636c.a(this, kVar);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f20634a = z;
        f20635b = Logger.getLogger(awb.class.getName());
        byte[] bArr = null;
        try {
            gVar = new j(bArr);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "next"), AtomicReferenceFieldUpdater.newUpdater(awb.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(awb.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(awb.class, Object.class, "value"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                gVar = new g(bArr);
            }
        }
        f20636c = gVar;
        if (th != null) {
            Logger logger = f20635b;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f20637d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object p(awl<?> awlVar) {
        Throwable thF;
        if (awlVar instanceof h) {
            Object obj = ((awb) awlVar).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (!bVar.f20640c) {
                return obj;
            }
            Throwable th = bVar.f20641d;
            return th != null ? new b(false, th) : b.f20639b;
        }
        if ((awlVar instanceof aws) && (thF = ((aws) awlVar).f()) != null) {
            return new c(thF);
        }
        boolean zIsCancelled = awlVar.isCancelled();
        if ((!f20634a) && zIsCancelled) {
            return b.f20639b;
        }
        try {
            Object objQ = q(awlVar);
            if (!zIsCancelled) {
                return objQ == null ? f20637d : objQ;
            }
            String strValueOf = String.valueOf(awlVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new b(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new b(false, e2);
            }
            String strValueOf2 = String.valueOf(awlVar);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new c(new IllegalArgumentException(sb2.toString(), e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new c(e3.getCause());
            }
            String strValueOf3 = String.valueOf(awlVar);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new b(false, new IllegalArgumentException(sb3.toString(), e3));
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    private static <V> V q(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private final void r(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object objQ = q(this);
            sb.append("SUCCESS, result=[");
            if (objQ == null) {
                hexString = Constants.NULL_VERSION_ID;
            } else if (objQ == this) {
                hexString = "this future";
            } else {
                sb.append(objQ.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(objQ));
            }
            sb.append(hexString);
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.value
            boolean r2 = r1 instanceof com.google.ads.interactivemedia.v3.internal.awb.f
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.ads.interactivemedia.v3.internal.awb$f r1 = (com.google.ads.interactivemedia.v3.internal.awb.f) r1
            com.google.ads.interactivemedia.v3.internal.awl<? extends V> r1 = r1.f20653b
            r5.t(r6, r1)
        L1d:
            r6.append(r3)
            goto L57
        L21:
            java.lang.String r1 = r5.e()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.google.ads.interactivemedia.v3.internal.art.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L4c
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 38
            r4.<init>(r2)
            java.lang.String r2 = "Exception thrown from implementation: "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L4c:
            if (r1 == 0) goto L57
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            goto L1d
        L57:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L67
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.r(r6)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.awb.s(java.lang.StringBuilder):void");
    }

    private final void t(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static void u(awb<?> awbVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            k kVar = ((awb) awbVar).waiters;
            if (f20636c.e(awbVar, kVar, k.f20660a)) {
                while (kVar != null) {
                    Thread thread = kVar.thread;
                    if (thread != null) {
                        kVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    kVar = kVar.next;
                }
                awbVar.h();
                do {
                    dVar = ((awb) awbVar).listeners;
                } while (!f20636c.c(awbVar, dVar, d.f20644a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.next;
                    dVar3.next = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.next;
                    Runnable runnable = dVar2.f20645b;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        awbVar = fVar.f20652a;
                        if (((awb) awbVar).value == fVar) {
                            if (f20636c.d(awbVar, fVar, p(fVar.f20653b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        v(runnable, dVar2.f20646c);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    private static void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f20635b;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e2);
        }
    }

    private final void w(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 != k.f20660a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.next;
                    if (kVar2.thread != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.next = kVar4;
                        if (kVar3.thread == null) {
                            break;
                        }
                    } else if (!f20636c.e(this, kVar2, kVar4)) {
                        break;
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V x(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f20641d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f20643b);
        }
        if (obj == f20637d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.v3.internal.awb.f
            r3 = r3 | r4
            if (r3 == 0) goto L5c
            boolean r3 = com.google.ads.interactivemedia.v3.internal.awb.f20634a
            if (r3 == 0) goto L1f
            com.google.ads.interactivemedia.v3.internal.awb$b r3 = new com.google.ads.interactivemedia.v3.internal.awb$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            com.google.ads.interactivemedia.v3.internal.awb$b r3 = com.google.ads.interactivemedia.v3.internal.awb.b.f20638a
            goto L26
        L24:
            com.google.ads.interactivemedia.v3.internal.awb$b r3 = com.google.ads.interactivemedia.v3.internal.awb.b.f20639b
        L26:
            r5 = 0
            r4 = r7
        L28:
            com.google.ads.interactivemedia.v3.internal.awb$a r6 = com.google.ads.interactivemedia.v3.internal.awb.f20636c
            boolean r6 = r6.d(r4, r0, r3)
            if (r6 == 0) goto L55
            u(r4)
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.v3.internal.awb.f
            if (r4 == 0) goto L53
            com.google.ads.interactivemedia.v3.internal.awb$f r0 = (com.google.ads.interactivemedia.v3.internal.awb.f) r0
            com.google.ads.interactivemedia.v3.internal.awl<? extends V> r0 = r0.f20653b
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.v3.internal.awb.h
            if (r4 == 0) goto L50
            r4 = r0
            com.google.ads.interactivemedia.v3.internal.awb r4 = (com.google.ads.interactivemedia.v3.internal.awb) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = 0
        L49:
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.v3.internal.awb.f
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = 1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            r1 = 1
            goto L5c
        L55:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.v3.internal.awb.f
            if (r6 != 0) goto L28
            r1 = r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.awb.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String e() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aws
    public final Throwable f() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof c) {
            return ((c) obj).f20643b;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl
    public final void g(Runnable runnable, Executor executor) {
        d dVar;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (dVar = this.listeners) != d.f20644a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (f20636c.c(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.f20644a);
        }
        v(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return (V) x(obj2);
        }
        k kVar = this.waiters;
        if (kVar != k.f20660a) {
            k kVar2 = new k();
            do {
                kVar2.a(kVar);
                if (f20636c.e(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            w(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return (V) x(obj);
                }
                kVar = this.waiters;
            } while (kVar != k.f20660a);
        }
        return (V) x(this.value);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) x(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.waiters;
            if (kVar != k.f20660a) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f20636c.e(this, kVar, kVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                w(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) x(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(kVar2);
                    } else {
                        kVar = this.waiters;
                    }
                } while (kVar != k.f20660a);
            }
            return (V) x(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return (V) x(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j2);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strValueOf);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z) {
                    string4 = String.valueOf(string4).concat(",");
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
                sb3.append(strValueOf2);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    public void h() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.value != null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean j(V v) {
        if (v == null) {
            v = (V) f20637d;
        }
        if (!f20636c.d(this, null, v)) {
            return false;
        }
        u(this);
        return true;
    }

    public final boolean k() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).f20640c;
    }

    public final void o(Throwable th) {
        if (f20636c.d(this, null, new c(th))) {
            u(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            r(sb);
        } else {
            s(sb);
        }
        sb.append("]");
        return sb.toString();
    }
}

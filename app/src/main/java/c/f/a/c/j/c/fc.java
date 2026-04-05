package c.f.a.c.j.c;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class fc<T> implements pc<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12819a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f12820b = nd.A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f12821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f12822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bc f12825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f12828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f12829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f12830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f12831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f12832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gc f12833o;
    public final kb p;
    public final hd<?, ?> q;
    public final da<?> r;
    public final ub s;

    public fc(int[] iArr, Object[] objArr, int i2, int i3, bc bcVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, gc gcVar, kb kbVar, hd<?, ?> hdVar, da<?> daVar, ub ubVar) {
        this.f12821c = iArr;
        this.f12822d = objArr;
        this.f12823e = i2;
        this.f12824f = i3;
        this.f12827i = bcVar instanceof oa;
        this.f12828j = z;
        this.f12826h = daVar != null && daVar.d(bcVar);
        this.f12829k = false;
        this.f12830l = iArr2;
        this.f12831m = i4;
        this.f12832n = i5;
        this.f12833o = gcVar;
        this.p = kbVar;
        this.q = hdVar;
        this.r = daVar;
        this.f12825g = bcVar;
        this.s = ubVar;
    }

    public static List<?> B(Object obj, long j2) {
        return (List) nd.G(obj, j2);
    }

    public static <T> double C(T t, long j2) {
        return ((Double) nd.G(t, j2)).doubleValue();
    }

    public static <T> float D(T t, long j2) {
        return ((Float) nd.G(t, j2)).floatValue();
    }

    public static <T> int E(T t, long j2) {
        return ((Integer) nd.G(t, j2)).intValue();
    }

    public static <T> long F(T t, long j2) {
        return ((Long) nd.G(t, j2)).longValue();
    }

    public static <T> boolean G(T t, long j2) {
        return ((Boolean) nd.G(t, j2)).booleanValue();
    }

    public static <UT, UB> int h(hd<UT, UB> hdVar, T t) {
        return hdVar.f(hdVar.g(t));
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> c.f.a.c.j.c.fc<T> i(java.lang.Class<T> r33, c.f.a.c.j.c.zb r34, c.f.a.c.j.c.gc r35, c.f.a.c.j.c.kb r36, c.f.a.c.j.c.hd<?, ?> r37, c.f.a.c.j.c.da<?> r38, c.f.a.c.j.c.ub r39) {
        /*
            Method dump skipped, instruction units count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.i(java.lang.Class, c.f.a.c.j.c.zb, c.f.a.c.j.c.gc, c.f.a.c.j.c.kb, c.f.a.c.j.c.hd, c.f.a.c.j.c.da, c.f.a.c.j.c.ub):c.f.a.c.j.c.fc");
    }

    public static Field j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    public static void k(int i2, Object obj, ce ceVar) {
        if (obj instanceof String) {
            ceVar.o(i2, (String) obj);
        } else {
            ceVar.D(i2, (m9) obj);
        }
    }

    public static <UT, UB> void l(hd<UT, UB> hdVar, T t, ce ceVar) {
        hdVar.a(hdVar.g(t), ceVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean r(Object obj, int i2, pc pcVar) {
        return pcVar.b(nd.G(obj, i2 & 1048575));
    }

    public final boolean A(T t, T t2, int i2) {
        return o(t, i2) == o(t2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // c.f.a.c.j.c.pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r7, T r8) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    @Override // c.f.a.c.j.c.pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(T r19) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.b(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // c.f.a.c.j.c.pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(T r14, c.f.a.c.j.c.ce r15) {
        /*
            Method dump skipped, instruction units count: 2740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.c(java.lang.Object, c.f.a.c.j.c.ce):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    @Override // c.f.a.c.j.c.pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(T r10, T r11) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.d(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // c.f.a.c.j.c.pc
    public final void e(T t) {
        int i2;
        int i3 = this.f12831m;
        while (true) {
            i2 = this.f12832n;
            if (i3 >= i2) {
                break;
            }
            long jY = y(this.f12830l[i3]) & 1048575;
            Object objG = nd.G(t, jY);
            if (objG != null) {
                nd.g(t, jY, this.s.e(objG));
            }
            i3++;
        }
        int length = this.f12830l.length;
        while (i2 < length) {
            this.p.a(t, this.f12830l[i2]);
            i2++;
        }
        this.q.e(t);
        if (this.f12826h) {
            this.r.f(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b8, code lost:
    
        if (p(r19, r15, r3) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03d8, code lost:
    
        if (p(r19, r15, r3) != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03e0, code lost:
    
        if (p(r19, r15, r3) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0400, code lost:
    
        if (p(r19, r15, r3) != false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0408, code lost:
    
        if (p(r19, r15, r3) != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04b9, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04c7, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04d5, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04e3, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04f1, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04ff, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x050d, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x051a, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0527, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0534, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0541, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x054e, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x055b, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0568, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x056a, code lost:
    
        r8 = (c.f.a.c.j.c.z9.u(r15) + c.f.a.c.j.c.z9.x(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0632, code lost:
    
        if ((r12 & r11) != 0) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0634, code lost:
    
        r4 = c.f.a.c.j.c.z9.R(r15, (c.f.a.c.j.c.bc) r2.getObject(r19, r8), w(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x065f, code lost:
    
        if ((r12 & r11) != 0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0661, code lost:
    
        r4 = c.f.a.c.j.c.z9.h0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x066a, code lost:
    
        if ((r12 & r11) != 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x066c, code lost:
    
        r8 = c.f.a.c.j.c.z9.w0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x068f, code lost:
    
        if ((r12 & r11) != 0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0691, code lost:
    
        r4 = r2.getObject(r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x069e, code lost:
    
        if ((r12 & r11) != 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06a0, code lost:
    
        r4 = c.f.a.c.j.c.rc.j(r15, r2.getObject(r19, r8), w(r3));
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ca A[PHI: r5
  0x02ca: PHI (r5v108 java.lang.Object) = (r5v27 java.lang.Object), (r5v106 java.lang.Object), (r5v110 java.lang.Object) binds: [B:163:0x02f1, B:44:0x00a8, B:155:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f4 A[PHI: r5
  0x02f4: PHI (r5v104 java.lang.Object) = (r5v27 java.lang.Object), (r5v106 java.lang.Object) binds: [B:163:0x02f1, B:44:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0628 A[PHI: r5
  0x0628: PHI (r5v4 int) = 
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v16 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v17 int)
  (r5v1 int)
 binds: [B:206:0x03af, B:368:0x06c5, B:362:0x06b0, B:359:0x069e, B:355:0x068f, B:351:0x0682, B:347:0x0675, B:343:0x066a, B:340:0x065f, B:336:0x0652, B:332:0x0645, B:329:0x0632, B:306:0x0568, B:303:0x055b, B:300:0x054e, B:297:0x0541, B:294:0x0534, B:291:0x0527, B:288:0x051a, B:285:0x050d, B:282:0x04ff, B:279:0x04f1, B:276:0x04e3, B:273:0x04d5, B:270:0x04c7, B:267:0x04b9, B:262:0x0485, B:259:0x0478, B:256:0x0468, B:253:0x0458, B:250:0x0448, B:247:0x043a, B:244:0x042d, B:241:0x0420, B:236:0x0410, B:233:0x0408, B:230:0x0400, B:227:0x03f4, B:224:0x03e8, B:345:0x0671, B:221:0x03e0, B:218:0x03d8, B:215:0x03cc, B:212:0x03c0, B:324:0x0627, B:209:0x03b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0695 A[PHI: r4
  0x0695: PHI (r4v144 java.lang.Object) = (r4v13 java.lang.Object), (r4v140 java.lang.Object), (r4v147 java.lang.Object) binds: [B:364:0x06b8, B:238:0x0418, B:356:0x0691] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06bb A[PHI: r4
  0x06bb: PHI (r4v136 java.lang.Object) = (r4v13 java.lang.Object), (r4v140 java.lang.Object) binds: [B:364:0x06b8, B:238:0x0418] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c.f.a.c.j.c.pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(T r19) {
        /*
            Method dump skipped, instruction units count: 2238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.f(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:67:0x00e0, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.f.a.c.j.c.pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(T r9) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.g(java.lang.Object):int");
    }

    public final <K, V> void m(ce ceVar, int i2, Object obj, int i3) {
        if (obj != null) {
            ceVar.n(i2, this.s.d(x(i3)), this.s.b(obj));
        }
    }

    public final void n(T t, T t2, int i2) {
        long jY = y(i2) & 1048575;
        if (o(t2, i2)) {
            Object objG = nd.G(t, jY);
            Object objG2 = nd.G(t2, jY);
            if (objG != null && objG2 != null) {
                nd.g(t, jY, sa.e(objG, objG2));
                s(t, i2);
            } else if (objG2 != null) {
                nd.g(t, jY, objG2);
                s(t, i2);
            }
        }
    }

    public final boolean o(T t, int i2) {
        int iZ = z(i2);
        long j2 = iZ & 1048575;
        if (j2 != 1048575) {
            return (nd.u(t, j2) & (1 << (iZ >>> 20))) != 0;
        }
        int iY = y(i2);
        long j3 = iY & 1048575;
        switch ((iY & 267386880) >>> 20) {
            case 0:
                return nd.F(t, j3) != 0.0d;
            case 1:
                return nd.E(t, j3) != 0.0f;
            case 2:
                return nd.w(t, j3) != 0;
            case 3:
                return nd.w(t, j3) != 0;
            case 4:
                return nd.u(t, j3) != 0;
            case 5:
                return nd.w(t, j3) != 0;
            case 6:
                return nd.u(t, j3) != 0;
            case 7:
                return nd.x(t, j3);
            case 8:
                Object objG = nd.G(t, j3);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof m9) {
                    return !m9.f12941b.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return nd.G(t, j3) != null;
            case 10:
                return !m9.f12941b.equals(nd.G(t, j3));
            case 11:
                return nd.u(t, j3) != 0;
            case 12:
                return nd.u(t, j3) != 0;
            case 13:
                return nd.u(t, j3) != 0;
            case 14:
                return nd.w(t, j3) != 0;
            case 15:
                return nd.u(t, j3) != 0;
            case 16:
                return nd.w(t, j3) != 0;
            case 17:
                return nd.G(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean p(T t, int i2, int i3) {
        return nd.u(t, (long) (z(i3) & 1048575)) == i2;
    }

    public final boolean q(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? o(t, i2) : (i4 & i5) != 0;
    }

    public final void s(T t, int i2) {
        int iZ = z(i2);
        long j2 = 1048575 & iZ;
        if (j2 == 1048575) {
            return;
        }
        nd.e(t, j2, (1 << (iZ >>> 20)) | nd.u(t, j2));
    }

    public final void t(T t, int i2, int i3) {
        nd.e(t, z(i3) & 1048575, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(T r18, c.f.a.c.j.c.ce r19) {
        /*
            Method dump skipped, instruction units count: 1226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.fc.u(java.lang.Object, c.f.a.c.j.c.ce):void");
    }

    public final void v(T t, T t2, int i2) {
        int iY = y(i2);
        int i3 = this.f12821c[i2];
        long j2 = iY & 1048575;
        if (p(t2, i3, i2)) {
            Object objG = nd.G(t, j2);
            Object objG2 = nd.G(t2, j2);
            if (objG != null && objG2 != null) {
                nd.g(t, j2, sa.e(objG, objG2));
                t(t, i3, i2);
            } else if (objG2 != null) {
                nd.g(t, j2, objG2);
                t(t, i3, i2);
            }
        }
    }

    public final pc w(int i2) {
        int i3 = (i2 / 3) << 1;
        pc pcVar = (pc) this.f12822d[i3];
        if (pcVar != null) {
            return pcVar;
        }
        pc<T> pcVarA = oc.b().a((Class) this.f12822d[i3 + 1]);
        this.f12822d[i3] = pcVarA;
        return pcVarA;
    }

    public final Object x(int i2) {
        return this.f12822d[(i2 / 3) << 1];
    }

    public final int y(int i2) {
        return this.f12821c[i2 + 1];
    }

    public final int z(int i2) {
        return this.f12821c[i2 + 2];
    }
}

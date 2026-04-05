package c.f.a.c.k.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import c.f.a.c.j.h.sb;
import c.f.a.c.j.h.vb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class x9 implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile x9 f14446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4 f14447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f14448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f14449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h4 f14450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n9 f14451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ua f14452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z9 f14453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l7 f14454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v8 f14455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c5 f14456k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14459n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<Runnable> f14460o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public FileLock u;
    public FileChannel v;
    public List<Long> w;
    public List<Long> x;
    public long y;
    public final Map<String, g> z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14457l = false;
    public final da A = new v9(this);

    public x9(y9 y9Var, c5 c5Var) {
        c.f.a.c.f.q.o.i(y9Var);
        c5 c5VarH = c5.h(y9Var.f14488a, null, null);
        this.f14456k = c5VarH;
        this.y = -1L;
        z9 z9Var = new z9(this);
        z9Var.j();
        this.f14453h = z9Var;
        e4 e4Var = new e4(this);
        e4Var.j();
        this.f14448c = e4Var;
        u4 u4Var = new u4(this);
        u4Var.j();
        this.f14447b = u4Var;
        this.z = new HashMap();
        c5VarH.d().r(new q9(this, y9Var));
    }

    public static x9 F(Context context) {
        c.f.a.c.f.q.o.i(context);
        c.f.a.c.f.q.o.i(context.getApplicationContext());
        if (f14446a == null) {
            synchronized (x9.class) {
                if (f14446a == null) {
                    f14446a = new x9(new y9(context), null);
                }
            }
        }
        return f14446a;
    }

    public static /* synthetic */ void G(x9 x9Var, y9 y9Var) {
        x9Var.f14456k.d().g();
        j jVar = new j(x9Var);
        jVar.j();
        x9Var.f14449d = jVar;
        x9Var.f14456k.z().j(x9Var.f14447b);
        v8 v8Var = new v8(x9Var);
        v8Var.j();
        x9Var.f14455j = v8Var;
        ua uaVar = new ua(x9Var);
        uaVar.j();
        x9Var.f14452g = uaVar;
        l7 l7Var = new l7(x9Var);
        l7Var.j();
        x9Var.f14454i = l7Var;
        n9 n9Var = new n9(x9Var);
        n9Var.j();
        x9Var.f14451f = n9Var;
        x9Var.f14450e = new h4(x9Var);
        if (x9Var.p != x9Var.q) {
            x9Var.f14456k.c().o().c("Not all upload components initialized", Integer.valueOf(x9Var.p), Integer.valueOf(x9Var.q));
        }
        x9Var.f14457l = true;
    }

    public static final void I(c.f.a.c.j.h.p1 p1Var, int i2, String str) {
        List<c.f.a.c.j.h.u1> listU = p1Var.u();
        for (int i3 = 0; i3 < listU.size(); i3++) {
            if ("_err".equals(listU.get(i3).x())) {
                return;
            }
        }
        c.f.a.c.j.h.t1 t1VarI = c.f.a.c.j.h.u1.I();
        t1VarI.u("_err");
        t1VarI.z(Long.valueOf(i2).longValue());
        c.f.a.c.j.h.u1 u1VarM = t1VarI.m();
        c.f.a.c.j.h.t1 t1VarI2 = c.f.a.c.j.h.u1.I();
        t1VarI2.u("_ev");
        t1VarI2.w(str);
        c.f.a.c.j.h.u1 u1VarM2 = t1VarI2.m();
        p1Var.B(u1VarM);
        p1Var.B(u1VarM2);
    }

    public static final void J(c.f.a.c.j.h.p1 p1Var, String str) {
        List<c.f.a.c.j.h.u1> listU = p1Var.u();
        for (int i2 = 0; i2 < listU.size(); i2++) {
            if (str.equals(listU.get(i2).x())) {
                p1Var.F(i2);
                return;
            }
        }
    }

    public static final void U(p9 p9Var) {
        if (p9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (p9Var.h()) {
            return;
        }
        String strValueOf = String.valueOf(p9Var.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final void A(b bVar) {
        la laVarS = S(bVar.f13737b);
        if (laVarS != null) {
            B(bVar, laVarS);
        }
    }

    public final void B(b bVar, la laVar) {
        c.f.a.c.f.q.o.i(bVar);
        c.f.a.c.f.q.o.e(bVar.f13737b);
        c.f.a.c.f.q.o.i(bVar.f13739d);
        c.f.a.c.f.q.o.e(bVar.f13739d.f13731c);
        this.f14456k.d().g();
        i0();
        if (T(laVar)) {
            if (!laVar.f14077i) {
                C(laVar);
                return;
            }
            Z().K();
            try {
                C(laVar);
                b bVarW = Z().W(bVar.f13737b, bVar.f13739d.f13731c);
                if (bVarW != null) {
                    this.f14456k.c().v().c("Removing conditional user property", bVar.f13737b, this.f14456k.H().r(bVar.f13739d.f13731c));
                    Z().X(bVar.f13737b, bVar.f13739d.f13731c);
                    if (bVarW.f13741f) {
                        Z().Q(bVar.f13737b, bVar.f13739d.f13731c);
                    }
                    t tVar = bVar.f13747l;
                    if (tVar != null) {
                        r rVar = tVar.f14311c;
                        Bundle bundleK = rVar != null ? rVar.K() : null;
                        ea eaVarG = this.f14456k.G();
                        String str = bVar.f13737b;
                        t tVar2 = bVar.f13747l;
                        String str2 = tVar2.f14310b;
                        String str3 = bVarW.f13738c;
                        long j2 = tVar2.f14313e;
                        c.f.a.c.j.h.l9.a();
                        h(eaVarG.J(str, str2, bundleK, str3, j2, true, false, this.f14456k.z().w(null, m3.L0)), laVar);
                    }
                } else {
                    this.f14456k.c().r().c("Conditional user property doesn't exist", y3.x(bVar.f13737b), this.f14456k.H().r(bVar.f13739d.f13731c));
                }
                Z().L();
            } finally {
                Z().M();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0265, code lost:
    
        if (r1.h() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010c, code lost:
    
        if (r2.h() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0239, code lost:
    
        if (r1.h() != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.c.k.b.g5 C(c.f.a.c.k.b.la r14) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.C(c.f.a.c.k.b.la):c.f.a.c.k.b.g5");
    }

    public final String D(la laVar) {
        try {
            return (String) this.f14456k.d().p(new t9(this, laVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.f14456k.c().o().c("Failed to get app instance id. appId", y3.x(laVar.f14070b), e2);
            return null;
        }
    }

    public final void E(boolean z) {
        P();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03b2 A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ca A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e5 A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ad A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0508 A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x063e A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06e6 A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0981 A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x09b5 A[Catch: all -> 0x0e76, EDGE_INSN: B:517:0x09b5->B:321:0x09b5 BREAK  A[LOOP:11: B:312:0x0989->B:320:0x09b2], TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x09c9 A[Catch: all -> 0x0e76, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x09eb A[Catch: all -> 0x0e76, TRY_LEAVE, TryCatch #3 {all -> 0x0e76, blocks: (B:3:0x000f, B:5:0x0026, B:8:0x002e, B:9:0x0058, B:12:0x006a, B:15:0x0090, B:17:0x00c7, B:20:0x00d8, B:22:0x00e2, B:217:0x06ab, B:24:0x010d, B:26:0x0126, B:28:0x0134, B:31:0x0158, B:33:0x015e, B:35:0x016e, B:37:0x017c, B:39:0x018c, B:40:0x019b, B:41:0x019e, B:44:0x01b4, B:115:0x03e5, B:116:0x03f1, B:119:0x03fb, B:125:0x041e, B:122:0x040d, B:147:0x04a1, B:149:0x04ad, B:152:0x04be, B:154:0x04cf, B:156:0x04db, B:205:0x063e, B:207:0x0648, B:209:0x064e, B:210:0x0664, B:211:0x0668, B:213:0x0679, B:214:0x0690, B:216:0x0699, B:162:0x0508, B:164:0x0517, B:167:0x052a, B:169:0x053c, B:171:0x0548, B:178:0x056d, B:180:0x0585, B:182:0x0591, B:185:0x05a2, B:187:0x05b5, B:189:0x05f8, B:191:0x05ff, B:193:0x0605, B:195:0x060d, B:197:0x0614, B:199:0x061a, B:201:0x0624, B:202:0x0634, B:129:0x0426, B:131:0x0432, B:133:0x043e, B:145:0x0485, B:137:0x045d, B:140:0x046f, B:142:0x0475, B:144:0x047f, B:70:0x0212, B:73:0x021c, B:75:0x022a, B:80:0x0275, B:76:0x0248, B:78:0x0259, B:84:0x0286, B:87:0x02b7, B:88:0x02e3, B:90:0x0319, B:92:0x031f, B:95:0x032b, B:97:0x0360, B:98:0x037d, B:100:0x0383, B:102:0x0391, B:106:0x03a4, B:103:0x0399, B:109:0x03ab, B:112:0x03b2, B:113:0x03ca, B:222:0x06c7, B:224:0x06d5, B:226:0x06de, B:237:0x0710, B:227:0x06e6, B:229:0x06ef, B:231:0x06f5, B:234:0x0701, B:236:0x070b, B:239:0x0715, B:240:0x0721, B:243:0x0729, B:245:0x073b, B:246:0x0746, B:248:0x074e, B:252:0x0775, B:254:0x0798, B:256:0x07a8, B:258:0x07ae, B:260:0x07ba, B:261:0x07eb, B:263:0x07f1, B:265:0x07ff, B:266:0x0803, B:267:0x0806, B:268:0x0809, B:269:0x0817, B:271:0x081d, B:273:0x082d, B:274:0x0834, B:276:0x0840, B:277:0x0847, B:278:0x084a, B:280:0x0889, B:281:0x089e, B:283:0x08a4, B:286:0x08bc, B:288:0x08d5, B:289:0x08e6, B:291:0x08ea, B:293:0x08f6, B:294:0x08fe, B:296:0x0902, B:298:0x0908, B:299:0x0916, B:300:0x091f, B:301:0x092b, B:303:0x0941, B:309:0x095d, B:311:0x0981, B:312:0x0989, B:314:0x098f, B:316:0x09a1, B:323:0x09c9, B:324:0x09eb, B:321:0x09b5, B:307:0x0948, B:249:0x0753, B:251:0x0759), top: B:469:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0ce5 A[Catch: all -> 0x0e74, TryCatch #2 {all -> 0x0e74, blocks: (B:368:0x0b71, B:367:0x0b6e, B:359:0x0b0d, B:361:0x0b35, B:363:0x0b42, B:364:0x0b54, B:366:0x0b60, B:356:0x0af1, B:371:0x0b7f, B:373:0x0b8c, B:374:0x0b92, B:375:0x0b9a, B:377:0x0ba0, B:380:0x0bb8, B:382:0x0bc8, B:402:0x0c3d, B:404:0x0c43, B:406:0x0c5a, B:409:0x0c61, B:414:0x0c92, B:416:0x0cd3, B:419:0x0d08, B:420:0x0d0c, B:421:0x0d16, B:423:0x0d59, B:424:0x0d66, B:426:0x0d75, B:430:0x0d8f, B:431:0x0da3, B:433:0x0da8, B:418:0x0ce5, B:410:0x0c69, B:412:0x0c75, B:413:0x0c79, B:434:0x0dbe, B:435:0x0dd5, B:438:0x0ddd, B:439:0x0de2, B:440:0x0df2, B:442:0x0e0c, B:443:0x0e27, B:445:0x0e30, B:450:0x0e53, B:449:0x0e40, B:383:0x0be2, B:385:0x0be8, B:387:0x0bf2, B:389:0x0bf9, B:395:0x0c09, B:397:0x0c10, B:399:0x0c2f, B:401:0x0c36, B:400:0x0c33, B:396:0x0c0d, B:388:0x0bf6, B:454:0x0e64), top: B:468:0x0024, inners: #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K(java.lang.String r46, long r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.K(java.lang.String, long):boolean");
    }

    public final void L(c.f.a.c.j.h.x1 x1Var, long j2, boolean z) {
        String str = true != z ? "_lte" : "_se";
        ca caVarS = Z().S(x1Var.C(), str);
        ca caVar = (caVarS == null || caVarS.f13811e == null) ? new ca(x1Var.C(), "auto", str, this.f14456k.a().a(), Long.valueOf(j2)) : new ca(x1Var.C(), "auto", str, this.f14456k.a().a(), Long.valueOf(((Long) caVarS.f13811e).longValue() + j2));
        c.f.a.c.j.h.i2 i2VarF = c.f.a.c.j.h.j2.F();
        i2VarF.w(str);
        i2VarF.u(this.f14456k.a().a());
        i2VarF.A(((Long) caVar.f13811e).longValue());
        c.f.a.c.j.h.j2 j2VarM = i2VarF.m();
        int iJ = z9.J(x1Var, str);
        if (iJ >= 0) {
            x1Var.E0(iJ, j2VarM);
        } else {
            x1Var.F0(j2VarM);
        }
        if (j2 > 0) {
            Z().R(caVar);
            this.f14456k.c().w().c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", caVar.f13811e);
        }
    }

    public final boolean M(c.f.a.c.j.h.p1 p1Var, c.f.a.c.j.h.p1 p1Var2) {
        c.f.a.c.f.q.o.a("_e".equals(p1Var.G()));
        e0();
        c.f.a.c.j.h.u1 u1VarN = z9.N(p1Var.m(), "_sc");
        String strZ = u1VarN == null ? null : u1VarN.z();
        e0();
        c.f.a.c.j.h.u1 u1VarN2 = z9.N(p1Var2.m(), "_pc");
        String strZ2 = u1VarN2 != null ? u1VarN2.z() : null;
        if (strZ2 == null || !strZ2.equals(strZ)) {
            return false;
        }
        N(p1Var, p1Var2);
        return true;
    }

    public final void N(c.f.a.c.j.h.p1 p1Var, c.f.a.c.j.h.p1 p1Var2) {
        c.f.a.c.f.q.o.a("_e".equals(p1Var.G()));
        e0();
        c.f.a.c.j.h.u1 u1VarN = z9.N(p1Var.m(), "_et");
        if (!u1VarN.A() || u1VarN.B() <= 0) {
            return;
        }
        long jB = u1VarN.B();
        e0();
        c.f.a.c.j.h.u1 u1VarN2 = z9.N(p1Var2.m(), "_et");
        if (u1VarN2 != null && u1VarN2.B() > 0) {
            jB += u1VarN2.B();
        }
        e0();
        z9.L(p1Var2, "_et", Long.valueOf(jB));
        e0();
        z9.L(p1Var, "_fr", 1L);
    }

    public final boolean O() {
        this.f14456k.d().g();
        i0();
        return Z().q() || !TextUtils.isEmpty(Z().e0());
    }

    public final void P() {
        l3<Long> l3Var;
        long jMax;
        this.f14456k.d().g();
        i0();
        if (this.f14459n > 0) {
            long jAbs = 3600000 - Math.abs(this.f14456k.a().b() - this.f14459n);
            if (jAbs > 0) {
                this.f14456k.c().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                a0().b();
                b0().m();
                return;
            }
            this.f14459n = 0L;
        }
        if (!this.f14456k.q() || !O()) {
            this.f14456k.c().w().a("Nothing to upload or uploading impossible");
            a0().b();
            b0().m();
            return;
        }
        long jA = this.f14456k.a().a();
        this.f14456k.z();
        long jMax2 = Math.max(0L, m3.B.b(null).longValue());
        boolean z = true;
        if (!Z().r() && !Z().f0()) {
            z = false;
        }
        c5 c5Var = this.f14456k;
        if (z) {
            String strD = c5Var.z().D();
            if (TextUtils.isEmpty(strD) || ".none.".equals(strD)) {
                this.f14456k.z();
                l3Var = m3.v;
            } else {
                this.f14456k.z();
                l3Var = m3.w;
            }
        } else {
            c5Var.z();
            l3Var = m3.u;
        }
        long jMax3 = Math.max(0L, l3Var.b(null).longValue());
        long jA2 = this.f14456k.A().f14176f.a();
        long jA3 = this.f14456k.A().f14177g.a();
        boolean z2 = z;
        long jMax4 = Math.max(Z().m(), Z().p());
        if (jMax4 == 0) {
            jMax = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            long jMax5 = Math.max(jA - jAbs3, jAbs4);
            jMax = jAbs2 + jMax2;
            if (z2 && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            if (!e0().F(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i2 = 0;
                while (true) {
                    this.f14456k.z();
                    if (i2 >= Math.min(20, Math.max(0, m3.D.b(null).intValue()))) {
                        break;
                    }
                    this.f14456k.z();
                    jMax += Math.max(0L, m3.C.b(null).longValue()) * (1 << i2);
                    if (jMax > jAbs4) {
                        break;
                    } else {
                        i2++;
                    }
                }
                jMax = 0;
            }
        }
        if (jMax == 0) {
            this.f14456k.c().w().a("Next upload time is 0");
            a0().b();
            b0().m();
            return;
        }
        if (!Y().l()) {
            this.f14456k.c().w().a("No network");
            a0().a();
            b0().m();
            return;
        }
        long jA4 = this.f14456k.A().f14178h.a();
        this.f14456k.z();
        long jMax6 = Math.max(0L, m3.s.b(null).longValue());
        if (!e0().F(jA4, jMax6)) {
            jMax = Math.max(jMax, jA4 + jMax6);
        }
        a0().b();
        long jA5 = jMax - this.f14456k.a().a();
        if (jA5 <= 0) {
            this.f14456k.z();
            jA5 = Math.max(0L, m3.x.b(null).longValue());
            this.f14456k.A().f14176f.b(this.f14456k.a().a());
        }
        this.f14456k.c().w().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        b0().l(jA5);
    }

    public final void Q() {
        this.f14456k.d().g();
        if (this.r || this.s || this.t) {
            this.f14456k.c().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.t));
            return;
        }
        this.f14456k.c().w().a("Stopping uploading service(s)");
        List<Runnable> list = this.f14460o;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f14460o.clear();
    }

    public final Boolean R(g5 g5Var) {
        try {
            if (g5Var.g0() != -2147483648L) {
                if (g5Var.g0() == c.f.a.c.f.u.c.a(this.f14456k.b()).e(g5Var.N(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.f.a.c.f.u.c.a(this.f14456k.b()).e(g5Var.N(), 0).versionName;
                if (g5Var.e0() != null && g5Var.e0().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final la S(String str) {
        String str2;
        Object objX;
        w3 w3VarV;
        String str3 = str;
        g5 g5VarA0 = Z().a0(str3);
        if (g5VarA0 == null || TextUtils.isEmpty(g5VarA0.e0())) {
            str2 = "No app data available; dropping";
            w3VarV = this.f14456k.c().v();
            objX = str3;
        } else {
            Boolean boolR = R(g5VarA0);
            if (boolR == null || boolR.booleanValue()) {
                String strQ = g5VarA0.Q();
                String strE0 = g5VarA0.e0();
                long jG0 = g5VarA0.g0();
                String strI0 = g5VarA0.i0();
                long jK0 = g5VarA0.k0();
                long jB = g5VarA0.b();
                boolean zF = g5VarA0.f();
                String strY = g5VarA0.Y();
                long jE = g5VarA0.E();
                boolean zG = g5VarA0.G();
                String strS = g5VarA0.S();
                Boolean boolI = g5VarA0.I();
                long jD = g5VarA0.d();
                List<String> listK = g5VarA0.K();
                sb.a();
                String strU = this.f14456k.z().w(str3, m3.j0) ? g5VarA0.U() : null;
                c.f.a.c.j.h.ha.a();
                return new la(str, strQ, strE0, jG0, strI0, jK0, jB, (String) null, zF, false, strY, jE, 0L, 0, zG, false, strS, boolI, jD, listK, strU, this.f14456k.z().w(null, m3.I0) ? m0(str).d() : BuildConfig.FLAVOR);
            }
            str2 = "App version does not match; dropping. appId";
            w3VarV = this.f14456k.c().o();
            objX = y3.x(str);
        }
        w3VarV.b(str2, objX);
        return null;
    }

    public final boolean T(la laVar) {
        sb.a();
        return this.f14456k.z().w(laVar.f14070b, m3.j0) ? (TextUtils.isEmpty(laVar.f14071c) && TextUtils.isEmpty(laVar.v) && TextUtils.isEmpty(laVar.r)) ? false : true : (TextUtils.isEmpty(laVar.f14071c) && TextUtils.isEmpty(laVar.r)) ? false : true;
    }

    public final void V() {
        this.f14456k.d().g();
        Z().g0();
        if (this.f14456k.A().f14176f.a() == 0) {
            this.f14456k.A().f14176f.b(this.f14456k.a().a());
        }
        P();
    }

    public final f W() {
        return this.f14456k.z();
    }

    public final u4 X() {
        U(this.f14447b);
        return this.f14447b;
    }

    public final e4 Y() {
        U(this.f14448c);
        return this.f14448c;
    }

    public final j Z() {
        U(this.f14449d);
        return this.f14449d;
    }

    @Override // c.f.a.c.k.b.y5
    public final c.f.a.c.f.t.d a() {
        return this.f14456k.a();
    }

    public final h4 a0() {
        h4 h4Var = this.f14450e;
        if (h4Var != null) {
            return h4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    @Override // c.f.a.c.k.b.y5
    public final Context b() {
        return this.f14456k.b();
    }

    public final n9 b0() {
        U(this.f14451f);
        return this.f14451f;
    }

    @Override // c.f.a.c.k.b.y5
    public final y3 c() {
        return this.f14456k.c();
    }

    public final ua c0() {
        U(this.f14452g);
        return this.f14452g;
    }

    @Override // c.f.a.c.k.b.y5
    public final z4 d() {
        return this.f14456k.d();
    }

    public final l7 d0() {
        U(this.f14454i);
        return this.f14454i;
    }

    @Override // c.f.a.c.k.b.y5
    public final va e() {
        throw null;
    }

    public final z9 e0() {
        U(this.f14453h);
        return this.f14453h;
    }

    public final void f(t tVar, la laVar) {
        vb.a();
        if (this.f14456k.z().w(null, m3.B0)) {
            z3 z3VarA = z3.a(tVar);
            this.f14456k.G().v(z3VarA.f14496d, Z().u(laVar.f14070b));
            this.f14456k.G().u(z3VarA, this.f14456k.z().m(laVar.f14070b));
            tVar = z3VarA.b();
        }
        if (this.f14456k.z().w(null, m3.e0) && "_cmp".equals(tVar.f14310b) && "referrer API v2".equals(tVar.f14311c.I("_cis"))) {
            String strI = tVar.f14311c.I("gclid");
            if (!TextUtils.isEmpty(strI)) {
                s(new aa("_lgclid", tVar.f14313e, strI, "auto"), laVar);
            }
        }
        g(tVar, laVar);
    }

    public final v8 f0() {
        return this.f14455j;
    }

    public final void g(t tVar, la laVar) {
        List<b> listZ;
        List<b> listZ2;
        List<b> listZ3;
        w3 w3VarO;
        String str;
        Object objX;
        String strR;
        Object obj;
        t tVar2 = tVar;
        c.f.a.c.f.q.o.i(laVar);
        c.f.a.c.f.q.o.e(laVar.f14070b);
        this.f14456k.d().g();
        i0();
        String str2 = laVar.f14070b;
        long j2 = tVar2.f14313e;
        e0();
        if (z9.M(tVar, laVar)) {
            if (!laVar.f14077i) {
                C(laVar);
                return;
            }
            List<String> list = laVar.u;
            if (list != null) {
                if (!list.contains(tVar2.f14310b)) {
                    this.f14456k.c().v().d("Dropping non-safelisted event. appId, event name, origin", str2, tVar2.f14310b, tVar2.f14312d);
                    return;
                } else {
                    Bundle bundleK = tVar2.f14311c.K();
                    bundleK.putLong("ga_safelisted", 1L);
                    tVar2 = new t(tVar2.f14310b, new r(bundleK), tVar2.f14312d, tVar2.f14313e);
                }
            }
            Z().K();
            try {
                j jVarZ = Z();
                c.f.a.c.f.q.o.e(str2);
                jVarZ.g();
                jVarZ.i();
                if (j2 < 0) {
                    jVarZ.f14413a.c().r().c("Invalid time querying timed out conditional properties", y3.x(str2), Long.valueOf(j2));
                    listZ = Collections.emptyList();
                } else {
                    listZ = jVarZ.Z("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (b bVar : listZ) {
                    if (bVar != null) {
                        this.f14456k.c().w().d("User property timed out", bVar.f13737b, this.f14456k.H().r(bVar.f13739d.f13731c), bVar.f13739d.I());
                        t tVar3 = bVar.f13743h;
                        if (tVar3 != null) {
                            h(new t(tVar3, j2), laVar);
                        }
                        Z().X(str2, bVar.f13739d.f13731c);
                    }
                }
                j jVarZ2 = Z();
                c.f.a.c.f.q.o.e(str2);
                jVarZ2.g();
                jVarZ2.i();
                if (j2 < 0) {
                    jVarZ2.f14413a.c().r().c("Invalid time querying expired conditional properties", y3.x(str2), Long.valueOf(j2));
                    listZ2 = Collections.emptyList();
                } else {
                    listZ2 = jVarZ2.Z("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(listZ2.size());
                for (b bVar2 : listZ2) {
                    if (bVar2 != null) {
                        this.f14456k.c().w().d("User property expired", bVar2.f13737b, this.f14456k.H().r(bVar2.f13739d.f13731c), bVar2.f13739d.I());
                        Z().Q(str2, bVar2.f13739d.f13731c);
                        t tVar4 = bVar2.f13747l;
                        if (tVar4 != null) {
                            arrayList.add(tVar4);
                        }
                        Z().X(str2, bVar2.f13739d.f13731c);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h(new t((t) it.next(), j2), laVar);
                }
                j jVarZ3 = Z();
                String str3 = tVar2.f14310b;
                c.f.a.c.f.q.o.e(str2);
                c.f.a.c.f.q.o.e(str3);
                jVarZ3.g();
                jVarZ3.i();
                if (j2 < 0) {
                    jVarZ3.f14413a.c().r().d("Invalid time querying triggered conditional properties", y3.x(str2), jVarZ3.f14413a.H().p(str3), Long.valueOf(j2));
                    listZ3 = Collections.emptyList();
                } else {
                    listZ3 = jVarZ3.Z("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(listZ3.size());
                for (b bVar3 : listZ3) {
                    if (bVar3 != null) {
                        aa aaVar = bVar3.f13739d;
                        ca caVar = new ca(bVar3.f13737b, bVar3.f13738c, aaVar.f13731c, j2, aaVar.I());
                        if (Z().R(caVar)) {
                            w3VarO = this.f14456k.c().w();
                            str = "User property triggered";
                            objX = bVar3.f13737b;
                            strR = this.f14456k.H().r(caVar.f13809c);
                            obj = caVar.f13811e;
                        } else {
                            w3VarO = this.f14456k.c().o();
                            str = "Too many active user properties, ignoring";
                            objX = y3.x(bVar3.f13737b);
                            strR = this.f14456k.H().r(caVar.f13809c);
                            obj = caVar.f13811e;
                        }
                        w3VarO.d(str, objX, strR, obj);
                        t tVar5 = bVar3.f13745j;
                        if (tVar5 != null) {
                            arrayList2.add(tVar5);
                        }
                        bVar3.f13739d = new aa(caVar);
                        bVar3.f13741f = true;
                        Z().V(bVar3);
                    }
                }
                h(tVar2, laVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    h(new t((t) it2.next(), j2), laVar);
                }
                Z().L();
            } finally {
                Z().M();
            }
        }
    }

    public final t3 g0() {
        return this.f14456k.H();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x034a A[Catch: all -> 0x0b8f, TryCatch #9 {all -> 0x0b8f, blocks: (B:47:0x0193, B:50:0x01a2, B:52:0x01ac, B:57:0x01b8, B:118:0x0387, B:127:0x03c1, B:129:0x0406, B:131:0x040b, B:132:0x0424, B:136:0x0435, B:138:0x044e, B:140:0x0455, B:141:0x046e, B:146:0x0498, B:150:0x04bb, B:151:0x04d4, B:154:0x04e3, B:157:0x0504, B:158:0x051c, B:160:0x0526, B:162:0x0532, B:164:0x0538, B:165:0x0543, B:166:0x0550, B:168:0x0565, B:178:0x059a, B:179:0x05b1, B:181:0x05d8, B:184:0x05f1, B:187:0x0639, B:189:0x0665, B:191:0x06a3, B:192:0x06a8, B:194:0x06b0, B:195:0x06b5, B:197:0x06bd, B:198:0x06c2, B:200:0x06cb, B:201:0x06cf, B:203:0x06dc, B:204:0x06e1, B:206:0x06f2, B:207:0x0709, B:209:0x071c, B:211:0x0726, B:213:0x072e, B:214:0x0733, B:216:0x073d, B:218:0x0747, B:220:0x074f, B:221:0x0751, B:227:0x076a, B:229:0x0772, B:230:0x0775, B:232:0x078c, B:235:0x0794, B:236:0x07ad, B:238:0x07b3, B:240:0x07c7, B:242:0x07d3, B:244:0x07e0, B:248:0x07fa, B:249:0x080a, B:253:0x0813, B:254:0x0816, B:256:0x0837, B:265:0x0867, B:267:0x08ac, B:268:0x08b1, B:270:0x08b9, B:272:0x08cf, B:273:0x08d2, B:275:0x08de, B:277:0x08f6, B:278:0x08fa, B:280:0x0903, B:282:0x091c, B:287:0x0932, B:289:0x0965, B:290:0x096a, B:286:0x0926, B:279:0x08fe, B:291:0x0976, B:293:0x0985, B:298:0x099c, B:300:0x09a6, B:301:0x09ad, B:302:0x09b8, B:304:0x09be, B:306:0x09ed, B:307:0x0a31, B:308:0x0a3b, B:309:0x0a46, B:311:0x0a4c, B:320:0x0a99, B:321:0x0ae6, B:323:0x0af6, B:337:0x0b5c, B:326:0x0b0e, B:328:0x0b12, B:314:0x0a59, B:316:0x0a81, B:332:0x0b2b, B:333:0x0b42, B:336:0x0b45, B:295:0x098b, B:297:0x0995, B:258:0x083d, B:260:0x084f, B:262:0x0853, B:264:0x085e, B:222:0x0755, B:224:0x075f, B:226:0x0767, B:188:0x0657, B:175:0x0582, B:121:0x03a1, B:122:0x03a8, B:124:0x03ae, B:126:0x03ba, B:63:0x01d0, B:66:0x01dc, B:68:0x01f3, B:75:0x0214, B:83:0x0254, B:85:0x025a, B:87:0x0268, B:89:0x0270, B:92:0x027c, B:94:0x0286, B:97:0x028d, B:114:0x0340, B:116:0x034a, B:98:0x02c4, B:99:0x02e8, B:101:0x02f2, B:103:0x02f9, B:113:0x031d, B:112:0x030a, B:91:0x0276, B:78:0x0222, B:82:0x024a), top: B:362:0x0193, inners: #1, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dc A[Catch: all -> 0x0b8f, TRY_ENTER, TryCatch #9 {all -> 0x0b8f, blocks: (B:47:0x0193, B:50:0x01a2, B:52:0x01ac, B:57:0x01b8, B:118:0x0387, B:127:0x03c1, B:129:0x0406, B:131:0x040b, B:132:0x0424, B:136:0x0435, B:138:0x044e, B:140:0x0455, B:141:0x046e, B:146:0x0498, B:150:0x04bb, B:151:0x04d4, B:154:0x04e3, B:157:0x0504, B:158:0x051c, B:160:0x0526, B:162:0x0532, B:164:0x0538, B:165:0x0543, B:166:0x0550, B:168:0x0565, B:178:0x059a, B:179:0x05b1, B:181:0x05d8, B:184:0x05f1, B:187:0x0639, B:189:0x0665, B:191:0x06a3, B:192:0x06a8, B:194:0x06b0, B:195:0x06b5, B:197:0x06bd, B:198:0x06c2, B:200:0x06cb, B:201:0x06cf, B:203:0x06dc, B:204:0x06e1, B:206:0x06f2, B:207:0x0709, B:209:0x071c, B:211:0x0726, B:213:0x072e, B:214:0x0733, B:216:0x073d, B:218:0x0747, B:220:0x074f, B:221:0x0751, B:227:0x076a, B:229:0x0772, B:230:0x0775, B:232:0x078c, B:235:0x0794, B:236:0x07ad, B:238:0x07b3, B:240:0x07c7, B:242:0x07d3, B:244:0x07e0, B:248:0x07fa, B:249:0x080a, B:253:0x0813, B:254:0x0816, B:256:0x0837, B:265:0x0867, B:267:0x08ac, B:268:0x08b1, B:270:0x08b9, B:272:0x08cf, B:273:0x08d2, B:275:0x08de, B:277:0x08f6, B:278:0x08fa, B:280:0x0903, B:282:0x091c, B:287:0x0932, B:289:0x0965, B:290:0x096a, B:286:0x0926, B:279:0x08fe, B:291:0x0976, B:293:0x0985, B:298:0x099c, B:300:0x09a6, B:301:0x09ad, B:302:0x09b8, B:304:0x09be, B:306:0x09ed, B:307:0x0a31, B:308:0x0a3b, B:309:0x0a46, B:311:0x0a4c, B:320:0x0a99, B:321:0x0ae6, B:323:0x0af6, B:337:0x0b5c, B:326:0x0b0e, B:328:0x0b12, B:314:0x0a59, B:316:0x0a81, B:332:0x0b2b, B:333:0x0b42, B:336:0x0b45, B:295:0x098b, B:297:0x0995, B:258:0x083d, B:260:0x084f, B:262:0x0853, B:264:0x085e, B:222:0x0755, B:224:0x075f, B:226:0x0767, B:188:0x0657, B:175:0x0582, B:121:0x03a1, B:122:0x03a8, B:124:0x03ae, B:126:0x03ba, B:63:0x01d0, B:66:0x01dc, B:68:0x01f3, B:75:0x0214, B:83:0x0254, B:85:0x025a, B:87:0x0268, B:89:0x0270, B:92:0x027c, B:94:0x0286, B:97:0x028d, B:114:0x0340, B:116:0x034a, B:98:0x02c4, B:99:0x02e8, B:101:0x02f2, B:103:0x02f9, B:113:0x031d, B:112:0x030a, B:91:0x0276, B:78:0x0222, B:82:0x024a), top: B:362:0x0193, inners: #1, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025a A[Catch: all -> 0x0b8f, TryCatch #9 {all -> 0x0b8f, blocks: (B:47:0x0193, B:50:0x01a2, B:52:0x01ac, B:57:0x01b8, B:118:0x0387, B:127:0x03c1, B:129:0x0406, B:131:0x040b, B:132:0x0424, B:136:0x0435, B:138:0x044e, B:140:0x0455, B:141:0x046e, B:146:0x0498, B:150:0x04bb, B:151:0x04d4, B:154:0x04e3, B:157:0x0504, B:158:0x051c, B:160:0x0526, B:162:0x0532, B:164:0x0538, B:165:0x0543, B:166:0x0550, B:168:0x0565, B:178:0x059a, B:179:0x05b1, B:181:0x05d8, B:184:0x05f1, B:187:0x0639, B:189:0x0665, B:191:0x06a3, B:192:0x06a8, B:194:0x06b0, B:195:0x06b5, B:197:0x06bd, B:198:0x06c2, B:200:0x06cb, B:201:0x06cf, B:203:0x06dc, B:204:0x06e1, B:206:0x06f2, B:207:0x0709, B:209:0x071c, B:211:0x0726, B:213:0x072e, B:214:0x0733, B:216:0x073d, B:218:0x0747, B:220:0x074f, B:221:0x0751, B:227:0x076a, B:229:0x0772, B:230:0x0775, B:232:0x078c, B:235:0x0794, B:236:0x07ad, B:238:0x07b3, B:240:0x07c7, B:242:0x07d3, B:244:0x07e0, B:248:0x07fa, B:249:0x080a, B:253:0x0813, B:254:0x0816, B:256:0x0837, B:265:0x0867, B:267:0x08ac, B:268:0x08b1, B:270:0x08b9, B:272:0x08cf, B:273:0x08d2, B:275:0x08de, B:277:0x08f6, B:278:0x08fa, B:280:0x0903, B:282:0x091c, B:287:0x0932, B:289:0x0965, B:290:0x096a, B:286:0x0926, B:279:0x08fe, B:291:0x0976, B:293:0x0985, B:298:0x099c, B:300:0x09a6, B:301:0x09ad, B:302:0x09b8, B:304:0x09be, B:306:0x09ed, B:307:0x0a31, B:308:0x0a3b, B:309:0x0a46, B:311:0x0a4c, B:320:0x0a99, B:321:0x0ae6, B:323:0x0af6, B:337:0x0b5c, B:326:0x0b0e, B:328:0x0b12, B:314:0x0a59, B:316:0x0a81, B:332:0x0b2b, B:333:0x0b42, B:336:0x0b45, B:295:0x098b, B:297:0x0995, B:258:0x083d, B:260:0x084f, B:262:0x0853, B:264:0x085e, B:222:0x0755, B:224:0x075f, B:226:0x0767, B:188:0x0657, B:175:0x0582, B:121:0x03a1, B:122:0x03a8, B:124:0x03ae, B:126:0x03ba, B:63:0x01d0, B:66:0x01dc, B:68:0x01f3, B:75:0x0214, B:83:0x0254, B:85:0x025a, B:87:0x0268, B:89:0x0270, B:92:0x027c, B:94:0x0286, B:97:0x028d, B:114:0x0340, B:116:0x034a, B:98:0x02c4, B:99:0x02e8, B:101:0x02f2, B:103:0x02f9, B:113:0x031d, B:112:0x030a, B:91:0x0276, B:78:0x0222, B:82:0x024a), top: B:362:0x0193, inners: #1, #4, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(c.f.a.c.k.b.t r35, c.f.a.c.k.b.la r36) {
        /*
            Method dump skipped, instruction units count: 2971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.h(c.f.a.c.k.b.t, c.f.a.c.k.b.la):void");
    }

    public final ea h0() {
        return this.f14456k.G();
    }

    public final String i(g gVar) {
        c.f.a.c.j.h.ha.a();
        if (!this.f14456k.z().w(null, m3.I0) || gVar.h()) {
            return j();
        }
        return null;
    }

    public final void i0() {
        if (!this.f14457l) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @Deprecated
    public final String j() {
        byte[] bArr = new byte[16];
        this.f14456k.G().h0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void j0(la laVar) {
        this.f14456k.d().g();
        i0();
        c.f.a.c.f.q.o.e(laVar.f14070b);
        C(laVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a8 A[Catch: all -> 0x0583, TryCatch #5 {all -> 0x0583, blocks: (B:3:0x0012, B:5:0x0023, B:6:0x002f, B:10:0x0038, B:12:0x003e, B:13:0x004b, B:15:0x0053, B:16:0x0057, B:18:0x0064, B:19:0x0071, B:21:0x007b, B:22:0x008b, B:24:0x00b0, B:26:0x00b6, B:27:0x00b9, B:29:0x00c9, B:30:0x00e2, B:32:0x00f2, B:34:0x00f8, B:38:0x010c, B:51:0x012d, B:55:0x0134, B:56:0x0137, B:57:0x0138, B:61:0x0163, B:65:0x016b, B:71:0x01a5, B:129:0x02a2, B:131:0x02a8, B:133:0x02ba, B:153:0x0319, B:155:0x0336, B:157:0x0348, B:161:0x0355, B:163:0x0367, B:168:0x0375, B:170:0x0385, B:177:0x0396, B:179:0x03d2, B:180:0x03d5, B:183:0x03e9, B:185:0x03f1, B:186:0x03f4, B:188:0x0402, B:189:0x0417, B:190:0x0420, B:192:0x0433, B:194:0x0443, B:195:0x045e, B:197:0x0470, B:199:0x0487, B:201:0x0496, B:202:0x049f, B:198:0x0480, B:204:0x04e3, B:135:0x02c4, B:136:0x02c8, B:138:0x02ce, B:140:0x02e2, B:144:0x02eb, B:146:0x02f1, B:152:0x0316, B:149:0x0306, B:151:0x0310, B:116:0x0273, B:128:0x029f, B:208:0x04fc, B:209:0x04ff, B:210:0x0500, B:215:0x0541, B:229:0x0563, B:231:0x0569, B:233:0x0573, B:238:0x057f, B:239:0x0582), top: B:250:0x0012, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134 A[Catch: all -> 0x0583, TryCatch #5 {all -> 0x0583, blocks: (B:3:0x0012, B:5:0x0023, B:6:0x002f, B:10:0x0038, B:12:0x003e, B:13:0x004b, B:15:0x0053, B:16:0x0057, B:18:0x0064, B:19:0x0071, B:21:0x007b, B:22:0x008b, B:24:0x00b0, B:26:0x00b6, B:27:0x00b9, B:29:0x00c9, B:30:0x00e2, B:32:0x00f2, B:34:0x00f8, B:38:0x010c, B:51:0x012d, B:55:0x0134, B:56:0x0137, B:57:0x0138, B:61:0x0163, B:65:0x016b, B:71:0x01a5, B:129:0x02a2, B:131:0x02a8, B:133:0x02ba, B:153:0x0319, B:155:0x0336, B:157:0x0348, B:161:0x0355, B:163:0x0367, B:168:0x0375, B:170:0x0385, B:177:0x0396, B:179:0x03d2, B:180:0x03d5, B:183:0x03e9, B:185:0x03f1, B:186:0x03f4, B:188:0x0402, B:189:0x0417, B:190:0x0420, B:192:0x0433, B:194:0x0443, B:195:0x045e, B:197:0x0470, B:199:0x0487, B:201:0x0496, B:202:0x049f, B:198:0x0480, B:204:0x04e3, B:135:0x02c4, B:136:0x02c8, B:138:0x02ce, B:140:0x02e2, B:144:0x02eb, B:146:0x02f1, B:152:0x0316, B:149:0x0306, B:151:0x0310, B:116:0x0273, B:128:0x029f, B:208:0x04fc, B:209:0x04ff, B:210:0x0500, B:215:0x0541, B:229:0x0563, B:231:0x0569, B:233:0x0573, B:238:0x057f, B:239:0x0582), top: B:250:0x0012, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1 A[Catch: SQLiteException -> 0x027a, all -> 0x04f8, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x027a, blocks: (B:68:0x019b, B:70:0x01a1, B:73:0x01ac, B:74:0x01b2, B:75:0x01b6, B:76:0x01c0), top: B:249:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac A[Catch: SQLiteException -> 0x027a, all -> 0x04f8, TRY_ENTER, TryCatch #3 {SQLiteException -> 0x027a, blocks: (B:68:0x019b, B:70:0x01a1, B:73:0x01ac, B:74:0x01b2, B:75:0x01b6, B:76:0x01c0), top: B:249:0x019b }] */
    /* JADX WARN: Type inference failed for: r10v16, types: [c.f.a.c.j.h.i6, c.f.a.c.j.h.x1] */
    /* JADX WARN: Type inference failed for: r11v12, types: [long] */
    /* JADX WARN: Type inference failed for: r11v3, types: [long] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r2v18, types: [c.f.a.c.j.h.i6, c.f.a.c.j.h.v1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [long] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23, types: [c.f.a.c.k.b.l4] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.database.Cursor] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.k():void");
    }

    public final void k0(la laVar) {
        c.f.a.c.j.h.ha.a();
        if (this.f14456k.z().w(null, m3.I0)) {
            this.f14456k.d().g();
            i0();
            c.f.a.c.f.q.o.e(laVar.f14070b);
            g gVarC = g.c(laVar.w);
            g gVarM0 = m0(laVar.f14070b);
            this.f14456k.c().w().c("Setting consent, package, consent", laVar.f14070b, gVarC);
            l0(laVar.f14070b, gVarC);
            if (gVarC.i(gVarM0)) {
                r(laVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015c A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:4:0x000f, B:5:0x0011, B:45:0x012c, B:50:0x0171, B:49:0x015c, B:11:0x0022, B:33:0x00c9, B:35:0x00dc, B:37:0x00e2, B:39:0x00ed, B:38:0x00e6, B:41:0x00f2, B:42:0x00f9, B:44:0x00fb), top: B:58:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.l(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    public final void l0(String str, g gVar) {
        c.f.a.c.j.h.ha.a();
        f fVarZ = this.f14456k.z();
        l3<Boolean> l3Var = m3.I0;
        if (fVarZ.w(null, l3Var)) {
            this.f14456k.d().g();
            i0();
            this.z.put(str, gVar);
            j jVarZ = Z();
            c.f.a.c.j.h.ha.a();
            if (jVarZ.f14413a.z().w(null, l3Var)) {
                c.f.a.c.f.q.o.i(str);
                c.f.a.c.f.q.o.i(gVar);
                jVarZ.g();
                jVarZ.i();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", gVar.d());
                try {
                    if (jVarZ.N().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                        jVarZ.f14413a.c().o().b("Failed to insert/update consent setting (got -1). appId", y3.x(str));
                    }
                } catch (SQLiteException e2) {
                    jVarZ.f14413a.c().o().c("Error storing consent setting. appId, error", y3.x(str), e2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(c.f.a.c.k.b.g5 r13) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.m(c.f.a.c.k.b.g5):void");
    }

    public final g m0(String str) {
        String string;
        g gVar = g.f13894a;
        c.f.a.c.j.h.ha.a();
        Cursor cursorRawQuery = null;
        if (this.f14456k.z().w(null, m3.I0)) {
            this.f14456k.d().g();
            i0();
            gVar = this.z.get(str);
            if (gVar == null) {
                j jVarZ = Z();
                c.f.a.c.f.q.o.i(str);
                jVarZ.g();
                jVarZ.i();
                try {
                    try {
                        cursorRawQuery = jVarZ.N().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        } else {
                            cursorRawQuery.close();
                            string = "G1";
                        }
                        g gVarC = g.c(string);
                        l0(str, gVarC);
                        return gVarC;
                    } catch (SQLiteException e2) {
                        jVarZ.f14413a.c().o().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e2);
                        throw e2;
                    }
                } catch (Throwable th) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            }
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135 A[Catch: all -> 0x0177, TryCatch #1 {all -> 0x0177, blocks: (B:6:0x002f, B:16:0x004c, B:60:0x016b, B:21:0x0068, B:26:0x00c8, B:25:0x00b3, B:29:0x00d0, B:32:0x00dc, B:34:0x00e2, B:39:0x00ef, B:51:0x011f, B:53:0x0135, B:55:0x0158, B:57:0x0162, B:59:0x0168, B:54:0x0145, B:45:0x0106, B:47:0x0110), top: B:70:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[Catch: all -> 0x0177, TryCatch #1 {all -> 0x0177, blocks: (B:6:0x002f, B:16:0x004c, B:60:0x016b, B:21:0x0068, B:26:0x00c8, B:25:0x00b3, B:29:0x00d0, B:32:0x00dc, B:34:0x00e2, B:39:0x00ef, B:51:0x011f, B:53:0x0135, B:55:0x0158, B:57:0x0162, B:59:0x0168, B:54:0x0145, B:45:0x0106, B:47:0x0110), top: B:70:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final long n0() {
        long jA = this.f14456k.a().a();
        o4 o4VarA = this.f14456k.A();
        o4VarA.k();
        o4VarA.g();
        long jA2 = o4VarA.f14180j.a();
        if (jA2 == 0) {
            jA2 = ((long) o4VarA.f14413a.G().h0().nextInt(DateTimeConstants.MILLIS_PER_DAY)) + 1;
            o4VarA.f14180j.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    public final void o(Runnable runnable) {
        this.f14456k.d().g();
        if (this.f14460o == null) {
            this.f14460o = new ArrayList();
        }
        this.f14460o.add(runnable);
    }

    public final void o0(t tVar, String str) {
        g5 g5VarA0 = Z().a0(str);
        if (g5VarA0 == null || TextUtils.isEmpty(g5VarA0.e0())) {
            this.f14456k.c().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolR = R(g5VarA0);
        if (boolR == null) {
            if (!"_ui".equals(tVar.f14310b)) {
                this.f14456k.c().r().b("Could not find package. appId", y3.x(str));
            }
        } else if (!boolR.booleanValue()) {
            this.f14456k.c().o().b("App version does not match; dropping event. appId", y3.x(str));
            return;
        }
        String strQ = g5VarA0.Q();
        String strE0 = g5VarA0.e0();
        long jG0 = g5VarA0.g0();
        String strI0 = g5VarA0.i0();
        long jK0 = g5VarA0.k0();
        long jB = g5VarA0.b();
        boolean zF = g5VarA0.f();
        String strY = g5VarA0.Y();
        long jE = g5VarA0.E();
        boolean zG = g5VarA0.G();
        String strS = g5VarA0.S();
        Boolean boolI = g5VarA0.I();
        long jD = g5VarA0.d();
        List<String> listK = g5VarA0.K();
        sb.a();
        String strU = this.f14456k.z().w(g5VarA0.N(), m3.j0) ? g5VarA0.U() : null;
        c.f.a.c.j.h.ha.a();
        f(tVar, new la(str, strQ, strE0, jG0, strI0, jK0, jB, (String) null, zF, false, strY, jE, 0L, 0, zG, false, strS, boolI, jD, listK, strU, this.f14456k.z().w(null, m3.I0) ? m0(str).d() : BuildConfig.FLAVOR));
    }

    public final void p() {
        w3 w3VarO;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        this.f14456k.d().g();
        i0();
        if (this.f14458m) {
            return;
        }
        this.f14458m = true;
        if (q()) {
            FileChannel fileChannel = this.v;
            this.f14456k.d().g();
            int i2 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                this.f14456k.c().o().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i3 = fileChannel.read(byteBufferAllocate);
                    if (i3 == 4) {
                        byteBufferAllocate.flip();
                        i2 = byteBufferAllocate.getInt();
                    } else if (i3 != -1) {
                        this.f14456k.c().r().b("Unexpected data length. Bytes read", Integer.valueOf(i3));
                    }
                } catch (IOException e2) {
                    this.f14456k.c().o().b("Failed to read from channel", e2);
                }
            }
            int iT = this.f14456k.f().t();
            this.f14456k.d().g();
            if (i2 > iT) {
                w3VarO = this.f14456k.c().o();
                numValueOf = Integer.valueOf(i2);
                numValueOf2 = Integer.valueOf(iT);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (i2 >= iT) {
                    return;
                }
                FileChannel fileChannel2 = this.v;
                this.f14456k.d().g();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    this.f14456k.c().o().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iT);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        if (this.f14456k.z().w(null, m3.s0) && Build.VERSION.SDK_INT <= 19) {
                            fileChannel2.position(0L);
                        }
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            this.f14456k.c().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        w3VarO = this.f14456k.c().w();
                        numValueOf = Integer.valueOf(i2);
                        numValueOf2 = Integer.valueOf(iT);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e3) {
                        this.f14456k.c().o().b("Failed to write to channel", e3);
                        w3VarO = this.f14456k.c().o();
                        numValueOf = Integer.valueOf(i2);
                        numValueOf2 = Integer.valueOf(iT);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                w3VarO = this.f14456k.c().o();
                numValueOf = Integer.valueOf(i2);
                numValueOf2 = Integer.valueOf(iT);
                str = "Storage version upgrade failed. Previous, current version";
            }
            w3VarO.c(str, numValueOf, numValueOf2);
        }
    }

    public final boolean q() {
        w3 w3VarR;
        String str;
        FileLock fileLock;
        this.f14456k.d().g();
        if (this.f14456k.z().w(null, m3.i0) && (fileLock = this.u) != null && fileLock.isValid()) {
            this.f14456k.c().w().a("Storage concurrent access okay");
            return true;
        }
        this.f14449d.f14413a.z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f14456k.b().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.v = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.u = fileLockTryLock;
            if (fileLockTryLock != null) {
                this.f14456k.c().w().a("Storage concurrent access okay");
                return true;
            }
            this.f14456k.c().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            e = e2;
            w3VarR = this.f14456k.c().o();
            str = "Failed to acquire storage lock";
            w3VarR.b(str, e);
            return false;
        } catch (IOException e3) {
            e = e3;
            w3VarR = this.f14456k.c().o();
            str = "Failed to access storage lock file";
            w3VarR.b(str, e);
            return false;
        } catch (OverlappingFileLockException e4) {
            e = e4;
            w3VarR = this.f14456k.c().r();
            str = "Storage lock already acquired";
            w3VarR.b(str, e);
            return false;
        }
    }

    public final void r(la laVar) {
        if (this.w != null) {
            ArrayList arrayList = new ArrayList();
            this.x = arrayList;
            arrayList.addAll(this.w);
        }
        j jVarZ = Z();
        String str = laVar.f14070b;
        c.f.a.c.f.q.o.e(str);
        jVarZ.g();
        jVarZ.i();
        try {
            SQLiteDatabase sQLiteDatabaseN = jVarZ.N();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseN.delete("apps", "app_id=?", strArr) + sQLiteDatabaseN.delete("events", "app_id=?", strArr) + sQLiteDatabaseN.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseN.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseN.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseN.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseN.delete("queue", "app_id=?", strArr) + sQLiteDatabaseN.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseN.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseN.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                jVarZ.f14413a.c().w().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e2) {
            jVarZ.f14413a.c().o().c("Error resetting analytics data. appId, error", y3.x(str), e2);
        }
        if (laVar.f14077i) {
            x(laVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(c.f.a.c.k.b.aa r14, c.f.a.c.k.b.la r15) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.s(c.f.a.c.k.b.aa, c.f.a.c.k.b.la):void");
    }

    public final void t(aa aaVar, la laVar) {
        this.f14456k.d().g();
        i0();
        if (T(laVar)) {
            if (!laVar.f14077i) {
                C(laVar);
                return;
            }
            if ("_npa".equals(aaVar.f13731c) && laVar.s != null) {
                this.f14456k.c().v().a("Falling back to manifest metadata value for ad personalization");
                s(new aa("_npa", this.f14456k.a().a(), Long.valueOf(true != laVar.s.booleanValue() ? 0L : 1L), "auto"), laVar);
                return;
            }
            this.f14456k.c().v().b("Removing user property", this.f14456k.H().r(aaVar.f13731c));
            Z().K();
            try {
                C(laVar);
                Z().Q(laVar.f14070b, aaVar.f13731c);
                Z().L();
                this.f14456k.c().v().b("User property removed", this.f14456k.H().r(aaVar.f13731c));
            } finally {
                Z().M();
            }
        }
    }

    public final void u() {
        this.p++;
    }

    public final void v() {
        this.q++;
    }

    public final c5 w() {
        return this.f14456k;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216 A[Catch: all -> 0x0495, TryCatch #0 {all -> 0x0495, blocks: (B:25:0x00a7, B:27:0x00b5, B:45:0x0115, B:47:0x0121, B:49:0x0139, B:50:0x0161, B:52:0x01b1, B:55:0x01c6, B:58:0x01dc, B:60:0x01e7, B:65:0x01f6, B:67:0x01fe, B:69:0x0204, B:73:0x0213, B:75:0x0216, B:77:0x023a, B:79:0x023f, B:82:0x025c, B:85:0x0270, B:87:0x02ca, B:88:0x02cd, B:90:0x02ee, B:131:0x03d3, B:132:0x03d6, B:137:0x0437, B:139:0x0447, B:140:0x0467, B:144:0x0486, B:93:0x0309, B:98:0x0334, B:100:0x033c, B:102:0x0344, B:107:0x035b, B:111:0x0365, B:115:0x0371, B:118:0x038b, B:123:0x03b7, B:125:0x03bd, B:126:0x03c2, B:128:0x03c8, B:121:0x039e, B:96:0x031c, B:133:0x03ed, B:135:0x0420, B:136:0x0423, B:141:0x046b, B:143:0x046f, B:80:0x024d, B:31:0x00c4, B:33:0x00c8, B:37:0x00d7, B:39:0x00f1, B:41:0x00fb, B:44:0x0105), top: B:151:0x00a7, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(c.f.a.c.k.b.la r22) {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.x9.x(c.f.a.c.k.b.la):void");
    }

    public final void y(b bVar) {
        la laVarS = S(bVar.f13737b);
        if (laVarS != null) {
            z(bVar, laVarS);
        }
    }

    public final void z(b bVar, la laVar) {
        w3 w3VarO;
        String str;
        Object objX;
        String strR;
        Object objI;
        w3 w3VarO2;
        String str2;
        Object objX2;
        String strR2;
        Object obj;
        t tVar;
        c.f.a.c.f.q.o.i(bVar);
        c.f.a.c.f.q.o.e(bVar.f13737b);
        c.f.a.c.f.q.o.i(bVar.f13738c);
        c.f.a.c.f.q.o.i(bVar.f13739d);
        c.f.a.c.f.q.o.e(bVar.f13739d.f13731c);
        this.f14456k.d().g();
        i0();
        if (T(laVar)) {
            if (!laVar.f14077i) {
                C(laVar);
                return;
            }
            b bVar2 = new b(bVar);
            boolean z = false;
            bVar2.f13741f = false;
            Z().K();
            try {
                b bVarW = Z().W(bVar2.f13737b, bVar2.f13739d.f13731c);
                if (bVarW != null && !bVarW.f13738c.equals(bVar2.f13738c)) {
                    this.f14456k.c().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f14456k.H().r(bVar2.f13739d.f13731c), bVar2.f13738c, bVarW.f13738c);
                }
                if (bVarW != null && bVarW.f13741f) {
                    bVar2.f13738c = bVarW.f13738c;
                    bVar2.f13740e = bVarW.f13740e;
                    bVar2.f13744i = bVarW.f13744i;
                    bVar2.f13742g = bVarW.f13742g;
                    bVar2.f13745j = bVarW.f13745j;
                    bVar2.f13741f = true;
                    aa aaVar = bVar2.f13739d;
                    bVar2.f13739d = new aa(aaVar.f13731c, bVarW.f13739d.f13732d, aaVar.I(), bVarW.f13739d.f13735g);
                } else if (TextUtils.isEmpty(bVar2.f13742g)) {
                    aa aaVar2 = bVar2.f13739d;
                    bVar2.f13739d = new aa(aaVar2.f13731c, bVar2.f13740e, aaVar2.I(), bVar2.f13739d.f13735g);
                    bVar2.f13741f = true;
                    z = true;
                }
                if (bVar2.f13741f) {
                    aa aaVar3 = bVar2.f13739d;
                    ca caVar = new ca(bVar2.f13737b, bVar2.f13738c, aaVar3.f13731c, aaVar3.f13732d, aaVar3.I());
                    if (Z().R(caVar)) {
                        w3VarO2 = this.f14456k.c().v();
                        str2 = "User property updated immediately";
                        objX2 = bVar2.f13737b;
                        strR2 = this.f14456k.H().r(caVar.f13809c);
                        obj = caVar.f13811e;
                    } else {
                        w3VarO2 = this.f14456k.c().o();
                        str2 = "(2)Too many active user properties, ignoring";
                        objX2 = y3.x(bVar2.f13737b);
                        strR2 = this.f14456k.H().r(caVar.f13809c);
                        obj = caVar.f13811e;
                    }
                    w3VarO2.d(str2, objX2, strR2, obj);
                    if (z && (tVar = bVar2.f13745j) != null) {
                        h(new t(tVar, bVar2.f13740e), laVar);
                    }
                }
                if (Z().V(bVar2)) {
                    w3VarO = this.f14456k.c().v();
                    str = "Conditional property added";
                    objX = bVar2.f13737b;
                    strR = this.f14456k.H().r(bVar2.f13739d.f13731c);
                    objI = bVar2.f13739d.I();
                } else {
                    w3VarO = this.f14456k.c().o();
                    str = "Too many conditional properties, ignoring";
                    objX = y3.x(bVar2.f13737b);
                    strR = this.f14456k.H().r(bVar2.f13739d.f13731c);
                    objI = bVar2.f13739d.I();
                }
                w3VarO.d(str, objX, strR, objI);
                Z().L();
            } finally {
                Z().M();
            }
        }
    }
}

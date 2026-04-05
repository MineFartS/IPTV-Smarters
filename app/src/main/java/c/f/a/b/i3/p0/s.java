package c.f.a.b.i3.p0;

import android.os.ConditionVariable;
import c.f.a.b.i3.p0.b;
import c.f.a.b.j3.z;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<File> f9037a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f9038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f9039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f9040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f9041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, ArrayList<b.InterfaceC0138b>> f9042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Random f9043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f9046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b.a f9048l;

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f9049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f9049b = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (s.this) {
                this.f9049b.open();
                s.this.t();
                s.this.f9039c.e();
            }
        }
    }

    public s(File file, e eVar, m mVar, g gVar) {
        if (!w(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f9038b = file;
        this.f9039c = eVar;
        this.f9040d = mVar;
        this.f9041e = gVar;
        this.f9042f = new HashMap<>();
        this.f9043g = new Random();
        this.f9044h = eVar.f();
        this.f9045i = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
        conditionVariable.block();
    }

    public s(File file, e eVar, c.f.a.b.u2.b bVar) {
        this(file, eVar, bVar, null, false, false);
    }

    public s(File file, e eVar, c.f.a.b.u2.b bVar, byte[] bArr, boolean z, boolean z2) {
        this(file, eVar, new m(bVar, file, bArr, z, z2), (bVar == null || z2) ? null : new g(bVar));
    }

    public static long A(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static void p(File file) throws b.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        z.d("SimpleCache", str);
        throw new b.a(str);
    }

    public static long q(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static long v(File[] fileArr) {
        int length = fileArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file = fileArr[i2];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return A(name);
                } catch (NumberFormatException unused) {
                    z.d("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean w(File file) {
        return f9037a.add(file.getAbsoluteFile());
    }

    public final void B(j jVar) {
        l lVarG = this.f9040d.g(jVar.f8991b);
        if (lVarG == null || !lVarG.k(jVar)) {
            return;
        }
        this.f9046j -= jVar.f8993d;
        if (this.f9041e != null) {
            String name = jVar.f8995f.getName();
            try {
                this.f9041e.f(name);
            } catch (IOException unused) {
                z.i("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f9040d.p(lVarG.f9008b);
        y(jVar);
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        Iterator<l> it = this.f9040d.h().iterator();
        while (it.hasNext()) {
            for (t tVar : it.next().f()) {
                if (tVar.f8995f.length() != tVar.f8993d) {
                    arrayList.add(tVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            B((j) arrayList.get(i2));
        }
    }

    public final t D(String str, t tVar) {
        if (!this.f9044h) {
            return tVar;
        }
        String name = ((File) c.f.a.b.j3.g.e(tVar.f8995f)).getName();
        long j2 = tVar.f8993d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        g gVar = this.f9041e;
        if (gVar != null) {
            try {
                gVar.h(name, j2, jCurrentTimeMillis);
            } catch (IOException unused) {
                z.i("SimpleCache", "Failed to update index with new touch timestamp.");
            }
        } else {
            z = true;
        }
        t tVarL = this.f9040d.g(str).l(tVar, jCurrentTimeMillis, z);
        z(tVar, tVarL);
        return tVarL;
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized File a(String str, long j2, long j3) {
        l lVarG;
        File file;
        c.f.a.b.j3.g.g(!this.f9047k);
        o();
        lVarG = this.f9040d.g(str);
        c.f.a.b.j3.g.e(lVarG);
        c.f.a.b.j3.g.g(lVarG.h(j2, j3));
        if (!this.f9038b.exists()) {
            p(this.f9038b);
            C();
        }
        this.f9039c.a(this, str, j2, j3);
        file = new File(this.f9038b, Integer.toString(this.f9043g.nextInt(10)));
        if (!file.exists()) {
            p(file);
        }
        return t.s(file, lVarG.f9007a, j2, System.currentTimeMillis());
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized o b(String str) {
        c.f.a.b.j3.g.g(!this.f9047k);
        return this.f9040d.j(str);
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized void c(String str, p pVar) {
        c.f.a.b.j3.g.g(!this.f9047k);
        o();
        this.f9040d.e(str, pVar);
        try {
            this.f9040d.s();
        } catch (IOException e2) {
            throw new b.a(e2);
        }
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized long d(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j3 + j2;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        j4 = 0;
        while (j2 < j6) {
            long jF = f(str, j2, j6 - j2);
            if (jF > 0) {
                j4 += jF;
            } else {
                jF = -jF;
            }
            j2 += jF;
        }
        return j4;
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized j e(String str, long j2, long j3) {
        c.f.a.b.j3.g.g(!this.f9047k);
        o();
        t tVarS = s(str, j2, j3);
        if (tVarS.f8994e) {
            return D(str, tVarS);
        }
        if (this.f9040d.m(str).j(j2, tVarS.f8993d)) {
            return tVarS;
        }
        return null;
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized long f(String str, long j2, long j3) {
        l lVarG;
        c.f.a.b.j3.g.g(!this.f9047k);
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        lVarG = this.f9040d.g(str);
        return lVarG != null ? lVarG.c(j2, j3) : -j3;
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized j g(String str, long j2, long j3) {
        j jVarE;
        c.f.a.b.j3.g.g(!this.f9047k);
        o();
        while (true) {
            jVarE = e(str, j2, j3);
            if (jVarE == null) {
                wait();
            }
        }
        return jVarE;
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized void h(File file, long j2) {
        boolean z = true;
        c.f.a.b.j3.g.g(!this.f9047k);
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            t tVar = (t) c.f.a.b.j3.g.e(t.p(file, j2, this.f9040d));
            l lVar = (l) c.f.a.b.j3.g.e(this.f9040d.g(tVar.f8991b));
            c.f.a.b.j3.g.g(lVar.h(tVar.f8992c, tVar.f8993d));
            long jA = n.a(lVar.d());
            if (jA != -1) {
                if (tVar.f8992c + tVar.f8993d > jA) {
                    z = false;
                }
                c.f.a.b.j3.g.g(z);
            }
            if (this.f9041e == null) {
                n(tVar);
                this.f9040d.s();
                notifyAll();
                return;
            }
            try {
                this.f9041e.h(file.getName(), tVar.f8993d, tVar.f8996g);
                n(tVar);
                try {
                    this.f9040d.s();
                    notifyAll();
                    return;
                } catch (IOException e2) {
                    throw new b.a(e2);
                }
            } catch (IOException e3) {
                throw new b.a(e3);
            }
        }
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized void i(String str) {
        c.f.a.b.j3.g.g(!this.f9047k);
        Iterator<j> it = r(str).iterator();
        while (it.hasNext()) {
            B(it.next());
        }
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized long j() {
        c.f.a.b.j3.g.g(!this.f9047k);
        return this.f9046j;
    }

    @Override // c.f.a.b.i3.p0.b
    public synchronized void k(j jVar) {
        c.f.a.b.j3.g.g(!this.f9047k);
        l lVar = (l) c.f.a.b.j3.g.e(this.f9040d.g(jVar.f8991b));
        lVar.m(jVar.f8992c);
        this.f9040d.p(lVar.f9008b);
        notifyAll();
    }

    public final void n(t tVar) {
        this.f9040d.m(tVar.f8991b).a(tVar);
        this.f9046j += tVar.f8993d;
        x(tVar);
    }

    public synchronized void o() {
        b.a aVar = this.f9048l;
        if (aVar != null) {
            throw aVar;
        }
    }

    public synchronized NavigableSet<j> r(String str) {
        l lVarG;
        c.f.a.b.j3.g.g(!this.f9047k);
        lVarG = this.f9040d.g(str);
        return (lVarG == null || lVarG.g()) ? new TreeSet() : new TreeSet((Collection) lVarG.f());
    }

    public final t s(String str, long j2, long j3) {
        t tVarE;
        l lVarG = this.f9040d.g(str);
        if (lVarG == null) {
            return t.q(str, j2, j3);
        }
        while (true) {
            tVarE = lVarG.e(j2, j3);
            if (!tVarE.f8994e || tVarE.f8995f.length() == tVarE.f8993d) {
                break;
            }
            C();
        }
        return tVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: IOException -> 0x00aa, TryCatch #0 {IOException -> 0x00aa, blocks: (B:20:0x006c, B:22:0x0078, B:23:0x0092), top: B:32:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[Catch: IOException -> 0x00aa, TRY_LEAVE, TryCatch #0 {IOException -> 0x00aa, blocks: (B:20:0x006c, B:22:0x0078, B:23:0x0092), top: B:32:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            r7 = this;
            java.io.File r0 = r7.f9038b
            boolean r0 = r0.exists()
            if (r0 != 0) goto L12
            java.io.File r0 = r7.f9038b     // Catch: c.f.a.b.i3.p0.b.a -> Le
            p(r0)     // Catch: c.f.a.b.i3.p0.b.a -> Le
            goto L12
        Le:
            r0 = move-exception
            r7.f9048l = r0
            return
        L12:
            java.io.File r0 = r7.f9038b
            java.io.File[] r0 = r0.listFiles()
            java.lang.String r1 = "SimpleCache"
            if (r0 != 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to list cache directory files: "
            r0.append(r2)
            java.io.File r2 = r7.f9038b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            c.f.a.b.j3.z.d(r1, r0)
            c.f.a.b.i3.p0.b$a r1 = new c.f.a.b.i3.p0.b$a
            r1.<init>(r0)
        L37:
            r7.f9048l = r1
            return
        L3a:
            long r2 = v(r0)
            r7.f9045i = r2
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L6c
            java.io.File r2 = r7.f9038b     // Catch: java.io.IOException -> L4f
            long r2 = q(r2)     // Catch: java.io.IOException -> L4f
            r7.f9045i = r2     // Catch: java.io.IOException -> L4f
            goto L6c
        L4f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to create cache UID: "
            r2.append(r3)
            java.io.File r3 = r7.f9038b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            c.f.a.b.j3.z.e(r1, r2, r0)
            c.f.a.b.i3.p0.b$a r1 = new c.f.a.b.i3.p0.b$a
            r1.<init>(r2, r0)
            goto L37
        L6c:
            c.f.a.b.i3.p0.m r2 = r7.f9040d     // Catch: java.io.IOException -> Laa
            long r3 = r7.f9045i     // Catch: java.io.IOException -> Laa
            r2.n(r3)     // Catch: java.io.IOException -> Laa
            c.f.a.b.i3.p0.g r2 = r7.f9041e     // Catch: java.io.IOException -> Laa
            r3 = 1
            if (r2 == 0) goto L92
            long r4 = r7.f9045i     // Catch: java.io.IOException -> Laa
            r2.e(r4)     // Catch: java.io.IOException -> Laa
            c.f.a.b.i3.p0.g r2 = r7.f9041e     // Catch: java.io.IOException -> Laa
            java.util.Map r2 = r2.b()     // Catch: java.io.IOException -> Laa
            java.io.File r4 = r7.f9038b     // Catch: java.io.IOException -> Laa
            r7.u(r4, r3, r0, r2)     // Catch: java.io.IOException -> Laa
            c.f.a.b.i3.p0.g r0 = r7.f9041e     // Catch: java.io.IOException -> Laa
            java.util.Set r2 = r2.keySet()     // Catch: java.io.IOException -> Laa
            r0.g(r2)     // Catch: java.io.IOException -> Laa
            goto L98
        L92:
            java.io.File r2 = r7.f9038b     // Catch: java.io.IOException -> Laa
            r4 = 0
            r7.u(r2, r3, r0, r4)     // Catch: java.io.IOException -> Laa
        L98:
            c.f.a.b.i3.p0.m r0 = r7.f9040d
            r0.r()
            c.f.a.b.i3.p0.m r0 = r7.f9040d     // Catch: java.io.IOException -> La3
            r0.s()     // Catch: java.io.IOException -> La3
            goto La9
        La3:
            r0 = move-exception
            java.lang.String r2 = "Storing index file failed"
            c.f.a.b.j3.z.e(r1, r2, r0)
        La9:
            return
        Laa:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to initialize cache indices: "
            r2.append(r3)
            java.io.File r3 = r7.f9038b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            c.f.a.b.j3.z.e(r1, r2, r0)
            c.f.a.b.i3.p0.b$a r1 = new c.f.a.b.i3.p0.b$a
            r1.<init>(r2, r0)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.i3.p0.s.t():void");
    }

    public final void u(File file, boolean z, File[] fileArr, Map<String, f> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                u(file2, false, file2.listFiles(), map);
            } else if (!z || (!m.o(name) && !name.endsWith(".uid"))) {
                long j2 = -1;
                long j3 = -9223372036854775807L;
                f fVarRemove = map != null ? map.remove(name) : null;
                if (fVarRemove != null) {
                    j2 = fVarRemove.f8985a;
                    j3 = fVarRemove.f8986b;
                }
                t tVarO = t.o(file2, j2, j3, this.f9040d);
                if (tVarO != null) {
                    n(tVarO);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void x(t tVar) {
        ArrayList<b.InterfaceC0138b> arrayList = this.f9042f.get(tVar.f8991b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).d(this, tVar);
            }
        }
        this.f9039c.d(this, tVar);
    }

    public final void y(j jVar) {
        ArrayList<b.InterfaceC0138b> arrayList = this.f9042f.get(jVar.f8991b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, jVar);
            }
        }
        this.f9039c.b(this, jVar);
    }

    public final void z(t tVar, j jVar) {
        ArrayList<b.InterfaceC0138b> arrayList = this.f9042f.get(tVar.f8991b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(this, tVar, jVar);
            }
        }
        this.f9039c.c(this, tVar, jVar);
    }
}

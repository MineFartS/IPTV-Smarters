package c.k.a.y;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l.m;
import l.s;
import l.t;
import l.u;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f18310b = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f18311c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f18312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f18313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f18314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f18315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18318j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l.d f18320l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18322n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18319k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap<String, d> f18321m = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18323o = 0;
    public final ThreadPoolExecutor p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), h.r("OkHttp DiskLruCache", true));
    public final Runnable q = new RunnableC0245a();

    /* JADX INFO: renamed from: c.k.a.y.a$a, reason: collision with other inner class name */
    public class RunnableC0245a implements Runnable {
        public RunnableC0245a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this) {
                if (a.this.f18320l == null) {
                    return;
                }
                try {
                    a.this.F0();
                    if (a.this.V()) {
                        a.this.B0();
                        a.this.f18322n = 0;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    public static class b implements s {
        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // l.s, java.io.Flushable
        public void flush() {
        }

        @Override // l.s
        public void h(l.c cVar, long j2) {
        }

        @Override // l.s
        public u timeout() {
            return u.f31095a;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f18325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f18326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18328d;

        /* JADX INFO: renamed from: c.k.a.y.a$c$a, reason: collision with other inner class name */
        public class C0246a extends l.h {
            public C0246a(s sVar) {
                super(sVar);
            }

            @Override // l.h, l.s, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    super.close();
                } catch (IOException unused) {
                    synchronized (a.this) {
                        c.this.f18327c = true;
                    }
                }
            }

            @Override // l.h, l.s, java.io.Flushable
            public void flush() {
                try {
                    super.flush();
                } catch (IOException unused) {
                    synchronized (a.this) {
                        c.this.f18327c = true;
                    }
                }
            }

            @Override // l.h, l.s
            public void h(l.c cVar, long j2) {
                try {
                    super.h(cVar, j2);
                } catch (IOException unused) {
                    synchronized (a.this) {
                        c.this.f18327c = true;
                    }
                }
            }
        }

        public c(d dVar) {
            this.f18325a = dVar;
            this.f18326b = dVar.f18335e ? null : new boolean[a.this.f18318j];
        }

        public /* synthetic */ c(a aVar, d dVar, RunnableC0245a runnableC0245a) {
            this(dVar);
        }

        public void a() {
            synchronized (a.this) {
                a.this.v(this, false);
            }
        }

        public void e() {
            synchronized (a.this) {
                if (this.f18327c) {
                    a.this.v(this, false);
                    a.this.D0(this.f18325a);
                } else {
                    a.this.v(this, true);
                }
                this.f18328d = true;
            }
        }

        public s f(int i2) {
            s sVarE;
            C0246a c0246a;
            synchronized (a.this) {
                if (this.f18325a.f18336f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f18325a.f18335e) {
                    this.f18326b[i2] = true;
                }
                File file = this.f18325a.f18334d[i2];
                try {
                    sVarE = m.e(file);
                } catch (FileNotFoundException unused) {
                    a.this.f18312d.mkdirs();
                    try {
                        sVarE = m.e(file);
                    } catch (FileNotFoundException unused2) {
                        return a.f18311c;
                    }
                }
                c0246a = new C0246a(sVarE);
            }
            return c0246a;
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f18332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File[] f18333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f18334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f18336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f18337g;

        public d(String str) {
            this.f18331a = str;
            this.f18332b = new long[a.this.f18318j];
            this.f18333c = new File[a.this.f18318j];
            this.f18334d = new File[a.this.f18318j];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < a.this.f18318j; i2++) {
                sb.append(i2);
                this.f18333c[i2] = new File(a.this.f18312d, sb.toString());
                sb.append(".tmp");
                this.f18334d[i2] = new File(a.this.f18312d, sb.toString());
                sb.setLength(length);
            }
        }

        public /* synthetic */ d(a aVar, String str, RunnableC0245a runnableC0245a) {
            this(str);
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f18332b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f18318j) {
                throw m(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.f18332b[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }
    }

    public final class e implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f18339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t[] f18341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long[] f18342e;

        public e(String str, long j2, t[] tVarArr, long[] jArr) {
            this.f18339b = str;
            this.f18340c = j2;
            this.f18341d = tVarArr;
            this.f18342e = jArr;
        }

        public /* synthetic */ e(a aVar, String str, long j2, t[] tVarArr, long[] jArr, RunnableC0245a runnableC0245a) {
            this(str, j2, tVarArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (t tVar : this.f18341d) {
                h.c(tVar);
            }
        }

        public c d() {
            return a.this.Q(this.f18339b, this.f18340c);
        }

        public t i(int i2) {
            return this.f18341d[i2];
        }
    }

    public a(File file, int i2, int i3, long j2) {
        this.f18312d = file;
        this.f18316h = i2;
        this.f18313e = new File(file, "journal");
        this.f18314f = new File(file, "journal.tmp");
        this.f18315g = new File(file, "journal.bkp");
        this.f18318j = i3;
        this.f18317i = j2;
    }

    public static void E0(File file, File file2, boolean z) throws IOException {
        if (z) {
            x(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static a c0(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                E0(file2, file3, false);
            }
        }
        a aVar = new a(file, i2, i3, j2);
        if (aVar.f18313e.exists()) {
            try {
                aVar.w0();
                aVar.s0();
                return aVar;
            } catch (IOException e2) {
                f.e().h("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.w();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i2, i3, j2);
        aVar2.B0();
        return aVar2;
    }

    public static void x(File file) throws IOException {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public final void A0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f18321m.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        d dVar = this.f18321m.get(strSubstring);
        RunnableC0245a runnableC0245a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, runnableC0245a);
            this.f18321m.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f18335e = true;
            dVar.f18336f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f18336f = new c(this, dVar, runnableC0245a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void B0() {
        l.d dVar = this.f18320l;
        if (dVar != null) {
            dVar.close();
        }
        l.d dVarB = m.b(m.e(this.f18314f));
        try {
            dVarB.P("libcore.io.DiskLruCache").I(10);
            dVarB.P("1").I(10);
            dVarB.P(Integer.toString(this.f18316h)).I(10);
            dVarB.P(Integer.toString(this.f18318j)).I(10);
            dVarB.I(10);
            for (d dVar2 : this.f18321m.values()) {
                if (dVar2.f18336f != null) {
                    dVarB.P("DIRTY").I(32);
                    dVarB.P(dVar2.f18331a);
                } else {
                    dVarB.P("CLEAN").I(32);
                    dVarB.P(dVar2.f18331a);
                    dVarB.P(dVar2.l());
                }
                dVarB.I(10);
            }
            dVarB.close();
            if (this.f18313e.exists()) {
                E0(this.f18313e, this.f18315g, true);
            }
            E0(this.f18314f, this.f18313e, false);
            this.f18315g.delete();
            this.f18320l = m.b(m.a(this.f18313e));
        } catch (Throwable th) {
            dVarB.close();
            throw th;
        }
    }

    public synchronized boolean C0(String str) {
        u();
        G0(str);
        d dVar = this.f18321m.get(str);
        if (dVar == null) {
            return false;
        }
        return D0(dVar);
    }

    public final boolean D0(d dVar) throws IOException {
        if (dVar.f18336f != null) {
            dVar.f18336f.f18327c = true;
        }
        for (int i2 = 0; i2 < this.f18318j; i2++) {
            x(dVar.f18333c[i2]);
            this.f18319k -= dVar.f18332b[i2];
            dVar.f18332b[i2] = 0;
        }
        this.f18322n++;
        this.f18320l.P("REMOVE").I(32).P(dVar.f18331a).I(10);
        this.f18321m.remove(dVar.f18331a);
        if (V()) {
            this.p.execute(this.q);
        }
        return true;
    }

    public final void F0() throws IOException {
        while (this.f18319k > this.f18317i) {
            D0(this.f18321m.values().iterator().next());
        }
    }

    public final void G0(String str) {
        if (f18310b.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public final synchronized c Q(String str, long j2) {
        u();
        G0(str);
        d dVar = this.f18321m.get(str);
        RunnableC0245a runnableC0245a = null;
        if (j2 != -1 && (dVar == null || dVar.f18337g != j2)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, runnableC0245a);
            this.f18321m.put(str, dVar);
        } else if (dVar.f18336f != null) {
            return null;
        }
        c cVar = new c(this, dVar, runnableC0245a);
        dVar.f18336f = cVar;
        this.f18320l.P("DIRTY").I(32).P(str).I(10);
        this.f18320l.flush();
        return cVar;
    }

    public synchronized e U(String str) {
        u();
        G0(str);
        d dVar = this.f18321m.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f18335e) {
            return null;
        }
        t[] tVarArr = new t[this.f18318j];
        for (int i2 = 0; i2 < this.f18318j; i2++) {
            try {
                tVarArr[i2] = m.i(dVar.f18333c[i2]);
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < this.f18318j && tVarArr[i3] != null; i3++) {
                    h.c(tVarArr[i3]);
                }
                return null;
            }
        }
        this.f18322n++;
        this.f18320l.P("READ").I(32).P(str).I(10);
        if (V()) {
            this.p.execute(this.q);
        }
        return new e(this, str, dVar.f18337g, tVarArr, dVar.f18332b, null);
    }

    public final boolean V() {
        int i2 = this.f18322n;
        return i2 >= 2000 && i2 >= this.f18321m.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f18320l == null) {
            return;
        }
        for (d dVar : (d[]) this.f18321m.values().toArray(new d[this.f18321m.size()])) {
            if (dVar.f18336f != null) {
                dVar.f18336f.a();
            }
        }
        F0();
        this.f18320l.close();
        this.f18320l = null;
    }

    public final void s0() throws IOException {
        x(this.f18314f);
        Iterator<d> it = this.f18321m.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f18336f == null) {
                while (i2 < this.f18318j) {
                    this.f18319k += next.f18332b[i2];
                    i2++;
                }
            } else {
                next.f18336f = null;
                while (i2 < this.f18318j) {
                    x(next.f18333c[i2]);
                    x(next.f18334d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void u() {
        if (this.f18320l == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void v(c cVar, boolean z) {
        d dVar = cVar.f18325a;
        if (dVar.f18336f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f18335e) {
            for (int i2 = 0; i2 < this.f18318j; i2++) {
                if (!cVar.f18326b[i2]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!dVar.f18334d[i2].exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.f18318j; i3++) {
            File file = dVar.f18334d[i3];
            if (!z) {
                x(file);
            } else if (file.exists()) {
                File file2 = dVar.f18333c[i3];
                file.renameTo(file2);
                long j2 = dVar.f18332b[i3];
                long length = file2.length();
                dVar.f18332b[i3] = length;
                this.f18319k = (this.f18319k - j2) + length;
            }
        }
        this.f18322n++;
        dVar.f18336f = null;
        if (dVar.f18335e || z) {
            dVar.f18335e = true;
            this.f18320l.P("CLEAN").I(32);
            this.f18320l.P(dVar.f18331a);
            this.f18320l.P(dVar.l());
            this.f18320l.I(10);
            if (z) {
                long j3 = this.f18323o;
                this.f18323o = 1 + j3;
                dVar.f18337g = j3;
            }
        } else {
            this.f18321m.remove(dVar.f18331a);
            this.f18320l.P("REMOVE").I(32);
            this.f18320l.P(dVar.f18331a);
            this.f18320l.I(10);
        }
        this.f18320l.flush();
        if (this.f18319k > this.f18317i || V()) {
            this.p.execute(this.q);
        }
    }

    public void w() throws IOException {
        close();
        h.e(this.f18312d);
    }

    public final void w0() {
        l.e eVarC = m.c(m.i(this.f18313e));
        try {
            String strB0 = eVarC.b0();
            String strB02 = eVarC.b0();
            String strB03 = eVarC.b0();
            String strB04 = eVarC.b0();
            String strB05 = eVarC.b0();
            if (!"libcore.io.DiskLruCache".equals(strB0) || !"1".equals(strB02) || !Integer.toString(this.f18316h).equals(strB03) || !Integer.toString(this.f18318j).equals(strB04) || !BuildConfig.FLAVOR.equals(strB05)) {
                throw new IOException("unexpected journal header: [" + strB0 + ", " + strB02 + ", " + strB04 + ", " + strB05 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    A0(eVarC.b0());
                    i2++;
                } catch (EOFException unused) {
                    this.f18322n = i2 - this.f18321m.size();
                    if (eVarC.H()) {
                        this.f18320l = m.b(m.a(this.f18313e));
                    } else {
                        B0();
                    }
                    h.c(eVarC);
                    return;
                }
            }
        } catch (Throwable th) {
            h.c(eVarC);
            throw th;
        }
    }

    public c y(String str) {
        return Q(str, -1L);
    }
}

package c.d.a.k;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f5378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f5379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f5380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f5381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5384h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Writer f5386j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5388l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5385i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, c> f5387k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5389m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f5390n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable<Void> f5391o = new CallableC0099a();

    /* JADX INFO: renamed from: c.d.a.k.a$a, reason: collision with other inner class name */
    public class CallableC0099a implements Callable<Void> {
        public CallableC0099a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                if (a.this.f5386j == null) {
                    return null;
                }
                a.this.B0();
                if (a.this.y()) {
                    a.this.s0();
                    a.this.f5388l = 0;
                }
                return null;
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f5393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f5394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5395c;

        public b(c cVar) {
            this.f5393a = cVar;
            this.f5394b = cVar.f5401e ? null : new boolean[a.this.f5384h];
        }

        public /* synthetic */ b(a aVar, c cVar, CallableC0099a callableC0099a) {
            this(cVar);
        }

        public void a() {
            a.this.s(this, false);
        }

        public void b() {
            if (this.f5395c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.s(this, true);
            this.f5395c = true;
        }

        public File f(int i2) {
            File fileK;
            synchronized (a.this) {
                if (this.f5393a.f5402f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f5393a.f5401e) {
                    this.f5394b[i2] = true;
                }
                fileK = this.f5393a.k(i2);
                if (!a.this.f5378b.exists()) {
                    a.this.f5378b.mkdirs();
                }
            }
            return fileK;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f5398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File[] f5399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File[] f5400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f5402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f5403g;

        public c(String str) {
            this.f5397a = str;
            this.f5398b = new long[a.this.f5384h];
            this.f5399c = new File[a.this.f5384h];
            this.f5400d = new File[a.this.f5384h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < a.this.f5384h; i2++) {
                sb.append(i2);
                this.f5399c[i2] = new File(a.this.f5378b, sb.toString());
                sb.append(".tmp");
                this.f5400d[i2] = new File(a.this.f5378b, sb.toString());
                sb.setLength(length);
            }
        }

        public /* synthetic */ c(a aVar, String str, CallableC0099a callableC0099a) {
            this(str);
        }

        public File j(int i2) {
            return this.f5399c[i2];
        }

        public File k(int i2) {
            return this.f5400d[i2];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f5398b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f5384h) {
                throw m(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.f5398b[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f5407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f5408d;

        public d(String str, long j2, File[] fileArr, long[] jArr) {
            this.f5405a = str;
            this.f5406b = j2;
            this.f5408d = fileArr;
            this.f5407c = jArr;
        }

        public /* synthetic */ d(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0099a callableC0099a) {
            this(str, j2, fileArr, jArr);
        }

        public File a(int i2) {
            return this.f5408d[i2];
        }
    }

    public a(File file, int i2, int i3, long j2) {
        this.f5378b = file;
        this.f5382f = i2;
        this.f5379c = new File(file, "journal");
        this.f5380d = new File(file, "journal.tmp");
        this.f5381e = new File(file, "journal.bkp");
        this.f5384h = i3;
        this.f5383g = j2;
    }

    public static void A0(File file, File file2, boolean z) throws IOException {
        if (z) {
            u(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static a Q(File file, int i2, int i3, long j2) throws IOException {
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
                A0(file2, file3, false);
            }
        }
        a aVar = new a(file, i2, i3, j2);
        if (aVar.f5379c.exists()) {
            try {
                aVar.V();
                aVar.U();
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.t();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i2, i3, j2);
        aVar2.s0();
        return aVar2;
    }

    public static void u(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final void B0() {
        while (this.f5385i > this.f5383g) {
            w0(this.f5387k.entrySet().iterator().next().getKey());
        }
    }

    public final void U() throws IOException {
        u(this.f5380d);
        Iterator<c> it = this.f5387k.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i2 = 0;
            if (next.f5402f == null) {
                while (i2 < this.f5384h) {
                    this.f5385i += next.f5398b[i2];
                    i2++;
                }
            } else {
                next.f5402f = null;
                while (i2 < this.f5384h) {
                    u(next.j(i2));
                    u(next.k(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void V() {
        c.d.a.k.b bVar = new c.d.a.k.b(new FileInputStream(this.f5379c), c.d.a.k.c.f5416a);
        try {
            String strM = bVar.m();
            String strM2 = bVar.m();
            String strM3 = bVar.m();
            String strM4 = bVar.m();
            String strM5 = bVar.m();
            if (!"libcore.io.DiskLruCache".equals(strM) || !"1".equals(strM2) || !Integer.toString(this.f5382f).equals(strM3) || !Integer.toString(this.f5384h).equals(strM4) || !BuildConfig.FLAVOR.equals(strM5)) {
                throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM4 + ", " + strM5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    c0(bVar.m());
                    i2++;
                } catch (EOFException unused) {
                    this.f5388l = i2 - this.f5387k.size();
                    if (bVar.l()) {
                        s0();
                    } else {
                        this.f5386j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5379c, true), c.d.a.k.c.f5416a));
                    }
                    c.d.a.k.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            c.d.a.k.c.a(bVar);
            throw th;
        }
    }

    public final void c0(String str) throws IOException {
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
                this.f5387k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        c cVar = this.f5387k.get(strSubstring);
        CallableC0099a callableC0099a = null;
        if (cVar == null) {
            cVar = new c(this, strSubstring, callableC0099a);
            this.f5387k.put(strSubstring, cVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            cVar.f5401e = true;
            cVar.f5402f = null;
            cVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            cVar.f5402f = new b(this, cVar, callableC0099a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f5386j == null) {
            return;
        }
        for (c cVar : new ArrayList(this.f5387k.values())) {
            if (cVar.f5402f != null) {
                cVar.f5402f.a();
            }
        }
        B0();
        this.f5386j.close();
        this.f5386j = null;
    }

    public final void r() {
        if (this.f5386j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void s(b bVar, boolean z) {
        c cVar = bVar.f5393a;
        if (cVar.f5402f != bVar) {
            throw new IllegalStateException();
        }
        if (z && !cVar.f5401e) {
            for (int i2 = 0; i2 < this.f5384h; i2++) {
                if (!bVar.f5394b[i2]) {
                    bVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!cVar.k(i2).exists()) {
                    bVar.a();
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.f5384h; i3++) {
            File fileK = cVar.k(i3);
            if (!z) {
                u(fileK);
            } else if (fileK.exists()) {
                File fileJ = cVar.j(i3);
                fileK.renameTo(fileJ);
                long j2 = cVar.f5398b[i3];
                long length = fileJ.length();
                cVar.f5398b[i3] = length;
                this.f5385i = (this.f5385i - j2) + length;
            }
        }
        this.f5388l++;
        cVar.f5402f = null;
        if (cVar.f5401e || z) {
            cVar.f5401e = true;
            this.f5386j.append((CharSequence) "CLEAN");
            this.f5386j.append(' ');
            this.f5386j.append((CharSequence) cVar.f5397a);
            this.f5386j.append((CharSequence) cVar.l());
            this.f5386j.append('\n');
            if (z) {
                long j3 = this.f5389m;
                this.f5389m = 1 + j3;
                cVar.f5403g = j3;
            }
        } else {
            this.f5387k.remove(cVar.f5397a);
            this.f5386j.append((CharSequence) "REMOVE");
            this.f5386j.append(' ');
            this.f5386j.append((CharSequence) cVar.f5397a);
            this.f5386j.append('\n');
        }
        this.f5386j.flush();
        if (this.f5385i > this.f5383g || y()) {
            this.f5390n.submit(this.f5391o);
        }
    }

    public final synchronized void s0() {
        Writer writer = this.f5386j;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5380d), c.d.a.k.c.f5416a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f5382f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f5384h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (c cVar : this.f5387k.values()) {
                bufferedWriter.write(cVar.f5402f != null ? "DIRTY " + cVar.f5397a + '\n' : "CLEAN " + cVar.f5397a + cVar.l() + '\n');
            }
            bufferedWriter.close();
            if (this.f5379c.exists()) {
                A0(this.f5379c, this.f5381e, true);
            }
            A0(this.f5380d, this.f5379c, false);
            this.f5381e.delete();
            this.f5386j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5379c, true), c.d.a.k.c.f5416a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public void t() throws IOException {
        close();
        c.d.a.k.c.b(this.f5378b);
    }

    public b v(String str) {
        return w(str, -1L);
    }

    public final synchronized b w(String str, long j2) {
        r();
        c cVar = this.f5387k.get(str);
        CallableC0099a callableC0099a = null;
        if (j2 != -1 && (cVar == null || cVar.f5403g != j2)) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(this, str, callableC0099a);
            this.f5387k.put(str, cVar);
        } else if (cVar.f5402f != null) {
            return null;
        }
        b bVar = new b(this, cVar, callableC0099a);
        cVar.f5402f = bVar;
        this.f5386j.append((CharSequence) "DIRTY");
        this.f5386j.append(' ');
        this.f5386j.append((CharSequence) str);
        this.f5386j.append('\n');
        this.f5386j.flush();
        return bVar;
    }

    public synchronized boolean w0(String str) {
        r();
        c cVar = this.f5387k.get(str);
        if (cVar != null && cVar.f5402f == null) {
            for (int i2 = 0; i2 < this.f5384h; i2++) {
                File fileJ = cVar.j(i2);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.f5385i -= cVar.f5398b[i2];
                cVar.f5398b[i2] = 0;
            }
            this.f5388l++;
            this.f5386j.append((CharSequence) "REMOVE");
            this.f5386j.append(' ');
            this.f5386j.append((CharSequence) str);
            this.f5386j.append('\n');
            this.f5387k.remove(str);
            if (y()) {
                this.f5390n.submit(this.f5391o);
            }
            return true;
        }
        return false;
    }

    public synchronized d x(String str) {
        r();
        c cVar = this.f5387k.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f5401e) {
            return null;
        }
        for (File file : cVar.f5399c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f5388l++;
        this.f5386j.append((CharSequence) "READ");
        this.f5386j.append(' ');
        this.f5386j.append((CharSequence) str);
        this.f5386j.append('\n');
        if (y()) {
            this.f5390n.submit(this.f5391o);
        }
        return new d(this, str, cVar.f5403g, cVar.f5399c, cVar.f5398b, null);
    }

    public final boolean y() {
        int i2 = this.f5388l;
        return i2 >= 2000 && i2 >= this.f5387k.size();
    }
}

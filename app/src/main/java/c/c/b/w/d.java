package c.c.b.w;

import android.os.SystemClock;
import android.text.TextUtils;
import c.c.b.b;
import c.c.b.v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class d implements c.c.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f5276a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5277b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f5278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5279d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f5280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f5283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f5284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f5285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f5286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<c.c.b.g> f5287h;

        public a(String str, b.a aVar) {
            this(str, aVar.f5184b, aVar.f5185c, aVar.f5186d, aVar.f5187e, aVar.f5188f, a(aVar));
            this.f5280a = aVar.f5183a.length;
        }

        public a(String str, String str2, long j2, long j3, long j4, long j5, List<c.c.b.g> list) {
            this.f5281b = str;
            this.f5282c = BuildConfig.FLAVOR.equals(str2) ? null : str2;
            this.f5283d = j2;
            this.f5284e = j3;
            this.f5285f = j4;
            this.f5286g = j5;
            this.f5287h = list;
        }

        public static List<c.c.b.g> a(b.a aVar) {
            List<c.c.b.g> list = aVar.f5190h;
            return list != null ? list : e.e(aVar.f5189g);
        }

        public static a b(b bVar) throws IOException {
            if (d.j(bVar) == 538247942) {
                return new a(d.l(bVar), d.l(bVar), d.k(bVar), d.k(bVar), d.k(bVar), d.k(bVar), d.i(bVar));
            }
            throw new IOException();
        }

        public b.a c(byte[] bArr) {
            b.a aVar = new b.a();
            aVar.f5183a = bArr;
            aVar.f5184b = this.f5282c;
            aVar.f5185c = this.f5283d;
            aVar.f5186d = this.f5284e;
            aVar.f5187e = this.f5285f;
            aVar.f5188f = this.f5286g;
            aVar.f5189g = e.f(this.f5287h);
            aVar.f5190h = Collections.unmodifiableList(this.f5287h);
            return aVar;
        }

        public boolean d(OutputStream outputStream) {
            try {
                d.q(outputStream, 538247942);
                d.s(outputStream, this.f5281b);
                String str = this.f5282c;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                d.s(outputStream, str);
                d.r(outputStream, this.f5283d);
                d.r(outputStream, this.f5284e);
                d.r(outputStream, this.f5285f);
                d.r(outputStream, this.f5286g);
                d.p(this.f5287h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e2) {
                v.b("%s", e2.toString());
                return false;
            }
        }
    }

    public static class b extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f5289c;

        public b(InputStream inputStream, long j2) {
            super(inputStream);
            this.f5288b = j2;
        }

        public long d() {
            return this.f5288b - this.f5289c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i2 = super.read();
            if (i2 != -1) {
                this.f5289c++;
            }
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = super.read(bArr, i2, i3);
            if (i4 != -1) {
                this.f5289c += (long) i4;
            }
            return i4;
        }
    }

    public d(File file, int i2) {
        this.f5278c = file;
        this.f5279d = i2;
    }

    public static int h(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 != -1) {
            return i2;
        }
        throw new EOFException();
    }

    public static List<c.c.b.g> i(b bVar) throws IOException {
        int iJ = j(bVar);
        if (iJ < 0) {
            throw new IOException("readHeaderList size=" + iJ);
        }
        List<c.c.b.g> listEmptyList = iJ == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i2 = 0; i2 < iJ; i2++) {
            listEmptyList.add(new c.c.b.g(l(bVar).intern(), l(bVar).intern()));
        }
        return listEmptyList;
    }

    public static int j(InputStream inputStream) {
        return (h(inputStream) << 24) | (h(inputStream) << 0) | 0 | (h(inputStream) << 8) | (h(inputStream) << 16);
    }

    public static long k(InputStream inputStream) {
        return ((((long) h(inputStream)) & 255) << 0) | 0 | ((((long) h(inputStream)) & 255) << 8) | ((((long) h(inputStream)) & 255) << 16) | ((((long) h(inputStream)) & 255) << 24) | ((((long) h(inputStream)) & 255) << 32) | ((((long) h(inputStream)) & 255) << 40) | ((((long) h(inputStream)) & 255) << 48) | ((255 & ((long) h(inputStream))) << 56);
    }

    public static String l(b bVar) {
        return new String(o(bVar, k(bVar)), "UTF-8");
    }

    public static byte[] o(b bVar, long j2) throws IOException {
        long jD = bVar.d();
        if (j2 >= 0 && j2 <= jD) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j2 + ", maxLength=" + jD);
    }

    public static void p(List<c.c.b.g> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            q(outputStream, 0);
            return;
        }
        q(outputStream, list.size());
        for (c.c.b.g gVar : list) {
            s(outputStream, gVar.a());
            s(outputStream, gVar.b());
        }
    }

    public static void q(OutputStream outputStream, int i2) throws IOException {
        outputStream.write((i2 >> 0) & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write((i2 >> 24) & 255);
    }

    public static void r(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) (j2 >>> 0));
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    public static void s(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        r(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // c.c.b.b
    public synchronized void a(String str, b.a aVar) {
        f(aVar.f5183a.length);
        File fileD = d(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c(fileD));
            a aVar2 = new a(str, aVar);
            if (!aVar2.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                v.b("Failed to write header for %s", fileD.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f5183a);
            bufferedOutputStream.close();
            g(str, aVar2);
        } catch (IOException unused) {
            if (fileD.delete()) {
                return;
            }
            v.b("Could not clean up file %s", fileD.getAbsolutePath());
        }
    }

    public InputStream b(File file) {
        return new FileInputStream(file);
    }

    public OutputStream c(File file) {
        return new FileOutputStream(file);
    }

    public File d(String str) {
        return new File(this.f5278c, e(str));
    }

    public final String e(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    public final void f(int i2) {
        long j2;
        long j3 = i2;
        if (this.f5277b + j3 < this.f5279d) {
            return;
        }
        if (v.f5259b) {
            v.e("Pruning old cache entries.", new Object[0]);
        }
        long j4 = this.f5277b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.f5276a.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (d(value.f5281b).delete()) {
                j2 = j3;
                this.f5277b -= value.f5280a;
            } else {
                j2 = j3;
                String str = value.f5281b;
                v.b("Could not delete cache entry for key=%s, filename=%s", str, e(str));
            }
            it.remove();
            i3++;
            if (this.f5277b + j2 < this.f5279d * 0.9f) {
                break;
            } else {
                j3 = j2;
            }
        }
        if (v.f5259b) {
            v.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.f5277b - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public final void g(String str, a aVar) {
        if (this.f5276a.containsKey(str)) {
            this.f5277b += aVar.f5280a - this.f5276a.get(str).f5280a;
        } else {
            this.f5277b += aVar.f5280a;
        }
        this.f5276a.put(str, aVar);
    }

    @Override // c.c.b.b
    public synchronized b.a get(String str) {
        a aVar = this.f5276a.get(str);
        if (aVar == null) {
            return null;
        }
        File fileD = d(str);
        try {
            b bVar = new b(new BufferedInputStream(b(fileD)), fileD.length());
            try {
                a aVarB = a.b(bVar);
                if (TextUtils.equals(str, aVarB.f5281b)) {
                    return aVar.c(o(bVar, bVar.d()));
                }
                v.b("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, aVarB.f5281b);
                n(str);
                return null;
            } finally {
                bVar.close();
            }
        } catch (IOException e2) {
            v.b("%s: %s", fileD.getAbsolutePath(), e2.toString());
            m(str);
            return null;
        }
    }

    @Override // c.c.b.b
    public synchronized void initialize() {
        if (!this.f5278c.exists()) {
            if (!this.f5278c.mkdirs()) {
                v.c("Unable to create cache dir %s", this.f5278c.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = this.f5278c.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                b bVar = new b(new BufferedInputStream(b(file)), length);
                try {
                    a aVarB = a.b(bVar);
                    aVarB.f5280a = length;
                    g(aVarB.f5281b, aVarB);
                    bVar.close();
                } catch (Throwable th) {
                    bVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    public synchronized void m(String str) {
        boolean zDelete = d(str).delete();
        n(str);
        if (!zDelete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, e(str));
        }
    }

    public final void n(String str) {
        a aVarRemove = this.f5276a.remove(str);
        if (aVarRemove != null) {
            this.f5277b -= aVarRemove.f5280a;
        }
    }
}

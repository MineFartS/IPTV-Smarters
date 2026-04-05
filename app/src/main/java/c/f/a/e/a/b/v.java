package c.f.a.e.a.b;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15635a = new c.f.a.e.a.e.a("AssetPackStorage");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f15637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f15638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f15639e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f15636b = timeUnit.toMillis(14L);
        f15637c = timeUnit.toMillis(28L);
    }

    public v(Context context, u1 u1Var) {
        this.f15638d = context;
        this.f15639e = u1Var;
    }

    public static void g(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long j2 = j(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(j2)) && !file2.getName().equals("stale.tmp")) {
                o(file2);
            }
        }
    }

    public static long h(File file) {
        return i(file, true);
    }

    public static long i(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f15635a.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            f15635a.c(e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static long j(File file) {
        return i(file, false);
    }

    public static boolean o(File file) {
        boolean zO;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            zO = true;
            for (File file2 : fileArrListFiles) {
                zO &= o(file2);
            }
        } else {
            zO = true;
        }
        return file.delete() && true == zO;
    }

    public final File A(String str, int i2, long j2, String str2) {
        return new File(C(str, i2, j2, str2), "checkpoint.dat");
    }

    public final File B(String str, int i2, long j2, String str2) {
        return new File(C(str, i2, j2, str2), "checkpoint_ext.dat");
    }

    public final File C(String str, int i2, long j2, String str2) {
        return new File(D(str, i2, j2), str2);
    }

    public final File D(String str, int i2, long j2) {
        return new File(new File(l(str, i2, j2), "_slices"), "_metadata");
    }

    public final void E(String str, int i2, long j2) {
        File fileE = e(str);
        if (fileE.exists()) {
            for (File file : fileE.listFiles()) {
                if (!file.getName().equals(String.valueOf(i2)) && !file.getName().equals("stale.tmp")) {
                    o(file);
                } else if (file.getName().equals(String.valueOf(i2))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j2))) {
                            o(file2);
                        }
                    }
                }
            }
        }
    }

    public final void F() {
        for (File file : k()) {
            if (file.listFiles() != null) {
                g(file);
                long j2 = j(file);
                if (this.f15639e.a() != j2) {
                    try {
                        new File(new File(file, String.valueOf(j2)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f15635a.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    g(file2);
                }
            }
        }
    }

    public final int G(String str) {
        return (int) h(e(str));
    }

    public final long H(String str) {
        return h(d(str, G(str)));
    }

    public final void I() {
        for (File file : k()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > f15637c) {
                        o(file2);
                    }
                }
            }
        }
    }

    public final void J() {
        if (m().exists()) {
            for (File file : m().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f15636b) {
                    o(file);
                } else {
                    g(file);
                }
            }
        }
    }

    public final void K() {
        o(n());
    }

    public final void a(List<String> list) {
        int iA = this.f15639e.a();
        for (File file : k()) {
            if (!list.contains(file.getName()) && h(file) != iA) {
                o(file);
            }
        }
    }

    public final void b(String str, int i2, long j2) {
        if (l(str, i2, j2).exists()) {
            o(l(str, i2, j2));
        }
    }

    public final void c(String str, int i2, long j2) {
        if (t(str, i2, j2).exists()) {
            o(t(str, i2, j2));
        }
    }

    public final File d(String str, int i2) {
        return new File(e(str), String.valueOf(i2));
    }

    public final File e(String str) {
        return new File(n(), str);
    }

    public final File f(String str, int i2, long j2) {
        return new File(x(str, i2, j2), "merge.tmp");
    }

    public final List<File> k() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e2) {
            f15635a.b("Could not process directory while scanning installed packs. %s", e2);
        }
        if (n().exists() && n().listFiles() != null) {
            for (File file : n().listFiles()) {
                if (!file.getCanonicalPath().equals(m().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final File l(String str, int i2, long j2) {
        return new File(new File(new File(m(), str), String.valueOf(i2)), String.valueOf(j2));
    }

    public final File m() {
        return new File(n(), "_tmp");
    }

    public final File n() {
        return new File(this.f15638d.getFilesDir(), "assetpacks");
    }

    public final Map<String, b> p() {
        HashMap map = new HashMap();
        try {
            for (File file : k()) {
                b bVarR = r(file.getName());
                if (bVarR != null) {
                    map.put(file.getName(), bVarR);
                }
            }
        } catch (IOException e2) {
            f15635a.b("Could not process directory while scanning installed packs: %s", e2);
        }
        return map;
    }

    public final Map<String, Long> q() {
        HashMap map = new HashMap();
        for (String str : p().keySet()) {
            map.put(str, Long.valueOf(H(str)));
        }
        return map;
    }

    public final b r(String str) {
        String strS = s(str);
        if (strS == null) {
            return null;
        }
        File file = new File(strS, "assets");
        if (file.isDirectory()) {
            return b.b(strS, file.getCanonicalPath());
        }
        f15635a.b("Failed to find assets directory: %s", file);
        return null;
    }

    public final String s(String str) {
        int length;
        File file = new File(n(), str);
        if (!file.exists()) {
            f15635a.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f15639e.a()));
        if (!file2.exists()) {
            f15635a.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f15639e.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            f15635a.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f15639e.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        f15635a.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f15639e.a()));
        return null;
    }

    public final File t(String str, int i2, long j2) {
        return new File(d(str, i2), String.valueOf(j2));
    }

    public final File u(String str, int i2, long j2) {
        return new File(t(str, i2, j2), "_metadata");
    }

    public final File v(String str, int i2, long j2, String str2) {
        return new File(new File(new File(l(str, i2, j2), "_slices"), "_unverified"), str2);
    }

    public final File w(String str, int i2, long j2, String str2) {
        return new File(new File(new File(l(str, i2, j2), "_slices"), "_verified"), str2);
    }

    public final File x(String str, int i2, long j2) {
        return new File(l(str, i2, j2), "_packs");
    }

    public final int y(String str, int i2, long j2) throws IOException {
        File fileF = f(str, i2, j2);
        if (!fileF.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileF);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new k0("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e2) {
                throw new k0("Merge checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final void z(String str, int i2, long j2, int i3) throws IOException {
        File fileF = f(str, i2, j2);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i3));
        fileF.getParentFile().mkdirs();
        fileF.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileF);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }
}

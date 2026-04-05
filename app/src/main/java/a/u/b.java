package a.u;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f3506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f3508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f3509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FileChannel f3510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FileLock f3511g;

    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: renamed from: a.u.b$b, reason: collision with other inner class name */
    public static class C0082b extends File {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f3513b;

        public C0082b(File file, String str) {
            super(file, str);
            this.f3513b = -1L;
        }
    }

    public b(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f3506b = file;
        this.f3508d = file2;
        this.f3507c = o(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f3509e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f3510f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f3511g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                i(this.f3510f);
                throw e;
            } catch (Error e3) {
                e = e3;
                i(this.f3510f);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                i(this.f3510f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            i(this.f3509e);
            throw e5;
        }
    }

    public static void i(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    public static void l(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i2);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            i(inputStream);
            fileCreateTempFile.delete();
        }
    }

    public static SharedPreferences m(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    public static long n(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long o(File file) throws IOException {
        long jC = c.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    public static boolean p(Context context, File file, long j2, String str) {
        SharedPreferences sharedPreferencesM = m(context);
        if (sharedPreferencesM.getLong(str + "timestamp", -1L) == n(file)) {
            if (sharedPreferencesM.getLong(str + "crc", -1L) == j2) {
                return false;
            }
        }
        return true;
    }

    public static void t(Context context, String str, long j2, long j3, List<C0082b> list) {
        SharedPreferences.Editor editorEdit = m(context).edit();
        editorEdit.putLong(str + "timestamp", j2);
        editorEdit.putLong(str + "crc", j3);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (C0082b c0082b : list) {
            editorEdit.putLong(str + "dex.crc." + i2, c0082b.f3513b);
            editorEdit.putLong(str + "dex.time." + i2, c0082b.lastModified());
            i2++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3511g.release();
        this.f3510f.close();
        this.f3509e.close();
    }

    public final void d() {
        File[] fileArrListFiles = this.f3508d.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f3508d.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    public List<? extends File> q(Context context, String str, boolean z) {
        List<C0082b> listR;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f3506b.getPath() + ", " + z + ", " + str + ")");
        if (!this.f3511g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !p(context, this.f3506b, this.f3507c, str)) {
            try {
                listR = r(context, str);
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                List<C0082b> listS = s();
                t(context, str, n(this.f3506b), this.f3507c, listS);
                listR = listS;
            }
            Log.i("MultiDex", "load found " + listR.size() + " secondary dex files");
            return listR;
        }
        Log.i("MultiDex", z ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
        List<C0082b> listS2 = s();
        t(context, str, n(this.f3506b), this.f3507c, listS2);
        listR = listS2;
        Log.i("MultiDex", "load found " + listR.size() + " secondary dex files");
        return listR;
    }

    public final List<C0082b> r(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f3506b.getName() + ".classes";
        SharedPreferences sharedPreferencesM = m(context);
        int i2 = sharedPreferencesM.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + (-1));
        int i3 = 2;
        while (i3 <= i2) {
            C0082b c0082b = new C0082b(this.f3508d, str2 + i3 + ".zip");
            if (!c0082b.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + c0082b.getPath() + "'");
            }
            c0082b.f3513b = o(c0082b);
            long j2 = sharedPreferencesM.getLong(str + "dex.crc." + i3, -1L);
            long j3 = sharedPreferencesM.getLong(str + "dex.time." + i3, -1L);
            long jLastModified = c0082b.lastModified();
            if (j3 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesM;
                if (j2 == c0082b.f3513b) {
                    arrayList.add(c0082b);
                    i3++;
                    sharedPreferencesM = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + c0082b + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + jLastModified + ", expected crc: " + j2 + ", file crc: " + c0082b.f3513b);
        }
        return arrayList;
    }

    public final List<C0082b> s() {
        boolean z;
        String str = this.f3506b.getName() + ".classes";
        d();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f3506b);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i2 = 2;
            while (entry != null) {
                C0082b c0082b = new C0082b(this.f3508d, str + i2 + ".zip");
                arrayList.add(c0082b);
                Log.i("MultiDex", "Extraction is needed for file " + c0082b);
                int i3 = 0;
                boolean z2 = false;
                while (i3 < 3 && !z2) {
                    int i4 = i3 + 1;
                    l(zipFile, entry, c0082b, str);
                    try {
                        c0082b.f3513b = o(c0082b);
                        z = true;
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to read crc from " + c0082b.getAbsolutePath(), e2);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(c0082b.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(c0082b.length());
                    sb.append(" - crc: ");
                    sb.append(c0082b.f3513b);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        c0082b.delete();
                        if (c0082b.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c0082b.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i3 = i4;
                }
                if (!z2) {
                    throw new IOException("Could not create zip file " + c0082b.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
                i2++;
                entry = zipFile.getEntry("classes" + i2 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            return arrayList;
        } finally {
        }
    }
}

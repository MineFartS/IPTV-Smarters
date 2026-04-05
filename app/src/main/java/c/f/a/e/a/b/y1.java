package c.f.a.e.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15682a = new c.f.a.e.a.e.a("SliceMetadataManager");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15688g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15683b = new byte[8192];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15689h = -1;

    public y1(v vVar, String str, int i2, long j2, String str2) {
        this.f15684c = vVar;
        this.f15685d = str;
        this.f15686e = i2;
        this.f15687f = j2;
        this.f15688g = str2;
    }

    public final void a(String str, long j2, long j3, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f15689h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final void b(byte[] bArr, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f15689h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileB = this.f15684c.B(this.f15685d, this.f15686e, this.f15687f, this.f15688g);
            if (fileB.exists()) {
                fileB.delete();
            }
            fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    c.f.a.e.a.e.y.a(th, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(j().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f15689h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final void d(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f15689h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final x1 e() throws IOException {
        File fileA = this.f15684c.A(this.f15685d, this.f15686e, this.f15687f, this.f15688g);
        if (!fileA.exists()) {
            throw new k0("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new k0("Slice checkpoint file corrupt.");
            }
            try {
                int i2 = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j2 = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j3 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i3 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f15689h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new x1(i2, property, j2, j3, i3);
            } catch (NumberFormatException e2) {
                throw new k0("Slice checkpoint file corrupt.", e2);
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

    public final void f(InputStream inputStream, long j2) throws IOException {
        int i2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(j(), "rw");
        try {
            randomAccessFile.seek(j2);
            do {
                i2 = inputStream.read(this.f15683b);
                if (i2 > 0) {
                    randomAccessFile.write(this.f15683b, 0, i2);
                }
            } while (i2 == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final void g(byte[] bArr) {
        this.f15689h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f15689h))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e2) {
            throw new k0("Could not write metadata file.", e2);
        }
    }

    public final void h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f15689h++;
        FileOutputStream fileOutputStream = new FileOutputStream(j());
        try {
            fileOutputStream.write(bArr);
            int i2 = inputStream.read(this.f15683b);
            while (i2 > 0) {
                fileOutputStream.write(this.f15683b, 0, i2);
                i2 = inputStream.read(this.f15683b);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final void i(long j2, byte[] bArr, int i2, int i3) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(j(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final File j() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f15689h)));
    }

    public final int k() throws IOException {
        File fileA = this.f15684c.A(this.f15685d, this.f15686e, this.f15687f, this.f15688g);
        if (!fileA.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new k0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final boolean l() {
        File fileA = this.f15684c.A(this.f15685d, this.f15686e, this.f15687f, this.f15688g);
        if (!fileA.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileA);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f15682a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } finally {
            }
        } catch (IOException e2) {
            f15682a.b("Could not read checkpoint while checking if extraction finished. %s", e2);
            return false;
        }
    }

    public final void m(byte[] bArr, int i2) throws IOException {
        this.f15689h++;
        FileOutputStream fileOutputStream = new FileOutputStream(j());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.f.a.e.a.e.y.a(th, th2);
            }
            throw th;
        }
    }

    public final File n() {
        File fileC = this.f15684c.C(this.f15685d, this.f15686e, this.f15687f, this.f15688g);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        return fileC;
    }

    public final File o() throws IOException {
        File fileA = this.f15684c.A(this.f15685d, this.f15686e, this.f15687f, this.f15688g);
        fileA.getParentFile().mkdirs();
        fileA.createNewFile();
        return fileA;
    }
}

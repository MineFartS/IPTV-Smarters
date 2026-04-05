package c.f.a.b.j3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f9194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f9195b;

    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileOutputStream f9196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9197c = false;

        public a(File file) {
            this.f9196b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f9197c) {
                return;
            }
            this.f9197c = true;
            flush();
            try {
                this.f9196b.getFD().sync();
            } catch (IOException e2) {
                z.j("AtomicFile", "Failed to sync file descriptor:", e2);
            }
            this.f9196b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f9196b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.f9196b.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f9196b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f9196b.write(bArr, i2, i3);
        }
    }

    public h(File file) {
        this.f9194a = file;
        this.f9195b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.f9194a.delete();
        this.f9195b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f9195b.delete();
    }

    public boolean c() {
        return this.f9194a.exists() || this.f9195b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f9194a);
    }

    public final void e() {
        if (this.f9195b.exists()) {
            this.f9194a.delete();
            this.f9195b.renameTo(this.f9194a);
        }
    }

    public OutputStream f() throws IOException {
        if (this.f9194a.exists()) {
            if (this.f9195b.exists()) {
                this.f9194a.delete();
            } else if (!this.f9194a.renameTo(this.f9195b)) {
                z.i("AtomicFile", "Couldn't rename file " + this.f9194a + " to backup file " + this.f9195b);
            }
        }
        try {
            return new a(this.f9194a);
        } catch (FileNotFoundException e2) {
            File parentFile = this.f9194a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f9194a, e2);
            }
            try {
                return new a(this.f9194a);
            } catch (FileNotFoundException e3) {
                throw new IOException("Couldn't create " + this.f9194a, e3);
            }
        }
    }
}

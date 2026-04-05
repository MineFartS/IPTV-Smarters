package com.amazonaws.services.s3.internal;

import com.amazonaws.AbortedException;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.OnFileDelete;
import com.amazonaws.services.s3.UploadObjectObserver;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class MultiFileOutputStream extends OutputStream implements OnFileDelete {
    private static final int DEFAULT_PART_SIZE = 5242880;
    private static final int PART_BYTE = 5;
    private static final int SHIFT_VALUE = 20;
    private boolean closed;
    private int currFileBytesWritten;
    private long diskLimit;
    private Semaphore diskPermits;
    private int filesCreated;
    private final String namePrefix;
    private UploadObjectObserver observer;
    private FileOutputStream os;
    private long partSize;
    private final File root;
    private long totalBytesWritten;

    public MultiFileOutputStream() {
        this.partSize = 5242880L;
        this.diskLimit = Long.MAX_VALUE;
        this.root = new File(System.getProperty("java.io.tmpdir"));
        this.namePrefix = yyMMdd_hhmmss() + InstructionFileId.DOT + UUID.randomUUID();
    }

    public MultiFileOutputStream(File file, String str) {
        this.partSize = 5242880L;
        this.diskLimit = Long.MAX_VALUE;
        if (file == null || !file.isDirectory() || !file.canWrite()) {
            throw new IllegalArgumentException(file + " must be a writable directory");
        }
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Please specify a non-empty name prefix");
        }
        this.root = file;
        this.namePrefix = str;
    }

    private void blockIfNecessary() {
        Semaphore semaphore = this.diskPermits;
        if (semaphore == null || this.diskLimit == Long.MAX_VALUE) {
            return;
        }
        try {
            semaphore.acquire();
        } catch (InterruptedException e2) {
            throw new AbortedException(e2);
        }
    }

    private FileOutputStream fos() throws IOException {
        if (this.closed) {
            throw new IOException("Output stream is already closed");
        }
        FileOutputStream fileOutputStream = this.os;
        if (fileOutputStream == null || this.currFileBytesWritten >= this.partSize) {
            if (fileOutputStream != null) {
                fileOutputStream.close();
                this.observer.onPartCreate(new PartCreationEvent(getFile(this.filesCreated), this.filesCreated, false, this));
            }
            this.currFileBytesWritten = 0;
            this.filesCreated++;
            blockIfNecessary();
            File file = getFile(this.filesCreated);
            file.deleteOnExit();
            this.os = new FileOutputStream(file);
        }
        return this.os;
    }

    public static String yyMMdd_hhmmss() {
        return new SimpleDateFormat("yyMMdd-hhmmss").format(new Date());
    }

    public void cleanup() {
        for (int i2 = 0; i2 < getNumFilesWritten(); i2++) {
            File file = getFile(i2);
            if (file.exists() && !file.delete()) {
                LogFactory.getLog(getClass()).debug("Ignoring failure to delete file " + file);
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        FileOutputStream fileOutputStream = this.os;
        if (fileOutputStream != null) {
            fileOutputStream.close();
            File file = getFile(this.filesCreated);
            if (file.length() != 0) {
                this.observer.onPartCreate(new PartCreationEvent(getFile(this.filesCreated), this.filesCreated, true, this));
                return;
            }
            if (file.delete()) {
                return;
            }
            LogFactory.getLog(getClass()).debug("Ignoring failure to delete empty file " + file);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        FileOutputStream fileOutputStream = this.os;
        if (fileOutputStream != null) {
            fileOutputStream.flush();
        }
    }

    public long getDiskLimit() {
        return this.diskLimit;
    }

    public File getFile(int i2) {
        return new File(this.root, this.namePrefix + InstructionFileId.DOT + i2);
    }

    public String getNamePrefix() {
        return this.namePrefix;
    }

    public int getNumFilesWritten() {
        return this.filesCreated;
    }

    public long getPartSize() {
        return this.partSize;
    }

    public File getRoot() {
        return this.root;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public MultiFileOutputStream init(UploadObjectObserver uploadObjectObserver, long j2, long j3) {
        if (uploadObjectObserver == null) {
            throw new IllegalArgumentException("Observer must be specified");
        }
        this.observer = uploadObjectObserver;
        if (j3 >= (j2 << 1)) {
            this.partSize = j2;
            this.diskLimit = j3;
            int i2 = (int) (j3 / j2);
            this.diskPermits = i2 < 0 ? null : new Semaphore(i2);
            return this;
        }
        throw new IllegalArgumentException("Maximum temporary disk space must be at least twice as large as the part size: partSize=" + j2 + ", diskSize=" + j3);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // com.amazonaws.services.s3.OnFileDelete
    public void onFileDelete(FileDeletionEvent fileDeletionEvent) {
        Semaphore semaphore = this.diskPermits;
        if (semaphore != null) {
            semaphore.release();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        fos().write(i2);
        this.currFileBytesWritten++;
        this.totalBytesWritten++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        if (bArr.length == 0) {
            return;
        }
        fos().write(bArr);
        this.currFileBytesWritten += bArr.length;
        this.totalBytesWritten += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        if (bArr.length == 0) {
            return;
        }
        fos().write(bArr, i2, i3);
        this.currFileBytesWritten += i3;
        this.totalBytesWritten += (long) i3;
    }
}

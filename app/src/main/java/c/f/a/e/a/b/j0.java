package c.f.a.e.a.b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15494a = new c.f.a.e.a.e.a("ExtractChunkTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15495b = new byte[8192];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s2> f15497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s> f15498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f15499f;

    public j0(v vVar, c.f.a.e.a.e.z<s2> zVar, c.f.a.e.a.e.z<s> zVar2, o0 o0Var) {
        this.f15496c = vVar;
        this.f15497d = zVar;
        this.f15498e = zVar2;
        this.f15499f = o0Var;
    }

    public final void a(i0 i0Var) {
        InputStream sequenceInputStream;
        d2 d2VarD;
        File fileJ;
        long length;
        int iMin;
        int iMax;
        long j2;
        y1 y1Var = new y1(this.f15496c, i0Var.f15382b, i0Var.f15465c, i0Var.f15466d, i0Var.f15467e);
        File fileC = this.f15496c.C(i0Var.f15382b, i0Var.f15465c, i0Var.f15466d, i0Var.f15467e);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        try {
            InputStream inputStream = i0Var.f15473k;
            InputStream gZIPInputStream = i0Var.f15468f != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                if (i0Var.f15469g > 0) {
                    x1 x1VarE = y1Var.e();
                    int iE = x1VarE.e();
                    int i2 = i0Var.f15469g;
                    if (iE != i2 - 1) {
                        throw new k0(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i2), Integer.valueOf(x1VarE.e())), i0Var.f15381a);
                    }
                    int iA = x1VarE.a();
                    if (iA == 1) {
                        f15494a.a("Resuming zip entry from last chunk during file %s.", x1VarE.b());
                        File file = new File(x1VarE.b());
                        if (!file.exists()) {
                            throw new k0("Partial file specified in checkpoint does not exist. Corrupt directory.", i0Var.f15381a);
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.seek(x1VarE.c());
                        long jD = x1VarE.d();
                        while (true) {
                            iMin = (int) Math.min(jD, 8192L);
                            iMax = Math.max(gZIPInputStream.read(this.f15495b, 0, iMin), 0);
                            if (iMax > 0) {
                                randomAccessFile.write(this.f15495b, 0, iMax);
                            }
                            j2 = jD - ((long) iMax);
                            if (j2 <= 0 || iMax <= 0) {
                                break;
                            } else {
                                jD = j2;
                            }
                        }
                        long length2 = randomAccessFile.length();
                        randomAccessFile.close();
                        if (iMax != iMin) {
                            f15494a.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                            y1Var.a(file.getCanonicalPath(), length2, j2, i0Var.f15469g);
                        }
                        sequenceInputStream = gZIPInputStream;
                    } else if (iA == 2) {
                        f15494a.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                        File fileB = this.f15496c.B(i0Var.f15382b, i0Var.f15465c, i0Var.f15466d, i0Var.f15467e);
                        if (!fileB.exists()) {
                            throw new k0("Checkpoint extension file not found.", i0Var.f15381a);
                        }
                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileB), gZIPInputStream);
                    } else {
                        if (iA != 3) {
                            throw new k0(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(x1VarE.a())), i0Var.f15381a);
                        }
                        f15494a.a("Resuming central directory from last chunk.", new Object[0]);
                        y1Var.f(gZIPInputStream, x1VarE.c());
                        if (!i0Var.a()) {
                            throw new k0("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", i0Var.f15381a);
                        }
                    }
                    sequenceInputStream = null;
                } else {
                    sequenceInputStream = gZIPInputStream;
                }
                if (sequenceInputStream != null) {
                    d0 d0Var = new d0(sequenceInputStream);
                    File fileB2 = b(i0Var);
                    do {
                        d2VarD = d0Var.d();
                        if (!d2VarD.g() && !d0Var.l()) {
                            if (!d2VarD.c() || d2VarD.b()) {
                                y1Var.h(d2VarD.i(), d0Var);
                            } else {
                                y1Var.g(d2VarD.i());
                                File file2 = new File(fileB2, d2VarD.d());
                                file2.getParentFile().mkdirs();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                int i3 = d0Var.read(this.f15495b);
                                while (i3 > 0) {
                                    fileOutputStream.write(this.f15495b, 0, i3);
                                    i3 = d0Var.read(this.f15495b);
                                }
                                fileOutputStream.close();
                            }
                        }
                        if (d0Var.i()) {
                            break;
                        }
                    } while (!d0Var.l());
                    if (d0Var.l()) {
                        f15494a.a("Writing central directory metadata.", new Object[0]);
                        y1Var.h(d2VarD.i(), sequenceInputStream);
                    }
                    if (!i0Var.a()) {
                        if (d2VarD.g()) {
                            f15494a.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            y1Var.b(d2VarD.i(), i0Var.f15469g);
                        } else if (d0Var.l()) {
                            f15494a.a("Writing slice checkpoint for central directory.", new Object[0]);
                            y1Var.c(i0Var.f15469g);
                        } else {
                            if (d2VarD.f() == 0) {
                                f15494a.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileJ = new File(b(i0Var), d2VarD.d());
                                length = d2VarD.e() - d0Var.m();
                                if (fileJ.length() != length) {
                                    throw new k0("Partial file is of unexpected size.");
                                }
                            } else {
                                f15494a.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileJ = y1Var.j();
                                length = fileJ.length();
                            }
                            y1Var.a(fileJ.getCanonicalPath(), length, d0Var.m(), i0Var.f15469g);
                        }
                    }
                }
                gZIPInputStream.close();
                if (i0Var.a()) {
                    try {
                        y1Var.d(i0Var.f15469g);
                    } catch (IOException e2) {
                        f15494a.b("Writing extraction finished checkpoint failed with %s.", e2.getMessage());
                        throw new k0("Writing extraction finished checkpoint failed.", e2, i0Var.f15381a);
                    }
                }
                f15494a.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0Var.f15469g), i0Var.f15467e, i0Var.f15382b, Integer.valueOf(i0Var.f15381a));
                this.f15497d.a().a(i0Var.f15381a, i0Var.f15382b, i0Var.f15467e, i0Var.f15469g);
                try {
                    i0Var.f15473k.close();
                } catch (IOException unused) {
                    f15494a.e("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(i0Var.f15469g), i0Var.f15467e, i0Var.f15382b);
                }
                if (i0Var.f15472j == 3) {
                    s sVarA = this.f15498e.a();
                    String str = i0Var.f15382b;
                    long j3 = i0Var.f15471i;
                    sVarA.f(AssetPackState.b(str, 3, 0, j3, j3, this.f15499f.c(str, i0Var), 1));
                }
            } finally {
            }
        } catch (IOException e3) {
            f15494a.b("IOException during extraction %s.", e3.getMessage());
            throw new k0(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0Var.f15469g), i0Var.f15467e, i0Var.f15382b, Integer.valueOf(i0Var.f15381a)), e3, i0Var.f15381a);
        }
    }

    public final File b(i0 i0Var) {
        File fileV = this.f15496c.v(i0Var.f15382b, i0Var.f15465c, i0Var.f15466d, i0Var.f15467e);
        if (!fileV.exists()) {
            fileV.mkdirs();
        }
        return fileV;
    }
}

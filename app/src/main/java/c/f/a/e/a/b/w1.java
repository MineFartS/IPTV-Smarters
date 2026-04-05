package c.f.a.e.a.b;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15659a = new c.f.a.e.a.e.a("PatchSliceTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s2> f15661c;

    public w1(v vVar, c.f.a.e.a.e.z<s2> zVar) {
        this.f15660b = vVar;
        this.f15661c = zVar;
    }

    public final void a(v1 v1Var) {
        File fileT = this.f15660b.t(v1Var.f15382b, v1Var.f15641c, v1Var.f15642d);
        File file = new File(this.f15660b.u(v1Var.f15382b, v1Var.f15641c, v1Var.f15642d), v1Var.f15646h);
        try {
            InputStream gZIPInputStream = v1Var.f15648j;
            if (v1Var.f15645g == 2) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream, 8192);
            }
            try {
                x xVar = new x(fileT, file);
                File fileV = this.f15660b.v(v1Var.f15382b, v1Var.f15643e, v1Var.f15644f, v1Var.f15646h);
                if (!fileV.exists()) {
                    fileV.mkdirs();
                }
                y1 y1Var = new y1(this.f15660b, v1Var.f15382b, v1Var.f15643e, v1Var.f15644f, v1Var.f15646h);
                c.f.a.e.a.e.n.e(xVar, gZIPInputStream, new n0(fileV, y1Var), v1Var.f15647i);
                y1Var.d(0);
                gZIPInputStream.close();
                f15659a.d("Patching and extraction finished for slice %s of pack %s.", v1Var.f15646h, v1Var.f15382b);
                this.f15661c.a().a(v1Var.f15381a, v1Var.f15382b, v1Var.f15646h, 0);
                try {
                    v1Var.f15648j.close();
                } catch (IOException unused) {
                    f15659a.e("Could not close file for slice %s of pack %s.", v1Var.f15646h, v1Var.f15382b);
                }
            } finally {
            }
        } catch (IOException e2) {
            f15659a.b("IOException during patching %s.", e2.getMessage());
            throw new k0(String.format("Error patching slice %s of pack %s.", v1Var.f15646h, v1Var.f15382b), e2, v1Var.f15381a);
        }
    }
}

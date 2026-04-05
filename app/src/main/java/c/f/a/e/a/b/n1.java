package c.f.a.e.a.b;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15555a = new c.f.a.e.a.e.a("MergeSliceTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15556b;

    public n1(v vVar) {
        this.f15556b = vVar;
    }

    public static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String strValueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 51);
                sb.append("File clashing with existing file from other slice: ");
                sb.append(strValueOf);
                throw new k0(sb.toString());
            }
            if (file.renameTo(file2)) {
                return;
            }
            String strValueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 21);
            sb2.append("Unable to move file: ");
            sb2.append(strValueOf2);
            throw new k0(sb2.toString());
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String strValueOf3 = String.valueOf(file);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 28);
        sb3.append("Unable to delete directory: ");
        sb3.append(strValueOf3);
        throw new k0(sb3.toString());
    }

    public final void a(m1 m1Var) {
        File fileW = this.f15556b.w(m1Var.f15382b, m1Var.f15539c, m1Var.f15540d, m1Var.f15541e);
        if (!fileW.exists()) {
            throw new k0(String.format("Cannot find verified files for slice %s.", m1Var.f15541e), m1Var.f15381a);
        }
        File fileX = this.f15556b.x(m1Var.f15382b, m1Var.f15539c, m1Var.f15540d);
        if (!fileX.exists()) {
            fileX.mkdirs();
        }
        b(fileW, fileX);
        try {
            this.f15556b.z(m1Var.f15382b, m1Var.f15539c, m1Var.f15540d, this.f15556b.y(m1Var.f15382b, m1Var.f15539c, m1Var.f15540d) + 1);
        } catch (IOException e2) {
            f15555a.b("Writing merge checkpoint failed with %s.", e2.getMessage());
            throw new k0("Writing merge checkpoint failed.", e2, m1Var.f15381a);
        }
    }
}

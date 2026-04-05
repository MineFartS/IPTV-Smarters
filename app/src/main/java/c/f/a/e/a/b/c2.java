package c.f.a.e.a.b;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15383a = new c.f.a.e.a.e.a("VerifySliceTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15384b;

    public c2(v vVar) {
        this.f15384b = vVar;
    }

    public final void a(b2 b2Var) {
        File fileV = this.f15384b.v(b2Var.f15382b, b2Var.f15376c, b2Var.f15377d, b2Var.f15378e);
        if (!fileV.exists()) {
            throw new k0(String.format("Cannot find unverified files for slice %s.", b2Var.f15378e), b2Var.f15381a);
        }
        b(b2Var, fileV);
        File fileW = this.f15384b.w(b2Var.f15382b, b2Var.f15376c, b2Var.f15377d, b2Var.f15378e);
        if (!fileW.exists()) {
            fileW.mkdirs();
        }
        if (!fileV.renameTo(fileW)) {
            throw new k0(String.format("Failed to move slice %s after verification.", b2Var.f15378e), b2Var.f15381a);
        }
    }

    public final void b(b2 b2Var, File file) {
        try {
            File fileC = this.f15384b.C(b2Var.f15382b, b2Var.f15376c, b2Var.f15377d, b2Var.f15378e);
            if (!fileC.exists()) {
                throw new k0(String.format("Cannot find metadata files for slice %s.", b2Var.f15378e), b2Var.f15381a);
            }
            try {
                if (!j1.a(a2.a(file, fileC)).equals(b2Var.f15379f)) {
                    throw new k0(String.format("Verification failed for slice %s.", b2Var.f15378e), b2Var.f15381a);
                }
                f15383a.d("Verification of slice %s of pack %s successful.", b2Var.f15378e, b2Var.f15382b);
            } catch (IOException e2) {
                throw new k0(String.format("Could not digest file during verification for slice %s.", b2Var.f15378e), e2, b2Var.f15381a);
            } catch (NoSuchAlgorithmException e3) {
                throw new k0("SHA256 algorithm not supported.", e3, b2Var.f15381a);
            }
        } catch (IOException e4) {
            throw new k0(String.format("Could not reconstruct slice archive during verification for slice %s.", b2Var.f15378e), e4, b2Var.f15381a);
        }
    }
}

package c.f.a.b.z2.f0;

import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import c.f.a.b.t2.m;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.f0.e;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10728b = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10731e;

    public b(a0 a0Var) {
        super(a0Var);
    }

    @Override // c.f.a.b.z2.f0.e
    public boolean b(i0 i0Var) throws e.a {
        k1.b bVarF0;
        if (this.f10729c) {
            i0Var.Q(1);
        } else {
            int iD = i0Var.D();
            int i2 = (iD >> 4) & 15;
            this.f10731e = i2;
            if (i2 == 2) {
                bVarF0 = new k1.b().e0("audio/mpeg").H(1).f0(f10728b[(iD >> 2) & 3]);
            } else if (i2 == 7 || i2 == 8) {
                bVarF0 = new k1.b().e0(i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000);
            } else {
                if (i2 != 10) {
                    throw new e.a("Audio format not supported: " + this.f10731e);
                }
                this.f10729c = true;
            }
            this.f10750a.e(bVarF0.E());
            this.f10730d = true;
            this.f10729c = true;
        }
        return true;
    }

    @Override // c.f.a.b.z2.f0.e
    public boolean c(i0 i0Var, long j2) {
        if (this.f10731e == 2) {
            int iA = i0Var.a();
            this.f10750a.c(i0Var, iA);
            this.f10750a.d(j2, 1, iA, 0, null);
            return true;
        }
        int iD = i0Var.D();
        if (iD != 0 || this.f10730d) {
            if (this.f10731e == 10 && iD != 1) {
                return false;
            }
            int iA2 = i0Var.a();
            this.f10750a.c(i0Var, iA2);
            this.f10750a.d(j2, 1, iA2, 0, null);
            return true;
        }
        int iA3 = i0Var.a();
        byte[] bArr = new byte[iA3];
        i0Var.j(bArr, 0, iA3);
        m.b bVarG = m.g(bArr);
        this.f10750a.e(new k1.b().e0("audio/mp4a-latm").I(bVarG.f10114c).H(bVarG.f10113b).f0(bVarG.f10112a).T(Collections.singletonList(bArr)).E());
        this.f10730d = true;
        return false;
    }
}

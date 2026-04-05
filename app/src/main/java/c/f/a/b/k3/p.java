package c.f.a.b.k3;

import c.f.a.b.j3.i0;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9496c;

    public p(int i2, int i3, String str) {
        this.f9494a = i2;
        this.f9495b = i3;
        this.f9496c = str;
    }

    public static p a(i0 i0Var) {
        String str;
        i0Var.Q(2);
        int iD = i0Var.D();
        int i2 = iD >> 1;
        int iD2 = ((i0Var.D() >> 3) & 31) | ((iD & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(iD2 >= 10 ? InstructionFileId.DOT : ".0");
        sb.append(iD2);
        return new p(i2, iD2, sb.toString());
    }
}

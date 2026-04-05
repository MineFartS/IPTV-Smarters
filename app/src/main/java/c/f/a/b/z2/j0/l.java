package c.f.a.b.z2.j0;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.z;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f10983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f10985c;

        public a(UUID uuid, int i2, byte[] bArr) {
            this.f10983a = uuid;
            this.f10984b = i2;
            this.f10985c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        i0 i0Var = new i0(bArr);
        if (i0Var.f() < 32) {
            return null;
        }
        i0Var.P(0);
        if (i0Var.n() != i0Var.a() + 4 || i0Var.n() != 1886614376) {
            return null;
        }
        int iC = e.c(i0Var.n());
        if (iC > 1) {
            z.i("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(i0Var.w(), i0Var.w());
        if (iC == 1) {
            i0Var.Q(i0Var.H() * 16);
        }
        int iH = i0Var.H();
        if (iH != i0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iH];
        i0Var.j(bArr2, 0, iH);
        return new a(uuid, iC, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f10983a)) {
            return aVarD.f10985c;
        }
        z.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f10983a + InstructionFileId.DOT);
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f10983a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f10984b;
    }
}

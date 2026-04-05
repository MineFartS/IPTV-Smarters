package c.f.a.c.j.c;

import c.f.a.c.j.c.d9;
import c.f.a.c.j.c.f9;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d9<MessageType extends d9<MessageType, BuilderType>, BuilderType extends f9<MessageType, BuilderType>> implements bc {
    public int zzbmy = 0;

    public final byte[] d() {
        try {
            byte[] bArr = new byte[c()];
            z9 z9VarF = z9.f(bArr);
            b(z9VarF);
            z9VarF.m0();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    @Override // c.f.a.c.j.c.bc
    public final m9 f() {
        try {
            u9 u9VarH = m9.h(c());
            b(u9VarH.b());
            return u9VarH.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public void g(int i2) {
        throw new UnsupportedOperationException();
    }

    public int h() {
        throw new UnsupportedOperationException();
    }
}

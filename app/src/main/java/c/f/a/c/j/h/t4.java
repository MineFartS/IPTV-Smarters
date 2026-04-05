package c.f.a.c.j.h;

import c.f.a.c.j.h.s4;
import c.f.a.c.j.h.t4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t4<MessageType extends t4<MessageType, BuilderType>, BuilderType extends s4<MessageType, BuilderType>> implements q7 {
    public int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void j(Iterable<T> iterable, List<? super T> list) {
        u6.a(iterable);
        if (iterable instanceof a7) {
            List<?> listJ = ((a7) iterable).j();
            a7 a7Var = (a7) list;
            int size = list.size();
            for (Object obj : listJ) {
                if (obj == null) {
                    int size2 = a7Var.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = a7Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        a7Var.remove(size3);
                    }
                } else if (obj instanceof l5) {
                    a7Var.r((l5) obj);
                } else {
                    a7Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof y7) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5 - size4);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(t);
            }
        }
    }

    public final byte[] d() {
        try {
            byte[] bArr = new byte[f()];
            t5 t5VarZ = t5.z(bArr);
            b(t5VarZ);
            t5VarZ.e();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    @Override // c.f.a.c.j.h.q7
    public final l5 e() {
        try {
            h5 h5VarB = l5.B(f());
            b(h5VarB.b());
            return h5VarB.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public int h() {
        throw null;
    }

    public void i(int i2) {
        throw null;
    }
}

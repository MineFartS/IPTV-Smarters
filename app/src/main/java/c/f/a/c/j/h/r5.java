package c.f.a.c.j.h;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class r5 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public r5(String str, Throwable th) {
        String strValueOf = String.valueOf(str);
        super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
    }

    public r5(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}

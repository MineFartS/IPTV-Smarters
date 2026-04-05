package c.f.a.c.j.h;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class j4 {
    public static <T> f4<T> a(f4<T> f4Var) {
        return ((f4Var instanceof h4) || (f4Var instanceof g4)) ? f4Var : f4Var instanceof Serializable ? new g4(f4Var) : new h4(f4Var);
    }

    public static <T> f4<T> b(@NullableDecl T t) {
        return new i4(t);
    }
}

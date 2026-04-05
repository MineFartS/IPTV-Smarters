package h.l.c;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<R> implements f<R>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30384b;

    public h(int i2) {
        this.f30384b = i2;
    }

    @NotNull
    public String toString() {
        String strC = l.c(this);
        g.b(strC, "Reflection.renderLambdaToString(this)");
        return strC;
    }
}

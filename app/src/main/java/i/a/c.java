package i.a;

import h.k.d;
import h.l.c.g;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c {
    public static final void a(@NotNull d dVar, @Nullable CancellationException cancellationException) {
        g.c(dVar, "$this$cancel");
        a aVar = (a) dVar.get(a.e0);
        if (aVar != null) {
            aVar.a(cancellationException);
        }
    }

    public static /* synthetic */ void b(d dVar, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        b.a(dVar, cancellationException);
    }
}

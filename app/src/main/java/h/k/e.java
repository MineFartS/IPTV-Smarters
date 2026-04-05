package h.k;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import h.k.d;
import h.l.b.p;
import h.l.c.g;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements d, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f30371b = new e();

    @Override // h.k.d
    public <R> R fold(R r, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
        g.c(pVar, "operation");
        return r;
    }

    @Override // h.k.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        g.c(cVar, TransferTable.COLUMN_KEY);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // h.k.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        g.c(cVar, TransferTable.COLUMN_KEY);
        return this;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}

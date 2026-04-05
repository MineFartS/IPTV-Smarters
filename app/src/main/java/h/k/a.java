package h.k;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import h.k.d;
import h.l.b.p;
import h.l.c.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements d.b {

    @NotNull
    private final d.c<?> key;

    public a(@NotNull d.c<?> cVar) {
        g.c(cVar, TransferTable.COLUMN_KEY);
        this.key = cVar;
    }

    @Override // h.k.d
    public <R> R fold(R r, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
        g.c(pVar, "operation");
        return (R) d.b.a.a(this, r, pVar);
    }

    @Override // h.k.d.b, h.k.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        g.c(cVar, TransferTable.COLUMN_KEY);
        return (E) d.b.a.b(this, cVar);
    }

    @Override // h.k.d.b
    @NotNull
    public d.c<?> getKey() {
        return this.key;
    }

    @Override // h.k.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        g.c(cVar, TransferTable.COLUMN_KEY);
        return d.b.a.c(this, cVar);
    }

    @NotNull
    public d plus(@NotNull d dVar) {
        g.c(dVar, "context");
        return d.b.a.d(this, dVar);
    }
}

package h.k;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import h.k.c;
import h.l.b.p;
import h.l.c.g;
import h.l.c.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: h.k.d$a$a, reason: collision with other inner class name */
        public static final class C0306a extends h implements p<d, b, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0306a f30370c = new C0306a();

            public C0306a() {
                super(2);
            }

            @Override // h.l.b.p
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d a(@NotNull d dVar, @NotNull b bVar) {
                h.k.b bVar2;
                g.c(dVar, "acc");
                g.c(bVar, "element");
                d dVarMinusKey = dVar.minusKey(bVar.getKey());
                e eVar = e.f30371b;
                if (dVarMinusKey == eVar) {
                    return bVar;
                }
                c.a aVar = h.k.c.c0;
                h.k.c cVar = (h.k.c) dVarMinusKey.get(aVar);
                if (cVar == null) {
                    bVar2 = new h.k.b(dVarMinusKey, bVar);
                } else {
                    d dVarMinusKey2 = dVarMinusKey.minusKey(aVar);
                    if (dVarMinusKey2 == eVar) {
                        return new h.k.b(bVar, cVar);
                    }
                    bVar2 = new h.k.b(new h.k.b(dVarMinusKey2, bVar), cVar);
                }
                return bVar2;
            }
        }

        @NotNull
        public static d a(d dVar, @NotNull d dVar2) {
            g.c(dVar2, "context");
            return dVar2 == e.f30371b ? dVar : (d) dVar2.fold(dVar, C0306a.f30370c);
        }
    }

    public interface b extends d {

        public static final class a {
            public static <R> R a(b bVar, R r, @NotNull p<? super R, ? super b, ? extends R> pVar) {
                g.c(pVar, "operation");
                return pVar.a(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends b> E b(b bVar, @NotNull c<E> cVar) {
                g.c(cVar, TransferTable.COLUMN_KEY);
                if (g.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            @NotNull
            public static d c(b bVar, @NotNull c<?> cVar) {
                g.c(cVar, TransferTable.COLUMN_KEY);
                return g.a(bVar.getKey(), cVar) ? e.f30371b : bVar;
            }

            @NotNull
            public static d d(b bVar, @NotNull d dVar) {
                g.c(dVar, "context");
                return a.a(bVar, dVar);
            }
        }

        @Override // h.k.d
        @Nullable
        <E extends b> E get(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r, @NotNull p<? super R, ? super b, ? extends R> pVar);

    @Nullable
    <E extends b> E get(@NotNull c<E> cVar);

    @NotNull
    d minusKey(@NotNull c<?> cVar);
}

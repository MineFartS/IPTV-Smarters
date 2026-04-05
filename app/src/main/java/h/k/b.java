package h.k;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import h.k.d;
import h.l.b.p;
import h.l.c.g;
import h.l.c.h;
import java.io.Serializable;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f30366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.b f30367c;

    public static final class a extends h implements p<String, d.b, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f30368c = new a();

        public a() {
            super(2);
        }

        @Override // h.l.b.p
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String a(@NotNull String str, @NotNull d.b bVar) {
            g.c(str, "acc");
            g.c(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public b(@NotNull d dVar, @NotNull d.b bVar) {
        g.c(dVar, "left");
        g.c(bVar, "element");
        this.f30366b = dVar;
        this.f30367c = bVar;
    }

    public final boolean b(d.b bVar) {
        return g.a(get(bVar.getKey()), bVar);
    }

    public final boolean c(b bVar) {
        while (b(bVar.f30367c)) {
            d dVar = bVar.f30366b;
            if (!(dVar instanceof b)) {
                if (dVar != null) {
                    return b((d.b) dVar);
                }
                throw new h.h("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
            bVar = (b) dVar;
        }
        return false;
    }

    public final int d() {
        int i2 = 2;
        b bVar = this;
        while (true) {
            d dVar = bVar.f30366b;
            if (!(dVar instanceof b)) {
                dVar = null;
            }
            bVar = (b) dVar;
            if (bVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.d() != d() || !bVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // h.k.d
    public <R> R fold(R r, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
        g.c(pVar, "operation");
        return pVar.a((Object) this.f30366b.fold(r, pVar), this.f30367c);
    }

    @Override // h.k.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        g.c(cVar, TransferTable.COLUMN_KEY);
        b bVar = this;
        while (true) {
            E e2 = (E) bVar.f30367c.get(cVar);
            if (e2 != null) {
                return e2;
            }
            d dVar = bVar.f30366b;
            if (!(dVar instanceof b)) {
                return (E) dVar.get(cVar);
            }
            bVar = (b) dVar;
        }
    }

    public int hashCode() {
        return this.f30366b.hashCode() + this.f30367c.hashCode();
    }

    @Override // h.k.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        g.c(cVar, TransferTable.COLUMN_KEY);
        if (this.f30367c.get(cVar) != null) {
            return this.f30366b;
        }
        d dVarMinusKey = this.f30366b.minusKey(cVar);
        return dVarMinusKey == this.f30366b ? this : dVarMinusKey == e.f30371b ? this.f30367c : new b(dVarMinusKey, this.f30367c);
    }

    @NotNull
    public String toString() {
        return "[" + ((String) fold(BuildConfig.FLAVOR, a.f30368c)) + "]";
    }
}

package c.f.a.c.j.c;

import c.f.a.c.f.o.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class y<R extends c.f.a.c.f.o.j> extends BasePendingResult<R> {
    public final x<R, Status> r;

    public y(x<R, Status> xVar) {
        super(null);
        this.r = xVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R e(Status status) {
        return (R) this.r.a(status);
    }
}

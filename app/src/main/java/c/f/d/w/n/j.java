package c.f.d.w.n;

import c.f.d.r;
import c.f.d.t;
import c.f.d.u;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends t<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16583a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateFormat f16584b = new SimpleDateFormat("MMM d, yyyy");

    public class a implements u {
        @Override // c.f.d.u
        public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // c.f.d.t
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Date b(c.f.d.y.a aVar) {
        if (aVar.B0() == c.f.d.y.b.NULL) {
            aVar.c0();
            return null;
        }
        try {
            return new Date(this.f16584b.parse(aVar.w0()).getTime());
        } catch (ParseException e2) {
            throw new r(e2);
        }
    }

    @Override // c.f.d.t
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(c.f.d.y.c cVar, Date date) {
        cVar.E0(date == null ? null : this.f16584b.format((java.util.Date) date));
    }
}

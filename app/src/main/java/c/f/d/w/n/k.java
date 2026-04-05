package c.f.d.w.n;

import c.f.d.r;
import c.f.d.t;
import c.f.d.u;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends t<Time> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16585a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateFormat f16586b = new SimpleDateFormat("hh:mm:ss a");

    public class a implements u {
        @Override // c.f.d.u
        public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // c.f.d.t
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time b(c.f.d.y.a aVar) {
        if (aVar.B0() == c.f.d.y.b.NULL) {
            aVar.c0();
            return null;
        }
        try {
            return new Time(this.f16586b.parse(aVar.w0()).getTime());
        } catch (ParseException e2) {
            throw new r(e2);
        }
    }

    @Override // c.f.d.t
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(c.f.d.y.c cVar, Time time) {
        cVar.E0(time == null ? null : this.f16586b.format((Date) time));
    }
}

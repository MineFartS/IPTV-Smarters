package c.f.d.w.n;

import c.f.d.r;
import c.f.d.t;
import c.f.d.u;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends t<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16551a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DateFormat> f16552b;

    public class a implements u {
        @Override // c.f.d.u
        public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f16552b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (c.f.d.w.e.e()) {
            arrayList.add(c.f.d.w.j.c(2, 2));
        }
    }

    public final synchronized Date e(String str) {
        Iterator<DateFormat> it = this.f16552b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return c.f.d.w.n.o.a.c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new r(str, e2);
        }
    }

    @Override // c.f.d.t
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(c.f.d.y.a aVar) throws IOException {
        if (aVar.B0() != c.f.d.y.b.NULL) {
            return e(aVar.w0());
        }
        aVar.c0();
        return null;
    }

    @Override // c.f.d.t
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void d(c.f.d.y.c cVar, Date date) {
        if (date == null) {
            cVar.v();
        } else {
            cVar.E0(this.f16552b.get(0).format(date));
        }
    }
}

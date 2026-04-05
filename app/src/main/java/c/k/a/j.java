package c.k.a;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f18226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList<i> f18229d = new LinkedList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f18230e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), c.k.a.y.h.r("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f18231f = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(2);
            synchronized (j.this) {
                ListIterator listIterator = j.this.f18229d.listIterator(j.this.f18229d.size());
                int i2 = 0;
                while (listIterator.hasPrevious()) {
                    i iVar = (i) listIterator.previous();
                    if (!iVar.j() || iVar.l(j.this.f18228c)) {
                        listIterator.remove();
                        arrayList.add(iVar);
                        if (arrayList.size() == 2) {
                            break;
                        }
                    } else if (iVar.m()) {
                        i2++;
                    }
                }
                ListIterator listIterator2 = j.this.f18229d.listIterator(j.this.f18229d.size());
                while (listIterator2.hasPrevious() && i2 > j.this.f18227b) {
                    i iVar2 = (i) listIterator2.previous();
                    if (iVar2.m()) {
                        arrayList.add(iVar2);
                        listIterator2.remove();
                        i2--;
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c.k.a.y.h.d(((i) it.next()).h());
            }
        }
    }

    static {
        j jVar;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long j2 = property2 != null ? Long.parseLong(property2) : 300000L;
        if (property == null || Boolean.parseBoolean(property)) {
            jVar = property3 != null ? new j(Integer.parseInt(property3), j2) : new j(5, j2);
        } else {
            jVar = new j(0, j2);
        }
        f18226a = jVar;
    }

    public j(int i2, long j2) {
        this.f18227b = i2;
        this.f18228c = j2 * 1000 * 1000;
    }

    public static j e() {
        return f18226a;
    }

    public synchronized i d(c.k.a.a aVar) {
        i iVar;
        iVar = null;
        LinkedList<i> linkedList = this.f18229d;
        ListIterator<i> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            i iVarPrevious = listIterator.previous();
            if (iVarPrevious.g().a().equals(aVar) && iVarPrevious.j() && System.nanoTime() - iVarPrevious.e() < this.f18228c) {
                listIterator.remove();
                if (!iVarPrevious.o()) {
                    try {
                        c.k.a.y.f.e().i(iVarPrevious.h());
                    } catch (SocketException e2) {
                        c.k.a.y.h.d(iVarPrevious.h());
                        c.k.a.y.f.e().h("Unable to tagSocket(): " + e2);
                    }
                }
                iVar = iVarPrevious;
                break;
            }
        }
        if (iVar != null && iVar.o()) {
            this.f18229d.addFirst(iVar);
        }
        this.f18230e.execute(this.f18231f);
        return iVar;
    }

    public void f(i iVar) {
        if (!iVar.o() && iVar.a()) {
            if (!iVar.j()) {
                c.k.a.y.h.d(iVar.h());
                return;
            }
            try {
                c.k.a.y.f.e().k(iVar.h());
                synchronized (this) {
                    this.f18229d.addFirst(iVar);
                    iVar.i();
                    iVar.s();
                }
                this.f18230e.execute(this.f18231f);
            } catch (SocketException e2) {
                c.k.a.y.f.e().h("Unable to untagSocket(): " + e2);
                c.k.a.y.h.d(iVar.h());
            }
        }
    }

    public void g(i iVar) {
        if (!iVar.o()) {
            throw new IllegalArgumentException();
        }
        this.f18230e.execute(this.f18231f);
        if (iVar.j()) {
            synchronized (this) {
                this.f18229d.addFirst(iVar);
            }
        }
    }
}

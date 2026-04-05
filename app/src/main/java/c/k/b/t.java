package c.k.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import c.k.b.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f18744a = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile t f18745b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f18746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f18747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f18748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<y> f18749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f18750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f18751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.k.b.d f18752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f18753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<Object, c.k.b.a> f18754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<ImageView, h> f18755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ReferenceQueue<Object> f18756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bitmap.Config f18757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18758o;
    public volatile boolean p;
    public boolean q;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 3) {
                c.k.b.a aVar = (c.k.b.a) message.obj;
                if (aVar.g().p) {
                    g0.v("Main", "canceled", aVar.f18626b.d(), "target got garbage collected");
                }
                aVar.f18625a.b(aVar.k());
                return;
            }
            int i3 = 0;
            if (i2 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i3 < size) {
                    c.k.b.c cVar = (c.k.b.c) list.get(i3);
                    cVar.f18676g.e(cVar);
                    i3++;
                }
                return;
            }
            if (i2 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i3 < size2) {
                c.k.b.a aVar2 = (c.k.b.a) list2.get(i3);
                aVar2.f18625a.n(aVar2);
                i3++;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f18760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ExecutorService f18761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.k.b.d f18762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f18763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g f18764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<y> f18765g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Bitmap.Config f18766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f18767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f18768j;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f18759a = context.getApplicationContext();
        }

        public t a() {
            Context context = this.f18759a;
            if (this.f18760b == null) {
                this.f18760b = g0.g(context);
            }
            if (this.f18762d == null) {
                this.f18762d = new m(context);
            }
            if (this.f18761c == null) {
                this.f18761c = new v();
            }
            if (this.f18764f == null) {
                this.f18764f = g.f18773a;
            }
            a0 a0Var = new a0(this.f18762d);
            return new t(context, new i(context, this.f18761c, t.f18744a, this.f18760b, this.f18762d, a0Var), this.f18762d, this.f18763e, this.f18764f, this.f18765g, a0Var, this.f18766h, this.f18767i, this.f18768j);
        }

        public b b(j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f18760b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f18760b = jVar;
            return this;
        }

        public b c(d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f18763e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f18763e = dVar;
            return this;
        }
    }

    public static class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReferenceQueue<Object> f18769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f18770c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Exception f18771b;

            public a(Exception exc) {
                this.f18771b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f18771b);
            }
        }

        public c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f18769b = referenceQueue;
            this.f18770c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0248a c0248a = (a.C0248a) this.f18769b.remove(1000L);
                    Message messageObtainMessage = this.f18770c.obtainMessage();
                    if (c0248a != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c0248a.f18637a;
                        this.f18770c.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.f18770c.post(new a(e2));
                    return;
                }
            }
        }
    }

    public interface d {
        void a(t tVar, Uri uri, Exception exc);
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        public final int debugColor;

        e(int i2) {
            this.debugColor = i2;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f18773a = new a();

        public static class a implements g {
            @Override // c.k.b.t.g
            public w a(w wVar) {
                return wVar;
            }
        }

        w a(w wVar);
    }

    public t(Context context, i iVar, c.k.b.d dVar, d dVar2, g gVar, List<y> list, a0 a0Var, Bitmap.Config config, boolean z, boolean z2) {
        this.f18750g = context;
        this.f18751h = iVar;
        this.f18752i = dVar;
        this.f18746c = dVar2;
        this.f18747d = gVar;
        this.f18757n = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new c.k.b.f(context));
        arrayList.add(new o(context));
        arrayList.add(new c.k.b.g(context));
        arrayList.add(new c.k.b.b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f18705d, a0Var));
        this.f18749f = Collections.unmodifiableList(arrayList);
        this.f18753j = a0Var;
        this.f18754k = new WeakHashMap();
        this.f18755l = new WeakHashMap();
        this.f18758o = z;
        this.p = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f18756m = referenceQueue;
        c cVar = new c(referenceQueue, f18744a);
        this.f18748e = cVar;
        cVar.start();
    }

    public static t q(Context context) {
        if (f18745b == null) {
            synchronized (t.class) {
                if (f18745b == null) {
                    f18745b = new b(context).a();
                }
            }
        }
        return f18745b;
    }

    public final void b(Object obj) {
        g0.c();
        c.k.b.a aVarRemove = this.f18754k.remove(obj);
        if (aVarRemove != null) {
            aVarRemove.a();
            this.f18751h.c(aVarRemove);
        }
        if (obj instanceof ImageView) {
            h hVarRemove = this.f18755l.remove((ImageView) obj);
            if (hVarRemove != null) {
                hVarRemove.a();
            }
        }
    }

    public void c(ImageView imageView) {
        b(imageView);
    }

    public void d(c0 c0Var) {
        b(c0Var);
    }

    public void e(c.k.b.c cVar) {
        c.k.b.a aVarH = cVar.h();
        List<c.k.b.a> listI = cVar.i();
        boolean z = true;
        boolean z2 = (listI == null || listI.isEmpty()) ? false : true;
        if (aVarH == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = cVar.j().f18787e;
            Exception excK = cVar.k();
            Bitmap bitmapQ = cVar.q();
            e eVarM = cVar.m();
            if (aVarH != null) {
                g(bitmapQ, eVarM, aVarH);
            }
            if (z2) {
                int size = listI.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g(bitmapQ, eVarM, listI.get(i2));
                }
            }
            d dVar = this.f18746c;
            if (dVar == null || excK == null) {
                return;
            }
            dVar.a(this, uri, excK);
        }
    }

    public void f(ImageView imageView, h hVar) {
        this.f18755l.put(imageView, hVar);
    }

    public final void g(Bitmap bitmap, e eVar, c.k.b.a aVar) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.f18754k.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c();
            if (this.p) {
                g0.u("Main", "errored", aVar.f18626b.d());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, eVar);
        if (this.p) {
            g0.v("Main", "completed", aVar.f18626b.d(), "from " + eVar);
        }
    }

    public void h(c.k.b.a aVar) {
        Object objK = aVar.k();
        if (objK != null && this.f18754k.get(objK) != aVar) {
            b(objK);
            this.f18754k.put(objK, aVar);
        }
        o(aVar);
    }

    public List<y> i() {
        return this.f18749f;
    }

    public x j(int i2) {
        if (i2 != 0) {
            return new x(this, null, i2);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public x k(Uri uri) {
        return new x(this, uri, 0);
    }

    public x l(String str) {
        if (str == null) {
            return new x(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return k(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public Bitmap m(String str) {
        Bitmap bitmap = this.f18752i.get(str);
        a0 a0Var = this.f18753j;
        if (bitmap != null) {
            a0Var.d();
        } else {
            a0Var.e();
        }
        return bitmap;
    }

    public void n(c.k.b.a aVar) {
        Bitmap bitmapM = p.shouldReadFromMemoryCache(aVar.f18629e) ? m(aVar.d()) : null;
        if (bitmapM == null) {
            h(aVar);
            if (this.p) {
                g0.u("Main", "resumed", aVar.f18626b.d());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        g(bitmapM, eVar, aVar);
        if (this.p) {
            g0.v("Main", "completed", aVar.f18626b.d(), "from " + eVar);
        }
    }

    public void o(c.k.b.a aVar) {
        this.f18751h.h(aVar);
    }

    public w p(w wVar) {
        w wVarA = this.f18747d.a(wVar);
        if (wVarA != null) {
            return wVarA;
        }
        throw new IllegalStateException("Request transformer " + this.f18747d.getClass().getCanonicalName() + " returned null for " + wVar);
    }
}

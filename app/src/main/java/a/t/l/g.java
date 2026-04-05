package a.t.l;

import a.t.l.c;
import a.t.l.f;
import a.t.l.m;
import a.t.l.n;
import a.t.l.o;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3361a = Log.isLoggable("MediaRouter", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f3362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f3364d = new ArrayList<>();

    public static abstract class a {
        public void a(g gVar, e eVar) {
        }

        public void b(g gVar, e eVar) {
        }

        public void c(g gVar, e eVar) {
        }

        public void d(g gVar, C0076g c0076g) {
        }

        public void e(g gVar, C0076g c0076g) {
        }

        public void f(g gVar, C0076g c0076g) {
        }

        public void g(g gVar, C0076g c0076g) {
        }

        public void h(g gVar, C0076g c0076g) {
        }

        public void i(g gVar, C0076g c0076g) {
        }

        public void j(g gVar, C0076g c0076g, int i2) {
            i(gVar, c0076g);
        }

        public void k(g gVar, C0076g c0076g) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f3365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f3366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a.t.l.f f3367c = a.t.l.f.f3357a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3368d;

        public b(g gVar, a aVar) {
            this.f3365a = gVar;
            this.f3366b = aVar;
        }

        public boolean a(C0076g c0076g) {
            return (this.f3368d & 2) != 0 || c0076g.y(this.f3367c);
        }
    }

    public static abstract class c {
        public void a(String str, Bundle bundle) {
        }

        public void b(Bundle bundle) {
        }
    }

    public static final class d implements o.f, m.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3369a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a.i.k.a.a f3378j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final o f3379k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f3380l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public m f3381m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public C0076g f3382n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public C0076g f3383o;
        public C0076g p;
        public c.d q;
        public a.t.l.b s;
        public c t;
        public MediaSessionCompat u;
        public MediaSessionCompat v;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<WeakReference<g>> f3370b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<C0076g> f3371c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<a.i.q.e<String, String>, String> f3372d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<e> f3373e = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<e> f3374f = new ArrayList<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final n.c f3375g = new n.c();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C0075d f3376h = new C0075d();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final b f3377i = new b();
        public final Map<String, c.d> r = new HashMap();
        public MediaSessionCompat.OnActiveChangeListener w = new a();

        public class a implements MediaSessionCompat.OnActiveChangeListener {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener
            public void onActiveChanged() {
                MediaSessionCompat mediaSessionCompat = d.this.u;
                if (mediaSessionCompat != null) {
                    if (mediaSessionCompat.isActive()) {
                        d dVar = d.this;
                        dVar.d(dVar.u.getRemoteControlClient());
                    } else {
                        d dVar2 = d.this;
                        dVar2.u(dVar2.u.getRemoteControlClient());
                    }
                }
            }
        }

        public final class b extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<b> f3385a = new ArrayList<>();

            public b() {
            }

            public final void a(b bVar, int i2, Object obj, int i3) {
                g gVar = bVar.f3365a;
                a aVar = bVar.f3366b;
                int i4 = 65280 & i2;
                if (i4 != 256) {
                    if (i4 != 512) {
                        return;
                    }
                    e eVar = (e) obj;
                    switch (i2) {
                        case 513:
                            aVar.a(gVar, eVar);
                            break;
                        case 514:
                            aVar.c(gVar, eVar);
                            break;
                        case 515:
                            aVar.b(gVar, eVar);
                            break;
                    }
                }
                C0076g c0076g = (C0076g) obj;
                if (bVar.a(c0076g)) {
                    switch (i2) {
                        case 257:
                            aVar.d(gVar, c0076g);
                            break;
                        case 258:
                            aVar.g(gVar, c0076g);
                            break;
                        case 259:
                            aVar.e(gVar, c0076g);
                            break;
                        case 260:
                            aVar.k(gVar, c0076g);
                            break;
                        case 261:
                            aVar.f(gVar, c0076g);
                            break;
                        case 262:
                            aVar.h(gVar, c0076g);
                            break;
                        case 263:
                            aVar.j(gVar, c0076g, i3);
                            break;
                    }
                }
            }

            public void b(int i2, Object obj) {
                obtainMessage(i2, obj).sendToTarget();
            }

            public void c(int i2, Object obj, int i3) {
                Message messageObtainMessage = obtainMessage(i2, obj);
                messageObtainMessage.arg1 = i3;
                messageObtainMessage.sendToTarget();
            }

            public final void d(int i2, Object obj) {
                if (i2 == 262) {
                    d.this.f3379k.C((C0076g) obj);
                }
                switch (i2) {
                    case 257:
                        d.this.f3379k.z((C0076g) obj);
                        break;
                    case 258:
                        d.this.f3379k.B((C0076g) obj);
                        break;
                    case 259:
                        d.this.f3379k.A((C0076g) obj);
                        break;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                Object obj = message.obj;
                int i3 = message.arg1;
                if (i2 == 259 && d.this.p().h().equals(((C0076g) obj).h())) {
                    d.this.I(true);
                }
                d(i2, obj);
                try {
                    int size = d.this.f3370b.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        g gVar = d.this.f3370b.get(size).get();
                        if (gVar == null) {
                            d.this.f3370b.remove(size);
                        } else {
                            this.f3385a.addAll(gVar.f3364d);
                        }
                    }
                    int size2 = this.f3385a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        a(this.f3385a.get(i4), i2, obj, i3);
                    }
                } finally {
                    this.f3385a.clear();
                }
            }
        }

        public final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MediaSessionCompat f3387a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f3388b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f3389c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public a.s.i f3390d;

            public class a extends a.s.i {

                /* JADX INFO: renamed from: a.t.l.g$d$c$a$a, reason: collision with other inner class name */
                public class RunnableC0074a implements Runnable {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f3393b;

                    public RunnableC0074a(int i2) {
                        this.f3393b = i2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C0076g c0076g = d.this.p;
                        if (c0076g != null) {
                            c0076g.A(this.f3393b);
                        }
                    }
                }

                public class b implements Runnable {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f3395b;

                    public b(int i2) {
                        this.f3395b = i2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C0076g c0076g = d.this.p;
                        if (c0076g != null) {
                            c0076g.B(this.f3395b);
                        }
                    }
                }

                public a(int i2, int i3, int i4) {
                    super(i2, i3, i4);
                }

                @Override // a.s.i
                public void e(int i2) {
                    d.this.f3377i.post(new b(i2));
                }

                @Override // a.s.i
                public void f(int i2) {
                    d.this.f3377i.post(new RunnableC0074a(i2));
                }
            }

            public c(MediaSessionCompat mediaSessionCompat) {
                this.f3387a = mediaSessionCompat;
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = this.f3387a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.setPlaybackToLocal(d.this.f3375g.f3478d);
                    this.f3390d = null;
                }
            }

            public void b(int i2, int i3, int i4) {
                if (this.f3387a != null) {
                    a.s.i iVar = this.f3390d;
                    if (iVar != null && i2 == this.f3388b && i3 == this.f3389c) {
                        iVar.h(i4);
                        return;
                    }
                    a aVar = new a(i2, i3, i4);
                    this.f3390d = aVar;
                    this.f3387a.setPlaybackToRemote(aVar);
                }
            }

            public MediaSessionCompat.Token c() {
                MediaSessionCompat mediaSessionCompat = this.f3387a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.getSessionToken();
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: a.t.l.g$d$d, reason: collision with other inner class name */
        public final class C0075d extends c.a {
            public C0075d() {
            }

            @Override // a.t.l.c.a
            public void a(a.t.l.c cVar, a.t.l.d dVar) {
                d.this.G(cVar, dVar);
            }
        }

        public final class e implements n.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f3398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f3399b;

            public e(Object obj) {
                n nVarB = n.b(d.this.f3369a, obj);
                this.f3398a = nVarB;
                nVarB.d(this);
                e();
            }

            @Override // a.t.l.n.d
            public void a(int i2) {
                C0076g c0076g;
                if (this.f3399b || (c0076g = d.this.p) == null) {
                    return;
                }
                c0076g.A(i2);
            }

            @Override // a.t.l.n.d
            public void b(int i2) {
                C0076g c0076g;
                if (this.f3399b || (c0076g = d.this.p) == null) {
                    return;
                }
                c0076g.B(i2);
            }

            public void c() {
                this.f3399b = true;
                this.f3398a.d(null);
            }

            public Object d() {
                return this.f3398a.a();
            }

            public void e() {
                this.f3398a.c(d.this.f3375g);
            }
        }

        public d(Context context) {
            this.f3369a = context;
            this.f3378j = a.i.k.a.a.a(context);
            this.f3380l = a.i.h.b.a((ActivityManager) context.getSystemService("activity"));
            this.f3379k = o.y(context, this);
        }

        public final void A(c cVar) {
            c cVar2 = this.t;
            if (cVar2 != null) {
                cVar2.a();
            }
            this.t = cVar;
            if (cVar != null) {
                E();
            }
        }

        public final void B(C0076g c0076g, int i2) {
            StringBuilder sb;
            String str;
            if (g.f3362b == null || (this.f3383o != null && c0076g.s())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb2 = new StringBuilder();
                for (int i3 = 3; i3 < stackTrace.length; i3++) {
                    StackTraceElement stackTraceElement = stackTrace[i3];
                    sb2.append(stackTraceElement.getClassName());
                    sb2.append(InstructionFileId.DOT);
                    sb2.append(stackTraceElement.getMethodName());
                    sb2.append(":");
                    sb2.append(stackTraceElement.getLineNumber());
                    sb2.append("  ");
                }
                if (g.f3362b == null) {
                    sb = new StringBuilder();
                    str = "setSelectedRouteInternal is called while sGlobal is null: pkgName=";
                } else {
                    sb = new StringBuilder();
                    str = "Default route is selected while a BT route is available: pkgName=";
                }
                sb.append(str);
                sb.append(this.f3369a.getPackageName());
                sb.append(", callers=");
                sb.append(sb2.toString());
                Log.w("MediaRouter", sb.toString());
            }
            C0076g c0076g2 = this.p;
            if (c0076g2 != c0076g) {
                if (c0076g2 != null) {
                    if (g.f3361a) {
                        Log.d("MediaRouter", "Route unselected: " + this.p + " reason: " + i2);
                    }
                    this.f3377i.c(263, this.p, i2);
                    c.d dVar = this.q;
                    if (dVar != null) {
                        dVar.e(i2);
                        this.q.a();
                        this.q = null;
                    }
                    if (!this.r.isEmpty()) {
                        for (c.d dVar2 : this.r.values()) {
                            dVar2.e(i2);
                            dVar2.a();
                        }
                        this.r.clear();
                    }
                }
                this.p = c0076g;
                c.d dVarS = c0076g.n().s(c0076g.f3406b);
                this.q = dVarS;
                if (dVarS != null) {
                    dVarS.b();
                }
                if (g.f3361a) {
                    Log.d("MediaRouter", "Route selected: " + this.p);
                }
                this.f3377i.b(262, this.p);
                C0076g c0076g3 = this.p;
                if (c0076g3 instanceof f) {
                    List<C0076g> listF = ((f) c0076g3).F();
                    this.r.clear();
                    for (C0076g c0076g4 : listF) {
                        c.d dVarT = c0076g4.n().t(c0076g4.f3406b, this.p.f3406b);
                        dVarT.b();
                        this.r.put(c0076g4.f3406b, dVarT);
                    }
                }
                E();
            }
        }

        public void C() {
            b(this.f3379k);
            m mVar = new m(this.f3369a, this);
            this.f3381m = mVar;
            mVar.c();
        }

        public void D() {
            f.a aVar = new f.a();
            int size = this.f3370b.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                g gVar = this.f3370b.get(size).get();
                if (gVar == null) {
                    this.f3370b.remove(size);
                } else {
                    int size2 = gVar.f3364d.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = gVar.f3364d.get(i2);
                        aVar.c(bVar.f3367c);
                        int i3 = bVar.f3368d;
                        if ((i3 & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((i3 & 4) != 0 && !this.f3380l) {
                            z = true;
                        }
                        if ((i3 & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            a.t.l.f fVarD = z ? aVar.d() : a.t.l.f.f3357a;
            a.t.l.b bVar2 = this.s;
            if (bVar2 != null && bVar2.c().equals(fVarD) && this.s.d() == z2) {
                return;
            }
            if (!fVarD.f() || z2) {
                this.s = new a.t.l.b(fVarD, z2);
            } else if (this.s == null) {
                return;
            } else {
                this.s = null;
            }
            if (g.f3361a) {
                Log.d("MediaRouter", "Updated discovery request: " + this.s);
            }
            if (z && !z2 && this.f3380l) {
                Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.f3373e.size();
            for (int i4 = 0; i4 < size3; i4++) {
                this.f3373e.get(i4).f3401a.x(this.s);
            }
        }

        public final void E() {
            c cVar;
            C0076g c0076g = this.p;
            if (c0076g != null) {
                this.f3375g.f3475a = c0076g.o();
                this.f3375g.f3476b = this.p.q();
                this.f3375g.f3477c = this.p.p();
                this.f3375g.f3478d = this.p.j();
                this.f3375g.f3479e = this.p.k();
                int size = this.f3374f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f3374f.get(i2).e();
                }
                if (this.t == null) {
                    return;
                }
                if (this.p != k() && this.p != j()) {
                    n.c cVar2 = this.f3375g;
                    this.t.b(cVar2.f3477c == 1 ? 2 : 0, cVar2.f3476b, cVar2.f3475a);
                    return;
                }
                cVar = this.t;
            } else {
                cVar = this.t;
                if (cVar == null) {
                    return;
                }
            }
            cVar.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void F(e eVar, a.t.l.d dVar) {
            boolean z;
            int i2;
            if (eVar.e(dVar)) {
                if (dVar == null) {
                    z = false;
                    i2 = 0;
                } else if (dVar.d()) {
                    List<a.t.l.a> listC = dVar.c();
                    int size = listC.size();
                    ArrayList<a.i.q.e> arrayList = new ArrayList();
                    ArrayList<a.i.q.e> arrayList2 = new ArrayList();
                    int i3 = 0;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < size; i4++) {
                        a.t.l.a aVar = listC.get(i4);
                        String strL = aVar.l();
                        int iA = eVar.a(strL);
                        boolean z3 = aVar.j() != null;
                        if (iA < 0) {
                            String strE = e(eVar, strL);
                            C0076g fVar = z3 ? new f(eVar, strL, strE) : new C0076g(eVar, strL, strE);
                            int i5 = i3 + 1;
                            eVar.f3402b.add(i3, fVar);
                            this.f3371c.add(fVar);
                            if (z3) {
                                arrayList.add(new a.i.q.e(fVar, aVar));
                            } else {
                                fVar.z(aVar);
                                if (g.f3361a) {
                                    Log.d("MediaRouter", "Route added: " + fVar);
                                }
                                this.f3377i.b(257, fVar);
                            }
                            i3 = i5;
                        } else if (iA < i3) {
                            Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + aVar);
                        } else {
                            C0076g fVar2 = eVar.f3402b.get(iA);
                            if ((fVar2 instanceof f) != z3) {
                                fVar2 = z3 ? new f(eVar, strL, fVar2.h()) : new C0076g(eVar, strL, fVar2.h());
                                eVar.f3402b.set(iA, fVar2);
                            }
                            int i6 = i3 + 1;
                            Collections.swap(eVar.f3402b, iA, i3);
                            if (fVar2 instanceof f) {
                                arrayList2.add(new a.i.q.e(fVar2, aVar));
                            } else if (H(fVar2, aVar) != 0 && fVar2 == this.p) {
                                i3 = i6;
                                z2 = true;
                            }
                            i3 = i6;
                        }
                    }
                    for (a.i.q.e eVar2 : arrayList) {
                        C0076g c0076g = (C0076g) eVar2.f1955a;
                        c0076g.z((a.t.l.a) eVar2.f1956b);
                        if (g.f3361a) {
                            Log.d("MediaRouter", "Route added: " + c0076g);
                        }
                        this.f3377i.b(257, c0076g);
                    }
                    boolean z4 = z2;
                    for (a.i.q.e eVar3 : arrayList2) {
                        C0076g c0076g2 = (C0076g) eVar3.f1955a;
                        if (H(c0076g2, (a.t.l.a) eVar3.f1956b) != 0 && c0076g2 == this.p) {
                            z4 = true;
                        }
                    }
                    z = z4;
                    i2 = i3;
                } else {
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + dVar);
                    z = false;
                    i2 = 0;
                }
                for (int size2 = eVar.f3402b.size() - 1; size2 >= i2; size2--) {
                    C0076g c0076g3 = eVar.f3402b.get(size2);
                    c0076g3.z(null);
                    this.f3371c.remove(c0076g3);
                }
                I(z);
                for (int size3 = eVar.f3402b.size() - 1; size3 >= i2; size3--) {
                    C0076g c0076gRemove = eVar.f3402b.remove(size3);
                    if (g.f3361a) {
                        Log.d("MediaRouter", "Route removed: " + c0076gRemove);
                    }
                    this.f3377i.b(258, c0076gRemove);
                }
                if (g.f3361a) {
                    Log.d("MediaRouter", "Provider changed: " + eVar);
                }
                this.f3377i.b(515, eVar);
            }
        }

        public void G(a.t.l.c cVar, a.t.l.d dVar) {
            int iG = g(cVar);
            if (iG >= 0) {
                F(this.f3373e.get(iG), dVar);
            }
        }

        public final int H(C0076g c0076g, a.t.l.a aVar) {
            int iZ = c0076g.z(aVar);
            if (iZ != 0) {
                if ((iZ & 1) != 0) {
                    if (g.f3361a) {
                        Log.d("MediaRouter", "Route changed: " + c0076g);
                    }
                    this.f3377i.b(259, c0076g);
                }
                if ((iZ & 2) != 0) {
                    if (g.f3361a) {
                        Log.d("MediaRouter", "Route volume changed: " + c0076g);
                    }
                    this.f3377i.b(260, c0076g);
                }
                if ((iZ & 4) != 0) {
                    if (g.f3361a) {
                        Log.d("MediaRouter", "Route presentation display changed: " + c0076g);
                    }
                    this.f3377i.b(261, c0076g);
                }
            }
            return iZ;
        }

        public void I(boolean z) {
            C0076g c0076g = this.f3382n;
            if (c0076g != null && !c0076g.v()) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.f3382n);
                this.f3382n = null;
            }
            if (this.f3382n == null && !this.f3371c.isEmpty()) {
                Iterator<C0076g> it = this.f3371c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0076g next = it.next();
                    if (s(next) && next.v()) {
                        this.f3382n = next;
                        Log.i("MediaRouter", "Found default route: " + this.f3382n);
                        break;
                    }
                }
            }
            C0076g c0076g2 = this.f3383o;
            if (c0076g2 != null && !c0076g2.v()) {
                Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f3383o);
                this.f3383o = null;
            }
            if (this.f3383o == null && !this.f3371c.isEmpty()) {
                Iterator<C0076g> it2 = this.f3371c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0076g next2 = it2.next();
                    if (t(next2) && next2.v()) {
                        this.f3383o = next2;
                        Log.i("MediaRouter", "Found bluetooth route: " + this.f3383o);
                        break;
                    }
                }
            }
            C0076g c0076g3 = this.p;
            if (c0076g3 == null || !c0076g3.v()) {
                Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.p);
                B(f(), 0);
                return;
            }
            if (z) {
                C0076g c0076g4 = this.p;
                if (c0076g4 instanceof f) {
                    List<C0076g> listF = ((f) c0076g4).F();
                    HashSet hashSet = new HashSet();
                    Iterator<C0076g> it3 = listF.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(it3.next().f3406b);
                    }
                    Iterator<Map.Entry<String, c.d>> it4 = this.r.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry<String, c.d> next3 = it4.next();
                        if (!hashSet.contains(next3.getKey())) {
                            c.d value = next3.getValue();
                            value.d();
                            value.a();
                            it4.remove();
                        }
                    }
                    for (C0076g c0076g5 : listF) {
                        if (!this.r.containsKey(c0076g5.f3406b)) {
                            c.d dVarT = c0076g5.n().t(c0076g5.f3406b, this.p.f3406b);
                            dVarT.b();
                            this.r.put(c0076g5.f3406b, dVarT);
                        }
                    }
                }
                E();
            }
        }

        @Override // a.t.l.o.f
        public void a(String str) {
            e eVar;
            int iA;
            this.f3377i.removeMessages(262);
            int iG = g(this.f3379k);
            if (iG < 0 || (iA = (eVar = this.f3373e.get(iG)).a(str)) < 0) {
                return;
            }
            eVar.f3402b.get(iA).C();
        }

        @Override // a.t.l.m.c
        public void b(a.t.l.c cVar) {
            if (g(cVar) < 0) {
                e eVar = new e(cVar);
                this.f3373e.add(eVar);
                if (g.f3361a) {
                    Log.d("MediaRouter", "Provider added: " + eVar);
                }
                this.f3377i.b(513, eVar);
                F(eVar, cVar.o());
                cVar.v(this.f3376h);
                cVar.x(this.s);
            }
        }

        @Override // a.t.l.m.c
        public void c(a.t.l.c cVar) {
            int iG = g(cVar);
            if (iG >= 0) {
                cVar.v(null);
                cVar.x(null);
                e eVar = this.f3373e.get(iG);
                F(eVar, null);
                if (g.f3361a) {
                    Log.d("MediaRouter", "Provider removed: " + eVar);
                }
                this.f3377i.b(514, eVar);
                this.f3373e.remove(iG);
            }
        }

        public void d(Object obj) {
            if (h(obj) < 0) {
                this.f3374f.add(new e(obj));
            }
        }

        public final String e(e eVar, String str) {
            String strFlattenToShortString = eVar.b().flattenToShortString();
            String str2 = strFlattenToShortString + ":" + str;
            if (i(str2) < 0) {
                this.f3372d.put(new a.i.q.e<>(strFlattenToShortString, str), str2);
                return str2;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + strFlattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i2 = 2;
            while (true) {
                String str3 = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i2));
                if (i(str3) < 0) {
                    this.f3372d.put(new a.i.q.e<>(strFlattenToShortString, str), str3);
                    return str3;
                }
                i2++;
            }
        }

        public C0076g f() {
            for (C0076g c0076g : this.f3371c) {
                if (c0076g != this.f3382n && t(c0076g) && c0076g.v()) {
                    return c0076g;
                }
            }
            return this.f3382n;
        }

        public final int g(a.t.l.c cVar) {
            int size = this.f3373e.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f3373e.get(i2).f3401a == cVar) {
                    return i2;
                }
            }
            return -1;
        }

        public final int h(Object obj) {
            int size = this.f3374f.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f3374f.get(i2).d() == obj) {
                    return i2;
                }
            }
            return -1;
        }

        public final int i(String str) {
            int size = this.f3371c.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f3371c.get(i2).f3407c.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        public C0076g j() {
            return this.f3383o;
        }

        public C0076g k() {
            C0076g c0076g = this.f3382n;
            if (c0076g != null) {
                return c0076g;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public MediaSessionCompat.Token l() {
            c cVar = this.t;
            if (cVar != null) {
                return cVar.c();
            }
            MediaSessionCompat mediaSessionCompat = this.v;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.getSessionToken();
            }
            return null;
        }

        public C0076g m(String str) {
            for (C0076g c0076g : this.f3371c) {
                if (c0076g.f3407c.equals(str)) {
                    return c0076g;
                }
            }
            return null;
        }

        public g n(Context context) {
            int size = this.f3370b.size();
            while (true) {
                size--;
                if (size < 0) {
                    g gVar = new g(context);
                    this.f3370b.add(new WeakReference<>(gVar));
                    return gVar;
                }
                g gVar2 = this.f3370b.get(size).get();
                if (gVar2 == null) {
                    this.f3370b.remove(size);
                } else if (gVar2.f3363c == context) {
                    return gVar2;
                }
            }
        }

        public List<C0076g> o() {
            return this.f3371c;
        }

        public C0076g p() {
            C0076g c0076g = this.p;
            if (c0076g != null) {
                return c0076g;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public String q(e eVar, String str) {
            return this.f3372d.get(new a.i.q.e(eVar.b().flattenToShortString(), str));
        }

        public boolean r(a.t.l.f fVar, int i2) {
            if (fVar.f()) {
                return false;
            }
            if ((i2 & 2) == 0 && this.f3380l) {
                return true;
            }
            int size = this.f3371c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0076g c0076g = this.f3371c.get(i3);
                if (((i2 & 1) == 0 || !c0076g.t()) && c0076g.y(fVar)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean s(C0076g c0076g) {
            return c0076g.n() == this.f3379k && c0076g.f3406b.equals("DEFAULT_ROUTE");
        }

        public final boolean t(C0076g c0076g) {
            return c0076g.n() == this.f3379k && c0076g.D("android.media.intent.category.LIVE_AUDIO") && !c0076g.D("android.media.intent.category.LIVE_VIDEO");
        }

        public void u(Object obj) {
            int iH = h(obj);
            if (iH >= 0) {
                this.f3374f.remove(iH).c();
            }
        }

        public void v(C0076g c0076g, int i2) {
            c.d dVar;
            c.d dVar2;
            if (c0076g == this.p && (dVar2 = this.q) != null) {
                dVar2.c(i2);
            } else {
                if (this.r.isEmpty() || (dVar = this.r.get(c0076g.f3406b)) == null) {
                    return;
                }
                dVar.c(i2);
            }
        }

        public void w(C0076g c0076g, int i2) {
            c.d dVar;
            if (c0076g != this.p || (dVar = this.q) == null) {
                return;
            }
            dVar.f(i2);
        }

        public void x(C0076g c0076g) {
            y(c0076g, 3);
        }

        public void y(C0076g c0076g, int i2) {
            StringBuilder sb;
            String str;
            if (!this.f3371c.contains(c0076g)) {
                sb = new StringBuilder();
                str = "Ignoring attempt to select removed route: ";
            } else if (c0076g.f3411g) {
                B(c0076g, i2);
                return;
            } else {
                sb = new StringBuilder();
                str = "Ignoring attempt to select disabled route: ";
            }
            sb.append(str);
            sb.append(c0076g);
            Log.w("MediaRouter", sb.toString());
        }

        public void z(MediaSessionCompat mediaSessionCompat) {
            this.v = mediaSessionCompat;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                A(mediaSessionCompat != null ? new c(mediaSessionCompat) : null);
                return;
            }
            if (i2 >= 14) {
                MediaSessionCompat mediaSessionCompat2 = this.u;
                if (mediaSessionCompat2 != null) {
                    u(mediaSessionCompat2.getRemoteControlClient());
                    this.u.removeOnActiveChangeListener(this.w);
                }
                this.u = mediaSessionCompat;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.addOnActiveChangeListener(this.w);
                    if (mediaSessionCompat.isActive()) {
                        d(mediaSessionCompat.getRemoteControlClient());
                    }
                }
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.t.l.c f3401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<C0076g> f3402b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.C0073c f3403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a.t.l.d f3404d;

        public e(a.t.l.c cVar) {
            this.f3401a = cVar;
            this.f3403c = cVar.r();
        }

        public int a(String str) {
            int size = this.f3402b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f3402b.get(i2).f3406b.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        public ComponentName b() {
            return this.f3403c.a();
        }

        public String c() {
            return this.f3403c.b();
        }

        public a.t.l.c d() {
            g.c();
            return this.f3401a;
        }

        public boolean e(a.t.l.d dVar) {
            if (this.f3404d == dVar) {
                return false;
            }
            this.f3404d = dVar;
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + c() + " }";
        }
    }

    public static class f extends C0076g {
        public List<C0076g> w;

        public f(e eVar, String str, String str2) {
            super(eVar, str, str2);
            this.w = new ArrayList();
        }

        public List<C0076g> F() {
            return this.w;
        }

        @Override // a.t.l.g.C0076g
        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append('[');
            int size = this.w.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.w.get(i2));
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // a.t.l.g.C0076g
        public int z(a.t.l.a aVar) {
            if (this.v != aVar) {
                this.v = aVar;
                if (aVar != null) {
                    List<String> listJ = aVar.j();
                    ArrayList arrayList = new ArrayList();
                    if (listJ == null) {
                        Log.w("MediaRouter", "groupMemberIds shouldn't be null.");
                        i = 1;
                    } else {
                        i = listJ.size() != this.w.size() ? 1 : 0;
                        Iterator<String> it = listJ.iterator();
                        while (it.hasNext()) {
                            C0076g c0076gM = g.f3362b.m(g.f3362b.q(m(), it.next()));
                            if (c0076gM != null) {
                                arrayList.add(c0076gM);
                                if (i == 0 && !this.w.contains(c0076gM)) {
                                    i = 1;
                                }
                            }
                        }
                    }
                    if (i != 0) {
                        this.w = arrayList;
                    }
                }
            }
            return super.E(aVar) | i;
        }
    }

    /* JADX INFO: renamed from: a.t.l.g$g, reason: collision with other inner class name */
    public static class C0076g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f3405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f3408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f3409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f3410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3411g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3412h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3413i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3414j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f3416l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f3417m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f3418n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f3419o;
        public int p;
        public int q;
        public Display r;
        public Bundle t;
        public IntentSender u;
        public a.t.l.a v;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<IntentFilter> f3415k = new ArrayList<>();
        public int s = -1;

        public C0076g(e eVar, String str, String str2) {
            this.f3405a = eVar;
            this.f3406b = str;
            this.f3407c = str2;
        }

        public static boolean x(C0076g c0076g) {
            return TextUtils.equals(c0076g.n().r().b(), "android");
        }

        public void A(int i2) {
            g.c();
            g.f3362b.v(this, Math.min(this.q, Math.max(0, i2)));
        }

        public void B(int i2) {
            g.c();
            if (i2 != 0) {
                g.f3362b.w(this, i2);
            }
        }

        public void C() {
            g.c();
            g.f3362b.x(this);
        }

        public boolean D(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            g.c();
            int size = this.f3415k.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f3415k.get(i2).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public int E(a.t.l.a aVar) {
            this.v = aVar;
            int i2 = 0;
            if (aVar == null) {
                return 0;
            }
            if (!a.i.q.d.a(this.f3408d, aVar.o())) {
                this.f3408d = aVar.o();
                i2 = 1;
            }
            if (!a.i.q.d.a(this.f3409e, aVar.g())) {
                this.f3409e = aVar.g();
                i2 |= 1;
            }
            if (!a.i.q.d.a(this.f3410f, aVar.k())) {
                this.f3410f = aVar.k();
                i2 |= 1;
            }
            if (this.f3411g != aVar.x()) {
                this.f3411g = aVar.x();
                i2 |= 1;
            }
            if (this.f3412h != aVar.w()) {
                this.f3412h = aVar.w();
                i2 |= 1;
            }
            if (this.f3413i != aVar.e()) {
                this.f3413i = aVar.e();
                i2 |= 1;
            }
            if (!this.f3415k.equals(aVar.f())) {
                this.f3415k.clear();
                this.f3415k.addAll(aVar.f());
                i2 |= 1;
            }
            if (this.f3416l != aVar.q()) {
                this.f3416l = aVar.q();
                i2 |= 1;
            }
            if (this.f3417m != aVar.p()) {
                this.f3417m = aVar.p();
                i2 |= 1;
            }
            if (this.f3418n != aVar.h()) {
                this.f3418n = aVar.h();
                i2 |= 1;
            }
            if (this.f3419o != aVar.u()) {
                this.f3419o = aVar.u();
                i2 |= 3;
            }
            if (this.p != aVar.t()) {
                this.p = aVar.t();
                i2 |= 3;
            }
            if (this.q != aVar.v()) {
                this.q = aVar.v();
                i2 |= 3;
            }
            if (this.s != aVar.r()) {
                this.s = aVar.r();
                this.r = null;
                i2 |= 5;
            }
            if (!a.i.q.d.a(this.t, aVar.i())) {
                this.t = aVar.i();
                i2 |= 1;
            }
            if (!a.i.q.d.a(this.u, aVar.s())) {
                this.u = aVar.s();
                i2 |= 1;
            }
            if (this.f3414j == aVar.b()) {
                return i2;
            }
            this.f3414j = aVar.b();
            return i2 | 5;
        }

        public boolean a() {
            return this.f3414j;
        }

        public int b() {
            return this.f3413i;
        }

        public String c() {
            return this.f3409e;
        }

        public String d() {
            return this.f3406b;
        }

        public int e() {
            return this.f3418n;
        }

        public Bundle f() {
            return this.t;
        }

        public Uri g() {
            return this.f3410f;
        }

        public String h() {
            return this.f3407c;
        }

        public String i() {
            return this.f3408d;
        }

        public int j() {
            return this.f3417m;
        }

        public int k() {
            return this.f3416l;
        }

        public int l() {
            return this.s;
        }

        public e m() {
            return this.f3405a;
        }

        public a.t.l.c n() {
            return this.f3405a.d();
        }

        public int o() {
            return this.p;
        }

        public int p() {
            return this.f3419o;
        }

        public int q() {
            return this.q;
        }

        public boolean r() {
            return this.f3412h;
        }

        public boolean s() {
            g.c();
            return g.f3362b.k() == this;
        }

        public boolean t() {
            if (s() || this.f3418n == 3) {
                return true;
            }
            return x(this) && D("android.media.intent.category.LIVE_AUDIO") && !D("android.media.intent.category.LIVE_VIDEO");
        }

        public String toString() {
            return "MediaRouter.RouteInfo{ uniqueId=" + this.f3407c + ", name=" + this.f3408d + ", description=" + this.f3409e + ", iconUri=" + this.f3410f + ", enabled=" + this.f3411g + ", connecting=" + this.f3412h + ", connectionState=" + this.f3413i + ", canDisconnect=" + this.f3414j + ", playbackType=" + this.f3416l + ", playbackStream=" + this.f3417m + ", deviceType=" + this.f3418n + ", volumeHandling=" + this.f3419o + ", volume=" + this.p + ", volumeMax=" + this.q + ", presentationDisplayId=" + this.s + ", extras=" + this.t + ", settingsIntent=" + this.u + ", providerPackageName=" + this.f3405a.c() + " }";
        }

        public boolean u() {
            return this.f3411g;
        }

        public boolean v() {
            return this.v != null && this.f3411g;
        }

        public boolean w() {
            g.c();
            return g.f3362b.p() == this;
        }

        public boolean y(a.t.l.f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            g.c();
            return fVar.h(this.f3415k);
        }

        public int z(a.t.l.a aVar) {
            if (this.v != aVar) {
                return E(aVar);
            }
            return 0;
        }
    }

    public g(Context context) {
        this.f3363c = context;
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static g f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        c();
        if (f3362b == null) {
            d dVar = new d(context.getApplicationContext());
            f3362b = dVar;
            dVar.C();
        }
        return f3362b.n(context);
    }

    public void a(a.t.l.f fVar, a aVar) {
        b(fVar, aVar, 0);
    }

    public void b(a.t.l.f fVar, a aVar, int i2) {
        b bVar;
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        c();
        if (f3361a) {
            Log.d("MediaRouter", "addCallback: selector=" + fVar + ", callback=" + aVar + ", flags=" + Integer.toHexString(i2));
        }
        int iD = d(aVar);
        if (iD < 0) {
            bVar = new b(this, aVar);
            this.f3364d.add(bVar);
        } else {
            bVar = this.f3364d.get(iD);
        }
        boolean z = false;
        int i3 = bVar.f3368d;
        boolean z2 = true;
        if (((i3 ^ (-1)) & i2) != 0) {
            bVar.f3368d = i3 | i2;
            z = true;
        }
        if (bVar.f3367c.b(fVar)) {
            z2 = z;
        } else {
            bVar.f3367c = new f.a(bVar.f3367c).c(fVar).d();
        }
        if (z2) {
            f3362b.D();
        }
    }

    public final int d(a aVar) {
        int size = this.f3364d.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f3364d.get(i2).f3366b == aVar) {
                return i2;
            }
        }
        return -1;
    }

    public C0076g e() {
        c();
        return f3362b.k();
    }

    public MediaSessionCompat.Token g() {
        return f3362b.l();
    }

    public List<C0076g> h() {
        c();
        return f3362b.o();
    }

    public C0076g i() {
        c();
        return f3362b.p();
    }

    public boolean j(a.t.l.f fVar, int i2) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        c();
        return f3362b.r(fVar, i2);
    }

    public void k(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        c();
        if (f3361a) {
            Log.d("MediaRouter", "removeCallback: callback=" + aVar);
        }
        int iD = d(aVar);
        if (iD >= 0) {
            this.f3364d.remove(iD);
            f3362b.D();
        }
    }

    public void l(C0076g c0076g) {
        if (c0076g == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        c();
        if (f3361a) {
            Log.d("MediaRouter", "selectRoute: " + c0076g);
        }
        f3362b.x(c0076g);
    }

    public void m(MediaSessionCompat mediaSessionCompat) {
        if (f3361a) {
            Log.d("MediaRouter", "addMediaSessionCompat: " + mediaSessionCompat);
        }
        f3362b.z(mediaSessionCompat);
    }

    public void n(int i2) {
        if (i2 < 0 || i2 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        c();
        C0076g c0076gF = f3362b.f();
        if (f3362b.p() != c0076gF) {
            f3362b.y(c0076gF, i2);
        } else {
            d dVar = f3362b;
            dVar.y(dVar.k(), i2);
        }
    }
}

package c.c.b.w;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import c.c.b.n;
import c.c.b.o;
import c.c.b.p;
import c.c.b.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f5297a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f5299c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f5303g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5298b = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, e> f5300d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, e> f5301e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f5302f = new Handler(Looper.getMainLooper());

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f5305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5306c;

        public a(int i2, ImageView imageView, int i3) {
            this.f5304a = i2;
            this.f5305b = imageView;
            this.f5306c = i3;
        }

        @Override // c.c.b.w.i.h
        public void a(g gVar, boolean z) {
            if (gVar.d() != null) {
                this.f5305b.setImageBitmap(gVar.d());
                return;
            }
            int i2 = this.f5306c;
            if (i2 != 0) {
                this.f5305b.setImageResource(i2);
            }
        }

        @Override // c.c.b.p.a
        public void b(u uVar) {
            int i2 = this.f5304a;
            if (i2 != 0) {
                this.f5305b.setImageResource(i2);
            }
        }
    }

    public class b implements p.b<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5307a;

        public b(String str) {
            this.f5307a = str;
        }

        @Override // c.c.b.p.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            i.this.l(this.f5307a, bitmap);
        }
    }

    public class c implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5309a;

        public c(String str) {
            this.f5309a = str;
        }

        @Override // c.c.b.p.a
        public void b(u uVar) {
            i.this.k(this.f5309a, uVar);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : i.this.f5301e.values()) {
                for (g gVar : eVar.f5315d) {
                    if (gVar.f5317b != null) {
                        if (eVar.e() == null) {
                            gVar.f5316a = eVar.f5313b;
                            gVar.f5317b.a(gVar, false);
                        } else {
                            gVar.f5317b.b(eVar.e());
                        }
                    }
                }
            }
            i.this.f5301e.clear();
            i.this.f5303g = null;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<?> f5312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f5313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f5314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<g> f5315d;

        public e(n<?> nVar, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f5315d = arrayList;
            this.f5312a = nVar;
            arrayList.add(gVar);
        }

        public void d(g gVar) {
            this.f5315d.add(gVar);
        }

        public u e() {
            return this.f5314c;
        }

        public boolean f(g gVar) {
            this.f5315d.remove(gVar);
            if (this.f5315d.size() != 0) {
                return false;
            }
            this.f5312a.d();
            return true;
        }

        public void g(u uVar) {
            this.f5314c = uVar;
        }
    }

    public interface f {
        Bitmap a(String str);

        void b(String str, Bitmap bitmap);
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f5316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f5317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5319d;

        public g(Bitmap bitmap, String str, String str2, h hVar) {
            this.f5316a = bitmap;
            this.f5319d = str;
            this.f5318c = str2;
            this.f5317b = hVar;
        }

        public void c() {
            HashMap map;
            l.a();
            if (this.f5317b == null) {
                return;
            }
            e eVar = (e) i.this.f5300d.get(this.f5318c);
            if (eVar == null) {
                e eVar2 = (e) i.this.f5301e.get(this.f5318c);
                if (eVar2 == null) {
                    return;
                }
                eVar2.f(this);
                if (eVar2.f5315d.size() != 0) {
                    return;
                } else {
                    map = i.this.f5301e;
                }
            } else if (!eVar.f(this)) {
                return;
            } else {
                map = i.this.f5300d;
            }
            map.remove(this.f5318c);
        }

        public Bitmap d() {
            return this.f5316a;
        }

        public String e() {
            return this.f5319d;
        }
    }

    public interface h extends p.a {
        void a(g gVar, boolean z);
    }

    public i(o oVar, f fVar) {
        this.f5297a = oVar;
        this.f5299c = fVar;
    }

    public static String h(String str, int i2, int i3, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i2);
        sb.append("#H");
        sb.append(i3);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    public static h i(ImageView imageView, int i2, int i3) {
        return new a(i3, imageView, i2);
    }

    public final void d(String str, e eVar) {
        this.f5301e.put(str, eVar);
        if (this.f5303g == null) {
            d dVar = new d();
            this.f5303g = dVar;
            this.f5302f.postDelayed(dVar, this.f5298b);
        }
    }

    public g e(String str, h hVar) {
        return f(str, hVar, 0, 0);
    }

    public g f(String str, h hVar, int i2, int i3) {
        return g(str, hVar, i2, i3, ImageView.ScaleType.CENTER_INSIDE);
    }

    public g g(String str, h hVar, int i2, int i3, ImageView.ScaleType scaleType) {
        l.a();
        String strH = h(str, i2, i3, scaleType);
        Bitmap bitmapA = this.f5299c.a(strH);
        if (bitmapA != null) {
            g gVar = new g(bitmapA, str, null, null);
            hVar.a(gVar, true);
            return gVar;
        }
        g gVar2 = new g(null, str, strH, hVar);
        hVar.a(gVar2, true);
        e eVar = this.f5300d.get(strH);
        if (eVar != null) {
            eVar.d(gVar2);
            return gVar2;
        }
        n<Bitmap> nVarJ = j(str, i2, i3, scaleType, strH);
        this.f5297a.a(nVarJ);
        this.f5300d.put(strH, new e(nVarJ, gVar2));
        return gVar2;
    }

    public n<Bitmap> j(String str, int i2, int i3, ImageView.ScaleType scaleType, String str2) {
        return new j(str, new b(str2), i2, i3, scaleType, Bitmap.Config.RGB_565, new c(str2));
    }

    public void k(String str, u uVar) {
        e eVarRemove = this.f5300d.remove(str);
        if (eVarRemove != null) {
            eVarRemove.g(uVar);
            d(str, eVarRemove);
        }
    }

    public void l(String str, Bitmap bitmap) {
        this.f5299c.b(str, bitmap);
        e eVarRemove = this.f5300d.remove(str);
        if (eVarRemove != null) {
            eVarRemove.f5313b = bitmap;
            d(str, eVarRemove);
        }
    }
}

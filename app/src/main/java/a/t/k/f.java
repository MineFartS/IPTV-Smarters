package a.t.k;

import a.t.l.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends a.b.k.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.t.l.g f3303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f3304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f3305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.t.l.f f3306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<g.C0076g> f3307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f3308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f3309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f3310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f3314o;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            f.this.k((List) message.obj);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.dismiss();
        }
    }

    public final class c extends g.a {
        public c() {
        }

        @Override // a.t.l.g.a
        public void d(a.t.l.g gVar, g.C0076g c0076g) {
            f.this.g();
        }

        @Override // a.t.l.g.a
        public void e(a.t.l.g gVar, g.C0076g c0076g) {
            f.this.g();
        }

        @Override // a.t.l.g.a
        public void g(a.t.l.g gVar, g.C0076g c0076g) {
            f.this.g();
        }

        @Override // a.t.l.g.a
        public void h(a.t.l.g gVar, g.C0076g c0076g) {
            f.this.dismiss();
        }
    }

    public final class d extends RecyclerView.h<RecyclerView.e0> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<b> f3318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LayoutInflater f3319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Drawable f3320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Drawable f3321h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Drawable f3322i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Drawable f3323j;

        public class a extends RecyclerView.e0 {
            public TextView u;

            public a(View view) {
                super(view);
                this.u = (TextView) view.findViewById(a.t.d.C);
            }

            public void R(b bVar) {
                this.u.setText(bVar.a().toString());
            }
        }

        public class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f3325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f3326b;

            public b(Object obj) {
                int i2;
                this.f3325a = obj;
                if (obj instanceof String) {
                    i2 = 1;
                } else {
                    if (!(obj instanceof g.C0076g)) {
                        this.f3326b = 0;
                        Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                        return;
                    }
                    i2 = 2;
                }
                this.f3326b = i2;
            }

            public Object a() {
                return this.f3325a;
            }

            public int b() {
                return this.f3326b;
            }
        }

        public class c extends RecyclerView.e0 {
            public View u;
            public TextView v;
            public ImageView w;

            public class a implements View.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g.C0076g f3328b;

                public a(g.C0076g c0076g) {
                    this.f3328b = c0076g;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.f3328b.C();
                }
            }

            public c(View view) {
                super(view);
                this.u = view;
                this.v = (TextView) view.findViewById(a.t.d.M);
                this.w = (ImageView) view.findViewById(a.t.d.L);
            }

            public void R(b bVar) {
                g.C0076g c0076g = (g.C0076g) bVar.a();
                this.u.setOnClickListener(new a(c0076g));
                this.v.setText(c0076g.i());
                this.w.setImageDrawable(d.this.Z(c0076g));
            }
        }

        public d() {
            this.f3319f = LayoutInflater.from(f.this.f3305f);
            this.f3320g = i.f(f.this.f3305f);
            this.f3321h = i.n(f.this.f3305f);
            this.f3322i = i.j(f.this.f3305f);
            this.f3323j = i.k(f.this.f3305f);
            e0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void F(RecyclerView.e0 e0Var, int i2) {
            int iR = r(i2);
            b bVarC0 = c0(i2);
            if (iR == 1) {
                ((a) e0Var).R(bVarC0);
            } else if (iR != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((c) e0Var).R(bVarC0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new a(this.f3319f.inflate(a.t.g.f3170i, viewGroup, false));
            }
            if (i2 == 2) {
                return new c(this.f3319f.inflate(a.t.g.f3172k, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        public final Drawable W(g.C0076g c0076g) {
            int iE = c0076g.e();
            return iE != 1 ? iE != 2 ? c0076g instanceof g.f ? this.f3323j : this.f3320g : this.f3322i : this.f3321h;
        }

        public Drawable Z(g.C0076g c0076g) {
            Uri uriG = c0076g.g();
            if (uriG != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(f.this.f3305f.getContentResolver().openInputStream(uriG), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e2) {
                    Log.w("RecyclerAdapter", "Failed to load " + uriG, e2);
                }
            }
            return W(c0076g);
        }

        public b c0(int i2) {
            return this.f3318e.get(i2);
        }

        public void e0() {
            this.f3318e = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (int size = f.this.f3307h.size() - 1; size >= 0; size--) {
                g.C0076g c0076g = f.this.f3307h.get(size);
                if (c0076g instanceof g.f) {
                    arrayList.add(c0076g);
                    f.this.f3307h.remove(size);
                }
            }
            this.f3318e.add(new b(f.this.f3305f.getString(a.t.h.p)));
            Iterator<g.C0076g> it = f.this.f3307h.iterator();
            while (it.hasNext()) {
                this.f3318e.add(new b(it.next()));
            }
            this.f3318e.add(new b(f.this.f3305f.getString(a.t.h.q)));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f3318e.add(new b((g.C0076g) it2.next()));
            }
            w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int o() {
            return this.f3318e.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int r(int i2) {
            return this.f3318e.get(i2).b();
        }
    }

    public static final class e implements Comparator<g.C0076g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f3330b = new e();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g.C0076g c0076g, g.C0076g c0076g2) {
            return c0076g.i().compareToIgnoreCase(c0076g2.i());
        }
    }

    public f(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, int i2) {
        Context contextB = i.b(context, i2, false);
        super(contextB, i.c(contextB));
        this.f3306g = a.t.l.f.f3357a;
        this.f3314o = new a();
        Context context2 = getContext();
        this.f3303d = a.t.l.g.f(context2);
        this.f3304e = new c();
        this.f3305f = context2;
        this.f3312m = context2.getResources().getInteger(a.t.e.f3159d);
    }

    public boolean e(g.C0076g c0076g) {
        return !c0076g.t() && c0076g.u() && c0076g.y(this.f3306g);
    }

    public void f(List<g.C0076g> list) {
        int size = list.size();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                return;
            }
            if (!e(list.get(i2))) {
                list.remove(i2);
            }
            size = i2;
        }
    }

    public void g() {
        if (this.f3311l) {
            ArrayList arrayList = new ArrayList(this.f3303d.h());
            f(arrayList);
            Collections.sort(arrayList, e.f3330b);
            if (SystemClock.uptimeMillis() - this.f3313n >= this.f3312m) {
                k(arrayList);
                return;
            }
            this.f3314o.removeMessages(1);
            Handler handler = this.f3314o;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f3313n + this.f3312m);
        }
    }

    public void h(a.t.l.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f3306g.equals(fVar)) {
            return;
        }
        this.f3306g = fVar;
        if (this.f3311l) {
            this.f3303d.k(this.f3304e);
            this.f3303d.b(fVar, this.f3304e, 1);
        }
        g();
    }

    public void i() {
        getWindow().setLayout(-1, -1);
    }

    public void k(List<g.C0076g> list) {
        this.f3313n = SystemClock.uptimeMillis();
        this.f3307h.clear();
        this.f3307h.addAll(list);
        this.f3309j.e0();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3311l = true;
        this.f3303d.b(this.f3306g, this.f3304e, 1);
        g();
    }

    @Override // a.b.k.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a.t.g.f3171j);
        this.f3307h = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(a.t.d.J);
        this.f3308i = imageButton;
        imageButton.setOnClickListener(new b());
        this.f3309j = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(a.t.d.K);
        this.f3310k = recyclerView;
        recyclerView.setAdapter(this.f3309j);
        this.f3310k.setLayoutManager(new LinearLayoutManager(this.f3305f));
        i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3311l = false;
        this.f3303d.k(this.f3304e);
        this.f3314o.removeMessages(1);
    }
}

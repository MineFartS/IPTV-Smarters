package a.t.k;

import a.t.l.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class b extends a.b.k.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.t.l.g f3241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0070b f3242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f3243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.t.l.f f3244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<g.C0076g> f3245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f3246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListView f3247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f3249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f3250m;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            b.this.k((List) message.obj);
        }
    }

    /* JADX INFO: renamed from: a.t.k.b$b, reason: collision with other inner class name */
    public final class C0070b extends g.a {
        public C0070b() {
        }

        @Override // a.t.l.g.a
        public void d(a.t.l.g gVar, g.C0076g c0076g) {
            b.this.g();
        }

        @Override // a.t.l.g.a
        public void e(a.t.l.g gVar, g.C0076g c0076g) {
            b.this.g();
        }

        @Override // a.t.l.g.a
        public void g(a.t.l.g gVar, g.C0076g c0076g) {
            b.this.g();
        }

        @Override // a.t.l.g.a
        public void h(a.t.l.g gVar, g.C0076g c0076g) {
            b.this.dismiss();
        }
    }

    public final class c extends ArrayAdapter<g.C0076g> implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f3253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Drawable f3254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Drawable f3255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Drawable f3256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Drawable f3257f;

        public c(Context context, List<g.C0076g> list) {
            super(context, 0, list);
            this.f3253b = LayoutInflater.from(context);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{a.t.a.f3125b, a.t.a.f3132i, a.t.a.f3129f, a.t.a.f3128e});
            this.f3254c = typedArrayObtainStyledAttributes.getDrawable(0);
            this.f3255d = typedArrayObtainStyledAttributes.getDrawable(1);
            this.f3256e = typedArrayObtainStyledAttributes.getDrawable(2);
            this.f3257f = typedArrayObtainStyledAttributes.getDrawable(3);
            typedArrayObtainStyledAttributes.recycle();
        }

        public final Drawable a(g.C0076g c0076g) {
            int iE = c0076g.e();
            return iE != 1 ? iE != 2 ? c0076g instanceof g.f ? this.f3257f : this.f3254c : this.f3256e : this.f3255d;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        public final Drawable b(g.C0076g c0076g) {
            Uri uriG = c0076g.g();
            if (uriG != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uriG), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e2) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + uriG, e2);
                }
            }
            return a(c0076g);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f3253b.inflate(a.t.g.f3167f, viewGroup, false);
            }
            g.C0076g item = getItem(i2);
            TextView textView = (TextView) view.findViewById(a.t.d.r);
            TextView textView2 = (TextView) view.findViewById(a.t.d.p);
            textView.setText(item.i());
            String strC = item.c();
            boolean z = true;
            if (item.b() != 2 && item.b() != 1) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(strC)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText(BuildConfig.FLAVOR);
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(strC);
            }
            view.setEnabled(item.u());
            ImageView imageView = (ImageView) view.findViewById(a.t.d.q);
            if (imageView != null) {
                imageView.setImageDrawable(b(item));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            return getItem(i2).u();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            g.C0076g item = getItem(i2);
            if (item.u()) {
                item.C();
                b.this.dismiss();
            }
        }
    }

    public static final class d implements Comparator<g.C0076g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f3259b = new d();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g.C0076g c0076g, g.C0076g c0076g2) {
            return c0076g.i().compareToIgnoreCase(c0076g2.i());
        }
    }

    public b(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i2) {
        Context contextB = i.b(context, i2, false);
        super(contextB, i.c(contextB));
        this.f3244g = a.t.l.f.f3357a;
        this.f3250m = new a();
        this.f3241d = a.t.l.g.f(getContext());
        this.f3242e = new C0070b();
    }

    public boolean e(g.C0076g c0076g) {
        return !c0076g.t() && c0076g.u() && c0076g.y(this.f3244g);
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
        if (this.f3248k) {
            ArrayList arrayList = new ArrayList(this.f3241d.h());
            f(arrayList);
            Collections.sort(arrayList, d.f3259b);
            if (SystemClock.uptimeMillis() - this.f3249l >= 300) {
                k(arrayList);
                return;
            }
            this.f3250m.removeMessages(1);
            Handler handler = this.f3250m;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f3249l + 300);
        }
    }

    public void h(a.t.l.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f3244g.equals(fVar)) {
            return;
        }
        this.f3244g = fVar;
        if (this.f3248k) {
            this.f3241d.k(this.f3242e);
            this.f3241d.b(fVar, this.f3242e, 1);
        }
        g();
    }

    public void i() {
        getWindow().setLayout(h.a(getContext()), -2);
    }

    public void k(List<g.C0076g> list) {
        this.f3249l = SystemClock.uptimeMillis();
        this.f3245h.clear();
        this.f3245h.addAll(list);
        this.f3246i.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3248k = true;
        this.f3241d.b(this.f3244g, this.f3242e, 1);
        g();
    }

    @Override // a.b.k.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a.t.g.f3166e);
        this.f3245h = new ArrayList<>();
        this.f3246i = new c(getContext(), this.f3245h);
        ListView listView = (ListView) findViewById(a.t.d.f3155o);
        this.f3247j = listView;
        listView.setAdapter((ListAdapter) this.f3246i);
        this.f3247j.setOnItemClickListener(this.f3246i);
        this.f3247j.setEmptyView(findViewById(R.id.empty));
        this.f3243f = (TextView) findViewById(a.t.d.s);
        i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f3248k = false;
        this.f3241d.k(this.f3242e);
        this.f3250m.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // a.b.k.g, android.app.Dialog
    public void setTitle(int i2) {
        this.f3243f.setText(i2);
    }

    @Override // a.b.k.g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f3243f.setText(charSequence);
    }
}

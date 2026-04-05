package a.b.p.j;

import a.b.p.j.m;
import a.b.p.j.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m.a f453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f454j;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f455b = -1;

        public a() {
            a();
        }

        public void a() {
            i iVarV = e.this.f448d.v();
            if (iVarV != null) {
                ArrayList<i> arrayListZ = e.this.f448d.z();
                int size = arrayListZ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListZ.get(i2) == iVarV) {
                        this.f455b = i2;
                        return;
                    }
                }
            }
            this.f455b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i2) {
            ArrayList<i> arrayListZ = e.this.f448d.z();
            int i3 = i2 + e.this.f450f;
            int i4 = this.f455b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListZ.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f448d.z().size() - e.this.f450f;
            return this.f455b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f447c.inflate(eVar.f452h, viewGroup, false);
            }
            ((n.a) view).e(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i2, int i3) {
        this.f452h = i2;
        this.f451g = i3;
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.f446b = context;
        this.f447c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f454j == null) {
            this.f454j = new a();
        }
        return this.f454j;
    }

    @Override // a.b.p.j.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.f453i;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // a.b.p.j.m
    public void c(boolean z) {
        a aVar = this.f454j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.p.j.m
    public boolean d() {
        return false;
    }

    @Override // a.b.p.j.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.p.j.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.p.j.m
    public void g(m.a aVar) {
        this.f453i = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // a.b.p.j.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.content.Context r3, a.b.p.j.g r4) {
        /*
            r2 = this;
            int r0 = r2.f451g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f451g
            r0.<init>(r3, r1)
            r2.f446b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f447c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f446b
            if (r0 == 0) goto L23
            r2.f446b = r3
            android.view.LayoutInflater r0 = r2.f447c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f448d = r4
            a.b.p.j.e$a r3 = r2.f454j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.j.e.h(android.content.Context, a.b.p.j.g):void");
    }

    public n i(ViewGroup viewGroup) {
        if (this.f449e == null) {
            this.f449e = (ExpandedMenuView) this.f447c.inflate(a.b.g.f92g, viewGroup, false);
            if (this.f454j == null) {
                this.f454j = new a();
            }
            this.f449e.setAdapter((ListAdapter) this.f454j);
            this.f449e.setOnItemClickListener(this);
        }
        return this.f449e;
    }

    @Override // a.b.p.j.m
    public boolean j(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f453i;
        if (aVar == null) {
            return true;
        }
        aVar.c(rVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f448d.M(this.f454j.getItem(i2), this, 0);
    }
}

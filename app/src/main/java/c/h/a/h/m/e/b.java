package c.h.a.h.m.e;

import a.i.r.k;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.c.b.w.i;
import c.f.a.c.d.l;
import c.f.a.c.d.o;
import c.h.a.h.m.b;
import c.h.a.h.m.e.a;
import com.android.volley.toolbox.NetworkImageView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class b extends RecyclerView.h<g> implements a.InterfaceC0224a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.h.a.h.m.b f17018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f17019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f17020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f17021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f17022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f17023j;

    public class a implements b.d {
        public a() {
        }

        @Override // c.h.a.h.m.b.d
        public void a() {
            b.this.w();
        }
    }

    /* JADX INFO: renamed from: c.h.a.h.m.e.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0225b implements View.OnClickListener {
        public ViewOnClickListenerC0225b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getTag(R.string.queue_tag_item) != null) {
                Log.d("QueueListAdapter", String.valueOf(((o) view.getTag(R.string.queue_tag_item)).L()));
            }
            b.this.g0(view);
        }
    }

    public class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f17026b;

        public c(g gVar) {
            this.f17026b = gVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (k.a(motionEvent) != 0) {
                return false;
            }
            b.this.f17020g.j(this.f17026b);
            return false;
        }
    }

    public interface d {
        void a(View view);
    }

    public interface e {
        void b();

        void c();
    }

    public interface f {
        void j(RecyclerView.e0 e0Var);
    }

    public static class g extends RecyclerView.e0 implements e {
        public NetworkImageView A;
        public ViewGroup B;
        public ImageView C;
        public TextView D;
        public TextView E;
        public Context u;
        public final ImageButton v;
        public View w;
        public View x;
        public ImageButton y;
        public ImageButton z;

        public g(View view) {
            super(view);
            this.u = view.getContext();
            this.B = (ViewGroup) view.findViewById(R.id.container);
            this.C = (ImageView) view.findViewById(R.id.drag_handle);
            this.D = (TextView) view.findViewById(R.id.textView1);
            this.E = (TextView) view.findViewById(R.id.textView2);
            this.A = (NetworkImageView) view.findViewById(R.id.imageView1);
            this.v = (ImageButton) view.findViewById(R.id.play_pause);
            this.w = view.findViewById(R.id.controls);
            this.x = view.findViewById(R.id.controls_upcoming);
            this.y = (ImageButton) view.findViewById(R.id.play_upcoming);
            this.z = (ImageButton) view.findViewById(R.id.stop_upcoming);
        }

        public final void V(int i2) {
            this.D.setTextAppearance(this.u, 2132082739);
            this.E.setTextAppearance(this.u, 2132082720);
            int i3 = R.drawable.bg_item_normal_state;
            if (i2 == 0) {
                this.w.setVisibility(0);
                this.v.setVisibility(0);
            } else {
                if (i2 == 1) {
                    this.w.setVisibility(0);
                    this.v.setVisibility(8);
                    this.x.setVisibility(0);
                    this.C.setImageResource(R.drawable.ic_drag_updown_white_24dp);
                    i3 = R.drawable.bg_item_upcoming_state;
                    this.D.setTextAppearance(this.u, 2132083185);
                    TextView textView = this.D;
                    textView.setTextAppearance(textView.getContext(), 2132082740);
                    this.E.setTextAppearance(this.u, 2132082720);
                    this.B.setBackgroundResource(i3);
                }
                this.w.setVisibility(8);
                this.v.setVisibility(8);
            }
            this.x.setVisibility(8);
            this.C.setImageResource(R.drawable.ic_drag_updown_grey_24dp);
            this.B.setBackgroundResource(i3);
        }

        @Override // c.h.a.h.m.e.b.e
        public void b() {
            this.f4855b.setBackgroundColor(0);
        }

        @Override // c.h.a.h.m.e.b.e
        public void c() {
        }
    }

    public b(Context context, f fVar) {
        this.f17019f = context.getApplicationContext();
        this.f17020g = fVar;
        c.h.a.h.m.b bVarN = c.h.a.h.m.b.n(context);
        this.f17018e = bVarN;
        bVarN.z(new a());
        this.f17021h = new ViewOnClickListenerC0225b();
        S(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void F(g gVar, int i2) {
        try {
            Log.d("QueueListAdapter", "[upcoming] onBindViewHolder() for position: " + i2);
            o oVarO = this.f17018e.o(i2);
            gVar.B.setTag(R.string.queue_tag_item, oVarO);
            gVar.v.setTag(R.string.queue_tag_item, oVarO);
            gVar.y.setTag(R.string.queue_tag_item, oVarO);
            gVar.z.setTag(R.string.queue_tag_item, oVarO);
            gVar.B.setOnClickListener(this.f17021h);
            gVar.v.setOnClickListener(this.f17021h);
            gVar.y.setOnClickListener(this.f17021h);
            gVar.z.setOnClickListener(this.f17021h);
            l lVarP = oVarO.M().P();
            gVar.D.setText(lVarP.K("com.google.android.gms.cast.metadata.TITLE"));
            gVar.E.setText(lVarP.K("com.google.android.gms.cast.metadata.SUBTITLE"));
            if (!lVarP.I().isEmpty()) {
                String string = lVarP.I().get(0).J().toString();
                i iVarA = c.h.a.h.m.f.a.b(this.f17019f).a();
                this.f17023j = iVarA;
                iVarA.e(string, i.i(gVar.A, 0, 0));
                gVar.A.e(string, this.f17023j);
            }
            gVar.C.setOnTouchListener(new c(gVar));
            if (oVarO == this.f17018e.l()) {
                gVar.V(0);
                i0(gVar.v);
            } else if (oVarO == this.f17018e.s()) {
                gVar.V(1);
            } else {
                gVar.V(2);
                gVar.v.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.h.m.e.a.InterfaceC0224a
    public void e(int i2) {
        this.f17018e.y(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public g H(ViewGroup viewGroup, int i2) {
        return new g(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.queue_row, viewGroup, false));
    }

    public final void g0(View view) {
        d dVar = this.f17022i;
        if (dVar != null) {
            dVar.a(view);
        }
    }

    @Override // c.h.a.h.m.e.a.InterfaceC0224a
    public boolean h(int i2, int i3) {
        if (i2 == i3) {
            return false;
        }
        this.f17018e.u(i2, i3);
        z(i2, i3);
        return true;
    }

    public void h0(d dVar) {
        this.f17022i = dVar;
    }

    public final void i0(ImageButton imageButton) {
        int i2;
        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.f17019f).c().c();
        c.f.a.c.d.u.u.i iVarP = dVarC == null ? null : dVarC.p();
        if (iVarP == null) {
            imageButton.setVisibility(8);
            return;
        }
        int iN = iVarP.n();
        if (iN == 2) {
            i2 = R.drawable.hplib_ic_pause;
        } else {
            if (iN != 3) {
                imageButton.setVisibility(8);
                return;
            }
            i2 = R.drawable.hp_play;
        }
        imageButton.setImageResource(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return c.h.a.h.m.b.n(this.f17019f).k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long q(int i2) {
        return this.f17018e.o(i2).L();
    }
}

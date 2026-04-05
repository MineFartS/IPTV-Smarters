package c.h.a.k.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c.h.a.k.b.c<c.h.a.g.c.a, c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static c.h.a.k.d.a.a f17391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f17394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f17395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c.h.a.i.j> f17396m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f17397b;

        public a(c cVar) {
            this.f17397b = cVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!view.isSelected() && b.this.l0()) {
                c.h.a.c.a(b.this.f17420e).b(R.string.vw_up_to_max);
                return;
            }
            if (view.isSelected()) {
                this.f17397b.y.setSelected(false);
                b.e0(b.this);
            } else {
                this.f17397b.y.setSelected(true);
                b.c0(b.this);
            }
            ((c.h.a.g.c.a) b.this.f17421f.get(this.f17397b.n())).E(this.f17397b.y.isSelected());
            p<T> pVar = b.this.f17422g;
            if (pVar != 0) {
                pVar.a(this.f17397b.y.isSelected(), b.this.f17421f.get(this.f17397b.n()));
            }
        }
    }

    /* JADX INFO: renamed from: c.h.a.k.b.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0235b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.h.a.g.c.a f17399b;

        public ViewOnClickListenerC0235b(c.h.a.g.c.a aVar) {
            this.f17399b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v25 */
        /* JADX WARN: Type inference failed for: r6v27 */
        /* JADX WARN: Type inference failed for: r6v28 */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent;
            Uri uriE = "file://";
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent2.setFlags(1);
                        File file = new File(this.f17399b.q());
                        uriE = FileProvider.e(b.this.f17420e, b.this.f17420e.getApplicationContext().getPackageName() + ".provider", file);
                    } else {
                        uriE = Uri.parse("file://" + this.f17399b.q());
                    }
                } catch (Exception unused) {
                    uriE = Uri.parse(uriE + this.f17399b.q());
                }
                intent2.setDataAndType(uriE, "audio/mp3");
                if (!c.h.a.d.a(b.this.f17420e, intent2)) {
                    c.h.a.c.a(b.this.f17420e).c(b.this.f17420e.getString(R.string.vw_no_audio_play_app));
                    return;
                }
                b bVar = b.this;
                if (bVar.f17420e == null || !bVar.f17394k.booleanValue()) {
                    return;
                }
                c.h.a.k.d.a.a unused2 = b.f17391h = new c.h.a.k.d.a.a(b.this.f17420e);
                if (b.f17391h.x() == 3) {
                    b.f17391h.U(b.this.f17395l.getResources().getString(R.string.hardware_decoder));
                    intent = new Intent(b.this.f17420e, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(b.this.f17420e, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("type", "devicedata");
                intent.putExtra("VIDEO_NUM", 0);
                intent.putExtra("VIDEO_PATH", this.f17399b.q());
                b.this.f17420e.startActivity(intent);
            } catch (Exception e2) {
                c.h.a.c.a(b.this.f17420e).c(e2.getMessage());
            }
        }
    }

    public class c extends RecyclerView.e0 {
        public TextView u;
        public TextView v;
        public TextView w;
        public TextView x;
        public ImageView y;
        public ImageView z;

        public c(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_audio_title);
            this.v = (TextView) view.findViewById(R.id.tv_size);
            this.w = (TextView) view.findViewById(R.id.tv_duration);
            this.x = (TextView) view.findViewById(R.id.tv_modified_date);
            this.y = (ImageView) view.findViewById(R.id.cbx);
            this.z = (ImageView) view.findViewById(R.id.ic_audio);
        }
    }

    public b(Context context, int i2) {
        this(context, new ArrayList(), i2);
    }

    public b(Context context, ArrayList<c.h.a.g.c.a> arrayList, int i2) {
        super(context, arrayList);
        this.f17393j = 0;
        this.f17394k = Boolean.TRUE;
        this.f17396m = new ArrayList<>();
        this.f17392i = i2;
        this.f17395l = context;
    }

    public static /* synthetic */ int c0(b bVar) {
        int i2 = bVar.f17393j;
        bVar.f17393j = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int e0(b bVar) {
        int i2 = bVar.f17393j;
        bVar.f17393j = i2 - 1;
        return i2;
    }

    public boolean l0() {
        return this.f17393j >= this.f17392i;
    }

    public ArrayList<c.h.a.i.j> m0(ArrayList<c.h.a.i.j> arrayList) {
        this.f17396m = arrayList;
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void F(c cVar, int i2) {
        c.h.a.g.c.a aVar = (c.h.a.g.c.a) this.f17421f.get(i2);
        try {
            this.f17396m.get(i2).a();
            cVar.v.setText("Size: " + this.f17396m.get(i2).e());
            cVar.u.setText(this.f17396m.get(i2).d().substring(0, 1).toUpperCase() + this.f17396m.get(i2).d().substring(1));
            cVar.x.setText("Modified:" + new Date(this.f17396m.get(i2).c()));
            cVar.w.setText("Duration: " + this.f17396m.get(i2).b());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (aVar.t()) {
                cVar.y.setSelected(true);
            } else {
                cVar.y.setSelected(false);
            }
        } catch (Exception unused) {
        }
        try {
            if (this.f17396m.get(i2).a() != null) {
                cVar.z.setImageBitmap(this.f17396m.get(i2).a());
            } else {
                cVar.z.setImageDrawable(this.f17395l.getResources().getDrawable(R.drawable.ic_music_note_black_44dp));
            }
        } catch (Exception unused2) {
            cVar.z.setImageDrawable(this.f17395l.getResources().getDrawable(R.drawable.ic_music_note_black_44dp));
        }
        cVar.y.setOnClickListener(new a(cVar));
        cVar.f4855b.setOnClickListener(new ViewOnClickListenerC0235b(aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f17421f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public c H(ViewGroup viewGroup, int i2) {
        return new c(LayoutInflater.from(this.f17420e).inflate(R.layout.vw_layout_item_audio_pick, viewGroup, false));
    }

    public void p0(int i2) {
        this.f17393j = i2;
    }
}

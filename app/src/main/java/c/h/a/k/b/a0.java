package c.h.a.k.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class a0 extends c<c.h.a.g.c.f, b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static c.h.a.k.d.a.a f17381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f17386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f17388o;
    public ArrayList<c.h.a.i.k> p;
    public ArrayList<String> q;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.h.a.g.c.f f17389b;

        public a(c.h.a.g.c.f fVar) {
            this.f17389b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriFromFile;
            Intent intent;
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent2.setFlags(1);
                    File file = new File(this.f17389b.q());
                    a0.this.f17387n = file.length() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    uriFromFile = Uri.fromFile(file);
                } else {
                    uriFromFile = Uri.parse("file://" + this.f17389b.q());
                }
                intent2.setDataAndType(uriFromFile, "video/mp4");
                String strSubstring = this.f17389b.q().substring(0, this.f17389b.q().lastIndexOf(InstructionFileId.DOT));
                a0.this.f17388o = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
                if (!c.h.a.d.a(a0.this.f17420e, intent2)) {
                    c.h.a.c.a(a0.this.f17420e).c(a0.this.f17420e.getString(R.string.vw_no_video_play_app));
                    return;
                }
                a0 a0Var = a0.this;
                if (a0Var.f17420e == null || !a0Var.f17386m.booleanValue()) {
                    return;
                }
                c.h.a.k.d.a.a unused = a0.f17381h = new c.h.a.k.d.a.a(a0.this.f17420e);
                if (a0.f17381h.x() == 3) {
                    a0.f17381h.U("Hardware Decoder");
                    intent = new Intent(a0.this.f17420e, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(a0.this.f17420e, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("type", "devicedata");
                intent.putExtra("VIDEO_NUM", 0);
                intent.putExtra("VIDEO_PATH", this.f17389b.q());
                a0.this.f17420e.startActivity(intent);
            } catch (Exception e2) {
                c.h.a.c.a(a0.this.f17420e).c(e2.getMessage());
            }
        }
    }

    public class b extends RecyclerView.e0 {
        public ImageView u;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;

        public b(View view) {
            super(view);
            this.u = (ImageView) view.findViewById(R.id.iv_thumbnail);
            TextView textView = (TextView) view.findViewById(R.id.txt_name);
            this.y = textView;
            textView.setSelected(true);
            this.w = (TextView) view.findViewById(R.id.txt_size);
            this.x = (TextView) view.findViewById(R.id.tv_modified_date);
            this.v = (TextView) view.findViewById(R.id.txt_duration);
        }
    }

    public a0(Context context, ArrayList<c.h.a.g.c.f> arrayList, boolean z, int i2) {
        super(context, arrayList);
        this.f17384k = 0;
        this.f17386m = Boolean.TRUE;
        this.p = new ArrayList<>();
        this.q = new ArrayList<>();
        this.f17382i = z;
        this.f17383j = i2;
    }

    public a0(Context context, boolean z, int i2) {
        this(context, new ArrayList(), z, i2);
    }

    public boolean h0() {
        return this.f17384k >= this.f17383j;
    }

    public ArrayList<c.h.a.i.k> i0(ArrayList<c.h.a.i.k> arrayList) {
        this.p = arrayList;
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void F(b bVar, int i2) {
        bVar.u.setVisibility(0);
        c.h.a.g.c.f fVar = (c.h.a.g.c.f) (this.f17382i ? this.f17421f.get(i2 - 1) : this.f17421f.get(i2));
        try {
            c.d.a.g.u(this.f17420e).q(fVar.q()).l(bVar.u);
        } catch (Exception unused) {
        }
        fVar.t();
        bVar.f4855b.setOnClickListener(new a(fVar));
        try {
            this.p.get(i2).f();
            this.p.get(i2).g();
            this.p.get(i2).e();
            this.p.get(i2).a();
            this.p.get(i2).b();
            this.p.get(i2).c();
            this.p.get(i2).d();
            bVar.x.setText("Modified:" + new Date(this.p.get(i2).e()));
            bVar.v.setText("Duration: " + this.p.get(i2).a());
            bVar.y.setText(this.p.get(i2).f());
            bVar.w.setText("Size: " + this.p.get(i2).g() + " video/" + this.p.get(i2).b() + " " + this.p.get(i2).d() + "x" + this.p.get(i2).c());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b H(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(this.f17420e).inflate(R.layout.vw_layout_item_video_pick, viewGroup, false);
        viewInflate.getLayoutParams();
        return new b(viewInflate);
    }

    public void n0(int i2) {
        this.f17384k = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f17421f.size();
    }
}

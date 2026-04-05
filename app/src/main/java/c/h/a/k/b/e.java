package c.h.a.k.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import minefarts.iptvsmarters.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class e extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f17433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f17434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f17435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f17436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.h.a.i.q.a f17437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f17438g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f17439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f17440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f17441c;
    }

    public e(Context context, List<String> list) {
        this.f17434c = null;
        this.f17434c = list;
        this.f17433b = list;
        this.f17436e = context;
        this.f17435d = LayoutInflater.from(context);
        this.f17437f = new c.h.a.i.q.a(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f17434c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return this.f17434c.get(i2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            try {
                view = ((LayoutInflater) this.f17436e.getSystemService("layout_inflater")).inflate(R.layout.select_dialog_item_folder, (ViewGroup) null);
                a aVar = new a();
                this.f17438g = aVar;
                aVar.f17439a = (TextView) view.findViewById(R.id.list_view);
                this.f17438g.f17440b = (ImageView) view.findViewById(R.id.tv_logo);
                this.f17438g.f17441c = (LinearLayout) view.findViewById(R.id.ll_list_view);
                view.setTag(this.f17438g);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            this.f17438g = (a) view.getTag();
        }
        try {
            if (this.f17434c.get(i2).endsWith(".m3u") || this.f17434c.get(i2).endsWith(".m3u8")) {
                this.f17438g.f17440b.setBackgroundResource(R.drawable.l_file);
            } else {
                this.f17438g.f17440b.setBackgroundResource(R.drawable.folder_icon);
            }
            this.f17438g.f17439a.setText(this.f17434c.get(i2));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return view;
    }
}

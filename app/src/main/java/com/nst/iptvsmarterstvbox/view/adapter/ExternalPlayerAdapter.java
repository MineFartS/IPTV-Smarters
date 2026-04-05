package com.nst.iptvsmarterstvbox.view.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ExternalPlayerAdapter extends RecyclerView.h<ViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<ApplicationInfo> f27294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PackageManager f27295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f27296h;

    public class ViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView iv_app_logo;

        @BindView
        public LinearLayout ll_outer;

        @BindView
        public TextView tv_appname;

        @BindView
        public TextView tv_packagename;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f27297b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27297b = viewHolder;
            viewHolder.tv_packagename = (TextView) c.c(view, R.id.tv_packagename, "field 'tv_packagename'", TextView.class);
            viewHolder.tv_appname = (TextView) c.c(view, R.id.tv_appname, "field 'tv_appname'", TextView.class);
            viewHolder.iv_app_logo = (ImageView) c.c(view, R.id.iv_app_logo, "field 'iv_app_logo'", ImageView.class);
            viewHolder.ll_outer = (LinearLayout) c.c(view, R.id.ll_outer, "field 'll_outer'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f27297b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27297b = null;
            viewHolder.tv_packagename = null;
            viewHolder.tv_appname = null;
            viewHolder.iv_app_logo = null;
            viewHolder.ll_outer = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27298b;

        public a(int i2) {
            this.f27298b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExternalPlayerAdapter externalPlayerAdapter = ExternalPlayerAdapter.this;
            externalPlayerAdapter.f27296h.G(view, ((ApplicationInfo) externalPlayerAdapter.f27294f.get(this.f27298b)).loadLabel(ExternalPlayerAdapter.this.f27295g).toString(), ((ApplicationInfo) ExternalPlayerAdapter.this.f27294f.get(this.f27298b)).packageName);
        }
    }

    public interface b {
        void G(View view, String str, String str2);
    }

    public ExternalPlayerAdapter(Context context, List<ApplicationInfo> list, b bVar) {
        this.f27293e = context;
        this.f27294f = list;
        this.f27295g = context.getPackageManager();
        this.f27296h = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void F(ViewHolder viewHolder, int i2) {
        viewHolder.tv_appname.setText(this.f27294f.get(i2).loadLabel(this.f27295g));
        viewHolder.tv_packagename.setText(this.f27294f.get(i2).packageName);
        viewHolder.iv_app_logo.setImageDrawable(this.f27294f.get(i2).loadIcon(this.f27295g));
        viewHolder.ll_outer.setOnClickListener(new a(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public ViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (new c.h.a.k.d.a.a(this.f27293e).A().equals(c.h.a.h.n.a.s0)) {
            layoutInflaterFrom = LayoutInflater.from(this.f27293e);
            i3 = R.layout.custom_externalplayer_layout_tv;
        } else {
            layoutInflaterFrom = LayoutInflater.from(this.f27293e);
            i3 = R.layout.custom_externalplayer_layout;
        }
        return new ViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27294f.size();
    }
}

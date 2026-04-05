package c.h.a.k.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.BillingDeviceInfo;
import minefarts.iptvsmarters.view.activity.APPInPurchaseActivity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class d extends RecyclerView.h<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<BillingDeviceInfo> f17423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f17424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17426h;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17427b;

        public a(int i2) {
            this.f17427b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f17426h = this.f17427b;
            ((APPInPurchaseActivity) d.this.f17424f).N(((BillingDeviceInfo) d.this.f17423e.get(this.f17427b)).a(), ((BillingDeviceInfo) d.this.f17423e.get(this.f17427b)).b());
            d.this.w();
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f17430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17431d;

        public b(View view, c cVar, int i2) {
            this.f17431d = 0;
            this.f17429b = view;
            this.f17430c = cVar;
            this.f17431d = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
        }
    }

    public static class c extends RecyclerView.e0 {
        public TextView u;
        public RelativeLayout v;
        public ImageView w;

        public c(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_cat_name);
            this.v = (RelativeLayout) view.findViewById(R.id.rl_sidebar);
            this.w = (ImageView) view.findViewById(R.id.iv_checkbox);
        }
    }

    public d(Context context, List<BillingDeviceInfo> list) {
        this.f17425g = "mobile";
        this.f17424f = context;
        ArrayList arrayList = new ArrayList();
        this.f17423e = arrayList;
        arrayList.addAll(list);
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f17425g = "tv";
        } else {
            this.f17425g = "mobile";
        }
        this.f17426h = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void F(@NotNull c cVar, int i2) {
        try {
            cVar.u.setText(this.f17423e.get(i2).a());
            if (this.f17426h == i2) {
                cVar.w.setImageResource(R.drawable.green_tick);
                cVar.v.requestFocus();
            } else {
                cVar.w.setImageResource(R.drawable.empty_circle_black);
            }
            RelativeLayout relativeLayout = cVar.v;
            relativeLayout.setOnFocusChangeListener(new b(relativeLayout, cVar, i2));
            cVar.v.setOnClickListener(new a(i2));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public c H(ViewGroup viewGroup, int i2) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_devices_adapter, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        List<BillingDeviceInfo> list = this.f17423e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}

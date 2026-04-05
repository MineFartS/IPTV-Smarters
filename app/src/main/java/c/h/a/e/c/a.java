package c.h.a.e.c;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.WHMCSClientapp.activities.ShowserviceInformationActivity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a extends RecyclerView.h<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f16694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.e.e.a> f16695f;

    /* JADX INFO: renamed from: c.h.a.e.c.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0207a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f16696b;

        public ViewOnClickListenerC0207a(c cVar) {
            this.f16696b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(a.this.f16694e, (Class<?>) ShowserviceInformationActivity.class);
            intent.putExtra("product", a.this.f16695f.get(this.f16696b.n()).d());
            intent.putExtra("status", a.this.f16695f.get(this.f16696b.n()).i());
            intent.putExtra("Registration_date", a.this.f16695f.get(this.f16696b.n()).h());
            intent.putExtra("next_due_date", a.this.f16695f.get(this.f16696b.n()).e());
            intent.putExtra("recurring_amount", a.this.f16695f.get(this.f16696b.n()).g());
            intent.putExtra("billing_cycle", a.this.f16695f.get(this.f16696b.n()).a());
            intent.putExtra("payment_method", a.this.f16695f.get(this.f16696b.n()).f());
            intent.putExtra("first_time_payment", a.this.f16695f.get(this.f16696b.n()).b());
            a.this.f16694e.startActivity(intent);
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f16698b;

        public b(View view) {
            this.f16698b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16698b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16698b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16698b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (z) {
                f2 = z ? 1.04f : 1.0f;
                b(f2);
                c(f2);
                Log.e("id is", BuildConfig.FLAVOR + this.f16698b.getTag());
                view2 = this.f16698b;
                i2 = R.drawable.shape_list_multidns_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.04f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f16698b;
                i2 = R.drawable.shape_list_multidns;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public class c extends RecyclerView.e0 {
        public TextView u;
        public TextView v;
        public TextView w;
        public LinearLayout x;

        public c(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_title);
            this.v = (TextView) view.findViewById(R.id.tv_pricing);
            this.w = (TextView) view.findViewById(R.id.tv_next_due_date);
            this.x = (LinearLayout) view.findViewById(R.id.ll_outer);
        }
    }

    public a(Context context, ArrayList<c.h.a.e.e.a> arrayList) {
        this.f16694e = context;
        this.f16695f = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(c.h.a.e.c.a.c r7, int r8) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.e.c.a.F(c.h.a.e.c.a$c, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public c H(ViewGroup viewGroup, int i2) {
        return new c(LayoutInflater.from(this.f16694e).inflate(R.layout.all_services_adapter_custom_list_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f16695f.size();
    }
}

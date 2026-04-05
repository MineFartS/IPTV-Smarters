package com.nst.iptvsmarterstvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeasonsButtonAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<Integer> f27743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PopupWindow f27744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MyViewHolder f27746i;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public TextView ButtonSeason;

        @BindView
        public LinearLayout ll_button;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27747b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27747b = myViewHolder;
            myViewHolder.ll_button = (LinearLayout) c.c(view, R.id.ll_button, "field 'll_button'", LinearLayout.class);
            myViewHolder.ButtonSeason = (TextView) c.c(view, R.id.tv_button_season, "field 'ButtonSeason'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27747b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27747b = null;
            myViewHolder.ll_button = null;
            myViewHolder.ButtonSeason = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27748b;

        public a(int i2) {
            this.f27748b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SeasonsButtonAdapter.this.f27742e instanceof SeriesDetailActivity) {
                ((SeriesDetailActivity) SeasonsButtonAdapter.this.f27742e).f1(((Integer) SeasonsButtonAdapter.this.f27743f.get(this.f27748b)).intValue());
            }
            if (SeasonsButtonAdapter.this.f27744g != null) {
                SeasonsButtonAdapter.this.f27744g.dismiss();
            }
        }
    }

    public static class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27750b;

        public b(View view) {
            this.f27750b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27750b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27750b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27750b, "scaleY", f2);
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
                f2 = z ? 1.1f : 1.0f;
                Log.e("id is", BuildConfig.FLAVOR + this.f27750b.getTag());
                if (this.f27750b.getTag() == null || !this.f27750b.getTag().equals("20")) {
                    b(f2);
                    return;
                } else {
                    b(f2);
                    view2 = this.f27750b;
                    i2 = R.drawable.back_btn_effect;
                }
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(z);
                if (this.f27750b.getTag() == null || !this.f27750b.getTag().equals("20")) {
                    b(f2);
                    c(f2);
                    return;
                } else {
                    b(f2);
                    c(f2);
                    view2 = this.f27750b;
                    i2 = R.drawable.black_button_dark;
                }
            }
            view2.setBackgroundResource(i2);
        }
    }

    public SeasonsButtonAdapter(Context context, ArrayList<Integer> arrayList, PopupWindow popupWindow, int i2) {
        this.f27743f = arrayList;
        this.f27742e = context;
        this.f27744g = popupWindow;
        this.f27745h = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        if (this.f27742e != null) {
            if (this.f27745h == this.f27743f.get(i2).intValue()) {
                myViewHolder.ll_button.setBackgroundResource(R.drawable.back_btn_effect);
                myViewHolder.ll_button.requestFocus();
            }
            myViewHolder.ButtonSeason.setText(this.f27742e.getResources().getString(R.string.season_number) + " - " + this.f27743f.get(i2));
            myViewHolder.ll_button.setOnClickListener(new a(i2));
            LinearLayout linearLayout = myViewHolder.ll_button;
            linearLayout.setOnFocusChangeListener(new b(linearLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.seasons_button_layout, viewGroup, false));
        this.f27746i = myViewHolder;
        return myViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27743f.size();
    }
}

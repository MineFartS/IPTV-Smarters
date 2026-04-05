package minefarts.iptvsmarters.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.k.b.e;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.TMDBCastsPojo;
import minefarts.iptvsmarters.view.activity.ViewDetailsCastActivity;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class CastAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<TMDBCastsPojo> f27221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27222g;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView tv_cast_name;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27223b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27223b = myViewHolder;
            myViewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            myViewHolder.tv_cast_name = (TextView) b.c.c.c(view, R.id.tv_cast_name, "field 'tv_cast_name'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27223b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27223b = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.tv_cast_name = null;
        }
    }

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27224a;

        public a(MyViewHolder myViewHolder) {
            this.f27224a = myViewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            ImageView imageView;
            Drawable drawableF;
            if (Build.VERSION.SDK_INT >= 21) {
                imageView = this.f27224a.MovieImage;
                drawableF = CastAdapter.this.f27220e.getResources().getDrawable(R.drawable.rounded_edge_3, null);
            } else {
                imageView = this.f27224a.MovieImage;
                drawableF = a.i.i.b.f(CastAdapter.this.f27220e, R.drawable.rounded_edge_3);
            }
            imageView.setImageDrawable(drawableF);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27226b;

        public b(int i2) {
            this.f27226b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            try {
                string = ((TMDBCastsPojo) CastAdapter.this.f27221f.get(this.f27226b)).a().toString();
            } catch (Exception unused) {
                string = "0";
            }
            if (string.equals("0")) {
                return;
            }
            CastAdapter.this.h0(string, ((TMDBCastsPojo) CastAdapter.this.f27221f.get(this.f27226b)).b(), ((TMDBCastsPojo) CastAdapter.this.f27221f.get(this.f27226b)).c());
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27228b;

        public c(int i2) {
            this.f27228b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            try {
                string = ((TMDBCastsPojo) CastAdapter.this.f27221f.get(this.f27228b)).a().toString();
            } catch (Exception unused) {
                string = "0";
            }
            if (string.equals("0")) {
                return;
            }
            CastAdapter.this.h0(string, ((TMDBCastsPojo) CastAdapter.this.f27221f.get(this.f27228b)).b(), ((TMDBCastsPojo) CastAdapter.this.f27221f.get(this.f27228b)).c());
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27230b;

        public d(View view) {
            this.f27230b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27230b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27230b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27230b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(z);
                if ((this.f27230b.getTag() == null || !this.f27230b.getTag().equals("1")) && (this.f27230b.getTag() == null || !this.f27230b.getTag().equals("2"))) {
                    return;
                }
                b(f2);
                c(f2);
                this.f27230b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.1f : 1.0f;
            Log.e("id is", BuildConfig.FLAVOR + this.f27230b.getTag());
            if (this.f27230b.getTag() != null && this.f27230b.getTag().equals("1")) {
                b(f2);
                view2 = this.f27230b;
                i2 = R.drawable.back_btn_effect;
            } else {
                if (this.f27230b.getTag() == null || !this.f27230b.getTag().equals("2")) {
                    return;
                }
                b(f2);
                view2 = this.f27230b;
                i2 = R.drawable.logout_btn_effect;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public CastAdapter(List<TMDBCastsPojo> list, Context context, boolean z, String str) {
        this.f27222g = BuildConfig.FLAVOR;
        this.f27221f = list;
        this.f27220e = context;
        this.f27222g = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, @SuppressLint({"RecyclerView"}) int i2) {
        ImageView imageView;
        Drawable drawableF;
        if (this.f27220e != null) {
            String str = "https://image.tmdb.org/t/p/w500/" + this.f27221f.get(i2).c();
            myViewHolder.MovieImage.setImageDrawable(null);
            if (str.equals(BuildConfig.FLAVOR)) {
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView = myViewHolder.MovieImage;
                    drawableF = this.f27220e.getResources().getDrawable(R.drawable.rounded_edge_3, null);
                } else {
                    imageView = myViewHolder.MovieImage;
                    drawableF = a.i.i.b.f(this.f27220e, R.drawable.rounded_edge_3);
                }
                imageView.setImageDrawable(drawableF);
            } else {
                t.q(this.f27220e).l(str).h(myViewHolder.MovieImage, new a(myViewHolder));
            }
            myViewHolder.tv_cast_name.setText(this.f27221f.get(i2).b());
            myViewHolder.tv_cast_name.setVisibility(0);
            myViewHolder.MovieImage.setOnClickListener(new b(i2));
            myViewHolder.Movie.setOnClickListener(new c(i2));
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new d(relativeLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (new c.h.a.k.d.a.a(this.f27220e).A().equals(c.h.a.h.n.a.s0)) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.cast_grid_layout_tv;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.cast_grid_layout;
        }
        return new MyViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    public final void h0(String str, String str2, String str3) {
        if (this.f27220e == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = new Intent(this.f27220e, (Class<?>) ViewDetailsCastActivity.class);
        intent.putExtra("castID", str);
        intent.putExtra("castName", str2);
        intent.putExtra("profilePath", str3);
        intent.putExtra("streamBackdrop", this.f27222g);
        this.f27220e.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27221f.size();
    }
}

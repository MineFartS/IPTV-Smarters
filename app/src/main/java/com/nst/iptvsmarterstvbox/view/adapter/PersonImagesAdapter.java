package com.nst.iptvsmarterstvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.k.b.e;
import c.k.b.t;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBPersonProfilePojo;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class PersonImagesAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<TMDBPersonProfilePojo> f27687f;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27688b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27688b = myViewHolder;
            myViewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27688b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27688b = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
        }
    }

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27689a;

        public a(MyViewHolder myViewHolder) {
            this.f27689a = myViewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            ImageView imageView;
            Drawable drawableF;
            if (Build.VERSION.SDK_INT >= 21) {
                imageView = this.f27689a.MovieImage;
                drawableF = PersonImagesAdapter.this.f27686e.getResources().getDrawable(R.drawable.rounded_edge_3, null);
            } else {
                imageView = this.f27689a.MovieImage;
                drawableF = a.i.i.b.f(PersonImagesAdapter.this.f27686e, R.drawable.rounded_edge_3);
            }
            imageView.setImageDrawable(drawableF);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27692b;

        public c(View view) {
            this.f27692b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27692b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27692b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27692b, "scaleY", f2);
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
                if ((this.f27692b.getTag() == null || !this.f27692b.getTag().equals("1")) && (this.f27692b.getTag() == null || !this.f27692b.getTag().equals("2"))) {
                    return;
                }
                b(f2);
                c(f2);
                this.f27692b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.1f : 1.0f;
            Log.e("id is", BuildConfig.FLAVOR + this.f27692b.getTag());
            if (this.f27692b.getTag() != null && this.f27692b.getTag().equals("1")) {
                b(f2);
                view2 = this.f27692b;
                i2 = R.drawable.back_btn_effect;
            } else {
                if (this.f27692b.getTag() == null || !this.f27692b.getTag().equals("2")) {
                    return;
                }
                b(f2);
                view2 = this.f27692b;
                i2 = R.drawable.logout_btn_effect;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public PersonImagesAdapter(List<TMDBPersonProfilePojo> list, Context context, boolean z) {
        this.f27687f = list;
        this.f27686e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, @SuppressLint({"RecyclerView"}) int i2) {
        ImageView imageView;
        Drawable drawableF;
        if (this.f27686e != null) {
            String str = "https://image.tmdb.org/t/p/w500/" + this.f27687f.get(i2).a();
            myViewHolder.MovieImage.setImageDrawable(null);
            if (str.equals(BuildConfig.FLAVOR)) {
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView = myViewHolder.MovieImage;
                    drawableF = this.f27686e.getResources().getDrawable(R.drawable.rounded_edge_3, null);
                } else {
                    imageView = myViewHolder.MovieImage;
                    drawableF = a.i.i.b.f(this.f27686e, R.drawable.rounded_edge_3);
                }
                imageView.setImageDrawable(drawableF);
            } else {
                t.q(this.f27686e).l(str).h(myViewHolder.MovieImage, new a(myViewHolder));
            }
            myViewHolder.MovieImage.setOnClickListener(new b());
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new c(relativeLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cast_grid_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27687f.size();
    }
}

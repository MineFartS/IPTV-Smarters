package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ViewDetailsTMDBActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewDetailsTMDBActivity f27014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f27015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f27016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f27017e;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewDetailsTMDBActivity f27018d;

        public a(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f27018d = viewDetailsTMDBActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f27018d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewDetailsTMDBActivity f27020d;

        public b(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f27020d = viewDetailsTMDBActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f27020d.onViewClicked(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewDetailsTMDBActivity f27022d;

        public c(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f27022d = viewDetailsTMDBActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f27022d.onViewClicked(view);
        }
    }

    public ViewDetailsTMDBActivity_ViewBinding(ViewDetailsTMDBActivity viewDetailsTMDBActivity, View view) {
        this.f27014b = viewDetailsTMDBActivity;
        viewDetailsTMDBActivity.toolbar = (Toolbar) b.c.c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        viewDetailsTMDBActivity.appbarToolbar = (AppBarLayout) b.c.c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        viewDetailsTMDBActivity.rlAccountInfo = (RelativeLayout) b.c.c.c(view, R.id.rl_account_info, "field 'rlAccountInfo'", RelativeLayout.class);
        viewDetailsTMDBActivity.ivMovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'ivMovieImage'", ImageView.class);
        viewDetailsTMDBActivity.tvMovieName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'tvMovieName'", TextView.class);
        View viewB = b.c.c.b(view, R.id.tv_play, "field 'tvPlay' and method 'onViewClicked'");
        viewDetailsTMDBActivity.tvPlay = (TextView) b.c.c.a(viewB, R.id.tv_play, "field 'tvPlay'", TextView.class);
        this.f27015c = viewB;
        viewB.setOnClickListener(new a(viewDetailsTMDBActivity));
        viewDetailsTMDBActivity.tvMovieInfo = (TextView) b.c.c.c(view, R.id.tv_movie_info, "field 'tvMovieInfo'", TextView.class);
        viewDetailsTMDBActivity.tvDirector = (TextView) b.c.c.c(view, R.id.tv_director, "field 'tvDirector'", TextView.class);
        viewDetailsTMDBActivity.tvDirectorInfo = (TextView) b.c.c.c(view, R.id.tv_director_info, "field 'tvDirectorInfo'", TextView.class);
        viewDetailsTMDBActivity.tvCast = (TextView) b.c.c.c(view, R.id.tv_cast, "field 'tvCast'", TextView.class);
        viewDetailsTMDBActivity.tvCastInfo = (TextView) b.c.c.c(view, R.id.tv_cast_info, "field 'tvCastInfo'", TextView.class);
        viewDetailsTMDBActivity.tvReleaseDate = (TextView) b.c.c.c(view, R.id.tv_release_date, "field 'tvReleaseDate'", TextView.class);
        viewDetailsTMDBActivity.tvReleaseDateInfo = (TextView) b.c.c.c(view, R.id.tv_release_date_info, "field 'tvReleaseDateInfo'", TextView.class);
        viewDetailsTMDBActivity.logo = (ImageView) b.c.c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        viewDetailsTMDBActivity.ratingBar = (RatingBar) b.c.c.c(view, R.id.rating, "field 'ratingBar'", RatingBar.class);
        viewDetailsTMDBActivity.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
        viewDetailsTMDBActivity.tvMovieGenere = (TextView) b.c.c.c(view, R.id.tv_movie_genere, "field 'tvMovieGenere'", TextView.class);
        viewDetailsTMDBActivity.tv_genre_info = (TextView) b.c.c.c(view, R.id.tv_genre_info, "field 'tv_genre_info'", TextView.class);
        viewDetailsTMDBActivity.tvMovieDuration = (TextView) b.c.c.c(view, R.id.tv_movie_duration, "field 'tvMovieDuration'", TextView.class);
        viewDetailsTMDBActivity.tvMovieDurationInfo = (TextView) b.c.c.c(view, R.id.tv_movie_duration_info, "field 'tvMovieDurationInfo'", TextView.class);
        viewDetailsTMDBActivity.llMovieInfoBox = (LinearLayout) b.c.c.c(view, R.id.ll_movie_info_box, "field 'llMovieInfoBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llDirectorBox = (LinearLayout) b.c.c.c(view, R.id.ll_director_box, "field 'llDirectorBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llReleasedBox = (LinearLayout) b.c.c.c(view, R.id.ll_released_box, "field 'llReleasedBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llDurationBox = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box, "field 'llDurationBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llGenreBox = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box, "field 'llGenreBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llCastBox = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box, "field 'llCastBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llDirectorBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_director_box_info, "field 'llDirectorBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llReleasedBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_released_box_info, "field 'llReleasedBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llDurationBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box_info, "field 'llDurationBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llGenreBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box_info, "field 'llGenreBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llCastBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box_info, "field 'llCastBoxInfo'", LinearLayout.class);
        View viewB2 = b.c.c.b(view, R.id.tv_readmore, "field 'tvReadMore' and method 'onViewClicked'");
        viewDetailsTMDBActivity.tvReadMore = (TextView) b.c.c.a(viewB2, R.id.tv_readmore, "field 'tvReadMore'", TextView.class);
        this.f27016d = viewB2;
        viewB2.setOnClickListener(new b(viewDetailsTMDBActivity));
        viewDetailsTMDBActivity.ll_watch_trailer = (LinearLayout) b.c.c.c(view, R.id.ll_watch_trailer, "field 'll_watch_trailer'", LinearLayout.class);
        View viewB3 = b.c.c.b(view, R.id.tv_watch_trailer, "field 'tvWatchTrailer' and method 'onViewClicked'");
        viewDetailsTMDBActivity.tvWatchTrailer = (TextView) b.c.c.a(viewB3, R.id.tv_watch_trailer, "field 'tvWatchTrailer'", TextView.class);
        this.f27017e = viewB3;
        viewB3.setOnClickListener(new c(viewDetailsTMDBActivity));
        viewDetailsTMDBActivity.rlTransparent = (RelativeLayout) b.c.c.c(view, R.id.rl_transparent, "field 'rlTransparent'", RelativeLayout.class);
        viewDetailsTMDBActivity.scrollView = (ScrollView) b.c.c.c(view, R.id.scrollView, "field 'scrollView'", ScrollView.class);
        viewDetailsTMDBActivity.nestedScrollView = (NestedScrollView) b.c.c.c(view, R.id.nestedScrollView, "field 'nestedScrollView'", NestedScrollView.class);
        viewDetailsTMDBActivity.rvCast = (RecyclerView) b.c.c.c(view, R.id.rv_cast, "field 'rvCast'", RecyclerView.class);
        viewDetailsTMDBActivity.iv_back_button = (ImageView) b.c.c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
        viewDetailsTMDBActivity.ll_play_button_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_play_button_main_layout, "field 'll_play_button_main_layout'", LinearLayout.class);
        viewDetailsTMDBActivity.ll_watch_trailer_button_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_watch_trailer_button_main_layout, "field 'll_watch_trailer_button_main_layout'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ViewDetailsTMDBActivity viewDetailsTMDBActivity = this.f27014b;
        if (viewDetailsTMDBActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f27014b = null;
        viewDetailsTMDBActivity.toolbar = null;
        viewDetailsTMDBActivity.appbarToolbar = null;
        viewDetailsTMDBActivity.rlAccountInfo = null;
        viewDetailsTMDBActivity.ivMovieImage = null;
        viewDetailsTMDBActivity.tvMovieName = null;
        viewDetailsTMDBActivity.tvPlay = null;
        viewDetailsTMDBActivity.tvMovieInfo = null;
        viewDetailsTMDBActivity.tvDirector = null;
        viewDetailsTMDBActivity.tvDirectorInfo = null;
        viewDetailsTMDBActivity.tvCast = null;
        viewDetailsTMDBActivity.tvCastInfo = null;
        viewDetailsTMDBActivity.tvReleaseDate = null;
        viewDetailsTMDBActivity.tvReleaseDateInfo = null;
        viewDetailsTMDBActivity.logo = null;
        viewDetailsTMDBActivity.ratingBar = null;
        viewDetailsTMDBActivity.ivFavourite = null;
        viewDetailsTMDBActivity.tvMovieGenere = null;
        viewDetailsTMDBActivity.tv_genre_info = null;
        viewDetailsTMDBActivity.tvMovieDuration = null;
        viewDetailsTMDBActivity.tvMovieDurationInfo = null;
        viewDetailsTMDBActivity.llMovieInfoBox = null;
        viewDetailsTMDBActivity.llDirectorBox = null;
        viewDetailsTMDBActivity.llReleasedBox = null;
        viewDetailsTMDBActivity.llDurationBox = null;
        viewDetailsTMDBActivity.llGenreBox = null;
        viewDetailsTMDBActivity.llCastBox = null;
        viewDetailsTMDBActivity.llDirectorBoxInfo = null;
        viewDetailsTMDBActivity.llReleasedBoxInfo = null;
        viewDetailsTMDBActivity.llDurationBoxInfo = null;
        viewDetailsTMDBActivity.llGenreBoxInfo = null;
        viewDetailsTMDBActivity.llCastBoxInfo = null;
        viewDetailsTMDBActivity.tvReadMore = null;
        viewDetailsTMDBActivity.ll_watch_trailer = null;
        viewDetailsTMDBActivity.tvWatchTrailer = null;
        viewDetailsTMDBActivity.rlTransparent = null;
        viewDetailsTMDBActivity.scrollView = null;
        viewDetailsTMDBActivity.nestedScrollView = null;
        viewDetailsTMDBActivity.rvCast = null;
        viewDetailsTMDBActivity.iv_back_button = null;
        viewDetailsTMDBActivity.ll_play_button_main_layout = null;
        viewDetailsTMDBActivity.ll_watch_trailer_button_main_layout = null;
        this.f27015c.setOnClickListener(null);
        this.f27015c = null;
        this.f27016d.setOnClickListener(null);
        this.f27016d = null;
        this.f27017e.setOnClickListener(null);
        this.f27017e = null;
    }
}

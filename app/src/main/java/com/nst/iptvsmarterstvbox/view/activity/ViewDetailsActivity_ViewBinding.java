package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ViewDetailsActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewDetailsActivity f26943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f26946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f26947f;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewDetailsActivity f26948d;

        public a(ViewDetailsActivity viewDetailsActivity) {
            this.f26948d = viewDetailsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26948d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewDetailsActivity f26950d;

        public b(ViewDetailsActivity viewDetailsActivity) {
            this.f26950d = viewDetailsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26950d.onViewClicked(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewDetailsActivity f26952d;

        public c(ViewDetailsActivity viewDetailsActivity) {
            this.f26952d = viewDetailsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26952d.onViewClicked(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewDetailsActivity f26954d;

        public d(ViewDetailsActivity viewDetailsActivity) {
            this.f26954d = viewDetailsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26954d.onViewClicked(view);
        }
    }

    public ViewDetailsActivity_ViewBinding(ViewDetailsActivity viewDetailsActivity, View view) {
        this.f26943b = viewDetailsActivity;
        viewDetailsActivity.toolbar = (Toolbar) b.c.c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        viewDetailsActivity.appbarToolbar = (AppBarLayout) b.c.c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        viewDetailsActivity.rlAccountInfo = (RelativeLayout) b.c.c.c(view, R.id.rl_account_info, "field 'rlAccountInfo'", RelativeLayout.class);
        View viewB = b.c.c.b(view, R.id.iv_movie_image, "field 'ivMovieImage' and method 'onViewClicked'");
        viewDetailsActivity.ivMovieImage = (ImageView) b.c.c.a(viewB, R.id.iv_movie_image, "field 'ivMovieImage'", ImageView.class);
        this.f26944c = viewB;
        viewB.setOnClickListener(new a(viewDetailsActivity));
        viewDetailsActivity.tvMovieName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'tvMovieName'", TextView.class);
        View viewB2 = b.c.c.b(view, R.id.tv_play, "field 'tvPlay' and method 'onViewClicked'");
        viewDetailsActivity.tvPlay = (TextView) b.c.c.a(viewB2, R.id.tv_play, "field 'tvPlay'", TextView.class);
        this.f26945d = viewB2;
        viewB2.setOnClickListener(new b(viewDetailsActivity));
        viewDetailsActivity.tvMovieInfo = (TextView) b.c.c.c(view, R.id.tv_movie_info, "field 'tvMovieInfo'", TextView.class);
        viewDetailsActivity.tvDirector = (TextView) b.c.c.c(view, R.id.tv_director, "field 'tvDirector'", TextView.class);
        viewDetailsActivity.tvDirectorInfo = (TextView) b.c.c.c(view, R.id.tv_director_info, "field 'tvDirectorInfo'", TextView.class);
        viewDetailsActivity.tvCast = (TextView) b.c.c.c(view, R.id.tv_cast, "field 'tvCast'", TextView.class);
        viewDetailsActivity.tvCastInfo = (TextView) b.c.c.c(view, R.id.tv_cast_info, "field 'tvCastInfo'", TextView.class);
        viewDetailsActivity.tvReleaseDate = (TextView) b.c.c.c(view, R.id.tv_release_date, "field 'tvReleaseDate'", TextView.class);
        viewDetailsActivity.tvReleaseDateInfo = (TextView) b.c.c.c(view, R.id.tv_release_date_info, "field 'tvReleaseDateInfo'", TextView.class);
        viewDetailsActivity.ratingBar = (RatingBar) b.c.c.c(view, R.id.rating, "field 'ratingBar'", RatingBar.class);
        viewDetailsActivity.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
        viewDetailsActivity.tvMovieGenere = (TextView) b.c.c.c(view, R.id.tv_movie_genere, "field 'tvMovieGenere'", TextView.class);
        viewDetailsActivity.tv_genre_info = (TextView) b.c.c.c(view, R.id.tv_genre_info, "field 'tv_genre_info'", TextView.class);
        viewDetailsActivity.tvMovieDuration = (TextView) b.c.c.c(view, R.id.tv_movie_duration, "field 'tvMovieDuration'", TextView.class);
        viewDetailsActivity.tvMovieDurationInfo = (TextView) b.c.c.c(view, R.id.tv_movie_duration_info, "field 'tvMovieDurationInfo'", TextView.class);
        viewDetailsActivity.llMovieInfoBox = (LinearLayout) b.c.c.c(view, R.id.ll_movie_info_box, "field 'llMovieInfoBox'", LinearLayout.class);
        viewDetailsActivity.scrollView = (ScrollView) b.c.c.c(view, R.id.scrollView, "field 'scrollView'", ScrollView.class);
        viewDetailsActivity.nestedScrollView = (NestedScrollView) b.c.c.c(view, R.id.nestedScrollView, "field 'nestedScrollView'", NestedScrollView.class);
        viewDetailsActivity.llDirectorBox = (LinearLayout) b.c.c.c(view, R.id.ll_director_box, "field 'llDirectorBox'", LinearLayout.class);
        viewDetailsActivity.llReleasedBox = (LinearLayout) b.c.c.c(view, R.id.ll_released_box, "field 'llReleasedBox'", LinearLayout.class);
        viewDetailsActivity.llDurationBox = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box, "field 'llDurationBox'", LinearLayout.class);
        viewDetailsActivity.llGenreBox = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box, "field 'llGenreBox'", LinearLayout.class);
        viewDetailsActivity.llCastBox = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box, "field 'llCastBox'", LinearLayout.class);
        viewDetailsActivity.llDirectorBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_director_box_info, "field 'llDirectorBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llReleasedBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_released_box_info, "field 'llReleasedBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llDurationBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box_info, "field 'llDurationBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llGenreBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box_info, "field 'llGenreBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llCastBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box_info, "field 'llCastBoxInfo'", LinearLayout.class);
        View viewB3 = b.c.c.b(view, R.id.tv_readmore, "field 'tvReadMore' and method 'onViewClicked'");
        viewDetailsActivity.tvReadMore = (TextView) b.c.c.a(viewB3, R.id.tv_readmore, "field 'tvReadMore'", TextView.class);
        this.f26946e = viewB3;
        viewB3.setOnClickListener(new c(viewDetailsActivity));
        viewDetailsActivity.ll_watch_trailer = (LinearLayout) b.c.c.c(view, R.id.ll_watch_trailer, "field 'll_watch_trailer'", LinearLayout.class);
        View viewB4 = b.c.c.b(view, R.id.tv_watch_trailer, "field 'tvWatchTrailer' and method 'onViewClicked'");
        viewDetailsActivity.tvWatchTrailer = (TextView) b.c.c.a(viewB4, R.id.tv_watch_trailer, "field 'tvWatchTrailer'", TextView.class);
        this.f26947f = viewB4;
        viewB4.setOnClickListener(new d(viewDetailsActivity));
        viewDetailsActivity.logo = (ImageView) b.c.c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        viewDetailsActivity.rlTransparent = (RelativeLayout) b.c.c.c(view, R.id.rl_transparent, "field 'rlTransparent'", RelativeLayout.class);
        viewDetailsActivity.ll_play_button_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_play_button_main_layout, "field 'll_play_button_main_layout'", LinearLayout.class);
        viewDetailsActivity.ll_watch_trailer_button_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_watch_trailer_button_main_layout, "field 'll_watch_trailer_button_main_layout'", LinearLayout.class);
        viewDetailsActivity.pb_button_recent_watch = (ProgressBar) b.c.c.c(view, R.id.pb_button_recent_watch, "field 'pb_button_recent_watch'", ProgressBar.class);
        viewDetailsActivity.rvCast = (RecyclerView) b.c.c.c(view, R.id.rv_cast, "field 'rvCast'", RecyclerView.class);
        viewDetailsActivity.iv_back_button = (ImageView) b.c.c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ViewDetailsActivity viewDetailsActivity = this.f26943b;
        if (viewDetailsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26943b = null;
        viewDetailsActivity.toolbar = null;
        viewDetailsActivity.appbarToolbar = null;
        viewDetailsActivity.rlAccountInfo = null;
        viewDetailsActivity.ivMovieImage = null;
        viewDetailsActivity.tvMovieName = null;
        viewDetailsActivity.tvPlay = null;
        viewDetailsActivity.tvMovieInfo = null;
        viewDetailsActivity.tvDirector = null;
        viewDetailsActivity.tvDirectorInfo = null;
        viewDetailsActivity.tvCast = null;
        viewDetailsActivity.tvCastInfo = null;
        viewDetailsActivity.tvReleaseDate = null;
        viewDetailsActivity.tvReleaseDateInfo = null;
        viewDetailsActivity.ratingBar = null;
        viewDetailsActivity.ivFavourite = null;
        viewDetailsActivity.tvMovieGenere = null;
        viewDetailsActivity.tv_genre_info = null;
        viewDetailsActivity.tvMovieDuration = null;
        viewDetailsActivity.tvMovieDurationInfo = null;
        viewDetailsActivity.llMovieInfoBox = null;
        viewDetailsActivity.scrollView = null;
        viewDetailsActivity.nestedScrollView = null;
        viewDetailsActivity.llDirectorBox = null;
        viewDetailsActivity.llReleasedBox = null;
        viewDetailsActivity.llDurationBox = null;
        viewDetailsActivity.llGenreBox = null;
        viewDetailsActivity.llCastBox = null;
        viewDetailsActivity.llDirectorBoxInfo = null;
        viewDetailsActivity.llReleasedBoxInfo = null;
        viewDetailsActivity.llDurationBoxInfo = null;
        viewDetailsActivity.llGenreBoxInfo = null;
        viewDetailsActivity.llCastBoxInfo = null;
        viewDetailsActivity.tvReadMore = null;
        viewDetailsActivity.ll_watch_trailer = null;
        viewDetailsActivity.tvWatchTrailer = null;
        viewDetailsActivity.logo = null;
        viewDetailsActivity.rlTransparent = null;
        viewDetailsActivity.ll_play_button_main_layout = null;
        viewDetailsActivity.ll_watch_trailer_button_main_layout = null;
        viewDetailsActivity.pb_button_recent_watch = null;
        viewDetailsActivity.rvCast = null;
        viewDetailsActivity.iv_back_button = null;
        this.f26944c.setOnClickListener(null);
        this.f26944c = null;
        this.f26945d.setOnClickListener(null);
        this.f26945d = null;
        this.f26946e.setOnClickListener(null);
        this.f26946e = null;
        this.f26947f.setOnClickListener(null);
        this.f26947f = null;
    }
}

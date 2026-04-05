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
public class SeriesDetailActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesDetailActivity f26490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f26493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f26494f;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailActivity f26495d;

        public a(SeriesDetailActivity seriesDetailActivity) {
            this.f26495d = seriesDetailActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26495d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailActivity f26497d;

        public b(SeriesDetailActivity seriesDetailActivity) {
            this.f26497d = seriesDetailActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26497d.onViewClicked(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailActivity f26499d;

        public c(SeriesDetailActivity seriesDetailActivity) {
            this.f26499d = seriesDetailActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26499d.onViewClicked(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailActivity f26501d;

        public d(SeriesDetailActivity seriesDetailActivity) {
            this.f26501d = seriesDetailActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26501d.onViewClicked(view);
        }
    }

    public SeriesDetailActivity_ViewBinding(SeriesDetailActivity seriesDetailActivity, View view) {
        this.f26490b = seriesDetailActivity;
        seriesDetailActivity.toolbar = (Toolbar) b.c.c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seriesDetailActivity.appbarToolbar = (AppBarLayout) b.c.c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        seriesDetailActivity.rlAccountInfo = (RelativeLayout) b.c.c.c(view, R.id.rl_account_info, "field 'rlAccountInfo'", RelativeLayout.class);
        seriesDetailActivity.ivMovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'ivMovieImage'", ImageView.class);
        View viewB = b.c.c.b(view, R.id.tv_season_button, "field 'tvSeasonButton' and method 'onViewClicked'");
        seriesDetailActivity.tvSeasonButton = (TextView) b.c.c.a(viewB, R.id.tv_season_button, "field 'tvSeasonButton'", TextView.class);
        this.f26491c = viewB;
        viewB.setOnClickListener(new a(seriesDetailActivity));
        seriesDetailActivity.tvMovieName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'tvMovieName'", TextView.class);
        View viewB2 = b.c.c.b(view, R.id.tv_play, "field 'tvPlay' and method 'onViewClicked'");
        seriesDetailActivity.tvPlay = (TextView) b.c.c.a(viewB2, R.id.tv_play, "field 'tvPlay'", TextView.class);
        this.f26492d = viewB2;
        viewB2.setOnClickListener(new b(seriesDetailActivity));
        seriesDetailActivity.tvDirector = (TextView) b.c.c.c(view, R.id.tv_director, "field 'tvDirector'", TextView.class);
        seriesDetailActivity.tvDirectorInfo = (TextView) b.c.c.c(view, R.id.tv_director_info, "field 'tvDirectorInfo'", TextView.class);
        seriesDetailActivity.tvCast = (TextView) b.c.c.c(view, R.id.tv_cast, "field 'tvCast'", TextView.class);
        seriesDetailActivity.tvCastInfo = (TextView) b.c.c.c(view, R.id.tv_cast_info, "field 'tvCastInfo'", TextView.class);
        seriesDetailActivity.tvReleaseDate = (TextView) b.c.c.c(view, R.id.tv_release_date, "field 'tvReleaseDate'", TextView.class);
        seriesDetailActivity.tvReleaseDateInfo = (TextView) b.c.c.c(view, R.id.tv_release_date_info, "field 'tvReleaseDateInfo'", TextView.class);
        seriesDetailActivity.ratingBar = (RatingBar) b.c.c.c(view, R.id.rating, "field 'ratingBar'", RatingBar.class);
        seriesDetailActivity.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
        seriesDetailActivity.tvMovieGenere = (TextView) b.c.c.c(view, R.id.tv_movie_genere, "field 'tvMovieGenere'", TextView.class);
        seriesDetailActivity.tv_genre_info = (TextView) b.c.c.c(view, R.id.tv_genre_info, "field 'tv_genre_info'", TextView.class);
        seriesDetailActivity.tvMovieDuration = (TextView) b.c.c.c(view, R.id.tv_movie_duration, "field 'tvMovieDuration'", TextView.class);
        seriesDetailActivity.tvMovieDurationInfo = (TextView) b.c.c.c(view, R.id.tv_movie_duration_info, "field 'tvMovieDurationInfo'", TextView.class);
        seriesDetailActivity.llMovieInfoBox = (LinearLayout) b.c.c.c(view, R.id.ll_movie_info_box, "field 'llMovieInfoBox'", LinearLayout.class);
        seriesDetailActivity.scrollView = (ScrollView) b.c.c.c(view, R.id.scrollView, "field 'scrollView'", ScrollView.class);
        seriesDetailActivity.nestedScrollView = (NestedScrollView) b.c.c.c(view, R.id.nestedScrollView, "field 'nestedScrollView'", NestedScrollView.class);
        seriesDetailActivity.llDirectorBox = (LinearLayout) b.c.c.c(view, R.id.ll_director_box, "field 'llDirectorBox'", LinearLayout.class);
        seriesDetailActivity.llReleasedBox = (LinearLayout) b.c.c.c(view, R.id.ll_released_box, "field 'llReleasedBox'", LinearLayout.class);
        seriesDetailActivity.llDurationBox = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box, "field 'llDurationBox'", LinearLayout.class);
        seriesDetailActivity.llGenreBox = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box, "field 'llGenreBox'", LinearLayout.class);
        seriesDetailActivity.llCastBox = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box, "field 'llCastBox'", LinearLayout.class);
        seriesDetailActivity.llDirectorBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_director_box_info, "field 'llDirectorBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llReleasedBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_released_box_info, "field 'llReleasedBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llDurationBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box_info, "field 'llDurationBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llGenreBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box_info, "field 'llGenreBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llCastBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box_info, "field 'llCastBoxInfo'", LinearLayout.class);
        View viewB3 = b.c.c.b(view, R.id.tv_readmore, "field 'tvReadMore' and method 'onViewClicked'");
        seriesDetailActivity.tvReadMore = (TextView) b.c.c.a(viewB3, R.id.tv_readmore, "field 'tvReadMore'", TextView.class);
        this.f26493e = viewB3;
        viewB3.setOnClickListener(new c(seriesDetailActivity));
        seriesDetailActivity.ll_watch_trailer = (LinearLayout) b.c.c.c(view, R.id.ll_watch_trailer, "field 'll_watch_trailer'", LinearLayout.class);
        View viewB4 = b.c.c.b(view, R.id.tv_watch_trailer, "field 'tvWatchTrailer' and method 'onViewClicked'");
        seriesDetailActivity.tvWatchTrailer = (TextView) b.c.c.a(viewB4, R.id.tv_watch_trailer, "field 'tvWatchTrailer'", TextView.class);
        this.f26494f = viewB4;
        viewB4.setOnClickListener(new d(seriesDetailActivity));
        seriesDetailActivity.logo = (ImageView) b.c.c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        seriesDetailActivity.rvCast = (RecyclerView) b.c.c.c(view, R.id.rv_cast, "field 'rvCast'", RecyclerView.class);
        seriesDetailActivity.pb_button_recent_watch = (ProgressBar) b.c.c.c(view, R.id.pb_button_recent_watch, "field 'pb_button_recent_watch'", ProgressBar.class);
        seriesDetailActivity.ll_play_button_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_play_button_main_layout, "field 'll_play_button_main_layout'", LinearLayout.class);
        seriesDetailActivity.ll_season_button_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_season_button_main_layout, "field 'll_season_button_main_layout'", LinearLayout.class);
        seriesDetailActivity.ll_watch_trailer_button_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_watch_trailer_button_main_layout, "field 'll_watch_trailer_button_main_layout'", LinearLayout.class);
        seriesDetailActivity.rlTransparent = (RelativeLayout) b.c.c.c(view, R.id.rl_transparent, "field 'rlTransparent'", RelativeLayout.class);
        seriesDetailActivity.myRecyclerView = (RecyclerView) b.c.c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        seriesDetailActivity.episode_tab = (TextView) b.c.c.c(view, R.id.episode_tab, "field 'episode_tab'", TextView.class);
        seriesDetailActivity.cast_tab = (TextView) b.c.c.c(view, R.id.cast_tab, "field 'cast_tab'", TextView.class);
        seriesDetailActivity.iv_back_button = (ImageView) b.c.c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesDetailActivity seriesDetailActivity = this.f26490b;
        if (seriesDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26490b = null;
        seriesDetailActivity.toolbar = null;
        seriesDetailActivity.appbarToolbar = null;
        seriesDetailActivity.rlAccountInfo = null;
        seriesDetailActivity.ivMovieImage = null;
        seriesDetailActivity.tvSeasonButton = null;
        seriesDetailActivity.tvMovieName = null;
        seriesDetailActivity.tvPlay = null;
        seriesDetailActivity.tvDirector = null;
        seriesDetailActivity.tvDirectorInfo = null;
        seriesDetailActivity.tvCast = null;
        seriesDetailActivity.tvCastInfo = null;
        seriesDetailActivity.tvReleaseDate = null;
        seriesDetailActivity.tvReleaseDateInfo = null;
        seriesDetailActivity.ratingBar = null;
        seriesDetailActivity.ivFavourite = null;
        seriesDetailActivity.tvMovieGenere = null;
        seriesDetailActivity.tv_genre_info = null;
        seriesDetailActivity.tvMovieDuration = null;
        seriesDetailActivity.tvMovieDurationInfo = null;
        seriesDetailActivity.llMovieInfoBox = null;
        seriesDetailActivity.scrollView = null;
        seriesDetailActivity.nestedScrollView = null;
        seriesDetailActivity.llDirectorBox = null;
        seriesDetailActivity.llReleasedBox = null;
        seriesDetailActivity.llDurationBox = null;
        seriesDetailActivity.llGenreBox = null;
        seriesDetailActivity.llCastBox = null;
        seriesDetailActivity.llDirectorBoxInfo = null;
        seriesDetailActivity.llReleasedBoxInfo = null;
        seriesDetailActivity.llDurationBoxInfo = null;
        seriesDetailActivity.llGenreBoxInfo = null;
        seriesDetailActivity.llCastBoxInfo = null;
        seriesDetailActivity.tvReadMore = null;
        seriesDetailActivity.ll_watch_trailer = null;
        seriesDetailActivity.tvWatchTrailer = null;
        seriesDetailActivity.logo = null;
        seriesDetailActivity.rvCast = null;
        seriesDetailActivity.pb_button_recent_watch = null;
        seriesDetailActivity.ll_play_button_main_layout = null;
        seriesDetailActivity.ll_season_button_main_layout = null;
        seriesDetailActivity.ll_watch_trailer_button_main_layout = null;
        seriesDetailActivity.rlTransparent = null;
        seriesDetailActivity.myRecyclerView = null;
        seriesDetailActivity.episode_tab = null;
        seriesDetailActivity.cast_tab = null;
        seriesDetailActivity.iv_back_button = null;
        this.f26491c.setOnClickListener(null);
        this.f26491c = null;
        this.f26492d.setOnClickListener(null);
        this.f26492d = null;
        this.f26493e.setOnClickListener(null);
        this.f26493e = null;
        this.f26494f.setOnClickListener(null);
        this.f26494f = null;
    }
}

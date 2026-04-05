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
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesDetailM3UActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesDetailM3UActivity f26530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f26533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f26534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f26535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f26536h;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailM3UActivity f26537d;

        public a(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f26537d = seriesDetailM3UActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26537d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailM3UActivity f26539d;

        public b(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f26539d = seriesDetailM3UActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26539d.onViewClicked(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailM3UActivity f26541d;

        public c(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f26541d = seriesDetailM3UActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26541d.onViewClicked(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailM3UActivity f26543d;

        public d(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f26543d = seriesDetailM3UActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26543d.onViewClicked(view);
        }
    }

    public class e extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailM3UActivity f26545d;

        public e(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f26545d = seriesDetailM3UActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26545d.onViewClicked(view);
        }
    }

    public class f extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeriesDetailM3UActivity f26547d;

        public f(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f26547d = seriesDetailM3UActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26547d.onViewClicked(view);
        }
    }

    public SeriesDetailM3UActivity_ViewBinding(SeriesDetailM3UActivity seriesDetailM3UActivity, View view) {
        this.f26530b = seriesDetailM3UActivity;
        seriesDetailM3UActivity.logo = (ImageView) b.c.c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        seriesDetailM3UActivity.toolbar = (Toolbar) b.c.c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seriesDetailM3UActivity.appbarToolbar = (AppBarLayout) b.c.c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        seriesDetailM3UActivity.tvAccountInfo = (TextView) b.c.c.c(view, R.id.tv_account_info, "field 'tvAccountInfo'", TextView.class);
        seriesDetailM3UActivity.rlAccountInfo = (RelativeLayout) b.c.c.c(view, R.id.rl_account_info, "field 'rlAccountInfo'", RelativeLayout.class);
        seriesDetailM3UActivity.ivMovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'ivMovieImage'", ImageView.class);
        View viewB = b.c.c.b(view, R.id.tv_add_to_fav, "field 'tvAddToFav' and method 'onViewClicked'");
        seriesDetailM3UActivity.tvAddToFav = (TextView) b.c.c.a(viewB, R.id.tv_add_to_fav, "field 'tvAddToFav'", TextView.class);
        this.f26531c = viewB;
        viewB.setOnClickListener(new a(seriesDetailM3UActivity));
        seriesDetailM3UActivity.tvMovieName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'tvMovieName'", TextView.class);
        View viewB2 = b.c.c.b(view, R.id.tv_play, "field 'tvPlay' and method 'onViewClicked'");
        seriesDetailM3UActivity.tvPlay = (TextView) b.c.c.a(viewB2, R.id.tv_play, "field 'tvPlay'", TextView.class);
        this.f26532d = viewB2;
        viewB2.setOnClickListener(new b(seriesDetailM3UActivity));
        seriesDetailM3UActivity.tvMovieInfo = (TextView) b.c.c.c(view, R.id.tv_movie_info, "field 'tvMovieInfo'", TextView.class);
        seriesDetailM3UActivity.tvDirector = (TextView) b.c.c.c(view, R.id.tv_director, "field 'tvDirector'", TextView.class);
        seriesDetailM3UActivity.tvDirectorInfo = (TextView) b.c.c.c(view, R.id.tv_director_info, "field 'tvDirectorInfo'", TextView.class);
        seriesDetailM3UActivity.tvCast = (TextView) b.c.c.c(view, R.id.tv_cast, "field 'tvCast'", TextView.class);
        seriesDetailM3UActivity.tvCastInfo = (TextView) b.c.c.c(view, R.id.tv_cast_info, "field 'tvCastInfo'", TextView.class);
        seriesDetailM3UActivity.tvReleaseDate = (TextView) b.c.c.c(view, R.id.tv_release_date, "field 'tvReleaseDate'", TextView.class);
        seriesDetailM3UActivity.tvReleaseDateInfo = (TextView) b.c.c.c(view, R.id.tv_release_date_info, "field 'tvReleaseDateInfo'", TextView.class);
        seriesDetailM3UActivity.ratingBar = (RatingBar) b.c.c.c(view, R.id.rating, "field 'ratingBar'", RatingBar.class);
        seriesDetailM3UActivity.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
        seriesDetailM3UActivity.tvMovieGenere = (TextView) b.c.c.c(view, R.id.tv_movie_genere, "field 'tvMovieGenere'", TextView.class);
        seriesDetailM3UActivity.tv_genre_info = (TextView) b.c.c.c(view, R.id.tv_genre_info, "field 'tv_genre_info'", TextView.class);
        seriesDetailM3UActivity.tvdetailprogressbar = (ProgressBar) b.c.c.c(view, R.id.tv_detail_ProgressBar, "field 'tvdetailprogressbar'", ProgressBar.class);
        View viewB3 = b.c.c.b(view, R.id.tv_detail_back_btn, "field 'tvdetailbackbutton' and method 'onViewClicked'");
        seriesDetailM3UActivity.tvdetailbackbutton = (TextView) b.c.c.a(viewB3, R.id.tv_detail_back_btn, "field 'tvdetailbackbutton'", TextView.class);
        this.f26533e = viewB3;
        viewB3.setOnClickListener(new c(seriesDetailM3UActivity));
        seriesDetailM3UActivity.tvMovieDuration = (TextView) b.c.c.c(view, R.id.tv_movie_duration, "field 'tvMovieDuration'", TextView.class);
        seriesDetailM3UActivity.tvMovieDurationInfo = (TextView) b.c.c.c(view, R.id.tv_movie_duration_info, "field 'tvMovieDurationInfo'", TextView.class);
        seriesDetailM3UActivity.llMovieInfoBox = (LinearLayout) b.c.c.c(view, R.id.ll_movie_info_box, "field 'llMovieInfoBox'", LinearLayout.class);
        seriesDetailM3UActivity.scrollView = (ScrollView) b.c.c.c(view, R.id.scrollView, "field 'scrollView'", ScrollView.class);
        seriesDetailM3UActivity.llDirectorBox = (LinearLayout) b.c.c.c(view, R.id.ll_director_box, "field 'llDirectorBox'", LinearLayout.class);
        seriesDetailM3UActivity.llReleasedBox = (LinearLayout) b.c.c.c(view, R.id.ll_released_box, "field 'llReleasedBox'", LinearLayout.class);
        seriesDetailM3UActivity.llDurationBox = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box, "field 'llDurationBox'", LinearLayout.class);
        seriesDetailM3UActivity.llGenreBox = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box, "field 'llGenreBox'", LinearLayout.class);
        seriesDetailM3UActivity.llCastBox = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box, "field 'llCastBox'", LinearLayout.class);
        seriesDetailM3UActivity.llDirectorBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_director_box_info, "field 'llDirectorBoxInfo'", LinearLayout.class);
        seriesDetailM3UActivity.llReleasedBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_released_box_info, "field 'llReleasedBoxInfo'", LinearLayout.class);
        seriesDetailM3UActivity.llDurationBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_duration_box_info, "field 'llDurationBoxInfo'", LinearLayout.class);
        seriesDetailM3UActivity.llGenreBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_genre_box_info, "field 'llGenreBoxInfo'", LinearLayout.class);
        seriesDetailM3UActivity.llCastBoxInfo = (LinearLayout) b.c.c.c(view, R.id.ll_cast_box_info, "field 'llCastBoxInfo'", LinearLayout.class);
        View viewB4 = b.c.c.b(view, R.id.tv_readmore, "field 'tvReadMore' and method 'onViewClicked'");
        seriesDetailM3UActivity.tvReadMore = (TextView) b.c.c.a(viewB4, R.id.tv_readmore, "field 'tvReadMore'", TextView.class);
        this.f26534f = viewB4;
        viewB4.setOnClickListener(new d(seriesDetailM3UActivity));
        View viewB5 = b.c.c.b(view, R.id.tv_readmore_genre, "field 'tvReadMoreGenre' and method 'onViewClicked'");
        seriesDetailM3UActivity.tvReadMoreGenre = (TextView) b.c.c.a(viewB5, R.id.tv_readmore_genre, "field 'tvReadMoreGenre'", TextView.class);
        this.f26535g = viewB5;
        viewB5.setOnClickListener(new e(seriesDetailM3UActivity));
        View viewB6 = b.c.c.b(view, R.id.tv_watch_trailer, "field 'tvWatchTrailer' and method 'onViewClicked'");
        seriesDetailM3UActivity.tvWatchTrailer = (TextView) b.c.c.a(viewB6, R.id.tv_watch_trailer, "field 'tvWatchTrailer'", TextView.class);
        this.f26536h = viewB6;
        viewB6.setOnClickListener(new f(seriesDetailM3UActivity));
        seriesDetailM3UActivity.rlTransparent = (RelativeLayout) b.c.c.c(view, R.id.rl_transparent, "field 'rlTransparent'", RelativeLayout.class);
        seriesDetailM3UActivity.llDetailProgressBar = (LinearLayout) b.c.c.c(view, R.id.ll_detail_ProgressBar, "field 'llDetailProgressBar'", LinearLayout.class);
        seriesDetailM3UActivity.llDetailLeftSide = (LinearLayout) b.c.c.c(view, R.id.ll_detail_left_side, "field 'llDetailLeftSide'", LinearLayout.class);
        seriesDetailM3UActivity.llDetailRightSide = (LinearLayout) b.c.c.c(view, R.id.ll_detail_right_side, "field 'llDetailRightSide'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesDetailM3UActivity seriesDetailM3UActivity = this.f26530b;
        if (seriesDetailM3UActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26530b = null;
        seriesDetailM3UActivity.logo = null;
        seriesDetailM3UActivity.toolbar = null;
        seriesDetailM3UActivity.appbarToolbar = null;
        seriesDetailM3UActivity.tvAccountInfo = null;
        seriesDetailM3UActivity.rlAccountInfo = null;
        seriesDetailM3UActivity.ivMovieImage = null;
        seriesDetailM3UActivity.tvAddToFav = null;
        seriesDetailM3UActivity.tvMovieName = null;
        seriesDetailM3UActivity.tvPlay = null;
        seriesDetailM3UActivity.tvMovieInfo = null;
        seriesDetailM3UActivity.tvDirector = null;
        seriesDetailM3UActivity.tvDirectorInfo = null;
        seriesDetailM3UActivity.tvCast = null;
        seriesDetailM3UActivity.tvCastInfo = null;
        seriesDetailM3UActivity.tvReleaseDate = null;
        seriesDetailM3UActivity.tvReleaseDateInfo = null;
        seriesDetailM3UActivity.ratingBar = null;
        seriesDetailM3UActivity.ivFavourite = null;
        seriesDetailM3UActivity.tvMovieGenere = null;
        seriesDetailM3UActivity.tv_genre_info = null;
        seriesDetailM3UActivity.tvdetailprogressbar = null;
        seriesDetailM3UActivity.tvdetailbackbutton = null;
        seriesDetailM3UActivity.tvMovieDuration = null;
        seriesDetailM3UActivity.tvMovieDurationInfo = null;
        seriesDetailM3UActivity.llMovieInfoBox = null;
        seriesDetailM3UActivity.scrollView = null;
        seriesDetailM3UActivity.llDirectorBox = null;
        seriesDetailM3UActivity.llReleasedBox = null;
        seriesDetailM3UActivity.llDurationBox = null;
        seriesDetailM3UActivity.llGenreBox = null;
        seriesDetailM3UActivity.llCastBox = null;
        seriesDetailM3UActivity.llDirectorBoxInfo = null;
        seriesDetailM3UActivity.llReleasedBoxInfo = null;
        seriesDetailM3UActivity.llDurationBoxInfo = null;
        seriesDetailM3UActivity.llGenreBoxInfo = null;
        seriesDetailM3UActivity.llCastBoxInfo = null;
        seriesDetailM3UActivity.tvReadMore = null;
        seriesDetailM3UActivity.tvReadMoreGenre = null;
        seriesDetailM3UActivity.tvWatchTrailer = null;
        seriesDetailM3UActivity.rlTransparent = null;
        seriesDetailM3UActivity.llDetailProgressBar = null;
        seriesDetailM3UActivity.llDetailLeftSide = null;
        seriesDetailM3UActivity.llDetailRightSide = null;
        this.f26531c.setOnClickListener(null);
        this.f26531c = null;
        this.f26532d.setOnClickListener(null);
        this.f26532d = null;
        this.f26533e.setOnClickListener(null);
        this.f26533e = null;
        this.f26534f.setOnClickListener(null);
        this.f26534f = null;
        this.f26535g.setOnClickListener(null);
        this.f26535g = null;
        this.f26536h.setOnClickListener(null);
        this.f26536h = null;
    }
}

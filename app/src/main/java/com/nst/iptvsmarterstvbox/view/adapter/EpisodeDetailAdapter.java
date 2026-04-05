package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.f.a.c.d.u.u.i;
import com.amazonaws.services.s3.model.InstructionFileId;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass;
import minefarts.iptvsmarters.view.activity.HoneyPlayer;
import minefarts.iptvsmarters.view.activity.PlayExternalPlayerActivity;
import minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class EpisodeDetailAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f27242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f27243f;
    public String A;
    public String B;
    public String C;
    public SharedPreferences D;
    public String E;
    public String F;
    public String G;
    public NSTIJKPlayerSeriesThumbnail I;
    public String L;
    public String M;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f27244g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f27246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f27247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f27248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MyViewHolder f27249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f27250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Date f27251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27252o;
    public DateFormat p;
    public SimpleDateFormat q;
    public String t;
    public c.f.a.c.d.u.d v;
    public boolean x;
    public String y;
    public List<SeriesDBModel> z;
    public int r = 0;
    public String s = "mp4";
    public String u = BuildConfig.FLAVOR;
    public Handler H = new Handler();
    public String J = BuildConfig.FLAVOR;
    public int K = 0;
    public i.a N = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<GetEpisdoeDetailsCallback> f27245h = c.h.a.i.a.c().a();
    public String w = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public TextView EpisodeDesc;

        @BindView
        public TextView EpisodeTime;

        @BindView
        public LinearLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView MovieName;

        @BindView
        public LinearLayout cardView;

        @BindView
        public ImageView iv_play_icon;

        @BindView
        public LinearLayout ll_buffering;

        @BindView
        public LinearLayout ll_episode_thumbnail;

        @BindView
        public LinearLayout ll_hover;

        @BindView
        public LinearLayout ll_now_paused;

        @BindView
        public LinearLayout ll_now_playing;

        @BindView
        public LinearLayout ll_now_playing_paused;

        @BindView
        public LinearLayout ll_pb_recent_watch;

        @BindView
        public LinearLayout ll_video_player;

        @BindView
        public NSTIJKPlayerSeriesThumbnail mVideoView;

        @BindView
        public ProgressBar pb_recent_watch;

        @BindView
        public RatingBar ratingBar;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27253b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27253b = myViewHolder;
            myViewHolder.MovieName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'MovieName'", TextView.class);
            myViewHolder.EpisodeTime = (TextView) b.c.c.c(view, R.id.tv_episode_time, "field 'EpisodeTime'", TextView.class);
            myViewHolder.EpisodeDesc = (TextView) b.c.c.c(view, R.id.tv_episode_desc, "field 'EpisodeDesc'", TextView.class);
            myViewHolder.ratingBar = (RatingBar) b.c.c.c(view, R.id.rating, "field 'ratingBar'", RatingBar.class);
            myViewHolder.Movie = (LinearLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", LinearLayout.class);
            myViewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (LinearLayout) b.c.c.c(view, R.id.card_view, "field 'cardView'", LinearLayout.class);
            myViewHolder.ll_hover = (LinearLayout) b.c.c.c(view, R.id.ll_hover, "field 'll_hover'", LinearLayout.class);
            myViewHolder.pb_recent_watch = (ProgressBar) b.c.c.c(view, R.id.pb_recent_watch, "field 'pb_recent_watch'", ProgressBar.class);
            myViewHolder.ll_pb_recent_watch = (LinearLayout) b.c.c.c(view, R.id.ll_pb_recent_watch, "field 'll_pb_recent_watch'", LinearLayout.class);
            myViewHolder.ll_episode_thumbnail = (LinearLayout) b.c.c.c(view, R.id.ll_episode_thumbnail, "field 'll_episode_thumbnail'", LinearLayout.class);
            myViewHolder.mVideoView = (NSTIJKPlayerSeriesThumbnail) b.c.c.c(view, R.id.video_view, "field 'mVideoView'", NSTIJKPlayerSeriesThumbnail.class);
            myViewHolder.ll_video_player = (LinearLayout) b.c.c.c(view, R.id.ll_video_player, "field 'll_video_player'", LinearLayout.class);
            myViewHolder.iv_play_icon = (ImageView) b.c.c.c(view, R.id.iv_play_icon, "field 'iv_play_icon'", ImageView.class);
            myViewHolder.ll_now_playing_paused = (LinearLayout) b.c.c.c(view, R.id.ll_now_playing_paused, "field 'll_now_playing_paused'", LinearLayout.class);
            myViewHolder.ll_now_playing = (LinearLayout) b.c.c.c(view, R.id.ll_now_playing, "field 'll_now_playing'", LinearLayout.class);
            myViewHolder.ll_now_paused = (LinearLayout) b.c.c.c(view, R.id.ll_now_paused, "field 'll_now_paused'", LinearLayout.class);
            myViewHolder.ll_buffering = (LinearLayout) b.c.c.c(view, R.id.ll_buffering, "field 'll_buffering'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27253b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27253b = null;
            myViewHolder.MovieName = null;
            myViewHolder.EpisodeTime = null;
            myViewHolder.EpisodeDesc = null;
            myViewHolder.ratingBar = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.ll_hover = null;
            myViewHolder.pb_recent_watch = null;
            myViewHolder.ll_pb_recent_watch = null;
            myViewHolder.ll_episode_thumbnail = null;
            myViewHolder.mVideoView = null;
            myViewHolder.ll_video_player = null;
            myViewHolder.iv_play_icon = null;
            myViewHolder.ll_now_playing_paused = null;
            myViewHolder.ll_now_playing = null;
            myViewHolder.ll_now_paused = null;
            myViewHolder.ll_buffering = null;
        }
    }

    public class a extends i.a {
        public a() {
        }

        @Override // c.f.a.c.d.u.u.i.a
        public void g() {
            int iN;
            try {
                if (EpisodeDetailAdapter.this.v == null || (iN = EpisodeDetailAdapter.this.v.p().n()) == EpisodeDetailAdapter.this.K) {
                    return;
                }
                if (iN == 2 || iN == 3) {
                    EpisodeDetailAdapter.this.w();
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27259f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27260g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27261h;

        public b(int i2, int i3, String str, String str2, String str3, String str4, String str5) {
            this.f27255b = i2;
            this.f27256c = i3;
            this.f27257d = str;
            this.f27258e = str2;
            this.f27259f = str3;
            this.f27260g = str4;
            this.f27261h = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EpisodeDetailAdapter.this.v0(this.f27255b, this.f27256c, this.f27257d, this.f27258e, this.f27259f, this.f27260g, this.f27261h, view);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27269h;

        public c(int i2, int i3, String str, String str2, String str3, String str4, String str5) {
            this.f27263b = i2;
            this.f27264c = i3;
            this.f27265d = str;
            this.f27266e = str2;
            this.f27267f = str3;
            this.f27268g = str4;
            this.f27269h = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EpisodeDetailAdapter.this.v0(this.f27263b, this.f27264c, this.f27265d, this.f27266e, this.f27267f, this.f27268g, this.f27269h, view);
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27277h;

        public d(int i2, int i3, String str, String str2, String str3, String str4, String str5) {
            this.f27271b = i2;
            this.f27272c = i3;
            this.f27273d = str;
            this.f27274e = str2;
            this.f27275f = str3;
            this.f27276g = str4;
            this.f27277h = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EpisodeDetailAdapter.this.v0(this.f27271b, this.f27272c, this.f27273d, this.f27274e, this.f27275f, this.f27276g, this.f27277h, view);
        }
    }

    public class e implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27282d;

        public e(ArrayList arrayList, int i2, String str, String str2) {
            this.f27279a = arrayList;
            this.f27280b = i2;
            this.f27281c = str;
            this.f27282d = str2;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f27279a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.f27279a.size()) {
                            if (menuItem.getItemId() != i2) {
                                i2++;
                            } else if (menuItem.getItemId() == 0) {
                                c.h.a.h.n.e.V(EpisodeDetailAdapter.this.f27244g, EpisodeDetailAdapter.this.A, this.f27280b, "series", this.f27281c, "0", this.f27282d, null, BuildConfig.FLAVOR);
                            } else {
                                String strF = c.h.a.h.n.e.F(EpisodeDetailAdapter.this.f27244g, this.f27280b, this.f27281c, "series");
                                Intent intent = new Intent(EpisodeDetailAdapter.this.f27244g, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", strF);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f27279a.get(i2)).a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f27279a.get(i2)).b());
                                EpisodeDetailAdapter.this.f27244g.startActivity(intent);
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class f implements j0.c {
        public f() {
        }

        @Override // a.b.q.j0.c
        public void a(j0 j0Var) {
        }
    }

    public class g implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f27286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MyViewHolder f27287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f27289f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f27290g;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (g.this.f27287d != null && g.this.f27287d.ll_video_player != null) {
                    g.this.f27287d.ll_video_player.setVisibility(4);
                }
                if (g.this.f27287d == null || g.this.f27287d.mVideoView == null) {
                    return;
                }
                g.this.f27287d.mVideoView.setVisibility(0);
                g.this.f27287d.mVideoView.Y((Activity) EpisodeDetailAdapter.this.f27244g, g.this.f27287d.mVideoView);
                EpisodeDetailAdapter.this.G = EpisodeDetailAdapter.this.B + ":" + EpisodeDetailAdapter.this.C + "/series/" + EpisodeDetailAdapter.this.E + "/" + EpisodeDetailAdapter.this.F + "/";
                NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = g.this.f27287d.mVideoView;
                StringBuilder sb = new StringBuilder();
                sb.append(EpisodeDetailAdapter.this.G);
                sb.append(g.this.f27288e);
                sb.append(InstructionFileId.DOT);
                sb.append(g.this.f27289f);
                nSTIJKPlayerSeriesThumbnail.a0(Uri.parse(sb.toString()), true, BuildConfig.FLAVOR);
                g.this.f27287d.mVideoView.J = 0;
                g.this.f27287d.mVideoView.L = false;
                g.this.f27287d.mVideoView.M(g.this.f27287d.mVideoView, g.this.f27287d.ll_hover, g.this.f27287d.ll_video_player, g.this.f27287d.MovieImage, g.this.f27287d.ll_pb_recent_watch, g.this.f27287d.ll_episode_thumbnail, g.this.f27287d.pb_recent_watch, ((GetEpisdoeDetailsCallback) EpisodeDetailAdapter.this.f27245h.get(g.this.f27290g)).i());
                g.this.f27287d.mVideoView.start();
                g gVar = g.this;
                EpisodeDetailAdapter.this.I = gVar.f27287d.mVideoView;
            }
        }

        public g(View view, LinearLayout linearLayout, MyViewHolder myViewHolder, int i2, String str, int i3) {
            this.f27285b = view;
            this.f27286c = linearLayout;
            this.f27287d = myViewHolder;
            this.f27288e = i2;
            this.f27289f = str;
            this.f27290g = i3;
        }

        public final void e(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27285b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void f(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27285b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void g(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27285b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            ImageView imageView;
            NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail;
            LinearLayout linearLayout;
            TextView textView;
            ImageView imageView2;
            NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail2;
            ImageView imageView3;
            TextView textView2;
            View view2;
            int i2;
            try {
                if (z) {
                    f2 = z ? 1.1f : 1.0f;
                    View view3 = this.f27285b;
                    if (view3 == null || view3.getTag() == null || !this.f27285b.getTag().equals("1")) {
                        View view4 = this.f27285b;
                        if (view4 == null || view4.getTag() == null || !this.f27285b.getTag().equals("2")) {
                            View view5 = this.f27285b;
                            if (view5 == null || view5.getTag() == null || !this.f27285b.getTag().equals("20")) {
                                f(f2);
                                return;
                            }
                            View view6 = this.f27286c;
                            if (view6 != null) {
                                view6.setVisibility(0);
                            }
                            MyViewHolder myViewHolder = this.f27287d;
                            if (myViewHolder != null && (textView2 = myViewHolder.MovieName) != null) {
                                textView2.setTextColor(EpisodeDetailAdapter.this.f27244g.getResources().getColor(R.color.purple2));
                            }
                            MyViewHolder myViewHolder2 = this.f27287d;
                            if (myViewHolder2 != null && (imageView3 = myViewHolder2.iv_play_icon) != null) {
                                imageView3.setVisibility(0);
                            }
                            EpisodeDetailAdapter.this.H.removeCallbacksAndMessages(null);
                            EpisodeDetailAdapter.this.H.postDelayed(new a(), 5000L);
                            return;
                        }
                        f(f2);
                        view2 = this.f27285b;
                        i2 = R.drawable.logout_btn_effect;
                    } else {
                        f(f2);
                        view2 = this.f27285b;
                        i2 = R.drawable.back_btn_effect;
                    }
                    view2.setBackgroundResource(i2);
                    return;
                }
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                EpisodeDetailAdapter.this.H.removeCallbacksAndMessages(null);
                MyViewHolder myViewHolder3 = this.f27287d;
                if (myViewHolder3 != null && (nSTIJKPlayerSeriesThumbnail2 = myViewHolder3.mVideoView) != null) {
                    try {
                        if (nSTIJKPlayerSeriesThumbnail2.R()) {
                            this.f27287d.mVideoView.K();
                        } else {
                            this.f27287d.mVideoView.e0();
                            this.f27287d.mVideoView.V(true);
                            this.f27287d.mVideoView.d0();
                        }
                        IjkMediaPlayer.native_profileEnd();
                    } catch (Exception unused) {
                    }
                }
                MyViewHolder myViewHolder4 = this.f27287d;
                if (myViewHolder4 != null && (imageView2 = myViewHolder4.iv_play_icon) != null) {
                    imageView2.setVisibility(8);
                }
                View view7 = this.f27286c;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
                MyViewHolder myViewHolder5 = this.f27287d;
                if (myViewHolder5 != null && (textView = myViewHolder5.MovieName) != null) {
                    textView.setTextColor(-1);
                }
                MyViewHolder myViewHolder6 = this.f27287d;
                if (myViewHolder6 != null && (linearLayout = myViewHolder6.ll_video_player) != null) {
                    linearLayout.setVisibility(8);
                }
                MyViewHolder myViewHolder7 = this.f27287d;
                if (myViewHolder7 != null && (nSTIJKPlayerSeriesThumbnail = myViewHolder7.mVideoView) != null) {
                    nSTIJKPlayerSeriesThumbnail.setVisibility(8);
                }
                MyViewHolder myViewHolder8 = this.f27287d;
                if (myViewHolder8 != null && (imageView = myViewHolder8.MovieImage) != null) {
                    imageView.setVisibility(0);
                }
                if (this.f27287d != null && EpisodeDetailAdapter.this.f27245h != null && EpisodeDetailAdapter.this.f27245h.size() > 0) {
                    try {
                        if (EpisodeDetailAdapter.this.f27245h.get(this.f27290g) == null || ((GetEpisdoeDetailsCallback) EpisodeDetailAdapter.this.f27245h.get(this.f27290g)).i() == 0) {
                            this.f27287d.ll_pb_recent_watch.setVisibility(8);
                        } else {
                            this.f27287d.ll_pb_recent_watch.setVisibility(0);
                            this.f27287d.pb_recent_watch.setProgress(((GetEpisdoeDetailsCallback) EpisodeDetailAdapter.this.f27245h.get(this.f27290g)).i());
                        }
                    } catch (Exception unused2) {
                        this.f27287d.ll_pb_recent_watch.setVisibility(8);
                    }
                }
                e(z);
                View view8 = this.f27285b;
                if (view8 == null || view8.getTag() == null || !this.f27285b.getTag().equals("1")) {
                    View view9 = this.f27285b;
                    if (view9 == null || view9.getTag() == null || !this.f27285b.getTag().equals("2")) {
                        f(f2);
                        g(f2);
                        return;
                    } else {
                        f(f2);
                        g(f2);
                    }
                } else {
                    f(f2);
                    g(f2);
                }
                this.f27285b.setBackgroundResource(R.drawable.black_button_dark);
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EpisodeDetailAdapter(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.util.List<minefarts.iptvsmarters.model.callback.SeriesDBModel> r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.EpisodeDetailAdapter.<init>(android.content.Context, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void");
    }

    public static long s0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String t0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        try {
            List<GetEpisdoeDetailsCallback> list = this.f27245h;
            if (list != null) {
                return list.size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c7, code lost:
    
        if (r0 != 4) goto L99;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(minefarts.iptvsmarters.view.adapter.EpisodeDetailAdapter.MyViewHolder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.EpisodeDetailAdapter.F(minefarts.iptvsmarters.view.adapter.EpisodeDetailAdapter$MyViewHolder, int):void");
    }

    public final void v0(int i2, int i3, String str, String str2, String str3, String str4, String str5, View view) {
        try {
            Handler handler = this.H;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            c.h.a.h.n.a.X = true;
            c.h.a.h.n.a.W = i2;
            x0();
            c.f.a.c.d.u.d dVar = this.v;
            if (dVar != null && dVar.c()) {
                if (this.f27250m.booleanValue()) {
                    String str6 = this.f27244g.getResources().getString(R.string.season_number) + " - " + str4;
                    String strF = c.h.a.h.n.e.F(this.f27244g, i3, str, "series");
                    c.f.a.c.d.u.d dVar2 = this.v;
                    if (dVar2 != null && dVar2.p() != null && this.v.p().j() != null && this.v.p().j().K() != null) {
                        this.J = this.v.p().j().K();
                    }
                    if (this.J.equals(strF)) {
                        this.f27244g.startActivity(new Intent(this.f27244g, (Class<?>) ExpandedControlsActivity.class));
                        return;
                    } else {
                        c.h.a.h.m.a.c(c.h.a.h.n.e.S(str5), true, c.h.a.h.m.a.a(str2, str6, BuildConfig.FLAVOR, 0, strF, "videos/mp4", str3, BuildConfig.FLAVOR, null), this.v, this.f27244g);
                        return;
                    }
                }
                return;
            }
            if (this.f27250m.booleanValue()) {
                if (this.L.equals("from_player")) {
                    Context context = this.f27244g;
                    if (context instanceof HoneyPlayer) {
                        ((HoneyPlayer) context).m1(this.A, i3, str2, "series");
                        return;
                    }
                    return;
                }
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                j0 j0Var = new j0(this.f27244g, view);
                j0Var.c().inflate(R.menu.menu_players_hp, j0Var.b());
                ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.f27244g).l();
                if (arrayListL == null || arrayListL.size() <= 0) {
                    c.h.a.h.n.e.V(this.f27244g, this.A, i3, "series", str, String.valueOf(i2), str2, null, BuildConfig.FLAVOR);
                    return;
                }
                j0Var.b().add(0, 0, 0, this.f27244g.getResources().getString(R.string.nav_play));
                ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                externalPlayerModelClass.e(0);
                externalPlayerModelClass.d(this.f27244g.getResources().getString(R.string.play_with));
                arrayList.add(externalPlayerModelClass);
                int i4 = 0;
                while (i4 < arrayListL.size()) {
                    int i5 = i4 + 1;
                    j0Var.b().add(0, i5, 0, this.f27244g.getResources().getString(R.string.play_with) + " " + arrayListL.get(i4).a());
                    arrayList.add(arrayListL.get(i4));
                    i4 = i5;
                }
                j0Var.f(new e(arrayList, i3, str, str2));
                j0Var.e(new f());
                j0Var.g();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (this.M.equals("mobile")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.episode_grid_layout;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.episode_grid_layout_tv;
        }
        MyViewHolder myViewHolder = new MyViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
        this.f27249l = myViewHolder;
        return myViewHolder;
    }

    public void x0() {
        NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = this.I;
        if (nSTIJKPlayerSeriesThumbnail != null) {
            try {
                if (nSTIJKPlayerSeriesThumbnail.R()) {
                    this.I.K();
                } else {
                    this.I.e0();
                    this.I.V(true);
                    this.I.d0();
                }
                IjkMediaPlayer.native_profileEnd();
            } catch (Exception unused) {
            }
        }
    }
}

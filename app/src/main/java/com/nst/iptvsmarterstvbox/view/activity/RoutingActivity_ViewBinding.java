package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class RoutingActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RoutingActivity f26212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f26215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f26216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f26217g;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RoutingActivity f26218d;

        public a(RoutingActivity routingActivity) {
            this.f26218d = routingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26218d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RoutingActivity f26220d;

        public b(RoutingActivity routingActivity) {
            this.f26220d = routingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26220d.onViewClicked(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RoutingActivity f26222d;

        public c(RoutingActivity routingActivity) {
            this.f26222d = routingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26222d.onViewClicked(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RoutingActivity f26224d;

        public d(RoutingActivity routingActivity) {
            this.f26224d = routingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26224d.onViewClicked(view);
        }
    }

    public class e extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RoutingActivity f26226d;

        public e(RoutingActivity routingActivity) {
            this.f26226d = routingActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26226d.onViewClicked(view);
        }
    }

    public RoutingActivity_ViewBinding(RoutingActivity routingActivity, View view) {
        this.f26212b = routingActivity;
        View viewB = b.c.c.b(view, R.id.rl_login_with_m3u, "field 'rl_login_with_m3u' and method 'onViewClicked'");
        routingActivity.rl_login_with_m3u = (RelativeLayout) b.c.c.a(viewB, R.id.rl_login_with_m3u, "field 'rl_login_with_m3u'", RelativeLayout.class);
        this.f26213c = viewB;
        viewB.setOnClickListener(new a(routingActivity));
        routingActivity.iv_login_with_m3u = (ImageView) b.c.c.c(view, R.id.iv_login_with_m3u, "field 'iv_login_with_m3u'", ImageView.class);
        routingActivity.tv_login_with_m3u = (TextView) b.c.c.c(view, R.id.tv_login_with_m3u, "field 'tv_login_with_m3u'", TextView.class);
        routingActivity.iv_login_with_m3u_arrow = (ImageView) b.c.c.c(view, R.id.iv_login_with_m3u_arrow, "field 'iv_login_with_m3u_arrow'", ImageView.class);
        View viewB2 = b.c.c.b(view, R.id.rl_login_with_xtream_codes_api, "field 'rl_login_with_xtream_codes_api' and method 'onViewClicked'");
        routingActivity.rl_login_with_xtream_codes_api = (RelativeLayout) b.c.c.a(viewB2, R.id.rl_login_with_xtream_codes_api, "field 'rl_login_with_xtream_codes_api'", RelativeLayout.class);
        this.f26214d = viewB2;
        viewB2.setOnClickListener(new b(routingActivity));
        routingActivity.iv_login_with_xtream_codes_api = (ImageView) b.c.c.c(view, R.id.iv_login_with_xtream_codes_api, "field 'iv_login_with_xtream_codes_api'", ImageView.class);
        routingActivity.tv_login_with_xtream_codes_api = (TextView) b.c.c.c(view, R.id.tv_login_with_xtream_codes_api, "field 'tv_login_with_xtream_codes_api'", TextView.class);
        routingActivity.iv_login_with_xtream_codes_api_arrow = (ImageView) b.c.c.c(view, R.id.iv_login_with_xtream_codes_api_arrow, "field 'iv_login_with_xtream_codes_api_arrow'", ImageView.class);
        View viewB3 = b.c.c.b(view, R.id.rl_play_from_device, "field 'rl_play_from_device' and method 'onViewClicked'");
        routingActivity.rl_play_from_device = (RelativeLayout) b.c.c.a(viewB3, R.id.rl_play_from_device, "field 'rl_play_from_device'", RelativeLayout.class);
        this.f26215e = viewB3;
        viewB3.setOnClickListener(new c(routingActivity));
        routingActivity.iv_play_from_device = (ImageView) b.c.c.c(view, R.id.iv_play_from_device, "field 'iv_play_from_device'", ImageView.class);
        routingActivity.tv_play_from_device = (TextView) b.c.c.c(view, R.id.tv_play_from_device, "field 'tv_play_from_device'", TextView.class);
        routingActivity.iv_play_from_device_arrow = (ImageView) b.c.c.c(view, R.id.iv_play_from_device_arrow, "field 'iv_play_from_device_arrow'", ImageView.class);
        View viewB4 = b.c.c.b(view, R.id.rl_play_single_stream, "field 'rl_play_single_stream' and method 'onViewClicked'");
        routingActivity.rl_play_single_stream = (RelativeLayout) b.c.c.a(viewB4, R.id.rl_play_single_stream, "field 'rl_play_single_stream'", RelativeLayout.class);
        this.f26216f = viewB4;
        viewB4.setOnClickListener(new d(routingActivity));
        routingActivity.iv_play_single_stream = (ImageView) b.c.c.c(view, R.id.iv_play_single_stream, "field 'iv_play_single_stream'", ImageView.class);
        routingActivity.tv_play_single_stream = (TextView) b.c.c.c(view, R.id.tv_play_single_stream, "field 'tv_play_single_stream'", TextView.class);
        routingActivity.iv_play_single_stream_arrow = (ImageView) b.c.c.c(view, R.id.iv_play_single_stream_arrow, "field 'iv_play_single_stream_arrow'", ImageView.class);
        View viewB5 = b.c.c.b(view, R.id.rl_list_users, "field 'rl_list_users' and method 'onViewClicked'");
        routingActivity.rl_list_users = (RelativeLayout) b.c.c.a(viewB5, R.id.rl_list_users, "field 'rl_list_users'", RelativeLayout.class);
        this.f26217g = viewB5;
        viewB5.setOnClickListener(new e(routingActivity));
        routingActivity.iv_list_users = (ImageView) b.c.c.c(view, R.id.iv_list_users, "field 'iv_list_users'", ImageView.class);
        routingActivity.tv_list_users = (TextView) b.c.c.c(view, R.id.tv_list_users, "field 'tv_list_users'", TextView.class);
        routingActivity.iv_list_users_arrow = (ImageView) b.c.c.c(view, R.id.iv_list_users_arrow, "field 'iv_list_users_arrow'", ImageView.class);
        routingActivity.tv_link2 = (TextView) b.c.c.c(view, R.id.tv_link2, "field 'tv_link2'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        RoutingActivity routingActivity = this.f26212b;
        if (routingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26212b = null;
        routingActivity.rl_login_with_m3u = null;
        routingActivity.iv_login_with_m3u = null;
        routingActivity.tv_login_with_m3u = null;
        routingActivity.iv_login_with_m3u_arrow = null;
        routingActivity.rl_login_with_xtream_codes_api = null;
        routingActivity.iv_login_with_xtream_codes_api = null;
        routingActivity.tv_login_with_xtream_codes_api = null;
        routingActivity.iv_login_with_xtream_codes_api_arrow = null;
        routingActivity.rl_play_from_device = null;
        routingActivity.iv_play_from_device = null;
        routingActivity.tv_play_from_device = null;
        routingActivity.iv_play_from_device_arrow = null;
        routingActivity.rl_play_single_stream = null;
        routingActivity.iv_play_single_stream = null;
        routingActivity.tv_play_single_stream = null;
        routingActivity.iv_play_single_stream_arrow = null;
        routingActivity.rl_list_users = null;
        routingActivity.iv_list_users = null;
        routingActivity.tv_list_users = null;
        routingActivity.iv_list_users_arrow = null;
        routingActivity.tv_link2 = null;
        this.f26213c.setOnClickListener(null);
        this.f26213c = null;
        this.f26214d.setOnClickListener(null);
        this.f26214d = null;
        this.f26215e.setOnClickListener(null);
        this.f26215e = null;
        this.f26216f.setOnClickListener(null);
        this.f26216f = null;
        this.f26217g.setOnClickListener(null);
        this.f26217g = null;
    }
}

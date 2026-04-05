package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class LoginM3uActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoginM3uActivity f25844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25846d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LoginM3uActivity f25847d;

        public a(LoginM3uActivity loginM3uActivity) {
            this.f25847d = loginM3uActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25847d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LoginM3uActivity f25849d;

        public b(LoginM3uActivity loginM3uActivity) {
            this.f25849d = loginM3uActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25849d.onViewClicked(view);
        }
    }

    public LoginM3uActivity_ViewBinding(LoginM3uActivity loginM3uActivity, View view) {
        this.f25844b = loginM3uActivity;
        loginM3uActivity.etName = (EditText) c.c(view, R.id.et_name, "field 'etName'", EditText.class);
        loginM3uActivity.etM3uLine = (EditText) c.c(view, R.id.et_import_m3u, "field 'etM3uLine'", EditText.class);
        loginM3uActivity.etM3uLineFile = (EditText) c.c(view, R.id.et_import_m3u_file, "field 'etM3uLineFile'", EditText.class);
        View viewB = c.b(view, R.id.rl_add_user, "field 'rl_add_user' and method 'onViewClicked'");
        loginM3uActivity.rl_add_user = (RelativeLayout) c.a(viewB, R.id.rl_add_user, "field 'rl_add_user'", RelativeLayout.class);
        this.f25845c = viewB;
        viewB.setOnClickListener(new a(loginM3uActivity));
        loginM3uActivity.iv_add_user = (ImageView) c.c(view, R.id.iv_add_user, "field 'iv_add_user'", ImageView.class);
        loginM3uActivity.tv_add_user = (TextView) c.c(view, R.id.tv_add_user, "field 'tv_add_user'", TextView.class);
        loginM3uActivity.rl_list_users = (RelativeLayout) c.c(view, R.id.rl_list_users, "field 'rl_list_users'", RelativeLayout.class);
        loginM3uActivity.iv_list_users = (ImageView) c.c(view, R.id.iv_list_users, "field 'iv_list_users'", ImageView.class);
        loginM3uActivity.tv_list_users = (TextView) c.c(view, R.id.tv_list_users, "field 'tv_list_users'", TextView.class);
        View viewB2 = c.b(view, R.id.bt_browse, "field 'bt_browse' and method 'onViewClicked'");
        loginM3uActivity.bt_browse = (Button) c.a(viewB2, R.id.bt_browse, "field 'bt_browse'", Button.class);
        this.f25846d = viewB2;
        viewB2.setOnClickListener(new b(loginM3uActivity));
        loginM3uActivity.rbFile = (RadioButton) c.c(view, R.id.rb_file, "field 'rbFile'", RadioButton.class);
        loginM3uActivity.rbM3U = (RadioButton) c.c(view, R.id.rb_m3u, "field 'rbM3U'", RadioButton.class);
        loginM3uActivity.tv_browse_error = (TextView) c.c(view, R.id.tv_browse_error, "field 'tv_browse_error'", TextView.class);
        loginM3uActivity.tv_file_path = (TextView) c.c(view, R.id.tv_file_path, "field 'tv_file_path'", TextView.class);
        loginM3uActivity.vpn_button = (Button) c.c(view, R.id.vpn_con, "field 'vpn_button'", Button.class);
        loginM3uActivity.rl_playlist_name = (RelativeLayout) c.c(view, R.id.rl_playlist_name, "field 'rl_playlist_name'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        LoginM3uActivity loginM3uActivity = this.f25844b;
        if (loginM3uActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25844b = null;
        loginM3uActivity.etName = null;
        loginM3uActivity.etM3uLine = null;
        loginM3uActivity.etM3uLineFile = null;
        loginM3uActivity.rl_add_user = null;
        loginM3uActivity.iv_add_user = null;
        loginM3uActivity.tv_add_user = null;
        loginM3uActivity.rl_list_users = null;
        loginM3uActivity.iv_list_users = null;
        loginM3uActivity.tv_list_users = null;
        loginM3uActivity.bt_browse = null;
        loginM3uActivity.rbFile = null;
        loginM3uActivity.rbM3U = null;
        loginM3uActivity.tv_browse_error = null;
        loginM3uActivity.tv_file_path = null;
        loginM3uActivity.vpn_button = null;
        loginM3uActivity.rl_playlist_name = null;
        this.f25845c.setOnClickListener(null);
        this.f25845c = null;
        this.f25846d.setOnClickListener(null);
        this.f25846d = null;
    }
}

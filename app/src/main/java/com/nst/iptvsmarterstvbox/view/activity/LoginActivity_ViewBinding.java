package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class LoginActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoginActivity f25810b;

    public LoginActivity_ViewBinding(LoginActivity loginActivity, View view) {
        this.f25810b = loginActivity;
        loginActivity.yourLogioTV = (ImageView) c.c(view, R.id.iv_logo, "field 'yourLogioTV'", ImageView.class);
        loginActivity.loginTV = (TextView) c.c(view, R.id.tv_enter_credentials, "field 'loginTV'", TextView.class);
        loginActivity.activityLogin = (LinearLayout) c.c(view, R.id.activity_login, "field 'activityLogin'", LinearLayout.class);
        loginActivity.btn_free_trail = (Button) c.c(view, R.id.btn_free_trail, "field 'btn_free_trail'", Button.class);
        loginActivity.link_transform = (TextView) c.c(view, R.id.link_transform, "field 'link_transform'", TextView.class);
        loginActivity.rl_name = (RelativeLayout) c.c(view, R.id.rl_name, "field 'rl_name'", RelativeLayout.class);
        loginActivity.rl_email = (RelativeLayout) c.c(view, R.id.rl_email, "field 'rl_email'", RelativeLayout.class);
        loginActivity.rl_password = (RelativeLayout) c.c(view, R.id.rl_password, "field 'rl_password'", RelativeLayout.class);
        loginActivity.rl_server_url = (RelativeLayout) c.c(view, R.id.rl_server_url, "field 'rl_server_url'", RelativeLayout.class);
        loginActivity.rl_bt_submit = (RelativeLayout) c.c(view, R.id.rl_bt_submit, "field 'rl_bt_submit'", RelativeLayout.class);
        loginActivity.rl_bt_refresh = (Button) c.c(view, R.id.rl_bt_refresh, "field 'rl_bt_refresh'", Button.class);
        loginActivity.password_full = (LinearLayout) c.c(view, R.id.password_ful, "field 'password_full'", LinearLayout.class);
        loginActivity.eyepass = (ImageView) c.c(view, R.id.eyeicon, "field 'eyepass'", ImageView.class);
        loginActivity.linearLayout = (LinearLayout) c.c(view, R.id.linearlayout, "field 'linearLayout'", LinearLayout.class);
        loginActivity.rl_list_users = (RelativeLayout) c.c(view, R.id.rl_list_users, "field 'rl_list_users'", RelativeLayout.class);
        loginActivity.iv_connect_vpn = (ImageView) c.c(view, R.id.iv_connect_vpn, "field 'iv_connect_vpn'", ImageView.class);
        loginActivity.tv_vpn_con = (TextView) c.c(view, R.id.tv_vpn_con, "field 'tv_vpn_con'", TextView.class);
        loginActivity.tv_add_user = (TextView) c.c(view, R.id.tv_add_user, "field 'tv_add_user'", TextView.class);
        loginActivity.iv_list_users = (ImageView) c.c(view, R.id.iv_list_users, "field 'iv_list_users'", ImageView.class);
        loginActivity.tv_list_users = (TextView) c.c(view, R.id.tv_list_users, "field 'tv_list_users'", TextView.class);
        loginActivity.rl_connect_vpn = (RelativeLayout) c.c(view, R.id.rl_connect_vpn, "field 'rl_connect_vpn'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        LoginActivity loginActivity = this.f25810b;
        if (loginActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25810b = null;
        loginActivity.yourLogioTV = null;
        loginActivity.loginTV = null;
        loginActivity.activityLogin = null;
        loginActivity.btn_free_trail = null;
        loginActivity.link_transform = null;
        loginActivity.rl_name = null;
        loginActivity.rl_email = null;
        loginActivity.rl_password = null;
        loginActivity.rl_server_url = null;
        loginActivity.rl_bt_submit = null;
        loginActivity.rl_bt_refresh = null;
        loginActivity.password_full = null;
        loginActivity.eyepass = null;
        loginActivity.linearLayout = null;
        loginActivity.rl_list_users = null;
        loginActivity.iv_connect_vpn = null;
        loginActivity.tv_vpn_con = null;
        loginActivity.tv_add_user = null;
        loginActivity.iv_list_users = null;
        loginActivity.tv_list_users = null;
        loginActivity.rl_connect_vpn = null;
    }
}

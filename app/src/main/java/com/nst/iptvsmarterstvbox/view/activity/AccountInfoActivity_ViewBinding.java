package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class AccountInfoActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AccountInfoActivity f25296b;

    public AccountInfoActivity_ViewBinding(AccountInfoActivity accountInfoActivity, View view) {
        this.f25296b = accountInfoActivity;
        accountInfoActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        accountInfoActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        accountInfoActivity.tvExpiryDate = (TextView) c.c(view, R.id.tv_expiry_date, "field 'tvExpiryDate'", TextView.class);
        accountInfoActivity.tvIsTrial = (TextView) c.c(view, R.id.tv_is_trial, "field 'tvIsTrial'", TextView.class);
        accountInfoActivity.tvActiveConn = (TextView) c.c(view, R.id.tv_active_conn, "field 'tvActiveConn'", TextView.class);
        accountInfoActivity.tvCreatedAt = (TextView) c.c(view, R.id.tv_created_at, "field 'tvCreatedAt'", TextView.class);
        accountInfoActivity.tvMaxConnections = (TextView) c.c(view, R.id.tv_max_connections, "field 'tvMaxConnections'", TextView.class);
        accountInfoActivity.tvUsername = (TextView) c.c(view, R.id.tv_username, "field 'tvUsername'", TextView.class);
        accountInfoActivity.tvStatus = (TextView) c.c(view, R.id.tv_status, "field 'tvStatus'", TextView.class);
        accountInfoActivity.btnBackAccountInfo = (Button) c.c(view, R.id.btn_back_account_info, "field 'btnBackAccountInfo'", Button.class);
        accountInfoActivity.Logout = (Button) c.c(view, R.id.logout, "field 'Logout'", Button.class);
        accountInfoActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        accountInfoActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        accountInfoActivity.btn_buy_now = (Button) c.c(view, R.id.btn_buy_now, "field 'btn_buy_now'", Button.class);
        accountInfoActivity.tv_username_label = (TextView) c.c(view, R.id.tv_username_label, "field 'tv_username_label'", TextView.class);
        accountInfoActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        accountInfoActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        AccountInfoActivity accountInfoActivity = this.f25296b;
        if (accountInfoActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25296b = null;
        accountInfoActivity.toolbar = null;
        accountInfoActivity.appbarToolbar = null;
        accountInfoActivity.tvExpiryDate = null;
        accountInfoActivity.tvIsTrial = null;
        accountInfoActivity.tvActiveConn = null;
        accountInfoActivity.tvCreatedAt = null;
        accountInfoActivity.tvMaxConnections = null;
        accountInfoActivity.tvUsername = null;
        accountInfoActivity.tvStatus = null;
        accountInfoActivity.btnBackAccountInfo = null;
        accountInfoActivity.Logout = null;
        accountInfoActivity.date = null;
        accountInfoActivity.time = null;
        accountInfoActivity.btn_buy_now = null;
        accountInfoActivity.tv_username_label = null;
        accountInfoActivity.logo = null;
        accountInfoActivity.iv_back_button = null;
    }
}

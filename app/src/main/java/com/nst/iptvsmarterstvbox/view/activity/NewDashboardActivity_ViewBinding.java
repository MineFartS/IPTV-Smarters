package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class NewDashboardActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewDashboardActivity f25958b;

    public NewDashboardActivity_ViewBinding(NewDashboardActivity newDashboardActivity, View view) {
        this.f25958b = newDashboardActivity;
        newDashboardActivity.live_tv = (LinearLayout) c.c(view, R.id.live_tv, "field 'live_tv'", LinearLayout.class);
        newDashboardActivity.on_demand = (LinearLayout) c.c(view, R.id.on_demand, "field 'on_demand'", LinearLayout.class);
        newDashboardActivity.catch_up = (LinearLayout) c.c(view, R.id.catch_up, "field 'catch_up'", LinearLayout.class);
        newDashboardActivity.epg = (LinearLayout) c.c(view, R.id.epg, "field 'epg'", LinearLayout.class);
        newDashboardActivity.account_info = (ImageView) c.c(view, R.id.account_info, "field 'account_info'", ImageView.class);
        newDashboardActivity.settings = (LinearLayout) c.c(view, R.id.settings, "field 'settings'", LinearLayout.class);
        newDashboardActivity.ll_billing = (LinearLayout) c.c(view, R.id.ll_billing, "field 'll_billing'", LinearLayout.class);
        newDashboardActivity.linearLayoutLoggedinUser = (LinearLayout) c.c(view, R.id.ll_loggedin_user_multiuser, "field 'linearLayoutLoggedinUser'", LinearLayout.class);
        newDashboardActivity.llMultiscreen = (LinearLayout) c.c(view, R.id.multiscreen, "field 'llMultiscreen'", LinearLayout.class);
        newDashboardActivity.tvExpiryDate = (TextView) c.c(view, R.id.expiration_date, "field 'tvExpiryDate'", TextView.class);
        newDashboardActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        newDashboardActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        newDashboardActivity.tvLoggedinUser = (TextView) c.c(view, R.id.loggedin_user, "field 'tvLoggedinUser'", TextView.class);
        newDashboardActivity.tvAccountinfoButton = (TextView) c.c(view, R.id.tv_account_info_button, "field 'tvAccountinfoButton'", TextView.class);
        newDashboardActivity.tvSwitchUserButton = (TextView) c.c(view, R.id.tv_switch_user_button, "field 'tvSwitchUserButton'", TextView.class);
        newDashboardActivity.tvSettingsButton = (TextView) c.c(view, R.id.tv_settings_button, "field 'tvSettingsButton'", TextView.class);
        newDashboardActivity.tvRecordingsButton = (TextView) c.c(view, R.id.tv_recording_button, "field 'tvRecordingsButton'", TextView.class);
        newDashboardActivity.tv_check_vpn_button = (TextView) c.c(view, R.id.tv_check_vpn_button, "field 'tv_check_vpn_button'", TextView.class);
        newDashboardActivity.tv_notification = (TextView) c.c(view, R.id.tv_notification, "field 'tv_notification'", TextView.class);
        newDashboardActivity.tv_radio = (TextView) c.c(view, R.id.tv_radio, "field 'tv_radio'", TextView.class);
        newDashboardActivity.epgTV = (TextView) c.c(view, R.id.tv_epg, "field 'epgTV'", TextView.class);
        newDashboardActivity.recordingsIV = (ImageView) c.c(view, R.id.iv_recording, "field 'recordingsIV'", ImageView.class);
        newDashboardActivity.settingsIV = (ImageView) c.c(view, R.id.settings_new, "field 'settingsIV'", ImageView.class);
        newDashboardActivity.ivSwitchUser = (ImageView) c.c(view, R.id.switch_user, "field 'ivSwitchUser'", ImageView.class);
        newDashboardActivity.iv_notification = (ImageView) c.c(view, R.id.iv_notification, "field 'iv_notification'", ImageView.class);
        newDashboardActivity.iv_arrow = (ImageView) c.c(view, R.id.iv_arrow, "field 'iv_arrow'", ImageView.class);
        newDashboardActivity.tv_billing_subscription = (TextView) c.c(view, R.id.tv_billing_subscription, "field 'tv_billing_subscription'", TextView.class);
        newDashboardActivity.iv_catch_up = (ImageView) c.c(view, R.id.iv_catch_up, "field 'iv_catch_up'", ImageView.class);
        newDashboardActivity.tv_catch_up = (TextView) c.c(view, R.id.tv_catch_up, "field 'tv_catch_up'", TextView.class);
        newDashboardActivity.llRecording = (LinearLayout) c.c(view, R.id.recording, "field 'llRecording'", LinearLayout.class);
        newDashboardActivity.check_VPN_Status = (ImageView) c.c(view, R.id.check_VPN_Status, "field 'check_VPN_Status'", ImageView.class);
        newDashboardActivity.progressLive = (ProgressBar) c.c(view, R.id.progress_live, "field 'progressLive'", ProgressBar.class);
        newDashboardActivity.iv_download_icon_live = (ImageView) c.c(view, R.id.iv_download_icon_live, "field 'iv_download_icon_live'", ImageView.class);
        newDashboardActivity.pb_downloading_live = (ProgressBar) c.c(view, R.id.pb_downloading_live, "field 'pb_downloading_live'", ProgressBar.class);
        newDashboardActivity.tv_download_text_live = (TextView) c.c(view, R.id.tv_download_text_live, "field 'tv_download_text_live'", TextView.class);
        newDashboardActivity.ll_download_live = (LinearLayout) c.c(view, R.id.ll_download_live, "field 'll_download_live'", LinearLayout.class);
        newDashboardActivity.ll_last_updated_live = (LinearLayout) c.c(view, R.id.ll_last_updated_live, "field 'll_last_updated_live'", LinearLayout.class);
        newDashboardActivity.tv_last_updated_live = (TextView) c.c(view, R.id.tv_last_updated_live, "field 'tv_last_updated_live'", TextView.class);
        newDashboardActivity.progressMovies = (ProgressBar) c.c(view, R.id.progress_movies, "field 'progressMovies'", ProgressBar.class);
        newDashboardActivity.iv_download_icon_movies = (ImageView) c.c(view, R.id.iv_download_icon_movies, "field 'iv_download_icon_movies'", ImageView.class);
        newDashboardActivity.pb_downloading_movies = (ProgressBar) c.c(view, R.id.pb_downloading_movies, "field 'pb_downloading_movies'", ProgressBar.class);
        newDashboardActivity.tv_download_text_movies = (TextView) c.c(view, R.id.tv_download_text_movies, "field 'tv_download_text_movies'", TextView.class);
        newDashboardActivity.ll_download_movies = (LinearLayout) c.c(view, R.id.ll_download_movies, "field 'll_download_movies'", LinearLayout.class);
        newDashboardActivity.ll_last_updated_movies = (LinearLayout) c.c(view, R.id.ll_last_updated_movies, "field 'll_last_updated_movies'", LinearLayout.class);
        newDashboardActivity.tv_last_updated_movies = (TextView) c.c(view, R.id.tv_last_updated_movies, "field 'tv_last_updated_movies'", TextView.class);
        newDashboardActivity.progressSeries = (ProgressBar) c.c(view, R.id.progress_series, "field 'progressSeries'", ProgressBar.class);
        newDashboardActivity.iv_download_icon_series = (ImageView) c.c(view, R.id.iv_download_icon_series, "field 'iv_download_icon_series'", ImageView.class);
        newDashboardActivity.pb_downloading_series = (ProgressBar) c.c(view, R.id.pb_downloading_series, "field 'pb_downloading_series'", ProgressBar.class);
        newDashboardActivity.tv_download_text_series = (TextView) c.c(view, R.id.tv_download_text_series, "field 'tv_download_text_series'", TextView.class);
        newDashboardActivity.ll_download_series = (LinearLayout) c.c(view, R.id.ll_download_series, "field 'll_download_series'", LinearLayout.class);
        newDashboardActivity.ll_last_updated_series = (LinearLayout) c.c(view, R.id.ll_last_updated_series, "field 'll_last_updated_series'", LinearLayout.class);
        newDashboardActivity.tv_last_updated_series = (TextView) c.c(view, R.id.tv_last_updated_series, "field 'tv_last_updated_series'", TextView.class);
        newDashboardActivity.ll_search = (LinearLayout) c.c(view, R.id.ll_search, "field 'll_search'", LinearLayout.class);
        newDashboardActivity.iv_radio = (ImageView) c.c(view, R.id.iv_radio, "field 'iv_radio'", ImageView.class);
        newDashboardActivity.progress_epg = (ProgressBar) c.c(view, R.id.progress_epg, "field 'progress_epg'", ProgressBar.class);
        newDashboardActivity.progress_multiscreen = (ProgressBar) c.c(view, R.id.progress_multiscreen, "field 'progress_multiscreen'", ProgressBar.class);
        newDashboardActivity.progress_catchup = (ProgressBar) c.c(view, R.id.progress_catchup, "field 'progress_catchup'", ProgressBar.class);
        newDashboardActivity.tv_purchase = (TextView) c.c(view, R.id.tv_purchase, "field 'tv_purchase'", TextView.class);
        newDashboardActivity.ll_purchase_add_free_version = (LinearLayout) c.c(view, R.id.ll_purchase_add_free_version, "field 'll_purchase_add_free_version'", LinearLayout.class);
        newDashboardActivity.iv_premium_or_account = (ImageView) c.c(view, R.id.iv_premium_or_account, "field 'iv_premium_or_account'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NewDashboardActivity newDashboardActivity = this.f25958b;
        if (newDashboardActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25958b = null;
        newDashboardActivity.live_tv = null;
        newDashboardActivity.on_demand = null;
        newDashboardActivity.catch_up = null;
        newDashboardActivity.epg = null;
        newDashboardActivity.account_info = null;
        newDashboardActivity.settings = null;
        newDashboardActivity.ll_billing = null;
        newDashboardActivity.linearLayoutLoggedinUser = null;
        newDashboardActivity.llMultiscreen = null;
        newDashboardActivity.tvExpiryDate = null;
        newDashboardActivity.date = null;
        newDashboardActivity.time = null;
        newDashboardActivity.tvLoggedinUser = null;
        newDashboardActivity.tvAccountinfoButton = null;
        newDashboardActivity.tvSwitchUserButton = null;
        newDashboardActivity.tvSettingsButton = null;
        newDashboardActivity.tvRecordingsButton = null;
        newDashboardActivity.tv_check_vpn_button = null;
        newDashboardActivity.tv_notification = null;
        newDashboardActivity.tv_radio = null;
        newDashboardActivity.epgTV = null;
        newDashboardActivity.recordingsIV = null;
        newDashboardActivity.settingsIV = null;
        newDashboardActivity.ivSwitchUser = null;
        newDashboardActivity.iv_notification = null;
        newDashboardActivity.iv_arrow = null;
        newDashboardActivity.tv_billing_subscription = null;
        newDashboardActivity.iv_catch_up = null;
        newDashboardActivity.tv_catch_up = null;
        newDashboardActivity.llRecording = null;
        newDashboardActivity.check_VPN_Status = null;
        newDashboardActivity.progressLive = null;
        newDashboardActivity.iv_download_icon_live = null;
        newDashboardActivity.pb_downloading_live = null;
        newDashboardActivity.tv_download_text_live = null;
        newDashboardActivity.ll_download_live = null;
        newDashboardActivity.ll_last_updated_live = null;
        newDashboardActivity.tv_last_updated_live = null;
        newDashboardActivity.progressMovies = null;
        newDashboardActivity.iv_download_icon_movies = null;
        newDashboardActivity.pb_downloading_movies = null;
        newDashboardActivity.tv_download_text_movies = null;
        newDashboardActivity.ll_download_movies = null;
        newDashboardActivity.ll_last_updated_movies = null;
        newDashboardActivity.tv_last_updated_movies = null;
        newDashboardActivity.progressSeries = null;
        newDashboardActivity.iv_download_icon_series = null;
        newDashboardActivity.pb_downloading_series = null;
        newDashboardActivity.tv_download_text_series = null;
        newDashboardActivity.ll_download_series = null;
        newDashboardActivity.ll_last_updated_series = null;
        newDashboardActivity.tv_last_updated_series = null;
        newDashboardActivity.ll_search = null;
        newDashboardActivity.iv_radio = null;
        newDashboardActivity.progress_epg = null;
        newDashboardActivity.progress_multiscreen = null;
        newDashboardActivity.progress_catchup = null;
        newDashboardActivity.tv_purchase = null;
        newDashboardActivity.ll_purchase_add_free_version = null;
        newDashboardActivity.iv_premium_or_account = null;
    }
}

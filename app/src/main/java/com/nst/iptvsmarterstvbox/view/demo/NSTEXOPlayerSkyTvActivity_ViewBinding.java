package minefarts.iptvsmarters.view.demo;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class NSTEXOPlayerSkyTvActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NSTEXOPlayerSkyTvActivity f28841b;

    public NSTEXOPlayerSkyTvActivity_ViewBinding(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, View view) {
        this.f28841b = nSTEXOPlayerSkyTvActivity;
        nSTEXOPlayerSkyTvActivity.sb_volume = (SeekBar) c.c(view, R.id.sb_volume, "field 'sb_volume'", SeekBar.class);
        nSTEXOPlayerSkyTvActivity.sb_brightness = (SeekBar) c.c(view, R.id.sb_brightness, "field 'sb_brightness'", SeekBar.class);
        nSTEXOPlayerSkyTvActivity.ll_brightness = (LinearLayout) c.c(view, R.id.ll_brightness, "field 'll_brightness'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_volume = (LinearLayout) c.c(view, R.id.ll_volume, "field 'll_volume'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.tv_brightness = (TextView) c.c(view, R.id.tv_brightness, "field 'tv_brightness'", TextView.class);
        nSTEXOPlayerSkyTvActivity.tv_volume = (TextView) c.c(view, R.id.tv_volume, "field 'tv_volume'", TextView.class);
        nSTEXOPlayerSkyTvActivity.ll_pause_play = (LinearLayout) c.c(view, R.id.ll_pause_play, "field 'll_pause_play'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.rl_settings_box = (RelativeLayout) c.c(view, R.id.rl_settings_box, "field 'rl_settings_box'", RelativeLayout.class);
        nSTEXOPlayerSkyTvActivity.rl_episodes_box = (RelativeLayout) c.c(view, R.id.rl_episodes_box, "field 'rl_episodes_box'", RelativeLayout.class);
        nSTEXOPlayerSkyTvActivity.rl_episodes_box_player = (RelativeLayout) c.c(view, R.id.rl_episodes_box_player, "field 'rl_episodes_box_player'", RelativeLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_player_header_footer = (LinearLayout) c.c(view, R.id.ll_player_header_footer, "field 'll_player_header_footer'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.iv_play = (ImageView) c.c(view, R.id.iv_play, "field 'iv_play'", ImageView.class);
        nSTEXOPlayerSkyTvActivity.iv_pause = (ImageView) c.c(view, R.id.iv_pause, "field 'iv_pause'", ImageView.class);
        nSTEXOPlayerSkyTvActivity.ll_back = (LinearLayout) c.c(view, R.id.ll_back, "field 'll_back'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.iv_back_episodes = (ImageView) c.c(view, R.id.iv_back_episodes, "field 'iv_back_episodes'", ImageView.class);
        nSTEXOPlayerSkyTvActivity.iv_back_settings = (ImageView) c.c(view, R.id.iv_back_settings, "field 'iv_back_settings'", ImageView.class);
        nSTEXOPlayerSkyTvActivity.iv_back = (ImageView) c.c(view, R.id.iv_back, "field 'iv_back'", ImageView.class);
        nSTEXOPlayerSkyTvActivity.ll_back_click = (LinearLayout) c.c(view, R.id.ll_back_click, "field 'll_back_click'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.iv_audio_subtitle_track = (ImageView) c.c(view, R.id.iv_audio_subtitle_track, "field 'iv_audio_subtitle_track'", ImageView.class);
        nSTEXOPlayerSkyTvActivity.ll_crop = (LinearLayout) c.c(view, R.id.ll_crop, "field 'll_crop'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_audio_subtitle_settings = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_multi_screen = (LinearLayout) c.c(view, R.id.ll_multi_screen, "field 'll_multi_screen'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_channels_list = (LinearLayout) c.c(view, R.id.ll_channels_list, "field 'll_channels_list'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_previous_channel = (LinearLayout) c.c(view, R.id.ll_previous_channel, "field 'll_previous_channel'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_next_channel = (LinearLayout) c.c(view, R.id.ll_next_channel, "field 'll_next_channel'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.tv_episode_name = (TextView) c.c(view, R.id.tv_episode_name, "field 'tv_episode_name'", TextView.class);
        nSTEXOPlayerSkyTvActivity.ll_toolbar = (LinearLayout) c.c(view, R.id.ll_toolbar, "field 'll_toolbar'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_top_right_setting = (LinearLayout) c.c(view, R.id.ll_top_right_setting, "field 'll_top_right_setting'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_top_left_back = (LinearLayout) c.c(view, R.id.ll_top_left_back, "field 'll_top_left_back'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_bottom_footer_icons = (LinearLayout) c.c(view, R.id.ll_bottom_footer_icons, "field 'll_bottom_footer_icons'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.recycler_view_left_sidebar = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        nSTEXOPlayerSkyTvActivity.recycler_view_left_sidebar_player = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar_player, "field 'recycler_view_left_sidebar_player'", RecyclerView.class);
        nSTEXOPlayerSkyTvActivity.et_search_left_side = (EditText) c.c(view, R.id.et_search_left_side, "field 'et_search_left_side'", EditText.class);
        nSTEXOPlayerSkyTvActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_no_cat_found_player = (LinearLayout) c.c(view, R.id.ll_no_cat_found_player, "field 'll_no_cat_found_player'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.rl_search_cat = (RelativeLayout) c.c(view, R.id.rl_search_cat, "field 'rl_search_cat'", RelativeLayout.class);
        nSTEXOPlayerSkyTvActivity.ll_click_to_play = (LinearLayout) c.c(view, R.id.ll_click_to_play, "field 'll_click_to_play'", LinearLayout.class);
        nSTEXOPlayerSkyTvActivity.iv_radio = (ImageView) c.c(view, R.id.iv_radio, "field 'iv_radio'", ImageView.class);
        nSTEXOPlayerSkyTvActivity.header_page_title = (TextView) c.c(view, R.id.textView, "field 'header_page_title'", TextView.class);
        nSTEXOPlayerSkyTvActivity.ll_audio_subtitle_settings_click = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings_click, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f28841b;
        if (nSTEXOPlayerSkyTvActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f28841b = null;
        nSTEXOPlayerSkyTvActivity.sb_volume = null;
        nSTEXOPlayerSkyTvActivity.sb_brightness = null;
        nSTEXOPlayerSkyTvActivity.ll_brightness = null;
        nSTEXOPlayerSkyTvActivity.ll_volume = null;
        nSTEXOPlayerSkyTvActivity.tv_brightness = null;
        nSTEXOPlayerSkyTvActivity.tv_volume = null;
        nSTEXOPlayerSkyTvActivity.ll_pause_play = null;
        nSTEXOPlayerSkyTvActivity.rl_settings_box = null;
        nSTEXOPlayerSkyTvActivity.rl_episodes_box = null;
        nSTEXOPlayerSkyTvActivity.rl_episodes_box_player = null;
        nSTEXOPlayerSkyTvActivity.ll_player_header_footer = null;
        nSTEXOPlayerSkyTvActivity.iv_play = null;
        nSTEXOPlayerSkyTvActivity.iv_pause = null;
        nSTEXOPlayerSkyTvActivity.ll_back = null;
        nSTEXOPlayerSkyTvActivity.iv_back_episodes = null;
        nSTEXOPlayerSkyTvActivity.iv_back_settings = null;
        nSTEXOPlayerSkyTvActivity.iv_back = null;
        nSTEXOPlayerSkyTvActivity.ll_back_click = null;
        nSTEXOPlayerSkyTvActivity.iv_audio_subtitle_track = null;
        nSTEXOPlayerSkyTvActivity.ll_crop = null;
        nSTEXOPlayerSkyTvActivity.ll_audio_subtitle_settings = null;
        nSTEXOPlayerSkyTvActivity.ll_multi_screen = null;
        nSTEXOPlayerSkyTvActivity.ll_channels_list = null;
        nSTEXOPlayerSkyTvActivity.ll_previous_channel = null;
        nSTEXOPlayerSkyTvActivity.ll_next_channel = null;
        nSTEXOPlayerSkyTvActivity.tv_episode_name = null;
        nSTEXOPlayerSkyTvActivity.ll_toolbar = null;
        nSTEXOPlayerSkyTvActivity.ll_top_right_setting = null;
        nSTEXOPlayerSkyTvActivity.ll_top_left_back = null;
        nSTEXOPlayerSkyTvActivity.ll_bottom_footer_icons = null;
        nSTEXOPlayerSkyTvActivity.recycler_view_left_sidebar = null;
        nSTEXOPlayerSkyTvActivity.recycler_view_left_sidebar_player = null;
        nSTEXOPlayerSkyTvActivity.et_search_left_side = null;
        nSTEXOPlayerSkyTvActivity.ll_no_cat_found = null;
        nSTEXOPlayerSkyTvActivity.ll_no_cat_found_player = null;
        nSTEXOPlayerSkyTvActivity.rl_search_cat = null;
        nSTEXOPlayerSkyTvActivity.ll_click_to_play = null;
        nSTEXOPlayerSkyTvActivity.iv_radio = null;
        nSTEXOPlayerSkyTvActivity.header_page_title = null;
        nSTEXOPlayerSkyTvActivity.ll_audio_subtitle_settings_click = null;
    }
}

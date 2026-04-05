package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerSkyTvActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NSTIJKPlayerSkyTvActivity f29400b;

    public NSTIJKPlayerSkyTvActivity_ViewBinding(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, View view) {
        this.f29400b = nSTIJKPlayerSkyTvActivity;
        nSTIJKPlayerSkyTvActivity.rg_subtitle = (RadioGroup) c.c(view, R.id.subtitle_radio_group, "field 'rg_subtitle'", RadioGroup.class);
        nSTIJKPlayerSkyTvActivity.rg_audio = (RadioGroup) c.c(view, R.id.audio_radio_group, "field 'rg_audio'", RadioGroup.class);
        nSTIJKPlayerSkyTvActivity.rg_video = (RadioGroup) c.c(view, R.id.video_radio_group, "field 'rg_video'", RadioGroup.class);
        nSTIJKPlayerSkyTvActivity.tv_sub_font_size = (TextView) c.c(view, R.id.tv_sub_font_size, "field 'tv_sub_font_size'", TextView.class);
        nSTIJKPlayerSkyTvActivity.fl_sub_font_size = (FrameLayout) c.c(view, R.id.fl_sub_font_size, "field 'fl_sub_font_size'", FrameLayout.class);
        nSTIJKPlayerSkyTvActivity.sb_volume = (SeekBar) c.c(view, R.id.sb_volume, "field 'sb_volume'", SeekBar.class);
        nSTIJKPlayerSkyTvActivity.sb_brightness = (SeekBar) c.c(view, R.id.sb_brightness, "field 'sb_brightness'", SeekBar.class);
        nSTIJKPlayerSkyTvActivity.ll_brightness = (LinearLayout) c.c(view, R.id.ll_brightness, "field 'll_brightness'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_volume = (LinearLayout) c.c(view, R.id.ll_volume, "field 'll_volume'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.tv_brightness = (TextView) c.c(view, R.id.tv_brightness, "field 'tv_brightness'", TextView.class);
        nSTIJKPlayerSkyTvActivity.tv_volume = (TextView) c.c(view, R.id.tv_volume, "field 'tv_volume'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_pause_play = (LinearLayout) c.c(view, R.id.ll_pause_play, "field 'll_pause_play'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_settings_box = (RelativeLayout) c.c(view, R.id.rl_settings_box, "field 'rl_settings_box'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_episodes_box = (RelativeLayout) c.c(view, R.id.rl_episodes_box, "field 'rl_episodes_box'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_episodes_box_player = (RelativeLayout) c.c(view, R.id.rl_episodes_box_player, "field 'rl_episodes_box_player'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.no_audio_track = (TextView) c.c(view, R.id.tv_no_audio_track, "field 'no_audio_track'", TextView.class);
        nSTIJKPlayerSkyTvActivity.no_subtitle_track = (TextView) c.c(view, R.id.tv_no_subtitle_track, "field 'no_subtitle_track'", TextView.class);
        nSTIJKPlayerSkyTvActivity.no_video_track = (TextView) c.c(view, R.id.tv_no_video_track, "field 'no_video_track'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_player_header_footer = (LinearLayout) c.c(view, R.id.ll_player_header_footer, "field 'll_player_header_footer'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_play = (ImageView) c.c(view, R.id.iv_play, "field 'iv_play'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.iv_pause = (ImageView) c.c(view, R.id.iv_pause, "field 'iv_pause'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.ll_back = (LinearLayout) c.c(view, R.id.ll_back, "field 'll_back'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_back_episodes = (ImageView) c.c(view, R.id.iv_back_episodes, "field 'iv_back_episodes'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.iv_back_settings = (ImageView) c.c(view, R.id.iv_back_settings, "field 'iv_back_settings'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.iv_back = (ImageView) c.c(view, R.id.iv_back, "field 'iv_back'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.ll_back_click = (LinearLayout) c.c(view, R.id.ll_back_click, "field 'll_back_click'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_audio_subtitle_track = (ImageView) c.c(view, R.id.iv_audio_subtitle_track, "field 'iv_audio_subtitle_track'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.ll_crop = (LinearLayout) c.c(view, R.id.ll_crop, "field 'll_crop'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_multi_screen = (LinearLayout) c.c(view, R.id.ll_multi_screen, "field 'll_multi_screen'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_channels_list = (LinearLayout) c.c(view, R.id.ll_channels_list, "field 'll_channels_list'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_previous_channel = (LinearLayout) c.c(view, R.id.ll_previous_channel, "field 'll_previous_channel'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_next_channel = (LinearLayout) c.c(view, R.id.ll_next_channel, "field 'll_next_channel'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.tv_episode_name = (TextView) c.c(view, R.id.tv_episode_name, "field 'tv_episode_name'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_toolbar = (LinearLayout) c.c(view, R.id.ll_toolbar, "field 'll_toolbar'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_top_right_setting = (LinearLayout) c.c(view, R.id.ll_top_right_setting, "field 'll_top_right_setting'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_top_left_back = (LinearLayout) c.c(view, R.id.ll_top_left_back, "field 'll_top_left_back'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_bottom_footer_icons = (LinearLayout) c.c(view, R.id.ll_bottom_footer_icons, "field 'll_bottom_footer_icons'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar_player = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar_player, "field 'recycler_view_left_sidebar_player'", RecyclerView.class);
        nSTIJKPlayerSkyTvActivity.et_search_left_side = (EditText) c.c(view, R.id.et_search_left_side, "field 'et_search_left_side'", EditText.class);
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found_player = (LinearLayout) c.c(view, R.id.ll_no_cat_found_player, "field 'll_no_cat_found_player'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_search_cat = (RelativeLayout) c.c(view, R.id.rl_search_cat, "field 'rl_search_cat'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_click_to_play = (LinearLayout) c.c(view, R.id.ll_click_to_play, "field 'll_click_to_play'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_radio = (ImageView) c.c(view, R.id.iv_radio, "field 'iv_radio'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.header_page_title = (TextView) c.c(view, R.id.textView, "field 'header_page_title'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings_click = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings_click, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f29400b;
        if (nSTIJKPlayerSkyTvActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29400b = null;
        nSTIJKPlayerSkyTvActivity.rg_subtitle = null;
        nSTIJKPlayerSkyTvActivity.rg_audio = null;
        nSTIJKPlayerSkyTvActivity.rg_video = null;
        nSTIJKPlayerSkyTvActivity.tv_sub_font_size = null;
        nSTIJKPlayerSkyTvActivity.fl_sub_font_size = null;
        nSTIJKPlayerSkyTvActivity.sb_volume = null;
        nSTIJKPlayerSkyTvActivity.sb_brightness = null;
        nSTIJKPlayerSkyTvActivity.ll_brightness = null;
        nSTIJKPlayerSkyTvActivity.ll_volume = null;
        nSTIJKPlayerSkyTvActivity.tv_brightness = null;
        nSTIJKPlayerSkyTvActivity.tv_volume = null;
        nSTIJKPlayerSkyTvActivity.ll_pause_play = null;
        nSTIJKPlayerSkyTvActivity.rl_settings_box = null;
        nSTIJKPlayerSkyTvActivity.rl_episodes_box = null;
        nSTIJKPlayerSkyTvActivity.rl_episodes_box_player = null;
        nSTIJKPlayerSkyTvActivity.no_audio_track = null;
        nSTIJKPlayerSkyTvActivity.no_subtitle_track = null;
        nSTIJKPlayerSkyTvActivity.no_video_track = null;
        nSTIJKPlayerSkyTvActivity.ll_player_header_footer = null;
        nSTIJKPlayerSkyTvActivity.iv_play = null;
        nSTIJKPlayerSkyTvActivity.iv_pause = null;
        nSTIJKPlayerSkyTvActivity.ll_back = null;
        nSTIJKPlayerSkyTvActivity.iv_back_episodes = null;
        nSTIJKPlayerSkyTvActivity.iv_back_settings = null;
        nSTIJKPlayerSkyTvActivity.iv_back = null;
        nSTIJKPlayerSkyTvActivity.ll_back_click = null;
        nSTIJKPlayerSkyTvActivity.iv_audio_subtitle_track = null;
        nSTIJKPlayerSkyTvActivity.ll_crop = null;
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings = null;
        nSTIJKPlayerSkyTvActivity.ll_multi_screen = null;
        nSTIJKPlayerSkyTvActivity.ll_channels_list = null;
        nSTIJKPlayerSkyTvActivity.ll_previous_channel = null;
        nSTIJKPlayerSkyTvActivity.ll_next_channel = null;
        nSTIJKPlayerSkyTvActivity.tv_episode_name = null;
        nSTIJKPlayerSkyTvActivity.ll_toolbar = null;
        nSTIJKPlayerSkyTvActivity.ll_top_right_setting = null;
        nSTIJKPlayerSkyTvActivity.ll_top_left_back = null;
        nSTIJKPlayerSkyTvActivity.ll_bottom_footer_icons = null;
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar = null;
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar_player = null;
        nSTIJKPlayerSkyTvActivity.et_search_left_side = null;
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found = null;
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found_player = null;
        nSTIJKPlayerSkyTvActivity.rl_search_cat = null;
        nSTIJKPlayerSkyTvActivity.ll_click_to_play = null;
        nSTIJKPlayerSkyTvActivity.iv_radio = null;
        nSTIJKPlayerSkyTvActivity.header_page_title = null;
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings_click = null;
    }
}

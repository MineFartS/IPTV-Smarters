package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerSkyActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NSTIJKPlayerSkyActivity f29285b;

    public NSTIJKPlayerSkyActivity_ViewBinding(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, View view) {
        this.f29285b = nSTIJKPlayerSkyActivity;
        nSTIJKPlayerSkyActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        nSTIJKPlayerSkyActivity.rg_subtitle = (RadioGroup) c.c(view, R.id.subtitle_radio_group, "field 'rg_subtitle'", RadioGroup.class);
        nSTIJKPlayerSkyActivity.rg_audio = (RadioGroup) c.c(view, R.id.audio_radio_group, "field 'rg_audio'", RadioGroup.class);
        nSTIJKPlayerSkyActivity.rg_video = (RadioGroup) c.c(view, R.id.video_radio_group, "field 'rg_video'", RadioGroup.class);
        nSTIJKPlayerSkyActivity.tv_sub_font_size = (TextView) c.c(view, R.id.tv_sub_font_size, "field 'tv_sub_font_size'", TextView.class);
        nSTIJKPlayerSkyActivity.fl_sub_font_size = (FrameLayout) c.c(view, R.id.fl_sub_font_size, "field 'fl_sub_font_size'", FrameLayout.class);
        nSTIJKPlayerSkyActivity.sb_volume = (SeekBar) c.c(view, R.id.sb_volume, "field 'sb_volume'", SeekBar.class);
        nSTIJKPlayerSkyActivity.sb_brightness = (SeekBar) c.c(view, R.id.sb_brightness, "field 'sb_brightness'", SeekBar.class);
        nSTIJKPlayerSkyActivity.ll_brightness = (LinearLayout) c.c(view, R.id.ll_brightness, "field 'll_brightness'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_volume = (LinearLayout) c.c(view, R.id.ll_volume, "field 'll_volume'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.tv_brightness = (TextView) c.c(view, R.id.tv_brightness, "field 'tv_brightness'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_volume = (TextView) c.c(view, R.id.tv_volume, "field 'tv_volume'", TextView.class);
        nSTIJKPlayerSkyActivity.ll_pause_play = (LinearLayout) c.c(view, R.id.ll_pause_play, "field 'll_pause_play'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.rl_settings_box = (RelativeLayout) c.c(view, R.id.rl_settings_box, "field 'rl_settings_box'", RelativeLayout.class);
        nSTIJKPlayerSkyActivity.rl_episodes_box = (RelativeLayout) c.c(view, R.id.rl_episodes_box, "field 'rl_episodes_box'", RelativeLayout.class);
        nSTIJKPlayerSkyActivity.iv_hp_lock = (ImageView) c.c(view, R.id.iv_hp_lock, "field 'iv_hp_lock'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_hp_lock_click = (LinearLayout) c.c(view, R.id.ll_hp_lock_click, "field 'll_hp_lock_click'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_screen_locked = (LinearLayout) c.c(view, R.id.ll_screen_locked, "field 'll_screen_locked'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_unlock_button = (ImageView) c.c(view, R.id.iv_unlock_button, "field 'iv_unlock_button'", ImageView.class);
        nSTIJKPlayerSkyActivity.no_audio_track = (TextView) c.c(view, R.id.tv_no_audio_track, "field 'no_audio_track'", TextView.class);
        nSTIJKPlayerSkyActivity.no_subtitle_track = (TextView) c.c(view, R.id.tv_no_subtitle_track, "field 'no_subtitle_track'", TextView.class);
        nSTIJKPlayerSkyActivity.no_video_track = (TextView) c.c(view, R.id.tv_no_video_track, "field 'no_video_track'", TextView.class);
        nSTIJKPlayerSkyActivity.ll_player_header_footer = (LinearLayout) c.c(view, R.id.ll_player_header_footer, "field 'll_player_header_footer'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_play = (ImageView) c.c(view, R.id.iv_play, "field 'iv_play'", ImageView.class);
        nSTIJKPlayerSkyActivity.iv_pause = (ImageView) c.c(view, R.id.iv_pause, "field 'iv_pause'", ImageView.class);
        nSTIJKPlayerSkyActivity.tv_seek_left = (ImageView) c.c(view, R.id.tv_seek_left, "field 'tv_seek_left'", ImageView.class);
        nSTIJKPlayerSkyActivity.tv_seek_right = (ImageView) c.c(view, R.id.tv_seek_right, "field 'tv_seek_right'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_back = (LinearLayout) c.c(view, R.id.ll_back, "field 'll_back'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_back_episodes = (ImageView) c.c(view, R.id.iv_back_episodes, "field 'iv_back_episodes'", ImageView.class);
        nSTIJKPlayerSkyActivity.iv_back_settings = (ImageView) c.c(view, R.id.iv_back_settings, "field 'iv_back_settings'", ImageView.class);
        nSTIJKPlayerSkyActivity.iv_back = (ImageView) c.c(view, R.id.iv_back, "field 'iv_back'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_back_click = (LinearLayout) c.c(view, R.id.ll_back_click, "field 'll_back_click'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_audio_subtitle_track = (ImageView) c.c(view, R.id.iv_audio_subtitle_track, "field 'iv_audio_subtitle_track'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_crop = (LinearLayout) c.c(view, R.id.ll_crop, "field 'll_crop'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_hp_play_from_beginning = (ImageView) c.c(view, R.id.iv_hp_play_from_beginning, "field 'iv_hp_play_from_beginning'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_restart = (LinearLayout) c.c(view, R.id.ll_restart, "field 'll_restart'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_multi_screen = (LinearLayout) c.c(view, R.id.ll_multi_screen, "field 'll_multi_screen'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_channels_list = (LinearLayout) c.c(view, R.id.ll_channels_list, "field 'll_channels_list'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.tv_episode_name = (TextView) c.c(view, R.id.tv_episode_name, "field 'tv_episode_name'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_channel_name = (TextView) c.c(view, R.id.tv_channel_name, "field 'tv_channel_name'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_program_name = (TextView) c.c(view, R.id.tv_program_name, "field 'tv_program_name'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_start_stop = (TextView) c.c(view, R.id.tv_start_stop, "field 'tv_start_stop'", TextView.class);
        nSTIJKPlayerSkyActivity.recycler_view_left_sidebar = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        nSTIJKPlayerSkyActivity.ll_pb_left_categories = (LinearLayout) c.c(view, R.id.ll_pb_left_categories, "field 'll_pb_left_categories'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_casting_to_tv = (LinearLayout) c.c(view, R.id.ll_casting_to_tv, "field 'll_casting_to_tv'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.tv_casting_status_text = (TextView) c.c(view, R.id.tv_casting_status_text, "field 'tv_casting_status_text'", TextView.class);
        nSTIJKPlayerSkyActivity.ll_chromecast_click = (LinearLayout) c.c(view, R.id.ll_chromecast_click, "field 'll_chromecast_click'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.cast_button = (MediaRouteButton) c.c(view, R.id.cast_button, "field 'cast_button'", MediaRouteButton.class);
        nSTIJKPlayerSkyActivity.iv_radio = (ImageView) c.c(view, R.id.iv_radio, "field 'iv_radio'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_bottom_1 = (LinearLayout) c.c(view, R.id.ll_bottom_1, "field 'll_bottom_1'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_bottom_2 = (LinearLayout) c.c(view, R.id.ll_bottom_2, "field 'll_bottom_2'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.header_page_title = (TextView) c.c(view, R.id.textView, "field 'header_page_title'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_page_name_right_side = (TextView) c.c(view, R.id.tv_page_name_right_side, "field 'tv_page_name_right_side'", TextView.class);
        nSTIJKPlayerSkyActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings_click = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings_click, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f29285b;
        if (nSTIJKPlayerSkyActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29285b = null;
        nSTIJKPlayerSkyActivity.logo = null;
        nSTIJKPlayerSkyActivity.rg_subtitle = null;
        nSTIJKPlayerSkyActivity.rg_audio = null;
        nSTIJKPlayerSkyActivity.rg_video = null;
        nSTIJKPlayerSkyActivity.tv_sub_font_size = null;
        nSTIJKPlayerSkyActivity.fl_sub_font_size = null;
        nSTIJKPlayerSkyActivity.sb_volume = null;
        nSTIJKPlayerSkyActivity.sb_brightness = null;
        nSTIJKPlayerSkyActivity.ll_brightness = null;
        nSTIJKPlayerSkyActivity.ll_volume = null;
        nSTIJKPlayerSkyActivity.tv_brightness = null;
        nSTIJKPlayerSkyActivity.tv_volume = null;
        nSTIJKPlayerSkyActivity.ll_pause_play = null;
        nSTIJKPlayerSkyActivity.rl_settings_box = null;
        nSTIJKPlayerSkyActivity.rl_episodes_box = null;
        nSTIJKPlayerSkyActivity.iv_hp_lock = null;
        nSTIJKPlayerSkyActivity.ll_hp_lock_click = null;
        nSTIJKPlayerSkyActivity.ll_screen_locked = null;
        nSTIJKPlayerSkyActivity.iv_unlock_button = null;
        nSTIJKPlayerSkyActivity.no_audio_track = null;
        nSTIJKPlayerSkyActivity.no_subtitle_track = null;
        nSTIJKPlayerSkyActivity.no_video_track = null;
        nSTIJKPlayerSkyActivity.ll_player_header_footer = null;
        nSTIJKPlayerSkyActivity.iv_play = null;
        nSTIJKPlayerSkyActivity.iv_pause = null;
        nSTIJKPlayerSkyActivity.tv_seek_left = null;
        nSTIJKPlayerSkyActivity.tv_seek_right = null;
        nSTIJKPlayerSkyActivity.ll_back = null;
        nSTIJKPlayerSkyActivity.iv_back_episodes = null;
        nSTIJKPlayerSkyActivity.iv_back_settings = null;
        nSTIJKPlayerSkyActivity.iv_back = null;
        nSTIJKPlayerSkyActivity.ll_back_click = null;
        nSTIJKPlayerSkyActivity.iv_audio_subtitle_track = null;
        nSTIJKPlayerSkyActivity.ll_crop = null;
        nSTIJKPlayerSkyActivity.iv_hp_play_from_beginning = null;
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings = null;
        nSTIJKPlayerSkyActivity.ll_restart = null;
        nSTIJKPlayerSkyActivity.ll_multi_screen = null;
        nSTIJKPlayerSkyActivity.ll_channels_list = null;
        nSTIJKPlayerSkyActivity.tv_episode_name = null;
        nSTIJKPlayerSkyActivity.tv_channel_name = null;
        nSTIJKPlayerSkyActivity.tv_program_name = null;
        nSTIJKPlayerSkyActivity.tv_start_stop = null;
        nSTIJKPlayerSkyActivity.recycler_view_left_sidebar = null;
        nSTIJKPlayerSkyActivity.ll_pb_left_categories = null;
        nSTIJKPlayerSkyActivity.ll_no_cat_found = null;
        nSTIJKPlayerSkyActivity.ll_casting_to_tv = null;
        nSTIJKPlayerSkyActivity.tv_casting_status_text = null;
        nSTIJKPlayerSkyActivity.ll_chromecast_click = null;
        nSTIJKPlayerSkyActivity.cast_button = null;
        nSTIJKPlayerSkyActivity.iv_radio = null;
        nSTIJKPlayerSkyActivity.ll_bottom_1 = null;
        nSTIJKPlayerSkyActivity.ll_bottom_2 = null;
        nSTIJKPlayerSkyActivity.header_page_title = null;
        nSTIJKPlayerSkyActivity.tv_page_name_right_side = null;
        nSTIJKPlayerSkyActivity.iv_back_button = null;
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings_click = null;
    }
}

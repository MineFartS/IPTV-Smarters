package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerEPGActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NSTIJKPlayerEPGActivity f29189b;

    public NSTIJKPlayerEPGActivity_ViewBinding(NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity, View view) {
        this.f29189b = nSTIJKPlayerEPGActivity;
        nSTIJKPlayerEPGActivity.rg_subtitle = (RadioGroup) c.c(view, R.id.subtitle_radio_group, "field 'rg_subtitle'", RadioGroup.class);
        nSTIJKPlayerEPGActivity.rg_audio = (RadioGroup) c.c(view, R.id.audio_radio_group, "field 'rg_audio'", RadioGroup.class);
        nSTIJKPlayerEPGActivity.rg_video = (RadioGroup) c.c(view, R.id.video_radio_group, "field 'rg_video'", RadioGroup.class);
        nSTIJKPlayerEPGActivity.tv_sub_font_size = (TextView) c.c(view, R.id.tv_sub_font_size, "field 'tv_sub_font_size'", TextView.class);
        nSTIJKPlayerEPGActivity.fl_sub_font_size = (FrameLayout) c.c(view, R.id.fl_sub_font_size, "field 'fl_sub_font_size'", FrameLayout.class);
        nSTIJKPlayerEPGActivity.sb_volume = (SeekBar) c.c(view, R.id.sb_volume, "field 'sb_volume'", SeekBar.class);
        nSTIJKPlayerEPGActivity.sb_brightness = (SeekBar) c.c(view, R.id.sb_brightness, "field 'sb_brightness'", SeekBar.class);
        nSTIJKPlayerEPGActivity.ll_brightness = (LinearLayout) c.c(view, R.id.ll_brightness, "field 'll_brightness'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.ll_volume = (LinearLayout) c.c(view, R.id.ll_volume, "field 'll_volume'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.tv_brightness = (TextView) c.c(view, R.id.tv_brightness, "field 'tv_brightness'", TextView.class);
        nSTIJKPlayerEPGActivity.tv_volume = (TextView) c.c(view, R.id.tv_volume, "field 'tv_volume'", TextView.class);
        nSTIJKPlayerEPGActivity.ll_pause_play = (LinearLayout) c.c(view, R.id.ll_pause_play, "field 'll_pause_play'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.rl_settings_box = (RelativeLayout) c.c(view, R.id.rl_settings_box, "field 'rl_settings_box'", RelativeLayout.class);
        nSTIJKPlayerEPGActivity.rl_episodes_box = (RelativeLayout) c.c(view, R.id.rl_episodes_box, "field 'rl_episodes_box'", RelativeLayout.class);
        nSTIJKPlayerEPGActivity.iv_hp_lock = (ImageView) c.c(view, R.id.iv_hp_lock, "field 'iv_hp_lock'", ImageView.class);
        nSTIJKPlayerEPGActivity.ll_hp_lock_click = (LinearLayout) c.c(view, R.id.ll_hp_lock_click, "field 'll_hp_lock_click'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.ll_screen_locked = (LinearLayout) c.c(view, R.id.ll_screen_locked, "field 'll_screen_locked'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.iv_unlock_button = (ImageView) c.c(view, R.id.iv_unlock_button, "field 'iv_unlock_button'", ImageView.class);
        nSTIJKPlayerEPGActivity.no_audio_track = (TextView) c.c(view, R.id.tv_no_audio_track, "field 'no_audio_track'", TextView.class);
        nSTIJKPlayerEPGActivity.no_subtitle_track = (TextView) c.c(view, R.id.tv_no_subtitle_track, "field 'no_subtitle_track'", TextView.class);
        nSTIJKPlayerEPGActivity.no_video_track = (TextView) c.c(view, R.id.tv_no_video_track, "field 'no_video_track'", TextView.class);
        nSTIJKPlayerEPGActivity.ll_player_header_footer = (LinearLayout) c.c(view, R.id.ll_player_header_footer, "field 'll_player_header_footer'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.iv_play = (ImageView) c.c(view, R.id.iv_play, "field 'iv_play'", ImageView.class);
        nSTIJKPlayerEPGActivity.iv_pause = (ImageView) c.c(view, R.id.iv_pause, "field 'iv_pause'", ImageView.class);
        nSTIJKPlayerEPGActivity.tv_seek_left = (ImageView) c.c(view, R.id.tv_seek_left, "field 'tv_seek_left'", ImageView.class);
        nSTIJKPlayerEPGActivity.tv_seek_right = (ImageView) c.c(view, R.id.tv_seek_right, "field 'tv_seek_right'", ImageView.class);
        nSTIJKPlayerEPGActivity.ll_back = (LinearLayout) c.c(view, R.id.ll_back, "field 'll_back'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.iv_back_episodes = (ImageView) c.c(view, R.id.iv_back_episodes, "field 'iv_back_episodes'", ImageView.class);
        nSTIJKPlayerEPGActivity.iv_back_settings = (ImageView) c.c(view, R.id.iv_back_settings, "field 'iv_back_settings'", ImageView.class);
        nSTIJKPlayerEPGActivity.iv_back = (ImageView) c.c(view, R.id.iv_back, "field 'iv_back'", ImageView.class);
        nSTIJKPlayerEPGActivity.ll_back_click = (LinearLayout) c.c(view, R.id.ll_back_click, "field 'll_back_click'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.iv_audio_subtitle_track = (ImageView) c.c(view, R.id.iv_audio_subtitle_track, "field 'iv_audio_subtitle_track'", ImageView.class);
        nSTIJKPlayerEPGActivity.ll_crop = (LinearLayout) c.c(view, R.id.ll_crop, "field 'll_crop'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.iv_hp_play_from_beginning = (ImageView) c.c(view, R.id.iv_hp_play_from_beginning, "field 'iv_hp_play_from_beginning'", ImageView.class);
        nSTIJKPlayerEPGActivity.ll_audio_subtitle_settings = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.ll_restart = (LinearLayout) c.c(view, R.id.ll_restart, "field 'll_restart'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.ll_multi_screen = (LinearLayout) c.c(view, R.id.ll_multi_screen, "field 'll_multi_screen'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.ll_channels_list = (LinearLayout) c.c(view, R.id.ll_channels_list, "field 'll_channels_list'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.tv_episode_name = (TextView) c.c(view, R.id.tv_episode_name, "field 'tv_episode_name'", TextView.class);
        nSTIJKPlayerEPGActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        nSTIJKPlayerEPGActivity.ll_audio_subtitle_settings_click = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings_click, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity = this.f29189b;
        if (nSTIJKPlayerEPGActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29189b = null;
        nSTIJKPlayerEPGActivity.rg_subtitle = null;
        nSTIJKPlayerEPGActivity.rg_audio = null;
        nSTIJKPlayerEPGActivity.rg_video = null;
        nSTIJKPlayerEPGActivity.tv_sub_font_size = null;
        nSTIJKPlayerEPGActivity.fl_sub_font_size = null;
        nSTIJKPlayerEPGActivity.sb_volume = null;
        nSTIJKPlayerEPGActivity.sb_brightness = null;
        nSTIJKPlayerEPGActivity.ll_brightness = null;
        nSTIJKPlayerEPGActivity.ll_volume = null;
        nSTIJKPlayerEPGActivity.tv_brightness = null;
        nSTIJKPlayerEPGActivity.tv_volume = null;
        nSTIJKPlayerEPGActivity.ll_pause_play = null;
        nSTIJKPlayerEPGActivity.rl_settings_box = null;
        nSTIJKPlayerEPGActivity.rl_episodes_box = null;
        nSTIJKPlayerEPGActivity.iv_hp_lock = null;
        nSTIJKPlayerEPGActivity.ll_hp_lock_click = null;
        nSTIJKPlayerEPGActivity.ll_screen_locked = null;
        nSTIJKPlayerEPGActivity.iv_unlock_button = null;
        nSTIJKPlayerEPGActivity.no_audio_track = null;
        nSTIJKPlayerEPGActivity.no_subtitle_track = null;
        nSTIJKPlayerEPGActivity.no_video_track = null;
        nSTIJKPlayerEPGActivity.ll_player_header_footer = null;
        nSTIJKPlayerEPGActivity.iv_play = null;
        nSTIJKPlayerEPGActivity.iv_pause = null;
        nSTIJKPlayerEPGActivity.tv_seek_left = null;
        nSTIJKPlayerEPGActivity.tv_seek_right = null;
        nSTIJKPlayerEPGActivity.ll_back = null;
        nSTIJKPlayerEPGActivity.iv_back_episodes = null;
        nSTIJKPlayerEPGActivity.iv_back_settings = null;
        nSTIJKPlayerEPGActivity.iv_back = null;
        nSTIJKPlayerEPGActivity.ll_back_click = null;
        nSTIJKPlayerEPGActivity.iv_audio_subtitle_track = null;
        nSTIJKPlayerEPGActivity.ll_crop = null;
        nSTIJKPlayerEPGActivity.iv_hp_play_from_beginning = null;
        nSTIJKPlayerEPGActivity.ll_audio_subtitle_settings = null;
        nSTIJKPlayerEPGActivity.ll_restart = null;
        nSTIJKPlayerEPGActivity.ll_multi_screen = null;
        nSTIJKPlayerEPGActivity.ll_channels_list = null;
        nSTIJKPlayerEPGActivity.tv_episode_name = null;
        nSTIJKPlayerEPGActivity.ll_no_cat_found = null;
        nSTIJKPlayerEPGActivity.ll_audio_subtitle_settings_click = null;
    }
}

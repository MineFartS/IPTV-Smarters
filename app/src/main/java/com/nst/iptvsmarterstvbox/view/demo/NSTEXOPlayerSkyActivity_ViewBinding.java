package minefarts.iptvsmarters.view.demo;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class NSTEXOPlayerSkyActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NSTEXOPlayerSkyActivity f28723b;

    public NSTEXOPlayerSkyActivity_ViewBinding(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, View view) {
        this.f28723b = nSTEXOPlayerSkyActivity;
        nSTEXOPlayerSkyActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        nSTEXOPlayerSkyActivity.sb_volume = (SeekBar) c.c(view, R.id.sb_volume, "field 'sb_volume'", SeekBar.class);
        nSTEXOPlayerSkyActivity.sb_brightness = (SeekBar) c.c(view, R.id.sb_brightness, "field 'sb_brightness'", SeekBar.class);
        nSTEXOPlayerSkyActivity.ll_brightness = (LinearLayout) c.c(view, R.id.ll_brightness, "field 'll_brightness'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_volume = (LinearLayout) c.c(view, R.id.ll_volume, "field 'll_volume'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.tv_brightness = (TextView) c.c(view, R.id.tv_brightness, "field 'tv_brightness'", TextView.class);
        nSTEXOPlayerSkyActivity.tv_volume = (TextView) c.c(view, R.id.tv_volume, "field 'tv_volume'", TextView.class);
        nSTEXOPlayerSkyActivity.ll_pause_play = (LinearLayout) c.c(view, R.id.ll_pause_play, "field 'll_pause_play'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.rl_settings_box = (RelativeLayout) c.c(view, R.id.rl_settings_box, "field 'rl_settings_box'", RelativeLayout.class);
        nSTEXOPlayerSkyActivity.rl_episodes_box = (RelativeLayout) c.c(view, R.id.rl_episodes_box, "field 'rl_episodes_box'", RelativeLayout.class);
        nSTEXOPlayerSkyActivity.iv_hp_lock = (ImageView) c.c(view, R.id.iv_hp_lock, "field 'iv_hp_lock'", ImageView.class);
        nSTEXOPlayerSkyActivity.ll_hp_lock_click = (LinearLayout) c.c(view, R.id.ll_hp_lock_click, "field 'll_hp_lock_click'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_screen_locked = (LinearLayout) c.c(view, R.id.ll_screen_locked, "field 'll_screen_locked'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.iv_unlock_button = (ImageView) c.c(view, R.id.iv_unlock_button, "field 'iv_unlock_button'", ImageView.class);
        nSTEXOPlayerSkyActivity.no_audio_track = (TextView) c.c(view, R.id.tv_no_audio_track, "field 'no_audio_track'", TextView.class);
        nSTEXOPlayerSkyActivity.no_subtitle_track = (TextView) c.c(view, R.id.tv_no_subtitle_track, "field 'no_subtitle_track'", TextView.class);
        nSTEXOPlayerSkyActivity.no_video_track = (TextView) c.c(view, R.id.tv_no_video_track, "field 'no_video_track'", TextView.class);
        nSTEXOPlayerSkyActivity.ll_player_header_footer = (LinearLayout) c.c(view, R.id.ll_player_header_footer, "field 'll_player_header_footer'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.iv_play = (ImageView) c.c(view, R.id.iv_play, "field 'iv_play'", ImageView.class);
        nSTEXOPlayerSkyActivity.iv_pause = (ImageView) c.c(view, R.id.iv_pause, "field 'iv_pause'", ImageView.class);
        nSTEXOPlayerSkyActivity.tv_seek_left = (ImageView) c.c(view, R.id.tv_seek_left, "field 'tv_seek_left'", ImageView.class);
        nSTEXOPlayerSkyActivity.tv_seek_right = (ImageView) c.c(view, R.id.tv_seek_right, "field 'tv_seek_right'", ImageView.class);
        nSTEXOPlayerSkyActivity.ll_back = (LinearLayout) c.c(view, R.id.ll_back, "field 'll_back'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.iv_back_episodes = (ImageView) c.c(view, R.id.iv_back_episodes, "field 'iv_back_episodes'", ImageView.class);
        nSTEXOPlayerSkyActivity.iv_back_settings = (ImageView) c.c(view, R.id.iv_back_settings, "field 'iv_back_settings'", ImageView.class);
        nSTEXOPlayerSkyActivity.iv_back = (ImageView) c.c(view, R.id.iv_back, "field 'iv_back'", ImageView.class);
        nSTEXOPlayerSkyActivity.ll_back_click = (LinearLayout) c.c(view, R.id.ll_back_click, "field 'll_back_click'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.iv_audio_subtitle_track = (ImageView) c.c(view, R.id.iv_audio_subtitle_track, "field 'iv_audio_subtitle_track'", ImageView.class);
        nSTEXOPlayerSkyActivity.ll_crop = (LinearLayout) c.c(view, R.id.ll_crop, "field 'll_crop'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.iv_hp_play_from_beginning = (ImageView) c.c(view, R.id.iv_hp_play_from_beginning, "field 'iv_hp_play_from_beginning'", ImageView.class);
        nSTEXOPlayerSkyActivity.ll_audio_subtitle_settings = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_restart = (LinearLayout) c.c(view, R.id.ll_restart, "field 'll_restart'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_multi_screen = (LinearLayout) c.c(view, R.id.ll_multi_screen, "field 'll_multi_screen'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_channels_list = (LinearLayout) c.c(view, R.id.ll_channels_list, "field 'll_channels_list'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.tv_episode_name = (TextView) c.c(view, R.id.tv_episode_name, "field 'tv_episode_name'", TextView.class);
        nSTEXOPlayerSkyActivity.tv_channel_name = (TextView) c.c(view, R.id.tv_channel_name, "field 'tv_channel_name'", TextView.class);
        nSTEXOPlayerSkyActivity.tv_program_name = (TextView) c.c(view, R.id.tv_program_name, "field 'tv_program_name'", TextView.class);
        nSTEXOPlayerSkyActivity.tv_start_stop = (TextView) c.c(view, R.id.tv_start_stop, "field 'tv_start_stop'", TextView.class);
        nSTEXOPlayerSkyActivity.recycler_view_left_sidebar = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        nSTEXOPlayerSkyActivity.ll_pb_left_categories = (LinearLayout) c.c(view, R.id.ll_pb_left_categories, "field 'll_pb_left_categories'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_casting_to_tv = (LinearLayout) c.c(view, R.id.ll_casting_to_tv, "field 'll_casting_to_tv'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.tv_casting_status_text = (TextView) c.c(view, R.id.tv_casting_status_text, "field 'tv_casting_status_text'", TextView.class);
        nSTEXOPlayerSkyActivity.ll_chromecast_click = (LinearLayout) c.c(view, R.id.ll_chromecast_click, "field 'll_chromecast_click'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.cast_button = (MediaRouteButton) c.c(view, R.id.cast_button, "field 'cast_button'", MediaRouteButton.class);
        nSTEXOPlayerSkyActivity.iv_radio = (ImageView) c.c(view, R.id.iv_radio, "field 'iv_radio'", ImageView.class);
        nSTEXOPlayerSkyActivity.ll_bottom_1 = (LinearLayout) c.c(view, R.id.ll_bottom_1, "field 'll_bottom_1'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.ll_bottom_2 = (LinearLayout) c.c(view, R.id.ll_bottom_2, "field 'll_bottom_2'", LinearLayout.class);
        nSTEXOPlayerSkyActivity.header_page_title = (TextView) c.c(view, R.id.textView, "field 'header_page_title'", TextView.class);
        nSTEXOPlayerSkyActivity.tv_page_name_right_side = (TextView) c.c(view, R.id.tv_page_name_right_side, "field 'tv_page_name_right_side'", TextView.class);
        nSTEXOPlayerSkyActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
        nSTEXOPlayerSkyActivity.ll_audio_subtitle_settings_click = (LinearLayout) c.c(view, R.id.ll_audio_subtitle_settings_click, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f28723b;
        if (nSTEXOPlayerSkyActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f28723b = null;
        nSTEXOPlayerSkyActivity.logo = null;
        nSTEXOPlayerSkyActivity.sb_volume = null;
        nSTEXOPlayerSkyActivity.sb_brightness = null;
        nSTEXOPlayerSkyActivity.ll_brightness = null;
        nSTEXOPlayerSkyActivity.ll_volume = null;
        nSTEXOPlayerSkyActivity.tv_brightness = null;
        nSTEXOPlayerSkyActivity.tv_volume = null;
        nSTEXOPlayerSkyActivity.ll_pause_play = null;
        nSTEXOPlayerSkyActivity.rl_settings_box = null;
        nSTEXOPlayerSkyActivity.rl_episodes_box = null;
        nSTEXOPlayerSkyActivity.iv_hp_lock = null;
        nSTEXOPlayerSkyActivity.ll_hp_lock_click = null;
        nSTEXOPlayerSkyActivity.ll_screen_locked = null;
        nSTEXOPlayerSkyActivity.iv_unlock_button = null;
        nSTEXOPlayerSkyActivity.no_audio_track = null;
        nSTEXOPlayerSkyActivity.no_subtitle_track = null;
        nSTEXOPlayerSkyActivity.no_video_track = null;
        nSTEXOPlayerSkyActivity.ll_player_header_footer = null;
        nSTEXOPlayerSkyActivity.iv_play = null;
        nSTEXOPlayerSkyActivity.iv_pause = null;
        nSTEXOPlayerSkyActivity.tv_seek_left = null;
        nSTEXOPlayerSkyActivity.tv_seek_right = null;
        nSTEXOPlayerSkyActivity.ll_back = null;
        nSTEXOPlayerSkyActivity.iv_back_episodes = null;
        nSTEXOPlayerSkyActivity.iv_back_settings = null;
        nSTEXOPlayerSkyActivity.iv_back = null;
        nSTEXOPlayerSkyActivity.ll_back_click = null;
        nSTEXOPlayerSkyActivity.iv_audio_subtitle_track = null;
        nSTEXOPlayerSkyActivity.ll_crop = null;
        nSTEXOPlayerSkyActivity.iv_hp_play_from_beginning = null;
        nSTEXOPlayerSkyActivity.ll_audio_subtitle_settings = null;
        nSTEXOPlayerSkyActivity.ll_restart = null;
        nSTEXOPlayerSkyActivity.ll_multi_screen = null;
        nSTEXOPlayerSkyActivity.ll_channels_list = null;
        nSTEXOPlayerSkyActivity.tv_episode_name = null;
        nSTEXOPlayerSkyActivity.tv_channel_name = null;
        nSTEXOPlayerSkyActivity.tv_program_name = null;
        nSTEXOPlayerSkyActivity.tv_start_stop = null;
        nSTEXOPlayerSkyActivity.recycler_view_left_sidebar = null;
        nSTEXOPlayerSkyActivity.ll_pb_left_categories = null;
        nSTEXOPlayerSkyActivity.ll_no_cat_found = null;
        nSTEXOPlayerSkyActivity.ll_casting_to_tv = null;
        nSTEXOPlayerSkyActivity.tv_casting_status_text = null;
        nSTEXOPlayerSkyActivity.ll_chromecast_click = null;
        nSTEXOPlayerSkyActivity.cast_button = null;
        nSTEXOPlayerSkyActivity.iv_radio = null;
        nSTEXOPlayerSkyActivity.ll_bottom_1 = null;
        nSTEXOPlayerSkyActivity.ll_bottom_2 = null;
        nSTEXOPlayerSkyActivity.header_page_title = null;
        nSTEXOPlayerSkyActivity.tv_page_name_right_side = null;
        nSTEXOPlayerSkyActivity.iv_back_button = null;
        nSTEXOPlayerSkyActivity.ll_audio_subtitle_settings_click = null;
    }
}

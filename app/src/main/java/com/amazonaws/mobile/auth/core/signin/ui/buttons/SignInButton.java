package com.amazonaws.mobile.auth.core.signin.ui.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazonaws.mobile.auth.core.R;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;

/* JADX INFO: loaded from: classes.dex */
public class SignInButton extends LinearLayout {
    private static final int BORDER_COLOR = -16777216;
    private static final float MIN_TEXT_SIZE_SP = 8.0f;
    private final SignInButtonAttributes attributes;
    public Bitmap bitmap;
    public ImageView imageView;
    public boolean isSmallStyle;
    public TextView textView;
    private static final int IMAGE_LEFT_MARGIN = DisplayUtils.dp(8);
    private static final int IMAGE_RIGHT_MARGIN = DisplayUtils.dp(8);
    private static final int TEXT_LEFT_MARGIN = DisplayUtils.dp(2);
    private static final int TEXT_RIGHT_MARGIN = DisplayUtils.dp(8);
    private static final float MAX_TEXT_SIZE_PX = DisplayUtils.dp(50);

    public SignInButton(Context context, AttributeSet attributeSet, int i2, SignInButtonAttributes signInButtonAttributes) {
        super(context, attributeSet, i2);
        this.isSmallStyle = false;
        this.attributes = signInButtonAttributes;
        setFocusable(true);
        setClickable(true);
        setOrientation(0);
        setGravity(16);
        setBackgroundDrawable(getBackgroundStatesDrawable());
        this.imageView = new ImageView(context);
        this.bitmap = BitmapFactory.decodeResource(getResources(), signInButtonAttributes.getImageIconResourceId());
        this.imageView.setImageDrawable(new BitmapDrawable(getResources(), this.bitmap));
        this.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.imageView.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(IMAGE_LEFT_MARGIN, 0, IMAGE_RIGHT_MARGIN, 0);
        layoutParams.weight = 0.0f;
        addView(this.imageView, layoutParams);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(signInButtonAttributes.getTextColor());
        String string = null;
        this.textView.setTypeface(null, 1);
        this.textView.setSingleLine(true);
        this.textView.setGravity(16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SignInButton);
            if (typedArrayObtainStyledAttributes.getInt(R.styleable.SignInButton_button_style, 0) > 0) {
                this.isSmallStyle = true;
            }
            string = typedArrayObtainStyledAttributes.getString(R.styleable.SignInButton_text);
            typedArrayObtainStyledAttributes.recycle();
        }
        TextView textView2 = this.textView;
        if (string != null) {
            textView2.setText(string);
        } else {
            textView2.setText(signInButtonAttributes.getDefaultTextResourceId());
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.setMargins(DisplayUtils.dp(TEXT_LEFT_MARGIN), 0, DisplayUtils.dp(TEXT_RIGHT_MARGIN), 0);
        layoutParams2.weight = 1.0f;
        addView(this.textView, layoutParams2);
        updateStyle();
        invalidate();
    }

    private boolean doesTextViewFit(float f2, RectF rectF) {
        TextPaint textPaint = new TextPaint(this.textView.getPaint());
        textPaint.setTextSize(f2);
        TransformationMethod transformationMethod = this.textView.getTransformationMethod();
        return rectF.contains(new RectF(0.0f, 0.0f, textPaint.measureText((transformationMethod == null ? this.textView.getText() : transformationMethod.getTransformation(this.textView.getText(), this.textView)).toString()), textPaint.getFontSpacing()));
    }

    private float findBestSize(float f2, float f3, RectF rectF) {
        float f4 = f3;
        float f5 = f2;
        while (f2 <= f4) {
            float f6 = (f2 + f4) / 2.0f;
            if (doesTextViewFit(f6, rectF)) {
                f2 = f6 + 0.5f;
                f5 = f6;
            } else {
                f4 = f6 - 0.5f;
            }
        }
        return f5;
    }

    private Drawable getBackgroundStatesDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, getButtonBackground(this.attributes.getBackgroundColorPressed()));
        stateListDrawable.addState(new int[0], getButtonBackground(this.attributes.getBackgroundColor()));
        return stateListDrawable;
    }

    private Drawable getButtonBackground(int i2) {
        ShapeDrawable roundedRectangleBackground = DisplayUtils.getRoundedRectangleBackground(this.attributes.getCornerRadius(), i2);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.attributes.getTopShadowColor(), this.attributes.getTopShadowColor()});
        gradientDrawable.setCornerRadius(DisplayUtils.dp(r0));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.attributes.getBottomShadowColor(), this.attributes.getBottomShadowColor()});
        gradientDrawable2.setCornerRadius(DisplayUtils.dp(r0));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2, roundedRectangleBackground});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, this.attributes.getTopShadowThickness(), this.attributes.getTopShadowThickness(), 0, 0);
        layerDrawable.setLayerInset(2, this.attributes.getTopShadowThickness(), this.attributes.getTopShadowThickness(), this.attributes.getBottomShadowThickness(), this.attributes.getBottomShadowThickness());
        return layerDrawable;
    }

    private void resizeButtonText() {
        if (getMeasuredWidth() == 0 || this.isSmallStyle) {
            return;
        }
        float fApplyDimension = TypedValue.applyDimension(2, MIN_TEXT_SIZE_SP, getResources().getDisplayMetrics());
        RectF rectF = new RectF();
        rectF.right = (this.textView.getMeasuredWidth() - this.textView.getCompoundPaddingLeft()) - this.textView.getCompoundPaddingRight();
        rectF.bottom = (this.textView.getMeasuredHeight() - this.textView.getCompoundPaddingBottom()) - this.textView.getCompoundPaddingTop();
        this.textView.setTextSize(0, findBestSize(fApplyDimension, MAX_TEXT_SIZE_PX, rectF));
    }

    private void updateStyle() {
        int i2;
        if (this.isSmallStyle) {
            this.textView.setVisibility(8);
            i2 = 17;
        } else {
            this.textView.setVisibility(0);
            i2 = 16;
        }
        setGravity(i2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        ViewGroup.LayoutParams layoutParams = this.imageView.getLayoutParams();
        double measuredHeight = getMeasuredHeight();
        Double.isNaN(measuredHeight);
        int height = (int) (measuredHeight * 0.72d);
        if (height > this.bitmap.getHeight()) {
            height = this.bitmap.getHeight();
        }
        layoutParams.height = height;
        layoutParams.width = height;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        resizeButtonText();
    }

    public void setButtonText(int i2) {
        this.textView.setText(i2);
        resizeButtonText();
    }

    public void setButtonText(String str) {
        this.textView.setText(str);
        resizeButtonText();
    }

    public void setSmallStyle(boolean z) {
        this.isSmallStyle = z;
        updateStyle();
    }
}

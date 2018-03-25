package com.sneha.game_balloon;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by Sneha on 25-03-2018.
 */

public class PixelHelper {
    public static int pixelsToDp(int px, Context context) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, px,
                context.getResources().getDisplayMetrics());
    }
}

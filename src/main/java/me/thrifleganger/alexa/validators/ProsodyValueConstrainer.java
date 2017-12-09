package me.thrifleganger.alexa.validators;

import me.thrifleganger.alexa.constants.NumericalConstants;

public class ProsodyValueConstrainer {

    public static double constrainRateLevel(final double rate) {

        if (rate < NumericalConstants.RATE_LOWER_LIMIT)
            return NumericalConstants.RATE_LOWER_LIMIT;
        return rate;
    }

    public static double constrainPitchLevel(final double pitch) {

        if (pitch > NumericalConstants.PITCH_UPPER_LIMIT)
            return NumericalConstants.PITCH_UPPER_LIMIT;
        if (pitch < NumericalConstants.PITCH_LOWER_LIMIT)
            return NumericalConstants.PITCH_LOWER_LIMIT;
        return pitch;
    }

    public static double constrainVolumeLevel(final double volume) {

        if (volume > NumericalConstants.VOLUME_UPPER_LIMIT)
            return NumericalConstants.VOLUME_UPPER_LIMIT;
        return volume;
    }

    public static boolean ifZeroOrPositive(final double value) {
        return (value >= NumericalConstants.ZERO);
    }
}

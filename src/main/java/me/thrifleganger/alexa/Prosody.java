
package me.thrifleganger.alexa;

import me.thrifleganger.alexa.enumerations.ProsodyPitch;
import me.thrifleganger.alexa.enumerations.ProsodyRate;
import me.thrifleganger.alexa.enumerations.ProsodyVolume;
import me.thrifleganger.alexa.validators.ProsodyValueConstrainer;

public class Prosody {

    private final String volume;
    private final String pitch;
    private final String rate;

    private Prosody(final ProsodyBuilder prosodyBuilder) {
        this.volume = prosodyBuilder.volume;
        this.pitch = prosodyBuilder.pitch;
        this.rate = prosodyBuilder.rate;
    }

    public String getPitch() { return pitch; }

    public String getRate() { return rate; }

    public String getVolume() { return volume; }

    public static ProsodyBuilder builder() {
        return new ProsodyBuilder();
    }

    public static final class ProsodyBuilder {

        private String volume;
        private String pitch;
        private String rate;

        private ProsodyBuilder() {
            this.volume = ProsodyVolume.DEFAULT.getValue();
            this.pitch = ProsodyPitch.DEFAULT.getValue();
            this.rate = ProsodyRate.DEFAULT.getValue();
        }

        public ProsodyBuilder volume(final double volumeInDb) {
            this.volume = new StringBuilder()
                    .append(ProsodyValueConstrainer.ifZeroOrPositive(volumeInDb) ? "+" : "")
                    .append(Double.toString(ProsodyValueConstrainer.constrainVolumeLevel(volumeInDb)))
                    .append("dB")
                    .toString();
            return this;
        }

        public ProsodyBuilder volume(final ProsodyVolume volumeLevel) {
            this.volume = volumeLevel.getValue();
            return this;
        }

        public ProsodyBuilder pitch(final double pitchInPercentage) {
            this.pitch = new StringBuilder()
                    .append(ProsodyValueConstrainer.ifZeroOrPositive(pitchInPercentage) ? "+" : "")
                    .append(Double.toString(ProsodyValueConstrainer.constrainPitchLevel(pitchInPercentage)))
                    .append("%")
                    .toString();
            return this;
        }

        public ProsodyBuilder pitch(final ProsodyPitch pitchLevel) {
            this.pitch = pitchLevel.getValue();
            return this;
        }

        public ProsodyBuilder rate(final double rateInPercentage) {
            this.rate = new StringBuilder()
                    .append(ProsodyValueConstrainer.ifZeroOrPositive(rateInPercentage) ? "+" : "")
                    .append(Double.toString(ProsodyValueConstrainer.constrainRateLevel(rateInPercentage)))
                    .append("%")
                    .toString();
            return this;
        }

        public ProsodyBuilder rate(final ProsodyRate rateLevel) {
            this.rate = rateLevel.getValue();
            return this;
        }

        public Prosody build() {
            return new Prosody(this);
        }
    }
}
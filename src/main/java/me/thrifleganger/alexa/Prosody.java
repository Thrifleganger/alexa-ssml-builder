
package me.thrifleganger.alexa;

import me.thrifleganger.alexa.constants.ProsodyPitch;
import me.thrifleganger.alexa.constants.ProsodyRate;
import me.thrifleganger.alexa.constants.ProsodyVolume;

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

        public ProsodyBuilder volume(final double volumeInDb) {
            this.volume = new StringBuilder()
                    .append(Double.toString(volumeInDb))
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
                    .append(Double.toString(pitchInPercentage))
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
                    .append(Double.toString(rateInPercentage))
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
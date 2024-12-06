package ss4_bai_tap_to_java.bai_tap;
import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    Instant startTime;
    Instant endTime;

    public StopWatch() {
        this.startTime = Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = Instant.now();
    }

    public void stop() {
        this.endTime = Instant.now();
    }

    public Duration getElapsedTime() {
        return Duration.between(startTime, endTime);
    }
}

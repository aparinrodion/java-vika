package by.bsu;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@RequiredArgsConstructor
@ToString
public class Tab {
    private final String name;
    private boolean isMuted = false;

    public void mute() {
        isMuted = true;
    }
}

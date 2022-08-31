package Nedelja5.Zivotinje;

public interface Movement {
    int walking = 1 << 1;
    int jumping = 1 << 2;
    int swiming = 1 << 3;
    int diving = 1 << 4;
    int flying = 1 << 5;
    int getMovement();
}

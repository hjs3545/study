#include <stdio.h>

int main() {
    printf("%d\n", 1 << 4);      // 00000001 -> 00010000
    printf("%d\n", (-3) << 2);   // 11111101 -> 11110100
    printf("%d\n", 31 >> 2);     // 00011111 -> 00000111
    printf("%d\n", (-24) >> 3);  // 11101000 -> 11111101
}

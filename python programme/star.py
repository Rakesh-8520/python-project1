def print_pyramid(n):
    for i in range(1, n + 1):
        # Print spaces for alignment
        print(" " * (n - i), end="")
        # Print '*' for the pyramid
        print("*" * (2 * i - 1))


n = int(input("Enter the number of rows for the pyramid: "))
print_pyramid(n)